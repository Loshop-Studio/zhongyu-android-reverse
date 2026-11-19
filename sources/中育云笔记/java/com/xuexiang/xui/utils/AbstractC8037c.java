package com.xuexiang.xui.utils;

import android.content.Context;

/* renamed from: com.xuexiang.xui.utils.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8037c {
    /* renamed from: a */
    public static int m12187a(float f10) {
        return (int) ((f10 * AbstractC8040f.m12208i().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m12188b(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m12189c(float f10) {
        return (int) ((f10 * AbstractC8040f.m12208i().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: d */
    public static int m12190d(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
