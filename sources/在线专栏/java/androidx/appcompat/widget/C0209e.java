package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.C0358u;
import androidx.core.widget.C0369c;
import p015c.C1047j;
import p073d.C2443a;
import p156u.C3403a;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0209e {

    /* renamed from: a */
    private final CompoundButton f1071a;

    /* renamed from: b */
    private ColorStateList f1072b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1073c = null;

    /* renamed from: d */
    private boolean f1074d = false;

    /* renamed from: e */
    private boolean f1075e = false;

    /* renamed from: f */
    private boolean f1076f;

    C0209e(CompoundButton compoundButton) {
        this.f1071a = compoundButton;
    }

    /* renamed from: a */
    void m781a() throws NoSuchFieldException {
        Drawable drawableM2173a = C0369c.m2173a(this.f1071a);
        if (drawableM2173a != null) {
            if (this.f1074d || this.f1075e) {
                Drawable drawableMutate = C3403a.m10401r(drawableM2173a).mutate();
                if (this.f1074d) {
                    C3403a.m10398o(drawableMutate, this.f1072b);
                }
                if (this.f1075e) {
                    C3403a.m10399p(drawableMutate, this.f1073c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1071a.getDrawableState());
                }
                this.f1071a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    int m782b(int i4) {
        return i4;
    }

    /* renamed from: c */
    ColorStateList m783c() {
        return this.f1072b;
    }

    /* renamed from: d */
    PorterDuff.Mode m784d() {
        return this.f1073c;
    }

    /* renamed from: e */
    void m785e(AttributeSet attributeSet, int i4) {
        boolean z3;
        int iM829n;
        int iM829n2;
        Context context = this.f1071a.getContext();
        int[] iArr = C1047j.f6018T0;
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, iArr, i4, 0);
        CompoundButton compoundButton = this.f1071a;
        C0358u.m2047o0(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0214g0M815v.m833r(), i4, 0);
        try {
            int i5 = C1047j.f6028V0;
            if (!c0214g0M815v.m834s(i5) || (iM829n2 = c0214g0M815v.m829n(i5, 0)) == 0) {
                z3 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1071a;
                    compoundButton2.setButtonDrawable(C2443a.m8169d(compoundButton2.getContext(), iM829n2));
                    z3 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z3) {
                int i6 = C1047j.f6023U0;
                if (c0214g0M815v.m834s(i6) && (iM829n = c0214g0M815v.m829n(i6, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1071a;
                    compoundButton3.setButtonDrawable(C2443a.m8169d(compoundButton3.getContext(), iM829n));
                }
            }
            int i7 = C1047j.f6033W0;
            if (c0214g0M815v.m834s(i7)) {
                C0369c.m2175c(this.f1071a, c0214g0M815v.m818c(i7));
            }
            int i8 = C1047j.f6038X0;
            if (c0214g0M815v.m834s(i8)) {
                C0369c.m2176d(this.f1071a, C0231q.m983d(c0214g0M815v.m826k(i8, -1), null));
            }
        } finally {
            c0214g0M815v.m835w();
        }
    }

    /* renamed from: f */
    void m786f() {
        if (this.f1076f) {
            this.f1076f = false;
        } else {
            this.f1076f = true;
            m781a();
        }
    }

    /* renamed from: g */
    void m787g(ColorStateList colorStateList) {
        this.f1072b = colorStateList;
        this.f1074d = true;
        m781a();
    }

    /* renamed from: h */
    void m788h(PorterDuff.Mode mode) {
        this.f1073c = mode;
        this.f1075e = true;
        m781a();
    }
}
