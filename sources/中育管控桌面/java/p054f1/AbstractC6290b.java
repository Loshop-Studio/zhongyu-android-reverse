package p054f1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6290b {

    /* renamed from: f1.b$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final /* synthetic */ Function2 f7657a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f7658b;

        /* renamed from: c */
        public final /* synthetic */ Function1 f7659c;

        /* renamed from: d */
        public final /* synthetic */ Function1 f7660d;

        /* renamed from: e */
        public final /* synthetic */ Function1 f7661e;

        /* renamed from: f */
        public final /* synthetic */ Function2 f7662f;

        /* renamed from: g */
        public final /* synthetic */ Function1 f7663g;

        public a(Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15) {
            this.f7657a = function2;
            this.f7658b = function1;
            this.f7659c = function12;
            this.f7660d = function13;
            this.f7661e = function14;
            this.f7662f = function22;
            this.f7663g = function15;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function2 function2 = this.f7657a;
            if (function2 == null) {
                return;
            }
            function2.invoke(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function1 function1 = this.f7663g;
            if (function1 == null) {
                return;
            }
            function1.invoke(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function1 function1 = this.f7660d;
            if (function1 == null) {
                return;
            }
            function1.invoke(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function1 function1 = this.f7659c;
            if (function1 == null) {
                return;
            }
            function1.invoke(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Function2 function2 = this.f7662f;
            if (function2 == null) {
                return;
            }
            function2.invoke(activity, outState);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function1 function1 = this.f7658b;
            if (function1 == null) {
                return;
            }
            function1.invoke(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Function1 function1 = this.f7661e;
            if (function1 == null) {
                return;
            }
            function1.invoke(activity);
        }
    }

    /* renamed from: a */
    public static final Application.ActivityLifecycleCallbacks m6427a(Application application, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        a aVar = new a(function2, function1, function12, function13, function14, function22, function15);
        application.registerActivityLifecycleCallbacks(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ Application.ActivityLifecycleCallbacks m6428b(Application application, Function2 function2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            function2 = null;
        }
        if ((i6 & 2) != 0) {
            function1 = null;
        }
        if ((i6 & 4) != 0) {
            function12 = null;
        }
        if ((i6 & 8) != 0) {
            function13 = null;
        }
        if ((i6 & 16) != 0) {
            function14 = null;
        }
        if ((i6 & 32) != 0) {
            function22 = null;
        }
        if ((i6 & 64) != 0) {
            function15 = null;
        }
        return m6427a(application, function2, function1, function12, function13, function14, function22, function15);
    }
}
