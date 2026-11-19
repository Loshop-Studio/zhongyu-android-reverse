package p109f8;

/* renamed from: f8.e */
/* loaded from: classes5.dex */
public class C7952e implements InterfaceC7951d {

    /* renamed from: a */
    public volatile boolean f13400a;

    /* renamed from: b */
    public InterfaceC7949b f13401b;

    /* renamed from: c */
    public Object f13402c;

    /* renamed from: d */
    public InterfaceC7948a f13403d;

    public C7952e(InterfaceC7949b interfaceC7949b, Object obj, InterfaceC7948a interfaceC7948a) {
        this.f13401b = interfaceC7949b;
        this.f13402c = obj;
        this.f13403d = interfaceC7948a;
    }

    @Override // p109f8.InterfaceC7951d
    public synchronized void cancel() {
        this.f13400a = true;
        InterfaceC7949b interfaceC7949b = this.f13401b;
        if (interfaceC7949b != null) {
            interfaceC7949b.mo2302c(this.f13403d, this.f13402c);
            this.f13401b = null;
            this.f13403d = null;
            this.f13402c = null;
        }
    }
}
