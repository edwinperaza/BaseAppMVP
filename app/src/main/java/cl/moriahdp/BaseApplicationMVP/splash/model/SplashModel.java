package cl.moriahdp.BaseApplicationMVP.splash.model;

import android.os.Handler;
import android.os.Looper;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.utils.data.APIService;

public class SplashModel extends BaseModel {

    private Handler uiHandler = new Handler(Looper.getMainLooper());
    private Runnable finalDialogRunnable = new Runnable() {
        @Override
        public void run() {
            bus.post(new TimeUpEvent());
        }
    };

    public SplashModel(Bus bus, APIService apiService) {
        super(bus);
    }

    public void startTimer() {
        uiHandler.postDelayed(finalDialogRunnable, 1500);
    }

    public void cancelTimer() {
        uiHandler.removeCallbacks(finalDialogRunnable);
    }

    /* Bus messages */
    public static class TimeUpEvent {
        /*Nothing to do here*/
    }
}
