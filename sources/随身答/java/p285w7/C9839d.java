package p285w7;

import p305y7.InterfaceC9966b;

/* renamed from: w7.d */
/* loaded from: classes5.dex */
public final class C9839d implements InterfaceC9966b {

    /* renamed from: a */
    public volatile Object f17561a;

    /* renamed from: b */
    public final Object f17562b = new Object();

    /* renamed from: c */
    public final InterfaceC9840e f17563c;

    public C9839d(InterfaceC9840e interfaceC9840e) {
        this.f17563c = interfaceC9840e;
    }

    @Override // p305y7.InterfaceC9966b
    public Object generatedComponent() {
        if (this.f17561a == null) {
            synchronized (this.f17562b) {
                try {
                    if (this.f17561a == null) {
                        this.f17561a = this.f17563c.get();
                    }
                } finally {
                }
            }
        }
        return this.f17561a;
    }
}
