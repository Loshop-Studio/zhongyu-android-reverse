package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6796b {
    /* renamed from: a */
    public static int m6441a(float f10) {
        return (int) ((f10 * AbstractC6799e.m6462g().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m6442b(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m6443c(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i9 = displayMetrics.heightPixels;
        int i10 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i11 = i9 - displayMetrics2.heightPixels;
        return i11 > 0 ? i11 : Math.max(i10 - displayMetrics2.widthPixels, 0);
    }
}
