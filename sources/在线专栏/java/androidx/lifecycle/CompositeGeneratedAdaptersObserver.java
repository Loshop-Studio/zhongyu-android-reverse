package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements InterfaceC0501i {

    /* renamed from: a */
    private final InterfaceC0494e[] f3352a;

    CompositeGeneratedAdaptersObserver(InterfaceC0494e[] interfaceC0494eArr) {
        this.f3352a = interfaceC0494eArr;
    }

    @Override // androidx.lifecycle.InterfaceC0501i
    /* renamed from: d */
    public void mo63d(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar) {
        C0510r c0510r = new C0510r();
        for (InterfaceC0494e interfaceC0494e : this.f3352a) {
            interfaceC0494e.m2866a(interfaceC0504l, bVar, false, c0510r);
        }
        for (InterfaceC0494e interfaceC0494e2 : this.f3352a) {
            interfaceC0494e2.m2866a(interfaceC0504l, bVar, true, c0510r);
        }
    }
}
