package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNodeKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Landroidx/compose/material3/ThumbNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "checked", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Z)V", "Ld6/s;", "onAttach", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "update", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "Z", "getChecked", "()Z", "setChecked", "(Z)V", "isPressed", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "offsetAnim", "Landroidx/compose/animation/core/Animatable;", "sizeAnim", "initialOffset", "F", "initialSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,625:1\n56#2:626\n68#2:627\n56#2:628\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/ThumbNode\n*L\n251#1:626\n251#1:627\n253#1:628\n*E\n"})
/* loaded from: classes.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;

    @NotNull
    private InteractionSource interactionSource;
    private boolean isPressed;

    @Nullable
    private Animatable<Float, AnimationVector1D> offsetAnim;

    @Nullable
    private Animatable<Float, AnimationVector1D> sizeAnim;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.ThumbNode$onAttach$1", m5303f = "Switch.kt", m5304i = {}, m5305l = {220}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.ThumbNode$onAttach$1 */
    public static final class C18861 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C18861(InterfaceC5631c<? super C18861> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
            return ThumbNode.this.new C18861(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                InterfaceC5910f interactions = ThumbNode.this.getInteractionSource().getInteractions();
                final ThumbNode thumbNode = ThumbNode.this;
                InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.material3.ThumbNode.onAttach.1.1
                    @Override // kotlinx.coroutines.flow.InterfaceC5912g
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                        return emit((Interaction) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                    }

                    @Nullable
                    public final Object emit(@NotNull Interaction interaction, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        if (interaction instanceof PressInteraction.Press) {
                            ref$IntRef.element++;
                        } else if (interaction instanceof PressInteraction.Release) {
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            ref$IntRef2.element--;
                        } else if (interaction instanceof PressInteraction.Cancel) {
                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                            ref$IntRef3.element--;
                        }
                        boolean z8 = ref$IntRef.element > 0;
                        if (thumbNode.isPressed != z8) {
                            thumbNode.isPressed = z8;
                            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
                        }
                        return C5443s.f8405a;
                    }
                };
                this.label = 1;
                if (interactions.collect(interfaceC5912g, this) == coroutineSingletons) {
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
            return ((C18861) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public ThumbNode(@NotNull InteractionSource interactionSource, boolean z8) {
        this.interactionSource = interactionSource;
        this.checked = z8;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        float fMo6903toPx0680j_4 = measureScope.mo6903toPx0680j_4(this.isPressed ? SwitchTokens.INSTANCE.m9937getPressedHandleWidthD9Ej5fM() : ((measurable.maxIntrinsicHeight(Constraints.m13258getMaxWidthimpl(j7)) != 0 && measurable.maxIntrinsicWidth(Constraints.m13257getMaxHeightimpl(j7)) != 0) || this.checked) ? SwitchKt.getThumbDiameter() : SwitchKt.getUncheckedThumbDiameter());
        Animatable<Float, AnimationVector1D> animatable = this.sizeAnim;
        int iFloatValue = (int) (animatable != null ? animatable.getValue().floatValue() : fMo6903toPx0680j_4);
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(Constraints.INSTANCE.m13268fixedJhjzzOo(iFloatValue, iFloatValue));
        final float fMo6903toPx0680j_42 = measureScope.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(SwitchKt.SwitchHeight - measureScope.mo6899toDpu2uoSUM(fMo6903toPx0680j_4)) / 2.0f));
        float fMo6903toPx0680j_43 = measureScope.mo6903toPx0680j_4(C2331Dp.m13305constructorimpl(C2331Dp.m13305constructorimpl(SwitchKt.SwitchWidth - SwitchKt.getThumbDiameter()) - SwitchKt.ThumbPadding));
        boolean z8 = this.isPressed;
        if (z8 && this.checked) {
            fMo6903toPx0680j_42 = fMo6903toPx0680j_43 - measureScope.mo6903toPx0680j_4(SwitchTokens.INSTANCE.m9943getTrackOutlineWidthD9Ej5fM());
        } else if (z8 && !this.checked) {
            fMo6903toPx0680j_42 = measureScope.mo6903toPx0680j_4(SwitchTokens.INSTANCE.m9943getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            fMo6903toPx0680j_42 = fMo6903toPx0680j_43;
        }
        Animatable<Float, AnimationVector1D> animatable2 = this.sizeAnim;
        if (!AbstractC5830k.m5324a(animatable2 != null ? animatable2.getTargetValue() : null, fMo6903toPx0680j_4)) {
            AbstractC6014x.m5651v(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, fMo6903toPx0680j_4, null), 3);
        }
        Animatable<Float, AnimationVector1D> animatable3 = this.offsetAnim;
        if (!AbstractC5830k.m5324a(animatable3 != null ? animatable3.getTargetValue() : null, fMo6903toPx0680j_42)) {
            AbstractC6014x.m5651v(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, fMo6903toPx0680j_42, null), 3);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = fMo6903toPx0680j_4;
            this.initialOffset = fMo6903toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, iFloatValue, iFloatValue, null, new InterfaceC6471c() { // from class: androidx.compose.material3.ThumbNode$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable placeable = placeableMo12033measureBRTryo0;
                Animatable animatable4 = this.offsetAnim;
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (int) (animatable4 != null ? ((Number) animatable4.getValue()).floatValue() : fMo6903toPx0680j_42), 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        AbstractC6014x.m5651v(getCoroutineScope(), null, null, new C18861(null), 3);
    }

    public final void setChecked(boolean z8) {
        this.checked = z8;
    }

    public final void setInteractionSource(@NotNull InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AnimatableKt.Animatable$default(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AnimatableKt.Animatable$default(this.initialOffset, 0.0f, 2, null);
    }
}
