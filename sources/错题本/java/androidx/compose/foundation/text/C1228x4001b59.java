package androidx.compose.foundation.text;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", m5303f = "BasicTextField.kt", m5304i = {0}, m5305l = {321}, m5306m = "showTextToolbar", m5307n = {"$this$showTextToolbar_u24lambda_u245"}, m5308s = {"L$1"})
/* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 */
/* loaded from: classes.dex */
public final class C1228x4001b59 extends ContinuationImpl {
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
    public C1228x4001b59(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, InterfaceC5631c<? super C1228x4001b59> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showTextToolbar(null, null, this);
    }
}
