package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollingLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final InterfaceC10559a isScrollableNodeAttached;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m25394getUserInputWNlRxjI();
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo20599scrollByOzD1aCk(long j10, int i10) {
            return this.this$0.m20636performScroll3eAAhYA(this.this$0.outerStateScope, j10, i10);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo20600scrollByWithOverscrollOzD1aCk(long j10, int i10) {
            this.this$0.latestScrollSource = i10;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect != null && this.this$0.getShouldDispatchOverscroll()) {
                return overscrollEffect.mo20327applyToScrollRhakbz0(j10, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
            }
            return this.this$0.m20636performScroll3eAAhYA(this.this$0.outerStateScope, j10, i10);
        }
    };
    private final InterfaceC10570l performScrollForOverscroll = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Offset.m24024boximpl(m20649invokeMKHz9U(((Offset) obj).m24045unboximpl()));
        }

        /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m20649invokeMKHz9U(long j10) {
            ScrollScope scrollScope = this.this$0.outerStateScope;
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m20636performScroll3eAAhYA(scrollScope, j10, scrollingLogic.latestScrollSource);
        }
    };

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", m17801f = "Scrollable.kt", m17802l = {834}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2 */
    public static final class C13162 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13162(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C13162> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C13162 c13162 = ScrollingLogic.this.new C13162(this.$block, interfaceC9324c);
            c13162.L$0 = obj;
            return c13162;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(ScrollScope scrollScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C13162) create(scrollScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (interfaceC10574p.invoke(scrollingLogic$nestedScrollScope$1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z10, NestedScrollDispatcher nestedScrollDispatcher, InterfaceC10559a interfaceC10559a) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = interfaceC10559a;
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m20635dispatchRawDeltaMKHz9U(long j10) {
        return m20646toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m20645toFloatk4lQ0M(j10)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m20636performScroll3eAAhYA(ScrollScope scrollScope, long j10, int i10) {
        long jM25378dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m25378dispatchPreScrollOzD1aCk(j10, i10);
        long jM24039minusMKHz9U = Offset.m24039minusMKHz9U(j10, jM25378dispatchPreScrollOzD1aCk);
        long jM20643reverseIfNeededMKHz9U = m20643reverseIfNeededMKHz9U(m20646toOffsettuRUvjQ(scrollScope.scrollBy(m20645toFloatk4lQ0M(m20643reverseIfNeededMKHz9U(m20644singleAxisOffsetMKHz9U(jM24039minusMKHz9U))))));
        return Offset.m24040plusMKHz9U(Offset.m24040plusMKHz9U(jM25378dispatchPreScrollOzD1aCk, jM20643reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m25376dispatchPostScrollDzOQY0M(jM20643reverseIfNeededMKHz9U, Offset.m24039minusMKHz9U(jM24039minusMKHz9U, jM20643reverseIfNeededMKHz9U), i10));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, interfaceC10574p, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelFling(float f10) {
        if (f10 <= 0.0f || this.scrollableState.getCanScrollForward()) {
            return (f10 < 0.0f && !this.scrollableState.getCanScrollBackward()) || !((Boolean) this.isScrollableNodeAttached.invoke()).booleanValue();
        }
        return true;
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m20637singleAxisVelocityAH228Gc(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m27133copyOhffZ5M$default(j10, 0.0f, 0.0f, 1, null) : Velocity.m27133copyOhffZ5M$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m20638toFloatTH1AsA0(long j10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m27137getXimpl(j10) : Velocity.m27138getYimpl(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m20639updateQWom1Mo(long j10, float f10) {
        return this.orientation == Orientation.Horizontal ? Velocity.m27133copyOhffZ5M$default(j10, f10, 0.0f, 2, null) : Velocity.m27133copyOhffZ5M$default(j10, 0.0f, f10, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20640doFlingAnimationQWom1Mo(long r11, p179m7.InterfaceC9324c<? super androidx.compose.p013ui.unit.Velocity> r13) throws java.lang.Throwable {
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r12 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r12 = (androidx.compose.foundation.gestures.ScrollingLogic) r12
            kotlin.AbstractC9079b.m15926b(r13)
            r5 = r10
            goto L5f
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.AbstractC9079b.m15926b(r13)
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r6.f17472a = r11
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
            long r11 = r11.f17472a
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.p013ui.unit.Velocity.m27128boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m20640doFlingAnimationQWom1Mo(long, m7.c):java.lang.Object");
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
    public final Object m20641onScrollStoppedBMRW4eQ(long j10, boolean z10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (z10 && !ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            return C8736p.f16368a;
        }
        long jM20637singleAxisVelocityAH228Gc = m20637singleAxisVelocityAH228Gc(j10);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
            Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m27128boximpl(jM20637singleAxisVelocityAH228Gc), interfaceC9324c);
            return objInvoke == AbstractC9434a.m17291f() ? objInvoke : C8736p.f16368a;
        }
        Object objMo20326applyToFlingBMRW4eQ = overscrollEffect.mo20326applyToFlingBMRW4eQ(jM20637singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, interfaceC9324c);
        return objMo20326applyToFlingBMRW4eQ == AbstractC9434a.m17291f() ? objMo20326applyToFlingBMRW4eQ : C8736p.f16368a;
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m20642performRawScrollMKHz9U(long j10) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m24051getZeroF1C5BW0() : m20635dispatchRawDeltaMKHz9U(j10);
    }

    public final float reverseIfNeeded(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m20643reverseIfNeededMKHz9U(long j10) {
        return this.reverseDirection ? Offset.m24042timestuRUvjQ(j10, -1.0f) : j10;
    }

    public final Object scroll(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new C13162(interfaceC10574p, null), interfaceC9324c);
        return objScroll == AbstractC9434a.m17291f() ? objScroll : C8736p.f16368a;
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
    public final long m20644singleAxisOffsetMKHz9U(long j10) {
        return this.orientation == Orientation.Horizontal ? Offset.m24029copydBAh8RU$default(j10, 0.0f, 0.0f, 1, null) : Offset.m24029copydBAh8RU$default(j10, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m20645toFloatk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m20646toOffsettuRUvjQ(float f10) {
        if (f10 == 0.0f) {
            return Offset.Companion.m24051getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        }
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m20647toVelocityadjELrA(float f10) {
        return f10 == 0.0f ? Velocity.Companion.m27148getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f10, 0.0f) : VelocityKt.Velocity(0.0f, f10);
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z10, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z11;
        boolean z12 = true;
        if (AbstractC9133u.m16128b(this.scrollableState, scrollableState)) {
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
