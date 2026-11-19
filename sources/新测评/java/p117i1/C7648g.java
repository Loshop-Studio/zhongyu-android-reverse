package p117i1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: i1.g */
/* loaded from: classes3.dex */
public class C7648g {

    /* renamed from: a */
    public final Map f12891a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f12892b;

    /* renamed from: c */
    public long f12893c;

    /* renamed from: d */
    public long f12894d;

    /* renamed from: i1.g$a */
    public static final class a {

        /* renamed from: a */
        public final Object f12895a;

        /* renamed from: b */
        public final int f12896b;

        public a(Object obj, int i10) {
            this.f12895a = obj;
            this.f12896b = i10;
        }
    }

    public C7648g(long j10) {
        this.f12892b = j10;
        this.f12893c = j10;
    }

    /* renamed from: b */
    public void m12668b() {
        m12676m(0L);
    }

    /* renamed from: f */
    public final void m12669f() {
        m12676m(this.f12893c);
    }

    /* renamed from: g */
    public synchronized Object m12670g(Object obj) {
        a aVar;
        aVar = (a) this.f12891a.get(obj);
        return aVar != null ? aVar.f12895a : null;
    }

    /* renamed from: h */
    public synchronized long m12671h() {
        return this.f12893c;
    }

    /* renamed from: i */
    public int mo12672i(Object obj) {
        return 1;
    }

    /* renamed from: k */
    public synchronized Object m12674k(Object obj, Object obj2) {
        int iMo12672i = mo12672i(obj2);
        long j10 = iMo12672i;
        if (j10 >= this.f12893c) {
            mo12673j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f12894d += j10;
        }
        a aVar = (a) this.f12891a.put(obj, obj2 == null ? null : new a(obj2, iMo12672i));
        if (aVar != null) {
            this.f12894d -= aVar.f12896b;
            if (!aVar.f12895a.equals(obj2)) {
                mo12673j(obj, aVar.f12895a);
            }
        }
        m12669f();
        return aVar != null ? aVar.f12895a : null;
    }

    /* renamed from: l */
    public synchronized Object m12675l(Object obj) {
        a aVar = (a) this.f12891a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f12894d -= aVar.f12896b;
        return aVar.f12895a;
    }

    /* renamed from: m */
    public synchronized void m12676m(long j10) {
        while (this.f12894d > j10) {
            Iterator it = this.f12891a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f12894d -= aVar.f12896b;
            Object key = entry.getKey();
            it.remove();
            mo12673j(key, aVar.f12895a);
        }
    }

    /* renamed from: j */
    public void mo12673j(Object obj, Object obj2) {
    }
}
