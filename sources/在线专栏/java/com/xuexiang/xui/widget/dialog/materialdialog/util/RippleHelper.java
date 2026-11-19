package com.xuexiang.xui.widget.dialog.materialdialog.util;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

@TargetApi(21)
/* loaded from: classes.dex */
public class RippleHelper {
    public static void applyColor(Drawable drawable, int i4) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i4));
        }
    }
}
