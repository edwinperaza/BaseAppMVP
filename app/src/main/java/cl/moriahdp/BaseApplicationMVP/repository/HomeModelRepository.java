package cl.moriahdp.BaseApplicationMVP.repository;

import android.content.Context;

import java.util.List;

import cl.moriahdp.BaseApplicationMVP.db.ResponseListener;
import cl.moriahdp.BaseApplicationMVP.home.modelObject.HomeModelObject;

public class HomeModelRepository extends DataRepository {

    public HomeModelRepository(Context context) {
        super(context);
    }

    public void getAllHomeModelObjectFromDatabase(final ResponseListener<List<HomeModelObject>> listener) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                listener.onResponse(database.homeModelObjectDao().getAll());
            }
        });
    }
}
