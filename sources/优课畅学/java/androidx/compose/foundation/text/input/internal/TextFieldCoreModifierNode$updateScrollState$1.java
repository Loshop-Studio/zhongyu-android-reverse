package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", m17801f = "TextFieldCoreModifier.kt", m17802l = {447, 450}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$updateScrollState$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ float $offsetDifference;
    final /* synthetic */ Rect $rawCursorRect;
    int label;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$updateScrollState$1(TextFieldCoreModifierNode textFieldCoreModifierNode, float f10, Rect rect, InterfaceC9324c<? super TextFieldCoreModifierNode$updateScrollState$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = textFieldCoreModifierNode;
        this.$offsetDifference = f10;
        this.$rawCursorRect = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new TextFieldCoreModifierNode$updateScrollState$1(this.this$0, this.$offsetDifference, this.$rawCursorRect, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TextFieldCoreModifierNode$updateScrollState$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r5.bringIntoView(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r5)
            goto L4b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.AbstractC9079b.m15926b(r5)
            goto L36
        L1e:
            kotlin.AbstractC9079b.m15926b(r5)
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.ScrollState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getScrollState$p(r5)
            float r1 = r4.$offsetDifference
            float r1 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt.access$roundToNext(r1)
            r4.label = r3
            java.lang.Object r5 = androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r5, r1, r4)
            if (r5 != r0) goto L36
            goto L4a
        L36:
            androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode r5 = r4.this$0
            androidx.compose.foundation.text.input.internal.TextLayoutState r5 = androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode.access$getTextLayoutState$p(r5)
            androidx.compose.foundation.relocation.BringIntoViewRequester r5 = r5.getBringIntoViewRequester()
            androidx.compose.ui.geometry.Rect r1 = r4.$rawCursorRect
            r4.label = r2
            java.lang.Object r5 = r5.bringIntoView(r1, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
