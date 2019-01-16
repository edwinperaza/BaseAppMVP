package cl.moriahdp.BaseApplicationMVP.registry.presenter;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.registry.model.RegistryModel;
import cl.moriahdp.BaseApplicationMVP.registry.view.RegistryView;

public class RegistryPresenter extends BasePresenter<RegistryModel, RegistryView> {

    public RegistryPresenter(RegistryModel model, RegistryView view) {
        super(model, view);
    }

}
