package cl.moriahdp.BaseApplicationMVP.tutorial.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.pixelcan.inkpageindicator.InkPageIndicator;

import butterknife.ButterKnife;
import cl.moriahdp.BaseApplicationMVP.R;
import cl.moriahdp.BaseApplicationMVP.BaseApplication;
import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseActivity;
import cl.moriahdp.BaseApplicationMVP.repository.DataRepository;
import cl.moriahdp.BaseApplicationMVP.registry.modelObject.UserModelObject;
import cl.moriahdp.BaseApplicationMVP.repository.TutorialRepository;
import cl.moriahdp.BaseApplicationMVP.tutorial.fragment.FirstFragment;
import cl.moriahdp.BaseApplicationMVP.tutorial.fragment.FourthFragment;
import cl.moriahdp.BaseApplicationMVP.tutorial.fragment.SecondFragment;
import cl.moriahdp.BaseApplicationMVP.tutorial.fragment.ThirdFragment;
import cl.moriahdp.BaseApplicationMVP.tutorial.model.TutorialModel;
import cl.moriahdp.BaseApplicationMVP.tutorial.presenter.TutorialPresenter;
import cl.moriahdp.BaseApplicationMVP.tutorial.view.TutorialView;
import cl.moriahdp.BaseApplicationMVP.utils.bus.BusProvider;


public class TutorialActivity extends BaseActivity {


    private TutorialPresenter presenter;
    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        ViewPager vpPager = findViewById(R.id.vp_tutorial);
        InkPageIndicator inkPageIndicator = findViewById(R.id.indicator);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        inkPageIndicator.setViewPager(vpPager);
        presenter = new TutorialPresenter(
                new TutorialModel(new TutorialRepository(TutorialActivity.this, true), BusProvider.getInstance()),
                new TutorialView(this, BusProvider.getInstance()));
        hideToolbar();


    }

    @Override
    protected void onResume() {
        super.onResume();
        BusProvider.register(presenter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        BusProvider.unregister(presenter);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 4;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 1 - This will show FirstFragment
                    return FirstFragment.newInstance("Page # 1");
                case 1: // Fragment # 2 - This will show FirstFragment different title
                    return SecondFragment.newInstance("Page # 2");
                case 2: // Fragment # 3 - This will show SecondFragment
                    return ThirdFragment.newInstance("Page # 3");
                case 3: // Fragment # 4 - This will show SecondFragment
                    return FourthFragment.newInstance("Page # 4");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }
}
