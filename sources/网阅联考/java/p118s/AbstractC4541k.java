package p118s;

import p062g0.AbstractC3749i;
import p093m.InterfaceC4361j;

/* renamed from: s.k */
/* loaded from: classes2.dex */
public abstract class AbstractC4541k implements InterfaceC4361j {

    /* renamed from: a */
    public final Object f5686a;

    public AbstractC4541k(Object obj) {
        this.f5686a = AbstractC3749i.m4768d(obj);
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return this.f5686a.getClass();
    }

    @Override // p093m.InterfaceC4361j
    public final Object get() {
        return this.f5686a;
    }

    @Override // p093m.InterfaceC4361j
    public final int getSize() {
        return 1;
    }

    @Override // p093m.InterfaceC4361j
    public void recycle() {
    }
}
