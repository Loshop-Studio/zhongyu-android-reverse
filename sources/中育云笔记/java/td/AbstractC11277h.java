package td;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: td.h */
/* loaded from: classes6.dex */
public abstract class AbstractC11277h {

    /* renamed from: a */
    public static final AbstractC11276g f27087a;
    private static volatile Choreographer choreographer;

    static {
        Object objM20054c;
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(new C11275f(m25212a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        f27087a = (AbstractC11276g) (Result.m20058g(objM20054c) ? null : objM20054c);
    }

    /* renamed from: a */
    public static final Handler m25212a(Looper looper, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* renamed from: b */
    public static final AbstractC11276g m25213b(Handler handler, String str) {
        return new C11275f(handler, str);
    }
}
