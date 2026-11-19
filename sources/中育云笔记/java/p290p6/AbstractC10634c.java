package p290p6;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import p008a7.AbstractC0084q;

/* renamed from: p6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10634c {

    /* renamed from: a */
    public static final String[] f25621a = {"samsung"};

    /* renamed from: b */
    public static Integer f25622b;

    /* renamed from: a */
    public static String m22490a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    public static int m22491b() {
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return m22501l(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(" ", "").substring(0, 1));
    }

    /* renamed from: c */
    public static int m22492c() {
        Integer num = f25622b;
        if (num != null) {
            return num.intValue();
        }
        if (m22498i()) {
            Integer num2 = 1;
            f25622b = num2;
            return num2.intValue();
        }
        if (m22497h()) {
            Integer num3 = 2;
            f25622b = num3;
            return num3.intValue();
        }
        if (m22496g()) {
            Integer num4 = 3;
            f25622b = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        f25622b = num5;
        return num5.intValue();
    }

    /* renamed from: d */
    public static int m22493d() throws Throwable {
        String strM22495f = m22495f();
        if (!TextUtils.isEmpty(strM22495f)) {
            try {
                return AbstractC0084q.m238c(strM22495f);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static String m22494e() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: f */
    public static String m22495f() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
                return line;
            } catch (IOException e10) {
                e10.printStackTrace();
                return line;
            }
        } catch (IOException unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static boolean m22496g() {
        return true;
    }

    /* renamed from: h */
    public static boolean m22497h() {
        return m22491b() >= 4;
    }

    /* renamed from: i */
    public static boolean m22498i() throws Throwable {
        String strM22495f = m22495f();
        if (TextUtils.isEmpty(strM22495f)) {
            return false;
        }
        try {
            return AbstractC0084q.m238c(strM22495f) >= 4;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m22499j(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m22500k() {
        return m22499j(m22490a(), m22494e(), f25621a);
    }

    /* renamed from: l */
    public static int m22501l(String str) {
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return AbstractC0084q.m238c(str);
        }
        return 0;
    }
}
