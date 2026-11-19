package androidx.activity;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends FunctionReferenceImpl implements InterfaceC9529a {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m26703invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m26703invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
