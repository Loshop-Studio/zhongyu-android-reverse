package com.xuexiang.xui.widget.picker.widget.utils;

import com.xuexiang.xui.C2042R;

/* loaded from: classes.dex */
public class PickerViewAnimateUtils {
    private static final int INVALID = -1;

    private PickerViewAnimateUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getAnimationResource(int i4, boolean z3) {
        if (i4 != 80) {
            return -1;
        }
        return z3 ? C2042R.anim.picker_view_slide_in_bottom : C2042R.anim.picker_view_slide_out_bottom;
    }
}
