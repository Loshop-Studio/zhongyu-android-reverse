package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f6201a;

    /* renamed from: b */
    public GravityEnum f6202b;

    /* renamed from: c */
    public int f6203c;

    /* renamed from: d */
    public Drawable f6204d;

    /* renamed from: e */
    public Drawable f6205e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6201a = false;
        m5616a(context);
    }

    /* renamed from: a */
    public final void m5616a(Context context) {
        this.f6203c = AbstractC6482g.m5385p(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f6202b = GravityEnum.END;
    }

    /* renamed from: b */
    public void m5617b(boolean z9, boolean z10) {
        if (this.f6201a != z9 || z10) {
            setGravity(z9 ? this.f6202b.m5573a() | 16 : 17);
            setTextAlignment(z9 ? this.f6202b.m5574f() : 4);
            AbstractC6482g.m5391v(this, z9 ? this.f6204d : this.f6205e);
            if (z9) {
                setPadding(this.f6203c, getPaddingTop(), this.f6203c, getPaddingBottom());
            }
            this.f6201a = z9;
        }
    }

    public void setAllCapsCompat(boolean z9) {
        setAllCaps(z9);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f6205e = drawable;
        if (this.f6201a) {
            return;
        }
        m5617b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f6202b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f6204d = drawable;
        if (this.f6201a) {
            m5617b(true, true);
        }
    }
}
