package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.C0951a;
import anet.channel.strategy.utils.C0953c;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.a */
/* loaded from: classes.dex */
class C0933a {

    /* renamed from: a */
    final ConcurrentHashMap<String, List<IPConnStrategy>> f5376a = new ConcurrentHashMap<>();

    /* renamed from: b */
    final HashMap<String, Object> f5377b = new HashMap<>();

    C0933a() {
    }

    /* renamed from: a */
    List m4601a(String str) {
        Object obj;
        if (TextUtils.isEmpty(str) || !C0953c.m4632c(str) || DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m4636d("awcn.LocalDnsStrategyTable", "try resolve ip with local dns", null, Constants.KEY_HOST, str);
        }
        List arrayList = Collections.EMPTY_LIST;
        if (!this.f5376a.containsKey(str)) {
            synchronized (this.f5377b) {
                if (this.f5377b.containsKey(str)) {
                    obj = this.f5377b.get(str);
                } else {
                    obj = new Object();
                    this.f5377b.put(str, obj);
                    m4600a(str, obj);
                }
            }
            if (obj != null) {
                try {
                    synchronized (obj) {
                        obj.wait(500L);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        List<IPConnStrategy> list = this.f5376a.get(str);
        if (list != null && list != Collections.EMPTY_LIST) {
            arrayList = new ArrayList(list);
        }
        ALog.m4639i("awcn.LocalDnsStrategyTable", "get local strategy", null, "strategyList", list);
        return arrayList;
    }

    /* renamed from: a */
    void m4602a(String str, ConnProtocol connProtocol) {
        List<IPConnStrategy> list = this.f5376a.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IPConnStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getProtocol().equals(connProtocol)) {
                return;
            }
        }
        list.add(IPConnStrategy.m4569a(list.get(0).getIp(), !m4604a(connProtocol) ? 80 : Constants.PORT, connProtocol, 0, 0, 1, 45000));
        ALog.m4639i("awcn.LocalDnsStrategyTable", "setProtocolForHost", null, "strategyList", list);
    }

    /* renamed from: a */
    void m4603a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        if (connEvent.isSuccess || TextUtils.isEmpty(str) || connEvent.isAccs || (list = this.f5376a.get(str)) == null || list == Collections.EMPTY_LIST) {
            return;
        }
        Iterator<IPConnStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == iConnStrategy) {
                it.remove();
            }
        }
        if (list.isEmpty()) {
            this.f5376a.put(str, Collections.EMPTY_LIST);
        }
    }

    /* renamed from: a */
    private void m4600a(String str, Object obj) {
        C0951a.m4625a(new RunnableC0934b(this, str, obj));
    }

    /* renamed from: a */
    boolean m4604a(ConnProtocol connProtocol) {
        return connProtocol.protocol.equalsIgnoreCase(HttpConstant.HTTPS) || connProtocol.protocol.equalsIgnoreCase(ConnType.H2S) || !TextUtils.isEmpty(connProtocol.publicKey);
    }
}
