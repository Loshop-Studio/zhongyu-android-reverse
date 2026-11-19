package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f7459a;

    /* renamed from: b */
    public GravityEnum f7460b;

    /* renamed from: c */
    public int f7461c;

    /* renamed from: d */
    public Drawable f7462d;

    /* renamed from: e */
    public Drawable f7463e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7459a = false;
        m6721a(context);
    }

    /* renamed from: a */
    public final void m6721a(Context context) {
        this.f7461c = AbstractC6801g.m6482o(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f7460b = GravityEnum.END;
    }

    /* renamed from: b */
    public void m6722b(boolean z9, boolean z10) {
        if (this.f7459a != z9 || z10) {
            setGravity(z9 ? this.f7460b.m6667a() | 16 : 17);
            setTextAlignment(z9 ? this.f7460b.m6668c() : 4);
            AbstractC6801g.m6488u(this, z9 ? this.f7462d : this.f7463e);
            if (z9) {
                setPadding(this.f7461c, getPaddingTop(), this.f7461c, getPaddingBottom());
            }
            this.f7459a = z9;
        }
    }

    public void setAllCapsCompat(boolean z9) {
        setAllCaps(z9);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f7463e = drawable;
        if (this.f7459a) {
            return;
        }
        m6722b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f7460b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f7462d = drawable;
        if (this.f7459a) {
            m6722b(true, true);
        }
    }
}
