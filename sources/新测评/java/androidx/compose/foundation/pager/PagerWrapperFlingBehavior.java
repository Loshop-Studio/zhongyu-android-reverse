package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m13558d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "performFling", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {
    private final TargetedFlingBehavior originalFlingBehavior;
    private final PagerState pagerState;

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", m13596f = "LazyLayoutPager.kt", m13597i = {0}, m13598l = {386}, m13599m = "performFling", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 */
    public static final class C15961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C15961(Continuation<? super C15961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerWrapperFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    public final TargetedFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(final androidx.compose.foundation.gestures.ScrollScope r6, float r7, kotlin.coroutines.Continuation<? super java.lang.Float> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior.C15961
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior.C15961) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.gestures.TargetedFlingBehavior r8 = r5.originalFlingBehavior
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = r8.performFling(r6, r7, r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            androidx.compose.foundation.pager.PagerState r8 = r6.pagerState
            float r8 = r8.getCurrentPageOffsetFraction()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto L7d
        L5d:
            androidx.compose.foundation.pager.PagerState r8 = r6.pagerState
            float r8 = r8.getCurrentPageOffsetFraction()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L7d
            androidx.compose.foundation.pager.PagerState r6 = r6.pagerState
            int r8 = r6.getCurrentPage()
            r1 = 2
            r2 = 0
            androidx.compose.foundation.pager.PagerState.requestScrollToPage$default(r6, r8, r0, r1, r2)
            goto L82
        L7d:
            androidx.compose.foundation.pager.PagerState r6 = r6.pagerState
            r6.getCurrentPageOffsetFraction()
        L82:
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
