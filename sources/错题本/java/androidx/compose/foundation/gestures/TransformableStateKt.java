package androidx.compose.foundation.gestures;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aZ\u0010\u000b\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\\\u0010\r\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a,\u0010\u0012\u001a\u00020\b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0015\u001a\u00020\b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0013\u001a/\u0010\u0019\u001a\u00020\b*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a_\u0010!\u001a\u00020\b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\"\u001a\u00020\b*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b$\u0010#\u001a\u001f\u0010'\u001a\u00020\b*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001e\u0010*\u001a\u00020\b*\u00020\n2\b\b\u0002\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, m5110d2 = {"Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "Ld6/s;", "onTransformation", "Landroidx/compose/foundation/gestures/TransformableState;", "TransformableState", "(Lr6/f;)Landroidx/compose/foundation/gestures/TransformableState;", "rememberTransformableState", "(Lr6/f;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "zoomFactor", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateZoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "degrees", "animateRotateBy", TypedValues.CycleType.S_WAVE_OFFSET, "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "animatePanBy", "panOffset", "rotationDegrees", "zoomAnimationSpec", "panAnimationSpec", "rotationAnimationSpec", "animateBy-Su4bsnU", "(Landroidx/compose/foundation/gestures/TransformableState;FJFLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "animateBy", "zoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLh6/c;)Ljava/lang/Object;", "rotateBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLh6/c;)Ljava/lang/Object;", "panBy", "Landroidx/compose/foundation/MutatePriority;", "terminationPriority", "stopTransformation", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/AnimationData;", "ZeroAnimationVelocity", "Landroidx/compose/foundation/gestures/AnimationData;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,456:1\n1247#2,6:457\n96#3,5:463\n96#3,5:468\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n125#1:457,6\n139#1:463,5\n219#1:468,5\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableStateKt {

    @NotNull
    private static final AnimationData ZeroAnimationVelocity = new AnimationData(0.0f, Offset.INSTANCE.m10457getZeroF1C5BW0(), 0.0f, null);

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {162}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2 */
    public static final class C09212 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref$FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09212(Ref$FloatRef ref$FloatRef, float f, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C09212> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$previous = ref$FloatRef;
            this.$degrees = f;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09212 c09212 = new C09212(this.$previous, this.$degrees, this.$animationSpec, interfaceC5631c);
            c09212.L$0 = obj;
            return c09212;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09212) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float f = new Float(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m7063transformByd4ec7I$default(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - ref$FloatRef.element, 3, null);
                        ref$FloatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f, animationSpec, false, interfaceC6471c, this, 4, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {142}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3 */
    public static final class C09223 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref$FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09223(Ref$FloatRef ref$FloatRef, float f, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C09223> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$previous = ref$FloatRef;
            this.$zoomFactor = f;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09223 c09223 = new C09223(this.$previous, this.$zoomFactor, this.$animationSpec, interfaceC5631c);
            c09223.L$0 = obj;
            return c09223;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09223) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float f = new Float(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref$FloatRef ref$FloatRef = this.$previous;
                InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return C5443s.f8405a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m7063transformByd4ec7I$default(transformScope, ref$FloatRef.element == 0.0f ? 1.0f : animationScope.getValue().floatValue() / ref$FloatRef.element, 0L, 0.0f, 6, null);
                        ref$FloatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f, animationSpec, false, interfaceC6471c, this, 4, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2 */
    public static final class C09232 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09232(float f, InterfaceC5631c<? super C09232> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$degrees = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09232 c09232 = new C09232(this.$degrees, interfaceC5631c);
            c09232.L$0 = obj;
            return c09232;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09232) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ((TransformScope) this.L$0).mo6940transformByd4ec7I(1.0f, Offset.INSTANCE.m10457getZeroF1C5BW0(), this.$degrees);
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2 */
    public static final class C09242 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C09242(InterfaceC5631c<? super C09242> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return new C09242(interfaceC5631c);
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09242) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return C5443s.f8405a;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2 */
    public static final class C09252 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09252(float f, InterfaceC5631c<? super C09252> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$zoomFactor = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C09252 c09252 = new C09252(this.$zoomFactor, interfaceC5631c);
            c09252.L$0 = obj;
            return c09252;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C09252) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            ((TransformScope) this.L$0).mo6940transformByd4ec7I(this.$zoomFactor, Offset.INSTANCE.m10457getZeroF1C5BW0(), 0.0f);
            return C5443s.f8405a;
        }
    }

    @NotNull
    public static final TransformableState TransformableState(@NotNull InterfaceC6474f interfaceC6474f) {
        return new DefaultTransformableState(interfaceC6474f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.foundation.gestures.AnimationData] */
    @Nullable
    /* renamed from: animateBy-Su4bsnU, reason: not valid java name */
    public static final Object m7067animateBySu4bsnU(@NotNull TransformableState transformableState, float f, long j7, float f7, @NotNull AnimationSpec<Float> animationSpec, @NotNull AnimationSpec<Offset> animationSpec2, @NotNull AnimationSpec<Float> animationSpec3, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new AnimationData(1.0f, Offset.INSTANCE.m10457getZeroF1C5BW0(), 0.0f, null);
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateBy$3(ref$ObjectRef, new AnimationData(f, j7, f7, null), new DelegatingAnimationSpec(animationSpec, animationSpec2, animationSpec3), null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    @Nullable
    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m7069animatePanByubNVwUQ(@NotNull TransformableState transformableState, long j7, @NotNull AnimationSpec<Offset> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = Offset.INSTANCE.m10457getZeroF1C5BW0();
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(ref$LongRef, j7, animationSpec, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m7070animatePanByubNVwUQ$default(TransformableState transformableState, long j7, AnimationSpec animationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m7069animatePanByubNVwUQ(transformableState, j7, animationSpec, interfaceC5631c);
    }

    @Nullable
    public static final Object animateRotateBy(@NotNull TransformableState transformableState, float f, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C09212(new Ref$FloatRef(), f, animationSpec, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f, animationSpec, interfaceC5631c);
    }

    @Nullable
    public static final Object animateZoomBy(@NotNull TransformableState transformableState, float f, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("zoom value should be greater than 0");
        }
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = 1.0f;
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C09223(ref$FloatRef, f, animationSpec, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f, animationSpec, interfaceC5631c);
    }

    @Nullable
    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m7071panByd4ec7I(@NotNull TransformableState transformableState, long j7, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j7, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    @Composable
    @NotNull
    public static final TransformableState rememberTransformableState(@NotNull InterfaceC6474f interfaceC6474f, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:122)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC6474f, composer, i & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TransformableState(new InterfaceC6474f() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // p152r6.InterfaceC6474f
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m7072invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m10451unboximpl(), ((Number) obj3).floatValue());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m7072invoked4ec7I(float f, long j7, float f7) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f), Offset.m10430boximpl(j7), Float.valueOf(f7));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transformableState;
    }

    @Nullable
    public static final Object rotateBy(@NotNull TransformableState transformableState, float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C09232(f, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }

    @Nullable
    public static final Object stopTransformation(@NotNull TransformableState transformableState, @NotNull MutatePriority mutatePriority, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objTransform = transformableState.transform(mutatePriority, new C09242(null), interfaceC5631c);
        return objTransform == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform : C5443s.f8405a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, interfaceC5631c);
    }

    @Nullable
    public static final Object zoomBy(@NotNull TransformableState transformableState, float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C09252(f, null), interfaceC5631c, 1, null);
        return objTransform$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform$default : C5443s.f8405a;
    }
}
