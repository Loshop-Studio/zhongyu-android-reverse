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
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@Stable
/* loaded from: classes2.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final InterfaceC10570l confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final InterfaceC10570l positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final InterfaceC10559a velocityThreshold;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2, final InterfaceC10559a interfaceC10559a) {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$1
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p300x7.InterfaceC10574p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
                }

                @Override // p300x7.InterfaceC10570l
                public final AnchoredDraggableState<T> invoke(T t10) {
                    return new AnchoredDraggableState<>(t10, interfaceC10570l2, interfaceC10559a, animationSpec, interfaceC10570l);
                }
            });
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState", m17801f = "AnchoredDraggable.kt", m17802l = {520}, m17803m = "anchoredDrag")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 */
    public static final class C24351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24351(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super C24351> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", m17801f = "AnchoredDraggable.kt", m17802l = {521}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 */
    public static final class C24362 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10575q $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", m17801f = "AnchoredDraggable.kt", m17802l = {522}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC10575q $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC10575q interfaceC10575q, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$block = interfaceC10575q;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC9324c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(DraggableAnchors<T> draggableAnchors, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(draggableAnchors, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$0;
                    InterfaceC10575q interfaceC10575q = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC10575q.invoke(anchoredDragScope, draggableAnchors, this) == objM17291f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24362(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C24362> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC10575q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C24362(this.this$0, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC10559a, anonymousClass2, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C24362) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState", m17801f = "AnchoredDraggable.kt", m17802l = {567}, m17803m = "anchoredDrag")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 */
    public static final class C24373 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24373(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super C24373> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", m17801f = "AnchoredDraggable.kt", m17802l = {569}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 */
    public static final class C24384 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10576r $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", m17801f = "AnchoredDraggable.kt", m17802l = {571}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC10576r $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC10576r interfaceC10576r, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$block = interfaceC10576r;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, interfaceC9324c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    Pair pair = (Pair) this.L$0;
                    DraggableAnchors draggableAnchors = (DraggableAnchors) pair.m15903a();
                    Object objM15904b = pair.m15904b();
                    InterfaceC10576r interfaceC10576r = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC10576r.invoke(anchoredDragScope, draggableAnchors, objM15904b, this) == objM17291f) {
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

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass2) create(pair, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24384(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super C24384> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t10;
            this.$block = interfaceC10576r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C24384(this.this$0, this.$targetValue, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.4.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final Pair<DraggableAnchors<T>, T> invoke() {
                        return AbstractC8726f.m14230a(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(interfaceC10559a, anonymousClass2, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C24384) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public AnchoredDraggableState(T t10, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec<Float> animationSpec, InterfaceC10570l interfaceC10570l2) {
        this.positionalThreshold = interfaceC10570l;
        this.velocityThreshold = interfaceC10559a;
        this.animationSpec = animationSpec;
        this.confirmValueChange = interfaceC10570l2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC10559a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p300x7.InterfaceC10559a
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
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC10559a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$closestValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            @Override // p300x7.InterfaceC10559a
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
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC10559a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
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

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC10575q interfaceC10575q, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC10575q, interfaceC9324c);
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
                    AbstractC9133u.m16130d(tClosestAnchor);
                    return tClosestAnchor;
                }
                T tClosestAnchor2 = anchors.closestAnchor(f10, true);
                AbstractC9133u.m16130d(tClosestAnchor2);
                if (f10 >= Math.abs(fPositionOf + Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor2) - fPositionOf)))).floatValue()))) {
                    return tClosestAnchor2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(f10, false);
                    AbstractC9133u.m16130d(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                T tClosestAnchor4 = anchors.closestAnchor(f10, false);
                AbstractC9133u.m16130d(tClosestAnchor4);
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
        return this.dragMutex.tryMutate(new InterfaceC10559a(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState.trySnapTo.1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22903invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22903invoke() {
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
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority r7, p300x7.InterfaceC10575q r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C24351
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C24351) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Throwable -> L2f
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
            kotlin.AbstractC9079b.m15926b(r9)
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
            x7.l r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.setCurrentValue(r8)
        L84:
            h7.p r7 = p123h7.C8736p.f16368a
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
            x7.l r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.setCurrentValue(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, x7.q, m7.c):java.lang.Object");
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

    public final InterfaceC10570l getConfirmValueChange$material3_release() {
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

    public final InterfaceC10570l getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final InterfaceC10559a getVelocityThreshold$material3_release() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material3_release(float f10) {
        return AbstractC8323h.m13517l((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f10, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final Object settle(float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f10);
        if (((Boolean) this.confirmValueChange.invoke(tComputeTarget)).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f10, interfaceC9324c);
            return objAnimateTo == AbstractC9434a.m17291f() ? objAnimateTo : C8736p.f16368a;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f10, interfaceC9324c);
        return objAnimateTo2 == AbstractC9434a.m17291f() ? objAnimateTo2 : C8736p.f16368a;
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t10) {
        if (AbstractC9133u.m16128b(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t10)) {
            return;
        }
        setDragTarget(t10);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC10576r interfaceC10576r, InterfaceC9324c interfaceC9324c, int i10, Object obj2) throws Throwable {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC10576r, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r7, androidx.compose.foundation.MutatePriority r8, p300x7.InterfaceC10576r r9, p179m7.InterfaceC9324c<? super p123h7.C8736p> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C24373
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material3.internal.AnchoredDraggableState.C24373) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r7 = (androidx.compose.material3.internal.AnchoredDraggableState) r7
            kotlin.AbstractC9079b.m15926b(r10)     // Catch: java.lang.Throwable -> L30
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
            kotlin.AbstractC9079b.m15926b(r10)
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
            x7.l r9 = r7.confirmValueChange
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
            x7.l r10 = r7.confirmValueChange
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
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, x7.r, m7.c):java.lang.Object");
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l2, int i10, AbstractC9126n abstractC9126n) {
        this(obj, interfaceC10570l, interfaceC10559a, animationSpec, (i10 & 16) != 0 ? new InterfaceC10570l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C24331) obj2);
            }
        } : interfaceC10570l2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l2, int i10, AbstractC9126n abstractC9126n) {
        this(obj, draggableAnchors, interfaceC10570l, interfaceC10559a, animationSpec, (i10 & 32) != 0 ? new InterfaceC10570l() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.2
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C24342) obj2);
            }
        } : interfaceC10570l2);
    }

    public AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec<Float> animationSpec, InterfaceC10570l interfaceC10570l2) {
        this(t10, interfaceC10570l, interfaceC10559a, animationSpec, interfaceC10570l2);
        setAnchors(draggableAnchors);
        trySnapTo(t10);
    }
}
