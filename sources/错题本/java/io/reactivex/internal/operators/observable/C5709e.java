package io.reactivex.internal.operators.observable;

import androidx.camera.core.impl.C0362d;
import io.reactivex.internal.disposables.DisposableHelper;
import p073h4.AbstractC5625a;
import p145q5.InterfaceC6436g;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;
import p192w5.InterfaceC6720a;

/* renamed from: io.reactivex.internal.operators.observable.e */
/* loaded from: classes.dex */
public final class C5709e implements InterfaceC6436g, InterfaceC6720a {

    /* renamed from: a */
    public final InterfaceC6436g f9002a;

    /* renamed from: b */
    public InterfaceC6559b f9003b;

    /* renamed from: c */
    public InterfaceC6720a f9004c;

    /* renamed from: d */
    public boolean f9005d;

    /* renamed from: e */
    public final C0362d f9006e;

    public C5709e(InterfaceC6436g interfaceC6436g, C0362d c0362d) {
        this.f9002a = interfaceC6436g;
        this.f9006e = c0362d;
    }

    @Override // p192w5.InterfaceC6721b
    public final void clear() {
        this.f9004c.clear();
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        this.f9003b.dispose();
    }

    @Override // p192w5.InterfaceC6721b
    public final boolean isEmpty() {
        return this.f9004c.isEmpty();
    }

    @Override // p192w5.InterfaceC6721b
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
        if (this.f9005d) {
            return;
        }
        this.f9005d = true;
        this.f9002a.onComplete();
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable th) {
        if (this.f9005d) {
            AbstractC6675d.m6351q(th);
        } else {
            this.f9005d = true;
            this.f9002a.onError(th);
        }
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        if (this.f9005d) {
            return;
        }
        try {
            this.f9002a.onNext(this.f9006e.m672b(obj));
        } catch (Throwable th) {
            AbstractC5625a.m4956p(th);
            this.f9003b.dispose();
            onError(th);
        }
    }

    @Override // p145q5.InterfaceC6436g
    public final void onSubscribe(InterfaceC6559b interfaceC6559b) {
        if (DisposableHelper.validate(this.f9003b, interfaceC6559b)) {
            this.f9003b = interfaceC6559b;
            if (interfaceC6559b instanceof InterfaceC6720a) {
                this.f9004c = (InterfaceC6720a) interfaceC6559b;
            }
            this.f9002a.onSubscribe(this);
        }
    }

    @Override // p192w5.InterfaceC6721b
    public final Object poll() {
        Object objPoll = this.f9004c.poll();
        if (objPoll != null) {
            return this.f9006e.m672b(objPoll);
        }
        return null;
    }

    @Override // p192w5.InterfaceC6720a
    public final int requestFusion(int i) {
        return 0;
    }
}
