package cl.moriahdp.BaseApplicationMVP.search.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragment;
import cl.moriahdp.BaseApplicationMVP.baseclasses.IBackPressedCallback;
import cl.moriahdp.BaseApplicationMVP.main.activities.DashboardActivity;
import cl.moriahdp.BaseApplicationMVP.search.model.SearchModel;
import cl.moriahdp.BaseApplicationMVP.search.presenter.SearchPresenter;
import cl.moriahdp.BaseApplicationMVP.search.view.SearchView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;

public class SearchFragment extends BaseFragment implements IBackPressedCallback {

    private static String SEARCH_TAG = "SearchFragment";
    private View mRoot;
    private SearchPresenter searchPresenter;

    public static SearchFragment newInstance() {
        Bundle args = new Bundle();
        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onFragmentBackPressed() {

    }

    @Override
    protected View onCreateEventView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.fragment_events, container, false);
        searchPresenter = new SearchPresenter(
                new SearchModel(BusProvider.getInstance()),
                new SearchView(this, mRoot, BusProvider.getInstance()));
        return mRoot;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        configureActionBar();
    }

    public void configureActionBar() {
        DashboardActivity dashboardActivity = (DashboardActivity) getActivity();
        if (dashboardActivity != null) {
            dashboardActivity.setToolbarTitle(R.string.search_tab);
            dashboardActivity.hideBottomBar(false);
            dashboardActivity.configureToolbarBackArrow(false);
        }
    }

    public static String getSearchTag() {
        return SEARCH_TAG;
    }

    @Override
    public void onResume() {
        super.onResume();
        BusProvider.register(this);
        BusProvider.register(searchPresenter);
    }

    @Override
    public void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(this);
        BusProvider.getInstance().unregister(searchPresenter);
    }

}
