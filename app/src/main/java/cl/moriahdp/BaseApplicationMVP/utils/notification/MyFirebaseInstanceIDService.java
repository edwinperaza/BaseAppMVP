package cl.moriahdp.BaseApplicationMVP.utils.notification;

import com.google.firebase.iid.FirebaseInstanceIdService;

import cl.moriahdp.BaseApplicationMVP.utils.data.APIService;
import cl.moriahdp.BaseApplicationMVP.utils.data.ApiUtils;


public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private APIService mAPIService = ApiUtils.getAPIService();

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
    }

}
