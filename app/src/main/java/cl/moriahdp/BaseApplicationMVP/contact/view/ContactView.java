package cl.moriahdp.BaseApplicationMVP.contact.view;

import android.view.View;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragmentView;
import cl.moriahdp.BaseApplicationMVP.contact.fragment.ContactFragment;

public class ContactView extends BaseFragmentView {

    public ContactView(ContactFragment fragment, View rootView, Bus bus) {
        super(fragment, rootView, bus);
    }

}
