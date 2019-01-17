package cl.moriahdp.BaseApplicationMVP.search.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class SearchModel extends BaseModel<DataRepository> {

    public SearchModel(DataRepository repository, Bus bus) {
        super(repository, bus);
    }
}
