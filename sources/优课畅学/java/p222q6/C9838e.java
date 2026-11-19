package p222q6;

/* renamed from: q6.e */
/* loaded from: classes5.dex */
public class C9838e implements InterfaceC9837d {

    /* renamed from: a */
    public volatile boolean f19632a;

    /* renamed from: b */
    public InterfaceC9835b f19633b;

    /* renamed from: c */
    public Object f19634c;

    /* renamed from: d */
    public InterfaceC9834a f19635d;

    public C9838e(InterfaceC9835b interfaceC9835b, Object obj, InterfaceC9834a interfaceC9834a) {
        this.f19633b = interfaceC9835b;
        this.f19634c = obj;
        this.f19635d = interfaceC9834a;
    }

    @Override // p222q6.InterfaceC9837d
    public synchronized void cancel() {
        this.f19632a = true;
        InterfaceC9835b interfaceC9835b = this.f19633b;
        if (interfaceC9835b != null) {
            interfaceC9835b.mo15463a(this.f19635d, this.f19634c);
            this.f19633b = null;
            this.f19635d = null;
            this.f19634c = null;
        }
    }
}
