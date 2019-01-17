package cl.moriahdp.BaseApplicationMVP.profile.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class ProfileModel extends BaseModel<DataRepository> {

    public ProfileModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }

}
