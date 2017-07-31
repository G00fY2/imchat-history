package de.g00fy2.imchathistory.app.fragments.start;

import android.annotation.SuppressLint;
import android.widget.TextView;
import butterknife.BindView;
import de.g00fy2.imchathistory.R;
import de.g00fy2.imchathistory.app.annotations.Layout;
import de.g00fy2.imchathistory.app.annotations.Title;
import de.g00fy2.imchathistory.app.fragments.base.BaseFragment;
import de.g00fy2.imchathistory.app.fragments.base.BasePresenter;
import javax.inject.Inject;
import timber.log.Timber;

/**
 * Created by Thomas Wirth on 23.05.2017.
 */

@Layout(R.layout.fragment_start) @Title(R.string.app_name) public class StartFragment
    extends BaseFragment implements StartContract.StartView {

  @Inject StartContract.StartPresenter presenter;

  @BindView(R.id.counter) TextView counterTextView;

  @SuppressLint("SetTextI18n") @Override public void setCountText(int counter) {
    Timber.d("finally here");
    counterTextView.setText(Integer.toString(counter));
  }

  @Override protected void initializeViews() {

  }

  @Override protected BasePresenter registerPresenter() {
    return presenter;
  }
}
