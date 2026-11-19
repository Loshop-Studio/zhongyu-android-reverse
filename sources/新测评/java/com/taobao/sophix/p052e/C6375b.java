package com.taobao.sophix.p052e;

import com.taobao.sophix.p043b.C6362b;
import java.io.File;

/* renamed from: com.taobao.sophix.e.b */
/* loaded from: classes4.dex */
public class C6375b {

    /* renamed from: a */
    static boolean f4960a = false;

    static {
        File filesDir = C6362b.f4912b.getFilesDir();
        boolean zM4689c = m4689c(filesDir.getParentFile());
        boolean zM4688b = m4688b(filesDir.getParentFile());
        boolean zExists = new File(filesDir.getParentFile(), "tx_shell").exists();
        boolean zExists2 = new File(filesDir, "libexec.so").exists();
        boolean zExists3 = new File(filesDir.getParentFile(), ".cache/d3d3Lm5hZ2Fpbi5jb20=").exists();
        boolean zExists4 = new File(filesDir.getParent(), ".TestinGuard").exists();
        boolean zM4686a = m4686a(filesDir.getParentFile());
        boolean z9 = f4960a | zM4689c | zM4688b | zExists | zExists2 | zExists3 | zExists4 | zM4686a;
        f4960a = z9;
        if (z9) {
            C6378e.m4709b("EnhanceUtils", "init", "36", Boolean.valueOf(zM4689c), "bb", Boolean.valueOf(zM4688b), "le", Boolean.valueOf(zExists), "ae", Boolean.valueOf(zExists2), "nj", Boolean.valueOf(zExists3), "yc", Boolean.valueOf(zExists4), "yd", Boolean.valueOf(zM4686a));
        } else {
            C6378e.m4702a("EnhanceUtils", "init", "plain app");
        }
    }

    /* renamed from: a */
    public static void m4685a() {
        C6378e.m4711c("EnhanceUtils", "setUsingEnhance", "force to treat as enhanced app");
        f4960a = true;
    }

    /* renamed from: b */
    public static boolean m4687b() {
        return f4960a;
    }

    /* renamed from: c */
    public static boolean m4689c(File file) {
        boolean zExists = new File(file, ".jiagu").exists();
        if (!zExists) {
            zExists = new File(file, "lib/libjiagu.so").exists();
        }
        if (!zExists) {
            try {
                return new File(C6362b.f4912b.getApplicationInfo().nativeLibraryDir, "libjiagu.so").exists();
            } catch (Exception unused) {
            }
        }
        return zExists;
    }

    /* renamed from: b */
    public static boolean m4688b(File file) throws ClassNotFoundException {
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
                zExists = new File(C6362b.f4912b.getApplicationInfo().nativeLibraryDir, "libDexHelper.so").exists();
            } catch (Exception unused3) {
            }
        }
        if (zExists) {
            return zExists;
        }
        try {
            return new File(C6362b.f4912b.getApplicationInfo().nativeLibraryDir, "libSecShell.so").exists();
        } catch (Exception unused4) {
            return zExists;
        }
    }

    /* renamed from: a */
    public static boolean m4686a(File file) throws ClassNotFoundException {
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
            return new File(C6362b.f4912b.getApplicationInfo().nativeLibraryDir, "libnesec.so").exists();
        } catch (Exception unused2) {
            return zExists;
        }
    }
}
