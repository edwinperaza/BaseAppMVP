package cl.moriahdp.BaseApplicationMVP.profile.view;

import android.view.View;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragmentView;
import cl.moriahdp.BaseApplicationMVP.profile.fragment.ProfileFragment;

public class ProfileView extends BaseFragmentView {

    public ProfileView(ProfileFragment fragment, View rootView, Bus bus) {
        super(fragment, rootView, bus);
    }
}