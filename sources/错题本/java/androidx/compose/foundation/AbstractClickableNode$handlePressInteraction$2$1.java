package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", m5303f = "Clickable.kt", m5304i = {0, 1, 2}, m5305l = {1263, 1265, 1272, 1273, 1283}, m5306m = "invokeSuspend", m5307n = {"delayJob", "success", "release"}, m5308s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j7, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, InterfaceC5631c<? super AbstractClickableNode$handlePressInteraction$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$offset = j7;
        this.$interactionSource = mutableInteractionSource;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, interfaceC5631c);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r15.emit(r1, r14) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r3.emit(r15, r14) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            kotlin.AbstractC5774b.m5119b(r15)
            goto Lc2
        L24:
            java.lang.Object r1 = r14.L$0
            androidx.compose.foundation.interaction.PressInteraction$Release r1 = (androidx.compose.foundation.interaction.PressInteraction.Release) r1
            kotlin.AbstractC5774b.m5119b(r15)
            goto L93
        L2c:
            boolean r1 = r14.Z$0
            kotlin.AbstractC5774b.m5119b(r15)
            goto L78
        L32:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.w0 r1 = (kotlinx.coroutines.InterfaceC6013w0) r1
            kotlin.AbstractC5774b.m5119b(r15)
            goto L5e
        L3a:
            kotlin.AbstractC5774b.m5119b(r15)
            java.lang.Object r15 = r14.L$0
            kotlinx.coroutines.v r15 = (kotlinx.coroutines.InterfaceC6009v) r15
            androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 r8 = new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1
            androidx.compose.foundation.AbstractClickableNode r9 = r14.this$0
            long r10 = r14.$offset
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = r14.$interactionSource
            r13 = 0
            r8.<init>(r9, r10, r12, r13)
            kotlinx.coroutines.k1 r1 = kotlinx.coroutines.AbstractC6014x.m5651v(r15, r7, r7, r8, r4)
            androidx.compose.foundation.gestures.PressGestureScope r15 = r14.$this_handlePressInteraction
            r14.L$0 = r1
            r14.label = r6
            java.lang.Object r15 = r15.tryAwaitRelease(r14)
            if (r15 != r0) goto L5e
            goto Lc1
        L5e:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            boolean r6 = r1.isActive()
            if (r6 == 0) goto La0
            r14.L$0 = r7
            r14.Z$0 = r15
            r14.label = r5
            java.lang.Object r1 = kotlinx.coroutines.AbstractC6014x.m5636g(r1, r14)
            if (r1 != r0) goto L77
            goto Lc1
        L77:
            r1 = r15
        L78:
            if (r1 == 0) goto Lc2
            androidx.compose.foundation.interaction.PressInteraction$Press r15 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r1 = r14.$offset
            r15.<init>(r1, r7)
            androidx.compose.foundation.interaction.PressInteraction$Release r1 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r1.<init>(r15)
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r14.$interactionSource
            r14.L$0 = r1
            r14.label = r4
            java.lang.Object r15 = r2.emit(r15, r14)
            if (r15 != r0) goto L93
            goto Lc1
        L93:
            androidx.compose.foundation.interaction.MutableInteractionSource r15 = r14.$interactionSource
            r14.L$0 = r7
            r14.label = r3
            java.lang.Object r15 = r15.emit(r1, r14)
            if (r15 != r0) goto Lc2
            goto Lc1
        La0:
            androidx.compose.foundation.AbstractClickableNode r1 = r14.this$0
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = androidx.compose.foundation.AbstractClickableNode.access$getPressInteraction$p(r1)
            if (r1 == 0) goto Lc2
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r14.$interactionSource
            if (r15 == 0) goto Lb2
            androidx.compose.foundation.interaction.PressInteraction$Release r15 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r15.<init>(r1)
            goto Lb7
        Lb2:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r15 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r15.<init>(r1)
        Lb7:
            r14.L$0 = r7
            r14.label = r2
            java.lang.Object r15 = r3.emit(r15, r14)
            if (r15 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            androidx.compose.foundation.AbstractClickableNode r15 = r14.this$0
            androidx.compose.foundation.AbstractClickableNode.access$setPressInteraction$p(r15, r7)
            d6.s r15 = p045d6.C5443s.f8405a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
