package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.Config;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.appmonitor.C4977a;
import anet.channel.entity.C5014c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.fulltrace.C5016a;
import anet.channel.p020a.C4974a;
import anet.channel.p020a.C4975b;
import anet.channel.p022c.C4985a;
import anet.channel.p023d.C4988a;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.util.RequestConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class TaobaoNetworkAdapter implements Serializable {
    public static AtomicBoolean isInited = new AtomicBoolean();

    /* renamed from: a */
    private static void m2271a(String str, String str2, ConnProtocol connProtocol, boolean z10, boolean z11) {
        StrategyTemplate.getInstance().registerConnProtocol(str, connProtocol);
        if (z10) {
            if (!z11) {
                SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).registerSessionInfo(SessionInfo.create(str, z10, false, null, null, null));
            } else {
                SessionCenter.getInstance(new Config.Builder().setAppkey(str2).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", "://", str)), C5014c.f2428a, 0L);
            }
        }
    }

    public static void init(Context context, HashMap<String, Object> map) throws JSONException {
        boolean z10;
        if (isInited.compareAndSet(false, true)) {
            if (map != null && AgooConstants.TAOBAO_PACKAGE.equals(map.get("process"))) {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(true);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("liveng-bfrtc.alibabausercontent.com");
                jSONArray.put("livecb-bfrtc.alibabausercontent.com");
                jSONArray.put("liveca-bfrtc.alibabausercontent.com");
                AwcnConfig.setHttpDnsNotifyWhiteList(jSONArray.toString());
            }
            if (map != null && "com.taobao.taobao:channel".equals(map.get("process")) && NetworkConfigCenter.isChannelLocalInstanceEnable()) {
                ALog.m2529e("awcn.TaobaoNetworkAdapter", "channelLocalInstanceEnable", null, new Object[0]);
                NetworkConfigCenter.setRemoteNetworkServiceEnable(false);
            }
            ALog.setLog(new C4988a());
            NetworkConfigCenter.setRemoteConfig(new C4985a());
            AppMonitor.setInstance(new C4977a());
            NetworkAnalysis.setInstance(new C4975b());
            C5016a.m2346a(new C4974a());
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC5024j(), ThreadPoolExecutorFactory.Priority.NORMAL);
            if (map != null) {
                try {
                    if (AgooConstants.TAOBAO_PACKAGE.equals(map.get("process")) && ((Boolean) map.get("isDebuggable")).booleanValue()) {
                        Utils.invokeStaticMethodThrowException("com.taobao.android.request.analysis.RequestRecorder", "init", new Class[]{Context.class}, context);
                    }
                } catch (Exception e10) {
                    ALog.m2528e("awcn.TaobaoNetworkAdapter", "RequestRecorder error.", null, e10, new Object[0]);
                }
            }
            if (map != null) {
                try {
                    if (!map.containsKey("isNextLaunch") || PreferenceManager.getDefaultSharedPreferences(context).getBoolean(AwcnConfig.NEXT_LAUNCH_FORBID, false)) {
                        z10 = false;
                    } else {
                        GlobalAppRuntimeInfo.addBucketInfo("isNextLaunch", RequestConstant.TRUE);
                        z10 = true;
                    }
                    AwcnConfig.setTbNextLaunch(z10);
                } catch (Exception unused) {
                }
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            boolean z11 = defaultSharedPreferences.getBoolean(AwcnConfig.HTTP3_ENABLE, true);
            AwcnConfig.setHttp3OrangeEnable(z11);
            if (z11 && map != null && AgooConstants.TAOBAO_PACKAGE.equals(map.get("process"))) {
                AwcnConfig.setHttp3Enable(true);
                ALog.m2529e("awcn.TaobaoNetworkAdapter", "http3 enabled.", null, new Object[0]);
            }
            if (map != null) {
                try {
                    String str = (String) map.get("process");
                    boolean zContainsKey = map.containsKey("ngLaunch");
                    if (AgooConstants.TAOBAO_PACKAGE.equals(str)) {
                        if (defaultSharedPreferences.getBoolean(NetworkConfigCenter.SERVICE_OPTIMIZE, true)) {
                            NetworkConfigCenter.setBindServiceOptimize(true);
                            ALog.m2529e("awcn.TaobaoNetworkAdapter", "bindservice optimize enabled.", null, new Object[0]);
                        }
                        String str2 = (String) map.get("onlineAppKey");
                        m2271a("guide-acs.m.taobao.com", str2, ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_ACS), true, zContainsKey);
                        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, ConnType.PK_CDN);
                        m2271a("gw.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                        m2271a("dorangesource.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                        m2271a("ossgw.alicdn.com", str2, connProtocolValueOf, false, zContainsKey);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }
}
