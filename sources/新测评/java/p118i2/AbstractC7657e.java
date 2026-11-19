package p118i2;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import p074e2.C7329a;
import p096g2.AbstractC7514d;
import p129j2.AbstractC7783c;
import p129j2.AbstractC7788h;

/* renamed from: i2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7657e {

    /* renamed from: a */
    public static final String f12914a = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: a */
    public static String m12711a(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + File.separator + ".7934039a7252be16";
        AbstractC7788h.m13181g("", "UtdidAppRoot dir:" + str);
        AbstractC7783c.m13160c(str);
        return str;
    }

    /* renamed from: b */
    public static void m12712b(Context context, String str) {
        String string;
        try {
            string = Settings.System.getString(context.getContentResolver(), "7934039a7252be16");
        } catch (Exception unused) {
            string = null;
        }
        if (str.equals(string)) {
            return;
        }
        try {
            Settings.System.putString(context.getContentResolver(), "7934039a7252be16", str);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: c */
    public static void m12713c(String str) {
        try {
            AbstractC7788h.m13183i();
            AbstractC7783c.m13158a(m12714d(), str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static String m12714d() {
        String str = m12711a(C7329a.m11708b().m11713f()) + File.separator + "4635b664f789000d";
        AbstractC7788h.m13181g("", str);
        return str;
    }

    /* renamed from: e */
    public static String m12715e(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), "7934039a7252be16");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m12716f(String str) {
        try {
            String strM12723m = m12723m();
            if (TextUtils.isEmpty(strM12723m)) {
                return;
            }
            AbstractC7783c.m13158a(strM12723m, str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static String m12717g() {
        return m12711a(C7329a.m11708b().m11713f()) + File.separator + "9983c160aa044115";
    }

    /* renamed from: h */
    public static boolean m12718h(Context context) {
        try {
            return !context.getFileStreamPath("3c9b584e65e6c983").exists();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: i */
    public static String m12719i() {
        return m12711a(C7329a.m11708b().m11713f()) + File.separator + "a325712a39bd320a";
    }

    /* renamed from: j */
    public static String m12720j() {
        try {
            return AbstractC7783c.m13159b(m12714d());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m12721k() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + f12914a;
        AbstractC7788h.m13181g("", "SdcardRoot dir:" + str);
        AbstractC7783c.m13160c(str);
        return str;
    }

    /* renamed from: l */
    public static String m12722l() {
        try {
            String strM12723m = m12723m();
            if (TextUtils.isEmpty(strM12723m)) {
                return null;
            }
            return AbstractC7783c.m13159b(strM12723m);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static String m12723m() {
        if (!AbstractC7514d.m12226a(C7329a.m11708b().m11713f())) {
            return null;
        }
        return m12721k() + File.separator + "7934039a7252be16";
    }
}
