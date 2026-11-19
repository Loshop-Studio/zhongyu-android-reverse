package dagger.hilt.android.internal.managers;

import p079j2.InterfaceC3802b;

/* renamed from: dagger.hilt.android.internal.managers.d */
/* loaded from: classes2.dex */
public final class C3718d implements InterfaceC3802b {

    /* renamed from: a */
    public volatile Object f4350a;

    /* renamed from: b */
    public final Object f4351b = new Object();

    /* renamed from: c */
    public final InterfaceC3719e f4352c;

    public C3718d(InterfaceC3719e interfaceC3719e) {
        this.f4352c = interfaceC3719e;
    }

    @Override // p079j2.InterfaceC3802b
    /* renamed from: a */
    public Object mo4607a() {
        if (this.f4350a == null) {
            synchronized (this.f4351b) {
                if (this.f4350a == null) {
                    this.f4350a = this.f4352c.get();
                }
            }
        }
        return this.f4350a;
    }
}
