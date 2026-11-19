package androidx.compose.foundation;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractClickableNode.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C10786q.f26013a;
    }

    public final void invoke(boolean z10) {
        ((AbstractClickableNode) this.receiver).onFocusChange(z10);
    }
}
