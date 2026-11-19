package com.zykj.message.client;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ActivityCollectionHelper {
    private static ActivityCollectionHelper helper = new ActivityCollectionHelper();
    private ActivityResumeListener resumeListener;
    private List<Activity> activityList = new CopyOnWriteArrayList();
    private boolean isRegister = false;
    private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.zykj.message.client.ActivityCollectionHelper.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ActivityCollectionHelper.this.activityList.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (ActivityCollectionHelper.this.resumeListener != null) {
                ActivityCollectionHelper.this.resumeListener.onResume();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            ActivityCollectionHelper.this.activityList.remove(activity);
        }
    };

    public interface ActivityResumeListener {
        void onResume();
    }

    private ActivityCollectionHelper() {
    }

    public static ActivityCollectionHelper with() {
        return helper;
    }

    public void register(Application application) {
        if (this.isRegister) {
            return;
        }
        this.isRegister = true;
        application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public void unRegister(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public void exitApp() {
        finishAll();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    public void finishAll() {
        for (Activity activity : this.activityList) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    public Activity getTopActivity() {
        if (this.activityList.size() == 0) {
            return null;
        }
        return this.activityList.get(r0.size() - 1);
    }

    public void registerResumeListener(ActivityResumeListener activityResumeListener) {
        this.resumeListener = activityResumeListener;
    }

    public void unRegisterResumeListener() {
        this.resumeListener = null;
    }
}
