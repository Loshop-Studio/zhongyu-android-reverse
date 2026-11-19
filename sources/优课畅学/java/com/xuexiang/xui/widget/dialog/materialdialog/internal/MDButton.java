package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f7588a;

    /* renamed from: b */
    public GravityEnum f7589b;

    /* renamed from: c */
    public int f7590c;

    /* renamed from: d */
    public Drawable f7591d;

    /* renamed from: e */
    public Drawable f7592e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7588a = false;
        m6779a(context);
    }

    /* renamed from: a */
    public final void m6779a(Context context) {
        this.f7590c = AbstractC6877g.m6482p(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f7589b = GravityEnum.END;
    }

    /* renamed from: b */
    public void m6780b(boolean z10, boolean z11) {
        if (this.f7588a != z10 || z11) {
            setGravity(z10 ? this.f7589b.m6706a() | 16 : 17);
            setTextAlignment(z10 ? this.f7589b.m6707b() : 4);
            AbstractC6877g.m6489w(this, z10 ? this.f7591d : this.f7592e);
            if (z10) {
                setPadding(this.f7590c, getPaddingTop(), this.f7590c, getPaddingBottom());
            }
            this.f7588a = z10;
        }
    }

    public void setAllCapsCompat(boolean z10) {
        setAllCaps(z10);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f7592e = drawable;
        if (this.f7588a) {
            return;
        }
        m6780b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f7589b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f7591d = drawable;
        if (this.f7588a) {
            m6780b(true, true);
        }
    }
}
