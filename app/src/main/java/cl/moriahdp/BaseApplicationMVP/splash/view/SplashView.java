package cl.moriahdp.BaseApplicationMVP.splash.view;

import android.support.constraint.ConstraintLayout;
import android.view.View;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivityView;

public class SplashView extends BaseActivityView {

    private ConstraintLayout containerLayout;

    public SplashView(BaseActivity activity, Bus bus) {
        super(activity, bus);
        containerLayout = activity.findViewById(R.id.container_splash);

        containerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDashBoard();
            }
        });
    }

}
