package p312r;

import java.util.Map;
import p001a0.AbstractC0020q;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;

/* renamed from: r.g */
/* loaded from: classes3.dex */
public final class C10828g implements InterfaceC10830i {

    /* renamed from: a */
    public final long f26130a;

    /* renamed from: b */
    public final InterfaceC10831j f26131b;

    /* renamed from: c */
    public final b f26132c = new b(mo23276c());

    /* renamed from: r.g$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC9756j f26133a;

        /* renamed from: b */
        public final Map f26134b;

        /* renamed from: c */
        public final long f26135c;

        public a(InterfaceC9756j interfaceC9756j, Map map, long j10) {
            this.f26133a = interfaceC9756j;
            this.f26134b = map;
            this.f26135c = j10;
        }

        /* renamed from: a */
        public final Map m23307a() {
            return this.f26134b;
        }

        /* renamed from: b */
        public final InterfaceC9756j m23308b() {
            return this.f26133a;
        }

        /* renamed from: c */
        public final long m23309c() {
            return this.f26135c;
        }
    }

    /* renamed from: r.g$b */
    public static final class b extends AbstractC0020q {
        public b(long j10) {
            super(j10);
        }

        @Override // p001a0.AbstractC0020q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo37b(InterfaceC10825d.b bVar, a aVar, a aVar2) {
            C10828g.this.f26131b.mo23281d(bVar, aVar.m23308b(), aVar.m23307a(), aVar.m23309c());
        }

        @Override // p001a0.AbstractC0020q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long mo46k(InterfaceC10825d.b bVar, a aVar) {
            return aVar.m23309c();
        }
    }

    public C10828g(long j10, InterfaceC10831j interfaceC10831j) {
        this.f26130a = j10;
        this.f26131b = interfaceC10831j;
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: a */
    public InterfaceC10825d.c mo23274a(InterfaceC10825d.b bVar) {
        a aVar = (a) this.f26132c.m38c(bVar);
        if (aVar != null) {
            return new InterfaceC10825d.c(aVar.m23308b(), aVar.m23307a());
        }
        return null;
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: b */
    public void mo23275b(long j10) {
        this.f26132c.m45j(j10);
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: c */
    public long mo23276c() {
        return this.f26130a;
    }

    @Override // p312r.InterfaceC10830i
    public void clear() {
        this.f26132c.m36a();
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: d */
    public void mo23277d(InterfaceC10825d.b bVar, InterfaceC9756j interfaceC9756j, Map map, long j10) {
        if (j10 <= m23306h()) {
            this.f26132c.m41f(bVar, new a(interfaceC9756j, map, j10));
        } else {
            this.f26132c.m43h(bVar);
            this.f26131b.mo23281d(bVar, interfaceC9756j, map, j10);
        }
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: e */
    public void mo23278e(long j10) {
        this.f26132c.m47l(j10);
    }

    @Override // p312r.InterfaceC10830i
    /* renamed from: f */
    public boolean mo23279f(InterfaceC10825d.b bVar) {
        return this.f26132c.m43h(bVar) != null;
    }

    @Override // p312r.InterfaceC10830i
    public long getSize() {
        return this.f26132c.m40e();
    }

    /* renamed from: h */
    public long m23306h() {
        return this.f26132c.m39d();
    }
}
