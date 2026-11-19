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
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.SnapshotStateKt;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.";
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";
    private static final InterfaceC10570l AlwaysDrag = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // p300x7.InterfaceC10570l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };
    private static final InterfaceC10570l GetOrNan = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        public final Float invoke(int i10) {
            return Float.valueOf(Float.NaN);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = C3156Dp.m26899constructorimpl(TbsListener.ErrorCode.DOWNLOAD_THROWABLE);
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", m17801f = "AnchoredDraggable.kt", m17802l = {1344}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4 */
    public static final class C12344 extends SuspendLambda implements InterfaceC10576r {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12344(AnchoredDraggableState<T> anchoredDraggableState, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C12344> interfaceC9324c) {
            super(4, interfaceC9324c);
            this.$this_animateTo = anchoredDraggableState;
            this.$animationSpec = animationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C12344 c12344 = new C12344(this.$this_animateTo, this.$animationSpec, interfaceC9324c);
            c12344.L$0 = anchoredDragScope;
            c12344.L$1 = draggableAnchors;
            c12344.L$2 = t10;
            return c12344.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) this.L$1;
                Object obj2 = this.L$2;
                AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
                float lastVelocity = anchoredDraggableState.getLastVelocity();
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnchoredDraggableKt.animateTo(anchoredDraggableState, lastVelocity, anchoredDragScope, draggableAnchors, obj2, animationSpec, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m17801f = "AnchoredDraggable.kt", m17802l = {1380}, m17803m = "animateToWithDecay")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 */
    public static final class C12351<T> extends ContinuationImpl {
        float F$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12351(InterfaceC9324c<? super C12351> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m17801f = "AnchoredDraggable.kt", m17802l = {1391, 1409, 1433}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 */
    public static final class C12362 extends SuspendLambda implements InterfaceC10576r {
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
        public C12362(AnchoredDraggableState<T> anchoredDraggableState, float f10, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC9324c<? super C12362> interfaceC9324c) {
            super(4, interfaceC9324c);
            this.$this_animateToWithDecay = anchoredDraggableState;
            this.$velocity = f10;
            this.$snapAnimationSpec = animationSpec;
            this.$remainingVelocity = ref$FloatRef;
            this.$decayAnimationSpec = decayAnimationSpec;
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C12362 c12362 = new C12362(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, interfaceC9324c);
            c12362.L$0 = anchoredDragScope;
            c12362.L$1 = draggableAnchors;
            c12362.L$2 = t10;
            return c12362.invokeSuspend(C8736p.f16368a);
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C12362.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m17801f = "AnchoredDraggable.kt", m17802l = {1543}, m17803m = "restartable")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 */
    public static final class C12371<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C12371(InterfaceC9324c<? super C12371> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", m17801f = "AnchoredDraggable.kt", m17802l = {1545}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 */
    public static final class C12382 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ InterfaceC10559a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC10574p $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC9212n> $previousDrag;

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", m17801f = "AnchoredDraggable.kt", m17802l = {1552}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
                final /* synthetic */ InterfaceC10574p $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC10574p interfaceC10574p, I i10, InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super AnonymousClass2> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$block = interfaceC10574p;
                    this.$latestInputs = i10;
                    this.$$this$coroutineScope = interfaceC8822b0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        InterfaceC10574p interfaceC10574p = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC10574p.invoke(obj2, this) == objM17291f) {
                            return objM17291f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9079b.m15926b(obj);
                    }
                    AbstractC9165e.m16554c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C8736p.f16368a;
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC9212n> ref$ObjectRef, InterfaceC8822b0 interfaceC8822b0, InterfaceC10574p interfaceC10574p) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC8822b0;
                this.$block = interfaceC10574p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p169l8.InterfaceC9267d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
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
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.n r8 = (kotlinx.coroutines.InterfaceC9212n) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12382.AnonymousClass1) r0
                    kotlin.AbstractC9079b.m15926b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.AbstractC9079b.m15926b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.n> r9 = r7.$previousDrag
                    java.lang.Object r9 = r9.f17473a
                    kotlinx.coroutines.n r9 = (kotlinx.coroutines.InterfaceC9212n) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.mo16291n(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.n> r9 = r0.$previousDrag
                    i8.b0 r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f17555d
                    androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                    x7.p r0 = r0.$block
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.n r8 = p135i8.AbstractC8833f.m14845d(r1, r2, r3, r4, r5, r6)
                    r9.f17473a = r8
                    h7.p r8 = p123h7.C8736p.f16368a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.C12382.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12382(InterfaceC10559a interfaceC10559a, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C12382> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$inputs = interfaceC10559a;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12382 c12382 = new C12382(this.$inputs, this.$block, interfaceC9324c);
            c12382.L$0 = obj;
            return c12382;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C12382) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC9266c interfaceC9266cSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC8822b0, this.$block);
                this.label = 1;
                if (interfaceC9266cSnapshotFlow.collect(anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", m17801f = "AnchoredDraggable.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2 */
    public static final class C12392 extends SuspendLambda implements InterfaceC10576r {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C12392(InterfaceC9324c<? super C12392> interfaceC9324c) {
            super(4, interfaceC9324c);
        }

        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C12392 c12392 = new C12392(interfaceC9324c);
            c12392.L$0 = anchoredDragScope;
            c12392.L$1 = draggableAnchors;
            c12392.L$2 = t10;
            return c12392.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final InterfaceC10570l interfaceC10570l, final InterfaceC10559a interfaceC10559a) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableLayoutInfoProvider.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f10, float f11) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f10) {
                float fRequireOffset = anchoredDraggableState.requireOffset();
                return anchoredDraggableState.getAnchors().positionOf(AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), fRequireOffset, f10, interfaceC10570l, interfaceC10559a)) - fRequireOffset;
            }
        };
    }

    @InterfaceC8721a
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t10, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC10570l interfaceC10570l2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t10, interfaceC10570l2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC10570l);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC10559a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC10570l interfaceC10570l2, int i10, Object obj2) {
        if ((i10 & 32) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.1
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, interfaceC10570l, interfaceC10559a, animationSpec, decayAnimationSpec, interfaceC10570l2);
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(InterfaceC10570l interfaceC10570l) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC10570l.invoke(draggableAnchorsConfig);
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

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> anchoredDraggableState, final Density density, InterfaceC10570l interfaceC10570l, AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, interfaceC10570l, new InterfaceC10559a() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggableFlingBehavior.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                return Float.valueOf(density.mo20497toPx0680j_4(C3156Dp.m26899constructorimpl(TbsListener.ErrorCode.DOWNLOAD_THROWABLE)));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f10, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimate;
        float fPositionOf = draggableAnchors.positionOf(t10);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.f17470a = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(fPositionOf)) {
            float f11 = ref$FloatRef.f17470a;
            if (f11 != fPositionOf && (objAnimate = SuspendAnimationKt.animate(f11, fPositionOf, f10, animationSpec, new InterfaceC10574p() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C8736p.f16368a;
                }

                public final void invoke(float f12, float f13) {
                    anchoredDragScope.dragTo(f12, f13);
                    ref$FloatRef.f17470a = f12;
                }
            }, interfaceC9324c)) == AbstractC9434a.m17291f()) {
                return objAnimate;
            }
        }
        return C8736p.f16368a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState<T> r10, T r11, float r12, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r14, p179m7.InterfaceC9324c<? super java.lang.Float> r15) throws java.lang.Throwable {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C12351
            if (r1 == 0) goto L14
            r1 = r15
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12351) r1
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
            java.lang.Object r9 = p190n7.AbstractC9434a.m17291f()
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L39
            if (r1 != r8) goto L31
            float r1 = r7.F$0
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref$FloatRef) r2
            kotlin.AbstractC9079b.m15926b(r0)
            goto L64
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.AbstractC9079b.m15926b(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.f17470a = r12
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
            float r0 = r2.f17470a
            float r1 = r1 - r0
            java.lang.Float r0 = p201o7.AbstractC9536a.m17797b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, m7.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f10, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC9324c interfaceC9324c, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f10, animationSpec2, decayAnimationSpec, interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC8323h.m13512g(f10, f11) : AbstractC8323h.m13509d(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T computeTarget(androidx.compose.foundation.gestures.DraggableAnchors<T> r5, float r6, float r7, p300x7.InterfaceC10570l r8, p300x7.InterfaceC10559a r9) {
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
            kotlin.jvm.internal.AbstractC9133u.m16130d(r5)
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
            kotlin.jvm.internal.AbstractC9133u.m16130d(r5)
            return r5
        L45:
            java.lang.Object r7 = r5.closestAnchor(r6, r2)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r7)
            float r9 = r5.positionOf(r7)
            java.lang.Object r0 = r5.closestAnchor(r6, r3)
            kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.computeTarget(androidx.compose.foundation.gestures.DraggableAnchors, float, float, x7.l, x7.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(AbstractC8809v.m14771n(), new float[0]);
    }

    public static final <T> void forEach(DraggableAnchors<T> draggableAnchors, InterfaceC10574p interfaceC10574p) {
        int size = draggableAnchors.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            T tAnchorAt = draggableAnchors.anchorAt(i10);
            if (tAnchorAt == null) {
                throw new IllegalArgumentException(("There was no key at index " + i10 + ". Please report a bug.").toString());
            }
            interfaceC10574p.invoke(tAnchorAt, Float.valueOf(draggableAnchors.positionAt(i10)));
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
    public static final <I> java.lang.Object restartable(p300x7.InterfaceC10559a r4, p300x7.InterfaceC10574p r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt.C12371
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt.C12371) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.AbstractC9165e.m16556e(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            h7.p r4 = p123h7.C8736p.f16368a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(x7.a, x7.p, m7.c):java.lang.Object");
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C12392(null), interfaceC9324c, 2, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
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

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, InterfaceC10570l interfaceC10570l2, int i10, Object obj2) {
        if ((i10 & 64) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState.3
                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, interfaceC10570l, interfaceC10559a, animationSpec, decayAnimationSpec, interfaceC10570l2);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z10, (i10 & 8) != 0 ? null : mutableInteractionSource, (i10 & 16) != 0 ? null : overscrollEffect, (i10 & 32) != 0 ? null : flingBehavior);
    }

    @InterfaceC8721a
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

    @InterfaceC8721a
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t10, DraggableAnchors<T> draggableAnchors, InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, InterfaceC10570l interfaceC10570l2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t10, draggableAnchors, interfaceC10570l2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(interfaceC10570l);
        anchoredDraggableState.setVelocityThreshold$foundation_release(interfaceC10559a);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t10, null, new C12344(anchoredDraggableState, animationSpec, null), interfaceC9324c, 2, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z10, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @InterfaceC8721a
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z10, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z11, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z10, null, mutableInteractionSource, Boolean.valueOf(z11), overscrollEffect, flingBehavior));
    }

    private static final void debugLog(InterfaceC10559a interfaceC10559a) {
    }
}
