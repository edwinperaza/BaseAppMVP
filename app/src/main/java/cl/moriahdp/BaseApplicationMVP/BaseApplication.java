package cl.moriahdp.BaseApplicationMVP;

import android.app.Application;

import cl.moriahdp.BaseApplicationMVP.utils.TinyDB;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {

    private static BaseApplication instance;
    private TinyDB mTinyDB;

    public BaseApplication() {
        instance = this;
    }

    public static BaseApplication getInstance() {
        if (instance == null) {
            instance = new BaseApplication();
        }
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mTinyDB = new TinyDB(this);
        initRealm();
    }

    private void initRealm() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();

        Realm.setDefaultConfiguration(config);
    }

    public TinyDB getTinyDB() {
        return mTinyDB;
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
