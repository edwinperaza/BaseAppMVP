package cl.moriahdp.BaseApplicationMVP.profile.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.utils.data.APIService;

public class ProfileModel extends BaseModel {

    public ProfileModel(Bus bus, APIService apiService) {
        super(bus);
    }

}
