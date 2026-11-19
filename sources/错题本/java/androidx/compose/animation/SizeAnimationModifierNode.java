package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001DB[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u001f\u001a\u00020\u001c*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0013R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,RT\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R*\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00108\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00103\"\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R/\u0010C\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, m5110d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "animationSpec", "Landroidx/compose/ui/Alignment;", "alignment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startSize", "endSize", "Ld6/s;", "listener", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Alignment;Lr6/e;)V", "Landroidx/compose/ui/unit/Constraints;", "default", "targetConstraints-ZezNO4M", "(J)J", "targetConstraints", "onReset", "()V", "onAttach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "targetSize", "animateTo-mzRDjE0", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Lr6/e;", "getListener", "()Lr6/e;", "setListener", "(Lr6/e;)V", "lookaheadSize", "J", "value", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "", "lookaheadConstraintsAvailable", "Z", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "<set-?>", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData", "AnimData", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,269:1\n85#2:270\n113#2,2:271\n30#3:273\n30#3:281\n80#4:274\n85#4:277\n90#4:280\n80#4:282\n61#5:275\n54#5:276\n63#5:278\n59#5:279\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n168#1:270\n168#1:271,2\n196#1:273\n238#1:281\n196#1:274\n198#1:277\n197#1:280\n238#1:282\n198#1:275\n198#1:276\n197#1:278\n197#1:279\n*E\n"})
/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @NotNull
    private Alignment alignment;

    /* renamed from: animData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animData;

    @NotNull
    private AnimationSpec<IntSize> animationSpec;

    @Nullable
    private InterfaceC6473e listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\nR(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, m5110d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/e;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2-YbymL2g", "()J", "component2", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/core/Animatable;", "getAnim", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class AnimData {
        public static final int $stable = 8;

        @NotNull
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j7, AbstractC5824e abstractC5824e) {
            this(animatable, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m6631copyO0kMr_c$default(AnimData animData, Animatable animatable, long j7, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i & 2) != 0) {
                j7 = animData.startSize;
            }
            return animData.m6633copyO0kMr_c(animatable, j7);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        @NotNull
        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m6633copyO0kMr_c(@NotNull Animatable<IntSize, AnimationVector2D> anim, long startSize) {
            return new AnimData(anim, startSize, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return AbstractC5830k.m5325b(this.anim, animData.anim) && IntSize.m13474equalsimpl0(this.startSize, animData.startSize);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m6634getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return IntSize.m13477hashCodeimpl(this.startSize) + (this.anim.hashCode() * 31);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m6635setStartSizeozmzZPI(long j7) {
            this.startSize = j7;
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m13479toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j7) {
            this.anim = animatable;
            this.startSize = j7;
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, InterfaceC6473e interfaceC6473e, int i, AbstractC5824e abstractC5824e) {
        this(animationSpec, (i & 2) != 0 ? Alignment.INSTANCE.getTopStart() : alignment, (i & 4) != 0 ? null : interfaceC6473e);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m6628setLookaheadConstraintsBRTryo0(long j7) {
        this.lookaheadConstraints = j7;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m6629targetConstraintsZezNO4M(long j7) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j7;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m6630animateTomzRDjE0(long targetSize) {
        AnimData animData = getAnimData();
        AbstractC5824e abstractC5824e = null;
        if (animData != null) {
            boolean z8 = (IntSize.m13474equalsimpl0(targetSize, animData.getAnim().getValue().m13480unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m13474equalsimpl0(targetSize, animData.getAnim().getTargetValue().m13480unboximpl()) || z8) {
                animData.m6635setStartSizeozmzZPI(animData.getAnim().getValue().m13480unboximpl());
                AbstractC6014x.m5651v(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, targetSize, this, null), 3);
            }
        } else {
            long j7 = 1;
            animData = new AnimData(new Animatable(IntSize.m13468boximpl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m13468boximpl(IntSize.m13471constructorimpl((j7 & 4294967295L) | (j7 << 32))), null, 8, null), targetSize, abstractC5824e);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m13480unboximpl();
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final AnimData getAnimData() {
        return (AnimData) this.animData.getValue();
    }

    @NotNull
    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    @Nullable
    public final InterfaceC6473e getListener() {
        return this.listener;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull final MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        Placeable placeableMo12033measureBRTryo0;
        long jM13272constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m6628setLookaheadConstraintsBRTryo0(j7);
            placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(j7);
        } else {
            placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(m6629targetConstraintsZezNO4M(j7));
        }
        final Placeable placeable = placeableMo12033measureBRTryo0;
        final long jM13471constructorimpl = IntSize.m13471constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = jM13471constructorimpl;
            jM13272constrain4WqzIAM = jM13471constructorimpl;
        } else {
            jM13272constrain4WqzIAM = ConstraintsKt.m13272constrain4WqzIAM(j7, m6630animateTomzRDjE0(AnimationModifierKt.m6577isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jM13471constructorimpl));
        }
        final int i = (int) (jM13272constrain4WqzIAM >> 32);
        final int i8 = (int) (jM13272constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i, i8, null, new InterfaceC6471c() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeable, this.this$0.getAlignment().mo10250alignKFBX0sM(jM13471constructorimpl, IntSize.m13471constructorimpl((i << 32) | (i8 & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        setAnimData(null);
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAnimData(@Nullable AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void setAnimationSpec(@NotNull AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(@Nullable InterfaceC6473e interfaceC6473e) {
        this.listener = interfaceC6473e;
    }

    public SizeAnimationModifierNode(@NotNull AnimationSpec<IntSize> animationSpec, @NotNull Alignment alignment, @Nullable InterfaceC6473e interfaceC6473e) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = interfaceC6473e;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
