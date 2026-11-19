package com.taobao.sophix.p099e;

import com.taobao.sophix.p090b.C7728b;
import java.io.File;

/* renamed from: com.taobao.sophix.e.b */
/* loaded from: classes5.dex */
public class C7741b {

    /* renamed from: a */
    static boolean f13402a = false;

    static {
        File filesDir = C7728b.f13354b.getFilesDir();
        boolean zM10380c = m10380c(filesDir.getParentFile());
        boolean zM10379b = m10379b(filesDir.getParentFile());
        boolean zExists = new File(filesDir.getParentFile(), "tx_shell").exists();
        boolean zExists2 = new File(filesDir, "libexec.so").exists();
        boolean zExists3 = new File(filesDir.getParentFile(), ".cache/d3d3Lm5hZ2Fpbi5jb20=").exists();
        boolean zExists4 = new File(filesDir.getParent(), ".TestinGuard").exists();
        boolean zM10377a = m10377a(filesDir.getParentFile());
        boolean z10 = f13402a | zM10380c | zM10379b | zExists | zExists2 | zExists3 | zExists4 | zM10377a;
        f13402a = z10;
        if (z10) {
            C7744e.m10400b("EnhanceUtils", "init", "36", Boolean.valueOf(zM10380c), "bb", Boolean.valueOf(zM10379b), "le", Boolean.valueOf(zExists), "ae", Boolean.valueOf(zExists2), "nj", Boolean.valueOf(zExists3), "yc", Boolean.valueOf(zExists4), "yd", Boolean.valueOf(zM10377a));
        } else {
            C7744e.m10393a("EnhanceUtils", "init", "plain app");
        }
    }

    /* renamed from: a */
    public static void m10376a() {
        C7744e.m10402c("EnhanceUtils", "setUsingEnhance", "force to treat as enhanced app");
        f13402a = true;
    }

    /* renamed from: b */
    public static boolean m10378b() {
        return f13402a;
    }

    /* renamed from: c */
    public static boolean m10380c(File file) {
        boolean zExists = new File(file, ".jiagu").exists();
        if (!zExists) {
            zExists = new File(file, "lib/libjiagu.so").exists();
        }
        if (!zExists) {
            try {
                return new File(C7728b.f13354b.getApplicationInfo().nativeLibraryDir, "libjiagu.so").exists();
            } catch (Exception unused) {
            }
        }
        return zExists;
    }

    /* renamed from: b */
    public static boolean m10379b(File file) throws ClassNotFoundException {
        boolean z10;
        boolean zExists = true;
        try {
            Class.forName("com.SecShell.SecShell.ApplicationWrapper");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        if (z10) {
            zExists = z10;
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
                zExists = new File(C7728b.f13354b.getApplicationInfo().nativeLibraryDir, "libDexHelper.so").exists();
            } catch (Exception unused3) {
            }
        }
        if (zExists) {
            return zExists;
        }
        try {
            return new File(C7728b.f13354b.getApplicationInfo().nativeLibraryDir, "libSecShell.so").exists();
        } catch (Exception unused4) {
            return zExists;
        }
    }

    /* renamed from: a */
    public static boolean m10377a(File file) throws ClassNotFoundException {
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
            return new File(C7728b.f13354b.getApplicationInfo().nativeLibraryDir, "libnesec.so").exists();
        } catch (Exception unused2) {
            return zExists;
        }
    }
}
