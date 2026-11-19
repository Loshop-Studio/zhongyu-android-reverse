package androidx.lifecycle;

import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0362k;
import p000a.p057m.InterfaceC0354c;
import p000a.p057m.InterfaceC0356e;
import p000a.p057m.InterfaceC0358g;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC0356e {

    /* renamed from: a */
    public final InterfaceC0354c[] f3186a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0354c[] interfaceC0354cArr) {
        this.f3186a = interfaceC0354cArr;
    }

    @Override // p000a.p057m.InterfaceC0356e
    /* renamed from: g */
    public void mo1278g(InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar) {
        C0362k c0362k = new C0362k();
        for (InterfaceC0354c interfaceC0354c : this.f3186a) {
            interfaceC0354c.m1274a(interfaceC0358g, aVar, false, c0362k);
        }
        for (InterfaceC0354c interfaceC0354c2 : this.f3186a) {
            interfaceC0354c2.m1274a(interfaceC0358g, aVar, true, c0362k);
        }
    }
}
