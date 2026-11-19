package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AwcnConfig {
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";

    /* renamed from: a */
    private static volatile boolean f4942a = false;

    /* renamed from: b */
    private static volatile boolean f4943b = true;

    /* renamed from: c */
    private static volatile boolean f4944c = true;

    /* renamed from: d */
    private static volatile boolean f4945d = true;

    /* renamed from: e */
    private static volatile boolean f4946e = false;

    /* renamed from: f */
    private static volatile boolean f4947f = true;

    /* renamed from: g */
    private static volatile long f4948g = 43200000;

    /* renamed from: h */
    private static volatile boolean f4949h = true;

    /* renamed from: i */
    private static volatile boolean f4950i = true;

    /* renamed from: j */
    private static boolean f4951j = true;

    /* renamed from: k */
    private static boolean f4952k = false;

    /* renamed from: l */
    private static volatile boolean f4953l = false;

    /* renamed from: m */
    private static volatile boolean f4954m = true;

    /* renamed from: n */
    private static volatile boolean f4955n = false;

    /* renamed from: o */
    private static volatile int f4956o = 10000;

    /* renamed from: p */
    private static volatile boolean f4957p = false;

    /* renamed from: q */
    private static volatile boolean f4958q = true;

    /* renamed from: r */
    private static volatile int f4959r = -1;

    /* renamed from: s */
    private static volatile boolean f4960s = true;

    /* renamed from: t */
    private static volatile boolean f4961t = true;

    /* renamed from: u */
    private static volatile boolean f4962u = false;

    /* renamed from: v */
    private static volatile boolean f4963v = true;

    /* renamed from: w */
    private static volatile CopyOnWriteArrayList<String> f4964w = null;

    /* renamed from: x */
    private static volatile boolean f4965x = true;

    /* renamed from: y */
    private static volatile boolean f4966y = true;

    public static int getAccsReconnectionDelayPeriod() {
        return f4956o;
    }

    public static long getIpv6BlackListTtl() {
        return f4948g;
    }

    public static int getXquicCongControl() {
        return f4959r;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f4942a;
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        if (f4964w == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return f4964w.contains(str);
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f4951j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f4952k;
    }

    public static boolean isCarrierInfoEnable() {
        return f4966y;
    }

    public static boolean isCookieHeaderRedundantFix() {
        return f4961t;
    }

    public static boolean isHorseRaceEnable() {
        return f4944c;
    }

    public static boolean isHttp3Enable() {
        return f4957p;
    }

    public static boolean isHttp3OrangeEnable() {
        return f4958q;
    }

    public static boolean isHttpsSniEnable() {
        return f4943b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f4947f;
    }

    public static boolean isIpStackDetectByUdpConnect() {
        return f4960s;
    }

    public static boolean isIpv6BlackListEnable() {
        return f4950i;
    }

    public static boolean isIpv6Enable() {
        return f4949h;
    }

    public static boolean isNetworkDetectEnable() {
        return f4955n;
    }

    public static boolean isPing6Enable() {
        return f4954m;
    }

    public static boolean isQuicEnable() {
        return f4946e;
    }

    public static boolean isSendConnectInfoByBroadcast() {
        return f4962u;
    }

    public static boolean isSendConnectInfoByService() {
        return f4963v;
    }

    public static boolean isTbNextLaunch() {
        return f4953l;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f4945d;
    }

    public static boolean isWifiInfoEnable() {
        return f4965x;
    }

    public static void registerPresetSessions(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    String string = jSONObject.getString(Constants.KEY_HOST);
                    if (!C0953c.m4632c(string)) {
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

    public static void setAccsReconnectionDelayPeriod(int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > 10000) {
            i4 = 10000;
        }
        f4956o = i4;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z3) {
        f4942a = z3;
    }

    public static void setAppLifeCycleListenerEnable(boolean z3) {
        f4951j = z3;
    }

    public static void setAsyncLoadStrategyEnable(boolean z3) {
        f4952k = z3;
    }

    public static void setCarrierInfoEnable(boolean z3) {
        f4966y = z3;
    }

    public static void setCookieHeaderRedundantFix(boolean z3) {
        f4961t = z3;
    }

    public static void setHorseRaceEnable(boolean z3) {
        f4944c = z3;
    }

    public static void setHttp3Enable(boolean z3) {
        f4957p = z3;
        ALog.m4638e("awcn.AwcnConfig", "[setHttp3Enable]", null, "enable", Boolean.valueOf(z3));
    }

    public static void setHttp3OrangeEnable(boolean z3) {
        f4958q = z3;
    }

    public static void setHttpDnsNotifyWhiteList(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                String string = jSONArray.getString(i4);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f4964w = copyOnWriteArrayList;
        } catch (Exception e4) {
            ALog.m4637e("awcn.AwcnConfig", "[setHttpDnsNotifyWhiteList] error", null, e4, new Object[0]);
        }
    }

    public static void setHttpsSniEnable(boolean z3) {
        f4943b = z3;
    }

    public static void setIdleSessionCloseEnable(boolean z3) {
        f4947f = z3;
    }

    public static void setIpStackDetectByUdpConnect(boolean z3) {
        f4960s = z3;
    }

    public static void setIpv6BlackListEnable(boolean z3) {
        f4950i = z3;
    }

    public static void setIpv6BlackListTtl(long j4) {
        f4948g = j4;
    }

    public static void setIpv6Enable(boolean z3) {
        f4949h = z3;
    }

    public static void setNetworkDetectEnable(boolean z3) {
        f4955n = z3;
    }

    public static void setPing6Enable(boolean z3) {
        f4954m = z3;
    }

    public static void setQuicEnable(boolean z3) {
        f4946e = z3;
    }

    public static void setSendConnectInfoByBroadcast(boolean z3) {
        f4962u = z3;
    }

    public static void setSendConnectInfoByService(boolean z3) {
        f4963v = z3;
    }

    public static void setTbNextLaunch(boolean z3) {
        f4953l = z3;
    }

    public static void setTnetHeaderCacheEnable(boolean z3) {
        f4945d = z3;
    }

    public static void setWifiInfoEnable(boolean z3) {
        f4965x = z3;
    }

    public static void setXquicCongControl(int i4) {
        if (i4 < 0) {
            return;
        }
        f4959r = i4;
    }
}
