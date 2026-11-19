package com.zykj.base.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.Keep;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes4.dex */
public abstract class ActivityCollectionHelper {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ ActivityCollectionHelper[] $VALUES;
    public static final ActivityCollectionHelper INSTANCE = new INSTANCE("INSTANCE", 0);

    public static final class INSTANCE extends ActivityCollectionHelper {

        /* renamed from: a */
        public final List f8667a;

        /* renamed from: b */
        public boolean f8668b;

        /* renamed from: c */
        public final Application.ActivityLifecycleCallbacks f8669c;

        /* renamed from: com.zykj.base.utils.ActivityCollectionHelper$INSTANCE$a */
        public static final class C7043a implements Application.ActivityLifecycleCallbacks {
            public C7043a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                AbstractC9133u.m16133g(activity, "activity");
                INSTANCE.this.f8667a.add(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                AbstractC9133u.m16133g(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                AbstractC9133u.m16133g(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                AbstractC9133u.m16133g(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                AbstractC9133u.m16133g(activity, "activity");
                AbstractC9133u.m16133g(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                AbstractC9133u.m16133g(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                AbstractC9133u.m16133g(activity, "activity");
            }
        }

        public INSTANCE(String str, int i10) {
            super(str, i10, null);
            this.f8667a = new CopyOnWriteArrayList();
            this.f8669c = new C7043a();
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void exitApp() {
            finishAll();
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void finishAll() {
            for (Activity activity : this.f8667a) {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void register(Application application) {
            AbstractC9133u.m16133g(application, "application");
            if (this.f8668b) {
                return;
            }
            this.f8668b = true;
            application.registerActivityLifecycleCallbacks(this.f8669c);
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public Activity topActivity() {
            if (this.f8667a.isEmpty()) {
                return null;
            }
            return (Activity) this.f8667a.get(r0.size() - 1);
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void unRegister(Application application) {
            AbstractC9133u.m16133g(application, "application");
            application.unregisterActivityLifecycleCallbacks(this.f8669c);
        }
    }

    private static final /* synthetic */ ActivityCollectionHelper[] $values() {
        return new ActivityCollectionHelper[]{INSTANCE};
    }

    static {
        ActivityCollectionHelper[] activityCollectionHelperArr$values = $values();
        $VALUES = activityCollectionHelperArr$values;
        $ENTRIES = AbstractC9108a.m16085a(activityCollectionHelperArr$values);
    }

    public /* synthetic */ ActivityCollectionHelper(String str, int i10, AbstractC9126n abstractC9126n) {
        this(str, i10);
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static ActivityCollectionHelper valueOf(String str) {
        return (ActivityCollectionHelper) Enum.valueOf(ActivityCollectionHelper.class, str);
    }

    public static ActivityCollectionHelper[] values() {
        return (ActivityCollectionHelper[]) $VALUES.clone();
    }

    public abstract void exitApp();

    public abstract void finishAll();

    public abstract void register(Application application);

    public abstract Activity topActivity();

    public abstract void unRegister(Application application);

    private ActivityCollectionHelper(String str, int i10) {
    }
}
