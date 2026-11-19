package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0358u;
import androidx.core.widget.C0373g;
import p015c.C1047j;
import p073d.C2443a;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public class C0215h {

    /* renamed from: a */
    private final ImageView f1094a;

    /* renamed from: b */
    private C0210e0 f1095b;

    /* renamed from: c */
    private C0210e0 f1096c;

    /* renamed from: d */
    private C0210e0 f1097d;

    public C0215h(ImageView imageView) {
        this.f1094a = imageView;
    }

    /* renamed from: a */
    private boolean m836a(Drawable drawable) {
        if (this.f1097d == null) {
            this.f1097d = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1097d;
        c0210e0.m789a();
        ColorStateList colorStateListM2178a = C0373g.m2178a(this.f1094a);
        if (colorStateListM2178a != null) {
            c0210e0.f1080d = true;
            c0210e0.f1077a = colorStateListM2178a;
        }
        PorterDuff.Mode modeM2179b = C0373g.m2179b(this.f1094a);
        if (modeM2179b != null) {
            c0210e0.f1079c = true;
            c0210e0.f1078b = modeM2179b;
        }
        if (!c0210e0.f1080d && !c0210e0.f1079c) {
            return false;
        }
        C0211f.m794i(drawable, c0210e0, this.f1094a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m837j() {
        return this.f1095b != null;
    }

    /* renamed from: b */
    void m838b() {
        Drawable drawable = this.f1094a.getDrawable();
        if (drawable != null) {
            C0231q.m981b(drawable);
        }
        if (drawable != null) {
            if (m837j() && m836a(drawable)) {
                return;
            }
            C0210e0 c0210e0 = this.f1096c;
            if (c0210e0 != null) {
                C0211f.m794i(drawable, c0210e0, this.f1094a.getDrawableState());
                return;
            }
            C0210e0 c0210e02 = this.f1095b;
            if (c0210e02 != null) {
                C0211f.m794i(drawable, c0210e02, this.f1094a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    ColorStateList m839c() {
        C0210e0 c0210e0 = this.f1096c;
        if (c0210e0 != null) {
            return c0210e0.f1077a;
        }
        return null;
    }

    /* renamed from: d */
    PorterDuff.Mode m840d() {
        C0210e0 c0210e0 = this.f1096c;
        if (c0210e0 != null) {
            return c0210e0.f1078b;
        }
        return null;
    }

    /* renamed from: e */
    boolean m841e() {
        return !(this.f1094a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m842f(AttributeSet attributeSet, int i4) {
        int iM829n;
        Context context = this.f1094a.getContext();
        int[] iArr = C1047j.f6017T;
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, iArr, i4, 0);
        ImageView imageView = this.f1094a;
        C0358u.m2047o0(imageView, imageView.getContext(), iArr, attributeSet, c0214g0M815v.m833r(), i4, 0);
        try {
            Drawable drawable = this.f1094a.getDrawable();
            if (drawable == null && (iM829n = c0214g0M815v.m829n(C1047j.f6022U, -1)) != -1 && (drawable = C2443a.m8169d(this.f1094a.getContext(), iM829n)) != null) {
                this.f1094a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0231q.m981b(drawable);
            }
            int i5 = C1047j.f6027V;
            if (c0214g0M815v.m834s(i5)) {
                C0373g.m2180c(this.f1094a, c0214g0M815v.m818c(i5));
            }
            int i6 = C1047j.f6032W;
            if (c0214g0M815v.m834s(i6)) {
                C0373g.m2181d(this.f1094a, C0231q.m983d(c0214g0M815v.m826k(i6, -1), null));
            }
        } finally {
            c0214g0M815v.m835w();
        }
    }

    /* renamed from: g */
    public void m843g(int i4) {
        if (i4 != 0) {
            Drawable drawableM8169d = C2443a.m8169d(this.f1094a.getContext(), i4);
            if (drawableM8169d != null) {
                C0231q.m981b(drawableM8169d);
            }
            this.f1094a.setImageDrawable(drawableM8169d);
        } else {
            this.f1094a.setImageDrawable(null);
        }
        m838b();
    }

    /* renamed from: h */
    void m844h(ColorStateList colorStateList) {
        if (this.f1096c == null) {
            this.f1096c = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1096c;
        c0210e0.f1077a = colorStateList;
        c0210e0.f1080d = true;
        m838b();
    }

    /* renamed from: i */
    void m845i(PorterDuff.Mode mode) {
        if (this.f1096c == null) {
            this.f1096c = new C0210e0();
        }
        C0210e0 c0210e0 = this.f1096c;
        c0210e0.f1078b = mode;
        c0210e0.f1079c = true;
        m838b();
    }
}
