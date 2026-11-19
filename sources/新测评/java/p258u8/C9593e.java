package p258u8;

/* renamed from: u8.e */
/* loaded from: classes5.dex */
public class C9593e implements InterfaceC9592d {

    /* renamed from: a */
    public volatile boolean f16796a;

    /* renamed from: b */
    public InterfaceC9590b f16797b;

    /* renamed from: c */
    public Object f16798c;

    /* renamed from: d */
    public InterfaceC9589a f16799d;

    public C9593e(InterfaceC9590b interfaceC9590b, Object obj, InterfaceC9589a interfaceC9589a) {
        this.f16797b = interfaceC9590b;
        this.f16798c = obj;
        this.f16799d = interfaceC9589a;
    }

    @Override // p258u8.InterfaceC9592d
    public synchronized void cancel() {
        this.f16796a = true;
        InterfaceC9590b interfaceC9590b = this.f16797b;
        if (interfaceC9590b != null) {
            interfaceC9590b.mo15089a(this.f16799d, this.f16798c);
            this.f16797b = null;
            this.f16799d = null;
            this.f16798c = null;
        }
    }
}
