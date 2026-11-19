package p284p0;

import p109d1.AbstractC8909j;
import p198j0.InterfaceC9657j;

/* renamed from: p0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10597d implements InterfaceC9657j {

    /* renamed from: c */
    public final Object f25574c;

    public AbstractC10597d(Object obj) {
        this.f25574c = AbstractC8909j.m17468d(obj);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return this.f25574c.getClass();
    }

    @Override // p198j0.InterfaceC9657j
    public final Object get() {
        return this.f25574c;
    }

    @Override // p198j0.InterfaceC9657j
    public final int getSize() {
        return 1;
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
    }
}
