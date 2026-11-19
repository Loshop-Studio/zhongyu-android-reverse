package com.blankj.utilcode.util;

import android.content.res.Resources;

/* renamed from: com.blankj.utilcode.util.e */
/* loaded from: classes3.dex */
public abstract class AbstractC4642e {
    /* renamed from: a */
    public static int m2167a() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m2168b() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
