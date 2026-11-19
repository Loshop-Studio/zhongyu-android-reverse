package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.e */
/* loaded from: classes.dex */
public class C0077e {

    /* renamed from: a */
    public final View f598a;

    /* renamed from: d */
    public C0106s0 f601d;

    /* renamed from: e */
    public C0106s0 f602e;

    /* renamed from: f */
    public C0106s0 f603f;

    /* renamed from: c */
    public int f600c = -1;

    /* renamed from: b */
    public final C0085i f599b = C0085i.m333a();

    public C0077e(View view) {
        this.f598a = view;
    }

    /* renamed from: a */
    public void m300a() {
        Drawable background = this.f598a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f601d != null) {
                if (this.f603f == null) {
                    this.f603f = new C0106s0();
                }
                C0106s0 c0106s0 = this.f603f;
                c0106s0.f786a = null;
                c0106s0.f789d = false;
                c0106s0.f787b = null;
                c0106s0.f788c = false;
                View view = this.f598a;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c0106s0.f789d = true;
                    c0106s0.f786a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f598a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c0106s0.f788c = true;
                    c0106s0.f787b = backgroundTintMode;
                }
                if (c0106s0.f789d || c0106s0.f788c) {
                    C0085i.m336f(background, c0106s0, this.f598a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0106s0 c0106s02 = this.f602e;
            if (c0106s02 != null) {
                C0085i.m336f(background, c0106s02, this.f598a.getDrawableState());
                return;
            }
            C0106s0 c0106s03 = this.f601d;
            if (c0106s03 != null) {
                C0085i.m336f(background, c0106s03, this.f598a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m301b() {
        C0106s0 c0106s0 = this.f602e;
        if (c0106s0 != null) {
            return c0106s0.f786a;
        }
        return null;
    }

    /* renamed from: c */
    public PorterDuff.Mode m302c() {
        C0106s0 c0106s0 = this.f602e;
        if (c0106s0 != null) {
            return c0106s0.f787b;
        }
        return null;
    }

    /* renamed from: d */
    public void m303d(AttributeSet attributeSet, int i) {
        Context context = this.f598a.getContext();
        int[] iArr = C0014b.f50y;
        C0110u0 c0110u0M414q = C0110u0.m414q(context, attributeSet, iArr, i, 0);
        View view = this.f598a;
        C0266o.m874m(view, view.getContext(), iArr, attributeSet, c0110u0M414q.f810b, i, 0);
        try {
            if (c0110u0M414q.m429o(0)) {
                this.f600c = c0110u0M414q.m426l(0, -1);
                ColorStateList colorStateListM338d = this.f599b.m338d(this.f598a.getContext(), this.f600c);
                if (colorStateListM338d != null) {
                    m306g(colorStateListM338d);
                }
            }
            if (c0110u0M414q.m429o(1)) {
                this.f598a.setBackgroundTintList(c0110u0M414q.m417c(1));
            }
            if (c0110u0M414q.m429o(2)) {
                this.f598a.setBackgroundTintMode(C0071b0.m283b(c0110u0M414q.m424j(2, -1), null));
            }
            c0110u0M414q.f810b.recycle();
        } catch (Throwable th) {
            c0110u0M414q.f810b.recycle();
            throw th;
        }
    }

    /* renamed from: e */
    public void m304e() {
        this.f600c = -1;
        m306g(null);
        m300a();
    }

    /* renamed from: f */
    public void m305f(int i) {
        this.f600c = i;
        C0085i c0085i = this.f599b;
        m306g(c0085i != null ? c0085i.m338d(this.f598a.getContext(), i) : null);
        m300a();
    }

    /* renamed from: g */
    public void m306g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f601d == null) {
                this.f601d = new C0106s0();
            }
            C0106s0 c0106s0 = this.f601d;
            c0106s0.f786a = colorStateList;
            c0106s0.f789d = true;
        } else {
            this.f601d = null;
        }
        m300a();
    }

    /* renamed from: h */
    public void m307h(ColorStateList colorStateList) {
        if (this.f602e == null) {
            this.f602e = new C0106s0();
        }
        C0106s0 c0106s0 = this.f602e;
        c0106s0.f786a = colorStateList;
        c0106s0.f789d = true;
        m300a();
    }

    /* renamed from: i */
    public void m308i(PorterDuff.Mode mode) {
        if (this.f602e == null) {
            this.f602e = new C0106s0();
        }
        C0106s0 c0106s0 = this.f602e;
        c0106s0.f787b = mode;
        c0106s0.f788c = true;
        m300a();
    }
}
