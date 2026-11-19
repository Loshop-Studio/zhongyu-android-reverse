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
import com.xuexiang.xui.utils.AbstractC6801g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6895f extends LayerDrawable implements InterfaceC6909t, InterfaceC6910u, InterfaceC6911v, InterfaceC6914y {

    /* renamed from: a */
    public float f7959a;

    /* renamed from: b */
    public InterfaceC6909t f7960b;

    /* renamed from: c */
    public InterfaceC6909t f7961c;

    /* renamed from: d */
    public InterfaceC6909t f7962d;

    public AbstractC6895f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f7959a = AbstractC6801g.m6485r(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f7960b = (InterfaceC6909t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f7961c = (InterfaceC6909t) getDrawable(1);
        setId(2, R.id.progress);
        this.f7962d = (InterfaceC6909t) getDrawable(2);
        setTint(AbstractC6801g.m6471d(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: a */
    public boolean mo7012a() {
        return ((InterfaceC6911v) this.f7960b).mo7012a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6911v
    /* renamed from: b */
    public void mo7013b(boolean z9) {
        if (((InterfaceC6911v) this.f7960b).mo7012a() != z9) {
            ((InterfaceC6911v) this.f7960b).mo7013b(z9);
            ((InterfaceC6911v) this.f7961c).mo7013b(!z9);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6909t
    /* renamed from: c */
    public void mo7003c(boolean z9) {
        this.f7960b.mo7003c(z9);
        this.f7961c.mo7003c(z9);
        this.f7962d.mo7003c(z9);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6909t
    /* renamed from: d */
    public boolean mo7004d() {
        return this.f7960b.mo7004d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTint(int i9) {
        int alphaComponent = ColorUtils.setAlphaComponent(i9, Math.round(Color.alpha(i9) * this.f7959a));
        ((InterfaceC6914y) this.f7960b).setTint(alphaComponent);
        ((InterfaceC6914y) this.f7961c).setTint(alphaComponent);
        ((InterfaceC6914y) this.f7962d).setTint(i9);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f7959a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC6914y) this.f7960b).setTintList(colorStateListWithAlpha);
        ((InterfaceC6914y) this.f7961c).setTintList(colorStateListWithAlpha);
        ((InterfaceC6914y) this.f7962d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC6914y) this.f7960b).setTintMode(mode);
        ((InterfaceC6914y) this.f7961c).setTintMode(mode);
        ((InterfaceC6914y) this.f7962d).setTintMode(mode);
    }
}
