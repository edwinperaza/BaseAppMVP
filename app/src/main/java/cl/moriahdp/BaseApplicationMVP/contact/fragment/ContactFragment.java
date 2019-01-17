package cl.moriahdp.BaseApplicationMVP.contact.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragment;
import cl.moriahdp.BaseApplicationMVP.baseclasses.IBackPressedCallback;
import cl.moriahdp.BaseApplicationMVP.contact.model.ContactModel;
import cl.moriahdp.BaseApplicationMVP.contact.presenter.ContactPresenter;
import cl.moriahdp.BaseApplicationMVP.contact.view.ContactView;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;
import cl.moriahdp.BaseApplicationMVP.main.activities.DashboardActivity;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;

public class ContactFragment extends BaseFragment implements IBackPressedCallback {

    private static String CONTACT_TAG = "ContactFragment";
    private View mRoot;
    private ContactPresenter contactPresenter;

    public static ContactFragment newInstance() {
        Bundle args = new Bundle();
        ContactFragment fragment = new ContactFragment();
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
        mRoot = inflater.inflate(R.layout.fragment_contact, container, false);
        contactPresenter = new ContactPresenter(
                new ContactModel(new DataRepository(getContext()), BusProvider.getInstance()),
                new ContactView(this, mRoot, BusProvider.getInstance()));
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
            dashboardActivity.setToolbarTitle(R.string.contact_tab);
            dashboardActivity.hideBottomBar(false);
            dashboardActivity.configureToolbarBackArrow(false);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        BusProvider.register(this);
        BusProvider.register(contactPresenter);
    }

    @Override
    public void onPause() {
        super.onPause();
        BusProvider.getInstance().unregister(this);
        BusProvider.getInstance().unregister(contactPresenter);
    }


    public static String getContactTag() {
        return CONTACT_TAG;
    }
}
