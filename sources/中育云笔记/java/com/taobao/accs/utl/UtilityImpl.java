package com.taobao.accs.utl;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.util.HMacUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public class UtilityImpl {
    public static final String NET_TYPE_MOBILE = "mobile";
    public static final String NET_TYPE_UNKNOWN = "unknown";
    public static final String NET_TYPE_WIFI = "wifi";
    public static final int TNET_FILE_NUM = 5;
    public static final int TNET_FILE_SIZE = 5242880;

    /* renamed from: a */
    private static final byte[] f13224a = new byte[0];

    /* renamed from: a */
    public static byte[] m10137a() {
        return null;
    }

    /* renamed from: b */
    public static int m10139b(Context context) {
        int i10 = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getInt(Constants.KEY_PROXY_PORT, -1);
        if (i10 > 0) {
            return i10;
        }
        if (m10128a(context) == null) {
            return -1;
        }
        try {
            return m10150e();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m10145c(Context context) {
        String str;
        int i10;
        synchronized (f13224a) {
            try {
                PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
                int i11 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.KEY_APP_VERSION_CODE, -1);
                String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(Constants.KEY_APP_VERSION_NAME, "");
                if (packageInfo != null) {
                    i10 = packageInfo.versionCode;
                    str = packageInfo.versionName;
                } else {
                    str = null;
                    i10 = 0;
                }
                String str2 = str;
                if (i11 == i10 && string.equals(str2)) {
                    return false;
                }
                m10163n(context);
                ALog.m10119i("UtilityImpl", "appVersionChanged", "oldV", Integer.valueOf(i11), "nowV", Integer.valueOf(i10), "oldN", string, "nowN", str2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void clearSharePreferences(Context context) {
        try {
            synchronized (f13224a) {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                    String string = sharedPreferences.getString("appkey", null);
                    String string2 = sharedPreferences.getString("app_sercet", null);
                    String string3 = sharedPreferences.getString(Constants.KEY_PROXY_HOST, null);
                    int i10 = sharedPreferences.getInt(Constants.KEY_PROXY_PORT, -1);
                    int i11 = sharedPreferences.getInt("version", -1);
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                    editorEdit.clear();
                    if (!TextUtils.isEmpty(string)) {
                        editorEdit.putString("appkey", string);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        editorEdit.putString("app_sercet", string2);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        editorEdit.putString(Constants.KEY_PROXY_HOST, string3);
                    }
                    if (i10 > 0) {
                        editorEdit.putInt(Constants.KEY_PROXY_PORT, i10);
                    }
                    if (i11 > 0) {
                        editorEdit.putInt("version", i11);
                    }
                    editorEdit.apply();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            ALog.m10117e("UtilityImpl", "clearSharePreferences", th2, new Object[0]);
        }
    }

    /* renamed from: d */
    public static boolean m10149d(Context context) {
        String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(context);
        if (TextUtils.isEmpty(agooCustomServiceName)) {
            return false;
        }
        ComponentName componentName = new ComponentName(context, agooCustomServiceName);
        PackageManager packageManager = context.getPackageManager();
        if (!componentName.getPackageName().equals("!")) {
            return packageManager.getServiceInfo(componentName, 128).enabled;
        }
        ALog.m10118e("UtilityImpl", "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
        return false;
    }

    public static void disableService(Context context) {
        try {
            m10142b(context, AdapterUtilityImpl.channelService);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static String m10151e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo == null ? "unknown" : activeNetworkInfo.getType() == 1 ? NET_TYPE_WIFI : activeNetworkInfo.getType() == 0 ? NET_TYPE_MOBILE : "unknown";
        } catch (Throwable th) {
            th.printStackTrace();
            return "unknown";
        }
    }

    public static void enableService(Context context) {
        m10133a(context, AdapterUtilityImpl.channelService);
    }

    /* renamed from: f */
    public static String m10154f(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo == null ? "unknown" : activeNetworkInfo.getType() == 1 ? NET_TYPE_WIFI : activeNetworkInfo.getType() == 0 ? NET_TYPE_MOBILE : "unknown";
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "getNetworkTypeExt", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m10156g(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = GlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String getDeviceId(Context context) {
        return AdapterUtilityImpl.getDeviceId(context);
    }

    public static String getUtdid(String str, Context context) {
        String string;
        try {
            synchronized (f13224a) {
                string = context.getSharedPreferences(str, 0).getString("utdid", getDeviceId(context));
            }
            return string;
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "getUtdid", th, new Object[0]);
            return "";
        }
    }

    public static List<String> getUtdids(String str, Context context) {
        ArrayList arrayList;
        try {
            synchronized (f13224a) {
                try {
                    String string = context.getSharedPreferences(str, 0).getString(Constants.SP_KEY_UTDID_LIST, null);
                    arrayList = new ArrayList();
                    if (string != null) {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            arrayList.add(jSONArray.getString(i10));
                        }
                    }
                    arrayList.add(getDeviceId(context));
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            ALog.m10117e("UtilityImpl", "getUtdidList", th2, new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public static long m10157h(Context context) {
        long j10 = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0);
            long j11 = sharedPreferences.getLong(Constants.SP_KEY_SERVICE_START, 0L);
            long j12 = j11 > 0 ? sharedPreferences.getLong(Constants.SP_KEY_SERVICE_END, 0L) - j11 : 0L;
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(Constants.SP_KEY_SERVICE_START, 0L);
                editorEdit.putLong(Constants.SP_KEY_SERVICE_END, 0L);
                editorEdit.apply();
                return j12;
            } catch (Throwable th) {
                th = th;
                j10 = j12;
                ALog.m10117e("UtilityImpl", "getServiceAliveTime:", th, new Object[0]);
                return j10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void hitUtdid(String str, Context context, String str2) {
        try {
            synchronized (f13224a) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str2);
                editorEdit.putString(Constants.SP_KEY_UTDID_LIST, jSONArray.toString());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "hitUtdid", th, new Object[0]);
        }
    }

    /* renamed from: i */
    public static String m10158i(Context context) {
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    public static String m10159j(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 4).getString(Constants.SP_KEY_COOKIE_SEC, null);
        } catch (Exception e10) {
            ALog.m10117e("UtilityImpl", "reStoreCookie fail", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: k */
    public static String m10160k(Context context) {
        return AdapterUtilityImpl.isNotificationEnabled(context);
    }

    /* renamed from: l */
    public static boolean m10161l(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(Constants.SP_KEY_ENABLE_CHANNEL_PROCESS, true);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static List<String> m10162m(Context context) {
        try {
            String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(Constants.SP_KEY_CHANNEL_INIT, null);
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m10163n(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putInt(Constants.KEY_APP_VERSION_CODE, GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            editorEdit.putString(Constants.KEY_APP_VERSION_NAME, GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            editorEdit.apply();
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "saveAppVersion", th, new Object[0]);
        }
    }

    public static void saveChannelInitClass(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
            String string = sharedPreferences.getString(Constants.SP_KEY_CHANNEL_INIT, null);
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
            }
            if (arrayList.contains(str)) {
                return;
            }
            arrayList.add(str);
            JSONArray jSONArray2 = new JSONArray();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                jSONArray2.put(arrayList.get(i11));
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(Constants.SP_KEY_CHANNEL_INIT, jSONArray2.toString());
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void saveUtdid(String str, Context context) {
        try {
            synchronized (f13224a) {
                try {
                    String deviceId = getDeviceId(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    String string = sharedPreferences.getString(Constants.SP_KEY_UTDID_LIST, null);
                    if (string == null || !string.contains(deviceId)) {
                        JSONArray jSONArray = string == null ? new JSONArray() : new JSONArray(string);
                        jSONArray.put(deviceId);
                        editorEdit.putString(Constants.SP_KEY_UTDID_LIST, jSONArray.toString());
                    }
                    editorEdit.putString("utdid", deviceId);
                    editorEdit.apply();
                } finally {
                }
            }
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "saveUtdid", th, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean utdidChanged(String str, Context context) {
        boolean z10;
        try {
            try {
                synchronized (f13224a) {
                    try {
                        String deviceId = getDeviceId(context);
                        return !context.getSharedPreferences(str, 0).getString("utdid", deviceId).equals(deviceId);
                    } catch (Throwable th) {
                        th = th;
                        z10 = 0;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            ALog.m10117e("UtilityImpl", "saveUtdid", th, new Object[0]);
                            return z10;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = str;
            }
        } catch (Throwable th4) {
            th = th4;
            z10 = 0;
        }
    }

    /* renamed from: a */
    public static String m10128a(Context context) {
        String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getString(Constants.KEY_PROXY_HOST, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM10147d = m10147d();
        if (TextUtils.isEmpty(strM10147d)) {
            return null;
        }
        return strM10147d;
    }

    /* renamed from: b */
    public static boolean m10142b(Context context, String str) {
        ComponentName componentName = new ComponentName(context, str);
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.m10116d("UtilityImpl", "disableComponent,comptName=" + componentName, new Object[0]);
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: g */
    public static String m10155g() throws ClassNotFoundException {
        Class<?>[] clsArr = {String.class};
        Object[] objArr = {"ro.build.version.emui"};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.m10116d("UtilityImpl", "getEmuiVersion", "result", str);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception e10) {
            ALog.m10117e("UtilityImpl", "getEmuiVersion", e10, new Object[0]);
            return "";
        }
    }

    /* renamed from: a */
    public static void m10133a(Context context, String str) {
        ComponentName componentName = new ComponentName(context, str);
        ALog.m10116d("UtilityImpl", "enableComponent", "comptName", componentName);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            ALog.m10121w("UtilityImpl", "enableComponent", th, new Object[0]);
        }
    }

    /* renamed from: e */
    public static int m10150e() {
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m10140b() {
        return "null";
    }

    /* renamed from: e */
    public static void m10152e(Context context, String str) {
        try {
            synchronized (f13224a) {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                    String string = sharedPreferences.getString("appkey", "");
                    if (!TextUtils.isEmpty(str) && !string.equals(str) && !string.contains(str)) {
                        if (!TextUtils.isEmpty(string)) {
                            str = string + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str;
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString("appkey", str);
                        editorEdit.apply();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    public static String m10153f() {
        String str = m10147d() + ":" + m10150e();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m10116d("UtilityImpl", "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    /* renamed from: b */
    public static String m10141b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m10147d() {
        return System.getProperty("http.proxyHost");
    }

    /* renamed from: a */
    public static String m10127a(long j10) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(j10));
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "formatDay", th, new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m10143b(Context context, boolean z10) {
        if (m10161l(context)) {
            return false;
        }
        ALog.m10116d("UtilityImpl", "channel process is disabled, kill it", new Object[0]);
        if (!z10) {
            return true;
        }
        Process.killProcess(Process.myPid());
        return true;
    }

    /* renamed from: d */
    public static String m10148d(Context context, String str) {
        try {
            File externalFilesDir = context.getExternalFilesDir("emastnetlogs");
            if (externalFilesDir == null || !externalFilesDir.exists() || !externalFilesDir.canWrite()) {
                externalFilesDir = context.getDir("emaslogs", 0);
            }
            ALog.m10116d("UtilityImpl", "getTnetLogFilePath :" + externalFilesDir, new Object[0]);
            return externalFilesDir + MqttTopic.TOPIC_LEVEL_SEPARATOR + str.toLowerCase();
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "getTnetLogFilePath", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m10146c(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ALog.m10118e("UtilityImpl", "package not exist", "pkg", str);
            return false;
        }
    }

    /* renamed from: a */
    public static String m10129a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            ALog.m10118e("UtilityImpl", "getAppSign appKey null", new Object[0]);
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                return HMacUtil.hmacSha1Hex(str2.getBytes(), (str + str3).getBytes());
            }
            ALog.m10118e("UtilityImpl", "getAppSign secret null", new Object[0]);
            return null;
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "getAppSign", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static long m10144c() {
        return AdapterUtilityImpl.getUsableSpace();
    }

    /* renamed from: a */
    public static int m10124a(Context context, String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        TextUtils.isEmpty(str2);
        return -1;
    }

    /* renamed from: a */
    public static byte[] m10138a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            return null;
        }
        ALog.m10119i("UtilityImpl", "get sslticket input null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m10134a(Context context, String str, long j10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0).edit();
            editorEdit.putLong(str, j10);
            editorEdit.apply();
            ALog.m10116d("UtilityImpl", "setServiceTime:" + j10, new Object[0]);
        } catch (Throwable th) {
            ALog.m10117e("UtilityImpl", "setServiceTime:", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static int m10125a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static String m10130a(Throwable th) {
        return AdapterUtilityImpl.getStackMsg(th);
    }

    /* renamed from: a */
    public static String m10126a(int i10) {
        try {
            return String.valueOf(i10);
        } catch (Exception e10) {
            ALog.m10117e("UtilityImpl", "int2String", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m10132a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String strM10131a = m10131a(entry.getValue());
                    if (!TextUtils.isEmpty(strM10131a)) {
                        if (!key.startsWith(":")) {
                            key = key.toLowerCase(Locale.US);
                        }
                        map2.put(key, strM10131a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return map2;
    }

    /* renamed from: a */
    public static String m10131a(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(list.get(i10));
            if (i10 < size - 1) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m10136a(Context context, boolean z10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putBoolean(Constants.SP_KEY_ENABLE_CHANNEL_PROCESS, z10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m10135a(Context context, List<String> list) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
            String string = sharedPreferences.getString(Constants.SP_KEY_CHANNEL_INIT, null);
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
            }
            if (arrayList.removeAll(list)) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    jSONArray2.put(arrayList.get(i11));
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(Constants.SP_KEY_CHANNEL_INIT, jSONArray2.toString());
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
