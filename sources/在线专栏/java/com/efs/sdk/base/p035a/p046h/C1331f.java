package com.efs.sdk.base.p035a.p046h;

import android.content.Context;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.efs.sdk.base.a.h.f */
/* loaded from: classes.dex */
public final class C1331f {
    /* renamed from: a */
    public static String m5578a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Throwable th) {
            C1329d.m5572a("efs.util.pkg", "get version name error", th);
            return UtilityImpl.NET_TYPE_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static String m5579b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Throwable th) {
            C1329d.m5572a("efs.util.pkg", "get version name error", th);
            return UtilityImpl.NET_TYPE_UNKNOWN;
        }
    }
}
