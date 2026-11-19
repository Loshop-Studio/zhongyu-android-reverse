package p085f1;

import androidx.work.C0810a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p103j.InterfaceC2685a;
import p169x0.AbstractC3445n;
import p169x0.C3434c;
import p169x0.C3453v;
import p169x0.EnumC3432a;

/* renamed from: f1.r */
/* loaded from: classes.dex */
public final class C2520r {

    /* renamed from: r */
    private static final String f10163r = AbstractC3445n.m10503f("WorkSpec");

    /* renamed from: s */
    public static final InterfaceC2685a<List<c>, List<C3453v>> f10164s = new a();

    /* renamed from: a */
    public String f10165a;

    /* renamed from: b */
    public C3453v.a f10166b;

    /* renamed from: c */
    public String f10167c;

    /* renamed from: d */
    public String f10168d;

    /* renamed from: e */
    public C0810a f10169e;

    /* renamed from: f */
    public C0810a f10170f;

    /* renamed from: g */
    public long f10171g;

    /* renamed from: h */
    public long f10172h;

    /* renamed from: i */
    public long f10173i;

    /* renamed from: j */
    public C3434c f10174j;

    /* renamed from: k */
    public int f10175k;

    /* renamed from: l */
    public EnumC3432a f10176l;

    /* renamed from: m */
    public long f10177m;

    /* renamed from: n */
    public long f10178n;

    /* renamed from: o */
    public long f10179o;

    /* renamed from: p */
    public long f10180p;

    /* renamed from: q */
    public boolean f10181q;

    /* renamed from: f1.r$a */
    class a implements InterfaceC2685a<List<c>, List<C3453v>> {
        a() {
        }

