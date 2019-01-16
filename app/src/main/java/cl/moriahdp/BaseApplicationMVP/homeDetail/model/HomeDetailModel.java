package cl.moriahdp.BaseApplicationMVP.homeDetail.model;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.home.modelObject.HomeModelObject;

public class HomeDetailModel extends BaseModel {

    private HomeModelObject sermon;

    public HomeDetailModel(Bus bus, HomeModelObject sermon) {
        super(bus);
        this.sermon = sermon;
    }

    public HomeModelObject getSermon() {
        return sermon;
    }

    public boolean isValidSermon() {
        return sermon != null && sermon.getTitle() != null && sermon.getTitle().length() > 0;
    }
}