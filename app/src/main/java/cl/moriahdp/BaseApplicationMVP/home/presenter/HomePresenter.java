package cl.moriahdp.BaseApplicationMVP.home.presenter;


import com.squareup.otto.Subscribe;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.home.model.HomeModel;
import cl.moriahdp.BaseApplicationMVP.home.view.HomeView;

public class HomePresenter extends BasePresenter<HomeModel, HomeView> {

    public HomePresenter(HomeModel model, HomeView view) {
        super(model, view);
        model.requestHomeItemList();
    }

    @Subscribe
    public void onRequestHomeListSuccess(HomeModel.RequestHomeListSuccess event) {
        view.serRecycler(event.getHomeItemList());
    }

    @Subscribe
    public void onItemClickListenerEvent(HomeView.onItemClickListener event) {
        view.goToSermonDetailFragment(event.getHomeItemList());
    }

}
