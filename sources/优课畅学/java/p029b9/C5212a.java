package p029b9;

/* renamed from: b9.a */
/* loaded from: classes5.dex */
public class C5212a implements InterfaceC5213b {

    /* renamed from: a */
    public final InterfaceC5215d f2293a;

    /* renamed from: b */
    public final int f2294b;

    /* renamed from: c */
    public final boolean f2295c;

    /* renamed from: d */
    public InterfaceC5214c f2296d;

    /* renamed from: e */
    public int f2297e;

    public C5212a(InterfaceC5215d interfaceC5215d, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The pool limit must be > 0");
        }
        this.f2293a = interfaceC5215d;
        this.f2294b = i10;
        this.f2295c = false;
    }

    @Override // p029b9.InterfaceC5213b
    /* renamed from: a */
    public void mo2108a(InterfaceC5214c interfaceC5214c) {
        if (interfaceC5214c.mo193d()) {
            System.out.print("[FinitePool] Element is already in pool: " + interfaceC5214c);
            return;
        }
        if (this.f2295c || this.f2297e < this.f2294b) {
            this.f2297e++;
            interfaceC5214c.mo196g(this.f2296d);
            interfaceC5214c.mo190a(true);
            this.f2296d = interfaceC5214c;
        }
        this.f2293a.mo208b(interfaceC5214c);
    }

    @Override // p029b9.InterfaceC5213b
    public InterfaceC5214c acquire() {
        InterfaceC5214c interfaceC5214cNewInstance = this.f2296d;
        if (interfaceC5214cNewInstance != null) {
            this.f2296d = (InterfaceC5214c) interfaceC5214cNewInstance.mo192c();
            this.f2297e--;
        } else {
            interfaceC5214cNewInstance = this.f2293a.newInstance();
        }
        if (interfaceC5214cNewInstance != null) {
            interfaceC5214cNewInstance.mo196g(null);
            interfaceC5214cNewInstance.mo190a(false);
            this.f2293a.mo207a(interfaceC5214cNewInstance);
        }
        return interfaceC5214cNewInstance;
    }
}
