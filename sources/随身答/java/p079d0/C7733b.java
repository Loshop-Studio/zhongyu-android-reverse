package p079d0;

import kotlin.NoWhenBranchMatchedException;
import p079d0.InterfaceC7734c;
import p297y.C9923d;
import p297y.C9936q;
import p297y.InterfaceC9929j;

/* renamed from: d0.b */
/* loaded from: classes3.dex */
public final class C7733b implements InterfaceC7734c {

    /* renamed from: a */
    public final InterfaceC7735d f13033a;

    /* renamed from: b */
    public final InterfaceC9929j f13034b;

    /* renamed from: d0.b$a */
    public static final class a implements InterfaceC7734c.a {
        @Override // p079d0.InterfaceC7734c.a
        /* renamed from: a */
        public InterfaceC7734c mo12080a(InterfaceC7735d interfaceC7735d, InterfaceC9929j interfaceC9929j) {
            return new C7733b(interfaceC7735d, interfaceC9929j);
        }
    }

    public C7733b(InterfaceC7735d interfaceC7735d, InterfaceC9929j interfaceC9929j) {
        this.f13033a = interfaceC7735d;
        this.f13034b = interfaceC9929j;
    }

    @Override // p079d0.InterfaceC7734c
    /* renamed from: a */
    public void mo12079a() {
        InterfaceC9929j interfaceC9929j = this.f13034b;
        if (interfaceC9929j instanceof C9936q) {
            this.f13033a.mo2307a(((C9936q) interfaceC9929j).m17120c());
        } else {
            if (!(interfaceC9929j instanceof C9923d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f13033a.mo2308b(((C9923d) interfaceC9929j).m17013b());
        }
    }
}
