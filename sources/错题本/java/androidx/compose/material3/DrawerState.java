package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;

@Stable
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0087@¢\u0006\u0004\b\u0012\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R/\u00100\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010/R\u0011\u00101\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u00106\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b7\u00102R\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u00105R\u0011\u0010:\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001c¨\u0006<"}, m5110d2 = {"Landroidx/compose/material3/DrawerState;", "", "Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lr6/c;)V", "Landroidx/compose/ui/unit/Density;", "requireDensity", "()Landroidx/compose/ui/unit/Density;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "velocity", "Ld6/s;", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLh6/c;)Ljava/lang/Object;", "open", "(Lh6/c;)Ljava/lang/Object;", "close", "anim", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lh6/c;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lh6/c;)Ljava/lang/Object;", "requireOffset$material3_release", "()F", "requireOffset", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "<set-?>", "density$delegate", "Landroidx/compose/runtime/MutableState;", "getDensity$material3_release", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getCurrentOffset", "currentOffset", "Companion", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1167:1\n81#2:1168\n107#2,2:1169\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n235#1:1168\n235#1:1169,2\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;

    /* renamed from: density$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState density;

    @NotNull
    private final State<Float> offset;

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Saver", "(Lr6/c;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull final InterfaceC6471c confirmStateChange) {
            return SaverKt.Saver(new InterfaceC6473e() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // p152r6.InterfaceC6473e
                @Nullable
                public final DrawerValue invoke(@NotNull SaverScope saverScope, @NotNull DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new InterfaceC6471c() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                @Nullable
                public final DrawerState invoke(@NotNull DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, confirmStateChange);
                }
            });
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m5110d2 = {"Landroidx/compose/material3/internal/AnchoredDragScope;", "Landroidx/compose/material3/internal/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "anchors", "latestTarget", "Ld6/s;", "<anonymous>", "(Landroidx/compose/material3/internal/AnchoredDragScope;Landroidx/compose/material3/internal/DraggableAnchors;Landroidx/compose/material3/DrawerValue;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.DrawerState$animateTo$3", m5303f = "NavigationDrawer.kt", m5304i = {}, m5305l = {254}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3 */
    public static final class C16403 extends SuspendLambda implements InterfaceC6475g {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16403(float f, AnimationSpec<Float> animationSpec, InterfaceC5631c<? super C16403> interfaceC5631c) {
            super(4, interfaceC5631c);
            this.$velocity = f;
            this.$animationSpec = animationSpec;
        }

        @Override // p152r6.InterfaceC6475g
        @Nullable
        public final Object invoke(@NotNull AnchoredDragScope anchoredDragScope, @NotNull DraggableAnchors<DrawerValue> draggableAnchors, @NotNull DrawerValue drawerValue, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C16403 c16403 = DrawerState.this.new C16403(this.$velocity, this.$animationSpec, interfaceC5631c);
            c16403.L$0 = anchoredDragScope;
            c16403.L$1 = draggableAnchors;
            c16403.L$2 = drawerValue;
            return c16403.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float currentOffset = Float.isNaN(DrawerState.this.getCurrentOffset()) ? 0.0f : DrawerState.this.getCurrentOffset();
                    ref$FloatRef.element = currentOffset;
                    float f = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$animationSpec;
                    InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.material3.DrawerState.animateTo.3.1
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
                    if (SuspendAnimationKt.animate(currentOffset, fPositionOf, f, animationSpec, interfaceC6473e, this) == coroutineSingletons) {
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
    }

    public DrawerState(@NotNull DrawerValue drawerValue, @NotNull InterfaceC6471c interfaceC6471c) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new InterfaceC6471c() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$1
            @NotNull
            public final Float invoke(float f) {
                return Float.valueOf(NavigationDrawerKt.DrawerPositionalThreshold * f);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        }, new InterfaceC6469a() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo6903toPx0680j_4(NavigationDrawerKt.DrawerVelocityThreshold));
            }
        }, NavigationDrawerKt.AnimationSpec, interfaceC6471c);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            @NotNull
            public Float getValue() {
                return Float.valueOf(this.this$0.getAnchoredDraggableState$material3_release().getOffset());
            }
        };
        this.density = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = NavigationDrawerKt.AnimationSpec;
        }
        if ((i & 4) != 0) {
            f = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f, interfaceC5631c);
    }

    @Deprecated(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @ReplaceWith(expression = "currentOffset", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density$material3_release = getDensity$material3_release();
        if (density$material3_release != null) {
            return density$material3_release;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }

    @Deprecated(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, interfaceC5631c, 4, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
    }

    @Nullable
    public final Object close(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Closed, null, 0.0f, interfaceC5631c, 6, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
    }

    @NotNull
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material3_release() {
        return (Density) this.density.getValue();
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.offset;
    }

    @NotNull
    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Open, null, 0.0f, interfaceC5631c, 6, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : C5443s.f8405a;
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material3_release(@Nullable Density density) {
        this.density.setValue(density);
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, interfaceC5631c);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new C16403(f, animationSpec, null), interfaceC5631c, 2, null);
        return objAnchoredDrag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnchoredDrag$default : C5443s.f8405a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, InterfaceC6471c interfaceC6471c, int i, AbstractC5824e abstractC5824e) {
        this(drawerValue, (i & 2) != 0 ? new InterfaceC6471c() { // from class: androidx.compose.material3.DrawerState.1
            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC6471c);
    }
}
