package cl.moriahdp.BaseApplicationMVP.tabFour.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class FourModel extends BaseModel<DataRepository> {

    public FourModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }

}
