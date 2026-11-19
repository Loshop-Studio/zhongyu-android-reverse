package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", m17801f = "Clickable.kt", m17802l = {908, 912}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j10, InterfaceC9324c<? super CombinedClickableNode$onClickKeyUpEvent$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (kotlinx.coroutines.DelayKt.m16227b(r4 - r6, r10) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r11)
            goto L64
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            long r4 = r10.J$1
            long r6 = r10.J$0
            kotlin.AbstractC9079b.m15926b(r11)
            goto L46
        L22:
            kotlin.AbstractC9079b.m15926b(r11)
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p013ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r1)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.p013ui.platform.ViewConfiguration) r11
            long r6 = r11.getDoubleTapMinTimeMillis()
            long r4 = r11.getDoubleTapTimeoutMillis()
            r10.J$0 = r6
            r10.J$1 = r4
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m16227b(r6, r10)
            if (r11 != r0) goto L46
            goto L63
        L46:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.collection.MutableLongObjectMap r11 = androidx.compose.foundation.CombinedClickableNode.access$getDoubleKeyClickStates$p(r11)
            long r8 = r10.$keyCode
            java.lang.Object r11 = r11.get(r8)
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r11 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r11
            if (r11 != 0) goto L57
            goto L5a
        L57:
            r11.setDoubleTapMinTimeMillisElapsed(r3)
        L5a:
            long r4 = r4 - r6
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m16227b(r4, r10)
            if (r11 != r0) goto L64
        L63:
            return r0
        L64:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            x7.a r11 = r11.getOnClick()
            r11.invoke()
            h7.p r11 = p123h7.C8736p.f16368a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
