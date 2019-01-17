package cl.moriahdp.BaseApplicationMVP.repository;

import android.content.Context;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import cl.moriahdp.BaseApplicationMVP.BaseApplication;
import cl.moriahdp.BaseApplicationMVP.db.AppDatabase;
import cl.moriahdp.BaseApplicationMVP.utils.TinyDB;
import cl.moriahdp.BaseApplicationMVP.utils.data.APIService;
import cl.moriahdp.BaseApplicationMVP.utils.data.ApiUtils;

public class DataRepository {

    protected final AppDatabase database;
    protected final APIService apiService;
    protected Executor executor = Executors.newSingleThreadExecutor();
    protected TinyDB tinyDB;

    public DataRepository(Context context) {
        this.database = AppDatabase.getDatabase(context);
        this.tinyDB = new TinyDB(context);
        this.apiService = ApiUtils.getAPIService();
    }
}