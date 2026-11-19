package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import kotlin.collections.AbstractC5806u;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MDButton extends TextView {

    /* renamed from: a */
    public boolean f4257a;

    /* renamed from: b */
    public GravityEnum f4258b;

    /* renamed from: c */
    public final int f4259c;

    /* renamed from: d */
    public Drawable f4260d;

    /* renamed from: e */
    public Drawable f4261e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4257a = false;
        this.f4259c = AbstractC5806u.m5253G(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f4258b = GravityEnum.END;
    }

    /* renamed from: a */
    public final void m3477a(boolean z8, boolean z9) {
        if (this.f4257a != z8 || z9) {
            setGravity(z8 ? this.f4258b.getGravityInt() | 16 : 17);
            setTextAlignment(z8 ? this.f4258b.getTextAlignment() : 4);
            setBackground(z8 ? this.f4260d : this.f4261e);
            if (z8) {
                setPadding(this.f4259c, getPaddingTop(), this.f4259c, getPaddingBottom());
            }
            this.f4257a = z8;
        }
    }

    public void setAllCapsCompat(boolean z8) {
        setAllCaps(z8);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f4261e = drawable;
        if (this.f4257a) {
            return;
        }
        m3477a(false, true);
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f4258b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f4260d = drawable;
        if (this.f4257a) {
            m3477a(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4257a = false;
        this.f4259c = AbstractC5806u.m5253G(context, R$attr.md_dialog_frame_margin, R$dimen.default_md_dialog_frame_margin);
        this.f4258b = GravityEnum.END;
    }
}
