package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* renamed from: com.blankj.utilcode.util.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4637b0 {

    /* renamed from: a */
    public static final String[] f2039a = {"huawei"};

    /* renamed from: b */
    public static final String[] f2040b = {"vivo"};

    /* renamed from: c */
    public static final String[] f2041c = {"xiaomi"};

    /* renamed from: d */
    public static final String[] f2042d = {"oppo"};

    /* renamed from: e */
    public static final String[] f2043e = {"leeco", "letv"};

    /* renamed from: f */
    public static final String[] f2044f = {"360", "qiku"};

    /* renamed from: g */
    public static final String[] f2045g = {"zte"};

    /* renamed from: h */
    public static final String[] f2046h = {"oneplus"};

    /* renamed from: i */
    public static final String[] f2047i = {"nubia"};

    /* renamed from: j */
    public static final String[] f2048j = {"coolpad", "yulong"};

    /* renamed from: k */
    public static final String[] f2049k = {"lg", "lge"};

    /* renamed from: l */
    public static final String[] f2050l = {"google"};

    /* renamed from: m */
    public static final String[] f2051m = {"samsung"};

    /* renamed from: n */
    public static final String[] f2052n = {"meizu"};

    /* renamed from: o */
    public static final String[] f2053o = {"lenovo"};

    /* renamed from: p */
    public static final String[] f2054p = {"smartisan", "deltainno"};

    /* renamed from: q */
    public static final String[] f2055q = {"htc"};

    /* renamed from: r */
    public static final String[] f2056r = {"sony"};

    /* renamed from: s */
    public static final String[] f2057s = {"gionee", "amigo"};

    /* renamed from: t */
    public static final String[] f2058t = {"motorola"};

    /* renamed from: u */
    public static a f2059u = null;

    /* renamed from: com.blankj.utilcode.util.b0$a */
    public static class a {

        /* renamed from: a */
        public String f2060a;

        /* renamed from: b */
        public String f2061b;

        public String toString() {
            return "RomInfo{name=" + this.f2060a + ", version=" + this.f2061b + "}";
        }
    }

    /* renamed from: a */
    public static String m2135a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static String m2136b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: c */
    public static a m2137c() {
        a aVar = f2059u;
        if (aVar != null) {
            return aVar;
        }
        f2059u = new a();
        String strM2135a = m2135a();
        String strM2136b = m2136b();
        String[] strArr = f2039a;
        if (m2143i(strM2135a, strM2136b, strArr)) {
            f2059u.f2060a = strArr[0];
            String strM2138d = m2138d("ro.build.version.emui");
            String[] strArrSplit = strM2138d.split("_");
            if (strArrSplit.length > 1) {
                f2059u.f2061b = strArrSplit[1];
            } else {
                f2059u.f2061b = strM2138d;
            }
            return f2059u;
        }
        String[] strArr2 = f2040b;
        if (m2143i(strM2135a, strM2136b, strArr2)) {
            f2059u.f2060a = strArr2[0];
            f2059u.f2061b = m2138d("ro.vivo.os.build.display.id");
            return f2059u;
        }
        String[] strArr3 = f2041c;
        if (m2143i(strM2135a, strM2136b, strArr3)) {
            f2059u.f2060a = strArr3[0];
            f2059u.f2061b = m2138d("ro.build.version.incremental");
            return f2059u;
        }
        String[] strArr4 = f2042d;
        if (m2143i(strM2135a, strM2136b, strArr4)) {
            f2059u.f2060a = strArr4[0];
            f2059u.f2061b = m2138d("ro.build.version.opporom");
            return f2059u;
        }
        String[] strArr5 = f2043e;
        if (m2143i(strM2135a, strM2136b, strArr5)) {
            f2059u.f2060a = strArr5[0];
            f2059u.f2061b = m2138d("ro.letv.release.version");
            return f2059u;
        }
        String[] strArr6 = f2044f;
        if (m2143i(strM2135a, strM2136b, strArr6)) {
            f2059u.f2060a = strArr6[0];
            f2059u.f2061b = m2138d("ro.build.uiversion");
            return f2059u;
        }
        String[] strArr7 = f2045g;
        if (m2143i(strM2135a, strM2136b, strArr7)) {
            f2059u.f2060a = strArr7[0];
            f2059u.f2061b = m2138d("ro.build.MiFavor_version");
            return f2059u;
        }
        String[] strArr8 = f2046h;
        if (m2143i(strM2135a, strM2136b, strArr8)) {
            f2059u.f2060a = strArr8[0];
            f2059u.f2061b = m2138d("ro.rom.version");
            return f2059u;
        }
        String[] strArr9 = f2047i;
        if (m2143i(strM2135a, strM2136b, strArr9)) {
            f2059u.f2060a = strArr9[0];
            f2059u.f2061b = m2138d("ro.build.rom.id");
            return f2059u;
        }
        String[] strArr10 = f2048j;
        if (m2143i(strM2135a, strM2136b, strArr10)) {
            f2059u.f2060a = strArr10[0];
        } else {
            String[] strArr11 = f2049k;
            if (m2143i(strM2135a, strM2136b, strArr11)) {
                f2059u.f2060a = strArr11[0];
            } else {
                String[] strArr12 = f2050l;
                if (m2143i(strM2135a, strM2136b, strArr12)) {
                    f2059u.f2060a = strArr12[0];
                } else {
                    String[] strArr13 = f2051m;
                    if (m2143i(strM2135a, strM2136b, strArr13)) {
                        f2059u.f2060a = strArr13[0];
                    } else {
                        String[] strArr14 = f2052n;
                        if (m2143i(strM2135a, strM2136b, strArr14)) {
                            f2059u.f2060a = strArr14[0];
                        } else {
                            String[] strArr15 = f2053o;
                            if (m2143i(strM2135a, strM2136b, strArr15)) {
                                f2059u.f2060a = strArr15[0];
                            } else {
                                String[] strArr16 = f2054p;
                                if (m2143i(strM2135a, strM2136b, strArr16)) {
                                    f2059u.f2060a = strArr16[0];
                                } else {
                                    String[] strArr17 = f2055q;
                                    if (m2143i(strM2135a, strM2136b, strArr17)) {
                                        f2059u.f2060a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f2056r;
                                        if (m2143i(strM2135a, strM2136b, strArr18)) {
                                            f2059u.f2060a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f2057s;
                                            if (m2143i(strM2135a, strM2136b, strArr19)) {
                                                f2059u.f2060a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f2058t;
                                                if (m2143i(strM2135a, strM2136b, strArr20)) {
                                                    f2059u.f2060a = strArr20[0];
                                                } else {
                                                    f2059u.f2060a = strM2136b;
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
        f2059u.f2061b = m2138d("");
        return f2059u;
    }

    /* renamed from: d */
    public static String m2138d(String str) {
        String strM2139e = !TextUtils.isEmpty(str) ? m2139e(str) : "";
        if (TextUtils.isEmpty(strM2139e) || strM2139e.equals(EnvironmentCompat.MEDIA_UNKNOWN)) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    strM2139e = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(strM2139e) ? EnvironmentCompat.MEDIA_UNKNOWN : strM2139e;
    }

    /* renamed from: e */
    public static String m2139e(String str) throws Throwable {
        String strM2141g = m2141g(str);
        if (!TextUtils.isEmpty(strM2141g)) {
            return strM2141g;
        }
        String strM2142h = m2142h(str);
        return (TextUtils.isEmpty(strM2142h) && Build.VERSION.SDK_INT < 28) ? m2140f(str) : strM2142h;
    }

    /* renamed from: f */
    public static String m2140f(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public static String m2141g(String str) throws Throwable {
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
    public static String m2142h(String str) throws IOException {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static boolean m2143i(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }
}
