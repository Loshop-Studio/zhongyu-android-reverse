package com.huawei.hms.framework.common;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ActivityUtil {

    /* renamed from: d */
    public static volatile ActivityUtil f11614d;

    /* renamed from: b */
    public boolean f11616b;

    /* renamed from: a */
    public List f11615a = new ArrayList();

    /* renamed from: c */
    public Application.ActivityLifecycleCallbacks f11617c = new Application.ActivityLifecycleCallbacks() { // from class: com.huawei.hms.framework.common.ActivityUtil.1

        /* renamed from: a */
        public int f11618a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i10 = this.f11618a + 1;
            this.f11618a = i10;
            if (i10 == 1) {
                ActivityUtil.this.f11616b = true;
                Logger.m8571d("ActivityUtil", "onActivityStarted");
                for (int i11 = 0; i11 < ActivityUtil.this.f11615a.size(); i11++) {
                    ((OnAppStatusListener) ActivityUtil.this.f11615a.get(i11)).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i10 = this.f11618a - 1;
            this.f11618a = i10;
            if (i10 == 0) {
                Logger.m8571d("ActivityUtil", "onActivityStopped");
                ActivityUtil.this.f11616b = false;
                for (int i11 = 0; i11 < ActivityUtil.this.f11615a.size(); i11++) {
                    ((OnAppStatusListener) ActivityUtil.this.f11615a.get(i11)).onBack();
                }
            }
        }
    };

    public interface OnAppStatusListener {
        void onBack();

        void onFront();
    }

    public static PendingIntent getActivities(Context context, int i10, Intent[] intentArr, int i11) {
        if (context == null) {
            Logger.m8588w("ActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i10, intentArr, i11);
        } catch (RuntimeException e10) {
            Logger.m8574e("ActivityUtil", "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }

    public static ActivityUtil getInstance() {
        if (f11614d == null) {
            synchronized (ActivityUtil.class) {
                try {
                    if (f11614d == null) {
                        f11614d = new ActivityUtil();
                    }
                } finally {
                }
            }
        }
        return f11614d;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return getInstance().isForeground();
    }

    public void register() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).registerActivityLifecycleCallbacks(this.f11617c);
        } else {
            Logger.m8588w("ActivityUtil", "context is not application, register background fail");
        }
    }

    public void setOnAppStatusListener(OnAppStatusListener onAppStatusListener) {
        if (onAppStatusListener == null) {
            Logger.m8588w("ActivityUtil", "onAppStatusListener is null");
        } else if (this.f11615a.size() >= 20) {
            Logger.m8588w("ActivityUtil", "onAppStatusListener of count is max");
        } else {
            this.f11615a.add(onAppStatusListener);
        }
    }

    public void unRegister() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).unregisterActivityLifecycleCallbacks(this.f11617c);
        } else {
            Logger.m8588w("ActivityUtil", "context is not application, unRegister background fail");
        }
    }

    public boolean isForeground() {
        return this.f11616b;
    }
}
