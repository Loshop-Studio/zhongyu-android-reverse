package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0358u;
import p015c.C1047j;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
class C0207d {

    /* renamed from: a */
    private final View f1061a;

    /* renamed from: d */
    private C0210e0 f1064d;

    /* renamed from: e */
    private C0210e0 f1065e;

    /* renamed from: f */
    private C0210e0 f1066f;

    /* renamed from: c */
    private int f1063c = -1;

    /* renamed from: b */
    private final C0211f f1062b = C0211f.m791b();

    C0207d(View view) {
        this.f1061a = view;
    }

    /* renamed from: a */
    private boolean m768a(Drawable drawable) {
        if (this.f1066f == null) {
            this.f1066f = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1066f;
        c0210e0.m789a();
        ColorStateList colorStateListM2050q = C0358u.m2050q(this.f1061a);
        if (colorStateListM2050q != null) {
            c0210e0.f1080d = true;
            c0210e0.f1077a = colorStateListM2050q;
        }
        PorterDuff.Mode modeM2052r = C0358u.m2052r(this.f1061a);
        if (modeM2052r != null) {
            c0210e0.f1079c = true;
            c0210e0.f1078b = modeM2052r;
        }
        if (!c0210e0.f1080d && !c0210e0.f1079c) {
            return false;
        }
        C0211f.m794i(drawable, c0210e0, this.f1061a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m769k() {
        return this.f1064d != null;
    }

    /* renamed from: b */
    void m770b() {
        Drawable background = this.f1061a.getBackground();
        if (background != null) {
            if (m769k() && m768a(background)) {
                return;
            }
            C0210e0 c0210e0 = this.f1065e;
            if (c0210e0 != null) {
                C0211f.m794i(background, c0210e0, this.f1061a.getDrawableState());
                return;
            }
            C0210e0 c0210e02 = this.f1064d;
            if (c0210e02 != null) {
                C0211f.m794i(background, c0210e02, this.f1061a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    ColorStateList m771c() {
        C0210e0 c0210e0 = this.f1065e;
        if (c0210e0 != null) {
            return c0210e0.f1077a;
        }
        return null;
    }

    /* renamed from: d */
    PorterDuff.Mode m772d() {
        C0210e0 c0210e0 = this.f1065e;
        if (c0210e0 != null) {
            return c0210e0.f1078b;
        }
        return null;
    }

    /* renamed from: e */
    void m773e(AttributeSet attributeSet, int i4) {
        Context context = this.f1061a.getContext();
        int[] iArr = C1047j.f6021T3;
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, iArr, i4, 0);
        View view = this.f1061a;
        C0358u.m2047o0(view, view.getContext(), iArr, attributeSet, c0214g0M815v.m833r(), i4, 0);
        try {
            int i5 = C1047j.f6026U3;
            if (c0214g0M815v.m834s(i5)) {
                this.f1063c = c0214g0M815v.m829n(i5, -1);
                ColorStateList colorStateListM797f = this.f1062b.m797f(this.f1061a.getContext(), this.f1063c);
                if (colorStateListM797f != null) {
                    m776h(colorStateListM797f);
                }
            }
            int i6 = C1047j.f6031V3;
            if (c0214g0M815v.m834s(i6)) {
                C0358u.m2059u0(this.f1061a, c0214g0M815v.m818c(i6));
            }
            int i7 = C1047j.f6036W3;
            if (c0214g0M815v.m834s(i7)) {
                C0358u.m2061v0(this.f1061a, C0231q.m983d(c0214g0M815v.m826k(i7, -1), null));
            }
        } finally {
            c0214g0M815v.m835w();
        }
    }

    /* renamed from: f */
    void m774f(Drawable drawable) {
        this.f1063c = -1;
        m776h(null);
        m770b();
    }

    /* renamed from: g */
    void m775g(int i4) {
        this.f1063c = i4;
        C0211f c0211f = this.f1062b;
        m776h(c0211f != null ? c0211f.m797f(this.f1061a.getContext(), i4) : null);
        m770b();
    }

    /* renamed from: h */
    void m776h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1064d == null) {
                this.f1064d = new C0210e0();
            }
            C0210e0 c0210e0 = this.f1064d;
            c0210e0.f1077a = colorStateList;
            c0210e0.f1080d = true;
        } else {
            this.f1064d = null;
        }
        m770b();
    }

    /* renamed from: i */
    void m777i(ColorStateList colorStateList) {
        if (this.f1065e == null) {
            this.f1065e = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1065e;
        c0210e0.f1077a = colorStateList;
        c0210e0.f1080d = true;
        m770b();
    }

    /* renamed from: j */
    void m778j(PorterDuff.Mode mode) {
        if (this.f1065e == null) {
            this.f1065e = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1065e;
        c0210e0.f1078b = mode;
        c0210e0.f1079c = true;
        m770b();
    }
}
