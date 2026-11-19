package p427z;

import kotlin.NoWhenBranchMatchedException;
import p380w.C11624d;
import p380w.C11638r;
import p380w.InterfaceC11631k;
import p427z.InterfaceC11950c;

/* renamed from: z.b */
/* loaded from: classes3.dex */
public final class C11949b implements InterfaceC11950c {

    /* renamed from: a */
    public final InterfaceC11951d f28303a;

    /* renamed from: b */
    public final InterfaceC11631k f28304b;

    /* renamed from: z.b$a */
    public static final class a implements InterfaceC11950c.a {
        @Override // p427z.InterfaceC11950c.a
        /* renamed from: a */
        public InterfaceC11950c mo26512a(InterfaceC11951d interfaceC11951d, InterfaceC11631k interfaceC11631k) {
            return new C11949b(interfaceC11951d, interfaceC11631k);
        }
    }

    public C11949b(InterfaceC11951d interfaceC11951d, InterfaceC11631k interfaceC11631k) {
        this.f28303a = interfaceC11951d;
        this.f28304b = interfaceC11631k;
    }

    @Override // p427z.InterfaceC11950c
    /* renamed from: a */
    public void mo26511a() {
        InterfaceC11631k interfaceC11631k = this.f28304b;
        if (interfaceC11631k instanceof C11638r) {
            this.f28303a.mo3279a(((C11638r) interfaceC11631k).m25755c());
        } else {
            if (!(interfaceC11631k instanceof C11624d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f28303a.mo3280b(((C11624d) interfaceC11631k).m25642b());
        }
    }
}
