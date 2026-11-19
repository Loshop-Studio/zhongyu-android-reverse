package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.Ref$FloatRef;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

@Stable
/* loaded from: classes2.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private final MutableState density$delegate;
    private final State<Float> offset;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<DrawerState, DrawerValue> Saver(final InterfaceC10570l interfaceC10570l) {
            return SaverKt.Saver(new InterfaceC10574p() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // p300x7.InterfaceC10574p
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new InterfaceC10570l() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, interfaceC10570l);
                }
            });
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.DrawerState$animateTo$3", m17801f = "NavigationDrawer.kt", m17802l = {254}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3 */
    public static final class C21303 extends SuspendLambda implements InterfaceC10576r {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21303(float f10, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C21303> interfaceC9324c) {
            super(4, interfaceC9324c);
            this.$velocity = f10;
            this.$animationSpec = animationSpec;
        }

        @Override // p300x7.InterfaceC10576r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<DrawerValue> draggableAnchors, DrawerValue drawerValue, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C21303 c21303 = DrawerState.this.new C21303(this.$velocity, this.$animationSpec, interfaceC9324c);
            c21303.L$0 = anchoredDragScope;
            c21303.L$1 = draggableAnchors;
            c21303.L$2 = drawerValue;
            return c21303.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float currentOffset = Float.isNaN(DrawerState.this.getCurrentOffset()) ? 0.0f : DrawerState.this.getCurrentOffset();
                    ref$FloatRef.f17470a = currentOffset;
                    float f10 = this.$velocity;
                    AnimationSpec<Float> animationSpec = this.$animationSpec;
                    InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.material3.DrawerState.animateTo.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            return C8736p.f16368a;
                        }

                        public final void invoke(float f11, float f12) {
                            anchoredDragScope.dragTo(f11, f12);
                            ref$FloatRef.f17470a = f11;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(currentOffset, fPositionOf, f10, animationSpec, interfaceC10574p, this) == objM17291f) {
                        return objM17291f;
                    }
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

    public DrawerState(DrawerValue drawerValue, InterfaceC10570l interfaceC10570l) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new InterfaceC10570l() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$1
            public final Float invoke(float f10) {
                return Float.valueOf(f10 * NavigationDrawerKt.DrawerPositionalThreshold);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).floatValue());
            }
        }, new InterfaceC10559a() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo20497toPx0680j_4(NavigationDrawerKt.DrawerVelocityThreshold));
            }
        }, NavigationDrawerKt.AnimationSpec, interfaceC10570l);
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
    public static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            animationSpec = NavigationDrawerKt.AnimationSpec;
        }
        if ((i10 & 4) != 0) {
            f10 = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f10, interfaceC9324c);
    }

    @InterfaceC8721a
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

    @InterfaceC8721a
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, interfaceC9324c, 4, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
    }

    public final Object close(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Closed, null, 0.0f, interfaceC9324c, 6, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
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

    public final Object open(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Open, null, 0.0f, interfaceC9324c, 6, null);
        return objAnimateTo$default == AbstractC9434a.m17291f() ? objAnimateTo$default : C8736p.f16368a;
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material3_release(Density density) {
        this.density$delegate.setValue(density);
    }

    public final Object snapTo(DrawerValue drawerValue, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, interfaceC9324c);
        return objSnapTo == AbstractC9434a.m17291f() ? objSnapTo : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new C21303(f10, animationSpec, null), interfaceC9324c, 2, null);
        return objAnchoredDrag$default == AbstractC9434a.m17291f() ? objAnchoredDrag$default : C8736p.f16368a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this(drawerValue, (i10 & 2) != 0 ? new InterfaceC10570l() { // from class: androidx.compose.material3.DrawerState.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : interfaceC10570l);
    }
}
