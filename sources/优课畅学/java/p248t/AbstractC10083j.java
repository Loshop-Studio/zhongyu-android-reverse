package p248t;

import p116h0.AbstractC8706j;
import p182n.InterfaceC9357j;

/* renamed from: t.j */
/* loaded from: classes3.dex */
public abstract class AbstractC10083j implements InterfaceC9357j {

    /* renamed from: a */
    public final Object f20133a;

    public AbstractC10083j(Object obj) {
        this.f20133a = AbstractC8706j.m14181d(obj);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return this.f20133a.getClass();
    }

    @Override // p182n.InterfaceC9357j
    public final Object get() {
        return this.f20133a;
    }

    @Override // p182n.InterfaceC9357j
    public final int getSize() {
        return 1;
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
    }
}
