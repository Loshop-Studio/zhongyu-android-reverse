package p054f1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6289a {

    /* renamed from: a */
    public static Application f7656a;

    /* renamed from: a */
    public static final Application m6425a() {
        Application application = f7656a;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    /* renamed from: b */
    public static final void m6426b(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        f7656a = application;
    }
}
