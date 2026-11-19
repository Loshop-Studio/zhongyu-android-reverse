package nc;

/* renamed from: nc.e */
/* loaded from: classes6.dex */
public class C10392e implements InterfaceC10391d {

    /* renamed from: a */
    public volatile boolean f24727a;

    /* renamed from: b */
    public InterfaceC10389b f24728b;

    /* renamed from: c */
    public Object f24729c;

    /* renamed from: d */
    public InterfaceC10388a f24730d;

    public C10392e(InterfaceC10389b interfaceC10389b, Object obj, InterfaceC10388a interfaceC10388a) {
        this.f24728b = interfaceC10389b;
        this.f24729c = obj;
        this.f24730d = interfaceC10388a;
    }

    @Override // nc.InterfaceC10391d
    public synchronized void cancel() {
        this.f24727a = true;
        InterfaceC10389b interfaceC10389b = this.f24728b;
        if (interfaceC10389b != null) {
            interfaceC10389b.mo19273a(this.f24730d, this.f24729c);
            this.f24728b = null;
            this.f24730d = null;
            this.f24729c = null;
        }
    }
}
