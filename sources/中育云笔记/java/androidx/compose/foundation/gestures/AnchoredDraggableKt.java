package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10978w;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.";
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";
    private static final InterfaceC9540l AlwaysDrag = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // p181hd.InterfaceC9540l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };
    private static final InterfaceC9540l GetOrNan = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        public final Float invoke(int i10) {
            return Float.valueOf(Float.NaN);
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = C3186Dp.m33501constructorimpl(125);
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f10, float f11) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f10, float f11) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long j10, float f10, float f11) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j10, float f10, float f11) {
            return 0.0f;
        }
    });

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", m26211f = "AnchoredDraggable.kt", m26212l = {1344}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4 */
    public static final class C12644 extends SuspendLambda implements InterfaceC9546r {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12644(AnchoredDraggableState<T> anchoredDraggableState, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C12644> interfaceC11588c) {
            super(4, interfaceC11588c);
            this.$this_animateTo = anchoredDraggableState;
            this.$animationSpec = animationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12644 c12644 = new C12644(this.$this_animateTo, this.$animationSpec, interfaceC11588c);
            c12644.L$0 = anchoredDragScope;
            c12644.L$1 = draggableAnchors;
            c12644.L$2 = t10;
            return c12644.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
                float lastVelocity = anchoredDraggableState.getLastVelocity();
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m26211f = "AnchoredDraggable.kt", m26212l = {1380}, m26213m = "animateToWithDecay")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 */
    public static final class C12651<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12651(InterfaceC11588c<? super C12651> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m26211f = "AnchoredDraggable.kt", m26212l = {1391, 1409, 1433}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 */
    public static final class C12662 extends SuspendLambda implements InterfaceC9546r {
        final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
        final /* synthetic */ Ref$FloatRef $remainingVelocity;
        final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12662(AnchoredDraggableState<T> anchoredDraggableState, float f10, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC11588c<? super C12662> interfaceC11588c) {
            super(4, interfaceC11588c);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f10;
            this.$snapAnimationSpec = animationSpec;
            this.$remainingVelocity = ref$FloatRef;
            this.$decayAnimationSpec = decayAnimationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12662 c12662 = new C12662(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, interfaceC11588c);
            c12662.L$0 = anchoredDragScope;
            c12662.L$1 = draggableAnchors;
            c12662.L$2 = t10;
            return c12662.invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r16, r2, r4, r5, r5, r24) != r7) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C12662.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m26211f = "AnchoredDraggable.kt", m26212l = {1543}, m26213m = "restartable")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 */
    public static final class C12671<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12671(InterfaceC11588c<? super C12671> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", m26211f = "AnchoredDraggable.kt", m26212l = {1545}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 */
    public static final class C12682 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC9529a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC9544p $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC10045g> $previousDrag;

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", m26211f = "AnchoredDraggable.kt", m26212l = {1552}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
                final /* synthetic */ InterfaceC9544p $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC9544p interfaceC9544p, I i10, InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super AnonymousClass2> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$block = interfaceC9544p;
                    this.$latestInputs = i10;
                    this.$$this$coroutineScope = interfaceC11122i0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC9544p interfaceC9544p = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC9544p.invoke(obj2, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    AbstractC10006d.m20746c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC10045g> ref$ObjectRef, InterfaceC11122i0 interfaceC11122i0, InterfaceC9544p interfaceC9544p) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC11122i0;
                this.$block = interfaceC9544p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.g r8 = (kotlinx.coroutines.InterfaceC10045g) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12682.AnonymousClass1) r0
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.AbstractC9924b.m20071b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g> r9 = r7.$previousDrag
                    java.lang.Object r9 = r9.f23402c
                    kotlinx.coroutines.g r9 = (kotlinx.coroutines.InterfaceC10045g) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.mo20458v(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.g> r9 = r0.$previousDrag
                    sd.i0 r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f23479f
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                    hd.p r0 = r0.$block
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.g r8 = sd.AbstractC11109f.m24706d(r1, r2, r3, r4, r5, r6)
                    r9.f23402c = r8
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C12682.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12682(InterfaceC9529a interfaceC9529a, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C12682> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$inputs = interfaceC9529a;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12682 c12682 = new C12682(this.$inputs, this.$block, interfaceC11588c);
            c12682.L$0 = obj;
            return c12682;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC11594c interfaceC11594cSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC11122i0, this.$block);
                this.label = 1;
                if (interfaceC11594cSnapshotFlow.collect(anonymousClass1, this) == objM25952f) {
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
            return ((C12682) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", m26211f = "AnchoredDraggable.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2 */
    public static final class C12692 extends SuspendLambda implements InterfaceC9546r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C12692(InterfaceC11588c<? super C12692> interfaceC11588c) {
            super(4, interfaceC11588c);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C12692 c12692 = new C12692(interfaceC11588c);
            c12692.L$0 = anchoredDragScope;
            c12692.L$1 = draggableAnchors;
            c12692.L$2 = t10;
            return c12692.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final InterfaceC9540l interfaceC9540l, final InterfaceC9529a interfaceC9529a) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f10, float f11) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f10) {
                float fRequireOffset = anchoredDraggableState.requireOffset();
                return anchoredDraggableState.getAnchors().positionOf(AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), fRequireOffset, f10, interfaceC9540l, interfaceC9529a)) - fRequireOffset;
            }
        };
    }

    @InterfaceC10770a
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t10, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC9540l interfaceC9540l2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t10, interfaceC9540l2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC9540l);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC9529a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC9540l interfaceC9540l2, int i10, Object obj2) {
        if ((i10 & 32) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, interfaceC9540l, interfaceC9529a, animationSpec, decayAnimationSpec, interfaceC9540l2);
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(InterfaceC9540l interfaceC9540l) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC9540l.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation_release(), draggableAnchorsConfig.buildPositions$foundation_release());
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z10, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z11, Boolean.valueOf(z10), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z10, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i10, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z12;
        Orientation orientation2;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        MutableInteractionSource mutableInteractionSource2 = (i10 & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i10 & 32) != 0 ? null : overscrollEffect;
        if ((i10 & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            z12 = z10;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z12 = z10;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z12, orientation2, z13, mutableInteractionSource2, overscrollEffect2, flingBehavior2);
    }

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> anchoredDraggableState, final Density density, InterfaceC9540l interfaceC9540l, AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, interfaceC9540l, new InterfaceC9529a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(density.mo27099toPx0680j_4(C3186Dp.m33501constructorimpl(125)));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f10, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t10);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f23399c = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f11 = ref$FloatRef.f23399c;
            if (f11 != fPositionOf && (objAnimate = SuspendAnimationKt.animate(f11, fPositionOf, f10, animationSpec, new InterfaceC9544p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C10786q.f26013a;
                }

                public final void invoke(float f12, float f13) {
                    anchoredDragScope.dragTo(f12, f13);
                    ref$FloatRef.f23399c = f12;
                }
            }, interfaceC11588c)) == AbstractC11725a.m25952f()) {
                return objAnimate;
            }
        }
        return C10786q.f26013a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> r10, T r11, float r12, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r14, vc.InterfaceC11588c<? super java.lang.Float> r15) throws java.lang.Throwable {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C12651
            if (r1 == 0) goto L14
            r1 = r15
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12651) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.label = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r1.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.result
            java.lang.Object r9 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L39
            if (r1 != r8) goto L31
            float r1 = r7.F$0
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref$FloatRef) r2
            kotlin.AbstractC9924b.m20071b(r0)
            goto L64
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.AbstractC9924b.m20071b(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.f23399c = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r0
            r0 = r4
            r7.L$0 = r0
            r7.F$0 = r12
            r7.label = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r2, r3, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L62
            return r9
        L62:
            r1 = r12
            r2 = r0
        L64:
            float r0 = r2.f23399c
            float r1 = r1 - r0
            java.lang.Float r0 = p409xc.AbstractC11826a.m26207b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f10, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC11588c interfaceC11588c, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f10, animationSpec2, decayAnimationSpec, interfaceC11588c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC10410o.m21755h(f10, f11) : AbstractC10410o.m21751d(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T computeTarget(androidx.compose.foundation.gestures.DraggableAnchors<T> r5, float r6, float r7, p181hd.InterfaceC9540l r8, p181hd.InterfaceC9529a r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L92
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L27
            java.lang.Object r5 = r5.closestAnchor(r6)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r5)
            return r5
        L27:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L45
            java.lang.Object r5 = r5.closestAnchor(r6, r1)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r5)
            return r5
        L45:
            java.lang.Object r7 = r5.closestAnchor(r6, r2)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r7)
            float r9 = r5.positionOf(r7)
            java.lang.Object r0 = r5.closestAnchor(r6, r3)
            kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
            float r5 = r5.positionOf(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L76
            goto L77
        L76:
            r9 = r5
        L77:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L81
            r2 = r3
        L81:
            if (r2 != r3) goto L86
            if (r1 == 0) goto L8a
            goto L8b
        L86:
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L8b
        L8a:
            return r7
        L8b:
            return r0
        L8c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L92:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.computeTarget(androidx.compose.foundation.gestures.DraggableAnchors, float, float, hd.l, hd.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(AbstractC10978w.m24136n(), new float[0]);
    }

    public static final <T> void forEach(DraggableAnchors<T> draggableAnchors, InterfaceC9544p interfaceC9544p) {
        int size = draggableAnchors.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T tAnchorAt = draggableAnchors.anchorAt(i10);
            if (tAnchorAt == null) {
                throw new IllegalArgumentException(("There was no key at index " + i10 + ". Please report a bug.").toString());
            }
            interfaceC9544p.invoke(tAnchorAt, Float.valueOf(draggableAnchors.positionAt(i10)));
        }
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(p181hd.InterfaceC9529a r4, p181hd.InterfaceC9544p r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C12671
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.AbstractC10006d.m20748e(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            qc.q r4 = p309qc.C10786q.f26013a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(hd.a, hd.p, vc.c):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C12692(null), interfaceC11588c, 2, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z10, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z12, FlingBehavior flingBehavior, int i10, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z13;
        Orientation orientation2;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        MutableInteractionSource mutableInteractionSource2 = (i10 & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i10 & 32) != 0 ? null : overscrollEffect;
        boolean zIsAnimationRunning = (i10 & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z12;
        if ((i10 & 128) != 0) {
            flingBehavior2 = null;
            modifier2 = modifier;
            z13 = z10;
            orientation2 = orientation;
            anchoredDraggableState2 = anchoredDraggableState;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z13 = z10;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z13, orientation2, z14, mutableInteractionSource2, overscrollEffect2, zIsAnimationRunning, flingBehavior2);
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC9540l interfaceC9540l2, int i10, Object obj2) {
        if ((i10 & 64) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.3
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, interfaceC9540l, interfaceC9529a, animationSpec, decayAnimationSpec, interfaceC9540l2);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z10, (i10 & 8) != 0 ? null : mutableInteractionSource, (i10 & 16) != 0 ? null : overscrollEffect, (i10 & 32) != 0 ? null : flingBehavior);
    }

    @InterfaceC10770a
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z10, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z12, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z11, Boolean.valueOf(z10), mutableInteractionSource, Boolean.valueOf(z12), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z11, FlingBehavior flingBehavior, int i10, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        Orientation orientation2;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        MutableInteractionSource mutableInteractionSource2 = (i10 & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i10 & 16) != 0 ? null : overscrollEffect;
        if ((i10 & 32) != 0) {
            z11 = anchoredDraggableState.isAnimationRunning();
        }
        boolean z13 = z11;
        if ((i10 & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, orientation2, z12, mutableInteractionSource2, overscrollEffect2, z13, flingBehavior2);
    }

    @InterfaceC10770a
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC9540l interfaceC9540l2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t10, draggableAnchors, interfaceC9540l2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC9540l);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC9529a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C12644(anchoredDraggableState, animationSpec, null), interfaceC11588c, 2, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z10, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @InterfaceC10770a
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z11, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z10, null, mutableInteractionSource, Boolean.valueOf(z11), overscrollEffect, flingBehavior));
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
