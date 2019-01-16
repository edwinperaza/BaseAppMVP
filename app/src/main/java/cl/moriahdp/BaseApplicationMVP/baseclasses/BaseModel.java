package cl.moriahdp.BaseApplicationMVP.baseclasses;

import com.squareup.otto.Bus;

public class BaseModel {
    protected Bus bus;

    public BaseModel(Bus bus) {
        this.bus = bus;
    }

}
