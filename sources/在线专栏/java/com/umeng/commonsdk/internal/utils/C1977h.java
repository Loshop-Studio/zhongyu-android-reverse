package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.umeng.commonsdk.internal.utils.C1974e;
import java.io.File;

/* renamed from: com.umeng.commonsdk.internal.utils.h */
/* loaded from: classes.dex */
public class C1977h {
    /* renamed from: a */
    public static boolean m7483a() {
        return m7484b() || m7485c() || m7486d() || m7487e();
    }

    /* renamed from: b */
    private static boolean m7484b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: c */
    private static boolean m7485c() {
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
    private static boolean m7486d() {
        return new C1974e().m7472a(C1974e.a.check_su_binary) != null;
    }

    /* renamed from: e */
    private static boolean m7487e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i4 = 0; i4 < 12; i4++) {
            if (new File(strArr[i4] + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
