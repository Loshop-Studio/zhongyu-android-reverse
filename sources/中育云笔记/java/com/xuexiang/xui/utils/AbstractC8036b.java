package com.xuexiang.xui.utils;

import android.graphics.Color;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8036b {
    /* renamed from: a */
    public static int m12186a(int i10, int i11, float f10) {
        float fMax = Math.max(Math.min(f10, 1.0f), 0.0f);
        return Color.argb(((int) ((Color.alpha(i11) - r0) * fMax)) + Color.alpha(i10), ((int) ((Color.red(i11) - r0) * fMax)) + Color.red(i10), ((int) ((Color.green(i11) - r0) * fMax)) + Color.green(i10), ((int) ((Color.blue(i11) - r4) * fMax)) + Color.blue(i10));
    }
}
