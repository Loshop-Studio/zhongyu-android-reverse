package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class MDButton extends TextView {
    private Drawable defaultBackground;
    private boolean stacked;
    private Drawable stackedBackground;
    private int stackedEndPadding;
    private GravityEnum stackedGravity;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stacked = false;
        init(context);
    }

    private void init(Context context) {
        this.stackedEndPadding = ThemeUtils.resolveDimension(context, C2042R.attr.md_dialog_frame_margin, C2042R.dimen.default_md_dialog_frame_margin);
        this.stackedGravity = GravityEnum.END;
    }

    public void setAllCapsCompat(boolean z3) {
        setAllCaps(z3);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.defaultBackground = drawable;
        if (this.stacked) {
            return;
        }
        setStacked(false, true);
    }

    void setStacked(boolean z3, boolean z4) {
        if (this.stacked != z3 || z4) {
            setGravity(z3 ? this.stackedGravity.getGravityInt() | 16 : 17);
            setTextAlignment(z3 ? this.stackedGravity.getTextAlignment() : 4);
            ThemeUtils.setBackgroundCompat(this, z3 ? this.stackedBackground : this.defaultBackground);
            if (z3) {
                setPadding(this.stackedEndPadding, getPaddingTop(), this.stackedEndPadding, getPaddingBottom());
            }
            this.stacked = z3;
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.stackedGravity = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.stackedBackground = drawable;
        if (this.stacked) {
            setStacked(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.stacked = false;
        init(context);
    }
}
