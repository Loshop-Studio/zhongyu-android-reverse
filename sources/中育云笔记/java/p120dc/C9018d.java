package p120dc;

import p151fc.InterfaceC9219b;

/* renamed from: dc.d */
/* loaded from: classes6.dex */
public final class C9018d implements InterfaceC9219b {

    /* renamed from: c */
    public volatile Object f21003c;

    /* renamed from: d */
    public final Object f21004d = new Object();

    /* renamed from: e */
    public final InterfaceC9020f f21005e;

    public C9018d(InterfaceC9020f interfaceC9020f) {
        this.f21005e = interfaceC9020f;
    }

    @Override // p151fc.InterfaceC9219b
    public Object generatedComponent() {
        if (this.f21003c == null) {
            synchronized (this.f21004d) {
                try {
                    if (this.f21003c == null) {
                        this.f21003c = this.f21005e.get();
                    }
                } finally {
                }
            }
        }
        return this.f21003c;
    }
}
