package p185x4;

import p199z4.InterfaceC7948b;

/* renamed from: x4.d */
/* loaded from: classes4.dex */
public final class C7859d implements InterfaceC7948b {

    /* renamed from: a */
    public volatile Object f10471a;

    /* renamed from: b */
    public final Object f10472b = new Object();

    /* renamed from: c */
    public final InterfaceC7861f f10473c;

    public C7859d(InterfaceC7861f interfaceC7861f) {
        this.f10473c = interfaceC7861f;
    }

    @Override // p199z4.InterfaceC7948b
    public Object generatedComponent() {
        if (this.f10471a == null) {
            synchronized (this.f10472b) {
                try {
                    if (this.f10471a == null) {
                        this.f10471a = this.f10473c.get();
                    }
                } finally {
                }
            }
        }
        return this.f10471a;
    }
}
