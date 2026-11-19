package td;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.AbstractC9942a;
import kotlin.coroutines.InterfaceC9945d;
import sd.InterfaceC11110f0;

/* renamed from: td.b */
/* loaded from: classes6.dex */
public final class C11271b extends AbstractC9942a implements InterfaceC11110f0 {
    private volatile Object _preHandler;

    public C11271b() {
        super(InterfaceC11110f0.f26779d0);
        this._preHandler = this;
    }

    @Override // sd.InterfaceC11110f0
    public void handleException(InterfaceC9945d interfaceC9945d, Throwable th) {
        int i10 = Build.VERSION.SDK_INT;
        if (26 > i10 || i10 >= 28) {
            return;
        }
        Method methodM25202i = m25202i();
        Object objInvoke = methodM25202i != null ? methodM25202i.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }

    /* renamed from: i */
    public final Method m25202i() {
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
