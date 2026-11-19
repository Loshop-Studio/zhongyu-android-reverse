package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment alignment;
    private final MutableState animData$delegate;
    private AnimationSpec<IntSize> animationSpec;
    private InterfaceC10574p listener;
    private long lookaheadConstraints;
    private boolean lookaheadConstraintsAvailable;
    private long lookaheadSize;

    @StabilityInferred(parameters = 0)
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j10, AbstractC9126n abstractC9126n) {
            this(animatable, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m20225copyO0kMr_c$default(AnimData animData, Animatable animatable, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i10 & 2) != 0) {
                j10 = animData.startSize;
            }
            return animData.m20227copyO0kMr_c(animatable, j10);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m20226component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m20227copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j10) {
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
            return AbstractC9133u.m16128b(this.anim, animData.anim) && IntSize.m27068equalsimpl0(this.startSize, animData.startSize);
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m20228getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m27071hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m20229setStartSizeozmzZPI(long j10) {
            this.startSize = j10;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m27073toStringimpl(this.startSize)) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j10) {
            this.anim = animatable;
            this.startSize = j10;
        }
    }

    public /* synthetic */ SizeAnimationModifierNode(AnimationSpec animationSpec, Alignment alignment, InterfaceC10574p interfaceC10574p, int i10, AbstractC9126n abstractC9126n) {
        this(animationSpec, (i10 & 2) != 0 ? Alignment.Companion.getTopStart() : alignment, (i10 & 4) != 0 ? null : interfaceC10574p);
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m20222setLookaheadConstraintsBRTryo0(long j10) {
        this.lookaheadConstraints = j10;
        this.lookaheadConstraintsAvailable = true;
    }

    /* renamed from: targetConstraints-ZezNO4M, reason: not valid java name */
    private final long m20223targetConstraintsZezNO4M(long j10) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j10;
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m20224animateTomzRDjE0(long j10) {
        AnimData animData = getAnimData();
        if (animData != null) {
            boolean z10 = (IntSize.m27068equalsimpl0(j10, animData.getAnim().getValue().m27074unboximpl()) || animData.getAnim().isRunning()) ? false : true;
            if (!IntSize.m27068equalsimpl0(j10, animData.getAnim().getTargetValue().m27074unboximpl()) || z10) {
                animData.m20229setStartSizeozmzZPI(animData.getAnim().getValue().m27074unboximpl());
                AbstractC8839h.m14861d(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(animData, j10, this, null), 3, null);
            }
        } else {
            long j11 = 1;
            animData = new AnimData(new Animatable(IntSize.m27062boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m27062boximpl(IntSize.m27065constructorimpl((j11 & 4294967295L) | (j11 << 32))), null, 8, null), j10, null);
        }
        setAnimData(animData);
        return animData.getAnim().getValue().m27074unboximpl();
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

    public final InterfaceC10574p getListener() {
        return this.listener;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        Placeable placeableMo25627measureBRTryo0;
        long jM26866constrain4WqzIAM;
        if (measureScope.isLookingAhead()) {
            m20222setLookaheadConstraintsBRTryo0(j10);
            placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        } else {
            placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(m20223targetConstraintsZezNO4M(j10));
        }
        final Placeable placeable = placeableMo25627measureBRTryo0;
        final long jM27065constructorimpl = IntSize.m27065constructorimpl((placeable.getWidth() << 32) | (placeable.getHeight() & 4294967295L));
        if (measureScope.isLookingAhead()) {
            this.lookaheadSize = jM27065constructorimpl;
            jM26866constrain4WqzIAM = jM27065constructorimpl;
        } else {
            jM26866constrain4WqzIAM = ConstraintsKt.m26866constrain4WqzIAM(j10, m20224animateTomzRDjE0(AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : jM27065constructorimpl));
        }
        final int i10 = (int) (jM26866constrain4WqzIAM >> 32);
        final int i11 = (int) (jM26866constrain4WqzIAM & 4294967295L);
        return MeasureScope.layout$default(measureScope, i10, i11, null, new InterfaceC10570l() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m25691place70tqf50$default(placementScope, placeable, this.this$0.getAlignment().mo23844alignKFBX0sM(jM27065constructorimpl, IntSize.m27065constructorimpl((i10 << 32) | (i11 & 4294967295L)), measureScope.getLayoutDirection()), 0.0f, 2, null);
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

    public final void setListener(InterfaceC10574p interfaceC10574p) {
        this.listener = interfaceC10574p;
    }

    public SizeAnimationModifierNode(AnimationSpec<IntSize> animationSpec, Alignment alignment, InterfaceC10574p interfaceC10574p) {
        this.animationSpec = animationSpec;
        this.alignment = alignment;
        this.listener = interfaceC10574p;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
        this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.animData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }
}
