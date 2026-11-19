package p000a.p060o.p061b;

import androidx.recyclerview.widget.RecyclerView;
import p000a.p021e.C0133e;
import p000a.p021e.C0136h;
import p000a.p031h.p042i.C0241c;

/* renamed from: a.o.b.b0 */
/* loaded from: classes.dex */
public class C0379b0 {

    /* renamed from: a */
    public final C0136h<RecyclerView.AbstractC0552z, a> f2210a = new C0136h<>();

    /* renamed from: b */
    public final C0133e<RecyclerView.AbstractC0552z> f2211b = new C0133e<>();

    /* renamed from: a.o.b.b0$a */
    public static class a {

        /* renamed from: d */
        public static C0241c<a> f2212d = new C0241c<>(20);

        /* renamed from: a */
        public int f2213a;

        /* renamed from: b */
        public RecyclerView.AbstractC0535i.c f2214b;

        /* renamed from: c */
        public RecyclerView.AbstractC0535i.c f2215c;

        /* renamed from: a */
        public static a m1352a() {
            a aVarMo805a = f2212d.mo805a();
            return aVarMo805a == null ? new a() : aVarMo805a;
        }

        /* renamed from: b */
        public static void m1353b(a aVar) {
            aVar.f2213a = 0;
            aVar.f2214b = null;
            aVar.f2215c = null;
            f2212d.mo806b(aVar);
        }
    }

    /* renamed from: a.o.b.b0$b */
    public interface b {
    }

    /* renamed from: a */
    public void m1345a(RecyclerView.AbstractC0552z abstractC0552z) {
        a orDefault = this.f2210a.getOrDefault(abstractC0552z, null);
        if (orDefault == null) {
            orDefault = a.m1352a();
            this.f2210a.put(abstractC0552z, orDefault);
        }
        orDefault.f2213a |= 1;
    }

    /* renamed from: b */
    public void m1346b(RecyclerView.AbstractC0552z abstractC0552z, RecyclerView.AbstractC0535i.c cVar) {
        a orDefault = this.f2210a.getOrDefault(abstractC0552z, null);
        if (orDefault == null) {
            orDefault = a.m1352a();
            this.f2210a.put(abstractC0552z, orDefault);
        }
        orDefault.f2215c = cVar;
        orDefault.f2213a |= 8;
    }

    /* renamed from: c */
    public void m1347c(RecyclerView.AbstractC0552z abstractC0552z, RecyclerView.AbstractC0535i.c cVar) {
        a orDefault = this.f2210a.getOrDefault(abstractC0552z, null);
        if (orDefault == null) {
            orDefault = a.m1352a();
            this.f2210a.put(abstractC0552z, orDefault);
        }
        orDefault.f2214b = cVar;
        orDefault.f2213a |= 4;
    }

    /* renamed from: d */
    public boolean m1348d(RecyclerView.AbstractC0552z abstractC0552z) {
        a orDefault = this.f2210a.getOrDefault(abstractC0552z, null);
        return (orDefault == null || (orDefault.f2213a & 1) == 0) ? false : true;
    }

    /* renamed from: e */
    public final RecyclerView.AbstractC0535i.c m1349e(RecyclerView.AbstractC0552z abstractC0552z, int i) {
        a aVarM517k;
        RecyclerView.AbstractC0535i.c cVar;
        int iM511e = this.f2210a.m511e(abstractC0552z);
        if (iM511e >= 0 && (aVarM517k = this.f2210a.m517k(iM511e)) != null) {
            int i2 = aVarM517k.f2213a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVarM517k.f2213a = i3;
                if (i == 4) {
                    cVar = aVarM517k.f2214b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM517k.f2215c;
                }
                if ((i3 & 12) == 0) {
                    this.f2210a.m515i(iM511e);
                    a.m1353b(aVarM517k);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void m1350f(RecyclerView.AbstractC0552z abstractC0552z) {
        a orDefault = this.f2210a.getOrDefault(abstractC0552z, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2213a &= -2;
    }

    /* renamed from: g */
    public void m1351g(RecyclerView.AbstractC0552z abstractC0552z) {
        int iM498h = this.f2211b.m498h() - 1;
        while (true) {
            if (iM498h < 0) {
                break;
            }
            if (abstractC0552z == this.f2211b.m499i(iM498h)) {
                C0133e<RecyclerView.AbstractC0552z> c0133e = this.f2211b;
                Object[] objArr = c0133e.f920d;
                Object obj = objArr[iM498h];
                Object obj2 = C0133e.f917f;
                if (obj != obj2) {
                    objArr[iM498h] = obj2;
                    c0133e.f918b = true;
                }
            } else {
                iM498h--;
            }
        }
        a aVarRemove = this.f2210a.remove(abstractC0552z);
        if (aVarRemove != null) {
            a.m1353b(aVarRemove);
        }
    }
}
