package cl.moriahdp.BaseApplicationMVP.baseclasses;

import com.squareup.otto.Bus;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;

public class BaseModel <T extends DataRepository> {

    protected T repository;
    protected Bus bus;

    public BaseModel(T repository, Bus bus) {
        this.repository = repository;
        this.bus = bus;
    }

}