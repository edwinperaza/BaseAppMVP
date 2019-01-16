package cl.moriahdp.BaseApplicationMVP.homeDetail.presenter;


import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.homeDetail.model.HomeDetailModel;
import cl.moriahdp.BaseApplicationMVP.homeDetail.view.HomeDetailView;

public class HomeDetailPresenter extends BasePresenter<HomeDetailModel, HomeDetailView> {

    public HomeDetailPresenter(HomeDetailModel model, HomeDetailView view) {
        super(model, view);
        if (model.isValidSermon()) {
            view.setSermonDetail(model.getSermon());
        } else {
            view.showSermonDetailError();
        }
    }

}
