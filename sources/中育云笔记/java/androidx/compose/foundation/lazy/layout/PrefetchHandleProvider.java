package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.p014ui.layout.SubcomposeLayoutState;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p326rd.C10986a;
import p326rd.C10993h;

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
                        AbstractC9979u.m20291d(list);
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
                C10786q c10786q = C10786q.f26013a;
                Trace.endSection();
                return false;
            }
        }

        public /* synthetic */ HandleAndRequestImpl(PrefetchHandleProvider prefetchHandleProvider, int i10, long j10, PrefetchMetrics prefetchMetrics, AbstractC9972n abstractC9972n) {
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
        private final void m27651performMeasureBRTryo0(long j10) {
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
                precomposedSlotHandle.mo32255premeasure0kLqBqw(i10, j10);
            }
        }

        private final void resetAvailableTimeTo(long j10) {
            this.availableTimeNanos = j10;
            this.startTime = C10993h.f26500a.m24242a();
            this.elapsedTimeNanos = 0L;
        }

        private final NestedPrefetchController resolveNestedPrefetchStates() {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
            if (precomposedSlotHandle == null) {
                InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl$resolveNestedPrefetchStates$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                    AbstractC9979u.m20292e(traversableNode, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                    LazyLayoutPrefetchState prefetchState = ((TraversablePrefetchStateNode) traversableNode).getPrefetchState();
                    Ref$ObjectRef<List<LazyLayoutPrefetchState>> ref$ObjectRef2 = ref$ObjectRef;
                    List listM24141s = (List) ref$ObjectRef2.f23402c;
                    if (listM24141s != null) {
                        listM24141s.add(prefetchState);
                    } else {
                        listM24141s = AbstractC10978w.m24141s(prefetchState);
                    }
                    ref$ObjectRef2.f23402c = listM24141s;
                    return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                }
            });
            List list = (List) ref$ObjectRef.f23402c;
            if (list != null) {
                return new NestedPrefetchController(list);
            }
            return null;
        }

        private final boolean shouldExecute(long j10, long j11) {
            return (this.isUrgent && j10 > 0) || j11 < j10;
        }

        private final void updateElapsedAndAvailableTime() {
            long jM24242a = C10993h.f26500a.m24242a();
            long jM24193q = C10986a.m24193q(C10993h.a.m24244b(jM24242a, this.startTime));
            this.elapsedTimeNanos = jM24193q;
            this.availableTimeNanos -= jM24193q;
            this.startTime = jM24242a;
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
                            C10786q c10786q = C10786q.f26013a;
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
                                C10786q c10786q2 = C10786q.f26013a;
                            } finally {
                            }
                        }
                        NestedPrefetchController nestedPrefetchController = this.nestedPrefetchController;
                        if (nestedPrefetchController != null ? nestedPrefetchController.executeNestedPrefetches(prefetchRequestScope) : false) {
                            return true;
                        }
                        updateElapsedAndAvailableTime();
                    }
                    if (!this.isMeasured && !Constraints.m33458isZeroimpl(this.constraints)) {
                        if (!shouldExecute(this.availableTimeNanos, this.prefetchMetrics.getMeasureTimeNanos(contentType))) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m27651performMeasureBRTryo0(this.constraints);
                            C10786q c10786q3 = C10786q.f26013a;
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
            return "HandleAndRequestImpl { index = " + this.index + ", constraints = " + ((Object) Constraints.m33459toStringimpl(this.constraints)) + ", isComposed = " + isComposed() + ", isMeasured = " + this.isMeasured + ", isCanceled = " + this.isCanceled + " }";
        }

        private HandleAndRequestImpl(int i10, long j10, PrefetchMetrics prefetchMetrics) {
            this.index = i10;
            this.constraints = j10;
            this.prefetchMetrics = prefetchMetrics;
            this.startTime = C10993h.f26500a.m24242a();
        }
    }

    public PrefetchHandleProvider(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, PrefetchScheduler prefetchScheduler) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.executor = prefetchScheduler;
    }

    /* renamed from: createNestedPrefetchRequest-VKLhPVY, reason: not valid java name */
    public final PrefetchRequest m27649createNestedPrefetchRequestVKLhPVY(int i10, long j10, PrefetchMetrics prefetchMetrics) {
        return new HandleAndRequestImpl(this, i10, j10, prefetchMetrics, null);
    }

    /* renamed from: schedulePrefetch-VKLhPVY, reason: not valid java name */
    public final LazyLayoutPrefetchState.PrefetchHandle m27650schedulePrefetchVKLhPVY(int i10, long j10, PrefetchMetrics prefetchMetrics) {
        HandleAndRequestImpl handleAndRequestImpl = new HandleAndRequestImpl(this, i10, j10, prefetchMetrics, null);
        this.executor.schedulePrefetch(handleAndRequestImpl);
        return handleAndRequestImpl;
    }
}
