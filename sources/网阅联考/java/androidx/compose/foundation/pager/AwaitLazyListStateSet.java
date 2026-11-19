package androidx.compose.foundation.pager;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0005J\u0011\u0010\t\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m5175d2 = {"Landroidx/compose/foundation/pager/AwaitLazyListStateSet;", "", "()V", "continuation", "Lkotlin/coroutines/Continuation;", "", "stateWasLoaded", "", "onStateLoaded", "waitFinalLazyListSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/AwaitLazyListStateSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
/* loaded from: classes.dex */
final class AwaitLazyListStateSet {
    private Continuation<? super Unit> continuation;
    private boolean stateWasLoaded;

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5191c = "androidx.compose.foundation.pager.AwaitLazyListStateSet", m5192f = "PagerState.kt", m5193i = {0, 0}, m5194l = {418}, m5195m = "waitFinalLazyListSetting", m5196n = {"this", "previousContinuation"}, m5197s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 */
    public static final class C07731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07731(Continuation<? super C07731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AwaitLazyListStateSet.this.waitFinalLazyListSetting(this);
        }
    }

    public final void onStateLoaded() {
        if (this.stateWasLoaded) {
            return;
        }
        this.stateWasLoaded = true;
        Continuation<? super Unit> continuation = this.continuation;
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m11788constructorimpl(Unit.INSTANCE));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitFinalLazyListSetting(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet.C07731
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet.C07731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = new androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.stateWasLoaded
            if (r5 != 0) goto L71
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m11788constructorimpl(r5)
            r1.resumeWith(r5)
        L71:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.AwaitLazyListStateSet.waitFinalLazyListSetting(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
