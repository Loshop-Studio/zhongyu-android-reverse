package p070b.p146d.p147a.p148b;

import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p149c.AbstractBinderC0887a;
import p070b.p146d.p147a.p150d.InterfaceC0890b;

/* renamed from: b.d.a.b.f */
/* loaded from: classes.dex */
public final class RunnableC0885f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ EnumC0881b.a f4723b;

    /* renamed from: c */
    public final /* synthetic */ AbstractBinderC0887a f4724c;

    public RunnableC0885f(EnumC0881b.a aVar, AbstractBinderC0887a abstractBinderC0887a) {
        this.f4723b = aVar;
        this.f4724c = abstractBinderC0887a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0890b interfaceC0890b = this.f4723b.f4693d;
        if (interfaceC0890b != null) {
            interfaceC0890b.mo2587a(this.f4724c);
        }
    }
}
