package androidx.compose.foundation.gestures;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
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
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@Stable
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;
    private final MutableState anchors$delegate;
    private InterfaceC10570l confirmValueChange;
    private final MutableState currentValue$delegate;
    public DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    public InterfaceC10570l positionalThreshold;
    private final State progress$delegate;
    private final MutableState settledValue$delegate;
    public AnimationSpec<Float> snapAnimationSpec;
    private final State targetValue$delegate;
    public InterfaceC10559a velocityThreshold;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(T t10) {
                        return Boolean.TRUE;
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$3) obj2);
                    }
                };
            }
            return companion.Saver(interfaceC10570l);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p300x7.InterfaceC10574p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2) obj);
                }

                @Override // p300x7.InterfaceC10570l
                public final AnchoredDraggableState<T> invoke(T t10) {
                    return new AnchoredDraggableState<>(t10);
                }
            });
        }

        private Companion() {
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$6
                    @Override // p300x7.InterfaceC10570l
                    public final Boolean invoke(T t10) {
                        return Boolean.TRUE;
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$6) obj2);
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, interfaceC10570l, interfaceC10559a, interfaceC10570l2);
        }

        @InterfaceC8721a
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final InterfaceC10570l interfaceC10570l) {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$4
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p300x7.InterfaceC10574p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$5
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$5) obj);
                }

                @Override // p300x7.InterfaceC10570l
                public final AnchoredDraggableState<T> invoke(T t10) {
                    return new AnchoredDraggableState<>(t10, interfaceC10570l);
                }
            });
        }

        @InterfaceC8721a
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final DecayAnimationSpec<Float> decayAnimationSpec, final InterfaceC10570l interfaceC10570l, final InterfaceC10559a interfaceC10559a, final InterfaceC10570l interfaceC10570l2) {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$7
                /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
                @Override // p300x7.InterfaceC10574p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$8) obj);
                }

                @Override // p300x7.InterfaceC10570l
                public final AnchoredDraggableState<T> invoke(T t10) {
                    return AnchoredDraggableKt.AnchoredDraggableState(t10, interfaceC10570l, interfaceC10559a, animationSpec, decayAnimationSpec, interfaceC10570l2);
                }
            });
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", m17801f = "AnchoredDraggable.kt", m17802l = {1125}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2 */
    public static final class C12452 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10575q $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", m17801f = "AnchoredDraggable.kt", m17802l = {1126}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
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
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC10575q.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == objM17291f) {
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
        public C12452(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C12452> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC10575q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C12452(this.this$0, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.2.1
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
            T tClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset());
            if (tClosestAnchor != null) {
                if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(tClosestAnchor)) < 0.5f && ((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(tClosestAnchor)).booleanValue()) {
                    this.this$0.setSettledValue(tClosestAnchor);
                    this.this$0.setCurrentValue(tClosestAnchor);
                }
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12452) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableState", m17801f = "AnchoredDraggable.kt", m17802l = {1170}, m17803m = "anchoredDrag")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 */
    public static final class C12463 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12463(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC9324c<? super C12463> interfaceC9324c) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", m17801f = "AnchoredDraggable.kt", m17802l = {1172}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 */
    public static final class C12474 extends SuspendLambda implements InterfaceC10570l {
        final /* synthetic */ InterfaceC10576r $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", m17801f = "AnchoredDraggable.kt", m17802l = {1174}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
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
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (interfaceC10576r.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, objM15904b, this) == objM17291f) {
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
        public C12474(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super C12474> interfaceC9324c) {
            super(1, interfaceC9324c);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t10;
            this.$block = interfaceC10576r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
            return new C12474(this.this$0, this.$targetValue, this.$block, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                this.this$0.setDragTarget(this.$targetValue);
                final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.4.1
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
            if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(this.$targetValue)).booleanValue()) {
                ((AnchoredDraggableState) this.this$0).anchoredDragScope.dragTo(this.this$0.getAnchors().positionOf(this.$targetValue), this.this$0.getLastVelocity());
                this.this$0.setSettledValue(this.$targetValue);
                this.this$0.setCurrentValue(this.$targetValue);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10570l
        public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12474) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    public AnchoredDraggableState(T t10) {
        this.confirmValueChange = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(T t11) {
                return Boolean.TRUE;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AnchoredDraggableState$confirmValueChange$1) obj);
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC10559a(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
            @Override // p300x7.InterfaceC10559a
            public final T invoke() {
                ?? dragTarget = this.this$0.getDragTarget();
                if (dragTarget != 0) {
                    return dragTarget;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                if (Float.isNaN(anchoredDraggableState.getOffset())) {
                    return anchoredDraggableState.getCurrentValue();
                }
                ?? ClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                return ClosestAnchor == 0 ? anchoredDraggableState.getCurrentValue() : ClosestAnchor;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new InterfaceC10559a(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.progress.2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getSettledValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getTargetValue()) - fPositionOf;
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
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC10575q interfaceC10575q, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC10575q, interfaceC9324c);
    }

    @InterfaceC8721a
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    @InterfaceC8721a
    public static /* synthetic */ void getProgress$annotations() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation_release$annotations() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t10) {
        this.settledValue$delegate.setValue(t10);
    }

    private final boolean trySnapTo(T t10) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zTryLock = mutatorMutex.tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float fPositionOf = getAnchors().positionOf(t10);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, fPositionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(t10);
            setSettledValue(t10);
            mutatorMutex.unlock();
            return zTryLock;
        } catch (Throwable th) {
            mutatorMutex.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objMutate = this.dragMutex.mutate(mutatePriority, new C12452(this, interfaceC10575q, null), interfaceC9324c);
        return objMutate == AbstractC9434a.m17291f() ? objMutate : C8736p.f16368a;
    }

    public final float dispatchRawDelta(float f10) {
        float fNewOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(f10);
        float fRequireOffset = fNewOffsetForDelta$foundation_release - requireOffset();
        AnchoredDragScope.dragTo$default(this.anchoredDragScope, fNewOffsetForDelta$foundation_release, 0.0f, 2, null);
        return fRequireOffset;
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    public final InterfaceC10570l getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        AbstractC9133u.m16151y("decayAnimationSpec");
        return null;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final InterfaceC10570l getPositionalThreshold$foundation_release() {
        InterfaceC10570l interfaceC10570l = this.positionalThreshold;
        if (interfaceC10570l != null) {
            return interfaceC10570l;
        }
        AbstractC9133u.m16151y("positionalThreshold");
        return null;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.settledValue$delegate.getValue();
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        AbstractC9133u.m16151y("snapAnimationSpec");
        return null;
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation_release() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final InterfaceC10559a getVelocityThreshold$foundation_release() {
        InterfaceC10559a interfaceC10559a = this.velocityThreshold;
        if (interfaceC10559a != null) {
            return interfaceC10559a;
        }
        AbstractC9133u.m16151y("velocityThreshold");
        return null;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation_release(float f10) {
        return AbstractC8323h.m13517l((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f10, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN)
    public final float progress(T t10, T t11) {
        float fPositionOf = getAnchors().positionOf(t10);
        float fPositionOf2 = getAnchors().positionOf(t11);
        float fM13517l = (AbstractC8323h.m13517l(getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fM13517l)) {
            return 1.0f;
        }
        if (fM13517l < 1.0E-6f) {
            return 0.0f;
        }
        if (fM13517l > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fM13517l);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final void setConfirmValueChange$foundation_release(InterfaceC10570l interfaceC10570l) {
        this.confirmValueChange = interfaceC10570l;
    }

    public final void setDecayAnimationSpec$foundation_release(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void setPositionalThreshold$foundation_release(InterfaceC10570l interfaceC10570l) {
        this.positionalThreshold = interfaceC10570l;
    }

    public final void setSnapAnimationSpec$foundation_release(AnimationSpec<Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final void setVelocityThreshold$foundation_release(InterfaceC10559a interfaceC10559a) {
        this.velocityThreshold = interfaceC10559a;
    }

    public final Object settle(AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        T currentValue = getCurrentValue();
        T tClosestAnchor = getAnchors().closestAnchor(requireOffset());
        if (tClosestAnchor == null || !((Boolean) this.confirmValueChange.invoke(tClosestAnchor)).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, interfaceC9324c);
            return objAnimateTo == AbstractC9434a.m17291f() ? objAnimateTo : C8736p.f16368a;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, tClosestAnchor, animationSpec, interfaceC9324c);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r6, androidx.compose.foundation.MutatePriority r7, p300x7.InterfaceC10576r r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState.C12463
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState.C12463) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r6
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r7 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.AbstractC9079b.m15926b(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.getAnchors()
            boolean r9 = r9.hasPositionFor(r6)
            if (r9 == 0) goto L62
            androidx.compose.foundation.MutatorMutex r9 = r5.dragMutex     // Catch: java.lang.Throwable -> L5c
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5c
            r0.label = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            r6.setDragTarget(r4)
            goto L76
        L5c:
            r7 = move-exception
            r6 = r5
        L5e:
            r6.setDragTarget(r4)
            throw r7
        L62:
            x7.l r7 = r5.confirmValueChange
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            r5.setSettledValue(r6)
            r5.setCurrentValue(r6)
        L76:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, x7.r, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC10576r interfaceC10576r, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC10576r, interfaceC9324c);
    }

    @InterfaceC8721a
    public final Object settle(float f10, InterfaceC9324c<? super Float> interfaceC9324c) {
        if (!getUsePreModifierChangeBehavior$foundation_release()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        Object objComputeTarget = AnchoredDraggableKt.computeTarget(getAnchors(), requireOffset(), f10, getPositionalThreshold$foundation_release(), getVelocityThreshold$foundation_release());
        if (((Boolean) this.confirmValueChange.invoke(objComputeTarget)).booleanValue()) {
            return AnchoredDraggableKt.animateToWithDecay$default(this, objComputeTarget, f10, null, null, interfaceC9324c, 12, null);
        }
        return AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f10, null, null, interfaceC9324c, 12, null);
    }

    public AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors) {
        this(t10);
        setAnchors(draggableAnchors);
        trySnapTo(t10);
    }

    @InterfaceC8721a
    public AnchoredDraggableState(T t10, InterfaceC10570l interfaceC10570l) {
        this(t10);
        this.confirmValueChange = interfaceC10570l;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this(obj, draggableAnchors, (i10 & 4) != 0 ? new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(T t10) {
                return Boolean.TRUE;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((C12441) obj2);
            }
        } : interfaceC10570l);
    }

    @InterfaceC8721a
    public AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors, InterfaceC10570l interfaceC10570l) {
        this(t10, interfaceC10570l);
        setAnchors(draggableAnchors);
        trySnapTo(t10);
    }
}
