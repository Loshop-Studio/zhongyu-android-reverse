package androidx.compose.foundation.text.input.internal;

import androidx.compose.p011ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", m5303f = "TextFieldCoreModifier.kt", m5304i = {}, m5305l = {447, 450}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ Rect $rawCursorRect;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f, Rect rect, InterfaceC5631c<? super TextFieldCoreModifierNode$updateScrollState$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f;
        this.$rawCursorRect = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, this.$rawCursorRect, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5.bringIntoView(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.AbstractC5774b.m5119b(r5)
            goto L49
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.AbstractC5774b.m5119b(r5)
            goto L34
        L1c:
            kotlin.AbstractC5774b.m5119b(r5)
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getScrollState$p(r5)
            float r1 = r4.$offsetDifference
            float r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$roundToNext(r1)
            r4.label = r3
            java.lang.Object r5 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r1, r4)
            if (r5 != r0) goto L34
            goto L48
        L34:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.text.input.internal.TextLayoutState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextLayoutState$p(r5)
            androidx.compose.foundation.relocation.BringIntoViewRequester r5 = r5.getBringIntoViewRequester()
            androidx.compose.ui.geometry.Rect r1 = r4.$rawCursorRect
            r4.label = r2
            java.lang.Object r5 = r5.bringIntoView(r1, r4)
            if (r5 != r0) goto L49
        L48:
            return r0
        L49:
            d6.s r5 = p045d6.C5443s.f8405a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
