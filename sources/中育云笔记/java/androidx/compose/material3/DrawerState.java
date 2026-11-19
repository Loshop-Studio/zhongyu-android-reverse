package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes2.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private final MutableState density$delegate;
    private final State<Float> offset;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Saver<DrawerState, DrawerValue> Saver(final InterfaceC9540l interfaceC9540l) {
            return SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // p181hd.InterfaceC9544p
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, interfaceC9540l);
                }
            });
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.material3.DrawerState$animateTo$3", m26211f = "NavigationDrawer.kt", m26212l = {254}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3 */
    public static final class C21603 extends SuspendLambda implements InterfaceC9546r {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21603(float f10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C21603> interfaceC11588c) {
            super(4, interfaceC11588c);
            this.$velocity = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // p181hd.InterfaceC9546r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<DrawerValue> draggableAnchors, DrawerValue drawerValue, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C21603 c21603 = DrawerState.this.new C21603(this.$velocity, this.$animationSpec, interfaceC11588c);
            c21603.L$0 = anchoredDragScope;
            c21603.L$1 = draggableAnchors;
            c21603.L$2 = drawerValue;
            return c21603.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float currentOffset = Float.isNaN(DrawerState.this.getCurrentOffset()) ? 0.0f : DrawerState.this.getCurrentOffset();
                    ref$FloatRef.f23399c = currentOffset;
                    float f10 = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$animationSpec;
                    InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.material3.DrawerState.animateTo.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p181hd.InterfaceC9544p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            return C10786q.f26013a;
                        }

                        public final void invoke(float f11, float f12) {
                            anchoredDragScope.dragTo(f11, f12);
                            ref$FloatRef.f23399c = f11;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(currentOffset, fPositionOf, f10, animationSpec, interfaceC9544p, this) == objM25952f) {
                        return objM25952f;
                    }
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

    public DrawerState(DrawerValue drawerValue, InterfaceC9540l interfaceC9540l) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new InterfaceC9540l() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$1
            public final Float invoke(float f10) {
                return Float.valueOf(f10 * NavigationDrawerKt.DrawerPositionalThreshold);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        }, new InterfaceC9529a() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo27099toPx0680j_4(NavigationDrawerKt.DrawerVelocityThreshold));
            }
        }, NavigationDrawerKt.AnimationSpec, interfaceC9540l);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            public Float getValue() {
                return Float.valueOf(this.this$0.getAnchoredDraggableState$material3_release().getOffset());
            }
        };
        this.density$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f10, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = NavigationDrawerKt.AnimationSpec;
        }
        if ((i10 & 4) != 0) {
            f10 = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f10, interfaceC11588c);
    }

    @InterfaceC10770a
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

    @InterfaceC10770a
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, interfaceC11588c, 4, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final Object close(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Closed, null, 0.0f, interfaceC11588c, 6, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material3_release() {
        return (Density) this.density$delegate.getValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

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

    public final Object open(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Open, null, 0.0f, interfaceC11588c, 6, null);
        return objAnimateTo$default == AbstractC11725a.m25952f() ? objAnimateTo$default : C10786q.f26013a;
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material3_release(Density density) {
        this.density$delegate.setValue(density);
    }

    public final Object snapTo(DrawerValue drawerValue, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, interfaceC11588c);
        return objSnapTo == AbstractC11725a.m25952f() ? objSnapTo : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new C21603(f10, animationSpec, null), interfaceC11588c, 2, null);
        return objAnchoredDrag$default == AbstractC11725a.m25952f() ? objAnchoredDrag$default : C10786q.f26013a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this(drawerValue, (i10 & 2) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.material3.DrawerState.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC9540l);
    }
}
