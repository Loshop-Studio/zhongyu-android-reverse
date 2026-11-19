package anetwork.channel.config;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0953c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.http.NetworkSdkSetting;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NetworkConfigCenter {
    public static final String SERVICE_OPTIMIZE = "SERVICE_OPTIMIZE";
    public static final String SESSION_ASYNC_OPTIMIZE = "SESSION_ASYNC_OPTIMIZE";

    /* renamed from: a */
    private static volatile boolean f5540a = true;

    /* renamed from: b */
    private static volatile boolean f5541b = true;

    /* renamed from: c */
    private static volatile boolean f5542c = true;

    /* renamed from: d */
    private static volatile int f5543d = 5;

    /* renamed from: e */
    private static volatile boolean f5544e = true;

    /* renamed from: f */
    private static volatile boolean f5545f = true;

    /* renamed from: g */
    private static volatile boolean f5546g = false;

    /* renamed from: h */
    private static volatile long f5547h = 0;

    /* renamed from: i */
    private static volatile boolean f5548i = false;

    /* renamed from: j */
    private static volatile ConcurrentHashMap<String, List<String>> f5549j;

    /* renamed from: k */
    private static volatile CopyOnWriteArrayList<String> f5550k;

    /* renamed from: l */
    private static final List<String> f5551l = new ArrayList();

    /* renamed from: m */
    private static volatile int f5552m = 10000;

    /* renamed from: n */
    private static volatile boolean f5553n = true;

    /* renamed from: o */
    private static volatile boolean f5554o = false;

    /* renamed from: p */
    private static volatile int f5555p = 60000;

    /* renamed from: q */
    private static volatile CopyOnWriteArrayList<String> f5556q = null;

    /* renamed from: r */
    private static volatile ConcurrentHashMap<String, List<String>> f5557r = null;

    /* renamed from: s */
    private static volatile boolean f5558s = true;

    /* renamed from: t */
    private static volatile boolean f5559t = false;

    /* renamed from: u */
    private static volatile boolean f5560u = false;

    /* renamed from: v */
    private static volatile boolean f5561v = true;

    /* renamed from: w */
    private static volatile boolean f5562w = true;

    /* renamed from: x */
    private static volatile IRemoteConfig f5563x;

    public static void enableNetworkSdkOptimizeTest(boolean z3) {
        if (!z3) {
            setGetSessionAsyncEnable(false);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(6);
        } else {
            setGetSessionAsyncEnable(true);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(16);
            AwcnConfig.registerPresetSessions("[{\"host\":\"trade-acs.m.taobao.com\", \"protocol\":\"http2\", \"rtt\":\"0rtt\", \"publicKey\": \"acs\", \"isKeepAlive\":true}]");
        }
    }

    public static int getBgForbidRequestThreshold() {
        return f5555p;
    }

    public static int getRequestStatisticSampleRate() {
        return f5552m;
    }

    public static int getServiceBindWaitTime() {
        return f5543d;
    }

    public static void init() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext());
        f5547h = defaultSharedPreferences.getLong("Cache.Flag", 0L);
        f5560u = defaultSharedPreferences.getBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", false);
        f5561v = defaultSharedPreferences.getBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", true);
    }

    public static boolean isAllowHttpIpRetry() {
        return f5544e && f5546g;
    }

    public static boolean isAllowSpdyWhenBindServiceFailed() {
        return f5561v;
    }

    public static boolean isBgRequestForbidden() {
        return f5548i;
    }

    public static boolean isBindServiceOptimize() {
        return f5559t;
    }

    public static boolean isBizInWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f5550k;
        if (f5550k == null) {
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
        return f5560u;
    }

    public static boolean isCookieEnable() {
        return f5562w;
    }

    public static boolean isGetSessionAsyncEnable() {
        return f5554o;
    }

    public static boolean isHttpCacheEnable() {
        return f5545f;
    }

    public static boolean isHttpSessionEnable() {
        return f5544e;
    }

    public static boolean isRemoteNetworkServiceEnable() {
        return f5542c;
    }

    public static boolean isRequestDelayRetryForNoNetwork() {
        return f5558s;
    }

    public static boolean isRequestInMonitorList(RequestStatistic requestStatistic) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (requestStatistic == null || (copyOnWriteArrayList = f5556q) == null || TextUtils.isEmpty(requestStatistic.host)) {
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
        return f5553n;
    }

    public static boolean isSSLEnabled() {
        return f5540a;
    }

    public static boolean isSpdyEnabled() {
        return f5541b;
    }

    public static boolean isUrlInDegradeList(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        if (httpUrl == null || (concurrentHashMap = f5557r) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f5551l) {
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
        if (httpUrl == null || (concurrentHashMap = f5549j) == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        if (list == f5551l) {
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

    public static void setAllowHttpIpRetry(boolean z3) {
        f5546g = z3;
    }

    public static void setAllowSpdyWhenBindServiceFailed(boolean z3) {
        f5561v = z3;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        editorEdit.putBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", f5561v);
        editorEdit.apply();
    }

    public static void setAmdcPresetHosts(String str) throws JSONException {
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i4 = 0; i4 < length; i4++) {
                    String string = jSONArray.getString(i4);
                    if (C0953c.m4632c(string)) {
                        arrayList.add(string);
                    }
                }
                HttpDispatcher.getInstance().addHosts(arrayList);
            } catch (JSONException e4) {
                ALog.m4637e("anet.NetworkConfigCenter", "parse hosts failed", null, e4, new Object[0]);
            }
        }
    }

    public static void setBgForbidRequestThreshold(int i4) {
        f5555p = i4;
    }

    public static void setBgRequestForbidden(boolean z3) {
        f5548i = z3;
    }

    public static void setBindServiceOptimize(boolean z3) {
        f5559t = z3;
    }

    public static void setCacheFlag(long j4) {
        if (j4 != f5547h) {
            ALog.m4639i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(f5547h), "new", Long.valueOf(j4));
            f5547h = j4;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            editorEdit.putLong("Cache.Flag", f5547h);
            editorEdit.apply();
            CacheManager.clearAllCache();
        }
    }

    public static void setChannelLocalInstanceEnable(boolean z3) {
        f5560u = z3;
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        editorEdit.putBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", f5560u);
        editorEdit.apply();
    }

    public static void setCookieEnable(boolean z3) {
        f5562w = z3;
    }

    public static void setDegradeRequestList(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f5557r = null;
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
                        concurrentHashMap.put(next, f5551l);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i4 = 0; i4 < length; i4++) {
                            Object obj2 = jSONArray.get(i4);
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
        } catch (JSONException e4) {
            ALog.m4637e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e4, new Object[0]);
        }
        f5557r = concurrentHashMap;
    }

    public static void setGetSessionAsyncEnable(boolean z3) {
        f5554o = z3;
    }

    public static void setHttpCacheEnable(boolean z3) {
        f5545f = z3;
    }

    public static void setHttpSessionEnable(boolean z3) {
        f5544e = z3;
    }

    @Deprecated
    public static void setHttpsValidationEnabled(boolean z3) {
    }

    public static void setMonitorRequestList(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            f5556q = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(Constants.KEY_HOST);
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i4 = 0; i4 < length; i4++) {
                String string = jSONArray.getString(i4);
                if (C0953c.m4632c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f5556q = copyOnWriteArrayList;
        } catch (JSONException e4) {
            ALog.m4637e("anet.NetworkConfigCenter", "parse hosts failed", null, e4, new Object[0]);
        }
    }

    public static void setRemoteConfig(IRemoteConfig iRemoteConfig) {
        if (f5563x != null) {
            f5563x.unRegister();
        }
        if (iRemoteConfig != null) {
            iRemoteConfig.register();
        }
        f5563x = iRemoteConfig;
    }

    public static void setRemoteNetworkServiceEnable(boolean z3) {
        f5542c = z3;
    }

    public static void setRequestDelayRetryForNoNetwork(boolean z3) {
        f5558s = z3;
    }

    public static void setRequestStatisticSampleRate(int i4) {
        f5552m = i4;
    }

    public static void setResponseBufferEnable(boolean z3) {
        f5553n = z3;
    }

    public static void setSSLEnabled(boolean z3) {
        ALog.m4639i("anet.NetworkConfigCenter", "[setSSLEnabled]", null, "enable", Boolean.valueOf(z3));
        f5540a = z3;
    }

    public static void setServiceBindWaitTime(int i4) {
        f5543d = i4;
    }

    public static void setSpdyEnabled(boolean z3) {
        ALog.m4639i("anet.NetworkConfigCenter", "[setSpdyEnabled]", null, "enable", Boolean.valueOf(z3));
        f5541b = z3;
    }

    public static void updateBizWhiteList(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.NetworkConfigCenter", "updateRequestWhiteList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f5550k = null;
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i4 = 0; i4 < length; i4++) {
                String string = jSONArray.getString(i4);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f5550k = copyOnWriteArrayList;
        } catch (JSONException e4) {
            ALog.m4637e("anet.NetworkConfigCenter", "parse bizId failed", null, e4, new Object[0]);
        }
    }

    public static void updateWhiteListMap(String str) throws JSONException {
        if (ALog.isPrintLog(2)) {
            ALog.m4639i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f5549j = null;
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
                        concurrentHashMap.put(next, f5551l);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i4 = 0; i4 < length; i4++) {
                            Object obj2 = jSONArray.get(i4);
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
        } catch (JSONException e4) {
            ALog.m4637e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e4, new Object[0]);
        }
        f5549j = concurrentHashMap;
    }
}
