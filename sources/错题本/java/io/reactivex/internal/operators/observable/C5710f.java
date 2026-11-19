package io.reactivex.internal.operators.observable;

import p145q5.AbstractC6434e;
import p145q5.InterfaceC6436g;
import p151r5.C6468e;

/* renamed from: io.reactivex.internal.operators.observable.f */
/* loaded from: classes.dex */
public final class C5710f extends AbstractC5705a {

    /* renamed from: b */
    public final C6468e f9007b;

    /* renamed from: c */
    public final int f9008c;

    public C5710f(AbstractC6434e abstractC6434e, C6468e c6468e, int i) {
        super(abstractC6434e);
        this.f9007b = c6468e;
        this.f9008c = i;
    }

    @Override // p145q5.AbstractC6434e
    /* renamed from: c */
    public final void mo2173c(InterfaceC6436g interfaceC6436g) {
        this.f8999a.m6078b(new ObservableObserveOn$ObserveOnObserver(interfaceC6436g, this.f9007b.mo5086a(), false, this.f9008c));
    }
}
