package cl.moriahdp.BaseApplicationMVP.tutorial.presenter;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BasePresenter;
import cl.moriahdp.BaseApplicationMVP.tutorial.model.TutorialModel;
import cl.moriahdp.BaseApplicationMVP.tutorial.view.TutorialView;

public class TutorialPresenter extends BasePresenter<TutorialModel, TutorialView> {

    public TutorialPresenter(TutorialModel model, TutorialView view) {
        super(model, view);
    }
}
