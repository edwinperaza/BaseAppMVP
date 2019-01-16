package cl.moriahdp.BaseApplicationMVP.tabThree.view;

import android.view.View;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragmentView;
import cl.moriahdp.BaseApplicationMVP.tabThree.fragment.ThreeFragment;

public class ThreeView extends BaseFragmentView {

    private static final String TAG = ThreeView.class.getSimpleName();

    public ThreeView(ThreeFragment fragment, View rootView, Bus bus) {
        super(fragment, rootView, bus);
    }

}
