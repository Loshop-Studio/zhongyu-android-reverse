package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6477b {
    /* renamed from: a */
    public static int m5341a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m5342b(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        int i11 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i12 = i10 - displayMetrics2.heightPixels;
        return i12 > 0 ? i12 : Math.max(i11 - displayMetrics2.widthPixels, 0);
    }
}
