package p070b.p146d.p147a.p148b;

import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p150d.InterfaceC0890b;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.C1011d;

/* renamed from: b.d.a.b.c */
/* loaded from: classes.dex */
public final class RunnableC0882c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EnumC0881b.a.b f4716b;

    /* renamed from: b.d.a.b.c$a */
    public static final class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C0891a f4718c;

        public a(C0891a c0891a) {
            this.f4718c = c0891a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC1006b interfaceC1006b = RunnableC0882c.this.f4716b.f4705c;
            C0891a c0891a = this.f4718c;
            if (c0891a != null) {
                interfaceC1006b.mo2586c(c0891a);
            } else {
                C1011d.m2815k();
                throw null;
            }
        }
    }

    public RunnableC0882c(EnumC0881b.a.b bVar) {
        this.f4716b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0890b interfaceC0890b = EnumC0881b.a.this.f4693d;
        EnumC0881b.a.this.f4699j.post(new a(interfaceC0890b != null ? interfaceC0890b.mo2590d() : null));
    }
}
