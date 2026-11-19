package p146j8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.android.HandlerContext;

/* renamed from: j8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9030e {

    /* renamed from: a */
    public static final AbstractC9029d f17255a;
    private static volatile Choreographer choreographer;

    static {
        Object objM15909b;
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(new HandlerContext(m15694a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        f17255a = (AbstractC9029d) (Result.m15913g(objM15909b) ? null : objM15909b);
    }

    /* renamed from: a */
    public static final Handler m15694a(Looper looper, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC9133u.m16131e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* renamed from: b */
    public static final AbstractC9029d m15695b(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }
}
