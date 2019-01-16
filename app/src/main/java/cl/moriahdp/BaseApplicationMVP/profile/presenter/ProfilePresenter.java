package cl.moriahdp.BaseApplicationMVP.profile.presenter;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.profile.model.ProfileModel;
import cl.moriahdp.BaseApplicationMVP.profile.view.ProfileView;

public class ProfilePresenter extends BasePresenter<ProfileModel, ProfileView> {

    public ProfilePresenter(ProfileModel model, ProfileView view) {
        super(model, view);
    }

}
