package com.zykj.base.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&j\u0002\b\f¨\u0006\r"}, m13413d2 = {"Lcom/zykj/base/utils/ActivityCollectionHelper;", "", "(Ljava/lang/String;I)V", "exitApp", "", "finishAll", "register", "application", "Landroid/app/Application;", "topActivity", "Landroid/app/Activity;", "unRegister", "INSTANCE", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class ActivityCollectionHelper {
    public static final ActivityCollectionHelper INSTANCE = new INSTANCE("INSTANCE", 0);
    private static final /* synthetic */ ActivityCollectionHelper[] $VALUES = $values();

    @Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0001\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m13413d2 = {"Lcom/zykj/base/utils/ActivityCollectionHelper$INSTANCE;", "Lcom/zykj/base/utils/ActivityCollectionHelper;", "Landroid/app/Activity;", "topActivity", "()Landroid/app/Activity;", "Landroid/app/Application;", "application", "", "register", "(Landroid/app/Application;)V", "unRegister", "exitApp", "()V", "finishAll", "", "a", "Ljava/util/List;", "activityList", "", "b", "Z", "isRegister", "Landroid/app/Application$ActivityLifecycleCallbacks;", "c", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class INSTANCE extends ActivityCollectionHelper {

        /* renamed from: a, reason: from kotlin metadata */
        public final List activityList;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean isRegister;

        /* renamed from: c, reason: from kotlin metadata */
        public final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;

        /* renamed from: com.zykj.base.utils.ActivityCollectionHelper$INSTANCE$a */
        public static final class C6934a implements Application.ActivityLifecycleCallbacks {
            public C6934a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity == null) {
                    return;
                }
                INSTANCE.this.activityList.add(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity == null) {
                    return;
                }
                INSTANCE.this.activityList.remove(activity);
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
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }
        }

        public INSTANCE(String str, int i9) {
            super(str, i9, null);
            this.activityList = new CopyOnWriteArrayList();
            this.activityLifecycleCallbacks = new C6934a();
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
            for (Activity activity : this.activityList) {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void register(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (this.isRegister) {
                return;
            }
            this.isRegister = true;
            application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public Activity topActivity() {
            if (this.activityList.isEmpty()) {
                return null;
            }
            return (Activity) this.activityList.get(r0.size() - 1);
        }

        @Override // com.zykj.base.utils.ActivityCollectionHelper
        public void unRegister(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
    }

    private static final /* synthetic */ ActivityCollectionHelper[] $values() {
        return new ActivityCollectionHelper[]{INSTANCE};
    }

    public /* synthetic */ ActivityCollectionHelper(String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i9);
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

    private ActivityCollectionHelper(String str, int i9) {
    }
}
