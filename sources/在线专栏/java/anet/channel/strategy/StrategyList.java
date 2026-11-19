package anet.channel.strategy;

import anet.channel.strategy.C0947l;
import anet.channel.strategy.utils.C0953c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
class StrategyList implements Serializable {

    /* renamed from: a */
    private List<IPConnStrategy> f5364a;

    /* renamed from: b */
    private Map<Integer, ConnHistoryItem> f5365b;

    /* renamed from: c */
    private boolean f5366c;

    /* renamed from: d */
    private transient Comparator<IPConnStrategy> f5367d;

    /* JADX INFO: Access modifiers changed from: private */
    interface Predicate<T> {
        boolean apply(T t3);
    }

    public StrategyList() {
        this.f5364a = new ArrayList();
        this.f5365b = new SerialLruCache(40);
        this.f5366c = false;
        this.f5367d = null;
    }

    public void checkInit() {
        if (this.f5364a == null) {
            this.f5364a = new ArrayList();
        }
        if (this.f5365b == null) {
            this.f5365b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f5365b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m4568d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f5364a) {
            if (!this.f5365b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f5365b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f5364a, m4588a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f5364a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f5364a) {
            ConnHistoryItem connHistoryItem = this.f5365b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem == null || !connHistoryItem.m4567c()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            } else {
                ALog.m4639i("awcn.StrategyList", "strategy ban!", null, "strategy", iPConnStrategy);
            }
        }
        return linkedList == null ? Collections.EMPTY_LIST : linkedList;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!(iConnStrategy instanceof IPConnStrategy) || this.f5364a.indexOf(iConnStrategy) == -1) {
            return;
        }
        this.f5365b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).m4565a(connEvent.isSuccess);
        Collections.sort(this.f5364a, this.f5367d);
    }

    public boolean shouldRefresh() {
        boolean z3 = true;
        boolean z4 = true;
        for (IPConnStrategy iPConnStrategy : this.f5364a) {
            if (!this.f5365b.get(Integer.valueOf(iPConnStrategy.getUniqueId())).m4566b()) {
                if (iPConnStrategy.f5343a == 0) {
                    z3 = false;
                }
                z4 = false;
            }
        }
        return (this.f5366c && z3) || z4;
    }

    public String toString() {
        return new ArrayList(this.f5364a).toString();
    }

    public void update(C0947l.b bVar) {
        Iterator<IPConnStrategy> it = this.f5364a.iterator();
        while (it.hasNext()) {
            it.next().f5345c = true;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < bVar.f5425h.length; i5++) {
            int i6 = 0;
            while (true) {
                String[] strArr = bVar.f5423f;
                if (i6 >= strArr.length) {
                    break;
                }
                m4590a(strArr[i6], 1, bVar.f5425h[i5]);
                i6++;
            }
            if (bVar.f5424g != null) {
                this.f5366c = true;
                int i7 = 0;
                while (true) {
                    String[] strArr2 = bVar.f5424g;
                    if (i7 < strArr2.length) {
                        m4590a(strArr2[i7], 0, bVar.f5425h[i5]);
                        i7++;
                    }
                }
            } else {
                this.f5366c = false;
            }
        }
        if (bVar.f5426i != null) {
            while (true) {
                C0947l.e[] eVarArr = bVar.f5426i;
                if (i4 >= eVarArr.length) {
                    break;
                }
                C0947l.e eVar = eVarArr[i4];
                String str = eVar.f5440a;
                m4590a(str, C0953c.m4632c(str) ? -1 : 1, eVar.f5441b);
                i4++;
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f5364a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f5345c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f5364a, m4588a());
    }

    /* renamed from: a */
    private void m4590a(String str, int i4, C0947l.a aVar) {
        int iM4587a = m4587a(this.f5364a, new C0945j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (iM4587a != -1) {
            IPConnStrategy iPConnStrategy = this.f5364a.get(iM4587a);
            iPConnStrategy.cto = aVar.f5412c;
            iPConnStrategy.rto = aVar.f5413d;
            iPConnStrategy.heartbeat = aVar.f5415f;
            iPConnStrategy.f5343a = i4;
            iPConnStrategy.f5344b = 0;
            iPConnStrategy.f5345c = false;
            return;
        }
        IPConnStrategy iPConnStrategyM4570a = IPConnStrategy.m4570a(str, aVar);
        if (iPConnStrategyM4570a != null) {
            iPConnStrategyM4570a.f5343a = i4;
            iPConnStrategyM4570a.f5344b = 0;
            if (!this.f5365b.containsKey(Integer.valueOf(iPConnStrategyM4570a.getUniqueId()))) {
                this.f5365b.put(Integer.valueOf(iPConnStrategyM4570a.getUniqueId()), new ConnHistoryItem());
            }
            this.f5364a.add(iPConnStrategyM4570a);
        }
    }

    StrategyList(List<IPConnStrategy> list) {
        this.f5364a = new ArrayList();
        this.f5365b = new SerialLruCache(40);
        this.f5366c = false;
        this.f5367d = null;
        this.f5364a = list;
    }

    /* renamed from: a */
    private Comparator m4588a() {
        if (this.f5367d == null) {
            this.f5367d = new C0946k(this);
        }
        return this.f5367d;
    }

    /* renamed from: a */
    private static <T> int m4587a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        int i4 = 0;
        Iterator<T> it = collection.iterator();
        while (it.hasNext() && !predicate.apply(it.next())) {
            i4++;
        }
        if (i4 == collection.size()) {
            return -1;
        }
        return i4;
    }
}
