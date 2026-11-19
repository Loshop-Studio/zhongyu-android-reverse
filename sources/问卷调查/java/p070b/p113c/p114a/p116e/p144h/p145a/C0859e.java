package p070b.p113c.p114a.p116e.p144h.p145a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p031h.p035d.C0202a;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x;

/* renamed from: b.c.a.e.h.a.e */
/* loaded from: classes.dex */
public class C0859e<ProgressDrawableType extends InterfaceC0873s & InterfaceC0875u & InterfaceC0878x, BackgroundDrawableType extends InterfaceC0873s & InterfaceC0875u & InterfaceC0878x> extends LayerDrawable implements InterfaceC0873s, InterfaceC0874t, InterfaceC0875u, InterfaceC0878x {

    /* renamed from: b */
    public float f4655b;

    /* renamed from: c */
    public BackgroundDrawableType f4656c;

    /* renamed from: d */
    public ProgressDrawableType f4657d;

    /* renamed from: e */
    public ProgressDrawableType f4658e;

    public C0859e(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f4655b = C0787a.m2464D(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f4656c = (BackgroundDrawableType) ((InterfaceC0873s) getDrawable(0));
        setId(1, R.id.secondaryProgress);
        this.f4657d = (ProgressDrawableType) ((InterfaceC0873s) getDrawable(1));
        setId(2, R.id.progress);
        this.f4658e = (ProgressDrawableType) ((InterfaceC0873s) getDrawable(2));
        setTint(C0787a.m2478l(C1088R.attr.colorControlActivated, -16777216, context));
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f4656c.mo2567a();
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f4656c.mo2567a() != z) {
            this.f4656c.mo2568b(z);
            this.f4657d.mo2568b(!z);
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s
    /* renamed from: c */
    public void mo2563c(boolean z) {
        this.f4656c.mo2563c(z);
        this.f4657d.mo2563c(z);
        this.f4658e.mo2563c(z);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s
    /* renamed from: d */
    public boolean mo2564d() {
        return this.f4656c.mo2564d();
    }

    @Override // android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTint(int i) {
        int iM757c = C0202a.m757c(i, Math.round(Color.alpha(i) * this.f4655b));
        this.f4656c.setTint(iM757c);
        this.f4657d.setTint(iM757c);
        this.f4658e.setTint(i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f4655b * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        this.f4656c.setTintList(colorStateListWithAlpha);
        this.f4657d.setTintList(colorStateListWithAlpha);
        this.f4658e.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4656c.setTintMode(mode);
        this.f4657d.setTintMode(mode);
        this.f4658e.setTintMode(mode);
    }
}
