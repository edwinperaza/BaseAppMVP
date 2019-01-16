package cl.moriahdp.BaseApplicationMVP.splash.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.splash.model.SplashModel;
import cl.moriahdp.BaseApplicationMVP.splash.presenter.SplashPresenter;
import cl.moriahdp.BaseApplicationMVP.splash.view.SplashView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;
import cl.moriahdp.BaseApplicationMVP.utils.data.ApiUtils;

public class SplashActivity extends BaseActivity {

    private SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SplashView splashView = new SplashView(this, BusProvider.getInstance());
        mSplashPresenter = new SplashPresenter(new SplashModel(BusProvider.getInstance(), ApiUtils.getAPIService()), splashView);
        hideToolbar();
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(mSplashPresenter);
        mSplashPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(mSplashPresenter);
        mSplashPresenter.onPause();
    }
}