package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p013ui.layout.SubcomposeLayoutState;
import androidx.compose.p013ui.node.TraversableNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p124h8.C8738a;
import p124h8.C8745h;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    private final PrefetchScheduler executor;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final SubcomposeLayoutState subcomposeLayoutState;

    @ExperimentalFoundationApi
    public final class HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle, PrefetchRequest {
        private long availableTimeNanos;
        private final long constraints;
        private long elapsedTimeNanos;
        private boolean hasResolvedNestedPrefetches;
        private final int index;
        private boolean isCanceled;
        private boolean isMeasured;
        private boolean isUrgent;
        private NestedPrefetchController nestedPrefetchController;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
        private final PrefetchMetrics prefetchMetrics;
        private long startTime;

        public final class NestedPrefetchController {
            private int requestIndex;
            private final List<PrefetchRequest>[] requestsByState;
            private int stateIndex;
            private final List<LazyLayoutPrefetchState> states;

            public NestedPrefetchController(List<LazyLayoutPrefetchState> list) {
                this.states = list;
                this.requestsByState = new List[list.size()];
                if (list.isEmpty()) {
                    InlineClassHelperKt.throwIllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean executeNestedPrefetches(PrefetchRequestScope prefetchRequestScope) {
                if (this.stateIndex >= this.states.size()) {
                    return false;
                }
                if (HandleAndRequestImpl.this.isCanceled) {
                    InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.stateIndex < this.states.size()) {
                    try {
                        if (this.requestsByState[this.stateIndex] == null) {
                            if (prefetchRequestScope.availableTimeNanos() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List<PrefetchRequest>[] listArr = this.requestsByState;
                            int i10 = this.stateIndex;
                            listArr[i10] = this.states.get(i10).collectNestedPrefetchRequests$foundation_release();
                        }
                        List<PrefetchRequest> list = this.requestsByState[this.stateIndex];
                        AbstractC9133u.m16130d(list);
                        while (this.requestIndex < list.size()) {
                            if (list.get(this.requestIndex).execute(prefetchRequestScope)) {
                                Trace.endSection();
                                return true;
                            }
                            this.requestIndex++;
                        }
                        this.requestIndex = 0;
                        this.stateIndex++;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                C8736p c8736p = C8736p.f16368a;
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i10, long j10, PrefetchMetrics prefetchMetrics, AbstractC9126n abstractC9126n) {
            this(i10, j10, prefetchMetrics);
        }

        private final boolean isComposed() {
            return this.precomposeHandle != null;
        }

        private final void performFullComposition(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
            if (!(this.precomposeHandle == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already composed!");
            }
            Object key = lazyLayoutItemProvider.getKey(this.index);
            this.precomposeHandle = PrefetchHandleProvider.this.subcomposeLayoutState.precompose(key, PrefetchHandleProvider.this.itemContentFactory.getContent(this.index, key, obj));
        }

        /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
        private final void m21049performMeasureBRTryo0(long j10) {
            if (this.isCanceled) {
                InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.isMeasured) {
                InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
            }
            this.isMeasured = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int placeablesCount = precomposedSlotHandle.getPlaceablesCount();
            for (int i10 = 0; i10 < placeablesCount; i10++) {
                precomposedSlotHandle.mo25653premeasure0kLqBqw(i10, j10);
            }
        }

        private final void resetAvailableTimeTo(long j10) {
            this.availableTimeNanos = j10;
            this.startTime = C8745h.f16378a.m14401a();
            this.elapsedTimeNanos = 0L;
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                    AbstractC9133u.m16131e(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
                    Ref$ObjectRef<List<LazyLayoutPrefetchState>> ref$ObjectRef2 = ref$ObjectRef;
                    List listM14776s = (List) ref$ObjectRef2.f17473a;
                    if (listM14776s != null) {
                        listM14776s.add(prefetchState);
                    } else {
                        listM14776s = AbstractC8809v.m14776s(prefetchState);
                    }
                    ref$ObjectRef2.f17473a = listM14776s;
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
            });
            List list = (List) ref$ObjectRef.f17473a;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        private final boolean shouldExecute(long j10, long j11) {
            return (this.isUrgent && j10 > 0) || j11 < j10;
        }

        private final void updateElapsedAndAvailableTime() {
            long jM14401a = C8745h.f16378a.m14401a();
            long jM14352q = C8738a.m14352q(C8745h.a.m14403b(jM14401a, this.startTime));
            this.elapsedTimeNanos = jM14352q;
            this.availableTimeNanos -= jM14352q;
            this.startTime = jM14401a;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.precomposeHandle = null;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequest
        public boolean execute(PrefetchRequestScope prefetchRequestScope) {
            LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) PrefetchHandleProvider.this.itemContentFactory.getItemProvider().invoke();
            if (!this.isCanceled) {
                int itemCount = lazyLayoutItemProvider.getItemCount();
                int i10 = this.index;
                if (i10 >= 0 && i10 < itemCount) {
                    Object contentType = lazyLayoutItemProvider.getContentType(i10);
                    resetAvailableTimeTo(prefetchRequestScope.availableTimeNanos());
                    if (!isComposed()) {
                        if (!shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getCompositionTimeNanos(contentType))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            performFullComposition(lazyLayoutItemProvider, contentType);
                            C8736p c8736p = C8736p.f16368a;
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            this.prefetchMetrics.saveCompositionTime(contentType, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                    if (!this.isUrgent) {
                        if (!this.hasResolvedNestedPrefetches) {
                            if (this.availableTimeNanos <= 0) {
                                return true;
                            }
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            try {
                                this.nestedPrefetchController = resolveNestedPrefetchStates();
                                this.hasResolvedNestedPrefetches = true;
                                C8736p c8736p2 = C8736p.f16368a;
                            } finally {
                            }
                        }
                        NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                        if (nestedPrefetchController != null ? nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope) : false) {
                            return true;
                        }
                        updateElapsedAndAvailableTime();
                    }
                    if (!this.isMeasured && !Constraints.m26856isZeroimpl(this.constraints)) {
                        if (!shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getMeasureTimeNanos(contentType))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m21049performMeasureBRTryo0(this.constraints);
                            C8736p c8736p3 = C8736p.f16368a;
                            Trace.endSection();
                            updateElapsedAndAvailableTime();
                            this.prefetchMetrics.saveMeasureTime(contentType, this.elapsedTimeNanos);
                        } finally {
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void markAsUrgent() {
            this.isUrgent = true;
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) Constraints.m26857toStringimpl(this.constraints)) + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private HandleAndRequestImpl(int i10, long j10, PrefetchMetrics prefetchMetrics) {
            this.index = i10;
            this.constraints = j10;
            this.prefetchMetrics = prefetchMetrics;
            this.startTime = C8745h.f16378a.m14401a();
        }
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m21047createNestedPrefetchRequestVKLhPVY(int i10, long j10, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, i10, j10, prefetchMetrics, null);
    }

    /* renamed from: schedulePrefetch-VKLhPVY, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m21048schedulePrefetchVKLhPVY(int i10, long j10, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i10, j10, prefetchMetrics, null);
        this.executor.schedulePrefetch(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
