package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.h */
/* loaded from: classes.dex */
class C0728h implements InterfaceC0724f {

    /* renamed from: b */
    private static Class<?> f4421b;

    /* renamed from: c */
    private static boolean f4422c;

    /* renamed from: d */
    private static Method f4423d;

    /* renamed from: e */
    private static boolean f4424e;

    /* renamed from: f */
    private static Method f4425f;

    /* renamed from: g */
    private static boolean f4426g;

    /* renamed from: a */
    private final View f4427a;

    private C0728h(View view) {
        this.f4427a = view;
    }

    /* renamed from: b */
    static InterfaceC0724f m3881b(View view, ViewGroup viewGroup, Matrix matrix) throws NoSuchMethodException, SecurityException {
        m3882c();
        Method method = f4423d;
        if (method != null) {
            try {
                return new C0728h((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m3882c() throws NoSuchMethodException, SecurityException {
        if (f4424e) {
            return;
        }
        try {
            m3883d();
            Method declaredMethod = f4421b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f4423d = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e4) {
            Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e4);
        }
        f4424e = true;
    }

    /* renamed from: d */
    private static void m3883d() {
        if (f4422c) {
            return;
        }
        try {
            f4421b = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e4) {
            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e4);
        }
        f4422c = true;
    }

    /* renamed from: e */
    private static void m3884e() throws NoSuchMethodException, SecurityException {
        if (f4426g) {
            return;
        }
        try {
            m3883d();
            Method declaredMethod = f4421b.getDeclaredMethod("removeGhost", View.class);
            f4425f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e4) {
            Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e4);
        }
        f4426g = true;
    }

    /* renamed from: f */
    static void m3885f(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m3884e();
        Method method = f4425f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4.getCause());
            }
        }
    }

    @Override // androidx.transition.InterfaceC0724f
    /* renamed from: a */
    public void mo3854a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.InterfaceC0724f
    public void setVisibility(int i4) {
        this.f4427a.setVisibility(i4);
    }
}
