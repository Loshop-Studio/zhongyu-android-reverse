package p016b1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b1.g */
/* loaded from: classes3.dex */
public class C4405g {

    /* renamed from: a */
    public final Map f1258a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f1259b;

    /* renamed from: c */
    public long f1260c;

    /* renamed from: d */
    public long f1261d;

    /* renamed from: b1.g$a */
    public static final class a {

        /* renamed from: a */
        public final Object f1262a;

        /* renamed from: b */
        public final int f1263b;

        public a(Object obj, int i6) {
            this.f1262a = obj;
            this.f1263b = i6;
        }
    }

    public C4405g(long j6) {
        this.f1259b = j6;
        this.f1260c = j6;
    }

    /* renamed from: b */
    public void m1423b() {
        m1431m(0L);
    }

    /* renamed from: f */
    public final void m1424f() {
        m1431m(this.f1260c);
    }

    /* renamed from: g */
    public synchronized Object m1425g(Object obj) {
        a aVar;
        aVar = (a) this.f1258a.get(obj);
        return aVar != null ? aVar.f1262a : null;
    }

    /* renamed from: h */
    public synchronized long m1426h() {
        return this.f1260c;
    }

    /* renamed from: i */
    public int mo1427i(Object obj) {
        return 1;
    }

    /* renamed from: k */
    public synchronized Object m1429k(Object obj, Object obj2) {
        int iMo1427i = mo1427i(obj2);
        long j6 = iMo1427i;
        if (j6 >= this.f1260c) {
            mo1428j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1261d += j6;
        }
        a aVar = (a) this.f1258a.put(obj, obj2 == null ? null : new a(obj2, iMo1427i));
        if (aVar != null) {
            this.f1261d -= aVar.f1263b;
            if (!aVar.f1262a.equals(obj2)) {
                mo1428j(obj, aVar.f1262a);
            }
        }
        m1424f();
        return aVar != null ? aVar.f1262a : null;
    }

    /* renamed from: l */
    public synchronized Object m1430l(Object obj) {
        a aVar = (a) this.f1258a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f1261d -= aVar.f1263b;
        return aVar.f1262a;
    }

    /* renamed from: m */
    public synchronized void m1431m(long j6) {
        while (this.f1261d > j6) {
            Iterator it = this.f1258a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f1261d -= aVar.f1263b;
            Object key = entry.getKey();
            it.remove();
            mo1428j(key, aVar.f1262a);
        }
    }

    /* renamed from: j */
    public void mo1428j(Object obj, Object obj2) {
    }
}
