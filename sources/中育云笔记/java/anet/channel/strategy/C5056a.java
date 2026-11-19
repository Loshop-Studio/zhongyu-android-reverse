package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.C5074a;
import anet.channel.strategy.utils.C5076c;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.a */
/* loaded from: classes3.dex */
class C5056a {

    /* renamed from: a */
    final ConcurrentHashMap<String, List<IPConnStrategy>> f2654a = new ConcurrentHashMap<>();

    /* renamed from: b */
    final HashMap<String, Object> f2655b = new HashMap<>();

    /* renamed from: a */
    public List m2492a(String str) {
        Object obj;
        if (TextUtils.isEmpty(str) || !C5076c.m2523c(str) || DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.LocalDnsStrategyTable", "try resolve ip with local dns", null, Constants.KEY_HOST, str);
        }
        List arrayList = Collections.EMPTY_LIST;
        if (!this.f2654a.containsKey(str)) {
            synchronized (this.f2655b) {
                try {
                    if (this.f2655b.containsKey(str)) {
                        obj = this.f2655b.get(str);
                    } else {
                        obj = new Object();
                        this.f2655b.put(str, obj);
                        m2491a(str, obj);
                    }
                } finally {
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
        List<IPConnStrategy> list = this.f2654a.get(str);
        if (list != null && list != Collections.EMPTY_LIST) {
            arrayList = new ArrayList(list);
        }
        ALog.m2530i("awcn.LocalDnsStrategyTable", "get local strategy", null, "strategyList", list);
        return arrayList;
    }

    /* renamed from: a */
    public void m2493a(String str, ConnProtocol connProtocol) {
        List<IPConnStrategy> list = this.f2654a.get(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<IPConnStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getProtocol().equals(connProtocol)) {
                return;
            }
        }
        list.add(IPConnStrategy.m2460a(list.get(0).getIp(), !m2495a(connProtocol) ? 80 : 443, connProtocol, 0, 0, 1, 45000));
        ALog.m2530i("awcn.LocalDnsStrategyTable", "setProtocolForHost", null, "strategyList", list);
    }

    /* renamed from: a */
    public void m2494a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        if (connEvent.isSuccess || TextUtils.isEmpty(str) || connEvent.isAccs || (list = this.f2654a.get(str)) == null || list == Collections.EMPTY_LIST) {
            return;
        }
        Iterator<IPConnStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == iConnStrategy) {
                it.remove();
            }
        }
        if (list.isEmpty()) {
            this.f2654a.put(str, Collections.EMPTY_LIST);
        }
    }

    /* renamed from: a */
    private void m2491a(String str, Object obj) {
        C5074a.m2516a(new RunnableC5057b(this, str, obj));
    }

    /* renamed from: a */
    public boolean m2495a(ConnProtocol connProtocol) {
        return connProtocol.protocol.equalsIgnoreCase("https") || connProtocol.protocol.equalsIgnoreCase(ConnType.H2S) || !TextUtils.isEmpty(connProtocol.publicKey);
    }
}
