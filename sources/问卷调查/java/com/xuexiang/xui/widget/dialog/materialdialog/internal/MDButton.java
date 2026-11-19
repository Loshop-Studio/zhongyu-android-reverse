package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.p116e.p124d.p125a.EnumC0805a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class MDButton extends TextView {

    /* renamed from: b */
    public boolean f5159b;

    /* renamed from: c */
    public EnumC0805a f5160c;

    /* renamed from: d */
    public int f5161d;

    /* renamed from: e */
    public Drawable f5162e;

    /* renamed from: f */
    public Drawable f5163f;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5159b = false;
        this.f5161d = C0787a.m2463C(context, C1088R.attr.md_dialog_frame_margin, C1088R.dimen.default_md_dialog_frame_margin);
        this.f5160c = EnumC0805a.END;
    }

    /* renamed from: a */
    public void m2749a(boolean z, boolean z2) {
        int i;
        int iOrdinal;
        int i2;
        if (this.f5159b != z || z2) {
            if (z) {
                int iOrdinal2 = this.f5160c.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 8388611;
                } else if (iOrdinal2 == 1) {
                    i2 = 1;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new IllegalStateException("Invalid gravity constant");
                    }
                    i2 = 8388613;
                }
                i = i2 | 16;
            } else {
                i = 17;
            }
            setGravity(i);
            int i3 = 4;
            if (z && (iOrdinal = this.f5160c.ordinal()) != 1) {
                i3 = iOrdinal != 2 ? 5 : 6;
            }
            setTextAlignment(i3);
            setBackground(z ? this.f5162e : this.f5163f);
            if (z) {
                setPadding(this.f5161d, getPaddingTop(), this.f5161d, getPaddingBottom());
            }
            this.f5159b = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        setAllCaps(z);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f5163f = drawable;
        if (this.f5159b) {
            return;
        }
        m2749a(false, true);
    }

    public void setStackedGravity(EnumC0805a enumC0805a) {
        this.f5160c = enumC0805a;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f5162e = drawable;
        if (this.f5159b) {
            m2749a(true, true);
        }
    }
}
