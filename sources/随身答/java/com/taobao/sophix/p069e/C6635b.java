package com.taobao.sophix.p069e;

import com.taobao.sophix.p060b.C6622b;
import java.io.File;

/* renamed from: com.taobao.sophix.e.b */
/* loaded from: classes4.dex */
public class C6635b {

    /* renamed from: a */
    static boolean f5537a = false;

    static {
        File filesDir = C6622b.f5489b.getFilesDir();
        boolean zM4868c = m4868c(filesDir.getParentFile());
        boolean zM4867b = m4867b(filesDir.getParentFile());
        boolean zExists = new File(filesDir.getParentFile(), "tx_shell").exists();
        boolean zExists2 = new File(filesDir, "libexec.so").exists();
        boolean zExists3 = new File(filesDir.getParentFile(), ".cache/d3d3Lm5hZ2Fpbi5jb20=").exists();
        boolean zExists4 = new File(filesDir.getParent(), ".TestinGuard").exists();
        boolean zM4865a = m4865a(filesDir.getParentFile());
        boolean z9 = f5537a | zM4868c | zM4867b | zExists | zExists2 | zExists3 | zExists4 | zM4865a;
        f5537a = z9;
        if (z9) {
            C6638e.m4888b("EnhanceUtils", "init", "36", Boolean.valueOf(zM4868c), "bb", Boolean.valueOf(zM4867b), "le", Boolean.valueOf(zExists), "ae", Boolean.valueOf(zExists2), "nj", Boolean.valueOf(zExists3), "yc", Boolean.valueOf(zExists4), "yd", Boolean.valueOf(zM4865a));
        } else {
            C6638e.m4881a("EnhanceUtils", "init", "plain app");
        }
    }

    /* renamed from: a */
    public static void m4864a() {
        C6638e.m4890c("EnhanceUtils", "setUsingEnhance", "force to treat as enhanced app");
        f5537a = true;
    }

    /* renamed from: b */
    public static boolean m4866b() {
        return f5537a;
    }

    /* renamed from: c */
    public static boolean m4868c(File file) {
        boolean zExists = new File(file, ".jiagu").exists();
        if (!zExists) {
            zExists = new File(file, "lib/libjiagu.so").exists();
        }
        if (!zExists) {
            try {
                return new File(C6622b.f5489b.getApplicationInfo().nativeLibraryDir, "libjiagu.so").exists();
            } catch (Exception unused) {
            }
        }
        return zExists;
    }

    /* renamed from: b */
    public static boolean m4867b(File file) throws ClassNotFoundException {
        boolean z9;
        boolean zExists = true;
        try {
            Class.forName("com.SecShell.SecShell.ApplicationWrapper");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        if (z9) {
            zExists = z9;
        } else {
            try {
                Class.forName("com.secneo.apkwrapper.ApplicationWrapper");
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (!zExists) {
            zExists = new File(file, "lib/libDexHelper.so").exists();
        }
        if (!zExists) {
            zExists = new File(file, "lib/libSecShell.so").exists();
        }
        if (!zExists) {
            try {
                zExists = new File(C6622b.f5489b.getApplicationInfo().nativeLibraryDir, "libDexHelper.so").exists();
            } catch (Exception unused3) {
            }
        }
        if (zExists) {
            return zExists;
        }
        try {
            return new File(C6622b.f5489b.getApplicationInfo().nativeLibraryDir, "libSecShell.so").exists();
        } catch (Exception unused4) {
            return zExists;
        }
    }

    /* renamed from: a */
    public static boolean m4865a(File file) throws ClassNotFoundException {
        boolean zExists;
        try {
            Class.forName("com.netease.nis.wrapper.MyApplication");
            zExists = true;
        } catch (ClassNotFoundException unused) {
            zExists = false;
        }
        if (!zExists) {
            zExists = new File(file, "lib/libnesec.so").exists();
        }
        if (zExists) {
            return zExists;
        }
        try {
            return new File(C6622b.f5489b.getApplicationInfo().nativeLibraryDir, "libnesec.so").exists();
        } catch (Exception unused2) {
            return zExists;
        }
    }
}
