package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.painter.Painter;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.ScaleFactorKt;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, AbstractC9972n abstractC9972n) {
        this(painter, z10, (i10 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i10 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m30493calculateScaledSizeE7KxVPU(long j10) {
        if (!getUseIntrinsicSize()) {
            return j10;
        }
        long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(!m30495hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo31549getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j10 >> 32)) : Float.intBitsToFloat((int) (this.painter.mo31549getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!m30494hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo31549getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.mo31549getIntrinsicSizeNHjbRc() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) ? Size.Companion.m30715getZeroNHjbRc() : ScaleFactorKt.m32333timesUQTWf7w(jM30697constructorimpl, this.contentScale.mo32222computeScaleFactorH7hwNQA(jM30697constructorimpl, j10));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo31549getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m30494hasSpecifiedAndFiniteHeightuvyYCjk(long j10) {
        return !Size.m30702equalsimpl0(j10, Size.Companion.m30714getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m30495hasSpecifiedAndFiniteWidthuvyYCjk(long j10) {
        return !Size.m30702equalsimpl0(j10, Size.Companion.m30714getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m30496modifyConstraintsZezNO4M(long j10) {
        boolean z10 = false;
        boolean z11 = Constraints.m33450getHasBoundedWidthimpl(j10) && Constraints.m33449getHasBoundedHeightimpl(j10);
        if (Constraints.m33452getHasFixedWidthimpl(j10) && Constraints.m33451getHasFixedHeightimpl(j10)) {
            z10 = true;
        }
        if ((!getUseIntrinsicSize() && z11) || z10) {
            return Constraints.m33444copyZbe2FdA$default(j10, Constraints.m33454getMaxWidthimpl(j10), 0, Constraints.m33453getMaxHeightimpl(j10), 0, 10, null);
        }
        long jMo31549getIntrinsicSizeNHjbRc = this.painter.mo31549getIntrinsicSizeNHjbRc();
        int iRound = m30495hasSpecifiedAndFiniteWidthuvyYCjk(jMo31549getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo31549getIntrinsicSizeNHjbRc >> 32))) : Constraints.m33456getMinWidthimpl(j10);
        int iRound2 = m30494hasSpecifiedAndFiniteHeightuvyYCjk(jMo31549getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo31549getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m33455getMinHeightimpl(j10);
        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j10, iRound);
        long jM30493calculateScaledSizeE7KxVPU = m30493calculateScaledSizeE7KxVPU(Size.m30697constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m33470constrainHeightK40F9xA(j10, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(iM33471constrainWidthK40F9xA) << 32)));
        return Constraints.m33444copyZbe2FdA$default(j10, ConstraintsKt.m33471constrainWidthK40F9xA(j10, Math.round(Float.intBitsToFloat((int) (jM30493calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m33470constrainHeightK40F9xA(j10, Math.round(Float.intBitsToFloat((int) (jM30493calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jMo31549getIntrinsicSizeNHjbRc = this.painter.mo31549getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = m30495hasSpecifiedAndFiniteWidthuvyYCjk(jMo31549getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo31549getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = m30494hasSpecifiedAndFiniteHeightuvyYCjk(jMo31549getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo31549getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() & 4294967295L));
        long jM30697constructorimpl = Size.m30697constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jM30715getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.Companion.m30715getZeroNHjbRc() : ScaleFactorKt.m32333timesUQTWf7w(jM30697constructorimpl, this.contentScale.mo32222computeScaleFactorH7hwNQA(jM30697constructorimpl, contentDrawScope.mo31429getSizeNHjbRc()));
        long jMo30446alignKFBX0sM = this.alignment.mo30446alignKFBX0sM(IntSize.m33667constructorimpl((Math.round(Float.intBitsToFloat((int) (jM30715getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jM30715getZeroNHjbRc >> 32))) << 32)), IntSize.m33667constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo31429getSizeNHjbRc() & 4294967295L))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float fM33629getXimpl = IntOffset.m33629getXimpl(jMo30446alignKFBX0sM);
        float fM33630getYimpl = IntOffset.m33630getYimpl(jMo30446alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM33629getXimpl, fM33630getYimpl);
        try {
            this.painter.m31555drawx_KDEd0(contentDrawScope, jM30715getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM33629getXimpl, -fM33630getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM33629getXimpl, -fM33630getYimpl);
            throw th;
        }
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i10);
        }
        long jM30496modifyConstraintsZezNO4M = m30496modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m33455getMinHeightimpl(jM30496modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i10);
        }
        long jM30496modifyConstraintsZezNO4M = m30496modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m33456getMinWidthimpl(jM30496modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(m30496modifyConstraintsZezNO4M(j10));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i10);
        }
        long jM30496modifyConstraintsZezNO4M = m30496modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m33455getMinHeightimpl(jM30496modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i10);
        }
        long jM30496modifyConstraintsZezNO4M = m30496modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m33456getMinWidthimpl(jM30496modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i10));
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z10) {
        this.sizeToIntrinsics = z10;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z10;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
    }
}
