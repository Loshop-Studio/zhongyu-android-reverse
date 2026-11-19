package com.efs.sdk.base.p039a.p050h;

import android.content.Context;
import androidx.core.os.EnvironmentCompat;

/* renamed from: com.efs.sdk.base.a.h.f */
/* loaded from: classes3.dex */
public final class C5699f {
    /* renamed from: a */
    public static String m4188a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable th) {
            C5697d.m4182a("efs.util.pkg", "get version name error", th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static String m4189b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Throwable th) {
            C5697d.m4182a("efs.util.pkg", "get version name error", th);
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }
}
