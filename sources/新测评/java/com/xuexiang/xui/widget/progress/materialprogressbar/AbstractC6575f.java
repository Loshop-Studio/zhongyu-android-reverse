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
import com.xuexiang.xui.utils.AbstractC6482g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6575f extends LayerDrawable implements InterfaceC6589t, InterfaceC6590u, InterfaceC6591v, InterfaceC6594y {

    /* renamed from: a */
    public float f6701a;

    /* renamed from: b */
    public InterfaceC6589t f6702b;

    /* renamed from: c */
    public InterfaceC6589t f6703c;

    /* renamed from: d */
    public InterfaceC6589t f6704d;

    public AbstractC6575f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f6701a = AbstractC6482g.m5388s(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f6702b = (InterfaceC6589t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f6703c = (InterfaceC6589t) getDrawable(1);
        setId(2, R.id.progress);
        this.f6704d = (InterfaceC6589t) getDrawable(2);
        setTint(AbstractC6482g.m5373d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: a */
    public boolean mo5914a() {
        return ((InterfaceC6591v) this.f6702b).mo5914a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6591v
    /* renamed from: b */
    public void mo5915b(boolean z9) {
        if (((InterfaceC6591v) this.f6702b).mo5914a() != z9) {
            ((InterfaceC6591v) this.f6702b).mo5915b(z9);
            ((InterfaceC6591v) this.f6703c).mo5915b(!z9);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6589t
    /* renamed from: c */
    public void mo5905c(boolean z9) {
        this.f6702b.mo5905c(z9);
        this.f6703c.mo5905c(z9);
        this.f6704d.mo5905c(z9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6589t
    /* renamed from: d */
    public boolean mo5906d() {
        return this.f6702b.mo5906d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTint(int i10) {
        int alphaComponent = ColorUtils.setAlphaComponent(i10, Math.round(Color.alpha(i10) * this.f6701a));
        ((InterfaceC6594y) this.f6702b).setTint(alphaComponent);
        ((InterfaceC6594y) this.f6703c).setTint(alphaComponent);
        ((InterfaceC6594y) this.f6704d).setTint(i10);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f6701a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC6594y) this.f6702b).setTintList(colorStateListWithAlpha);
        ((InterfaceC6594y) this.f6703c).setTintList(colorStateListWithAlpha);
        ((InterfaceC6594y) this.f6704d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC6594y) this.f6702b).setTintMode(mode);
        ((InterfaceC6594y) this.f6703c).setTintMode(mode);
        ((InterfaceC6594y) this.f6704d).setTintMode(mode);
    }
}
