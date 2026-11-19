package com.blankj.utilcode.util;

import android.content.res.Resources;

/* renamed from: com.blankj.utilcode.util.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5359e {
    /* renamed from: a */
    public static int m2445a() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m2446b() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
