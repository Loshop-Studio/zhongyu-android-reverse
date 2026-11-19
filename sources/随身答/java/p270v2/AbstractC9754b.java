package p270v2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import com.blankj.utilcode.constant.TimeConstants;
import com.google.android.material.timepicker.TimeModel;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.statistics.common.DeviceTypeEnum;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import p260u2.AbstractC9666a;
import p310z2.AbstractC9993d;

/* renamed from: v2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9754b {

    /* renamed from: a */
    public static final String f17266a = "v2.b";

    /* renamed from: b */
    public static DeviceTypeEnum f17267b = DeviceTypeEnum.DEFAULT;

    /* renamed from: c */
    public static String f17268c = "";

    /* renamed from: d */
    public static String f17269d = "";

    /* renamed from: e */
    public static String f17270e = "";

    /* renamed from: f */
    public static String f17271f = "";

    /* renamed from: A */
    public static String m16346A(Context context) {
        if (context == null) {
            return null;
        }
        if (m16389x(context) == null) {
            return null;
        }
        int i9 = context.getResources().getConfiguration().mcc;
        int i10 = context.getResources().getConfiguration().mnc;
        if (i9 != 0) {
            String strValueOf = String.valueOf(i10);
            if (i10 < 10) {
                strValueOf = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i9));
            stringBuffer.append(strValueOf);
            return stringBuffer.toString();
        }
        return null;
    }

    /* renamed from: B */
    public static String m16347B(Context context) {
        if (!TextUtils.isEmpty(f17268c)) {
            return f17268c;
        }
        String strM16348C = "";
        if (C6780a.m6260e("header_device_id_mac")) {
            if (context == null) {
                return "";
            }
            strM16348C = m16348C();
            if (TextUtils.isEmpty(strM16348C)) {
                strM16348C = m16349D(context);
            }
        }
        f17268c = strM16348C;
        return strM16348C;
    }

    /* renamed from: C */
    public static String m16348C() {
        try {
            if (!C6780a.m6260e("header_device_id_mac")) {
                return null;
            }
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if ("wlan0".equals(networkInterfaceNextElement.getName()) || "eth0".equals(networkInterfaceNextElement.getName())) {
                    byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (byte b10 : hardwareAddress) {
                            sb.append(String.format("%02X:", Byte.valueOf(b10)));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString().toLowerCase(Locale.getDefault());
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static String m16349D(Context context) {
        if (context == null) {
            return "";
        }
        try {
            if (C6780a.m6260e("header_device_id_mac")) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (m16367b(context, "android.permission.ACCESS_WIFI_STATE")) {
                    return wifiManager != null ? wifiManager.getConnectionInfo().getMacAddress() : "";
                }
                if (AbstractC9666a.f17071c) {
                    AbstractC9756d.m16417p(f17266a, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                }
            }
            return "";
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                AbstractC9756d.m16417p(f17266a, "Could not get mac address." + th.toString());
            }
            return "";
        }
    }

    /* renamed from: E */
    public static String[] m16350E(Context context) {
        String[] strArr = {"", ""};
        if (context != null) {
            try {
                if (!m16367b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    strArr[0] = "";
                    return strArr;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    strArr[0] = "";
                    return strArr;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "Wi-Fi";
                    return strArr;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    /* renamed from: F */
    public static String m16351F(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (m16367b(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                return telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: G */
    public static int m16352G(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (m16367b(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    /* renamed from: H */
    public static String m16353H(Context context) {
        if (C6780a.m6260e("header_device_oaid")) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("umeng_sp_oaid", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("key_umeng_sp_oaid", "");
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* renamed from: I */
    public static String m16354I(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    /* renamed from: J */
    public static int[] m16355J(Context context) {
        int iM16365T;
        int iM16365T2;
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return null;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                iM16365T = m16365T(displayMetrics, "noncompatWidthPixels");
                iM16365T2 = m16365T(displayMetrics, "noncompatHeightPixels");
            } else {
                iM16365T = -1;
                iM16365T2 = -1;
            }
            if (iM16365T == -1 || iM16365T2 == -1) {
                iM16365T = displayMetrics.widthPixels;
                iM16365T2 = displayMetrics.heightPixels;
            }
            int[] iArr = new int[2];
            if (iM16365T > iM16365T2) {
                iArr[0] = iM16365T2;
                iArr[1] = iM16365T;
                return iArr;
            }
            iArr[0] = iM16365T;
            iArr[1] = iM16365T2;
            return iArr;
        } catch (Throwable th) {
            if (AbstractC9666a.f17071c) {
                AbstractC9756d.m16405d(f17266a, "read resolution fail", th);
            }
            return null;
        }
    }

    /* renamed from: K */
    public static String m16356K() {
        if (!C6780a.m6260e("header_device_id_serialNo")) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return Build.SERIAL;
        }
        try {
            Class<?> cls = Class.forName("android.os.Build");
            return (String) cls.getMethod("getSerial", null).invoke(cls, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: L */
    public static String m16357L() {
        String str;
        if (!C6780a.m6260e("header_device_id_serialNo")) {
            str = "";
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.os.Build");
                str = (String) cls.getMethod("getSerial", null).invoke(cls, null);
            } catch (Throwable unused) {
            }
        } else {
            str = Build.SERIAL;
        }
        if (AbstractC9666a.f17071c) {
            AbstractC9756d.m16412k(f17266a, "getDeviceId, serial no: " + str);
        }
        return str;
    }

    /* renamed from: M */
    public static String m16358M(Context context) {
        Properties propertiesM16375j = m16375j();
        try {
            String property = propertiesM16375j.getProperty("ro.miui.ui.version.name");
            return TextUtils.isEmpty(property) ? m16363R() ? "Flyme" : m16362Q(propertiesM16375j) ? "Emui" : !TextUtils.isEmpty(m16361P(propertiesM16375j)) ? "YunOS" : property : "MIUI";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: N */
    public static String m16359N(Context context) {
        Properties propertiesM16375j = m16375j();
        try {
            String property = propertiesM16375j.getProperty("ro.miui.ui.version.name");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            try {
                property = m16363R() ? m16383r(propertiesM16375j) : m16362Q(propertiesM16375j) ? m16382q(propertiesM16375j) : m16361P(propertiesM16375j);
                return property;
            } catch (Throwable unused) {
                return property;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: O */
    public static int m16360O(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(m16390y(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / TimeConstants.HOUR;
            }
        } catch (Throwable th) {
            AbstractC9756d.m16410i(f17266a, "error in getTimeZone", th);
        }
        return 8;
    }

    /* renamed from: P */
    public static String m16361P(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Q */
    public static boolean m16362Q(Properties properties) {
        return properties.getProperty("ro.build.hw_emui_api_level", null) != null;
    }

    /* renamed from: R */
    public static boolean m16363R() {
        try {
            Build.class.getMethod("hasSmartBar", null);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: S */
    public static boolean m16364S(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(m16350E(context)[0]);
    }

    /* renamed from: T */
    public static int m16365T(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m16366a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i9 = 0; i9 < bArr.length; i9++) {
            String hexString = Integer.toHexString(bArr[i9]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i9 < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m16367b(Context context, String str) {
        if (context == null) {
            return false;
        }
        return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
    }

    /* renamed from: c */
    public static String m16368c(Context context) {
        if (!C6780a.m6260e("header_device_id_android_id") || context == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            if (!AbstractC9666a.f17071c) {
                return null;
            }
            AbstractC9756d.m16414m("can't read android id");
            return null;
        }
    }

    /* renamed from: d */
    public static String m16369d(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(m16354I(context), 64).signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m16370e(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return m16366a(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(m16354I(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m16371f(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (!AbstractC9666a.f17071c) {
                return null;
            }
            AbstractC9756d.m16411j(f17266a, th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m16372g(Context context) {
        try {
            return m16366a(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(m16354I(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m16373h(Context context) {
        return AbstractC9993d.m17319d(context);
    }

    /* renamed from: i */
    public static String m16374i(Context context) {
        return AbstractC9993d.m17320e(context);
    }

    /* renamed from: j */
    public static Properties m16375j() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable unused) {
                return properties;
            }
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                return properties;
            } catch (Throwable unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return properties;
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: k */
    public static String m16376k() {
        String line = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                line = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                AbstractC9756d.m16405d(f17266a, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e10) {
            AbstractC9756d.m16405d(f17266a, "Could not open file /proc/cpuinfo", e10);
        }
        return line != null ? line.substring(line.indexOf(58) + 1).trim() : "";
    }

    /* renamed from: l */
    public static String m16377l(Context context) {
        return AbstractC9666a.m16114a() == 2 ? m16378m(context) : m16379n(context);
    }

    /* renamed from: m */
    public static String m16378m(Context context) {
        String strM16357L = "";
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            String strM16353H = m16353H(context);
            f17267b = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(strM16353H)) {
                return strM16353H;
            }
            String strM16387v = m16387v(context);
            f17267b = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(strM16387v)) {
                return strM16387v;
            }
            String strM16368c = m16368c(context);
            f17267b = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(strM16368c)) {
                return strM16368c;
            }
            String strM16357L2 = m16357L();
            f17267b = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(strM16357L2)) {
                return strM16357L2;
            }
            String strM16348C = m16348C();
            DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.MAC;
            f17267b = deviceTypeEnum;
            if (!TextUtils.isEmpty(strM16348C)) {
                return strM16348C;
            }
            String strM16349D = m16349D(context);
            f17267b = deviceTypeEnum;
            return strM16349D;
        }
        if (C6780a.m6260e("header_device_id_android_id")) {
            strM16357L = Settings.Secure.getString(context.getContentResolver(), "android_id");
            f17267b = DeviceTypeEnum.ANDROIDID;
            if (AbstractC9666a.f17071c) {
                AbstractC9756d.m16412k(f17266a, "getDeviceId: ANDROID_ID: " + strM16357L);
            }
        }
        if (TextUtils.isEmpty(strM16357L)) {
            strM16357L = m16357L();
            f17267b = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(strM16357L)) {
                strM16357L = m16385t(context);
                f17267b = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(strM16357L)) {
                    strM16357L = m16348C();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    f17267b = deviceTypeEnum2;
                    if (TextUtils.isEmpty(strM16357L)) {
                        strM16357L = m16349D(context);
                        f17267b = deviceTypeEnum2;
                        if (AbstractC9666a.f17071c) {
                            AbstractC9756d.m16412k(f17266a, "getDeviceId, MAC: " + strM16357L);
                        }
                    }
                }
            }
        }
        return strM16357L;
    }

    /* renamed from: n */
    public static String m16379n(Context context) {
        String strM16385t = "";
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            String strM16353H = m16353H(context);
            f17267b = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(strM16353H)) {
                return strM16353H;
            }
            String strM16387v = m16387v(context);
            f17267b = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(strM16387v)) {
                return strM16387v;
            }
            String strM16368c = m16368c(context);
            f17267b = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(strM16368c)) {
                return strM16368c;
            }
            String strM16357L = m16357L();
            f17267b = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(strM16357L)) {
                return strM16357L;
            }
            String strM16348C = m16348C();
            DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.MAC;
            f17267b = deviceTypeEnum;
            if (!TextUtils.isEmpty(strM16348C)) {
                return strM16348C;
            }
            String strM16349D = m16349D(context);
            f17267b = deviceTypeEnum;
            return strM16349D;
        }
        strM16385t = m16385t(context);
        f17267b = DeviceTypeEnum.IMEI;
        if (TextUtils.isEmpty(strM16385t)) {
            strM16385t = m16357L();
            f17267b = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(strM16385t)) {
                if (C6780a.m6260e("header_device_id_android_id")) {
                    strM16385t = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    f17267b = DeviceTypeEnum.ANDROIDID;
                    if (AbstractC9666a.f17071c) {
                        AbstractC9756d.m16412k(f17266a, "getDeviceId, ANDROID_ID: " + strM16385t);
                    }
                }
                if (TextUtils.isEmpty(strM16385t)) {
                    strM16385t = m16348C();
                    DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
                    f17267b = deviceTypeEnum2;
                    if (TextUtils.isEmpty(strM16385t)) {
                        strM16385t = m16349D(context);
                        f17267b = deviceTypeEnum2;
                        if (AbstractC9666a.f17071c) {
                            AbstractC9756d.m16412k(f17266a, "getDeviceId, MAC: " + strM16385t);
                        }
                    }
                }
            }
        }
        return strM16385t;
    }

    /* renamed from: o */
    public static String m16380o(Context context) {
        return AbstractC9755c.m16394c(m16377l(context));
    }

    /* renamed from: p */
    public static String m16381p(Context context) {
        if (context != null) {
            try {
                if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                    return "Tablet";
                }
            } catch (Throwable unused) {
            }
        }
        return "Phone";
    }

    /* renamed from: q */
    public static String m16382q(Properties properties) {
        try {
            return properties.getProperty("ro.build.hw_emui_api_level", null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static String m16383r(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static Activity m16384s(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    /* renamed from: t */
    public static String m16385t(Context context) {
        if (!TextUtils.isEmpty(f17269d)) {
            return f17269d;
        }
        String deviceId = "";
        if (C6780a.m6260e("header_device_id_imei")) {
            if (context == null) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager != null) {
                try {
                    if (m16367b(context, "android.permission.READ_PHONE_STATE")) {
                        deviceId = telephonyManager.getDeviceId();
                        if (AbstractC9666a.f17071c) {
                            AbstractC9756d.m16412k(f17266a, "getDeviceId, IMEI: " + deviceId);
                        }
                    }
                } catch (Throwable th) {
                    if (AbstractC9666a.f17071c) {
                        AbstractC9756d.m16415n(f17266a, "No IMEI.", th);
                    }
                }
            }
        }
        f17269d = deviceId;
        return deviceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m16386u(android.content.Context r12) {
        /*
            r12 = 0
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L6b
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.net.SocketException -> L6b
            int r1 = r0.size()     // Catch: java.net.SocketException -> L6b
            r2 = 0
            r3 = r12
            r4 = r2
        L10:
            if (r4 >= r1) goto L6f
            java.lang.Object r5 = r0.get(r4)     // Catch: java.net.SocketException -> L4e
            int r4 = r4 + 1
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch: java.net.SocketException -> L4e
            java.util.Enumeration r6 = r5.getInetAddresses()     // Catch: java.net.SocketException -> L4e
            java.util.ArrayList r6 = java.util.Collections.list(r6)     // Catch: java.net.SocketException -> L4e
            int r7 = r6.size()     // Catch: java.net.SocketException -> L4e
            r8 = r2
        L27:
            if (r8 >= r7) goto L10
            java.lang.Object r9 = r6.get(r8)     // Catch: java.net.SocketException -> L4e
            int r8 = r8 + 1
            java.net.InetAddress r9 = (java.net.InetAddress) r9     // Catch: java.net.SocketException -> L4e
            boolean r10 = r9.isLoopbackAddress()     // Catch: java.net.SocketException -> L4e
            java.lang.String r11 = "dummy"
            if (r10 != 0) goto L50
            boolean r10 = r9 instanceof java.net.Inet4Address     // Catch: java.net.SocketException -> L4e
            if (r10 == 0) goto L50
            java.lang.String r10 = r5.getDisplayName()     // Catch: java.net.SocketException -> L4e
            boolean r10 = r10.contains(r11)     // Catch: java.net.SocketException -> L4e
            if (r10 != 0) goto L50
            if (r12 != 0) goto L50
            java.lang.String r12 = r9.getHostAddress()     // Catch: java.net.SocketException -> L4e
            goto L50
        L4e:
            r12 = r3
            goto L6b
        L50:
            boolean r10 = r9.isLoopbackAddress()     // Catch: java.net.SocketException -> L4e
            if (r10 != 0) goto L27
            boolean r10 = r9 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L4e
            if (r10 == 0) goto L27
            java.lang.String r10 = r5.getDisplayName()     // Catch: java.net.SocketException -> L4e
            boolean r10 = r10.contains(r11)     // Catch: java.net.SocketException -> L4e
            if (r10 != 0) goto L27
            if (r3 != 0) goto L27
            java.lang.String r3 = r9.getHostAddress()     // Catch: java.net.SocketException -> L4e
            goto L27
        L6b:
            java.lang.String r0 = "SocketException"
            r3 = r12
            r12 = r0
        L6f:
            if (r12 == 0) goto L72
            return r12
        L72:
            if (r3 != 0) goto L76
            java.lang.String r3 = "null"
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p270v2.AbstractC9754b.m16386u(android.content.Context):java.lang.String");
    }

    /* renamed from: v */
    public static String m16387v(Context context) {
        try {
            return C6780a.m6260e("header_tracking_idfa") ? AbstractC9759g.m16436a(context) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: w */
    public static String m16388w(Context context) throws NoSuchMethodException, SecurityException {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(f17269d)) {
            return f17269d;
        }
        String deviceId = null;
        try {
            if (C6780a.m6260e("header_device_id_imei") && context != null && (telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)) != null && m16367b(context, "android.permission.READ_PHONE_STATE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Method method = telephonyManager.getClass().getMethod("getImei", null);
                        method.setAccessible(true);
                        deviceId = (String) method.invoke(telephonyManager, null);
                    } catch (Exception unused) {
                    }
                    if (TextUtils.isEmpty(deviceId)) {
                        deviceId = telephonyManager.getDeviceId();
                    }
                } else {
                    deviceId = telephonyManager.getDeviceId();
                }
            }
        } catch (Exception e10) {
            if (AbstractC9666a.f17071c) {
                AbstractC9756d.m16416o("No IMEI.", e10);
            }
        }
        f17269d = deviceId;
        return deviceId;
    }

    /* renamed from: x */
    public static String m16389x(Context context) {
        if (!TextUtils.isEmpty(f17271f)) {
            return f17271f;
        }
        String subscriberId = null;
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (C6780a.m6260e("internal_imsi")) {
            try {
                if (m16367b(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                    subscriberId = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
        }
        f17271f = subscriberId;
        return subscriberId;
    }

    /* renamed from: y */
    public static Locale m16390y(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            AbstractC9756d.m16407f(f17266a, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    /* renamed from: z */
    public static String[] m16391z(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context != null) {
            try {
                Locale localeM16390y = m16390y(context);
                if (localeM16390y != null) {
                    strArr[0] = localeM16390y.getCountry();
                    strArr[1] = localeM16390y.getLanguage();
                }
                if (TextUtils.isEmpty(strArr[0])) {
                    strArr[0] = "Unknown";
                }
                if (TextUtils.isEmpty(strArr[1])) {
                    strArr[1] = "Unknown";
                }
            } catch (Throwable th) {
                AbstractC9756d.m16405d(f17266a, "error in getLocaleInfo", th);
                return strArr;
            }
        }
        return strArr;
    }
}
