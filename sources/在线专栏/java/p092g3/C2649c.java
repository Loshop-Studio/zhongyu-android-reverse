package p092g3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2919l;
import p128o2.C2920m;

/* renamed from: g3.c */
/* loaded from: classes.dex */
public final class C2649c {

    /* renamed from: a */
    @Nullable
    public static final AbstractC2648b f10471a;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM9989a;
        try {
            C2919l.a aVar = C2919l.f11409a;
            objM9989a = C2919l.m9989a(new C2647a(m8859a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            C2919l.a aVar2 = C2919l.f11409a;
            objM9989a = C2919l.m9989a(C2920m.m9993a(th));
        }
        f10471a = (AbstractC2648b) (C2919l.m9991c(objM9989a) ? null : objM9989a);
    }

    @NotNull
    /* renamed from: a */
    public static final Handler m8859a(@NotNull Looper looper, boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!z3) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
