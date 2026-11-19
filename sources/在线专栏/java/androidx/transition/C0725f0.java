package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0358u;

/* renamed from: androidx.transition.f0 */
/* loaded from: classes.dex */
class C0725f0 {

    /* renamed from: a */
    private static final C0737l0 f4415a;

    /* renamed from: b */
    static final Property<View, Float> f4416b;

    /* renamed from: c */
    static final Property<View, Rect> f4417c;

    /* renamed from: androidx.transition.f0$a */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C0725f0.m3857c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f4) {
            C0725f0.m3862h(view, f4.floatValue());
        }
    }

    /* renamed from: androidx.transition.f0$b */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C0358u.m2054s(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C0358u.m2063w0(view, rect);
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f4415a = new C0735k0();
        } else if (i4 >= 23) {
            f4415a = new C0733j0();
        } else {
            f4415a = new C0731i0();
        }
        f4416b = new a(Float.class, "translationAlpha");
        f4417c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m3855a(View view) {
        f4415a.mo3877a(view);
    }

    /* renamed from: b */
    static InterfaceC0723e0 m3856b(View view) {
        return new C0721d0(view);
    }

    /* renamed from: c */
    static float m3857c(View view) {
        return f4415a.mo3878b(view);
    }

    /* renamed from: d */
    static InterfaceC0743o0 m3858d(View view) {
        return new C0741n0(view);
    }

    /* renamed from: e */
    static void m3859e(View view) {
        f4415a.mo3879c(view);
    }

    /* renamed from: f */
    static void m3860f(View view, Matrix matrix) {
        f4415a.mo3886d(view, matrix);
    }

    /* renamed from: g */
    static void m3861g(View view, int i4, int i5, int i6, int i7) {
        f4415a.mo3896e(view, i4, i5, i6, i7);
    }

    /* renamed from: h */
    static void m3862h(View view, float f4) {
        f4415a.mo3880f(view, f4);
    }

    /* renamed from: i */
    static void m3863i(View view, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        f4415a.mo3899g(view, i4);
    }

    /* renamed from: j */
    static void m3864j(View view, Matrix matrix) {
        f4415a.mo3887h(view, matrix);
    }

    /* renamed from: k */
    static void m3865k(View view, Matrix matrix) {
        f4415a.mo3888i(view, matrix);
    }
}
