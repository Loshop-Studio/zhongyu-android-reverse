package p247t;

import java.util.Map;
import p090e0.AbstractC7818p;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;

/* renamed from: t.g */
/* loaded from: classes3.dex */
public final class C9598g implements InterfaceC9600i {

    /* renamed from: a */
    public final InterfaceC9601j f16810a;

    /* renamed from: b */
    public final b f16811b;

    /* renamed from: t.g$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC8239j f16812a;

        /* renamed from: b */
        public final Map f16813b;

        /* renamed from: c */
        public final long f16814c;

        public a(InterfaceC8239j interfaceC8239j, Map map, long j9) {
            this.f16812a = interfaceC8239j;
            this.f16813b = map;
            this.f16814c = j9;
        }

        /* renamed from: a */
        public final Map m15816a() {
            return this.f16813b;
        }

        /* renamed from: b */
        public final InterfaceC8239j m15817b() {
            return this.f16812a;
        }

        /* renamed from: c */
        public final long m15818c() {
            return this.f16814c;
        }
    }

    /* renamed from: t.g$b */
    public static final class b extends AbstractC7818p {

        /* renamed from: d */
        public final /* synthetic */ C9598g f16815d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j9, C9598g c9598g) {
            super(j9);
            this.f16815d = c9598g;
        }

        @Override // p090e0.AbstractC7818p
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo12204b(InterfaceC9595d.b bVar, a aVar, a aVar2) {
            this.f16815d.f16810a.mo15793c(bVar, aVar.m15817b(), aVar.m15816a(), aVar.m15818c());
        }

        @Override // p090e0.AbstractC7818p
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public long mo12212j(InterfaceC9595d.b bVar, a aVar) {
            return aVar.m15818c();
        }
    }

    public C9598g(long j9, InterfaceC9601j interfaceC9601j) {
        this.f16810a = interfaceC9601j;
        this.f16811b = new b(j9, this);
    }

    @Override // p247t.InterfaceC9600i
    /* renamed from: a */
    public InterfaceC9595d.c mo15787a(InterfaceC9595d.b bVar) {
        a aVar = (a) this.f16811b.m12205c(bVar);
        if (aVar != null) {
            return new InterfaceC9595d.c(aVar.m15817b(), aVar.m15816a());
        }
        return null;
    }

    @Override // p247t.InterfaceC9600i
    /* renamed from: b */
    public boolean mo15788b(InterfaceC9595d.b bVar) {
        return this.f16811b.m12210h(bVar) != null;
    }

    @Override // p247t.InterfaceC9600i
    /* renamed from: c */
    public void mo15789c(InterfaceC9595d.b bVar, InterfaceC8239j interfaceC8239j, Map map, long j9) {
        if (j9 <= m15815f()) {
            this.f16811b.m12208f(bVar, new a(interfaceC8239j, map, j9));
        } else {
            this.f16811b.m12210h(bVar);
            this.f16810a.mo15793c(bVar, interfaceC8239j, map, j9);
        }
    }

    @Override // p247t.InterfaceC9600i
    public void clear() {
        this.f16811b.m12203a();
    }

    @Override // p247t.InterfaceC9600i
    /* renamed from: d */
    public void mo15790d(long j9) {
        this.f16811b.m12213k(j9);
    }

    /* renamed from: f */
    public long m15815f() {
        return this.f16811b.m12206d();
    }

    @Override // p247t.InterfaceC9600i
    public long getSize() {
        return this.f16811b.m12207e();
    }
}
