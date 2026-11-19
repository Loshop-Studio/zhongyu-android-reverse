package androidx.compose.foundation.text;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", m26211f = "BasicTextField.kt", m26212l = {321}, m26213m = "showTextToolbar")
/* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 */
/* loaded from: classes.dex */
public final class C1688x4001b59 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688x4001b59(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, InterfaceC11588c<? super C1688x4001b59> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showTextToolbar(null, null, this);
    }
}
