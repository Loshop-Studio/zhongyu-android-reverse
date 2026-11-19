package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f4926a;

    /* renamed from: b */
    public GravityEnum f4927b;

    /* renamed from: c */
    public int f4928c;

    /* renamed from: d */
    public Drawable f4929d;

    /* renamed from: e */
    public Drawable f4930e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4926a = false;
        m4635a(context);
    }

    /* renamed from: a */
    public final void m4635a(Context context) {
        this.f4928c = AbstractC5859g.m4390p(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f4927b = GravityEnum.END;
    }

    /* renamed from: b */
    public void m4636b(boolean z6, boolean z7) {
        if (this.f4926a != z6 || z7) {
            setGravity(z6 ? this.f4927b.m4583a() | 16 : 17);
            setTextAlignment(z6 ? this.f4927b.m4584b() : 4);
            AbstractC5859g.m4396v(this, z6 ? this.f4929d : this.f4930e);
            if (z6) {
                setPadding(this.f4928c, getPaddingTop(), this.f4928c, getPaddingBottom());
            }
            this.f4926a = z6;
        }
    }

    public void setAllCapsCompat(boolean z6) {
        setAllCaps(z6);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f4930e = drawable;
        if (this.f4926a) {
            return;
        }
        m4636b(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f4927b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f4929d = drawable;
        if (this.f4926a) {
            m4636b(true, true);
        }
    }
}
