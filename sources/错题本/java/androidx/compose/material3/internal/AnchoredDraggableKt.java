package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;

@Metadata(m5109d1 = {"\u0000|\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001b\u0010\u001c\u001aH\u0010#\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!\u0012\u0006\u0012\u0004\u0018\u00010\u00000 H\u0082@¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b&\u0010'\u001ay\u00100\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2H\u0010/\u001aD\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110,¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00028\u00000.0 H\u0000¢\u0006\u0004\b0\u00101¨\u00062"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/material3/internal/DraggableAnchors;", "DraggableAnchors", "(Lr6/c;)Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "targetValue", "snapTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "", "velocity", "animateTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;FLh6/c;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lh6/c;", "block", "restartable", "(Lr6/a;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/material3/internal/MapDraggableAnchors;", "emptyDraggableAnchors", "()Landroidx/compose/material3/internal/MapDraggableAnchors;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "anchors", "draggableAnchors", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lr6/e;)Landroidx/compose/ui/Modifier;", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "", "velocity", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;F)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1 */
    public static final class C19381 extends SuspendLambda implements InterfaceC6474f {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
        @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {177}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$state = anchoredDraggableState;
                this.$velocity = f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$state, this.$velocity, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                    float f = this.$velocity;
                    this.label = 1;
                    if (anchoredDraggableState.settle(f, this) == coroutineSingletons) {
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

            @Override // p152r6.InterfaceC6473e
            @Nullable
            public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19381(AnchoredDraggableState<T> anchoredDraggableState, InterfaceC5631c<? super C19381> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.$state = anchoredDraggableState;
        }

        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC6009v) obj, ((Number) obj2).floatValue(), (InterfaceC5631c<? super C5443s>) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            AbstractC6014x.m5651v((InterfaceC6009v) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3);
            return C5443s.f8405a;
        }

        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, float f, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C19381 c19381 = new C19381(this.$state, interfaceC5631c);
            c19381.L$0 = interfaceC6009v;
            c19381.F$0 = f;
            return c19381.invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material3/internal/AnchoredDragScope;", "Landroidx/compose/material3/internal/DraggableAnchors;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {685}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2 */
    public static final class C19392 extends SuspendLambda implements InterfaceC6475g {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19392(AnchoredDraggableState<T> anchoredDraggableState, float f, InterfaceC5631c<? super C19392> interfaceC5631c) {
            super(4, interfaceC5631c);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f;
        }

        @Nullable
        public final Object invoke(@NotNull AnchoredDragScope anchoredDragScope, @NotNull DraggableAnchors<T> draggableAnchors, T t8, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C19392 c19392 = new C19392(this.$this_animateTo, this.$velocity, interfaceC5631c);
            c19392.L$0 = anchoredDragScope;
            c19392.L$1 = draggableAnchors;
            c19392.L$2 = t8;
            return c19392.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float offset = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    ref$FloatRef.element = offset;
                    float f = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                    InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt.animateTo.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p152r6.InterfaceC6473e
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            return C5443s.f8405a;
                        }

                        public final void invoke(float f7, float f8) {
                            anchoredDragScope.dragTo(f7, f8);
                            ref$FloatRef.element = f7;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(offset, fPositionOf, f, animationSpec, interfaceC6473e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC5631c<? super C5443s>) obj4);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {713}, m5306m = "restartable", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 */
    public static final class C19401<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C19401(InterfaceC5631c<? super C19401> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {715}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 */
    public static final class C19412 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $block;
        final /* synthetic */ InterfaceC6469a $inputs;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "latestInputs", "Ld6/s;", "emit", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC5912g {
            final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
            final /* synthetic */ InterfaceC6473e $block;
            final /* synthetic */ Ref$ObjectRef<InterfaceC6013w0> $previousDrag;

            @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"I", "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
            @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {722}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                final /* synthetic */ InterfaceC6009v $$this$coroutineScope;
                final /* synthetic */ InterfaceC6473e $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(InterfaceC6473e interfaceC6473e, I i, InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.$block = interfaceC6473e;
                    this.$latestInputs = i;
                    this.$$this$coroutineScope = interfaceC6009v;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC6473e interfaceC6473e = this.$block;
                        Object obj2 = this.$latestInputs;
                        this.label = 1;
                        if (interfaceC6473e.invoke(obj2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    AbstractC6014x.m5635f(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            public AnonymousClass1(Ref$ObjectRef<InterfaceC6013w0> ref$ObjectRef, InterfaceC6009v interfaceC6009v, InterfaceC6473e interfaceC6473e) {
                this.$previousDrag = ref$ObjectRef;
                this.$$this$coroutineScope = interfaceC6009v;
                this.$block = interfaceC6473e;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r7 = r0.L$2
                    kotlinx.coroutines.w0 r7 = (kotlinx.coroutines.InterfaceC6013w0) r7
                    java.lang.Object r7 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C19412.AnonymousClass1) r0
                    kotlin.AbstractC5774b.m5119b(r8)
                    goto L5c
                L31:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L39:
                    kotlin.AbstractC5774b.m5119b(r8)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.w0> r8 = r6.$previousDrag
                    T r8 = r8.element
                    kotlinx.coroutines.w0 r8 = (kotlinx.coroutines.InterfaceC6013w0) r8
                    if (r8 == 0) goto L5b
                    androidx.compose.material3.internal.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                    r2.<init>()
                    r8.cancel(r2)
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.L$2 = r8
                    r0.label = r3
                    java.lang.Object r8 = r8.mo5456e(r0)
                    if (r8 != r1) goto L5b
                    return r1
                L5b:
                    r0 = r6
                L5c:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.w0> r8 = r0.$previousDrag
                    kotlinx.coroutines.v r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                    r6.e r0 = r0.$block
                    r5 = 0
                    r4.<init>(r0, r7, r1, r5)
                    kotlinx.coroutines.k1 r7 = kotlinx.coroutines.AbstractC6014x.m5651v(r1, r5, r2, r4, r3)
                    r8.element = r7
                    d6.s r7 = p045d6.C5443s.f8405a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.C19412.AnonymousClass1.emit(java.lang.Object, h6.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19412(InterfaceC6469a interfaceC6469a, InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super C19412> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$inputs = interfaceC6469a;
            this.$block = interfaceC6473e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            C19412 c19412 = new C19412(this.$inputs, this.$block, interfaceC5631c);
            c19412.L$0 = obj;
            return c19412;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                InterfaceC5910f interfaceC5910fSnapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, interfaceC6009v, this.$block);
                this.label = 1;
                if (interfaceC5910fSnapshotFlow.collect(anonymousClass1, this) == coroutineSingletons) {
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

        @Override // p152r6.InterfaceC6473e
        @Nullable
        public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C19412) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/material3/internal/AnchoredDragScope;", "Landroidx/compose/material3/internal/DraggableAnchors;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2 */
    public static final class C19422 extends SuspendLambda implements InterfaceC6475g {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C19422(InterfaceC5631c<? super C19422> interfaceC5631c) {
            super(4, interfaceC5631c);
        }

        @Nullable
        public final Object invoke(@NotNull AnchoredDragScope anchoredDragScope, @NotNull DraggableAnchors<T> draggableAnchors, T t8, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C19422 c19422 = new C19422(interfaceC5631c);
            c19422.L$0 = anchoredDragScope;
            c19422.L$1 = draggableAnchors;
            c19422.L$2 = t8;
            return c19422.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6475g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnchoredDragScope) obj, (DraggableAnchors<DraggableAnchors>) obj2, (DraggableAnchors) obj3, (InterfaceC5631c<? super C5443s>) obj4);
        }
    }

    @NotNull
    public static final <T> DraggableAnchors<T> DraggableAnchors(@NotNull InterfaceC6471c interfaceC6471c) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        interfaceC6471c.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    @NotNull
    public static final <T> Modifier anchoredDraggable(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z8, boolean z9, @Nullable MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState(), orientation, z8, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new C19381(anchoredDraggableState, null), z9, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z8 = true;
        }
        boolean z10 = z8;
        if ((i & 8) != 0) {
            z9 = false;
        }
        boolean z11 = z9;
        if ((i & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z10, z11, mutableInteractionSource);
    }

    @Nullable
    public static final <T> Object animateTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t8, float f, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new C19392(anchoredDraggableState, f, null), interfaceC5631c, 2, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, InterfaceC5631c interfaceC5631c, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f, interfaceC5631c);
    }

    @NotNull
    public static final <T> Modifier draggableAnchors(@NotNull Modifier modifier, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, @NotNull InterfaceC6473e interfaceC6473e) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, interfaceC6473e, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(AbstractC5785e0.m5147A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(p152r6.InterfaceC6469a r4, p152r6.InterfaceC6473e r5, p075h6.InterfaceC5631c<? super p045d6.C5443s> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt.C19401
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C19401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.AbstractC5774b.m5119b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.AbstractC5774b.m5119b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r0.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.AbstractC6014x.m5637h(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            d6.s r4 = p045d6.C5443s.f8405a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.restartable(r6.a, r6.e, h6.c):java.lang.Object");
    }

    @Nullable
    public static final <T> Object snapTo(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new C19422(null), interfaceC5631c, 2, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }
}
