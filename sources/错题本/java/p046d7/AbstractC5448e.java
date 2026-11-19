package p046d7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.Nullable;

/* renamed from: d7.e */
/* loaded from: classes4.dex */
public abstract class AbstractC5448e {

    /* renamed from: a */
    public static final /* synthetic */ int f8412a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM13956constructorimpl;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(new C5447d(m4818a(Looper.getMainLooper())));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
    }

    /* renamed from: a */
    public static final Handler m4818a(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC5830k.m5328e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
