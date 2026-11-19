package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.layout.Remeasurement;
import androidx.compose.p014ui.layout.RemeasurementModifier;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;
    private PagerMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<C10786q> measurementScopeInvalidator;
    private long minScrollOffset;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<C10786q> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;
    private final MutableIntState programmaticScrollTargetPage$delegate;
    private final MutableState remeasurement$delegate;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;
    private final State settledPage$delegate;
    private final MutableIntState settledPageState$delegate;
    private final State targetPage$delegate;
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.PagerState", m26211f = "PagerState.kt", m26212l = {TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 617}, m26213m = "animateScrollToPage")
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 */
    public static final class C16491 extends ContinuationImpl {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16491(InterfaceC11588c<? super C16491> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", m26211f = "PagerState.kt", m26212l = {619}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 */
    public static final class C16503 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ int $targetPage;
        final /* synthetic */ float $targetPageOffsetToSnappedPosition;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16503(int i10, float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C16503> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$targetPage = i10;
            this.$targetPageOffsetToSnappedPosition = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C16503 c16503 = PagerState.this.new C16503(this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, interfaceC11588c);
            c16503.L$0 = obj;
            return c16503;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C16503) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = PagerScrollScopeKt.LazyLayoutScrollScope(PagerState.this, (ScrollScope) this.L$0);
                int i11 = this.$targetPage;
                float f10 = this.$targetPageOffsetToSnappedPosition;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final PagerState pagerState = PagerState.this;
                InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.pager.PagerState.animateScrollToPage.3.1
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((ScrollScope) obj2, ((Number) obj3).intValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(ScrollScope scrollScope, int i12) {
                        pagerState.updateTargetPage(scrollScope, i12);
                    }
                };
                this.label = 1;
                if (PagerStateKt.animateScrollToPage(LazyLayoutScrollScope, i11, f10, animationSpec, interfaceC9544p, this) == objM25952f) {
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

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", m26211f = "PagerState.kt", m26212l = {581}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.PagerState$requestScrollToPage$1 */
    public static final class C16511 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C16511(InterfaceC11588c<? super C16511> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return PagerState.this.new C16511(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PagerState pagerState = PagerState.this;
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(pagerState, null, this, 1, null) == objM25952f) {
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

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C16511) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.PagerState", m26211f = "PagerState.kt", m26212l = {636, 641}, m26213m = "scroll$suspendImpl")
    /* renamed from: androidx.compose.foundation.pager.PagerState$scroll$1 */
    public static final class C16521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C16521(InterfaceC11588c<? super C16521> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", m26211f = "PagerState.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_Y}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2 */
    public static final class C16532 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16532(float f10, int i10, InterfaceC11588c<? super C16532> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$pageOffsetFraction = f10;
            this.$page = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return PagerState.this.new C16532(this.$pageOffsetFraction, this.$page, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C16532) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                PagerState pagerState = PagerState.this;
                this.label = 1;
                if (pagerState.awaitScrollDependencies(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            float f10 = this.$pageOffsetFraction;
            double d10 = f10;
            boolean z10 = false;
            if (-0.5d <= d10 && d10 <= 0.5d) {
                z10 = true;
            }
            if (!z10) {
                InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
            }
            PagerState.this.snapToItem$foundation_release(PagerState.this.coerceInPageRange(this.$page), this.$pageOffsetFraction, true);
            return C10786q.f26013a;
        }
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i10, float f10, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i10, f10, animationSpec, interfaceC11588c);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(interfaceC11588c);
        return objWaitForFirstLayout == AbstractC11725a.m25952f() ? objWaitForFirstLayout : C10786q.f26013a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        if (this.indexToPrefetch == -1 || pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasPrefetchingForward ? ((PageInfo) AbstractC10947g0.m23956y0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1 : (((PageInfo) AbstractC10947g0.m23944m0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i10) {
        if (getPageCount() > 0) {
            return AbstractC10410o.m21761n(i10, 0, getPageCount() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f10) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(f10) == Math.signum(-Float.intBitsToFloat((int) (m27717getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(f10) == Math.signum(-Float.intBitsToFloat((int) (m27717getUpDownDifferenceF1C5BW0$foundation_release() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation_release();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i11 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                i10 = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i10);
    }

    private final void notifyPrefetch(float f10, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            boolean z10 = f10 > 0.0f;
            int index = z10 ? ((PageInfo) AbstractC10947g0.m23956y0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() + pagerLayoutInfo.getBeyondViewportPageCount() + 1 : (((PageInfo) AbstractC10947g0.m23944m0(pagerLayoutInfo.getVisiblePagesInfo())).getIndex() - pagerLayoutInfo.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= getPageCount()) {
                return;
            }
            if (index != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z10 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z10;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.m27637schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
            }
            if (z10) {
                if ((((PageInfo) AbstractC10947g0.m23956y0(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() + (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.getPageSpacing())) - pagerLayoutInfo.getViewportEndOffset() >= f10 || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (pagerLayoutInfo.getViewportStartOffset() - ((PageInfo) AbstractC10947g0.m23944m0(pagerLayoutInfo.getVisiblePagesInfo())).getOffset() >= (-f10) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f10) {
        PagerMeasureResult pagerMeasureResult;
        long jCurrentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f11 = this.accumulator + f10;
        long jM19284f = AbstractC9719c.m19284f(f11);
        this.accumulator = f11 - jM19284f;
        if (Math.abs(f10) < 1.0E-4f) {
            return f10;
        }
        long j10 = jCurrentAbsoluteScrollOffset + jM19284f;
        long jM21763p = AbstractC10410o.m21763p(j10, this.minScrollOffset, this.maxScrollOffset);
        boolean z10 = j10 != jM21763p;
        long j11 = jM21763p - jCurrentAbsoluteScrollOffset;
        float f12 = j11;
        this.previousPassDelta = f12;
        if (Math.abs(j11) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f12 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f12 < 0.0f));
        }
        int i10 = (int) j11;
        int i11 = -i10;
        PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i11);
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i11) : null;
            if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
            } else {
                pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation_release(pagerMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m27646invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i10);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z10 ? Long.valueOf(j11) : Float.valueOf(f10)).floatValue();
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i10, float f10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        pagerState.requestScrollToPage(i10, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, p181hd.InterfaceC9544p r7, vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState.C16521
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState.C16521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.AbstractC9924b.m20071b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            hd.p r7 = (p181hd.InterfaceC9544p) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.AbstractC9924b.m20071b(r8)
            goto L5c
        L4a:
            kotlin.AbstractC9924b.m20071b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L69
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L69:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, hd.p, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i10, float f10, InterfaceC11588c interfaceC11588c, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return pagerState.scrollToPage(i10, f10, interfaceC11588c);
    }

    private final void setCanScrollBackward(boolean z10) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setCanScrollForward(boolean z10) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setProgrammaticScrollTargetPage(int i10) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setSettledPageState(int i10) {
        this.settledPageState$delegate.setIntValue(i10);
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
            }
            C10786q c10786q = C10786q.f26013a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i10, float f10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i10, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, null, r3, r4, 1, null) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r12, @androidx.annotation.FloatRange(from = -0.5d, m337to = 0.5d) float r13, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r14, vc.InterfaceC11588c<? super p309qc.C10786q> r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.pager.PagerState.C16491
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.foundation.pager.PagerState.C16491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.AbstractC9924b.m20071b(r15)
            goto Lc5
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            float r13 = r4.F$0
            int r12 = r4.I$0
            java.lang.Object r14 = r4.L$1
            androidx.compose.animation.core.AnimationSpec r14 = (androidx.compose.animation.core.AnimationSpec) r14
            java.lang.Object r1 = r4.L$0
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            kotlin.AbstractC9924b.m20071b(r15)
        L46:
            r9 = r14
            goto L76
        L48:
            kotlin.AbstractC9924b.m20071b(r15)
            int r15 = r11.getCurrentPage()
            if (r12 != r15) goto L5a
            float r15 = r11.getCurrentPageOffsetFraction()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L5a
            goto L60
        L5a:
            int r15 = r11.getPageCount()
            if (r15 != 0) goto L63
        L60:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        L63:
            r4.L$0 = r11
            r4.L$1 = r14
            r4.I$0 = r12
            r4.F$0 = r13
            r4.label = r3
            java.lang.Object r15 = r11.awaitScrollDependencies(r4)
            if (r15 != r0) goto L74
            goto Lc4
        L74:
            r1 = r11
            goto L46
        L76:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r6 = 0
            if (r5 > 0) goto L85
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L85
            goto L86
        L85:
            r3 = r6
        L86:
            if (r3 != 0) goto La1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(r14)
        La1:
            int r7 = r1.coerceInPageRange(r12)
            int r12 = r1.getPageSizeWithSpacing$foundation_release()
            float r12 = (float) r12
            float r8 = r13 * r12
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r10 = 0
            r6 = r1
            r5 = r3
            r5.<init>(r7, r8, r9, r10)
            r12 = 0
            r4.L$0 = r12
            r4.L$1 = r12
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lc5
        Lc4:
            return r0
        Lc5:
            qc.q r12 = p309qc.C10786q.f26013a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, vc.c):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(PagerMeasureResult pagerMeasureResult, boolean z10, boolean z11) {
        if (!z10 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = pagerMeasureResult;
            return;
        }
        if (z10) {
            this.hasLookaheadOccurred = true;
        }
        if (z11) {
            this.scrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(pagerMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        this.minScrollOffset = PagerStateKt.calculateNewMinScrollOffset(pagerMeasureResult, getPageCount());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.scrollableState.dispatchRawDelta(f10);
    }

    public final PagerMeasureResult getApproachLayoutInfo$foundation_release() {
        return this.approachLayoutInfo;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.firstVisiblePageOffset;
    }

    public final boolean getHasLookaheadOccurred$foundation_release() {
        return this.hasLookaheadOccurred;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.layoutWithMeasurement;
    }

    public final long getMaxScrollOffset$foundation_release() {
        return this.maxScrollOffset;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27714getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public final long getMinScrollOffset$foundation_release() {
        return this.minScrollOffset;
    }

    public final C10405j getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    public final float getOffsetDistanceInPages(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= getPageCount()) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("page " + i10 + " is not within the range 0 to " + getPageCount());
        }
        return (i10 - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27715getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo27099toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m27716getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m27717getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m30647unboximpl();
    }

    public final boolean isNotGestureAction$foundation_release() {
        return ((int) Float.intBitsToFloat((int) (m27717getUpDownDifferenceF1C5BW0$foundation_release() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m27717getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i10) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i10);
    }

    public final void requestScrollToPage(@IntRange(from = 0) int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10) {
        if (isScrollInProgress()) {
            AbstractC11117h.m24726d(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new C16511(null), 3, null);
        }
        snapToItem$foundation_release(i10, f10, false);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return scroll$suspendImpl(this, mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    public final Object scrollToPage(int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C16532(f10, i10, null), interfaceC11588c, 1, null);
        return objScroll$default == AbstractC11725a.m25952f() ? objScroll$default : C10786q.f26013a;
    }

    public final void setDensity$foundation_release(Density density) {
        this.density = density;
    }

    public final void setMaxScrollOffset$foundation_release(long j10) {
        this.maxScrollOffset = j10;
    }

    public final void setMinScrollOffset$foundation_release(long j10) {
        this.minScrollOffset = j10;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m27718setPremeasureConstraintsBRTryo0$foundation_release(long j10) {
        this.premeasureConstraints = j10;
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m27719setUpDownDifferencek4lQ0M$foundation_release(long j10) {
        this.upDownDifference$delegate.setValue(Offset.m30626boximpl(j10));
    }

    public final void snapToItem$foundation_release(int i10, float f10, boolean z10) {
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i10, f10);
        if (!z10) {
            ObservableScopeInvalidator.m27646invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10) {
        snapToItem$foundation_release(i10, f10, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i10) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i10));
    }

    public PagerState(int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10, PrefetchScheduler prefetchScheduler) {
        double d10 = f10;
        boolean z10 = false;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            z10 = true;
        }
        if (!z10) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m30626boximpl(Offset.Companion.m30653getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i10, f10, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i10;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f11) {
                return Float.valueOf(this.this$0.performScroll(f11));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.density = PagerStateKt.UnitDensity;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.isScrollInProgress() ? this.this$0.getSettledPageState() : this.this$0.getCurrentPage());
            }
        });
        this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC9529a() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.coerceInPageRange(!this.this$0.isScrollInProgress() ? this.this$0.getCurrentPage() : this.this$0.getProgrammaticScrollTargetPage() != -1 ? this.this$0.getProgrammaticScrollTargetPage() : Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release()) ? this.this$0.getLastScrolledForward() ? this.this$0.getFirstVisiblePage$foundation_release() + 1 : this.this$0.getFirstVisiblePage$foundation_release() : this.this$0.getCurrentPage()));
            }
        });
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new InterfaceC9540l() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NestedPrefetchScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(NestedPrefetchScope nestedPrefetchScope) {
                Snapshot.Companion companion = Snapshot.Companion;
                PagerState pagerState = this.this$0;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    nestedPrefetchScope.schedulePrefetch(pagerState.getFirstVisiblePage$foundation_release());
                    C10786q c10786q = C10786q.f26013a;
                } finally {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                }
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.p014ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i10, float f10, PrefetchScheduler prefetchScheduler, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i10, float f10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10);
    }

    public PagerState(int i10, @FloatRange(from = -0.5d, m337to = 0.5d) float f10) {
        this(i10, f10, null);
    }
}
