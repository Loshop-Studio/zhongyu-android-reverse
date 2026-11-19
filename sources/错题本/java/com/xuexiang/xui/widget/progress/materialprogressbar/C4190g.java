package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import kotlin.collections.AbstractC5806u;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.g */
/* loaded from: classes3.dex */
public final class C4190g extends LayerDrawable implements InterfaceC4201r, InterfaceC4203t, InterfaceC4204u, InterfaceC4206w {

    /* renamed from: a */
    public final float f4747a;

    /* renamed from: b */
    public final InterfaceC4201r f4748b;

    /* renamed from: c */
    public final InterfaceC4201r f4749c;

    /* renamed from: d */
    public final InterfaceC4201r f4750d;

    public C4190g(Drawable[] drawableArr, Context context) {
        super(drawableArr);
        this.f4747a = AbstractC5806u.m5254H(context, R.attr.disabledAlpha, 0.0f);
        setId(0, R.id.background);
        this.f4748b = (InterfaceC4201r) getDrawable(0);
        setId(1, R.id.secondaryProgress);
        this.f4749c = (InterfaceC4201r) getDrawable(1);
        setId(2, R.id.progress);
        this.f4750d = (InterfaceC4201r) getDrawable(2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R$attr.colorControlActivated});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            typedArrayObtainStyledAttributes.recycle();
            setTint(color);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: a */
    public final boolean mo3559a() {
        return ((InterfaceC4204u) this.f4748b).mo3559a();
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4204u
    /* renamed from: b */
    public final void mo3560b(boolean z8) {
        InterfaceC4201r interfaceC4201r = this.f4748b;
        if (((InterfaceC4204u) interfaceC4201r).mo3559a() != z8) {
            ((InterfaceC4204u) interfaceC4201r).mo3560b(z8);
            ((InterfaceC4204u) this.f4749c).mo3560b(!z8);
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4201r
    /* renamed from: c */
    public final void mo3553c(boolean z8) {
        this.f4748b.mo3553c(z8);
        this.f4749c.mo3553c(z8);
        this.f4750d.mo3553c(z8);
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4201r
    /* renamed from: d */
    public final boolean mo3554d() {
        return this.f4748b.mo3554d();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTint(int i) {
        int alphaComponent = ColorUtils.setAlphaComponent(i, Math.round(Color.alpha(i) * this.f4747a));
        ((InterfaceC4206w) this.f4748b).setTint(alphaComponent);
        ((InterfaceC4206w) this.f4749c).setTint(alphaComponent);
        ((InterfaceC4206w) this.f4750d).setTint(i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTintList(ColorStateList colorStateList) {
        ColorStateList colorStateListWithAlpha;
        if (colorStateList != null) {
            if (!colorStateList.isOpaque()) {
                Log.w(getClass().getSimpleName(), "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded");
            }
            colorStateListWithAlpha = colorStateList.withAlpha(Math.round(this.f4747a * 255.0f));
        } else {
            colorStateListWithAlpha = null;
        }
        ((InterfaceC4206w) this.f4748b).setTintList(colorStateListWithAlpha);
        ((InterfaceC4206w) this.f4749c).setTintList(colorStateListWithAlpha);
        ((InterfaceC4206w) this.f4750d).setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTintMode(PorterDuff.Mode mode) {
        ((InterfaceC4206w) this.f4748b).setTintMode(mode);
        ((InterfaceC4206w) this.f4749c).setTintMode(mode);
        ((InterfaceC4206w) this.f4750d).setTintMode(mode);
    }
}
