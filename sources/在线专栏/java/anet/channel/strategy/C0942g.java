package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.C0935c;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0951a;
import anet.channel.strategy.utils.C0953c;
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
/* loaded from: classes.dex */
class C0942g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    boolean f5398a = false;

    /* renamed from: b */
    StrategyInfoHolder f5399b = null;

    /* renamed from: c */
    long f5400c = 0;

    /* renamed from: d */
    CopyOnWriteArraySet<IStrategyListener> f5401d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private IStrategyFilter f5402e = new C0943h(this);

    C0942g() {
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (m4609a() || TextUtils.isEmpty(str)) {
            return;
        }
        ALog.m4639i("awcn.StrategyCenter", "force refresh strategy", null, Constants.KEY_HOST, str);
        this.f5399b.m4586d().m4598a(str, true);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (m4609a() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f5399b.m4586d().getCnameByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        return m4609a() ? "" : this.f5399b.m4586d().f5370b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f5402e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            ALog.m4638e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String strUrlString = httpUrl.urlString();
        try {
            String schemeByHost = getSchemeByHost(httpUrl.host(), httpUrl.scheme());
            if (!schemeByHost.equalsIgnoreCase(httpUrl.scheme())) {
                strUrlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(strUrlString, 128));
            }
        } catch (Exception e4) {
            ALog.m4637e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e4, "raw", str);
        }
        return strUrlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (m4609a()) {
            return null;
        }
        return this.f5399b.f5359b.m4575b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        if (this.f5398a || context == null) {
            return;
        }
        try {
            ALog.m4639i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
            AmdcRuntimeInfo.setContext(context);
            C0948m.m4617a(context);
            HttpDispatcher.getInstance().addListener(this);
            this.f5399b = StrategyInfoHolder.m4577a();
            this.f5398a = true;
            ALog.m4639i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
        } catch (Exception e4) {
            ALog.m4637e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e4, new Object[0]);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (m4609a() || iConnStrategy == null || !(iConnStrategy instanceof IPConnStrategy)) {
            return;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
        if (iPConnStrategy.f5344b == 1) {
            this.f5399b.f5360c.m4603a(str, iConnStrategy, connEvent);
        } else if (iPConnStrategy.f5344b == 0) {
            this.f5399b.m4586d().m4597a(str, iConnStrategy, connEvent);
        }
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType != 1 || this.f5399b == null) {
            return;
        }
        ALog.m4636d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
        C0947l.d dVarM4613a = C0947l.m4613a((JSONObject) dispatchEvent.extraObject);
        if (dVarM4613a == null) {
            return;
        }
        this.f5399b.m4582a(dVarM4613a);
        saveData();
        Iterator<IStrategyListener> it = this.f5401d.iterator();
        while (it.hasNext()) {
            try {
                it.next().onStrategyUpdated(dVarM4613a);
            } catch (Exception e4) {
                ALog.m4637e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e4, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.m4638e("awcn.StrategyCenter", "registerListener", null, "listener", this.f5401d);
        if (iStrategyListener != null) {
            this.f5401d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        ALog.m4639i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f5400c > 30000) {
            this.f5400c = jCurrentTimeMillis;
            C0951a.m4626a(new RunnableC0944i(this), 500L);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        C0948m.m4616a();
        HttpDispatcher.getInstance().switchENV();
        StrategyInfoHolder strategyInfoHolder = this.f5399b;
        if (strategyInfoHolder != null) {
            strategyInfoHolder.m4584b();
            this.f5399b = StrategyInfoHolder.m4577a();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.m4638e("awcn.StrategyCenter", "unregisterListener", null, "listener", this.f5401d);
        this.f5401d.remove(iStrategyListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4609a() {
        if (this.f5399b != null) {
            return false;
        }
        ALog.m4641w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f5398a));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        if (TextUtils.isEmpty(str) || m4609a()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.f5399b.m4586d().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List listQueryByHost = this.f5399b.m4586d().queryByHost(str);
        if (listQueryByHost.isEmpty()) {
            listQueryByHost = this.f5399b.f5360c.m4601a(str);
        }
        if (listQueryByHost.isEmpty() || iStrategyFilter == null) {
            ALog.m4636d("getConnStrategyListByHost", null, Constants.KEY_HOST, str, "result", listQueryByHost);
            return listQueryByHost;
        }
        boolean z3 = !AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f5399b.m4586d().m4599a(str, AwcnConfig.getIpv6BlackListTtl()));
        ListIterator<IConnStrategy> listIterator = listQueryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (!iStrategyFilter.accept(next)) {
                listIterator.remove();
            } else if (z3 && C0953c.m4631b(next.getIp())) {
                listIterator.remove();
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("getConnStrategyListByHost", null, Constants.KEY_HOST, str, "result", listQueryByHost);
        }
        return listQueryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m4609a()) {
            return str2;
        }
        String strM4572a = this.f5399b.f5359b.m4572a(str);
        if (strM4572a != null || TextUtils.isEmpty(str2)) {
            str2 = strM4572a;
        }
        if (str2 == null && (str2 = C0935c.a.f5383a.m4605a(str)) == null) {
            str2 = HttpConstant.HTTP;
        }
        ALog.m4636d("awcn.StrategyCenter", "getSchemeByHost", null, Constants.KEY_HOST, str, "scheme", str2);
        return str2;
    }
}
