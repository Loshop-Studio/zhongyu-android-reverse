package p310z2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.regex.Pattern;
import p154k2.AbstractC8263a;
import p176m2.C8957f;
import p196o2.C9160b;
import p196o2.C9161c;
import p210p2.AbstractC9318a;
import p260u2.AbstractC9666a;
import p260u2.AbstractC9667b;
import p260u2.C9670e;
import p270v2.AbstractC9756d;

/* renamed from: z2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9993d {

    /* renamed from: a */
    public static final Pattern f17990a = Pattern.compile("UTDID\">([^<]+)");

    /* renamed from: b */
    public static Object f17991b = new Object();

    /* renamed from: c */
    public static String f17992c = "";

    /* renamed from: d */
    public static String f17993d = "";

    /* renamed from: e */
    public static String f17994e = "";

    /* renamed from: f */
    public static String f17995f = "";

    /* renamed from: g */
    public static String f17996g = "";

    /* renamed from: h */
    public static String f17997h = "";

    /* renamed from: i */
    public static String f17998i = "";

    /* renamed from: j */
    public static String f17999j = "";

    /* renamed from: k */
    public static String f18000k = "";

    /* renamed from: l */
    public static String f18001l = "";

    /* renamed from: m */
    public static String f18002m = "";

    /* renamed from: n */
    public static String f18003n = "";

    /* renamed from: a */
    public static String m17316a(String str) {
        try {
            if (str == null) {
                return null;
            }
            try {
                try {
                    byte[] bytes = str.getBytes();
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b10 : bArrDigest) {
                        stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
                    }
                    return stringBuffer.toString();
                } catch (Exception e10) {
                    if (AbstractC9666a.f17071c) {
                        Log.e("UMUtils", "MD5 e is " + e10);
                    }
                    return null;
                }
            } catch (Exception unused) {
                return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
            }
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "MD5 e is " + th);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m17317b(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
        } catch (Exception e10) {
            AbstractC9318a.m15200b(context, e10);
            return false;
        }
    }

    /* renamed from: c */
    public static String m17318c() {
        return "1234567890";
    }

    /* renamed from: d */
    public static String m17319d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app version code e is " + e10);
            }
            return "";
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app version code e is " + th);
            }
            return "";
        }
    }

    /* renamed from: e */
    public static String m17320e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app version name e is " + e10);
            }
            return "";
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app version name e is " + th);
            }
            return "";
        }
    }

    /* renamed from: f */
    public static String m17321f(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return !TextUtils.isEmpty(AbstractC8263a.f14359e) ? AbstractC8263a.f14359e : m17328m(context, "appkey");
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app key e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
            return null;
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get app key e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m17322g(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString("UMENG_APPKEY");
            if (string != null) {
                return string.trim();
            }
            if (!AbstractC9666a.f17071c) {
                return null;
            }
            AbstractC9756d.m16412k("MobclickAgent", "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m17323h(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return !TextUtils.isEmpty(AbstractC8263a.f14360f) ? AbstractC8263a.f14360f : m17328m(context, "channel");
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get channel e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
            return null;
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get channel e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
            return null;
        }
    }

    /* renamed from: i */
    public static String m17324i(Context context) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("UMENG_CHANNEL")) == null) {
                return null;
            }
            String string = obj.toString();
            if (string != null) {
                return string.trim();
            }
            if (!AbstractC9666a.f17071c) {
                return null;
            }
            AbstractC9756d.m16412k("MobclickAgent", "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Class m17325j(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m17326k(Context context) {
        Object objInvoke;
        Method method;
        Object objInvoke2;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                Class<?> cls = Class.forName("com.umeng.message.MessageSharedPrefs");
                Method method2 = cls.getMethod("getInstance", Context.class);
                if (method2 != null && (objInvoke = method2.invoke(cls, applicationContext)) != null && (method = cls.getMethod("getDeviceToken", null)) != null && (objInvoke2 = method.invoke(objInvoke, null)) != null && (objInvoke2 instanceof String)) {
                    return (String) objInvoke2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: l */
    public static String m17327l(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return m17328m(context, "last_appkey");
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get last app key e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
            return null;
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "get last app key e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
            return null;
        }
    }

    /* renamed from: m */
    public static String m17328m(Context context, String str) {
        SharedPreferences sharedPreferences;
        try {
            synchronized (f17991b) {
                if (context != null) {
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            if (m17334s(context)) {
                                sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                            } else {
                                String strM6289j = AbstractC6783b.m6289j(context);
                                sharedPreferences = context.getApplicationContext().getSharedPreferences(strM6289j + "_umeng_common_config", 0);
                            }
                            if (sharedPreferences == null) {
                                return null;
                            }
                            return sharedPreferences.getString(str, null);
                        }
                    } finally {
                    }
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static String m17329n(Context context) {
        if (!C6780a.m6260e("header_device_oaid") || Build.VERSION.SDK_INT <= 28) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("umeng_sp_oaid", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString("key_umeng_sp_oaid_required_time", "");
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static String m17330o(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: p */
    public static int m17331p(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: q */
    public static String m17332q(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("um_session_id", 0);
        return sharedPreferences != null ? sharedPreferences.getString("session_id", "") : "";
    }

    /* renamed from: r */
    public static String m17333r(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (AbstractC8263a.m13314g(applicationContext)) {
            return null;
        }
        return C9160b.m14737a(applicationContext).m14738b().m14747f();
    }

    /* renamed from: s */
    public static boolean m17334s(Context context) {
        try {
            String strM6282c = AbstractC6783b.m6282c(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(strM6282c) || TextUtils.isEmpty(packageName)) {
                return false;
            }
            return strM6282c.equals(packageName);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static void m17335t() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        if (AbstractC8263a.m13312e()) {
            C8957f.m14285f(2, "统计SDK版本号: 9.3.7");
        }
        f17992c = "9.3.7";
        String strM14742i = C9161c.m14742i();
        if (!TextUtils.isEmpty(strM14742i)) {
            f18001l = strM14742i;
            if (AbstractC8263a.m13312e()) {
                C8957f.m14285f(2, "ZID SDK版本号: " + strM14742i);
            }
        }
        Class clsM17325j = m17325j("com.umeng.analytics.game.GameSdkVersion");
        if (clsM17325j != null) {
            stringBuffer.append("g");
            try {
                String str = (String) clsM17325j.getDeclaredField("SDK_VERSION").get(clsM17325j);
                if (!TextUtils.isEmpty(str)) {
                    f17993d = str;
                    if (AbstractC8263a.m13312e()) {
                        C8957f.m14285f(2, "游戏统计SDK版本号: " + str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Class clsM17325j2 = m17325j("com.umeng.vt.V");
        if (clsM17325j2 != null) {
            stringBuffer.append("v");
            try {
                String str2 = (String) clsM17325j2.getDeclaredField("VERSION").get(clsM17325j2);
                if (!TextUtils.isEmpty(str2)) {
                    f18000k = str2;
                    if (AbstractC8263a.m13312e()) {
                        C8957f.m14285f(2, "可视化埋点SDK版本号: " + str2);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (m17325j("com.umeng.message.PushAgent") != null) {
            stringBuffer.append("p");
            Class clsM17325j3 = m17325j("com.umeng.message.MsgConstant");
            if (clsM17325j3 != null) {
                try {
                    String str3 = (String) clsM17325j3.getDeclaredField("SDK_VERSION").get(clsM17325j3);
                    if (!TextUtils.isEmpty(str3)) {
                        f17994e = str3;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "推送SDK版本号: " + str3);
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        if (m17325j("com.umeng.socialize.UMShareAPI") != null) {
            stringBuffer.append("s");
            Class clsM17325j4 = m17325j("com.umeng.a");
            if (clsM17325j4 != null) {
                try {
                    String str4 = (String) clsM17325j4.getDeclaredField("g").get(clsM17325j4);
                    if (!TextUtils.isEmpty(str4) && AbstractC8263a.m13312e()) {
                        C8957f.m14285f(2, "分享SDK版本号: " + str4);
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        if (m17325j("com.umeng.error.UMError") != null) {
            stringBuffer.append("e");
        }
        if (m17325j("com.umeng.umzid.ZIDManager") != null) {
            stringBuffer.append("z");
        }
        stringBuffer.append("i");
        if (AbstractC9667b.f17073a != 1 && m17325j("com.umeng.commonsdk.internal.UMOplus") != null) {
            stringBuffer.append("o");
        }
        if (m17325j("com.umeng.airec.RecAgent") != null) {
            stringBuffer.append("u");
            Class clsM17325j5 = m17325j("com.umeng.airec.BuildConfig");
            if (clsM17325j5 != null) {
                try {
                    String str5 = (String) clsM17325j5.getDeclaredField("VERSION_NAME").get(clsM17325j5);
                    if (!TextUtils.isEmpty(str5)) {
                        f17999j = str5;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "智能推荐SDK版本号: " + str5);
                        }
                    }
                } catch (Throwable unused5) {
                }
            }
        }
        if (m17325j("com.umeng.umverify.UMVerifyHelper") != null) {
            stringBuffer.append("n");
        }
        Class clsM17325j6 = m17325j("com.umeng.sms.UMSMS");
        if (clsM17325j6 != null) {
            stringBuffer.append("m");
            try {
                Method declaredMethod = clsM17325j6.getDeclaredMethod("getVersion", null);
                if (declaredMethod != null) {
                    String str6 = (String) declaredMethod.invoke(clsM17325j6, null);
                    if (!TextUtils.isEmpty(str6)) {
                        f17998i = str6;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "短信验证码SDK版本号: " + str6);
                        }
                    }
                }
            } catch (Throwable unused6) {
            }
        }
        try {
            Class clsM17325j7 = m17325j("com.umeng.umcrash.UMCrash");
            if (clsM17325j7 != null) {
                stringBuffer.append("c");
                Field declaredField = clsM17325j7.getDeclaredField("crashSdkVersion");
                declaredField.setAccessible(true);
                String str7 = (String) declaredField.get(clsM17325j7);
                if (!TextUtils.isEmpty(str7)) {
                    f17996g = str7;
                    if (AbstractC8263a.m13312e()) {
                        C8957f.m14285f(2, "APM SDK版本号: " + str7);
                    }
                }
            }
        } catch (Throwable unused7) {
        }
        Class clsM17325j8 = m17325j("com.umeng.umlink.MobclickLink");
        if (clsM17325j8 != null) {
            stringBuffer.append("l");
            try {
                Method declaredMethod2 = clsM17325j8.getDeclaredMethod("getVersion", null);
                if (declaredMethod2 != null) {
                    String str8 = (String) declaredMethod2.invoke(clsM17325j8, null);
                    if (!TextUtils.isEmpty(str8)) {
                        f18002m = str8;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "ULink SDK版本号: " + str8);
                        }
                    }
                }
            } catch (Throwable unused8) {
            }
        }
        Class clsM17325j9 = m17325j("com.umeng.cconfig.UMRemoteConfig");
        if (clsM17325j9 != null) {
            try {
                Method declaredMethod3 = clsM17325j9.getDeclaredMethod("getVersion", null);
                if (declaredMethod3 != null) {
                    stringBuffer.append("t");
                    String str9 = (String) declaredMethod3.invoke(clsM17325j9, null);
                    if (!TextUtils.isEmpty(str9)) {
                        f18003n = str9;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "UABTEST SDK版本号: " + str9);
                        }
                    }
                }
            } catch (Throwable unused9) {
            }
        }
        if (TextUtils.isEmpty(stringBuffer)) {
            return;
        }
        C9670e.f17090e = stringBuffer.toString();
        Log.i("MobclickAgent", "module init:" + C9670e.f17090e);
    }

    /* renamed from: u */
    public static void m17336u(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            m17339x(context, "appkey", str);
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set app key e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set app key e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: v */
    public static void m17337v(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            m17339x(context, "channel", str);
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set channel e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set channel e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: w */
    public static void m17338w(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            m17339x(context, "last_appkey", str);
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set last app key e is " + e10);
            }
            AbstractC9318a.m15200b(context, e10);
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                Log.e("UMUtils", "set last app key e is " + th);
            }
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: x */
    public static void m17339x(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        try {
            synchronized (f17991b) {
                if (context != null) {
                    try {
                        if (!TextUtils.isEmpty(str) && str2 != null) {
                            if (m17334s(context)) {
                                sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                            } else {
                                String strM6289j = AbstractC6783b.m6289j(context);
                                sharedPreferences = context.getApplicationContext().getSharedPreferences(strM6289j + "_umeng_common_config", 0);
                            }
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().putString(str, str2).commit();
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: y */
    public static void m17340y(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("um_session_id", 0);
        try {
            string = UUID.randomUUID().toString();
        } catch (Throwable unused) {
            string = "";
        }
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("session_id", string).commit();
        }
    }
}
