package cl.moriahdp.BaseApplicationMVP.main.events;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseFragment;

public class DashboardEvent {

    private BaseFragment mBaseFragment;
    private int mLayoutContainerID;
    private String mFragmentTag;

    public DashboardEvent(BaseFragment baseFragment, int layoutContainerID, String fragmentTag) {
        mBaseFragment = baseFragment;
        mLayoutContainerID = layoutContainerID;
        mFragmentTag = fragmentTag;
    }

    public BaseFragment getBaseFragment() {
        return mBaseFragment;
    }

    public int getLayoutContainerID() {
        return mLayoutContainerID;
    }

    public String getFragmentTag() {
        return mFragmentTag;
    }
}
