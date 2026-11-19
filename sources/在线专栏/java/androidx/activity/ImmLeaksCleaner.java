package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.InterfaceC0501i;
import androidx.lifecycle.InterfaceC0504l;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0501i {

    /* renamed from: b */
    private static int f71b;

    /* renamed from: c */
    private static Field f72c;

    /* renamed from: d */
    private static Field f73d;

    /* renamed from: e */
    private static Field f74e;

    /* renamed from: a */
    private Activity f75a;

    ImmLeaksCleaner(Activity activity) {
        this.f75a = activity;
    }

    /* renamed from: e */
    private static void m66e() throws NoSuchFieldException {
        try {
            f71b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f73d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f74e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f72c = declaredField3;
            declaredField3.setAccessible(true);
            f71b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (bVar != AbstractC0496f.b.ON_DESTROY) {
            return;
        }
        if (f71b == 0) {
            m66e();
        }
        if (f71b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f75a.getSystemService("input_method");
            try {
                Object obj = f72c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f73d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f74e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
