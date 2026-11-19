package p238t;

import java.util.Map;
import p030c0.AbstractC5092q;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;

/* renamed from: t.g */
/* loaded from: classes3.dex */
public final class C9366g implements InterfaceC9368i {

    /* renamed from: a */
    public final long f16243a;

    /* renamed from: b */
    public final InterfaceC9369j f16244b;

    /* renamed from: c */
    public final b f16245c = new b(mo15614d());

    /* renamed from: t.g$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC7838j f16246a;

        /* renamed from: b */
        public final Map f16247b;

        /* renamed from: c */
        public final long f16248c;

        public a(InterfaceC7838j interfaceC7838j, Map map, long j10) {
            this.f16246a = interfaceC7838j;
            this.f16247b = map;
            this.f16248c = j10;
        }

        /* renamed from: a */
        public final Map m15644a() {
            return this.f16247b;
        }

        /* renamed from: b */
        public final InterfaceC7838j m15645b() {
            return this.f16246a;
        }

        /* renamed from: c */
        public final long m15646c() {
            return this.f16248c;
        }
    }

    /* renamed from: t.g$b */
    public static final class b extends AbstractC5092q {
        public b(long j10) {
            super(j10);
        }

        @Override // p030c0.AbstractC5092q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo2696b(InterfaceC9363d.b bVar, a aVar, a aVar2) {
            C9366g.this.f16244b.mo15619e(bVar, aVar.m15645b(), aVar.m15644a(), aVar.m15646c());
        }

        @Override // p030c0.AbstractC5092q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long mo2705k(InterfaceC9363d.b bVar, a aVar) {
            return aVar.m15646c();
        }
    }

    public C9366g(long j10, InterfaceC9369j interfaceC9369j) {
        this.f16243a = j10;
        this.f16244b = interfaceC9369j;
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: a */
    public InterfaceC9363d.c mo15611a(InterfaceC9363d.b bVar) {
        a aVar = (a) this.f16245c.m2697c(bVar);
        if (aVar != null) {
            return new InterfaceC9363d.c(aVar.m15645b(), aVar.m15644a());
        }
        return null;
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: b */
    public void mo15612b(long j10) {
        this.f16245c.m2704j(j10);
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: c */
    public boolean mo15613c(InterfaceC9363d.b bVar) {
        return this.f16245c.m2702h(bVar) != null;
    }

    @Override // p238t.InterfaceC9368i
    public void clear() {
        this.f16245c.m2695a();
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: d */
    public long mo15614d() {
        return this.f16243a;
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: e */
    public void mo15615e(InterfaceC9363d.b bVar, InterfaceC7838j interfaceC7838j, Map map, long j10) {
        if (j10 <= m15643h()) {
            this.f16245c.m2700f(bVar, new a(interfaceC7838j, map, j10));
        } else {
            this.f16245c.m2702h(bVar);
            this.f16244b.mo15619e(bVar, interfaceC7838j, map, j10);
        }
    }

    @Override // p238t.InterfaceC9368i
    /* renamed from: f */
    public void mo15616f(long j10) {
        this.f16245c.m2706l(j10);
    }

    @Override // p238t.InterfaceC9368i
    public long getSize() {
        return this.f16245c.m2699e();
    }

    /* renamed from: h */
    public long m15643h() {
        return this.f16245c.m2698d();
    }
}
