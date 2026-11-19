package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010 \u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010!J\u000e\u0010#\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010!J\u0006\u0010$\u001a\u00020\u0018J\u001c\u0010%\u001a\u00020\u0018*\u00020&2\u0006\u0010'\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m13558d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", OSSHeaders.ORIGIN, "Landroidx/compose/ui/geometry/Offset;", "radius", "", "bounded", "", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedCenterPercent", "animatedRadiusPercent", "<set-?>", "finishRequested", "getFinishRequested", "()Z", "setFinishRequested", "(Z)V", "finishRequested$delegate", "Landroidx/compose/runtime/MutableState;", "finishSignalDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "finishedFadingIn", "getFinishedFadingIn", "setFinishedFadingIn", "finishedFadingIn$delegate", "startRadius", "Ljava/lang/Float;", "targetCenter", "animate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fadeIn", "fadeOut", "finish", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "material-ripple_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,182:1\n85#2:183\n113#2,2:184\n85#2:186\n113#2,2:187\n225#3,8:189\n272#3,14:197\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n73#1:183\n73#1:184,2\n74#1:186\n74#1:187,2\n150#1:189,8\n150#1:197,14\n*E\n"})
/* loaded from: classes2.dex */
public final class RippleAnimation {
    public static final int $stable = 8;
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;

    /* renamed from: finishRequested$delegate, reason: from kotlin metadata */
    private final MutableState finishRequested;
    private final CompletableDeferred<Unit> finishSignalDeferred;

    /* renamed from: finishedFadingIn$delegate, reason: from kotlin metadata */
    private final MutableState finishedFadingIn;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation", m13596f = "RippleAnimation.kt", m13597i = {0, 1}, m13598l = {77, 79, 80}, m13599m = "animate", m13600n = {"this", "this"}, m13601s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$animate$1 */
    public static final class C19661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C19661(Continuation<? super C19661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2 */
    public static final class C19672 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {86}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {92}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RippleAnimation rippleAnimation, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.this$0.animatedRadiusPercent;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {98}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RippleAnimation rippleAnimation, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.this$0.animatedCenterPercent;
                    Float fBoxFloat = Boxing.boxFloat(1.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(225, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C19672(Continuation<? super C19672> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19672 c19672 = RippleAnimation.this.new C19672(continuation);
            c19672.L$0 = obj;
            return c19672;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(RippleAnimation.this, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(RippleAnimation.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C19672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2 */
    public static final class C19682 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m13596f = "RippleAnimation.kt", m13597i = {}, m13598l = {109}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RippleAnimation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RippleAnimation rippleAnimation, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rippleAnimation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatable = this.this$0.animatedAlpha;
                    Float fBoxFloat = Boxing.boxFloat(0.0f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C19682(Continuation<? super C19682> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C19682 c19682 = RippleAnimation.this.new C19682(continuation);
            c19682.L$0 = obj;
            return c19682;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(RippleAnimation.this, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C19682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f10, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f10, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C19672(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C19682(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z9) {
        this.finishRequested.setValue(Boolean.valueOf(z9));
    }

    private final void setFinishedFadingIn(boolean z9) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.fadeOut(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation.C19661
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation.C19661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L47:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m18476draw4WTKRHQ(DrawScope drawScope, long j10) {
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m18478getRippleStartRadiusuvyYCjk(drawScope.mo21527getSizeNHjbRc()));
        }
        if (this.origin == null) {
            this.origin = Offset.m20724boximpl(drawScope.mo21526getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m20724boximpl(OffsetKt.Offset(Size.m20804getWidthimpl(drawScope.mo21527getSizeNHjbRc()) / 2.0f, Size.m20801getHeightimpl(drawScope.mo21527getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!getFinishRequested() || getFinishedFadingIn()) ? this.animatedAlpha.getValue().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        Intrinsics.checkNotNull(f10);
        float fLerp = MathHelpersKt.lerp(f10.floatValue(), this.radius, this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        Intrinsics.checkNotNull(offset);
        float fM20735getXimpl = Offset.m20735getXimpl(offset.m20745unboximpl());
        Offset offset2 = this.targetCenter;
        Intrinsics.checkNotNull(offset2);
        float fLerp2 = MathHelpersKt.lerp(fM20735getXimpl, Offset.m20735getXimpl(offset2.m20745unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        Intrinsics.checkNotNull(offset3);
        float fM20736getYimpl = Offset.m20736getYimpl(offset3.m20745unboximpl());
        Offset offset4 = this.targetCenter;
        Intrinsics.checkNotNull(offset4);
        long jOffset = OffsetKt.Offset(fLerp2, MathHelpersKt.lerp(fM20736getYimpl, Offset.m20736getYimpl(offset4.m20745unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j10, Color.m20978getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m21508drawCircleVaOC9Bg$default(drawScope, jM20975copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fM20804getWidthimpl = Size.m20804getWidthimpl(drawScope.mo21527getSizeNHjbRc());
        float fM20801getHeightimpl = Size.m20801getHeightimpl(drawScope.mo21527getSizeNHjbRc());
        int iM20965getIntersectrtfAjoo = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21451clipRectN_I0leg(0.0f, 0.0f, fM20804getWidthimpl, fM20801getHeightimpl, iM20965getIntersectrtfAjoo);
            DrawScope.m21508drawCircleVaOC9Bg$default(drawScope, jM20975copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
        }
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.complete(Unit.INSTANCE);
    }

    private RippleAnimation(Offset offset, float f10, boolean z9) {
        this.origin = offset;
        this.radius = f10;
        this.bounded = z9;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = CompletableDeferredKt.CompletableDeferred((Job) null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }
}
