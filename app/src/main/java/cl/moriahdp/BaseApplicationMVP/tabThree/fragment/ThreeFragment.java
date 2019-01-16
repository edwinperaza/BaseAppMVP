package cl.moriahdp.BaseApplicationMVP.tabThree.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragment;
import cl.moriahdp.BaseApplicationMVP.baseclasses.IBackPressedCallback;
import cl.moriahdp.BaseApplicationMVP.main.activities.DashboardActivity;
import cl.moriahdp.BaseApplicationMVP.tabThree.model.ThreeModel;
import cl.moriahdp.BaseApplicationMVP.tabThree.presenter.ThreePresenter;
import cl.moriahdp.BaseApplicationMVP.tabThree.view.ThreeView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;

public class ThreeFragment extends BaseFragment implements IBackPressedCallback {

    private static String THREE_TAG = "ThreeTag";
    private View mRoot;
    private ThreePresenter threePresenter;

    public static ThreeFragment newInstance() {
        Bundle args = new Bundle();
        ThreeFragment fragment = new ThreeFragment();
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
        mRoot = inflater.inflate(R.layout.fragment_three, container, false);
        threePresenter = new ThreePresenter(
                new ThreeModel(BusProvider.getInstance()),
                new ThreeView(this, mRoot, BusProvider.getInstance()));
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
            dashboardActivity.showToolbar();
            dashboardActivity.setToolbarTitle(R.string.connect_tab);
            dashboardActivity.hideBottomBar(false);
            dashboardActivity.configureToolbarBackArrow(false);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        BusProvider.register(this);
        BusProvider.register(threePresenter);
    }

    public static String getThreeTag() {
        return THREE_TAG;
    }

}