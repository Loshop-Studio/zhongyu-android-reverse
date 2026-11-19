package androidx.compose.p013ui.platform;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public AndroidComposeView$focusOwner$1(Object obj) {
        super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC10559a) obj);
        return C8736p.f16368a;
    }

    public final void invoke(InterfaceC10559a interfaceC10559a) {
        ((AndroidComposeView) this.receiver).registerOnEndApplyChangesListener(interfaceC10559a);
    }
}
