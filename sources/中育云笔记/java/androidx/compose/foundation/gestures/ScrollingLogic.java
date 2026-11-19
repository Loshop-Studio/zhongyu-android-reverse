package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p014ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.p014ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollingLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final InterfaceC9529a isScrollableNodeAttached;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m31996getUserInputWNlRxjI();
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo27201scrollByOzD1aCk(long j10, int i10) {
            return this.this$0.m27238performScroll3eAAhYA(this.this$0.outerStateScope, j10, i10);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo27202scrollByWithOverscrollOzD1aCk(long j10, int i10) {
            this.this$0.latestScrollSource = i10;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect != null && this.this$0.getShouldDispatchOverscroll()) {
                return overscrollEffect.mo26929applyToScrollRhakbz0(j10, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
            }
            return this.this$0.m27238performScroll3eAAhYA(this.this$0.outerStateScope, j10, i10);
        }
    };
    private final InterfaceC9540l performScrollForOverscroll = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m30626boximpl(m27251invokeMKHz9U(((Offset) obj).m30647unboximpl()));
        }

        /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m27251invokeMKHz9U(long j10) {
            ScrollScope scrollScope = this.this$0.outerStateScope;
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m27238performScroll3eAAhYA(scrollScope, j10, scrollingLogic.latestScrollSource);
        }
    };

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m26211f = "Scrollable.kt", m26212l = {834}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2 */
    public static final class C13462 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13462(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C13462> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C13462 c13462 = ScrollingLogic.this.new C13462(this.$block, interfaceC11588c);
            c13462.L$0 = obj;
            return c13462;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C13462) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                InterfaceC9544p interfaceC9544p = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (interfaceC9544p.invoke(scrollingLogic$nestedScrollScope$1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z10, NestedScrollDispatcher nestedScrollDispatcher, InterfaceC9529a interfaceC9529a) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = interfaceC9529a;
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m27237dispatchRawDeltaMKHz9U(long j10) {
        return m27248toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m27247toFloatk4lQ0M(j10)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m27238performScroll3eAAhYA(ScrollScope scrollScope, long j10, int i10) {
        long jM31980dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m31980dispatchPreScrollOzD1aCk(j10, i10);
        long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(j10, jM31980dispatchPreScrollOzD1aCk);
        long jM27245reverseIfNeededMKHz9U = m27245reverseIfNeededMKHz9U(m27248toOffsettuRUvjQ(scrollScope.scrollBy(m27247toFloatk4lQ0M(m27245reverseIfNeededMKHz9U(m27246singleAxisOffsetMKHz9U(jM30641minusMKHz9U))))));
        return Offset.m30642plusMKHz9U(Offset.m30642plusMKHz9U(jM31980dispatchPreScrollOzD1aCk, jM27245reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m31978dispatchPostScrollDzOQY0M(jM27245reverseIfNeededMKHz9U, Offset.m30641minusMKHz9U(jM30641minusMKHz9U, jM27245reverseIfNeededMKHz9U), i10));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelFling(float f10) {
        if (f10 <= 0.0f || this.scrollableState.getCanScrollForward()) {
            return (f10 < 0.0f && !this.scrollableState.getCanScrollBackward()) || !((Boolean) this.isScrollableNodeAttached.invoke()).booleanValue();
        }
        return true;
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m27239singleAxisVelocityAH228Gc(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m33735copyOhffZ5M$default(j10, 0.0f, 0.0f, 1, null) : Velocity.m33735copyOhffZ5M$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m27240toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m33739getXimpl(j10) : Velocity.m33740getYimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m27241updateQWom1Mo(long j10, float f10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m33735copyOhffZ5M$default(j10, f10, 0.0f, 2, null) : Velocity.m33735copyOhffZ5M$default(j10, 0.0f, f10, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m27242doFlingAnimationQWom1Mo(long r11, vc.InterfaceC11588c<? super androidx.compose.p014ui.unit.Velocity> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r12 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r12 = (androidx.compose.foundation.gestures.ScrollingLogic) r12
            kotlin.AbstractC9924b.m20071b(r13)
            r5 = r10
            goto L5f
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.AbstractC9924b.m20071b(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.f23401c = r11
            r10.isFlinging = r3
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r11 = r10.scroll(r13, r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r12 = r5
            r11 = r6
        L5f:
            r13 = 0
            r12.isFlinging = r13
            long r11 = r11.f23401c
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m27242doFlingAnimationQWom1Mo(long, vc.c):java.lang.Object");
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final boolean isFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m27243onScrollStoppedBMRW4eQ(long j10, boolean z10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (z10 && !ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            return C10786q.f26013a;
        }
        long jM27239singleAxisVelocityAH228Gc = m27239singleAxisVelocityAH228Gc(j10);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m33730boximpl(jM27239singleAxisVelocityAH228Gc), interfaceC11588c);
            return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
        }
        Object objMo26928applyToFlingBMRW4eQ = overscrollEffect.mo26928applyToFlingBMRW4eQ(jM27239singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, interfaceC11588c);
        return objMo26928applyToFlingBMRW4eQ == AbstractC11725a.m25952f() ? objMo26928applyToFlingBMRW4eQ : C10786q.f26013a;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m27244performRawScrollMKHz9U(long j10) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m30653getZeroF1C5BW0() : m27237dispatchRawDeltaMKHz9U(j10);
    }

    public final float reverseIfNeeded(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m27245reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m30644timestuRUvjQ(j10, -1.0f) : j10;
    }

    public final Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new C13462(interfaceC9544p, null), interfaceC11588c);
        return objScroll == AbstractC11725a.m25952f() ? objScroll : C10786q.f26013a;
    }

    public final void setScrollableState(ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null ? overscrollEffect.isInProgress() : false;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m27246singleAxisOffsetMKHz9U(long j10) {
        return this.orientation == Orientation.Horizontal ? Offset.m30631copydBAh8RU$default(j10, 0.0f, 0.0f, 1, null) : Offset.m30631copydBAh8RU$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m27247toFloatk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m27248toOffsettuRUvjQ(float f10) {
        if (f10 == 0.0f) {
            return Offset.Companion.m30653getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m27249toVelocityadjELrA(float f10) {
        return f10 == 0.0f ? Velocity.Companion.m33750getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f10, 0.0f) : VelocityKt.Velocity(0.0f, f10);
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z11;
        boolean z12 = true;
        if (AbstractC9979u.m20289b(this.scrollableState, scrollableState)) {
            z11 = false;
        } else {
            this.scrollableState = scrollableState;
            z11 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z11 = true;
        }
        if (this.reverseDirection != z10) {
            this.reverseDirection = z10;
        } else {
            z12 = z11;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z12;
    }
}
