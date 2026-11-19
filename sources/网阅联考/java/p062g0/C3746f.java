package p062g0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: g0.f */
/* loaded from: classes2.dex */
public class C3746f {

    /* renamed from: a */
    public final Map f4388a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f4389b;

    /* renamed from: c */
    public long f4390c;

    /* renamed from: d */
    public long f4391d;

    public C3746f(long j4) {
        this.f4389b = j4;
        this.f4390c = j4;
    }

    /* renamed from: b */
    public void m4753b() {
        m4761m(0L);
    }

    /* renamed from: f */
    public final void m4754f() {
        m4761m(this.f4390c);
    }

    /* renamed from: g */
    public synchronized Object m4755g(Object obj) {
        return this.f4388a.get(obj);
    }

    /* renamed from: h */
    public synchronized long m4756h() {
        return this.f4390c;
    }

    /* renamed from: i */
    public int mo4757i(Object obj) {
        return 1;
    }

    /* renamed from: j */
    public void mo4758j(Object obj, Object obj2) {
    }

    /* renamed from: k */
    public synchronized Object m4759k(Object obj, Object obj2) {
        long jMo4757i = mo4757i(obj2);
        if (jMo4757i >= this.f4390c) {
            mo4758j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f4391d += jMo4757i;
        }
        Object objPut = this.f4388a.put(obj, obj2);
        if (objPut != null) {
            this.f4391d -= mo4757i(objPut);
            if (!objPut.equals(obj2)) {
                mo4758j(obj, objPut);
            }
        }
        m4754f();
        return objPut;
    }

    /* renamed from: l */
    public synchronized Object m4760l(Object obj) {
        Object objRemove;
        objRemove = this.f4388a.remove(obj);
        if (objRemove != null) {
            this.f4391d -= mo4757i(objRemove);
        }
        return objRemove;
    }

    /* renamed from: m */
    public synchronized void m4761m(long j4) {
        while (this.f4391d > j4) {
            Iterator it = this.f4388a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f4391d -= mo4757i(value);
            Object key = entry.getKey();
            it.remove();
            mo4758j(key, value);
        }
    }
}
