package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", m5303f = "Clickable.kt", m5304i = {0, 0}, m5305l = {908, 912}, m5306m = "invokeSuspend", m5307n = {"minTime", "timeout"}, m5308s = {"J$0", "J$1"})
/* loaded from: classes.dex */
public final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j7, InterfaceC5631c<? super CombinedClickableNode$onClickKeyUpEvent$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (kotlinx.coroutines.AbstractC6014x.m5638i(r4 - r6, r10) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.AbstractC5774b.m5119b(r11)
            goto L62
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            long r4 = r10.J$1
            long r6 = r10.J$0
            kotlin.AbstractC5774b.m5119b(r11)
            goto L44
        L20:
            kotlin.AbstractC5774b.m5119b(r11)
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p011ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r11 = androidx.compose.p011ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r1)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.p011ui.platform.ViewConfiguration) r11
            long r6 = r11.getDoubleTapMinTimeMillis()
            long r4 = r11.getDoubleTapTimeoutMillis()
            r10.J$0 = r6
            r10.J$1 = r4
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.AbstractC6014x.m5638i(r6, r10)
            if (r11 != r0) goto L44
            goto L61
        L44:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.collection.MutableLongObjectMap r11 = androidx.compose.foundation.CombinedClickableNode.access$getDoubleKeyClickStates$p(r11)
            long r8 = r10.$keyCode
            java.lang.Object r11 = r11.get(r8)
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r11 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r11
            if (r11 != 0) goto L55
            goto L58
        L55:
            r11.setDoubleTapMinTimeMillisElapsed(r3)
        L58:
            long r4 = r4 - r6
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.AbstractC6014x.m5638i(r4, r10)
            if (r11 != r0) goto L62
        L61:
            return r0
        L62:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            r6.a r11 = r11.getOnClick()
            r11.invoke()
            d6.s r11 = p045d6.C5443s.f8405a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
