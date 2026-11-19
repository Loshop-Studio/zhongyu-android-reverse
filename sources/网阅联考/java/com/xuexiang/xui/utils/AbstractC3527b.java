package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3527b {
    /* renamed from: a */
    public static int m4047a(float f4) {
        return (int) ((f4 * AbstractC3530e.m4065f().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m4048b(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m4049c(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        int i5 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i6 = i4 - displayMetrics2.heightPixels;
        return i6 > 0 ? i6 : Math.max(i5 - displayMetrics2.widthPixels, 0);
    }
}
