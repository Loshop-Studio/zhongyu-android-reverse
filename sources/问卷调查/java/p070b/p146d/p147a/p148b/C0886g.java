package p070b.p146d.p147a.p148b;

import p070b.p146d.p147a.p148b.C0880a;
import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p160d.C0994d;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.AbstractC1012e;
import p160d.p162f.p164b.C1011d;

/* renamed from: b.d.a.b.g */
/* loaded from: classes.dex */
public final class C0886g implements C0880a.b {

    /* renamed from: a */
    public final /* synthetic */ EnumC0881b.a f4725a;

    /* renamed from: b.d.a.b.g$a */
    public static final class a extends AbstractC1012e implements InterfaceC1006b<C0891a, C0994d> {
        public a() {
            super(1);
        }

        @Override // p160d.p162f.p163a.InterfaceC1006b
        /* renamed from: c */
        public C0994d mo2586c(C0891a c0891a) {
            C0891a c0891a2 = c0891a;
            C1011d.m2810f(c0891a2, "it");
            EnumC0881b.a.m2582g(C0886g.this.f4725a, c0891a2, false);
            return C0994d.f5474a;
        }
    }

    public C0886g(EnumC0881b.a aVar) {
        this.f4725a = aVar;
    }

    @Override // p070b.p146d.p147a.p148b.C0880a.b
    /* renamed from: a */
    public final void mo2575a() {
        this.f4725a.mo2576a(new a());
    }
}
