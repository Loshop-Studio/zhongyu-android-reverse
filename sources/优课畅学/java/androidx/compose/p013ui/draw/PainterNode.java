package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.ScaleFactorKt;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z10, Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, int i10, AbstractC9126n abstractC9126n) {
        this(painter, z10, (i10 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i10 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m23891calculateScaledSizeE7KxVPU(long j10) {
        if (!getUseIntrinsicSize()) {
            return j10;
        }
        long jM24095constructorimpl = Size.m24095constructorimpl((Float.floatToRawIntBits(!m23893hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo24947getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j10 >> 32)) : Float.intBitsToFloat((int) (this.painter.mo24947getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!m23892hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo24947getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.mo24947getIntrinsicSizeNHjbRc() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) ? Size.Companion.m24113getZeroNHjbRc() : ScaleFactorKt.m25731timesUQTWf7w(jM24095constructorimpl, this.contentScale.mo25620computeScaleFactorH7hwNQA(jM24095constructorimpl, j10));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo24947getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m23892hasSpecifiedAndFiniteHeightuvyYCjk(long j10) {
        return !Size.m24100equalsimpl0(j10, Size.Companion.m24112getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m23893hasSpecifiedAndFiniteWidthuvyYCjk(long j10) {
        return !Size.m24100equalsimpl0(j10, Size.Companion.m24112getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m23894modifyConstraintsZezNO4M(long j10) {
        boolean z10 = false;
        boolean z11 = Constraints.m26848getHasBoundedWidthimpl(j10) && Constraints.m26847getHasBoundedHeightimpl(j10);
        if (Constraints.m26850getHasFixedWidthimpl(j10) && Constraints.m26849getHasFixedHeightimpl(j10)) {
            z10 = true;
        }
        if ((!getUseIntrinsicSize() && z11) || z10) {
            return Constraints.m26842copyZbe2FdA$default(j10, Constraints.m26852getMaxWidthimpl(j10), 0, Constraints.m26851getMaxHeightimpl(j10), 0, 10, null);
        }
        long jMo24947getIntrinsicSizeNHjbRc = this.painter.mo24947getIntrinsicSizeNHjbRc();
        int iRound = m23893hasSpecifiedAndFiniteWidthuvyYCjk(jMo24947getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo24947getIntrinsicSizeNHjbRc >> 32))) : Constraints.m26854getMinWidthimpl(j10);
        int iRound2 = m23892hasSpecifiedAndFiniteHeightuvyYCjk(jMo24947getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo24947getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m26853getMinHeightimpl(j10);
        int iM26869constrainWidthK40F9xA = ConstraintsKt.m26869constrainWidthK40F9xA(j10, iRound);
        long jM23891calculateScaledSizeE7KxVPU = m23891calculateScaledSizeE7KxVPU(Size.m24095constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m26868constrainHeightK40F9xA(j10, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(iM26869constrainWidthK40F9xA) << 32)));
        return Constraints.m26842copyZbe2FdA$default(j10, ConstraintsKt.m26869constrainWidthK40F9xA(j10, Math.round(Float.intBitsToFloat((int) (jM23891calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m26868constrainHeightK40F9xA(j10, Math.round(Float.intBitsToFloat((int) (jM23891calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jMo24947getIntrinsicSizeNHjbRc = this.painter.mo24947getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = m23893hasSpecifiedAndFiniteWidthuvyYCjk(jMo24947getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo24947getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = m23892hasSpecifiedAndFiniteHeightuvyYCjk(jMo24947getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo24947getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() & 4294967295L));
        long jM24095constructorimpl = Size.m24095constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jM24113getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.Companion.m24113getZeroNHjbRc() : ScaleFactorKt.m25731timesUQTWf7w(jM24095constructorimpl, this.contentScale.mo25620computeScaleFactorH7hwNQA(jM24095constructorimpl, contentDrawScope.mo24827getSizeNHjbRc()));
        long jMo23844alignKFBX0sM = this.alignment.mo23844alignKFBX0sM(IntSize.m27065constructorimpl((Math.round(Float.intBitsToFloat((int) (jM24113getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jM24113getZeroNHjbRc >> 32))) << 32)), IntSize.m27065constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo24827getSizeNHjbRc() & 4294967295L))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float fM27027getXimpl = IntOffset.m27027getXimpl(jMo23844alignKFBX0sM);
        float fM27028getYimpl = IntOffset.m27028getYimpl(jMo23844alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM27027getXimpl, fM27028getYimpl);
        try {
            this.painter.m24953drawx_KDEd0(contentDrawScope, jM24113getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM27027getXimpl, -fM27028getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM27027getXimpl, -fM27028getYimpl);
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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i10);
        }
        long jM23894modifyConstraintsZezNO4M = m23894modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m26853getMinHeightimpl(jM23894modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i10);
        }
        long jM23894modifyConstraintsZezNO4M = m23894modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m26854getMinWidthimpl(jM23894modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(m23894modifyConstraintsZezNO4M(j10));
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i10);
        }
        long jM23894modifyConstraintsZezNO4M = m23894modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(Constraints.m26853getMinHeightimpl(jM23894modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i10));
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i10);
        }
        long jM23894modifyConstraintsZezNO4M = m23894modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(Constraints.m26854getMinWidthimpl(jM23894modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i10));
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
