package com.xuexiang.xui.widget.button.switchbutton;

import android.R;
import android.content.res.ColorStateList;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.button.switchbutton.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8094a {
    /* renamed from: a */
    public static ColorStateList m12532a(int i10) {
        int i11 = i10 - (-805306368);
        return new ColorStateList(new int[][]{new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910}, new int[]{R.attr.state_checked, R.attr.state_pressed}, new int[]{-16842912, R.attr.state_pressed}, new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i10 - (-520093696), 268435456, i11, 536870912, i11, 536870912});
    }

    /* renamed from: b */
    public static ColorStateList m12533b(int i10) {
        int i11 = i10 - (-1728053248);
        return new ColorStateList(new int[][]{new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910}, new int[]{R.attr.state_pressed, -16842912}, new int[]{R.attr.state_pressed, R.attr.state_checked}, new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i10 - (-1442840576), -4539718, i11, i11, i10 | ViewCompat.MEASURED_STATE_MASK, -1118482});
    }
}
