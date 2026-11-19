package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f3406a;

    /* renamed from: b */
    public GravityEnum f3407b;

    /* renamed from: c */
    public int f3408c;

    /* renamed from: d */
    public Drawable f3409d;

    /* renamed from: e */
    public Drawable f3410e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3406a = false;
        m4259a(context);
    }

    /* renamed from: a */
    public final void m4259a(Context context) {
        this.f3408c = AbstractC3531f.m4074g(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f3407b = GravityEnum.END;
    }

    /* renamed from: b */
    public void m4260b(boolean z3, boolean z4) {
        if (this.f3406a != z3 || z4) {
            setGravity(z3 ? this.f3407b.m4257a() | 16 : 17);
            setTextAlignment(z3 ? this.f3407b.m4258b() : 4);
            AbstractC3531f.m4078k(this, z3 ? this.f3409d : this.f3410e);
            if (z3) {
                setPadding(this.f3408c, getPaddingTop(), this.f3408c, getPaddingBottom());
            }
            this.f3406a = z3;
        }
    }

    public void setAllCapsCompat(boolean z3) {
        setAllCaps(z3);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f3410e = drawable;
        if (this.f3406a) {
            return;
        }
        m4260b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f3407b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f3409d = drawable;
        if (this.f3406a) {
            m4260b(true, true);
        }
    }
}
