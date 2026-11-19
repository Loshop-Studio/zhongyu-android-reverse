package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.C5058c;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C5074a;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.taobao.accs.common.Constants;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.g */
/* loaded from: classes3.dex */
class C5065g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    boolean f2676a = false;

    /* renamed from: b */
    StrategyInfoHolder f2677b = null;

    /* renamed from: c */
    long f2678c = 0;

    /* renamed from: d */
    CopyOnWriteArraySet<IStrategyListener> f2679d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private IStrategyFilter f2680e = new C5066h(this);

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (m2500a() || TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m2530i("awcn.StrategyCenter", "force refresh strategy", null, Constants.KEY_HOST, str);
        this.f2677b.m2477d().m2489a(str, true);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (m2500a() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f2677b.m2477d().getCnameByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        return m2500a() ? "" : this.f2677b.m2477d().f2648b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f2680e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            ALog.m2529e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String strUrlString = httpUrl.urlString();
        try {
            String schemeByHost = getSchemeByHost(httpUrl.host(), httpUrl.scheme());
            if (!schemeByHost.equalsIgnoreCase(httpUrl.scheme())) {
                strUrlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(strUrlString, 128));
            }
            return strUrlString;
        } catch (Exception e10) {
            ALog.m2528e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e10, "raw", str);
            return strUrlString;
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (m2500a()) {
            return null;
        }
        return this.f2677b.f2637b.m2466b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        if (this.f2676a || context == null) {
            return;
        }
        try {
            ALog.m2530i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
            AmdcRuntimeInfo.setContext(context);
            C5071m.m2508a(context);
            HttpDispatcher.getInstance().addListener(this);
            this.f2677b = StrategyInfoHolder.m2468a();
            this.f2676a = true;
            ALog.m2530i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
        } catch (Exception e10) {
            ALog.m2528e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e10, new Object[0]);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (m2500a() || iConnStrategy == null || !(iConnStrategy instanceof IPConnStrategy)) {
            return;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
        if (iPConnStrategy.f2622b == 1) {
            this.f2677b.f2638c.m2494a(str, iConnStrategy, connEvent);
        } else if (iPConnStrategy.f2622b == 0) {
            this.f2677b.m2477d().m2488a(str, iConnStrategy, connEvent);
        }
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType != 1 || this.f2677b == null) {
            return;
        }
        ALog.m2527d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
        C5070l.d dVarM2504a = C5070l.m2504a((JSONObject) dispatchEvent.extraObject);
        if (dVarM2504a == null) {
            return;
        }
        this.f2677b.m2473a(dVarM2504a);
        saveData();
        Iterator<IStrategyListener> it = this.f2679d.iterator();
        while (it.hasNext()) {
            try {
                it.next().onStrategyUpdated(dVarM2504a);
            } catch (Exception e10) {
                ALog.m2528e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e10, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.m2529e("awcn.StrategyCenter", "registerListener", null, "listener", this.f2679d);
        if (iStrategyListener != null) {
            this.f2679d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        ALog.m2530i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2678c > 30000) {
            this.f2678c = jCurrentTimeMillis;
            C5074a.m2517a(new RunnableC5067i(this), 500L);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        C5071m.m2507a();
        HttpDispatcher.getInstance().switchENV();
        StrategyInfoHolder strategyInfoHolder = this.f2677b;
        if (strategyInfoHolder != null) {
            strategyInfoHolder.m2475b();
            this.f2677b = StrategyInfoHolder.m2468a();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.m2529e("awcn.StrategyCenter", "unregisterListener", null, "listener", this.f2679d);
        this.f2679d.remove(iStrategyListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m2500a() {
        if (this.f2677b != null) {
            return false;
        }
        ALog.m2532w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f2676a));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        if (TextUtils.isEmpty(str) || m2500a()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.f2677b.m2477d().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List listQueryByHost = this.f2677b.m2477d().queryByHost(str);
        if (listQueryByHost.isEmpty()) {
            listQueryByHost = this.f2677b.f2638c.m2492a(str);
        }
        if (listQueryByHost.isEmpty() || iStrategyFilter == null) {
            ALog.m2527d("getConnStrategyListByHost", null, Constants.KEY_HOST, str, "result", listQueryByHost);
            return listQueryByHost;
        }
        boolean z10 = !AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f2677b.m2477d().m2490a(str, AwcnConfig.getIpv6BlackListTtl()));
        ListIterator<IConnStrategy> listIterator = listQueryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (!iStrategyFilter.accept(next)) {
                listIterator.remove();
            } else if (z10 && C5076c.m2522b(next.getIp())) {
                listIterator.remove();
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("getConnStrategyListByHost", null, Constants.KEY_HOST, str, "result", listQueryByHost);
        }
        return listQueryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m2500a()) {
            return str2;
        }
        String strM2463a = this.f2677b.f2637b.m2463a(str);
        if (strM2463a != null || TextUtils.isEmpty(str2)) {
            str2 = strM2463a;
        }
        if (str2 == null && (str2 = C5058c.a.f2661a.m2496a(str)) == null) {
            str2 = HttpConstant.HTTP;
        }
        ALog.m2527d("awcn.StrategyCenter", "getSchemeByHost", null, Constants.KEY_HOST, str, "scheme", str2);
        return str2;
    }
}
