package p250u0;

import p117i1.AbstractC7651j;
import p184o0.InterfaceC8690j;

/* renamed from: u0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9532d implements InterfaceC8690j {

    /* renamed from: a */
    public final Object f16641a;

    public AbstractC9532d(Object obj) {
        this.f16641a = AbstractC7651j.m12683d(obj);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return this.f16641a.getClass();
    }

    @Override // p184o0.InterfaceC8690j
    public final Object get() {
        return this.f16641a;
    }

    @Override // p184o0.InterfaceC8690j
    public final int getSize() {
        return 1;
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
    }
}
