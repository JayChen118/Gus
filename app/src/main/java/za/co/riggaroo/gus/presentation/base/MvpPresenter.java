package za.co.riggaroo.gus.presentation.base;

/**
 * Created by JayChen on 2016/11/9.
 */

public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
