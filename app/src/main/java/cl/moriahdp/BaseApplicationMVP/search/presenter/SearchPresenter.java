package cl.moriahdp.BaseApplicationMVP.search.presenter;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.search.model.SearchModel;
import cl.moriahdp.BaseApplicationMVP.search.view.SearchView;

public class SearchPresenter extends BasePresenter<SearchModel, SearchView> {

    public SearchPresenter(SearchModel model, SearchView view) {
        super(model, view);
    }

}
