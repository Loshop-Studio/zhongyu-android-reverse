package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.xuexiang.xui.utils.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5854b {
    /* renamed from: a */
    public static int m4346a(Context context, float f6) {
        return (int) ((f6 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m4347b(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i6 = displayMetrics.heightPixels;
        int i7 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i8 = i6 - displayMetrics2.heightPixels;
        return i8 > 0 ? i8 : Math.max(i7 - displayMetrics2.widthPixels, 0);
    }
}
