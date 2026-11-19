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
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6877g;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6981f extends LayerDrawable implements InterfaceC6995t, InterfaceC6996u, InterfaceC6997v, InterfaceC7000y {

    /* renamed from: a */
    public float f8123a;

    /* renamed from: b */
    public InterfaceC6995t f8124b;

    /* renamed from: c */
    public InterfaceC6995t f8125c;

    /* renamed from: d */
    public InterfaceC6995t f8126d;

    public AbstractC6981f(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f8123a = AbstractC6877g.m6485s(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f8124b = (InterfaceC6995t) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f8125c = (InterfaceC6995t) getDrawable(1);
        setId(2, R.id.progress);
        this.f8126d = (InterfaceC6995t) getDrawable(2);
        setTint(AbstractC6877g.m6470d(R$attr.colorControlActivated, -16777216, context));
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: a */
    public boolean mo7104a() {
        return ((InterfaceC6997v) this.f8124b).mo7104a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6997v
    /* renamed from: b */
    public void mo7105b(boolean z10) {
        if (((InterfaceC6997v) this.f8124b).mo7104a() != z10) {
            ((InterfaceC6997v) this.f8124b).mo7105b(z10);
            ((InterfaceC6997v) this.f8125c).mo7105b(!z10);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6995t
    /* renamed from: c */
    public void mo7095c(boolean z10) {
        this.f8124b.mo7095c(z10);
        this.f8125c.mo7095c(z10);
        this.f8126d.mo7095c(z10);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6995t
    /* renamed from: d */
    public boolean mo7096d() {
        return this.f8124b.mo7096d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTint(int i10) {
        int alphaComponent = ColorUtils.setAlphaComponent(i10, Math.round(Color.alpha(i10) * this.f8123a));
        ((InterfaceC7000y) this.f8124b).setTint(alphaComponent);
        ((InterfaceC7000y) this.f8125c).setTint(alphaComponent);
        ((InterfaceC7000y) this.f8126d).setTint(i10);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f8123a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC7000y) this.f8124b).setTintList(colorStateListWithAlpha);
        ((InterfaceC7000y) this.f8125c).setTintList(colorStateListWithAlpha);
        ((InterfaceC7000y) this.f8126d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC7000y) this.f8124b).setTintMode(mode);
        ((InterfaceC7000y) this.f8125c).setTintMode(mode);
        ((InterfaceC7000y) this.f8126d).setTintMode(mode);
    }
}
