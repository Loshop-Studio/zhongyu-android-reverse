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
import org.json.JSONArray;

/* loaded from: classes.dex */
public class UtilityImpl {
    public static final String NET_TYPE_MOBILE = "mobile";
    public static final String NET_TYPE_UNKNOWN = "unknown";
    public static final String NET_TYPE_WIFI = "wifi";
    public static final int TNET_FILE_NUM = 5;
    public static final int TNET_FILE_SIZE = 5242880;

    /* renamed from: a */
    private static final byte[] f7826a = new byte[0];

    /* renamed from: a */
    public static String m6102a(Context context) {
        String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getString(Constants.KEY_PROXY_HOST, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM6121d = m6121d();
        if (TextUtils.isEmpty(strM6121d)) {
            return null;
        }
        return strM6121d;
    }

    /* renamed from: a */
    public static byte[] m6111a() {
        return null;
    }

    /* renamed from: b */
    public static int m6113b(Context context) {
        int i4 = context.getSharedPreferences(Constants.SP_FILE_NAME, 4).getInt(Constants.KEY_PROXY_PORT, -1);
        if (i4 > 0) {
            return i4;
        }
        if (m6102a(context) == null) {
            return -1;
        }
        try {
            return m6124e();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static String m6114b() {
        return "null";
    }

    /* renamed from: c */
    public static boolean m6119c(Context context) {
        String str;
        int i4;
        synchronized (f7826a) {
            PackageInfo packageInfo = GlobalClientInfo.getInstance(context).getPackageInfo();
            int i5 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.KEY_APP_VERSION_CODE, -1);
            String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(Constants.KEY_APP_VERSION_NAME, "");
            if (packageInfo != null) {
                i4 = packageInfo.versionCode;
                str = packageInfo.versionName;
            } else {
                str = null;
                i4 = 0;
            }
            if (i5 == i4 && string.equals(str)) {
                return false;
            }
            m6137n(context);
            ALog.m6093i("UtilityImpl", "appVersionChanged", "oldV", Integer.valueOf(i5), "nowV", Integer.valueOf(i4), "oldN", string, "nowN", str);
            return true;
        }
    }

    public static void clearSharePreferences(Context context) {
        try {
            synchronized (f7826a) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", null);
                String string2 = sharedPreferences.getString("app_sercet", null);
                String string3 = sharedPreferences.getString(Constants.KEY_PROXY_HOST, null);
                int i4 = sharedPreferences.getInt(Constants.KEY_PROXY_PORT, -1);
                int i5 = sharedPreferences.getInt(Constants.SP_KEY_VERSION, -1);
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
                if (i4 > 0) {
                    editorEdit.putInt(Constants.KEY_PROXY_PORT, i4);
                }
                if (i5 > 0) {
                    editorEdit.putInt(Constants.SP_KEY_VERSION, i5);
                }
                editorEdit.apply();
            }
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "clearSharePreferences", th, new Object[0]);
        }
    }

    /* renamed from: d */
    public static boolean m6123d(Context context) {
        String agooCustomServiceName = AdapterGlobalClientInfo.getAgooCustomServiceName(context);
        if (TextUtils.isEmpty(agooCustomServiceName)) {
            return false;
        }
        ComponentName componentName = new ComponentName(context, agooCustomServiceName);
        PackageManager packageManager = context.getPackageManager();
        if (!componentName.getPackageName().equals("!")) {
            return packageManager.getServiceInfo(componentName, 128).enabled;
        }
        ALog.m6092e("UtilityImpl", "getAgooServiceEnabled,exception,comptName.getPackageName()=" + componentName.getPackageName(), new Object[0]);
        return false;
    }

    public static void disableService(Context context) {
        try {
            m6116b(context, AdapterUtilityImpl.channelService);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static String m6125e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo == null ? NET_TYPE_UNKNOWN : activeNetworkInfo.getType() == 1 ? NET_TYPE_WIFI : activeNetworkInfo.getType() == 0 ? NET_TYPE_MOBILE : NET_TYPE_UNKNOWN;
        } catch (Throwable th) {
            th.printStackTrace();
            return NET_TYPE_UNKNOWN;
        }
    }

    public static void enableService(Context context) {
        m6107a(context, AdapterUtilityImpl.channelService);
    }

