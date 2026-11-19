package anetwork.channel.config;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C5076c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.http.NetworkSdkSetting;
import com.blankj.utilcode.constant.TimeConstants;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NetworkConfigCenter {
    public static final String SERVICE_OPTIMIZE = "SERVICE_OPTIMIZE";
    public static final String SESSION_ASYNC_OPTIMIZE = "SESSION_ASYNC_OPTIMIZE";

    /* renamed from: a */
    private static volatile boolean f2818a = true;

    /* renamed from: b */
    private static volatile boolean f2819b = true;

    /* renamed from: c */
    private static volatile boolean f2820c = true;

    /* renamed from: d */
    private static volatile int f2821d = 5;

    /* renamed from: e */
    private static volatile boolean f2822e = true;

    /* renamed from: f */
    private static volatile boolean f2823f = true;

    /* renamed from: g */
    private static volatile boolean f2824g = false;

    /* renamed from: h */
    private static volatile long f2825h = 0;

    /* renamed from: i */
    private static volatile boolean f2826i = false;

    /* renamed from: j */
    private static volatile ConcurrentHashMap<String, List<String>> f2827j;

    /* renamed from: k */
    private static volatile CopyOnWriteArrayList<String> f2828k;

    /* renamed from: l */
    private static final List<String> f2829l = new ArrayList();

    /* renamed from: m */
    private static volatile int f2830m = 10000;

    /* renamed from: n */
    private static volatile boolean f2831n = true;

    /* renamed from: o */
    private static volatile boolean f2832o = false;

    /* renamed from: p */
    private static volatile int f2833p = TimeConstants.MIN;

    /* renamed from: q */
    private static volatile CopyOnWriteArrayList<String> f2834q = null;

    /* renamed from: r */
    private static volatile ConcurrentHashMap<String, List<String>> f2835r = null;

    /* renamed from: s */
    private static volatile boolean f2836s = true;

    /* renamed from: t */
    private static volatile boolean f2837t = false;

    /* renamed from: u */
    private static volatile boolean f2838u = false;

    /* renamed from: v */
    private static volatile boolean f2839v = true;

    /* renamed from: w */
    private static volatile boolean f2840w = true;

    /* renamed from: x */
    private static volatile IRemoteConfig f2841x;

    public static void enableNetworkSdkOptimizeTest(boolean z10) {
        if (!z10) {
            setGetSessionAsyncEnable(false);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(6);
        } else {
            setGetSessionAsyncEnable(true);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(16);
            AwcnConfig.registerPresetSessions("[{\"host\":\"trade-acs.m.taobao.com\", \"protocol\":\"http2\", \"rtt\":\"0rtt\", \"publicKey\": \"acs\", \"isKeepAlive\":true}]");
        }
    }

    public static int getBgForbidRequestThreshold() {
        return f2833p;
    }

    public static int getRequestStatisticSampleRate() {
        return f2830m;
    }

    public static int getServiceBindWaitTime() {
        return f2821d;
    }

    public static void init() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext());
        f2825h = defaultSharedPreferences.getLong("Cache.Flag", 0L);
        f2838u = defaultSharedPreferences.getBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", false);
        f2839v = defaultSharedPreferences.getBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", true);
    }

    public static boolean isAllowHttpIpRetry() {
        return f2822e && f2824g;
    }

    public static boolean isAllowSpdyWhenBindServiceFailed() {
        return f2839v;
    }

    public static boolean isBgRequestForbidden() {
        return f2826i;
    }

    public static boolean isBindServiceOptimize() {
        return f2837t;
    }

    public static boolean isBizInWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f2828k;
        if (f2828k == null) {
            return false;
        }
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChannelLocalInstanceEnable() {
        return f2838u;
    }

    public static boolean isCookieEnable() {
        return f2840w;
    }

    public static boolean isGetSessionAsyncEnable() {
        return f2832o;
    }

    public static boolean isHttpCacheEnable() {
        return f2823f;
    }

    public static boolean isHttpSessionEnable() {
        return f2822e;
    }

    public static boolean isRemoteNetworkServiceEnable() {
        return f2820c;
    }

    public static boolean isRequestDelayRetryForNoNetwork() {
        return f2836s;
    }

    public static boolean isRequestInMonitorList(RequestStatistic requestStatistic) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (requestStatistic == null || (copyOnWriteArrayList = f2834q) == null || TextUtils.isEmpty(requestStatistic.host)) {
            return false;
        }
        Iterator<String> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (requestStatistic.host.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isResponseBufferEnable() {
        return f2831n;
    }

    public static boolean isSSLEnabled() {
        return f2818a;
    }

    public static boolean isSpdyEnabled() {
        return f2819b;
    }

    public static boolean isUrlInDegradeList(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f2835r) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f2829l) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (httpUrl.path().startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlInWhiteList(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f2827j) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f2829l) {
            return true;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (httpUrl.path().startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void setAllowHttpIpRetry(boolean z10) {
        f2824g = z10;
    }

    public static void setAllowSpdyWhenBindServiceFailed(boolean z10) {
        f2839v = z10;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        editorEdit.putBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", f2839v);
        editorEdit.apply();
    }

    public static void setAmdcPresetHosts(String str) throws JSONException {
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    if (C5076c.m2523c(string)) {
                        arrayList.add(string);
                    }
                }
                HttpDispatcher.getInstance().addHosts(arrayList);
            } catch (JSONException e10) {
                ALog.m2528e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
            }
        }
    }

    public static void setBgForbidRequestThreshold(int i10) {
        f2833p = i10;
    }

    public static void setBgRequestForbidden(boolean z10) {
        f2826i = z10;
    }

    public static void setBindServiceOptimize(boolean z10) {
        f2837t = z10;
    }

    public static void setCacheFlag(long j10) {
        if (j10 != f2825h) {
            ALog.m2530i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(f2825h), "new", Long.valueOf(j10));
            f2825h = j10;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            editorEdit.putLong("Cache.Flag", f2825h);
            editorEdit.apply();
            CacheManager.clearAllCache();
        }
    }

    public static void setChannelLocalInstanceEnable(boolean z10) {
        f2838u = z10;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        editorEdit.putBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", f2838u);
        editorEdit.apply();
    }

    public static void setCookieEnable(boolean z10) {
        f2840w = z10;
    }

    public static void setDegradeRequestList(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f2835r = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, f2829l);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.m2528e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f2835r = concurrentHashMap;
    }

    public static void setGetSessionAsyncEnable(boolean z10) {
        f2832o = z10;
    }

    public static void setHttpCacheEnable(boolean z10) {
        f2823f = z10;
    }

    public static void setHttpSessionEnable(boolean z10) {
        f2822e = z10;
    }

    @Deprecated
    public static void setHttpsValidationEnabled(boolean z10) {
    }

    public static void setMonitorRequestList(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            f2834q = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Constants.KEY_HOST);
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (C5076c.m2523c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f2834q = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.m2528e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
        }
    }

    public static void setRemoteConfig(IRemoteConfig iRemoteConfig) {
        if (f2841x != null) {
            f2841x.unRegister();
        }
        if (iRemoteConfig != null) {
            iRemoteConfig.register();
        }
        f2841x = iRemoteConfig;
    }

    public static void setRemoteNetworkServiceEnable(boolean z10) {
        f2820c = z10;
    }

    public static void setRequestDelayRetryForNoNetwork(boolean z10) {
        f2836s = z10;
    }

    public static void setRequestStatisticSampleRate(int i10) {
        f2830m = i10;
    }

    public static void setResponseBufferEnable(boolean z10) {
        f2831n = z10;
    }

    public static void setSSLEnabled(boolean z10) {
        ALog.m2530i("anet.NetworkConfigCenter", "[setSSLEnabled]", null, "enable", Boolean.valueOf(z10));
        f2818a = z10;
    }

    public static void setServiceBindWaitTime(int i10) {
        f2821d = i10;
    }

    public static void setSpdyEnabled(boolean z10) {
        ALog.m2530i("anet.NetworkConfigCenter", "[setSpdyEnabled]", null, "enable", Boolean.valueOf(z10));
        f2819b = z10;
    }

    public static void updateBizWhiteList(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.NetworkConfigCenter", "updateRequestWhiteList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f2828k = null;
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f2828k = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.m2528e("anet.NetworkConfigCenter", "parse bizId failed", null, e10, new Object[0]);
        }
    }

    public static void updateWhiteListMap(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f2827j = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, f2829l);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.m2528e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f2827j = concurrentHashMap;
    }
}
