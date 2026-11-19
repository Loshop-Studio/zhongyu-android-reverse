package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m5303f = "Scrollable.kt", m5304i = {0, 1, 1, 2, 2}, m5305l = {748, 751, 754}, m5306m = "invokeSuspend", m5307n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m5308s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC6473e {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, InterfaceC5631c<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC5631c);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p152r6.InterfaceC6473e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m7054invokesFctU(((Velocity) obj).getPackedValue(), (InterfaceC5631c) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m7054invokesFctU(long j7, InterfaceC5631c<? super Velocity> interfaceC5631c) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m13534boximpl(j7), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.AbstractC5774b.m5119b(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L86
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.AbstractC5774b.m5119b(r14)
            r0 = r14
            goto L66
        L2c:
            long r3 = r13.J$0
            kotlin.AbstractC5774b.m5119b(r14)
            r0 = r14
            goto L4a
        L33:
            kotlin.AbstractC5774b.m5119b(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m11783dispatchPreFlingQWom1Mo(r7, r13)
            if (r0 != r6) goto L49
            goto L85
        L49:
            r3 = r7
        L4a:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p011ui.unit.Velocity) r0
            long r7 = r0.getPackedValue()
            long r7 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m7046doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L63
            goto L85
        L63:
            r11 = r7
            r7 = r3
            r2 = r11
        L66:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p011ui.unit.Velocity) r0
            long r9 = r0.getPackedValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            long r2 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m11781dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L86
        L85:
            return r6
        L86:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p011ui.unit.Velocity) r0
            long r0 = r0.getPackedValue()
            long r0 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r3, r0)
            long r0 = androidx.compose.p011ui.unit.Velocity.m13546minusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.p011ui.unit.Velocity.m13534boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
