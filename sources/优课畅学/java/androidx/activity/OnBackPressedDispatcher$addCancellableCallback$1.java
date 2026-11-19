package androidx.activity;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends FunctionReferenceImpl implements InterfaceC10559a {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m20101invoke();
        return C8736p.f16368a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m20101invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
