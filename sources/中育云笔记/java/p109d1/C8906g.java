package p109d1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: d1.g */
/* loaded from: classes3.dex */
public class C8906g {

    /* renamed from: a */
    public final Map f20873a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f20874b;

    /* renamed from: c */
    public long f20875c;

    /* renamed from: d */
    public long f20876d;

    /* renamed from: d1.g$a */
    public static final class a {

        /* renamed from: a */
        public final Object f20877a;

        /* renamed from: b */
        public final int f20878b;

        public a(Object obj, int i10) {
            this.f20877a = obj;
            this.f20878b = i10;
        }
    }

    public C8906g(long j10) {
        this.f20874b = j10;
        this.f20875c = j10;
    }

    /* renamed from: b */
    public void m17453b() {
        m17461m(0L);
    }

    /* renamed from: f */
    public final void m17454f() {
        m17461m(this.f20875c);
    }

    /* renamed from: g */
    public synchronized Object m17455g(Object obj) {
        a aVar;
        aVar = (a) this.f20873a.get(obj);
        return aVar != null ? aVar.f20877a : null;
    }

    /* renamed from: h */
    public synchronized long m17456h() {
        return this.f20875c;
    }

    /* renamed from: i */
    public int mo17457i(Object obj) {
        return 1;
    }

    /* renamed from: k */
    public synchronized Object m17459k(Object obj, Object obj2) {
        int iMo17457i = mo17457i(obj2);
        long j10 = iMo17457i;
        if (j10 >= this.f20875c) {
            mo17458j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f20876d += j10;
        }
        a aVar = (a) this.f20873a.put(obj, obj2 == null ? null : new a(obj2, iMo17457i));
        if (aVar != null) {
            this.f20876d -= aVar.f20878b;
            if (!aVar.f20877a.equals(obj2)) {
                mo17458j(obj, aVar.f20877a);
            }
        }
        m17454f();
        return aVar != null ? aVar.f20877a : null;
    }

    /* renamed from: l */
    public synchronized Object m17460l(Object obj) {
        a aVar = (a) this.f20873a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f20876d -= aVar.f20878b;
        return aVar.f20877a;
    }

    /* renamed from: m */
    public synchronized void m17461m(long j10) {
        while (this.f20876d > j10) {
            Iterator it = this.f20873a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f20876d -= aVar.f20878b;
            Object key = entry.getKey();
            it.remove();
            mo17458j(key, aVar.f20877a);
        }
    }

    /* renamed from: j */
    public void mo17458j(Object obj, Object obj2) {
    }
}
