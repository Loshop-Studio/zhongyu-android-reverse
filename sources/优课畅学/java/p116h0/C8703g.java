package p116h0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: h0.g */
/* loaded from: classes3.dex */
public class C8703g {

    /* renamed from: a */
    public final Map f16315a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f16316b;

    /* renamed from: c */
    public long f16317c;

    /* renamed from: d */
    public long f16318d;

    /* renamed from: h0.g$a */
    public static final class a {

        /* renamed from: a */
        public final Object f16319a;

        /* renamed from: b */
        public final int f16320b;

        public a(Object obj, int i10) {
            this.f16319a = obj;
            this.f16320b = i10;
        }
    }

    public C8703g(long j10) {
        this.f16316b = j10;
        this.f16317c = j10;
    }

    /* renamed from: a */
    public void m14166a() {
        m14174l(0L);
    }

    /* renamed from: e */
    public final void m14167e() {
        m14174l(this.f16317c);
    }

    /* renamed from: f */
    public synchronized Object m14168f(Object obj) {
        a aVar;
        aVar = (a) this.f16315a.get(obj);
        return aVar != null ? aVar.f16319a : null;
    }

    /* renamed from: g */
    public synchronized long m14169g() {
        return this.f16317c;
    }

    /* renamed from: h */
    public int mo14170h(Object obj) {
        return 1;
    }

    /* renamed from: j */
    public synchronized Object m14172j(Object obj, Object obj2) {
        int iMo14170h = mo14170h(obj2);
        long j10 = iMo14170h;
        if (j10 >= this.f16317c) {
            mo14171i(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f16318d += j10;
        }
        a aVar = (a) this.f16315a.put(obj, obj2 == null ? null : new a(obj2, iMo14170h));
        if (aVar != null) {
            this.f16318d -= aVar.f16320b;
            if (!aVar.f16319a.equals(obj2)) {
                mo14171i(obj, aVar.f16319a);
            }
        }
        m14167e();
        return aVar != null ? aVar.f16319a : null;
    }

    /* renamed from: k */
    public synchronized Object m14173k(Object obj) {
        a aVar = (a) this.f16315a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f16318d -= aVar.f16320b;
        return aVar.f16319a;
    }

    /* renamed from: l */
    public synchronized void m14174l(long j10) {
        while (this.f16318d > j10) {
            Iterator it = this.f16315a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f16318d -= aVar.f16320b;
            Object key = entry.getKey();
            it.remove();
            mo14171i(key, aVar.f16319a);
        }
    }

    /* renamed from: i */
    public void mo14171i(Object obj, Object obj2) {
    }
}
