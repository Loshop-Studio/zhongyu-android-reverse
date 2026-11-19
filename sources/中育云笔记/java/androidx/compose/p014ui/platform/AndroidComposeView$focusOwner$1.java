package androidx.compose.p014ui.platform;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public AndroidComposeView$focusOwner$1(Object obj) {
        super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC9529a) obj);
        return C10786q.f26013a;
    }

    public final void invoke(InterfaceC9529a interfaceC9529a) {
        ((AndroidComposeView) this.receiver).registerOnEndApplyChangesListener(interfaceC9529a);
    }
}
