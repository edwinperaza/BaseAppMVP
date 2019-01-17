package cl.moriahdp.BaseApplicationMVP.db;

public interface ResponseListener<T> {
    void onResponse(T body);
}
