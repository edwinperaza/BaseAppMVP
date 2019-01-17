package cl.moriahdp.BaseApplicationMVP.registry.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class RegistryModel extends BaseModel<DataRepository> {

    public RegistryModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }
}
