package cl.moriahdp.BaseApplicationMVP.tabThree.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class ThreeModel extends BaseModel<DataRepository> {

    public ThreeModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }

}
