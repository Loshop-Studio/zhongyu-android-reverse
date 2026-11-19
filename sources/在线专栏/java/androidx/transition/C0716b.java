package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.b */
/* loaded from: classes.dex */
class C0716b {

    /* renamed from: a */
    private static Method f4392a;

    /* renamed from: b */
    private static Method f4393b;

    /* renamed from: c */
    private static boolean f4394c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    static void m3845a(Canvas canvas, boolean z3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (z3) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i4 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f4394c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f4392a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f4393b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4394c = true;
        }
        if (z3) {
            try {
                Method method2 = f4392a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
        if (z3 || (method = f4393b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
