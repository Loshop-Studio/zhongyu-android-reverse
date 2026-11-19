package androidx.compose.foundation.text;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", m26211f = "BasicSecureTextField.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt$BasicSecureTextField$2$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ boolean $revealLastTypedEnabled;
    final /* synthetic */ SecureTextFieldController $secureTextFieldController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$2$1(boolean z10, SecureTextFieldController secureTextFieldController, InterfaceC11588c<? super BasicSecureTextFieldKt$BasicSecureTextField$2$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$revealLastTypedEnabled = z10;
        this.$secureTextFieldController = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$2$1(this.$revealLastTypedEnabled, this.$secureTextFieldController, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (!this.$revealLastTypedEnabled) {
            this.$secureTextFieldController.getPasswordInputTransformation().hide();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((BasicSecureTextFieldKt$BasicSecureTextField$2$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
