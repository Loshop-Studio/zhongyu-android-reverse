package p146j8;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.AbstractC9097a;
import kotlin.coroutines.InterfaceC9100d;
import p135i8.InterfaceC8893z;

/* renamed from: j8.b */
/* loaded from: classes5.dex */
public final class C9027b extends AbstractC9097a implements InterfaceC8893z {
    private volatile Object _preHandler;

    public C9027b() {
        super(InterfaceC8893z.f16555a0);
        this._preHandler = this;
    }

    @Override // p135i8.InterfaceC8893z
    public void handleException(InterfaceC9100d interfaceC9100d, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 28) {
            return;
        }
        Method methodM15692i = m15692i();
        Object objInvoke = methodM15692i != null ? methodM15692i.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }

    /* renamed from: i */
    public final Method m15692i() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }
}
