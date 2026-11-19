package io.reactivex.internal.operators.observable;

import com.zykj.mistake.activity.C4481q;
import p073h4.AbstractC5625a;
import p145q5.AbstractC6434e;
import p145q5.InterfaceC6436g;

/* renamed from: io.reactivex.internal.operators.observable.b */
/* loaded from: classes.dex */
public final class C5706b extends AbstractC6434e {

    /* renamed from: a */
    public final C4481q f9000a;

    public C5706b(C4481q c4481q) {
        this.f9000a = c4481q;
    }

    @Override // p145q5.AbstractC6434e
    /* renamed from: c */
    public final void mo2173c(InterfaceC6436g interfaceC6436g) {
        ObservableCreate$CreateEmitter observableCreate$CreateEmitter = new ObservableCreate$CreateEmitter(interfaceC6436g);
        interfaceC6436g.onSubscribe(observableCreate$CreateEmitter);
        try {
            this.f9000a.m3946a(observableCreate$CreateEmitter);
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            observableCreate$CreateEmitter.onError(th);
        }
    }
}
