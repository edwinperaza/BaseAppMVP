package cl.moriahdp.BaseApplicationMVP.splash.presenter;

import com.squareup.otto.Subscribe;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.splash.model.SplashModel;
import cl.moriahdp.BaseApplicationMVP.splash.view.SplashView;

public class SplashPresenter  extends BasePresenter<SplashModel, SplashView> {

    public SplashPresenter(SplashModel model, SplashView view) {
        super(model, view);
    }

    public void onResume(){
        model.startTimer();
    }

    @Subscribe
    public void onTimeUp(SplashModel.TimeUpEvent event) {
        view.goToDashBoard();
    }

    public void onPause() {
        model.cancelTimer();
    }
}
