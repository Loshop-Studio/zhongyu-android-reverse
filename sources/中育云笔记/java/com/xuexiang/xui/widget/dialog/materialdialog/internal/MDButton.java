package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class MDButton extends TextView {

    /* renamed from: c */
    public boolean f15837c;

    /* renamed from: d */
    public GravityEnum f15838d;

    /* renamed from: e */
    public int f15839e;

    /* renamed from: f */
    public Drawable f15840f;

    /* renamed from: g */
    public Drawable f15841g;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15837c = false;
        m12538a(context);
    }

    /* renamed from: a */
    public final void m12538a(Context context) {
        this.f15839e = AbstractC8041g.m12220g(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f15838d = GravityEnum.END;
    }

    /* renamed from: b */
    public void m12539b(boolean z10, boolean z11) {
        if (this.f15837c != z10 || z11) {
            setGravity(z10 ? this.f15838d.m12536a() | 16 : 17);
            setTextAlignment(z10 ? this.f15838d.m12537c() : 4);
            AbstractC8041g.m12226m(this, z10 ? this.f15840f : this.f15841g);
            if (z10) {
                setPadding(this.f15839e, getPaddingTop(), this.f15839e, getPaddingBottom());
            }
            this.f15837c = z10;
        }
    }

    public void setAllCapsCompat(boolean z10) {
        setAllCaps(z10);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f15841g = drawable;
        if (this.f15837c) {
            return;
        }
        m12539b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f15838d = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f15840f = drawable;
        if (this.f15837c) {
            m12539b(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15837c = false;
        m12538a(context);
    }
}
