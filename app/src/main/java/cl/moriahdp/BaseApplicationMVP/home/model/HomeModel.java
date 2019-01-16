package cl.moriahdp.BaseApplicationMVP.home.model;

import com.squareup.otto.Bus;

import java.util.List;
import java.util.concurrent.Executor;

import cl.moriahdp.BaseApplicationMVP.baseclasses.BaseModel;
import cl.moriahdp.BaseApplicationMVP.db.AppDatabase;
import cl.moriahdp.BaseApplicationMVP.home.modelObject.HomeModelObject;
import cl.moriahdp.BaseApplicationMVP.utils.data.APIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeModel extends BaseModel {

    private APIService apiService;
    private AppDatabase appDatabase;
    private Executor executor;

    public HomeModel(Bus bus, APIService apiService, AppDatabase appDatabase, Executor executor) {
        super(bus);
        this.apiService = apiService;
        this.appDatabase = appDatabase;
        this.executor = executor;
    }

    public void requestHomeItemList() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                bus.post(new RequestHomeListSuccess(appDatabase.homeModelObjectDao().getAll()));
            }
        });

//        apiService.getHomeItemList().enqueue(new Callback<List<HomeModelObject>>() {
//            @Override
//            public void onResponse(Call<List<HomeModelObject>> call, Response<List<HomeModelObject>> response) {
//                if (response.isSuccessful()) {
//                    List<HomeModelObject> homeModelObjectList = response.body();
//                    bus.post(new RequestHomeListSuccess(homeModelObjectList));
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<HomeModelObject>> call, Throwable t) {
//                bus.post(new RequestHomeListFailure());
//            }
//        });
    }

    public class RequestHomeListSuccess {
        private List<HomeModelObject> homeItemList;

        RequestHomeListSuccess(List<HomeModelObject> homeItemList) {
            this.homeItemList = homeItemList;
        }

        public List<HomeModelObject> getHomeItemList() {
            return homeItemList;
        }
    }

    public class RequestHomeListFailure {
    }
}