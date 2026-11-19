package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AwcnConfig {
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";

    /* renamed from: a */
    private static volatile boolean f2220a = false;

    /* renamed from: b */
    private static volatile boolean f2221b = true;

    /* renamed from: c */
    private static volatile boolean f2222c = true;

    /* renamed from: d */
    private static volatile boolean f2223d = true;

    /* renamed from: e */
    private static volatile boolean f2224e = false;

    /* renamed from: f */
    private static volatile boolean f2225f = true;

    /* renamed from: g */
    private static volatile long f2226g = 43200000;

    /* renamed from: h */
    private static volatile boolean f2227h = true;

    /* renamed from: i */
    private static volatile boolean f2228i = true;

    /* renamed from: j */
    private static boolean f2229j = true;

    /* renamed from: k */
    private static boolean f2230k = false;

    /* renamed from: l */
    private static volatile boolean f2231l = false;

    /* renamed from: m */
    private static volatile boolean f2232m = true;

    /* renamed from: n */
    private static volatile boolean f2233n = false;

    /* renamed from: o */
    private static volatile int f2234o = 10000;

    /* renamed from: p */
    private static volatile boolean f2235p = false;

    /* renamed from: q */
    private static volatile boolean f2236q = true;

    /* renamed from: r */
    private static volatile int f2237r = -1;

    /* renamed from: s */
    private static volatile boolean f2238s = true;

    /* renamed from: t */
    private static volatile boolean f2239t = true;

    /* renamed from: u */
    private static volatile boolean f2240u = false;

    /* renamed from: v */
    private static volatile boolean f2241v = true;

    /* renamed from: w */
    private static volatile CopyOnWriteArrayList<String> f2242w = null;

    /* renamed from: x */
    private static volatile boolean f2243x = true;

    /* renamed from: y */
    private static volatile boolean f2244y = true;

    public static int getAccsReconnectionDelayPeriod() {
        return f2234o;
    }

    public static long getIpv6BlackListTtl() {
        return f2226g;
    }

    public static int getXquicCongControl() {
        return f2237r;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f2220a;
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        if (f2242w == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return f2242w.contains(str);
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f2229j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f2230k;
    }

    public static boolean isCarrierInfoEnable() {
        return f2244y;
    }

    public static boolean isCookieHeaderRedundantFix() {
        return f2239t;
    }

    public static boolean isHorseRaceEnable() {
        return f2222c;
    }

    public static boolean isHttp3Enable() {
        return f2235p;
    }

    public static boolean isHttp3OrangeEnable() {
        return f2236q;
    }

    public static boolean isHttpsSniEnable() {
        return f2221b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f2225f;
    }

    public static boolean isIpStackDetectByUdpConnect() {
        return f2238s;
    }

    public static boolean isIpv6BlackListEnable() {
        return f2228i;
    }

    public static boolean isIpv6Enable() {
        return f2227h;
    }

    public static boolean isNetworkDetectEnable() {
        return f2233n;
    }

    public static boolean isPing6Enable() {
        return f2232m;
    }

    public static boolean isQuicEnable() {
        return f2224e;
    }

    public static boolean isSendConnectInfoByBroadcast() {
        return f2240u;
    }

    public static boolean isSendConnectInfoByService() {
        return f2241v;
    }

    public static boolean isTbNextLaunch() {
        return f2231l;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f2223d;
    }

    public static boolean isWifiInfoEnable() {
        return f2243x;
    }

    public static void registerPresetSessions(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    String string = jSONObject.getString(Constants.KEY_HOST);
                    if (!C5076c.m2523c(string)) {
                        return;
                    }
                    StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setAccsReconnectionDelayPeriod(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 10000) {
            i10 = 10000;
        }
        f2234o = i10;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z10) {
        f2220a = z10;
    }

    public static void setAppLifeCycleListenerEnable(boolean z10) {
        f2229j = z10;
    }

    public static void setAsyncLoadStrategyEnable(boolean z10) {
        f2230k = z10;
    }

    public static void setCarrierInfoEnable(boolean z10) {
        f2244y = z10;
    }

    public static void setCookieHeaderRedundantFix(boolean z10) {
        f2239t = z10;
    }

    public static void setHorseRaceEnable(boolean z10) {
        f2222c = z10;
    }

    public static void setHttp3Enable(boolean z10) {
        f2235p = z10;
        ALog.m2529e("awcn.AwcnConfig", "[setHttp3Enable]", null, "enable", Boolean.valueOf(z10));
    }

    public static void setHttp3OrangeEnable(boolean z10) {
        f2236q = z10;
    }

    public static void setHttpDnsNotifyWhiteList(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f2242w = copyOnWriteArrayList;
        } catch (Exception e10) {
            ALog.m2528e("awcn.AwcnConfig", "[setHttpDnsNotifyWhiteList] error", null, e10, new Object[0]);
        }
    }

    public static void setHttpsSniEnable(boolean z10) {
        f2221b = z10;
    }

    public static void setIdleSessionCloseEnable(boolean z10) {
        f2225f = z10;
    }

    public static void setIpStackDetectByUdpConnect(boolean z10) {
        f2238s = z10;
    }

    public static void setIpv6BlackListEnable(boolean z10) {
        f2228i = z10;
    }

    public static void setIpv6BlackListTtl(long j10) {
        f2226g = j10;
    }

    public static void setIpv6Enable(boolean z10) {
        f2227h = z10;
    }

    public static void setNetworkDetectEnable(boolean z10) {
        f2233n = z10;
    }

    public static void setPing6Enable(boolean z10) {
        f2232m = z10;
    }

    public static void setQuicEnable(boolean z10) {
        f2224e = z10;
    }

    public static void setSendConnectInfoByBroadcast(boolean z10) {
        f2240u = z10;
    }

    public static void setSendConnectInfoByService(boolean z10) {
        f2241v = z10;
    }

    public static void setTbNextLaunch(boolean z10) {
        f2231l = z10;
    }

    public static void setTnetHeaderCacheEnable(boolean z10) {
        f2223d = z10;
    }

    public static void setWifiInfoEnable(boolean z10) {
        f2243x = z10;
    }

    public static void setXquicCongControl(int i10) {
        if (i10 < 0) {
            return;
        }
        f2237r = i10;
    }
}
