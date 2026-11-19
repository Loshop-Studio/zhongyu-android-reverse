package com.zykj.base.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.Keep;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&j\u0002\b\u0004¨\u0006\u000e"}, m13558d2 = {"Lcom/zykj/base/utils/ActivityCollectionHelper;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "exitApp", "", "finishAll", "topActivity", "Landroid/app/Activity;", "register", "application", "Landroid/app/Application;", "unRegister", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public abstract class ActivityCollectionHelper {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityCollectionHelper[] $VALUES;
    public static final ActivityCollectionHelper INSTANCE = new INSTANCE("INSTANCE", 0);

    @Metadata(m13557d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m13558d2 = {"com/zykj/base/utils/ActivityCollectionHelper.INSTANCE", "Lcom/zykj/base/utils/ActivityCollectionHelper;", "Landroid/app/Activity;", "topActivity", "()Landroid/app/Activity;", "Landroid/app/Application;", "application", "", "register", "(Landroid/app/Application;)V", "unRegister", "exitApp", "()V", "finishAll", "", "a", "Ljava/util/List;", "activityList", "", "b", "Z", "isRegister", "Landroid/app/Application$ActivityLifecycleCallbacks;", "c", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "base_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class INSTANCE extends ActivityCollectionHelper {

        /* renamed from: a, reason: from kotlin metadata */
        public final List activityList;

        /* renamed from: b, reason: from kotlin metadata */
        public boolean isRegister;

        /* renamed from: c, reason: from kotlin metadata */
        public final Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;

        /* renamed from: com.zykj.base.utils.ActivityCollectionHelper$INSTANCE$a */
        public static final class C6616a implements Application.ActivityLifecycleCallbacks {
            public C6616a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                INSTANCE.this.activityList.add(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                INSTANCE.this.activityList.remove(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        }

        public INSTANCE(String str, int i10) {
            super(str, i10, null);
            this.activityList = new CopyOnWriteArrayList();
            this.activityLifecycleCallbacks = new C6616a();
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

    static {
        ActivityCollectionHelper[] activityCollectionHelperArr$values = $values();
        $VALUES = activityCollectionHelperArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(activityCollectionHelperArr$values);
    }

    public /* synthetic */ ActivityCollectionHelper(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    public static EnumEntries<ActivityCollectionHelper> getEntries() {
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
