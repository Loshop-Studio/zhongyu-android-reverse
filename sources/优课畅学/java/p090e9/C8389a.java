package p090e9;

import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p078d9.AbstractC8325b;
import p078d9.InterfaceC8324a;
import p090e9.C8390b;
import p323z8.AbstractC10732c;
import p323z8.C10734e;
import p323z8.InterfaceC10739j;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;
import p323z8.InterfaceC10742m;
import p323z8.InterfaceC10743n;

/* renamed from: e9.a */
/* loaded from: classes5.dex */
public class C8389a extends AbstractC8325b {

    /* renamed from: a */
    public C10734e f15899a;

    /* renamed from: b */
    public final DanmakuContext f15900b;

    /* renamed from: c */
    public C8390b.f f15901c;

    /* renamed from: d */
    public final C8390b.f f15902d = new a();

    /* renamed from: e */
    public final C8390b f15903e;

    /* renamed from: f */
    public InterfaceC10739j f15904f;

    /* renamed from: g */
    public InterfaceC8324a.a f15905g;

    /* renamed from: e9.a$a */
    public class a implements C8390b.f {
        public a() {
        }

        @Override // p090e9.C8390b.f
        /* renamed from: a */
        public boolean mo13679a(AbstractC10732c abstractC10732c, float f10, int i10, boolean z10) {
            if (abstractC10732c.f21307n != 0 || !C8389a.this.f15900b.f18454z.m19870c(abstractC10732c, i10, 0, C8389a.this.f15899a, z10, C8389a.this.f15900b)) {
                return false;
            }
            abstractC10732c.m20041D(false);
            return true;
        }
    }

    public C8389a(DanmakuContext danmakuContext) {
        this.f15900b = danmakuContext;
        this.f15903e = new C8390b(danmakuContext.m17217c());
    }

    @Override // p078d9.InterfaceC8324a
    /* renamed from: a */
    public void mo13526a(InterfaceC10742m interfaceC10742m, InterfaceC10741l interfaceC10741l, long j10, InterfaceC8324a.b bVar) {
        this.f15899a = bVar.f15787b;
        InterfaceC10740k it = interfaceC10741l.iterator();
        AbstractC10732c abstractC10732c = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC10732c next = it.next();
            if (next.m20064w()) {
                interfaceC10742m.mo133j(next);
            } else if (bVar.f15786a || !next.m20059r()) {
                if (!next.m20055n()) {
                    DanmakuContext danmakuContext = this.f15900b;
                    danmakuContext.f18454z.m19869b(next, bVar.f15788c, bVar.f15789d, bVar.f15787b, false, danmakuContext);
                }
                if (next.m20043b() >= j10 && (next.f21307n != 0 || !next.m20056o())) {
                    if (next.m20057p()) {
                        InterfaceC10743n interfaceC10743nM20046e = next.m20046e();
                        if (this.f15904f != null && (interfaceC10743nM20046e == null || interfaceC10743nM20046e.get() == null)) {
                            this.f15904f.mo19840a(next);
                        }
                        abstractC10732c = next;
                    } else {
                        if (next.mo20054m() == 1) {
                            bVar.f15788c++;
                        }
                        if (!next.m20058q()) {
                            next.mo20067z(interfaceC10742m, false);
                        }
                        if (!next.m20062u()) {
                            next.m20038A(interfaceC10742m, false);
                        }
                        this.f15903e.m13682c(next, interfaceC10742m, this.f15901c);
                        if (next.mo20063v() && (next.f21297d != null || next.mo20045d() <= interfaceC10742m.getHeight())) {
                            int iM20042a = next.m20042a(interfaceC10742m);
                            if (iM20042a == 1) {
                                bVar.f15803r++;
                            } else if (iM20042a == 2) {
                                bVar.f15804s++;
                                InterfaceC10739j interfaceC10739j = this.f15904f;
                                if (interfaceC10739j != null) {
                                    interfaceC10739j.mo19840a(next);
                                }
                            }
                            bVar.m13532a(next.mo20054m(), 1);
                            bVar.m13533b(1);
                            bVar.m13534c(next);
                            InterfaceC8324a.a aVar = this.f15905g;
                            if (aVar != null) {
                                int i10 = next.f21292J;
                                int i11 = this.f15900b.f18453y.f21334d;
                                if (i10 != i11) {
                                    next.f21292J = i11;
                                    aVar.mo13531a(next);
                                }
                            }
                        }
                    }
                }
            } else {
                it.remove();
            }
            abstractC10732c = next;
        }
        bVar.f15790e = abstractC10732c;
    }

    @Override // p078d9.InterfaceC8324a
    /* renamed from: b */
    public void mo13527b(InterfaceC10739j interfaceC10739j) {
        this.f15904f = interfaceC10739j;
    }

    @Override // p078d9.InterfaceC8324a
    /* renamed from: c */
    public void mo13528c(InterfaceC8324a.a aVar) {
        this.f15905g = aVar;
    }

    @Override // p078d9.InterfaceC8324a
    public void clear() {
        mo13530e();
        this.f15900b.f18454z.m19868a();
    }

    @Override // p078d9.InterfaceC8324a
    /* renamed from: d */
    public void mo13529d(boolean z10) {
        this.f15901c = z10 ? this.f15902d : null;
    }

    @Override // p078d9.InterfaceC8324a
    /* renamed from: e */
    public void mo13530e() {
        this.f15903e.m13681b();
    }

    @Override // p078d9.InterfaceC8324a
    public void release() {
        this.f15903e.m13683d();
        this.f15900b.f18454z.m19868a();
    }
}
