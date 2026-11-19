package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
import androidx.compose.foundation.ExperimentalFoundationApi;
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
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p014ui.layout.Remeasurement;
import androidx.compose.p014ui.layout.RemeasurementModifier;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
            return AbstractC10978w.m24139q(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final LazyGridState invoke(List<Integer> list) {
            return new LazyGridState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private LazyGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private boolean hasLookaheadOccurred;
    private final MutableInteractionSource internalInteractionSource;
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> itemAnimator;
    private final MutableState<LazyGridMeasureResult> layoutInfoState;
    private final MutableState<C10786q> measurementScopeInvalidator;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<C10786q> placementScopeInvalidator;
    private final LazyGridPrefetchScope prefetchScope;
    private final LazyLayoutPrefetchState prefetchState;
    private final LazyGridPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }

        @ExperimentalFoundationApi
        public final Saver<LazyGridState, ?> saver$foundation_release(final LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
            return ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$saver$3
                @Override // p181hd.InterfaceC9544p
                public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
                    return AbstractC10978w.m24139q(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$saver$4
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final LazyGridState invoke(List<Integer> list) {
                    return new LazyGridState(list.get(0).intValue(), list.get(1).intValue(), lazyGridPrefetchStrategy);
                }
            });
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", m26211f = "LazyGridState.kt", m26212l = {492}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2 */
    public static final class C15712 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15712(int i10, int i11, InterfaceC11588c<? super C15712> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C15712 c15712 = LazyGridState.this.new C15712(this.$index, this.$scrollOffset, interfaceC11588c);
            c15712.L$0 = obj;
            return c15712;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C15712) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = LazyGridScrollScopeKt.LazyLayoutScrollScope(LazyGridState.this, (ScrollScope) this.L$0);
                int i11 = this.$index;
                int i12 = this.$scrollOffset;
                int numOfItemsToTeleport = LazyGridState.this.getNumOfItemsToTeleport();
                Density density$foundation_release = LazyGridState.this.getDensity$foundation_release();
                this.label = 1;
                if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i11, i12, numOfItemsToTeleport, density$foundation_release, this) == objM25952f) {
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

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.grid.LazyGridState$requestScrollToItem$1", m26211f = "LazyGridState.kt", m26212l = {337}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$requestScrollToItem$1 */
    public static final class C15721 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C15721(InterfaceC11588c<? super C15721> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyGridState.this.new C15721(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LazyGridState lazyGridState = LazyGridState.this;
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(lazyGridState, null, this, 1, null) == objM25952f) {
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
            return ((C15721) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.grid.LazyGridState", m26211f = "LazyGridState.kt", m26212l = {377, 378}, m26213m = "scroll")
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 */
    public static final class C15731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C15731(InterfaceC11588c<? super C15731> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyGridState.this.scroll(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", m26211f = "LazyGridState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2 */
    public static final class C15742 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15742(int i10, int i11, InterfaceC11588c<? super C15742> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyGridState.this.new C15742(this.$index, this.$scrollOffset, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C15742) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            LazyGridState.this.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return C10786q.f26013a;
        }
    }

    @ExperimentalFoundationApi
    public LazyGridState() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i10, int i11, InterfaceC11588c interfaceC11588c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.animateScrollToItem(i10, i11, interfaceC11588c);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResult, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation_release() * 100;
    }

    private final void notifyPrefetchOnScroll(float f10, LazyGridLayoutInfo lazyGridLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f10, lazyGridLayoutInfo);
        }
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyGridState lazyGridState, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        lazyGridState.requestScrollToItem(i10, i11);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i10, int i11, InterfaceC11588c interfaceC11588c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyGridState.scrollToItem(i10, i11, interfaceC11588c);
    }

    private void setCanScrollBackward(boolean z10) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z10));
    }

    private void setCanScrollForward(boolean z10) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z10));
    }

    public final Object animateScrollToItem(@IntRange(from = 0) int i10, int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C15712(i10, i11, null), interfaceC11588c, 1, null);
        return objScroll$default == AbstractC11725a.m25952f() ? objScroll$default : C10786q.f26013a;
    }

    public final void applyMeasureResult$foundation_release(LazyGridMeasureResult lazyGridMeasureResult, boolean z10, boolean z11) {
        if (!z10 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyGridMeasureResult;
            return;
        }
        if (z10) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        setCanScrollBackward(lazyGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
        if (z11) {
            this.scrollPosition.updateScrollOffset(lazyGridMeasureResult.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyGridMeasureResult);
            }
        }
        if (z10) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(lazyGridMeasureResult.getScrollBackAmount(), lazyGridMeasureResult.getDensity(), lazyGridMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.scrollableState.dispatchRawDelta(f10);
    }

    public final LazyGridMeasureResult getApproachLayoutInfo$foundation_release() {
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
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final Density getDensity$foundation_release() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
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

    public final LazyLayoutItemAnimator<LazyGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27607getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public final C10405j getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27608getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._lazyLayoutScrollDeltaBetweenPasses.getScrollDeltaBetweenPasses$foundation_release();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.layoutInfoState.getValue().getSlotsPerLine();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f10) {
        LazyGridMeasureResult lazyGridMeasureResult;
        if ((f10 < 0.0f && !getCanScrollForward()) || (f10 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (!(Math.abs(this.scrollToBeConsumed) <= 0.5f)) {
            InlineClassHelperKt.throwIllegalStateException("entered drag with non-zero pending scroll");
        }
        float f11 = this.scrollToBeConsumed + f10;
        this.scrollToBeConsumed = f11;
        if (Math.abs(f11) > 0.5f) {
            float f12 = this.scrollToBeConsumed;
            int iM19282d = AbstractC9719c.m19282d(f12);
            LazyGridMeasureResult lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(iM19282d, !this.hasLookaheadOccurred);
            if (lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (lazyGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyGridMeasureResult lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = lazyGridMeasureResult != null ? lazyGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(iM19282d, true) : null;
                if (lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                } else {
                    lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation_release(lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m27646invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetchOnScroll(f12 - this.scrollToBeConsumed, lazyGridMeasureResultCopyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetchOnScroll(f12 - this.scrollToBeConsumed, getLayoutInfo());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f13;
    }

    public final void requestScrollToItem(@IntRange(from = 0) int i10, int i11) {
        if (isScrollInProgress()) {
            AbstractC11117h.m24726d(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new C15721(null), 3, null);
        }
        snapToItemIndexInternal$foundation_release(i10, i11, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8.scroll(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r6, p181hd.InterfaceC9544p r7, vc.InterfaceC11588c<? super p309qc.C10786q> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState.C15731
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState.C15731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            hd.p r7 = (p181hd.InterfaceC9544p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
            kotlin.AbstractC9924b.m20071b(r8)
            goto L5a
        L45:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            goto L6b
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, hd.p, vc.c):java.lang.Object");
    }

    public final Object scrollToItem(@IntRange(from = 0) int i10, int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C15742(i10, i11, null), interfaceC11588c, 1, null);
        return objScroll$default == AbstractC11725a.m25952f() ? objScroll$default : C10786q.f26013a;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void snapToItemIndexInternal$foundation_release(int i10, int i11, boolean z10) {
        if (this.scrollPosition.getIndex() != i10 || this.scrollPosition.getScrollOffset() != i11) {
            this.itemAnimator.reset();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i10, i11);
        if (!z10) {
            ObservableScopeInvalidator.m27646invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyGridItemProvider lazyGridItemProvider, int i10) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider, i10);
    }

    @ExperimentalFoundationApi
    public LazyGridState(final int i10, int i11, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        this.prefetchStrategy = lazyGridPrefetchStrategy;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i10, i11);
        this.scrollPosition = lazyGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyGridStateKt.EmptyLazyGridLayoutInfo, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f10) {
                return Float.valueOf(-this.this$0.onScroll$foundation_release(-f10));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.p014ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyGridPrefetchStrategy.getPrefetchScheduler(), new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NestedPrefetchScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(NestedPrefetchScope nestedPrefetchScope) {
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy2 = this.this$0.prefetchStrategy;
                int i12 = i10;
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
                lazyGridPrefetchStrategy2.onNestedPrefetch(nestedPrefetchScope, i12);
            }
        });
        this.prefetchScope = new LazyGridPrefetchScope() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
            public List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i12) {
                ArrayList arrayList = new ArrayList();
                Snapshot.Companion companion = Snapshot.Companion;
                LazyGridState lazyGridState = this.this$0;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    LazyGridMeasureResult approachLayoutInfo$foundation_release = lazyGridState.getHasLookaheadOccurred$foundation_release() ? lazyGridState.getApproachLayoutInfo$foundation_release() : (LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue();
                    if (approachLayoutInfo$foundation_release != null) {
                        List list = (List) approachLayoutInfo$foundation_release.getPrefetchInfoRetriever().invoke(Integer.valueOf(i12));
                        int size = list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            Pair pair = (Pair) list.get(i13);
                            arrayList.add(lazyGridState.getPrefetchState$foundation_release().m27637schedulePrefetch0kLqBqw(((Number) pair.m20051f()).intValue(), ((Constraints) pair.m20052g()).m33460unboximpl()));
                        }
                        C10786q c10786q = C10786q.f26013a;
                    }
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    return arrayList;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public /* synthetic */ LazyGridState(int i10, int i11, LazyGridPrefetchStrategy lazyGridPrefetchStrategy, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null) : lazyGridPrefetchStrategy);
    }

    public /* synthetic */ LazyGridState(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public LazyGridState(int i10, int i11) {
        this(i10, i11, LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null));
    }
}
