package cl.moriahdp.BaseApplicationMVP.homeDetail.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;
import cl.moriahdp.BaseApplicationMVP.home.modelObject.HomeModelObject;

public class HomeDetailModel extends BaseModel<DataRepository> {

    private HomeModelObject sermon;

    public HomeDetailModel(DataRepository repository, Bus bus, HomeModelObject sermon) {
        super(repository, bus);
        this.sermon = sermon;
    }

    public HomeModelObject getSermon() {
        return sermon;
    }

    public boolean isValidSermon() {
        return sermon != null && sermon.getTitle() != null && sermon.getTitle().length() > 0;
    }
}