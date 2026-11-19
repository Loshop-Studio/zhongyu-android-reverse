package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p000a.p057m.AbstractC0355d;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0356e {

    /* renamed from: b */
    public static int f2667b;

    /* renamed from: c */
    public static Field f2668c;

    /* renamed from: d */
    public static Field f2669d;

    /* renamed from: e */
    public static Field f2670e;

    /* renamed from: a */
    public Activity f2671a;

    public ImmLeaksCleaner(Activity activity) {
        this.f2671a = activity;
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (aVar != AbstractC0355d.a.ON_DESTROY) {
            return;
        }
        if (f2667b == 0) {
            try {
                f2667b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f2669d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f2670e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f2668c = declaredField3;
                declaredField3.setAccessible(true);
                f2667b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f2667b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f2671a.getSystemService("input_method");
            try {
                Object obj = f2668c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f2669d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f2670e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
