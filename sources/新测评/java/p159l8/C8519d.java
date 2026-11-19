package p159l8;

import p181n8.InterfaceC8671b;

/* renamed from: l8.d */
/* loaded from: classes5.dex */
public final class C8519d implements InterfaceC8671b {

    /* renamed from: a */
    public volatile Object f14141a;

    /* renamed from: b */
    public final Object f14142b = new Object();

    /* renamed from: c */
    public final InterfaceC8520e f14143c;

    public C8519d(InterfaceC8520e interfaceC8520e) {
        this.f14143c = interfaceC8520e;
    }

    @Override // p181n8.InterfaceC8671b
    public Object generatedComponent() {
        if (this.f14141a == null) {
            synchronized (this.f14142b) {
                try {
                    if (this.f14141a == null) {
                        this.f14141a = this.f14143c.get();
                    }
                } finally {
                }
            }
        }
        return this.f14141a;
    }
}
