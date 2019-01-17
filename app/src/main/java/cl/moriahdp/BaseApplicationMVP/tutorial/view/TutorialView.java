package cl.moriahdp.BaseApplicationMVP.tutorial.view;

import android.view.View;
import android.widget.TextView;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivityView;
import cl.moriahdp.BaseApplicationMVP.registry.modelObject.UserModelObject;

public class TutorialView extends BaseActivityView {

    private TextView skipTextView;

    public TutorialView(BaseActivity activity, Bus bus) {
        super(activity, bus);
        skipTextView = activity.findViewById(R.id.tv_tutorial_skip);
        onClickListener();
    }

    private void onClickListener() {
        skipTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UserModelObject.isUserLoggedIn()) {
                    goToDashBoard();
                } else {
                    goToLogin();
                }
            }
        });
    }
}
