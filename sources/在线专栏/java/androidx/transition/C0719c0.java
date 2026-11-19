package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.c0 */
/* loaded from: classes.dex */
class C0719c0 {

    /* renamed from: a */
    private static boolean f4396a = true;

    /* renamed from: b */
    private static Method f4397b;

    /* renamed from: c */
    private static boolean f4398c;

    /* renamed from: a */
    static int m3848a(ViewGroup viewGroup, int i4) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i4);
        }
        if (!f4398c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f4397b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4398c = true;
        }
        Method method = f4397b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i4))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i4;
    }

    /* renamed from: b */
    static InterfaceC0717b0 m3849b(ViewGroup viewGroup) {
        return new C0715a0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private static void m3850c(ViewGroup viewGroup, boolean z3) {
        if (f4396a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f4396a = false;
            }
        }
    }

    /* renamed from: d */
    static void m3851d(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else {
            m3850c(viewGroup, z3);
        }
    }
}
