package cl.moriahdp.BaseApplicationMVP.contact.presenter;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.contact.model.ContactModel;
import cl.moriahdp.BaseApplicationMVP.contact.view.ContactView;

public class ContactPresenter extends BasePresenter<ContactModel, ContactView> {

    public ContactPresenter(ContactModel model, ContactView view) {
        super(model, view);
    }

}
