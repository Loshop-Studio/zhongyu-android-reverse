package io.reactivex.internal.operators.observable;

import androidx.camera.core.impl.C0362d;
import java.util.concurrent.TimeUnit;
import p145q5.AbstractC6434e;
import p145q5.AbstractC6439j;
import p145q5.InterfaceC6436g;

/* renamed from: io.reactivex.internal.operators.observable.j */
/* loaded from: classes.dex */
public final class C5714j extends AbstractC5705a {

    /* renamed from: b */
    public final /* synthetic */ int f9014b;

    /* renamed from: c */
    public final Object f9015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5714j(AbstractC6434e abstractC6434e, Object obj, int i) {
        super(abstractC6434e);
        this.f9014b = i;
        this.f9015c = obj;
    }

    @Override // p145q5.AbstractC6434e
    /* renamed from: c */
    public final void mo2173c(InterfaceC6436g interfaceC6436g) {
        switch (this.f9014b) {
            case 0:
                ObservableSubscribeOn$SubscribeOnObserver observableSubscribeOn$SubscribeOnObserver = new ObservableSubscribeOn$SubscribeOnObserver(interfaceC6436g);
                interfaceC6436g.onSubscribe(observableSubscribeOn$SubscribeOnObserver);
                AbstractC6439j abstractC6439j = (AbstractC6439j) this.f9015c;
                RunnableC5713i runnableC5713i = new RunnableC5713i(this, observableSubscribeOn$SubscribeOnObserver);
                abstractC6439j.getClass();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                observableSubscribeOn$SubscribeOnObserver.setDisposable(abstractC6439j.mo5087b(runnableC5713i));
                break;
            default:
                this.f8999a.m6078b(new C5709e(interfaceC6436g, (C0362d) this.f9015c));
                break;
        }
    }
}
