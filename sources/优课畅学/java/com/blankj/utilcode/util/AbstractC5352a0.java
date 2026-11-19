package com.blankj.utilcode.util;

import android.graphics.Point;
import android.view.WindowManager;

/* renamed from: com.blankj.utilcode.util.a0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5352a0 {
    /* renamed from: a */
    public static int m2422a() {
        WindowManager windowManager = (WindowManager) AbstractC5366h0.m2478a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    /* renamed from: b */
    public static int m2423b() {
        WindowManager windowManager = (WindowManager) AbstractC5366h0.m2478a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }
}
