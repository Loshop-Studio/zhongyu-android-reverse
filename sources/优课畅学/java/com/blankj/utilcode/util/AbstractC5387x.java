package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* renamed from: com.blankj.utilcode.util.x */
/* loaded from: classes3.dex */
public abstract class AbstractC5387x {

    /* renamed from: a */
    public static final String[] f2766a = {"huawei"};

    /* renamed from: b */
    public static final String[] f2767b = {"vivo"};

    /* renamed from: c */
    public static final String[] f2768c = {"xiaomi"};

    /* renamed from: d */
    public static final String[] f2769d = {"oppo"};

    /* renamed from: e */
    public static final String[] f2770e = {"leeco", "letv"};

    /* renamed from: f */
    public static final String[] f2771f = {"360", "qiku"};

    /* renamed from: g */
    public static final String[] f2772g = {"zte"};

    /* renamed from: h */
    public static final String[] f2773h = {"oneplus"};

    /* renamed from: i */
    public static final String[] f2774i = {"nubia"};

    /* renamed from: j */
    public static final String[] f2775j = {"coolpad", "yulong"};

    /* renamed from: k */
    public static final String[] f2776k = {"lg", "lge"};

    /* renamed from: l */
    public static final String[] f2777l = {"google"};

    /* renamed from: m */
    public static final String[] f2778m = {"samsung"};

    /* renamed from: n */
    public static final String[] f2779n = {"meizu"};

    /* renamed from: o */
    public static final String[] f2780o = {"lenovo"};

    /* renamed from: p */
    public static final String[] f2781p = {"smartisan", "deltainno"};

    /* renamed from: q */
    public static final String[] f2782q = {"htc"};

    /* renamed from: r */
    public static final String[] f2783r = {"sony"};

    /* renamed from: s */
    public static final String[] f2784s = {"gionee", "amigo"};

    /* renamed from: t */
    public static final String[] f2785t = {"motorola"};

    /* renamed from: u */
    public static a f2786u = null;

    /* renamed from: com.blankj.utilcode.util.x$a */
    public static class a {

        /* renamed from: a */
        public String f2787a;

        /* renamed from: b */
        public String f2788b;

        public String toString() {
            return "RomInfo{name=" + this.f2787a + ", version=" + this.f2788b + "}";
        }
    }

