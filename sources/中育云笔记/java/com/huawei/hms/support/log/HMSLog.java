package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.C7250a;
import com.huawei.hms.base.log.C7251b;
import p386w5.InterfaceC11705a;

/* loaded from: classes5.dex */
public class HMSLog {

    /* renamed from: a */
    public static final C7251b f11787a = new C7251b();

    /* renamed from: a */
    public static String m8721a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    /* renamed from: d */
    public static void m8722d(String str, String str2) {
        f11787a.m8396a(3, str, str2);
    }

    /* renamed from: e */
    public static void m8725e(String str, String str2) {
        f11787a.m8396a(6, str, str2);
    }

    /* renamed from: i */
    public static void m8727i(String str, String str2) {
        f11787a.m8396a(4, str, str2);
    }

    public static void init(Context context, int i10, String str) {
        C7251b c7251b = f11787a;
        c7251b.m8397a(context, i10, str);
        c7251b.m8399a(str, "============================================================================\n====== " + m8721a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f11787a.m8400a(6);
    }

    public static boolean isInfoEnable() {
        return f11787a.m8400a(4);
    }

    public static boolean isWarnEnable() {
        return f11787a.m8400a(5);
    }

    public static void setExtLogger(InterfaceC11705a interfaceC11705a, boolean z10) {
        if (interfaceC11705a == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        C7250a c7250a = new C7250a(interfaceC11705a);
        if (z10) {
            f11787a.m8398a(c7250a);
        } else {
            f11787a.m8395a().mo8393a(c7250a);
        }
    }

    /* renamed from: w */
    public static void m8728w(String str, String str2) {
        f11787a.m8396a(5, str, str2);
    }

    /* renamed from: e */
    public static void m8726e(String str, String str2, Throwable th) {
        f11787a.m8401b(6, str, str2, th);
    }

    /* renamed from: e */
    public static void m8723e(String str, long j10, String str2) {
        f11787a.m8396a(6, str, "[" + j10 + "] " + str2);
    }

    /* renamed from: e */
    public static void m8724e(String str, long j10, String str2, Throwable th) {
        f11787a.m8401b(6, str, "[" + j10 + "] " + str2, th);
    }
}
