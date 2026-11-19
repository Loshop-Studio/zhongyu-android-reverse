package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import sd.AbstractC11117h;

/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private InterfaceC9544p listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    @StabilityInferred(parameters = 0)
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j10, AbstractC9972n abstractC9972n) {
            this(animatable, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m26827copyO0kMr_c$default(AnimData animData, Animatable animatable, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i10 & 2) != 0) {
                j10 = animData.startSize;
            }
            return animData.m26829copyO0kMr_c(animatable, j10);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m26828component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m26829copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j10) {
            return new AnimData(animatable, j10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return AbstractC9979u.m20289b(this.anim, animData.anim) && IntSize.m33670equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m26830getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m33673hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m26831setStartSizeozmzZPI(long j10) {
            this.startSize = j10;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m33675toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j10) {
            this.anim = animatable;
            this.startSize = j10;
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p, int i10, AbstractC9972n abstractC9972n) {
        this(animationSpec, (i10 & 2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i10 & 4) != 0 ? null : interfaceC9544p);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m26824setLookaheadConstraintsBRTryo0(long j10) {
        this.lookaheadConstraints = j10;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m26825targetConstraintsZezNO4M(long j10) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j10;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m26826animateTomzRDjE0(long j10) {
        AnimData animData = getAnimData();
        if (animData != null) {
            boolean z10 = (IntSize.m33670equalsimpl0(j10, animData.getAnim().getValue().m33676unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m33670equalsimpl0(j10, animData.getAnim().getTargetValue().m33676unboximpl()) || z10) {
                animData.m26831setStartSizeozmzZPI(animData.getAnim().getValue().m33676unboximpl());
                AbstractC11117h.m24726d(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j10, this, null), 3, null);
            }
        } else {
            long j11 = 1;
            animData = new AnimData(new Animatable(IntSize.m33664boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m33664boximpl(IntSize.m33667constructorimpl((j11 & 4294967295L) | (j11 << 32))), null, 8, null), j10, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m33676unboximpl();
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData getAnimData() {
        return (AnimData) this.animData$delegate.getValue();
    }

    public final AnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final InterfaceC9544p getListener() {
        return this.listener;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        Placeable placeableMo32229measureBRTryo0;
        long jM33468constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m26824setLookaheadConstraintsBRTryo0(j10);
            placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        } else {
            placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(m26825targetConstraintsZezNO4M(j10));
        }
        final Placeable placeable = placeableMo32229measureBRTryo0;
        final long jM33667constructorimpl = IntSize.m33667constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = jM33667constructorimpl;
            jM33468constrain4WqzIAM = jM33667constructorimpl;
        } else {
            jM33468constrain4WqzIAM = ConstraintsKt.m33468constrain4WqzIAM(j10, m26826animateTomzRDjE0(AnimationModifierKt.m26773isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jM33667constructorimpl));
        }
        final int i10 = (int) (jM33468constrain4WqzIAM >> 32);
        final int i11 = (int) (jM33468constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i10, i11, null, new InterfaceC9540l() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m32293place70tqf50$default(placementScope, placeable, this.this$0.getAlignment().mo30446alignKFBX0sM(jM33667constructorimpl, IntSize.m33667constructorimpl((i10 << 32) | (i11 & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
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

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAnimData(AnimData animData) {
        this.animData$delegate.setValue(animData);
    }

    public final void setAnimationSpec(AnimationSpec<IntSize> animationSpec) {
        this.animationSpec = animationSpec;
    }

    public final void setListener(InterfaceC9544p interfaceC9544p) {
        this.listener = interfaceC9544p;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, InterfaceC9544p interfaceC9544p) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = interfaceC9544p;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