        @Override // p103j.InterfaceC2685a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C3453v> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m8452a());
            }
            return arrayList;
        }
    }

    /* renamed from: f1.r$b */
    public static class b {

        /* renamed from: a */
        public String f10182a;

        /* renamed from: b */
        public C3453v.a f10183b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f10183b != bVar.f10183b) {
                return false;
            }
            return this.f10182a.equals(bVar.f10182a);
        }

        public int hashCode() {
            return (this.f10182a.hashCode() * 31) + this.f10183b.hashCode();
        }
    }

    /* renamed from: f1.r$c */
    public static class c {

        /* renamed from: a */
        public String f10184a;

        /* renamed from: b */
        public C3453v.a f10185b;

        /* renamed from: c */
        public C0810a f10186c;

        /* renamed from: d */
        public int f10187d;

        /* renamed from: e */
        public List<String> f10188e;

        /* renamed from: f */
        public List<C0810a> f10189f;

        /* renamed from: a */
        public C3453v m8452a() {
            List<C0810a> list = this.f10189f;
            return new C3453v(UUID.fromString(this.f10184a), this.f10185b, this.f10186c, this.f10188e, (list == null || list.isEmpty()) ? C0810a.f4753c : this.f10189f.get(0), this.f10187d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f10187d != cVar.f10187d) {
                return false;
            }
            String str = this.f10184a;
            if (str == null ? cVar.f10184a != null : !str.equals(cVar.f10184a)) {
                return false;
            }
            if (this.f10185b != cVar.f10185b) {
                return false;
            }
            C0810a c0810a = this.f10186c;
            if (c0810a == null ? cVar.f10186c != null : !c0810a.equals(cVar.f10186c)) {
                return false;
            }
            List<String> list = this.f10188e;
            if (list == null ? cVar.f10188e != null : !list.equals(cVar.f10188e)) {
                return false;
            }
            List<C0810a> list2 = this.f10189f;
            List<C0810a> list3 = cVar.f10189f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f10184a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            C3453v.a aVar = this.f10185b;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C0810a c0810a = this.f10186c;
            int iHashCode3 = (((iHashCode2 + (c0810a != null ? c0810a.hashCode() : 0)) * 31) + this.f10187d) * 31;
            List<String> list = this.f10188e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<C0810a> list2 = this.f10189f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public C2520r(String str, String str2) {
        this.f10166b = C3453v.a.ENQUEUED;
        C0810a c0810a = C0810a.f4753c;
        this.f10169e = c0810a;
        this.f10170f = c0810a;
        this.f10174j = C3434c.f12037i;
        this.f10176l = EnumC3432a.EXPONENTIAL;
        this.f10177m = 30000L;
        this.f10180p = -1L;
        this.f10165a = str;
        this.f10167c = str2;
    }

    /* renamed from: a */
    public long m8447a() {
        if (m8449c()) {
            return this.f10178n + Math.min(18000000L, this.f10176l == EnumC3432a.LINEAR ? this.f10177m * this.f10175k : (long) Math.scalb(this.f10177m, this.f10175k - 1));
        }
        if (!m8450d()) {
            long jCurrentTimeMillis = this.f10178n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f10171g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j4 = this.f10178n;
        long j5 = j4 == 0 ? jCurrentTimeMillis2 + this.f10171g : j4;
        long j6 = this.f10173i;
        long j7 = this.f10172h;
        if (j6 != j7) {
            return j5 + j7 + (j4 == 0 ? j6 * (-1) : 0L);
        }
        return j5 + (j4 != 0 ? j7 : 0L);
    }

    /* renamed from: b */
    public boolean m8448b() {
        return !C3434c.f12037i.equals(this.f10174j);
    }

    /* renamed from: c */
    public boolean m8449c() {
        return this.f10166b == C3453v.a.ENQUEUED && this.f10175k > 0;
    }

    /* renamed from: d */
    public boolean m8450d() {
        return this.f10172h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2520r)) {
            return false;
        }
        C2520r c2520r = (C2520r) obj;
        if (this.f10171g != c2520r.f10171g || this.f10172h != c2520r.f10172h || this.f10173i != c2520r.f10173i || this.f10175k != c2520r.f10175k || this.f10177m != c2520r.f10177m || this.f10178n != c2520r.f10178n || this.f10179o != c2520r.f10179o || this.f10180p != c2520r.f10180p || this.f10181q != c2520r.f10181q || !this.f10165a.equals(c2520r.f10165a) || this.f10166b != c2520r.f10166b || !this.f10167c.equals(c2520r.f10167c)) {
            return false;
        }
        String str = this.f10168d;
        if (str == null ? c2520r.f10168d == null : str.equals(c2520r.f10168d)) {
            return this.f10169e.equals(c2520r.f10169e) && this.f10170f.equals(c2520r.f10170f) && this.f10174j.equals(c2520r.f10174j) && this.f10176l == c2520r.f10176l;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f10165a.hashCode() * 31) + this.f10166b.hashCode()) * 31) + this.f10167c.hashCode()) * 31;
        String str = this.f10168d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f10169e.hashCode()) * 31) + this.f10170f.hashCode()) * 31;
        long j4 = this.f10171g;
        int i4 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f10172h;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f10173i;
        int iHashCode3 = (((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f10174j.hashCode()) * 31) + this.f10175k) * 31) + this.f10176l.hashCode()) * 31;
        long j7 = this.f10177m;
        int i6 = (iHashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f10178n;
        int i7 = (i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f10179o;
        int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f10180p;
        return ((i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f10181q ? 1 : 0);
    }

    public String toString() {
        return "{WorkSpec: " + this.f10165a + "}";
    }

    public C2520r(C2520r c2520r) {
        this.f10166b = C3453v.a.ENQUEUED;
        C0810a c0810a = C0810a.f4753c;
        this.f10169e = c0810a;
        this.f10170f = c0810a;
        this.f10174j = C3434c.f12037i;
        this.f10176l = EnumC3432a.EXPONENTIAL;
        this.f10177m = 30000L;
        this.f10180p = -1L;
        this.f10165a = c2520r.f10165a;
        this.f10167c = c2520r.f10167c;
        this.f10166b = c2520r.f10166b;
        this.f10168d = c2520r.f10168d;
        this.f10169e = new C0810a(c2520r.f10169e);
        this.f10170f = new C0810a(c2520r.f10170f);
        this.f10171g = c2520r.f10171g;
        this.f10172h = c2520r.f10172h;
        this.f10173i = c2520r.f10173i;
        this.f10174j = new C3434c(c2520r.f10174j);
        this.f10175k = c2520r.f10175k;
        this.f10176l = c2520r.f10176l;
        this.f10177m = c2520r.f10177m;
        this.f10178n = c2520r.f10178n;
        this.f10179o = c2520r.f10179o;
        this.f10180p = c2520r.f10180p;
        this.f10181q = c2520r.f10181q;
    }
}
