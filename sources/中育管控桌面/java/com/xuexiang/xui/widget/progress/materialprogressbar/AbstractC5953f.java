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
import com.xuexiang.xui.utils.AbstractC5859g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes3.dex */
public abstract class AbstractC5953f extends LayerDrawable implements InterfaceC5967t, InterfaceC5968u, InterfaceC5969v, InterfaceC5972y {

    /* renamed from: a */
    public float f5410a;

    /* renamed from: b */
    public InterfaceC5967t f5411b;

    /* renamed from: c */
    public InterfaceC5967t f5412c;

    /* renamed from: d */
    public InterfaceC5967t f5413d;

    public AbstractC5953f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f5410a = AbstractC5859g.m4393s(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f5411b = (InterfaceC5967t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f5412c = (InterfaceC5967t) getDrawable(1);
        setId(2, R.id.progress);
        this.f5413d = (InterfaceC5967t) getDrawable(2);
        setTint(AbstractC5859g.m4378d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: a */
    public boolean mo4923a() {
        return ((InterfaceC5969v) this.f5411b).mo4923a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5969v
    /* renamed from: b */
    public void mo4924b(boolean z6) {
        if (((InterfaceC5969v) this.f5411b).mo4923a() != z6) {
            ((InterfaceC5969v) this.f5411b).mo4924b(z6);
            ((InterfaceC5969v) this.f5412c).mo4924b(!z6);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5967t
    /* renamed from: c */
    public void mo4914c(boolean z6) {
        this.f5411b.mo4914c(z6);
        this.f5412c.mo4914c(z6);
        this.f5413d.mo4914c(z6);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5967t
    /* renamed from: d */
    public boolean mo4915d() {
        return this.f5411b.mo4915d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTint(int i6) {
        int alphaComponent = ColorUtils.setAlphaComponent(i6, Math.round(Color.alpha(i6) * this.f5410a));
        ((InterfaceC5972y) this.f5411b).setTint(alphaComponent);
        ((InterfaceC5972y) this.f5412c).setTint(alphaComponent);
        ((InterfaceC5972y) this.f5413d).setTint(i6);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f5410a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC5972y) this.f5411b).setTintList(colorStateListWithAlpha);
        ((InterfaceC5972y) this.f5412c).setTintList(colorStateListWithAlpha);
        ((InterfaceC5972y) this.f5413d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC5972y) this.f5411b).setTintMode(mode);
        ((InterfaceC5972y) this.f5412c).setTintMode(mode);
        ((InterfaceC5972y) this.f5413d).setTintMode(mode);
    }
}
