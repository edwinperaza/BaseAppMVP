package cl.moriahdp.BaseApplicationMVP.tutorial.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class TutorialModel extends BaseModel<DataRepository> {

    public TutorialModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }
}
