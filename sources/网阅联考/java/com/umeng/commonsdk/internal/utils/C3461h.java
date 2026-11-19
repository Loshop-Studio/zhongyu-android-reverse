package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.umeng.commonsdk.internal.utils.C3458e;
import java.io.File;

/* renamed from: com.umeng.commonsdk.internal.utils.h */
/* loaded from: classes2.dex */
public class C3461h {
    /* renamed from: a */
    public static boolean m3560a() {
        return m3561b() || m3562c() || m3563d() || m3564e();
    }

    /* renamed from: b */
    private static boolean m3561b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: c */
    private static boolean m3562c() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            return new File("/system/app/Kinguser.apk").exists();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m3563d() {
        return new C3458e().m3549a(C3458e.a.check_su_binary) != null;
    }

    /* renamed from: e */
    private static boolean m3564e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i4 = 0; i4 < 12; i4++) {
            if (new File(strArr[i4] + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
