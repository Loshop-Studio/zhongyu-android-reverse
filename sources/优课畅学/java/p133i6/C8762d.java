package p133i6;

import p155k6.InterfaceC9060b;

/* renamed from: i6.d */
/* loaded from: classes5.dex */
public final class C8762d implements InterfaceC9060b {

    /* renamed from: a */
    public volatile Object f16434a;

    /* renamed from: b */
    public final Object f16435b = new Object();

    /* renamed from: c */
    public final InterfaceC8763e f16436c;

    public C8762d(InterfaceC8763e interfaceC8763e) {
        this.f16436c = interfaceC8763e;
    }

    @Override // p155k6.InterfaceC9060b
    public Object generatedComponent() {
        if (this.f16434a == null) {
            synchronized (this.f16435b) {
                try {
                    if (this.f16434a == null) {
                        this.f16434a = this.f16436c.get();
                    }
                } finally {
                }
            }
        }
        return this.f16434a;
    }
}