    /* renamed from: a */
    public static String m2673a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    public static String m2674b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: c */
    public static a m2675c() {
        a aVar = f2786u;
        if (aVar != null) {
            return aVar;
        }
        f2786u = new a();
        String strM2673a = m2673a();
        String strM2674b = m2674b();
        String[] strArr = f2766a;
        if (m2681i(strM2673a, strM2674b, strArr)) {
            f2786u.f2787a = strArr[0];
            String strM2676d = m2676d("ro.build.version.emui");
            String[] strArrSplit = strM2676d.split("_");
            if (strArrSplit.length > 1) {
                f2786u.f2788b = strArrSplit[1];
            } else {
                f2786u.f2788b = strM2676d;
            }
            return f2786u;
        }
        String[] strArr2 = f2767b;
        if (m2681i(strM2673a, strM2674b, strArr2)) {
            f2786u.f2787a = strArr2[0];
            f2786u.f2788b = m2676d("ro.vivo.os.build.display.id");
            return f2786u;
        }
        String[] strArr3 = f2768c;
        if (m2681i(strM2673a, strM2674b, strArr3)) {
            f2786u.f2787a = strArr3[0];
            f2786u.f2788b = m2676d("ro.build.version.incremental");
            return f2786u;
        }
        String[] strArr4 = f2769d;
        if (m2681i(strM2673a, strM2674b, strArr4)) {
            f2786u.f2787a = strArr4[0];
            f2786u.f2788b = m2676d("ro.build.version.opporom");
            return f2786u;
        }
        String[] strArr5 = f2770e;
        if (m2681i(strM2673a, strM2674b, strArr5)) {
            f2786u.f2787a = strArr5[0];
            f2786u.f2788b = m2676d("ro.letv.release.version");
            return f2786u;
        }
        String[] strArr6 = f2771f;
        if (m2681i(strM2673a, strM2674b, strArr6)) {
            f2786u.f2787a = strArr6[0];
            f2786u.f2788b = m2676d("ro.build.uiversion");
            return f2786u;
        }
        String[] strArr7 = f2772g;
        if (m2681i(strM2673a, strM2674b, strArr7)) {
            f2786u.f2787a = strArr7[0];
            f2786u.f2788b = m2676d("ro.build.MiFavor_version");
            return f2786u;
        }
        String[] strArr8 = f2773h;
        if (m2681i(strM2673a, strM2674b, strArr8)) {
            f2786u.f2787a = strArr8[0];
            f2786u.f2788b = m2676d("ro.rom.version");
            return f2786u;
        }
        String[] strArr9 = f2774i;
        if (m2681i(strM2673a, strM2674b, strArr9)) {
            f2786u.f2787a = strArr9[0];
            f2786u.f2788b = m2676d("ro.build.rom.id");
            return f2786u;
        }
        String[] strArr10 = f2775j;
        if (m2681i(strM2673a, strM2674b, strArr10)) {
            f2786u.f2787a = strArr10[0];
        } else {
            String[] strArr11 = f2776k;
            if (m2681i(strM2673a, strM2674b, strArr11)) {
                f2786u.f2787a = strArr11[0];
            } else {
                String[] strArr12 = f2777l;
                if (m2681i(strM2673a, strM2674b, strArr12)) {
                    f2786u.f2787a = strArr12[0];
                } else {
                    String[] strArr13 = f2778m;
                    if (m2681i(strM2673a, strM2674b, strArr13)) {
                        f2786u.f2787a = strArr13[0];
                    } else {
                        String[] strArr14 = f2779n;
                        if (m2681i(strM2673a, strM2674b, strArr14)) {
                            f2786u.f2787a = strArr14[0];
                        } else {
                            String[] strArr15 = f2780o;
                            if (m2681i(strM2673a, strM2674b, strArr15)) {
                                f2786u.f2787a = strArr15[0];
                            } else {
                                String[] strArr16 = f2781p;
                                if (m2681i(strM2673a, strM2674b, strArr16)) {
                                    f2786u.f2787a = strArr16[0];
                                } else {
                                    String[] strArr17 = f2782q;
                                    if (m2681i(strM2673a, strM2674b, strArr17)) {
                                        f2786u.f2787a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f2783r;
                                        if (m2681i(strM2673a, strM2674b, strArr18)) {
                                            f2786u.f2787a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f2784s;
                                            if (m2681i(strM2673a, strM2674b, strArr19)) {
                                                f2786u.f2787a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f2785t;
                                                if (m2681i(strM2673a, strM2674b, strArr20)) {
                                                    f2786u.f2787a = strArr20[0];
                                                } else {
                                                    f2786u.f2787a = strM2674b;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f2786u.f2788b = m2676d("");
        return f2786u;
    }

    /* renamed from: d */
    public static String m2676d(String str) {
        String strM2677e = !TextUtils.isEmpty(str) ? m2677e(str) : "";
        if (TextUtils.isEmpty(strM2677e) || strM2677e.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    strM2677e = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(strM2677e) ? "unknown" : strM2677e;
    }

    /* renamed from: e */
    public static String m2677e(String str) throws Throwable {
        String strM2679g = m2679g(str);
        if (!TextUtils.isEmpty(strM2679g)) {
            return strM2679g;
        }
        String strM2680h = m2680h(str);
        return (TextUtils.isEmpty(strM2680h) && Build.VERSION.SDK_INT < 28) ? m2678f(str) : strM2680h;
    }

    /* renamed from: f */
    public static String m2678f(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static String m2679g(String str) throws Throwable {
        BufferedReader bufferedReader;
        String line;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            } catch (IOException unused) {
                return "";
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            line = bufferedReader.readLine();
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 == null) {
                return "";
            }
            bufferedReader2.close();
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (line != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return line;
        }
        bufferedReader.close();
        return "";
    }

    /* renamed from: h */
    public static String m2680h(String str) throws IOException {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static boolean m2681i(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
