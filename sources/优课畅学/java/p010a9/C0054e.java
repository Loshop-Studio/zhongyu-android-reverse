package p010a9;

import p029b9.InterfaceC5214c;
import p323z8.InterfaceC10743n;

/* renamed from: a9.e */
/* loaded from: classes5.dex */
public class C0054e implements InterfaceC10743n, InterfaceC5214c {

    /* renamed from: c */
    public C0054e f184c;

    /* renamed from: d */
    public boolean f185d;

    /* renamed from: b */
    public int f183b = 0;

    /* renamed from: e */
    public int f186e = 0;

    /* renamed from: a */
    public final C0055f f182a = new C0055f();

    @Override // p029b9.InterfaceC5214c
    /* renamed from: a */
    public void mo190a(boolean z10) {
        this.f185d = z10;
    }

    @Override // p323z8.InterfaceC10743n
    /* renamed from: b */
    public int mo191b() {
        return this.f182a.f192f;
    }

    @Override // p029b9.InterfaceC5214c
    /* renamed from: d */
    public boolean mo193d() {
        return this.f185d;
    }

    @Override // p323z8.InterfaceC10743n
    public void destroy() {
        C0055f c0055f = this.f182a;
        if (c0055f != null) {
            c0055f.m204c();
        }
        this.f183b = 0;
        this.f186e = 0;
    }

    @Override // p323z8.InterfaceC10743n
    /* renamed from: e */
    public synchronized void mo194e() {
        this.f186e--;
    }

    @Override // p323z8.InterfaceC10743n
    /* renamed from: f */
    public int mo195f() {
        return this.f182a.f191e;
    }

    /* renamed from: h */
    public void m197h(int i10, int i11, int i12, boolean z10) {
        this.f182a.m202a(i10, i11, i12, z10);
        this.f183b = this.f182a.f188b.getRowBytes() * this.f182a.f188b.getHeight();
    }

    @Override // p323z8.InterfaceC10743n
    public synchronized boolean hasReferences() {
        return this.f186e > 0;
    }

    @Override // p323z8.InterfaceC10743n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0055f get() {
        C0055f c0055f = this.f182a;
        if (c0055f.f188b == null) {
            return null;
        }
        return c0055f;
    }

    @Override // p029b9.InterfaceC5214c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0054e mo192c() {
        return this.f184c;
    }

    /* renamed from: k */
    public synchronized void m200k() {
        this.f186e++;
    }

    @Override // p029b9.InterfaceC5214c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo196g(C0054e c0054e) {
        this.f184c = c0054e;
    }

    @Override // p323z8.InterfaceC10743n
    public int size() {
        return this.f183b;
    }
}
