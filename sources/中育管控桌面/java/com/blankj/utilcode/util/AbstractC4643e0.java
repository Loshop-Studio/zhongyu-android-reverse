package com.blankj.utilcode.util;

import android.graphics.Point;
import android.view.WindowManager;

/* renamed from: com.blankj.utilcode.util.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4643e0 {
    /* renamed from: a */
    public static int m2169a() {
        WindowManager windowManager = (WindowManager) AbstractC4657l0.m2250a().getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }
}
