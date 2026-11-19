package com.blankj.utilcode.util;

import android.app.NotificationChannel;
import android.os.Build;
import androidx.core.util.AbstractC2487a;

/* renamed from: com.blankj.utilcode.util.k */
/* loaded from: classes2.dex */
public final class C3391k {

    /* renamed from: b */
    public static final C3391k f2166b;

    /* renamed from: a */
    public NotificationChannel f2167a;

    static {
        String packageName = AbstractC3382c.m2303d().getPackageName();
        String packageName2 = AbstractC3382c.m2303d().getPackageName();
        C3391k c3391k = new C3391k();
        if (Build.VERSION.SDK_INT >= 26) {
            c3391k.f2167a = AbstractC2487a.m1654b(packageName, packageName2);
        }
        f2166b = c3391k;
    }
}
