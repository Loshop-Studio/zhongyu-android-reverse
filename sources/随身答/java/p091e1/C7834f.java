package p091e1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: e1.f */
/* loaded from: classes3.dex */
public class C7834f {

    /* renamed from: a */
    public final Map f13153a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f13154b;

    /* renamed from: c */
    public long f13155c;

    /* renamed from: d */
    public long f13156d;

    public C7834f(long j9) {
        this.f13154b = j9;
        this.f13155c = j9;
    }

    /* renamed from: b */
    public void m12241b() {
        m12249m(0L);
    }

    /* renamed from: f */
    public final void m12242f() {
        m12249m(this.f13155c);
    }

    /* renamed from: g */
    public synchronized Object m12243g(Object obj) {
        return this.f13153a.get(obj);
    }

    /* renamed from: h */
    public synchronized long m12244h() {
        return this.f13155c;
    }

    /* renamed from: i */
    public int mo12245i(Object obj) {
        return 1;
    }

    /* renamed from: k */
    public synchronized Object m12247k(Object obj, Object obj2) {
        long jMo12245i = mo12245i(obj2);
        if (jMo12245i >= this.f13155c) {
            mo12246j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f13156d += jMo12245i;
        }
        Object objPut = this.f13153a.put(obj, obj2);
        if (objPut != null) {
            this.f13156d -= mo12245i(objPut);
            if (!objPut.equals(obj2)) {
                mo12246j(obj, objPut);
            }
        }
        m12242f();
        return objPut;
    }

    /* renamed from: l */
    public synchronized Object m12248l(Object obj) {
        Object objRemove;
        objRemove = this.f13153a.remove(obj);
        if (objRemove != null) {
            this.f13156d -= mo12245i(objRemove);
        }
        return objRemove;
    }

    /* renamed from: m */
    public synchronized void m12249m(long j9) {
        while (this.f13156d > j9) {
            Iterator it = this.f13153a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f13156d -= mo12245i(value);
            Object key = entry.getKey();
            it.remove();
            mo12246j(key, value);
        }
    }

    /* renamed from: j */
    public void mo12246j(Object obj, Object obj2) {
    }
}
