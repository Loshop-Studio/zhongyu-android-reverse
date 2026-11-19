package p152t;

import java.util.Map;
import p023c0.AbstractC4472q;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;

/* renamed from: t.g */
/* loaded from: classes3.dex */
public final class C7711g implements InterfaceC7713i {

    /* renamed from: a */
    public final long f10181a;

    /* renamed from: b */
    public final InterfaceC7714j f10182b;

    /* renamed from: c */
    public final b f10183c = new b(mo9163d());

    /* renamed from: t.g$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC6611j f10184a;

        /* renamed from: b */
        public final Map f10185b;

        /* renamed from: c */
        public final long f10186c;

        public a(InterfaceC6611j interfaceC6611j, Map map, long j6) {
            this.f10184a = interfaceC6611j;
            this.f10185b = map;
            this.f10186c = j6;
        }

        /* renamed from: a */
        public final Map m9193a() {
            return this.f10185b;
        }

        /* renamed from: b */
        public final InterfaceC6611j m9194b() {
            return this.f10184a;
        }

        /* renamed from: c */
        public final long m9195c() {
            return this.f10186c;
        }
    }

    /* renamed from: t.g$b */
    public static final class b extends AbstractC4472q {
        public b(long j6) {
            super(j6);
        }

        @Override // p023c0.AbstractC4472q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo1554b(InterfaceC7708d.b bVar, a aVar, a aVar2) {
            C7711g.this.f10182b.mo9168e(bVar, aVar.m9194b(), aVar.m9193a(), aVar.m9195c());
        }

        @Override // p023c0.AbstractC4472q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long mo1563k(InterfaceC7708d.b bVar, a aVar) {
            return aVar.m9195c();
        }
    }

    public C7711g(long j6, InterfaceC7714j interfaceC7714j) {
        this.f10181a = j6;
        this.f10182b = interfaceC7714j;
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: a */
    public InterfaceC7708d.c mo9160a(InterfaceC7708d.b bVar) {
        a aVar = (a) this.f10183c.m1555c(bVar);
        if (aVar != null) {
            return new InterfaceC7708d.c(aVar.m9194b(), aVar.m9193a());
        }
        return null;
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: b */
    public void mo9161b(long j6) {
        this.f10183c.m1562j(j6);
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: c */
    public boolean mo9162c(InterfaceC7708d.b bVar) {
        return this.f10183c.m1560h(bVar) != null;
    }

    @Override // p152t.InterfaceC7713i
    public void clear() {
        this.f10183c.m1553a();
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: d */
    public long mo9163d() {
        return this.f10181a;
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: e */
    public void mo9164e(InterfaceC7708d.b bVar, InterfaceC6611j interfaceC6611j, Map map, long j6) {
        if (j6 <= m9192h()) {
            this.f10183c.m1558f(bVar, new a(interfaceC6611j, map, j6));
        } else {
            this.f10183c.m1560h(bVar);
            this.f10182b.mo9168e(bVar, interfaceC6611j, map, j6);
        }
    }

    @Override // p152t.InterfaceC7713i
    /* renamed from: f */
    public void mo9165f(long j6) {
        this.f10183c.m1564l(j6);
    }

    @Override // p152t.InterfaceC7713i
    public long getSize() {
        return this.f10183c.m1557e();
    }

    /* renamed from: h */
    public long m9192h() {
        return this.f10183c.m1556d();
    }
}
