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
import com.xuexiang.xui.utils.AbstractC3531f;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3614f extends LayerDrawable implements InterfaceC3628t, InterfaceC3629u, InterfaceC3630v, InterfaceC3633y {

    /* renamed from: a */
    public float f3889a;

    /* renamed from: b */
    public InterfaceC3628t f3890b;

    /* renamed from: c */
    public InterfaceC3628t f3891c;

    /* renamed from: d */
    public InterfaceC3628t f3892d;

    public AbstractC3614f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f3889a = AbstractC3531f.m4077j(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f3890b = (InterfaceC3628t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f3891c = (InterfaceC3628t) getDrawable(1);
        setId(2, R.id.progress);
        this.f3892d = (InterfaceC3628t) getDrawable(2);
        setTint(AbstractC3531f.m4068a(R$attr.colorControlActivated, ViewCompat.MEASURED_STATE_MASK, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: a */
    public boolean mo4545a() {
        return ((InterfaceC3630v) this.f3890b).mo4545a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3630v
    /* renamed from: b */
    public void mo4546b(boolean z3) {
        if (((InterfaceC3630v) this.f3890b).mo4545a() != z3) {
            ((InterfaceC3630v) this.f3890b).mo4546b(z3);
            ((InterfaceC3630v) this.f3891c).mo4546b(!z3);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3628t
    /* renamed from: c */
    public boolean mo4536c() {
        return this.f3890b.mo4536c();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3628t
    /* renamed from: d */
    public void mo4537d(boolean z3) {
        this.f3890b.mo4537d(z3);
        this.f3891c.mo4537d(z3);
        this.f3892d.mo4537d(z3);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTint(int i4) {
        int alphaComponent = ColorUtils.setAlphaComponent(i4, Math.round(Color.alpha(i4) * this.f3889a));
        ((InterfaceC3633y) this.f3890b).setTint(alphaComponent);
        ((InterfaceC3633y) this.f3891c).setTint(alphaComponent);
        ((InterfaceC3633y) this.f3892d).setTint(i4);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f3889a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC3633y) this.f3890b).setTintList(colorStateListWithAlpha);
        ((InterfaceC3633y) this.f3891c).setTintList(colorStateListWithAlpha);
        ((InterfaceC3633y) this.f3892d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC3633y) this.f3890b).setTintMode(mode);
        ((InterfaceC3633y) this.f3891c).setTintMode(mode);
        ((InterfaceC3633y) this.f3892d).setTintMode(mode);
    }
}
