package anet.channel.strategy;

import anet.channel.strategy.C5070l;
import anet.channel.strategy.utils.C5076c;
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

/* loaded from: classes3.dex */
class StrategyList implements Serializable {

    /* renamed from: a */
    private List<IPConnStrategy> f2642a;

    /* renamed from: b */
    private Map<Integer, ConnHistoryItem> f2643b;

    /* renamed from: c */
    private boolean f2644c;

    /* renamed from: d */
    private transient Comparator<IPConnStrategy> f2645d;

    public interface Predicate<T> {
        boolean apply(T t10);
    }

    public StrategyList() {
        this.f2642a = new ArrayList();
        this.f2643b = new SerialLruCache(40);
        this.f2644c = false;
        this.f2645d = null;
    }

    public void checkInit() {
        if (this.f2642a == null) {
            this.f2642a = new ArrayList();
        }
        if (this.f2643b == null) {
            this.f2643b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f2643b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m2459d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f2642a) {
            if (!this.f2643b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f2643b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f2642a, m2479a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f2642a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f2642a) {
            ConnHistoryItem connHistoryItem = this.f2643b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem == null || !connHistoryItem.m2458c()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            } else {
                ALog.m2530i("awcn.StrategyList", "strategy ban!", null, "strategy", iPConnStrategy);
            }
        }
        return linkedList == null ? Collections.EMPTY_LIST : linkedList;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!(iConnStrategy instanceof IPConnStrategy) || this.f2642a.indexOf(iConnStrategy) == -1) {
            return;
        }
        this.f2643b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).m2456a(connEvent.isSuccess);
        Collections.sort(this.f2642a, this.f2645d);
    }

    public boolean shouldRefresh() {
        boolean z10;
        boolean z11 = true;
        loop0: while (true) {
            z10 = z11;
            for (IPConnStrategy iPConnStrategy : this.f2642a) {
                if (!this.f2643b.get(Integer.valueOf(iPConnStrategy.getUniqueId())).m2457b()) {
                    if (iPConnStrategy.f2621a == 0) {
                        break;
                    }
                    z10 = false;
                }
            }
            z11 = false;
        }
        return (this.f2644c && z11) || z10;
    }

    public String toString() {
        return new ArrayList(this.f2642a).toString();
    }

    public void update(C5070l.b bVar) {
        Iterator<IPConnStrategy> it = this.f2642a.iterator();
        while (it.hasNext()) {
            it.next().f2623c = true;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < bVar.f2703h.length; i11++) {
            int i12 = 0;
            while (true) {
                String[] strArr = bVar.f2701f;
                if (i12 >= strArr.length) {
                    break;
                }
                m2481a(strArr[i12], 1, bVar.f2703h[i11]);
                i12++;
            }
            if (bVar.f2702g != null) {
                this.f2644c = true;
                int i13 = 0;
                while (true) {
                    String[] strArr2 = bVar.f2702g;
                    if (i13 < strArr2.length) {
                        m2481a(strArr2[i13], 0, bVar.f2703h[i11]);
                        i13++;
                    }
                }
            } else {
                this.f2644c = false;
            }
        }
        if (bVar.f2704i != null) {
            while (true) {
                C5070l.e[] eVarArr = bVar.f2704i;
                if (i10 >= eVarArr.length) {
                    break;
                }
                C5070l.e eVar = eVarArr[i10];
                String str = eVar.f2718a;
                m2481a(str, C5076c.m2523c(str) ? -1 : 1, eVar.f2719b);
                i10++;
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f2642a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f2623c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f2642a, m2479a());
    }

    /* renamed from: a */
    private void m2481a(String str, int i10, C5070l.a aVar) {
        int iM2478a = m2478a(this.f2642a, new C5068j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (iM2478a != -1) {
            IPConnStrategy iPConnStrategy = this.f2642a.get(iM2478a);
            iPConnStrategy.cto = aVar.f2690c;
            iPConnStrategy.rto = aVar.f2691d;
            iPConnStrategy.heartbeat = aVar.f2693f;
            iPConnStrategy.f2621a = i10;
            iPConnStrategy.f2622b = 0;
            iPConnStrategy.f2623c = false;
            return;
        }
        IPConnStrategy iPConnStrategyM2461a = IPConnStrategy.m2461a(str, aVar);
        if (iPConnStrategyM2461a != null) {
            iPConnStrategyM2461a.f2621a = i10;
            iPConnStrategyM2461a.f2622b = 0;
            if (!this.f2643b.containsKey(Integer.valueOf(iPConnStrategyM2461a.getUniqueId()))) {
                this.f2643b.put(Integer.valueOf(iPConnStrategyM2461a.getUniqueId()), new ConnHistoryItem());
            }
            this.f2642a.add(iPConnStrategyM2461a);
        }
    }

    public StrategyList(List<IPConnStrategy> list) {
        this.f2642a = new ArrayList();
        this.f2643b = new SerialLruCache(40);
        this.f2644c = false;
        this.f2645d = null;
        this.f2642a = list;
    }

    /* renamed from: a */
    private Comparator m2479a() {
        if (this.f2645d == null) {
            this.f2645d = new C5069k(this);
        }
        return this.f2645d;
    }

    /* renamed from: a */
    private static <T> int m2478a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        Iterator<T> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext() && !predicate.apply(it.next())) {
            i10++;
        }
        if (i10 == collection.size()) {
            return -1;
        }
        return i10;
    }
}
