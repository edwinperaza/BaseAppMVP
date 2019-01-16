package cl.moriahdp.BaseApplicationMVP;

import android.app.Application;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import cl.moriahdp.BaseApplicationMVP.db.AppDatabase;
import cl.moriahdp.BaseApplicationMVP.utils.TinyDB;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class BaseApplication extends Application {

    private static BaseApplication instance;
    private TinyDB mTinyDB;
    private final static Executor databaseIO = Executors.newSingleThreadExecutor();

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

        getDatabaseIO().execute(new Runnable() {
            @Override
            public void run() {
                AppDatabase.getDatabase(BaseApplication.this);
            }
        });

//        Uncomment this if you want to clear database each time user open app
//        getDatabaseIO().execute(new Runnable() {
//            @Override
//            public void run() {
//                AppDatabase.getDatabase(BaseApplication.this).clearAllTables();
//            }
//        });

    }

    public TinyDB getTinyDB() {
        return mTinyDB;
    }

    public static Executor getDatabaseIO() {
        return databaseIO;
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
