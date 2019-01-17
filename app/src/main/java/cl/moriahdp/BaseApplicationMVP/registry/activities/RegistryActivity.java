package cl.moriahdp.BaseApplicationMVP.registry.activities;

import android.os.Bundle;

import butterknife.ButterKnife;
import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;
import cl.moriahdp.BaseApplicationMVP.registry.model.RegistryModel;
import cl.moriahdp.BaseApplicationMVP.registry.presenter.RegistryPresenter;
import cl.moriahdp.BaseApplicationMVP.registry.view.RegistryView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;

public class RegistryActivity extends BaseActivity {

    private RegistryPresenter mRegistryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        RegistryView registryView = new RegistryView(this, BusProvider.getInstance());
        mRegistryPresenter = new RegistryPresenter(new RegistryModel(new DataRepository(RegistryActivity.this), BusProvider.getInstance()), registryView);
        ButterKnife.bind(registryView, this);
        hideToolbar();
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(mRegistryPresenter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(mRegistryPresenter);
    }
}
