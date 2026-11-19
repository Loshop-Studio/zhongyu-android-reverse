package androidx.compose.material3.internal;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.google.android.material.color.utilities.Contrast;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes2.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final InterfaceC9540l confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final InterfaceC9540l positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final InterfaceC9529a velocityThreshold;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, final InterfaceC9529a interfaceC9529a) {
            return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$1
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p181hd.InterfaceC9544p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
                }

                @Override // p181hd.InterfaceC9540l
                public final AnchoredDraggableState<T> invoke(T t10) {
                    return new AnchoredDraggableState<>(t10, interfaceC9540l2, interfaceC9529a, animationSpec, interfaceC9540l);
                }
            });
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState", m26211f = "AnchoredDraggable.kt", m26212l = {520}, m26213m = "anchoredDrag")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 */
    public static final class C24651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24651(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC11588c<? super C24651> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", m26211f = "AnchoredDraggable.kt", m26212l = {521}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 */
    public static final class C24662 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9545q $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", m26211f = "AnchoredDraggable.kt", m26212l = {522}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9545q $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC9545q interfaceC9545q, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$block = interfaceC9545q;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC11588c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(DraggableAnchors<T> draggableAnchors, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(draggableAnchors, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$0;
                    InterfaceC9545q interfaceC9545q = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC9545q.invoke(anchoredDragScope, draggableAnchors, this) == objM25952f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24662(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C24662> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC9545q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C24662(this.this$0, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC9529a, anonymousClass2, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24662) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState", m26211f = "AnchoredDraggable.kt", m26212l = {567}, m26213m = "anchoredDrag")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 */
    public static final class C24673 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24673(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC11588c<? super C24673> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", m26211f = "AnchoredDraggable.kt", m26212l = {569}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 */
    public static final class C24684 extends SuspendLambda implements InterfaceC9540l {
        final /* synthetic */ InterfaceC9546r $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC11829d(m26210c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", m26211f = "AnchoredDraggable.kt", m26212l = {571}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9546r $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC9546r interfaceC9546r, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$block = interfaceC9546r;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC11588c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Pair pair = (Pair) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) pair.m20048a();
                    Object objM20049c = pair.m20049c();
                    InterfaceC9546r interfaceC9546r = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC9546r.invoke(anchoredDragScope, draggableAnchors, objM20049c, this) == objM25952f) {
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
            public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass2) create(pair, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24684(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super C24684> interfaceC11588c) {
            super(1, interfaceC11588c);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t10;
            this.$block = interfaceC9546r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
            return new C24684(this.this$0, this.$targetValue, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Pair<DraggableAnchors<T>, T> invoke() {
                        return AbstractC10776g.m22975a(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC9529a, anonymousClass2, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C24684) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public AnchoredDraggableState(T t10, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec<Float> animationSpec, InterfaceC9540l interfaceC9540l2) {
        this.positionalThreshold = interfaceC9540l;
        this.velocityThreshold = interfaceC9529a;
        this.animationSpec = animationSpec;
        this.confirmValueChange = interfaceC9540l2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p181hd.InterfaceC9529a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                return !Float.isNaN(offset) ? anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
            }
        });
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$closestValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p181hd.InterfaceC9529a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                return !Float.isNaN(offset) ? anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC9529a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material3_release()) - fPositionOf;
                float fAbs = Math.abs(fPositionOf2);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                    if (fRequireOffset < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fRequireOffset <= 0.999999f) {
                        f10 = fRequireOffset;
                    }
                }
                return Float.valueOf(f10);
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public void dragTo(float f10, float f11) {
                this.this$0.setOffset(f10);
                this.this$0.setLastVelocity(f11);
            }
        };
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC9545q interfaceC9545q, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC9545q, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float f10, T t10, float f11) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t10);
        float fFloatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (fPositionOf != f10 && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < f10) {
                if (f11 >= fFloatValue) {
                    T tClosestAnchor = anchors.closestAnchor(f10, true);
                    AbstractC9979u.m20291d(tClosestAnchor);
                    return tClosestAnchor;
                }
                T tClosestAnchor2 = anchors.closestAnchor(f10, true);
                AbstractC9979u.m20291d(tClosestAnchor2);
                if (f10 >= Math.abs(fPositionOf + Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor2) - fPositionOf)))).floatValue()))) {
                    return tClosestAnchor2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(f10, false);
                    AbstractC9979u.m20291d(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                T tClosestAnchor4 = anchors.closestAnchor(f10, false);
                AbstractC9979u.m20291d(tClosestAnchor4);
                float fAbs = Math.abs(fPositionOf - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor4))))).floatValue()));
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return tClosestAnchor4;
                }
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float f10, T t10) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t10);
        if (fPositionOf != f10 && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < f10) {
                T tClosestAnchor = anchors.closestAnchor(f10, true);
                if (tClosestAnchor != null) {
                    return tClosestAnchor;
                }
            } else {
                T tClosestAnchor2 = anchors.closestAnchor(f10, false);
                if (tClosestAnchor2 != null) {
                    return tClosestAnchor2;
                }
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t10) {
        this.currentValue$delegate.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t10) {
        this.dragTarget$delegate.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f10) {
        this.lastVelocity$delegate.setFloatValue(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f10) {
        this.offset$delegate.setFloatValue(f10);
    }

    private final boolean trySnapTo(final T t10) {
        return this.dragMutex.tryMutate(new InterfaceC9529a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState.trySnapTo.1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m29505invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m29505invoke() {
                AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t11 = t10;
                float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t11);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t11);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority r7, p181hd.InterfaceC9545q r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C24651
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C24651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC9924b.m20071b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.AbstractC9924b.m20071b(r9)
            androidx.compose.material3.internal.InternalMutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L87
            r0.label = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto L84
            float r9 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            hd.l r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.setCurrentValue(r8)
        L84:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.getAnchors()
            float r0 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r1 = r7.getAnchors()
            float r1 = r1.positionOf(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            hd.l r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.setCurrentValue(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, hd.q, vc.c):java.lang.Object");
    }

    public final float dispatchRawDelta(float f10) {
        float fNewOffsetForDelta$material3_release = newOffsetForDelta$material3_release(f10);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material3_release);
        return fNewOffsetForDelta$material3_release - offset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    public final InterfaceC9540l getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final InterfaceC9540l getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final InterfaceC9529a getVelocityThreshold$material3_release() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material3_release(float f10) {
        return AbstractC10410o.m21760m((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f10, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final Object settle(float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f10);
        if (((Boolean) this.confirmValueChange.invoke(tComputeTarget)).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f10, interfaceC11588c);
            return objAnimateTo == AbstractC11725a.m25952f() ? objAnimateTo : C10786q.f26013a;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f10, interfaceC11588c);
        return objAnimateTo2 == AbstractC11725a.m25952f() ? objAnimateTo2 : C10786q.f26013a;
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t10) {
        if (AbstractC9979u.m20289b(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t10)) {
            return;
        }
        setDragTarget(t10);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC9546r interfaceC9546r, InterfaceC11588c interfaceC11588c, int i10, Object obj2) throws Throwable {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC9546r, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r7, androidx.compose.foundation.MutatePriority r8, p181hd.InterfaceC9546r r9, vc.InterfaceC11588c<? super p309qc.C10786q> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C24673
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C24673) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.AbstractC9924b.m20071b(r10)
            androidx.compose.material3.internal.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lcc
            androidx.compose.material3.internal.InternalMutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L92
            r0.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.setDragTarget(r5)
            androidx.compose.material3.internal.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r10 = r7.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            hd.l r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.setCurrentValue(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.setDragTarget(r5)
            androidx.compose.material3.internal.DraggableAnchors r9 = r7.getAnchors()
            float r10 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            hd.l r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.setCurrentValue(r9)
        Lcb:
            throw r8
        Lcc:
            r6.setCurrentValue(r7)
        Lcf:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, hd.r, vc.c):java.lang.Object");
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec animationSpec, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this(obj, interfaceC9540l, interfaceC9529a, animationSpec, (i10 & 16) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C24631) obj2);
            }
        } : interfaceC9540l2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec animationSpec, InterfaceC9540l interfaceC9540l2, int i10, AbstractC9972n abstractC9972n) {
        this(obj, draggableAnchors, interfaceC9540l, interfaceC9529a, animationSpec, (i10 & 32) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.2
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C24642) obj2);
            }
        } : interfaceC9540l2);
    }

    public AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec<Float> animationSpec, InterfaceC9540l interfaceC9540l2) {
        this(t10, interfaceC9540l, interfaceC9529a, animationSpec, interfaceC9540l2);
        setAnchors(draggableAnchors);
        trySnapTo(t10);
    }
}
