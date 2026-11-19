package androidx.compose.foundation.gestures;

import androidx.compose.p006ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m5174d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m5175d2 = {"Landroidx/compose/ui/unit/Velocity;", "velocity", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
@DebugMetadata(m5191c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", m5192f = "Scrollable.kt", m5193i = {0, 1, 1, 2, 2}, m5194l = {406, 408, 410}, m5195m = "invokeSuspend", m5196n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, m5197s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m7229invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m7229invokesFctU(long j4, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m11741boximpl(j4), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r9 = r0
            r0 = r14
            goto L95
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            long r2 = r13.J$1
            long r4 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r0 = r14
            r7 = r4
            goto L6e
        L2e:
            long r3 = r13.J$0
            kotlin.ResultKt.throwOnFailure(r14)
            r0 = r14
            goto L52
        L35:
            kotlin.ResultKt.throwOnFailure(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p006ui.input.nestedscroll.NestedScrollDispatcher) r0
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.m10382dispatchPreFlingQWom1Mo(r4, r13)
            if (r0 != r6) goto L51
            return r6
        L51:
            r3 = r4
        L52:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p006ui.unit.Velocity) r0
            long r7 = r0.getPackedValue()
            long r7 = androidx.compose.p006ui.unit.Velocity.m11753minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m7217doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L6b
            return r6
        L6b:
            r11 = r3
            r2 = r7
            r7 = r11
        L6e:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p006ui.unit.Velocity) r0
            long r9 = r0.getPackedValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.p006ui.input.nestedscroll.NestedScrollDispatcher) r0
            long r2 = androidx.compose.p006ui.unit.Velocity.m11753minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.m10380dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L94
            return r6
        L94:
            r2 = r7
        L95:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p006ui.unit.Velocity) r0
            long r0 = r0.getPackedValue()
            long r0 = androidx.compose.p006ui.unit.Velocity.m11753minusAH228Gc(r9, r0)
            long r0 = androidx.compose.p006ui.unit.Velocity.m11753minusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.p006ui.unit.Velocity.m11741boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
