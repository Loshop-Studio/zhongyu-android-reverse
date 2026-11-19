package androidx.compose.p013ui.focus;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public /* synthetic */ class FocusOwnerImpl$focusInvalidationManager$1 extends FunctionReferenceImpl implements InterfaceC10559a {
    public FocusOwnerImpl$focusInvalidationManager$1(Object obj) {
        super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
    }

    @Override // p300x7.InterfaceC10559a
    public /* bridge */ /* synthetic */ Object invoke() {
        m23939invoke();
        return C8736p.f16368a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m23939invoke() {
        ((FocusOwnerImpl) this.receiver).invalidateOwnerFocusState();
    }
}
