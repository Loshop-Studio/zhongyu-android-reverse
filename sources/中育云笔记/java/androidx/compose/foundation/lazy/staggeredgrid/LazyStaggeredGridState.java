package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.annotation.IntRange;
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
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.p014ui.layout.Remeasurement;
import androidx.compose.p014ui.layout.RemeasurementModifier;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.C10405j;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // p181hd.InterfaceC9544p
        public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            return AbstractC10978w.m24139q(lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices(), lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        @Override // p181hd.InterfaceC9540l
        public final LazyStaggeredGridState invoke(List<int[]> list) {
            return new LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });
    private final LazyLayoutScrollDeltaBetweenPasses _lazyLayoutScrollDeltaBetweenPasses;
    private LazyStaggeredGridMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private boolean hasLookaheadOccurred;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<C10786q> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<C10786q> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2", m26211f = "LazyStaggeredGridState.kt", m26212l = {364}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$animateScrollToItem$2 */
    public static final class C16352 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyStaggeredGridMeasureResult $layoutInfo;
        final /* synthetic */ int $numOfItemsToTeleport;
        final /* synthetic */ int $scrollOffset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16352(int i10, int i11, int i12, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, InterfaceC11588c<? super C16352> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$index = i10;
            this.$scrollOffset = i11;
            this.$numOfItemsToTeleport = i12;
            this.$layoutInfo = lazyStaggeredGridMeasureResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C16352 c16352 = LazyStaggeredGridState.this.new C16352(this.$index, this.$scrollOffset, this.$numOfItemsToTeleport, this.$layoutInfo, interfaceC11588c);
            c16352.L$0 = obj;
            return c16352;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C16352) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LazyLayoutScrollScope LazyLayoutScrollScope = LazyStaggeredGridScrollScopeKt.LazyLayoutScrollScope(LazyStaggeredGridState.this, (ScrollScope) this.L$0);
                int i11 = this.$index;
                int i12 = this.$scrollOffset;
                int i13 = this.$numOfItemsToTeleport;
                Density density = this.$layoutInfo.getDensity();
                this.label = 1;
                if (LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i11, i12, i13, density, this) == objM25952f) {
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

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", m26211f = "LazyStaggeredGridState.kt", m26212l = {388}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1 */
    public static final class C16361 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C16361(InterfaceC11588c<? super C16361> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyStaggeredGridState.this.new C16361(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LazyStaggeredGridState lazyStaggeredGridState = LazyStaggeredGridState.this;
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(lazyStaggeredGridState, null, this, 1, null) == objM25952f) {
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
            return ((C16361) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", m26211f = "LazyStaggeredGridState.kt", m26212l = {251, 252}, m26213m = "scroll")
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 */
    public static final class C16371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C16371(InterfaceC11588c<? super C16371> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyStaggeredGridState.this.scroll(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", m26211f = "LazyStaggeredGridState.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2 */
    public static final class C16382 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16382(int i10, int i11, InterfaceC11588c<? super C16382> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$index = i10;
            this.$scrollOffset = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LazyStaggeredGridState.this.new C16382(this.$index, this.$scrollOffset, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(ScrollScope scrollScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C16382) create(scrollScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return C10786q.f26013a;
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.p014ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f10) {
                return Float.valueOf(-this.this$0.onScroll(-f10));
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m27642constructorimpl$default(null, 1, null);
        this._lazyLayoutScrollDeltaBetweenPasses = new LazyLayoutScrollDeltaBetweenPasses();
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, InterfaceC11588c interfaceC11588c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i10, i11, interfaceC11588c);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z10, z11);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex == -1 || visibleItemsInfo.isEmpty()) {
            return;
        }
        int index = ((LazyStaggeredGridItemInfo) AbstractC10947g0.m23944m0(visibleItemsInfo)).getIndex();
        int index2 = ((LazyStaggeredGridItemInfo) AbstractC10947g0.m23956y0(visibleItemsInfo)).getIndex();
        int i10 = this.prefetchBaseIndex;
        if (index > i10 || i10 > index2) {
            this.prefetchBaseIndex = -1;
            Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
            while (it.hasNext()) {
                ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
            }
            this.currentItemPrefetchHandles.clear();
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i10, int i11) {
        int[] iArr = new int[i11];
        if (this.layoutInfoState.getValue().getSpanProvider().isFullSpan(i10)) {
            AbstractC10964p.m23989D(iArr, i10, 0, 0, 6, null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i10 + i11);
        int lane = this.laneInfo.getLane(i10);
        if (lane != -2 && lane != -1) {
            if ((lane >= 0 ? 1 : 0) == 0) {
                InlineClassHelperKt.throwIllegalArgumentException("Expected positive lane number, got " + lane + " instead.");
            }
            iMin = Math.min(lane, i11);
        }
        int i12 = iMin;
        int i13 = i12 - 1;
        int iFindPreviousItemIndex = i10;
        while (true) {
            if (-1 >= i13) {
                break;
            }
            iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i13);
            iArr[i13] = iFindPreviousItemIndex;
            if (iFindPreviousItemIndex == -1) {
                AbstractC10964p.m23989D(iArr, -1, 0, i13, 2, null);
                break;
            }
            i13--;
        }
        iArr[i12] = i10;
        for (int i14 = i12 + 1; i14 < i11; i14++) {
            i10 = this.laneInfo.findNextItemIndex(i10, i14);
            iArr[i14] = i10;
        }
        return iArr;
    }

    private final void notifyPrefetch(float f10, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int i10;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((LazyStaggeredGridMeasuredItem) AbstractC10947g0.m23956y0(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem) AbstractC10947g0.m23944m0(lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
        int length = slots.getSizes().length;
        for (int i11 = 0; i11 < length; i11++) {
            index = z10 ? this.laneInfo.findNextItemIndex(index, i11) : this.laneInfo.findPreviousItemIndex(index, i11);
            if (index < 0 || index >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                boolean zIsFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(index);
                int i12 = zIsFullSpan ? 0 : i11;
                int i13 = zIsFullSpan ? length : 1;
                if (i13 == 1) {
                    i10 = slots.getSizes()[i12];
                } else {
                    int i14 = slots.getPositions()[i12];
                    int i15 = (i12 + i13) - 1;
                    i10 = (slots.getPositions()[i15] + slots.getSizes()[i15]) - i14;
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m27637schedulePrefetch0kLqBqw(index, lazyStaggeredGridMeasureResult.getOrientation() == Orientation.Vertical ? Constraints.Companion.m33466fixedWidthOenEA2s(i10) : Constraints.Companion.m33465fixedHeightOenEA2s(i10)));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    public static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f10, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f10, lazyStaggeredGridMeasureResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f10) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult;
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
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = this.layoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(iM19282d, !this.hasLookaheadOccurred);
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null && (lazyStaggeredGridMeasureResult = this.approachLayoutInfo) != null) {
                LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 = lazyStaggeredGridMeasureResult != null ? lazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(iM19282d, true) : null;
                if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2 != null) {
                    this.approachLayoutInfo = lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure2;
                } else {
                    lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure = null;
                }
            }
            if (lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure != null) {
                applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
                ObservableScopeInvalidator.m27646invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f12 - this.scrollToBeConsumed, lazyStaggeredGridMeasureResultCopyWithScrollDeltaWithoutRemeasure);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f12 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f10;
        }
        float f13 = f10 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f13;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i10, i11);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, InterfaceC11588c interfaceC11588c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i10, i11, interfaceC11588c);
    }

    private void setCanScrollBackward(boolean z10) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z10));
    }

    private void setCanScrollForward(boolean z10) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z10));
    }

    public final Object animateScrollToItem(int i10, int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C16352(i10, i11, value.getSlots().getSizes().length * 100, value, null), interfaceC11588c, 1, null);
        return objScroll$default == AbstractC11725a.m25952f() ? objScroll$default : C10786q.f26013a;
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z10, boolean z11) {
        if (!z10 && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyStaggeredGridMeasureResult;
            return;
        }
        if (z10) {
            this.hasLookaheadOccurred = true;
        }
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        if (z11) {
            this.scrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        if (z10) {
            this._lazyLayoutScrollDeltaBetweenPasses.updateScrollDeltaForApproach$foundation_release(lazyStaggeredGridMeasureResult.getScrollBackAmount(), lazyStaggeredGridMeasureResult.getDensity(), lazyStaggeredGridMeasureResult.getCoroutineScope());
        }
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f10) {
        return this.scrollableState.dispatchRawDelta(f10);
    }

    public final LazyStaggeredGridMeasureResult getApproachLayoutInfo$foundation_release() {
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
        return this.mutableInteractionSource;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final int getLaneCount$foundation_release() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27685getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    public final C10405j getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<C10786q> m27686getPlacementScopeInvalidatorzYiylxw$foundation_release() {
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

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void requestScrollToItem(@IntRange(from = 0) int i10, int i11) {
        if (isScrollInProgress()) {
            AbstractC11117h.m24726d(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new C16361(null), 3, null);
        }
        snapToItemInternal$foundation_release(i10, i11, false);
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C16371
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C16371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
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
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, hd.p, vc.c):java.lang.Object");
    }

    public final float scrollToBeConsumed$foundation_release(boolean z10) {
        return (z10 || !this.hasLookaheadOccurred) ? this.scrollToBeConsumed : getScrollDeltaBetweenPasses$foundation_release();
    }

    public final Object scrollToItem(int i10, int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C16382(i10, i11, null), interfaceC11588c, 1, null);
        return objScroll$default == AbstractC11725a.m25952f() ? objScroll$default : C10786q.f26013a;
    }

    public final void setMeasurePassCount$foundation_release(int i10) {
        this.measurePassCount = i10;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z10) {
        this.prefetchingEnabled = z10;
    }

    public final void snapToItemInternal$foundation_release(int i10, int i11, boolean z10) {
        boolean z11 = (this.scrollPosition.getIndex() == i10 && this.scrollPosition.getScrollOffset() == i11) ? false : true;
        if (z11) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, i10);
        if (lazyStaggeredGridItemInfoFindVisibleItem == null || !z11) {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(i10, i11);
        } else {
            int iM33630getYimpl = (value.getOrientation() == Orientation.Vertical ? IntOffset.m33630getYimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo27666getOffsetnOccac()) : IntOffset.m33629getXimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo27666getOffsetnOccac())) + i11;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = value.getFirstVisibleItemScrollOffsets()[i12] + iM33630getYimpl;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        }
        if (!z10) {
            ObservableScopeInvalidator.m27646invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    public /* synthetic */ LazyStaggeredGridState(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public LazyStaggeredGridState(int i10, int i11) {
        this(new int[]{i10}, new int[]{i11}, null);
    }
}
