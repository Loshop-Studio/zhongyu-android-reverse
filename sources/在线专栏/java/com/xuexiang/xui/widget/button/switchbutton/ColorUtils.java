package com.xuexiang.xui.widget.button.switchbutton;

import android.content.res.ColorStateList;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
class ColorUtils {
    private static final int CHECKED_ATTR = 16842912;
    private static final int ENABLE_ATTR = 16842910;
    private static final int PRESSED_ATTR = 16842919;

    ColorUtils() {
    }

    static ColorStateList generateBackColorWithTintColor(int i4) {
        int i5 = i4 - (-805306368);
        return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842912, 16842919}, new int[]{-16842912, 16842919}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i4 - (-520093696), 268435456, i5, 536870912, i5, 536870912});
    }

    static ColorStateList generateThumbColorWithTintColor(int i4) {
        int i5 = i4 - (-1728053248);
        return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842919, -16842912}, new int[]{16842919, 16842912}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i4 - (-1442840576), -4539718, i5, i5, i4 | IGoodView.DEFAULT_TEXT_COLOR, -1118482});
    }
}
