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
public class CommonActivityUtil {

    /* renamed from: e */
    public static volatile CommonActivityUtil f11621e;

    /* renamed from: b */
    public boolean f11623b;

    /* renamed from: a */
    public List f11622a = new ArrayList();

    /* renamed from: c */
    public boolean f11624c = false;

    /* renamed from: d */
    public Application.ActivityLifecycleCallbacks f11625d = new Application.ActivityLifecycleCallbacks() { // from class: com.huawei.hms.framework.common.CommonActivityUtil.1

        /* renamed from: a */
        public int f11626a = 0;

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
            Logger.m8580i("CommonActivityUtil", "onActivityStarted");
            int i10 = this.f11626a + 1;
            this.f11626a = i10;
            if (i10 == 1) {
                CommonActivityUtil.this.f11623b = true;
                Logger.m8571d("CommonActivityUtil", "onActivityStarted");
                for (int i11 = 0; i11 < CommonActivityUtil.this.f11622a.size(); i11++) {
                    ((OnAppStatusListener) CommonActivityUtil.this.f11622a.get(i11)).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f11626a--;
            Logger.m8580i("CommonActivityUtil", "onActivityStopped");
            if (this.f11626a == 0) {
                Logger.m8571d("CommonActivityUtil", "onActivityStopped");
                CommonActivityUtil.this.f11623b = false;
                for (int i10 = 0; i10 < CommonActivityUtil.this.f11622a.size(); i10++) {
                    ((OnAppStatusListener) CommonActivityUtil.this.f11622a.get(i10)).onBack();
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
            Logger.m8588w("CommonActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i10, intentArr, i11);
        } catch (RuntimeException e10) {
            Logger.m8574e("CommonActivityUtil", "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }

    public static CommonActivityUtil getInstance() {
        if (f11621e == null) {
            synchronized (CommonActivityUtil.class) {
                try {
                    if (f11621e == null) {
                        Logger.m8580i("CommonActivityUtil", "new CommonActivityUtil");
                        f11621e = new CommonActivityUtil();
                    }
                } finally {
                }
            }
        }
        return f11621e;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return getInstance().isForeground();
    }

    public boolean isRegistered() {
        return this.f11624c;
    }

    public void register(Context context) {
        if (context == null) {
            Logger.m8580i("CommonActivityUtil", "appContext is null");
        }
        if (!(context instanceof Application)) {
            Logger.m8588w("CommonActivityUtil", "context is not application, register background fail");
        } else {
            ((Application) context).registerActivityLifecycleCallbacks(this.f11625d);
            this.f11624c = true;
        }
    }

    public void setOnAppStatusListener(OnAppStatusListener onAppStatusListener) {
        if (onAppStatusListener == null) {
            Logger.m8588w("CommonActivityUtil", "onAppStatusListener is null");
        } else if (this.f11622a.size() >= 20) {
            Logger.m8588w("CommonActivityUtil", "onAppStatusListener of count is max");
        } else {
            this.f11622a.add(onAppStatusListener);
        }
    }

    public void unRegister() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).unregisterActivityLifecycleCallbacks(this.f11625d);
        } else {
            Logger.m8588w("CommonActivityUtil", "context is not application, unRegister background fail");
        }
    }

    public boolean isForeground() {
        return this.f11623b;
    }
}
