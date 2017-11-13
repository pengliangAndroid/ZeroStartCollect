package com.wstro.zerostartcollect;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.wstro.zerostartcollect.utils.LogUtils;

/**
 * ClassName: WApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/10/31
 */
public class WApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityCreated");
            }

            @Override
            public void onActivityStarted(Activity activity) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityStarted");
            }

            @Override
            public void onActivityResumed(Activity activity) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityResumed");
            }

            @Override
            public void onActivityPaused(Activity activity) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityPaused");
            }

            @Override
            public void onActivityStopped(Activity activity) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityStopped");
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivitySaveInstanceState");
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                LogUtils.d(activity.getClass().getSimpleName()+" onActivityDestroyed");
            }
        });
    }
}
