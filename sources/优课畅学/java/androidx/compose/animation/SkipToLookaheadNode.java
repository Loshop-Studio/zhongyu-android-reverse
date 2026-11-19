package androidx.compose.animation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOriginKt;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.ScaleFactor;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private final MutableState isEnabled$delegate;
    private Constraints lookaheadConstraints;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private final MutableState scaleToBounds$delegate;

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC10559a interfaceC10559a) {
        this.scaleToBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(scaleToBoundsImpl, null, 2, null);
        this.isEnabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(interfaceC10559a, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ScaleToBoundsImpl getScaleToBounds() {
        return (ScaleToBoundsImpl) this.scaleToBounds$delegate.getValue();
    }

    public final InterfaceC10559a isEnabled() {
        return (InterfaceC10559a) this.isEnabled$delegate.getValue();
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.maxIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        if (measureScope.isLookingAhead()) {
            this.lookaheadConstraints = Constraints.m26839boximpl(j10);
        }
        Constraints constraints = this.lookaheadConstraints;
        AbstractC9133u.m16130d(constraints);
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(constraints.m26858unboximpl());
        long jM27065constructorimpl = IntSize.m27065constructorimpl((placeableMo25627measureBRTryo0.getWidth() << 32) | (placeableMo25627measureBRTryo0.getHeight() & 4294967295L));
        this.lookaheadSize = jM27065constructorimpl;
        final long jM26866constrain4WqzIAM = ConstraintsKt.m26866constrain4WqzIAM(j10, jM27065constructorimpl);
        return MeasureScope.layout$default(measureScope, (int) (jM26866constrain4WqzIAM >> 32), (int) (jM26866constrain4WqzIAM & 4294967295L), null, new InterfaceC10570l() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                final long jM25710constructorimpl;
                ScaleToBoundsImpl scaleToBounds = this.this$0.getScaleToBounds();
                if (!((Boolean) this.this$0.isEnabled().invoke()).booleanValue() || scaleToBounds == null) {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBounds.getContentScale();
                if (((int) (this.this$0.lookaheadSize >> 32)) == 0 || ((int) (this.this$0.lookaheadSize & 4294967295L)) == 0) {
                    jM25710constructorimpl = ScaleFactor.m25710constructorimpl((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                } else {
                    jM25710constructorimpl = contentScale.mo25620computeScaleFactorH7hwNQA(IntSizeKt.m27082toSizeozmzZPI(this.this$0.lookaheadSize), IntSizeKt.m27082toSizeozmzZPI(jM26866constrain4WqzIAM));
                }
                long jMo23844alignKFBX0sM = scaleToBounds.getAlignment().mo23844alignKFBX0sM(IntSize.m27065constructorimpl((AbstractC10729c.m20035d(((int) (this.this$0.lookaheadSize & 4294967295L)) * Float.intBitsToFloat((int) (jM25710constructorimpl & 4294967295L))) & 4294967295L) | (AbstractC10729c.m20035d(((int) (this.this$0.lookaheadSize >> 32)) * Float.intBitsToFloat((int) (jM25710constructorimpl >> 32))) << 32)), jM26866constrain4WqzIAM, measureScope.getLayoutDirection());
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo25627measureBRTryo0, IntOffset.m27027getXimpl(jMo23844alignKFBX0sM), IntOffset.m27028getYimpl(jMo23844alignKFBX0sM), 0.0f, new InterfaceC10570l() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((GraphicsLayerScope) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.setScaleX(Float.intBitsToFloat((int) (jM25710constructorimpl >> 32)));
                        graphicsLayerScope.setScaleY(Float.intBitsToFloat((int) (jM25710constructorimpl & 4294967295L)));
                        graphicsLayerScope.mo24468setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.0f, 0.0f));
                    }
                }, 4, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicHeight(i10) : (int) (this.lookaheadSize & 4294967295L);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return (intrinsicMeasureScope.isLookingAhead() || !AnimationModifierKt.m20171isValidozmzZPI(this.lookaheadSize)) ? intrinsicMeasurable.minIntrinsicWidth(i10) : (int) (this.lookaheadSize >> 32);
    }

    public final void setEnabled(InterfaceC10559a interfaceC10559a) {
        this.isEnabled$delegate.setValue(interfaceC10559a);
    }

    public final void setScaleToBounds(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds$delegate.setValue(scaleToBoundsImpl);
    }
}
