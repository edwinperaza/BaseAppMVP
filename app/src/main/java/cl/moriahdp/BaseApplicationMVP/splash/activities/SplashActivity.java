package cl.moriahdp.BaseApplicationMVP.splash.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;
import cl.moriahdp.BaseApplicationMVP.splash.model.SplashModel;
import cl.moriahdp.BaseApplicationMVP.splash.presenter.SplashPresenter;
import cl.moriahdp.BaseApplicationMVP.splash.view.SplashView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;

public class SplashActivity extends BaseActivity {

    private SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mSplashPresenter = new SplashPresenter(
                new SplashModel(new DataRepository(SplashActivity.this), BusProvider.getInstance()),
                new SplashView(this, BusProvider.getInstance()));
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