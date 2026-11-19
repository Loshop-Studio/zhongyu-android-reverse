package androidx.compose.p014ui.focus;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public /* synthetic */ class FocusOwnerImpl$focusInvalidationManager$1 extends FunctionReferenceImpl implements InterfaceC9529a {
    public FocusOwnerImpl$focusInvalidationManager$1(Object obj) {
        super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m30541invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m30541invoke() {
        ((FocusOwnerImpl) this.receiver).invalidateOwnerFocusState();
    }
}
