package androidx.room;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends FunctionReferenceImpl implements InterfaceC10559a {
    public InvalidationTracker$setAutoCloser$1(Object obj) {
        super(0, obj, InvalidationTracker.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m27214invoke();
        return C8736p.f16368a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m27214invoke() {
        ((InvalidationTracker) this.receiver).onAutoCloseCallback();
    }
}
