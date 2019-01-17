package cl.moriahdp.BaseApplicationMVP.contact.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class ContactModel extends BaseModel<DataRepository> {

    public ContactModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }
}
