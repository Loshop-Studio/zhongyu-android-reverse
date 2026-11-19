package androidx.compose.animation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOriginKt;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.ScaleFactor;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private final MutableState isEnabled$delegate;
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private final MutableState scaleToBounds$delegate;

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC9529a interfaceC9529a) {
        this.scaleToBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC9529a, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds$delegate.getValue();
    }

    public final InterfaceC9529a isEnabled() {
        return (InterfaceC9529a) this.isEnabled$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m26773isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m26773isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m33441boximpl(j10);
        }
        Constraints constraints = this.lookaheadConstraints;
        AbstractC9979u.m20291d(constraints);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(constraints.m33460unboximpl());
        long jM33667constructorimpl = IntSize.m33667constructorimpl((placeableMo32229measureBRTryo0.getWidth() << 32) | (placeableMo32229measureBRTryo0.getHeight() & 4294967295L));
        this.lookaheadSize = jM33667constructorimpl;
        final long jM33468constrain4WqzIAM = ConstraintsKt.m33468constrain4WqzIAM(j10, jM33667constructorimpl);
        return MeasureScope.layout$default(measureScope, (int) (jM33468constrain4WqzIAM >> 32), (int) (jM33468constrain4WqzIAM & 4294967295L), null, new InterfaceC9540l() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                final long jM32312constructorimpl;
                ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
                if (!((Boolean) this.this$0.isEnabled().invoke()).booleanValue() || scaleToBounds == null) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBounds.getContentScale();
                if (((int) (this.this$0.lookaheadSize >> 32)) == 0 || ((int) (this.this$0.lookaheadSize & 4294967295L)) == 0) {
                    jM32312constructorimpl = ScaleFactor.m32312constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                } else {
                    jM32312constructorimpl = contentScale.mo32222computeScaleFactorH7hwNQA(IntSizeKt.m33684toSizeozmzZPI(this.this$0.lookaheadSize), IntSizeKt.m33684toSizeozmzZPI(jM33468constrain4WqzIAM));
                }
                long jMo30446alignKFBX0sM = scaleToBounds.getAlignment().mo30446alignKFBX0sM(IntSize.m33667constructorimpl((AbstractC9719c.m19282d(((int) (this.this$0.lookaheadSize & 4294967295L)) * Float.intBitsToFloat((int) (jM32312constructorimpl & 4294967295L))) & 4294967295L) | (AbstractC9719c.m19282d(((int) (this.this$0.lookaheadSize >> 32)) * Float.intBitsToFloat((int) (jM32312constructorimpl >> 32))) << 32)), jM33468constrain4WqzIAM, measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, IntOffset.m33629getXimpl(jMo30446alignKFBX0sM), IntOffset.m33630getYimpl(jMo30446alignKFBX0sM), 0.0f, new InterfaceC9540l() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((GraphicsLayerScope) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (jM32312constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (jM32312constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo31070setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }
                }, 4, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m26773isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m26773isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(InterfaceC9529a interfaceC9529a) {
        this.isEnabled$delegate.setValue(interfaceC9529a);
    }

    public final void setScaleToBounds(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds$delegate.setValue(scaleToBoundsImpl);
    }
}
