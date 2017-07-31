package de.g00fy2.imchathistory.app.fragments.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import de.g00fy2.imchathistory.app.activities.BaseActivity;
import de.g00fy2.imchathistory.app.annotations.Layout;
import de.g00fy2.imchathistory.app.annotations.Title;
import java.lang.annotation.Annotation;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

public abstract class BaseFragment extends Fragment implements BaseView {

  private BasePresenter presenter;
  private Unbinder unbinder;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.presenter = registerPresenter();
  }

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(getLayoutResId(), container, false);
    unbinder = ButterKnife.bind(this, view);

    return view;
  }

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initializeViews();
    if (presenter != null) {
      presenter.onCreate();
    }
  }

  @Override public void onResume() {
    super.onResume();

    if (presenter != null) {
      presenter.onResume();
    }

    ActionBar toolbar = getBaseActivity().getSupportActionBar();
    if (toolbar != null) {
      toolbar.setTitle(setTitle());
    }
  }

  @Override public void onPause() {
    super.onPause();
    if (presenter != null) {
      presenter.onPause();
    }
  }

  @Override public void onDestroy() {
    super.onDestroy();
    unbinder.unbind();
  }

  protected abstract void initializeViews();

  protected abstract BasePresenter registerPresenter();

  private int getLayoutResId() {
    Annotation annotation = this.getClass().getAnnotation(Layout.class);
    if (annotation != null) {
      return ((Layout) annotation).value();
    } else {
      throw new IllegalStateException("You must provide a layout via the @Layout annotation");
    }
  }

  private String setTitle() {
    Annotation annotation = this.getClass().getAnnotation(Title.class);
    if (annotation != null) {
      int stringResId = ((Title) annotation).value();
      return getContext().getString(stringResId);
    }

    return "";
  }

  protected BaseActivity getBaseActivity() {
    return (BaseActivity) getActivity();
  }
}
