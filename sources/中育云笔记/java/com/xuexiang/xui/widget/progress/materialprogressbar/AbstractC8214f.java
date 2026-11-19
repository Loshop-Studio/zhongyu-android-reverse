package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC8041g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8214f extends LayerDrawable implements InterfaceC8228t, InterfaceC8229u, InterfaceC8230v, InterfaceC8233y {

    /* renamed from: c */
    public float f16835c;

    /* renamed from: d */
    public InterfaceC8228t f16836d;

    /* renamed from: e */
    public InterfaceC8228t f16837e;

    /* renamed from: f */
    public InterfaceC8228t f16838f;

    public AbstractC8214f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f16835c = AbstractC8041g.m12224k(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f16836d = (InterfaceC8228t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f16837e = (InterfaceC8228t) getDrawable(1);
        setId(2, R.id.progress);
        this.f16838f = (InterfaceC8228t) getDrawable(2);
        setTint(AbstractC8041g.m12214a(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: a */
    public boolean mo13129a() {
        return ((InterfaceC8230v) this.f16836d).mo13129a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8230v
    /* renamed from: b */
    public void mo13130b(boolean z10) {
        if (((InterfaceC8230v) this.f16836d).mo13129a() != z10) {
            ((InterfaceC8230v) this.f16836d).mo13130b(z10);
            ((InterfaceC8230v) this.f16837e).mo13130b(!z10);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8228t
    /* renamed from: c */
    public void mo13120c(boolean z10) {
        this.f16836d.mo13120c(z10);
        this.f16837e.mo13120c(z10);
        this.f16838f.mo13120c(z10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8228t
    /* renamed from: d */
    public boolean mo13121d() {
        return this.f16836d.mo13121d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTint(int i10) {
        int alphaComponent = ColorUtils.setAlphaComponent(i10, Math.round(Color.alpha(i10) * this.f16835c));
        ((InterfaceC8233y) this.f16836d).setTint(alphaComponent);
        ((InterfaceC8233y) this.f16837e).setTint(alphaComponent);
        ((InterfaceC8233y) this.f16838f).setTint(i10);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f16835c * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC8233y) this.f16836d).setTintList(colorStateListWithAlpha);
        ((InterfaceC8233y) this.f16837e).setTintList(colorStateListWithAlpha);
        ((InterfaceC8233y) this.f16838f).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC8233y) this.f16836d).setTintMode(mode);
        ((InterfaceC8233y) this.f16837e).setTintMode(mode);
        ((InterfaceC8233y) this.f16838f).setTintMode(mode);
    }
}
