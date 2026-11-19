package com.efs.sdk.base.p020a.p031h;

import android.content.Context;
import androidx.core.os.EnvironmentCompat;

/* renamed from: com.efs.sdk.base.a.h.f */
/* loaded from: classes2.dex */
public final class C2959f {
    /* renamed from: a */
    public static String m2219a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable th) {
            C2957d.m2213a("efs.util.pkg", "get version name error", th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static String m2220b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Throwable th) {
            C2957d.m2213a("efs.util.pkg", "get version name error", th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }
}
