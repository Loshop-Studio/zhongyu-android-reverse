package p070b.p146d.p147a.p148b;

import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p150d.InterfaceC0890b;
import p070b.p146d.p147a.p150d.p151c.C0893c;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.C1011d;

/* renamed from: b.d.a.b.d */
/* loaded from: classes.dex */
public final class RunnableC0883d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EnumC0881b.a.d f4719b;

    /* renamed from: b.d.a.b.d$a */
    public static final class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C0893c f4721c;

        public a(C0893c c0893c) {
            this.f4721c = c0893c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC1006b interfaceC1006b = RunnableC0883d.this.f4719b.f4711c;
            C0893c c0893c = this.f4721c;
            if (c0893c != null) {
                interfaceC1006b.mo2586c(c0893c);
            } else {
                C1011d.m2815k();
                throw null;
            }
        }
    }

    public RunnableC0883d(EnumC0881b.a.d dVar) {
        this.f4719b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0890b interfaceC0890b = EnumC0881b.a.this.f4693d;
        EnumC0881b.a.this.f4699j.post(new a(interfaceC0890b != null ? interfaceC0890b.mo2589c() : null));
    }
}