    /* renamed from: f */
    public static String m6128f(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo == null ? NET_TYPE_UNKNOWN : activeNetworkInfo.getType() == 1 ? NET_TYPE_WIFI : activeNetworkInfo.getType() == 0 ? NET_TYPE_MOBILE : NET_TYPE_UNKNOWN;
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "getNetworkTypeExt", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m6130g(Context context) {
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
            synchronized (f7826a) {
                string = context.getSharedPreferences(str, 0).getString("utdid", getDeviceId(context));
            }
            return string;
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "getUtdid", th, new Object[0]);
            return "";
        }
    }

    public static List<String> getUtdids(String str, Context context) {
        ArrayList arrayList;
        try {
            synchronized (f7826a) {
                String string = context.getSharedPreferences(str, 0).getString(Constants.SP_KEY_UTDID_LIST, null);
                arrayList = new ArrayList();
                if (string != null) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        arrayList.add(jSONArray.getString(i4));
                    }
                }
                arrayList.add(getDeviceId(context));
            }
            return arrayList;
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "getUtdidList", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public static long m6131h(Context context) {
        long j4 = 0;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0);
            long j5 = sharedPreferences.getLong(Constants.SP_KEY_SERVICE_START, 0L);
            long j6 = j5 > 0 ? sharedPreferences.getLong(Constants.SP_KEY_SERVICE_END, 0L) - j5 : 0L;
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(Constants.SP_KEY_SERVICE_START, 0L);
                editorEdit.putLong(Constants.SP_KEY_SERVICE_END, 0L);
                editorEdit.apply();
                return j6;
            } catch (Throwable th) {
                th = th;
                j4 = j6;
                ALog.m6091e("UtilityImpl", "getServiceAliveTime:", th, new Object[0]);
                return j4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void hitUtdid(String str, Context context, String str2) {
        try {
            synchronized (f7826a) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str2);
                editorEdit.putString(Constants.SP_KEY_UTDID_LIST, jSONArray.toString());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "hitUtdid", th, new Object[0]);
        }
    }

    /* renamed from: i */
    public static String m6132i(Context context) {
        try {
            return GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Exception e4) {
            e4.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    public static String m6133j(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_COOKIE_FILE_NAME, 4).getString(Constants.SP_KEY_COOKIE_SEC, null);
        } catch (Exception e4) {
            ALog.m6091e("UtilityImpl", "reStoreCookie fail", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: k */
    public static String m6134k(Context context) {
        return AdapterUtilityImpl.isNotificationEnabled(context);
    }

    /* renamed from: l */
    public static boolean m6135l(Context context) {
        try {
            return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getBoolean(Constants.SP_KEY_ENABLE_CHANNEL_PROCESS, true);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static List<String> m6136m(Context context) {
        try {
            String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(Constants.SP_KEY_CHANNEL_INIT, null);
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m6137n(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putInt(Constants.KEY_APP_VERSION_CODE, GlobalClientInfo.getInstance(context).getPackageInfo().versionCode);
            editorEdit.putString(Constants.KEY_APP_VERSION_NAME, GlobalClientInfo.getInstance(context).getPackageInfo().versionName);
            editorEdit.apply();
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "saveAppVersion", th, new Object[0]);
        }
    }

    public static void saveChannelInitClass(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
            String string = sharedPreferences.getString(Constants.SP_KEY_CHANNEL_INIT, null);
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
            }
            if (arrayList.contains(str)) {
                return;
            }
            arrayList.add(str);
            JSONArray jSONArray2 = new JSONArray();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                jSONArray2.put(arrayList.get(i5));
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(Constants.SP_KEY_CHANNEL_INIT, jSONArray2.toString());
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void saveUtdid(String str, Context context) {
        try {
            synchronized (f7826a) {
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
            }
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "saveUtdid", th, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean utdidChanged(String str, Context context) {
        boolean z3;
        try {
            try {
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        synchronized (f7826a) {
            try {
                String deviceId = getDeviceId(context);
                z3 = !context.getSharedPreferences(str, 0).getString("utdid", deviceId).equals(deviceId);
                return z3;
            } catch (Throwable th3) {
                th = th3;
                str = null;
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    ALog.m6091e("UtilityImpl", "saveUtdid", th, new Object[0]);
                    z3 = str;
                    return z3;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m6116b(Context context, String str) {
        ComponentName componentName = new ComponentName(context, str);
        PackageManager packageManager = context.getPackageManager();
        try {
            ALog.m6090d("UtilityImpl", "disableComponent,comptName=" + componentName, new Object[0]);
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: g */
    public static String m6129g() throws ClassNotFoundException {
        Class<?>[] clsArr = {String.class};
        Object[] objArr = {"ro.build.version.emui"};
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", clsArr).invoke(cls, objArr);
            ALog.m6090d("UtilityImpl", "getEmuiVersion", "result", str);
            return !TextUtils.isEmpty(str) ? str : "";
        } catch (Exception e4) {
            ALog.m6091e("UtilityImpl", "getEmuiVersion", e4, new Object[0]);
            return "";
        }
    }

    /* renamed from: a */
    public static void m6107a(Context context, String str) {
        ComponentName componentName = new ComponentName(context, str);
        ALog.m6090d("UtilityImpl", "enableComponent", "comptName", componentName);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable th) {
            ALog.m6095w("UtilityImpl", "enableComponent", th, new Object[0]);
        }
    }

    /* renamed from: e */
    public static int m6124e() {
        try {
            return Integer.parseInt(System.getProperty("http.proxyPort"));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static String m6127f() {
        String str = m6121d() + ":" + m6124e();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m6090d("UtilityImpl", "getProxy:" + str, new Object[0]);
        }
        return str;
    }

    /* renamed from: e */
    public static void m6126e(Context context, String str) {
        try {
            synchronized (f7826a) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                String string = sharedPreferences.getString("appkey", "");
                if (!TextUtils.isEmpty(str) && !string.equals(str) && !string.contains(str)) {
                    if (!TextUtils.isEmpty(string)) {
                        str = string + "|" + str;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("appkey", str);
                    editorEdit.apply();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m6115b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m6101a(long j4) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Long.valueOf(j4));
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "formatDay", th, new Object[0]);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m6117b(Context context, boolean z3) {
        if (m6135l(context)) {
            return false;
        }
        ALog.m6090d("UtilityImpl", "channel process is disabled, kill it", new Object[0]);
        if (!z3) {
            return true;
        }
        Process.killProcess(Process.myPid());
        return true;
    }

    /* renamed from: d */
    public static String m6121d() {
        return System.getProperty("http.proxyHost");
    }

    /* renamed from: d */
    public static String m6122d(Context context, String str) {
        try {
            File externalFilesDir = context.getExternalFilesDir("emastnetlogs");
            if (externalFilesDir == null || !externalFilesDir.exists() || !externalFilesDir.canWrite()) {
                externalFilesDir = context.getDir("emaslogs", 0);
            }
            ALog.m6090d("UtilityImpl", "getTnetLogFilePath :" + externalFilesDir, new Object[0]);
            return externalFilesDir + "/" + str.toLowerCase();
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "getTnetLogFilePath", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static String m6103a(String str, String str2, String str3) {
        String strHmacSha1Hex = null;
        if (TextUtils.isEmpty(str)) {
            ALog.m6092e("UtilityImpl", "getAppSign appKey null", new Object[0]);
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                strHmacSha1Hex = HMacUtil.hmacSha1Hex(str2.getBytes(), (str + str3).getBytes());
            } else {
                ALog.m6092e("UtilityImpl", "getAppSign secret null", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "getAppSign", th, new Object[0]);
        }
        return strHmacSha1Hex;
    }

    /* renamed from: c */
    public static boolean m6120c(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            ALog.m6092e("UtilityImpl", "package not exist", "pkg", str);
            return false;
        }
    }

    /* renamed from: c */
    public static long m6118c() {
        return AdapterUtilityImpl.getUsableSpace();
    }

    /* renamed from: a */
    public static int m6098a(Context context, String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        TextUtils.isEmpty(str2);
        return -1;
    }

    /* renamed from: a */
    public static byte[] m6112a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            return null;
        }
        ALog.m6093i("UtilityImpl", "get sslticket input null", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static void m6108a(Context context, String str, long j4) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_CHANNEL_FILE_NAME, 0).edit();
            editorEdit.putLong(str, j4);
            editorEdit.apply();
            ALog.m6090d("UtilityImpl", "setServiceTime:" + j4, new Object[0]);
        } catch (Throwable th) {
            ALog.m6091e("UtilityImpl", "setServiceTime:", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static int m6099a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("utf-8").length;
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static String m6104a(Throwable th) {
        return AdapterUtilityImpl.getStackMsg(th);
    }

    /* renamed from: a */
    public static String m6100a(int i4) {
        try {
            return String.valueOf(i4);
        } catch (Exception e4) {
            ALog.m6091e("UtilityImpl", "int2String", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m6106a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String strM6105a = m6105a(entry.getValue());
                    if (!TextUtils.isEmpty(strM6105a)) {
                        if (!key.startsWith(":")) {
                            key = key.toLowerCase(Locale.US);
                        }
                        map2.put(key, strM6105a);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return map2;
    }

    /* renamed from: a */
    public static String m6105a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(list.get(i4));
            if (i4 < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m6110a(Context context, boolean z3) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putBoolean(Constants.SP_KEY_ENABLE_CHANNEL_PROCESS, z3);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m6109a(Context context, List<String> list) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
            String string = sharedPreferences.getString(Constants.SP_KEY_CHANNEL_INIT, null);
            ArrayList arrayList = new ArrayList();
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    arrayList.add(jSONArray.getString(i4));
                }
            }
            if (arrayList.removeAll(list)) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    jSONArray2.put(arrayList.get(i5));
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(Constants.SP_KEY_CHANNEL_INIT, jSONArray2.toString());
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
