package cl.moriahdp.BaseApplicationMVP.search.view;

import android.view.View;

import com.squareup.otto.Bus;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragmentView;
import cl.moriahdp.BaseApplicationMVP.search.fragment.SearchFragment;

public class SearchView extends BaseFragmentView {

    private SearchFragment fragment;

    public SearchView(SearchFragment fragment, View rootView, Bus bus) {
        super(fragment, rootView, bus);
        this.fragment = fragment;
        showLoadingOverlay();
    }
}
