package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.InvocationTargetException;
import p015c.C1047j;
import p156u.C3403a;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
class C0221k extends C0217i {

    /* renamed from: d */
    private final SeekBar f1137d;

    /* renamed from: e */
    private Drawable f1138e;

    /* renamed from: f */
    private ColorStateList f1139f;

    /* renamed from: g */
    private PorterDuff.Mode f1140g;

    /* renamed from: h */
    private boolean f1141h;

    /* renamed from: i */
    private boolean f1142i;

    C0221k(SeekBar seekBar) {
        super(seekBar);
        this.f1139f = null;
        this.f1140g = null;
        this.f1141h = false;
        this.f1142i = false;
        this.f1137d = seekBar;
    }

    /* renamed from: f */
    private void m902f() {
        Drawable drawable = this.f1138e;
        if (drawable != null) {
            if (this.f1141h || this.f1142i) {
                Drawable drawableM10401r = C3403a.m10401r(drawable.mutate());
                this.f1138e = drawableM10401r;
                if (this.f1141h) {
                    C3403a.m10398o(drawableM10401r, this.f1139f);
                }
                if (this.f1142i) {
                    C3403a.m10399p(this.f1138e, this.f1140g);
                }
                if (this.f1138e.isStateful()) {
                    this.f1138e.setState(this.f1137d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0217i
    /* renamed from: c */
    void mo885c(AttributeSet attributeSet, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.mo885c(attributeSet, i4);
        Context context = this.f1137d.getContext();
        int[] iArr = C1047j.f6037X;
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, iArr, i4, 0);
        SeekBar seekBar = this.f1137d;
        C0358u.m2047o0(seekBar, seekBar.getContext(), iArr, attributeSet, c0214g0M815v.m833r(), i4, 0);
        Drawable drawableM823h = c0214g0M815v.m823h(C1047j.f6042Y);
        if (drawableM823h != null) {
            this.f1137d.setThumb(drawableM823h);
        }
        m906j(c0214g0M815v.m822g(C1047j.f6047Z));
        int i5 = C1047j.f6059b0;
        if (c0214g0M815v.m834s(i5)) {
            this.f1140g = C0231q.m983d(c0214g0M815v.m826k(i5, -1), this.f1140g);
            this.f1142i = true;
        }
        int i6 = C1047j.f6053a0;
        if (c0214g0M815v.m834s(i6)) {
            this.f1139f = c0214g0M815v.m818c(i6);
            this.f1141h = true;
        }
        c0214g0M815v.m835w();
        m902f();
    }

    /* renamed from: g */
    void m903g(Canvas canvas) {
        if (this.f1138e != null) {
            int max = this.f1137d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1138e.getIntrinsicWidth();
                int intrinsicHeight = this.f1138e.getIntrinsicHeight();
                int i4 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i5 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1138e.setBounds(-i4, -i5, i4, i5);
                float width = ((this.f1137d.getWidth() - this.f1137d.getPaddingLeft()) - this.f1137d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1137d.getPaddingLeft(), this.f1137d.getHeight() / 2);
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f1138e.draw(canvas);
                    canvas.translate(width, IGoodView.DEFAULT_TO_ALPHA);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* renamed from: h */
    void m904h() {
        Drawable drawable = this.f1138e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1137d.getDrawableState())) {
            this.f1137d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    void m905i() {
        Drawable drawable = this.f1138e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m906j(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f1138e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1138e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1137d);
            C3403a.m10396m(drawable, C0358u.m1978A(this.f1137d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1137d.getDrawableState());
            }
            m902f();
        }
        this.f1137d.invalidate();
    }
}
