package androidx.compose.p006ui.node;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.AlignmentLine;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.layout.VerticalAlignmentLine;
import androidx.compose.p006ui.unit.AbstractC1702a;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H&J\u0011\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0086\u0002J\r\u0010-\u001a\u00020.H ¢\u0006\u0002\b/J\f\u00100\u001a\u00020.*\u000201H\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0016R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX \u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u001b\u0010$\u001a\u00020%X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m5175d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "()V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "isPlacingForAlignment", "isPlacingForAlignment$ui_release", "setPlacingForAlignment$ui_release", "(Z)V", "isShallowPlacing", "isShallowPlacing$ui_release", "setShallowPlacing$ui_release", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "parent", "getParent", "position", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "get", "replace", "", "replace$ui_release", "invalidateAlignmentLinesFromPositionChange", "Landroidx/compose/ui/node/NodeCoordinator;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode {
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    @Override // androidx.compose.p006ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m11643getXimpl(m10615getApparentToRealOffsetnOccac()) : IntOffset.m11644getYimpl(m10615getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.p006ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui_release();

    public abstract LookaheadCapablePlaceable getParent();

    /* renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long getPosition();

    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (!Intrinsics.areEqual(wrapped != null ? wrapped.getLayoutNode() : null, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    /* renamed from: isPlacingForAlignment$ui_release, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    /* renamed from: isShallowPlacing$ui_release, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    @Override // androidx.compose.p006ui.layout.MeasureScope
    public /* synthetic */ MeasureResult layout(int i4, int i5, Map map, Function1 function1) {
        return MeasureScope.CC.m619a(this, i4, i5, map, function1);
    }

    public abstract void replace$ui_release();

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo7199roundToPxR2X_6o(long j4) {
        return AbstractC1702a.m906a(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo7200roundToPx0680j_4(float f4) {
        return AbstractC1702a.m907b(this, f4);
    }

    public final void setPlacingForAlignment$ui_release(boolean z3) {
        this.isPlacingForAlignment = z3;
    }

    public final void setShallowPlacing$ui_release(boolean z3) {
        this.isShallowPlacing = z3;
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo7201toDpGaN1DYA(long j4) {
        return AbstractC1702a.m908c(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7202toDpu2uoSUM(float f4) {
        return AbstractC1702a.m909d(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo7204toDpSizekrfVVM(long j4) {
        return AbstractC1702a.m911f(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo7205toPxR2X_6o(long j4) {
        return AbstractC1702a.m912g(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo7206toPx0680j_4(float f4) {
        return AbstractC1702a.m913h(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC1702a.m914i(this, dpRect);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo7207toSizeXkaWNTQ(long j4) {
        return AbstractC1702a.m915j(this, j4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo7208toSp0xMU5do(float f4) {
        return AbstractC1702a.m916k(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7209toSpkPz2Gy4(float f4) {
        return AbstractC1702a.m917l(this, f4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo7203toDpu2uoSUM(int i4) {
        return AbstractC1702a.m910e(this, i4);
    }

    @Override // androidx.compose.p006ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo7210toSpkPz2Gy4(int i4) {
        return AbstractC1702a.m918m(this, i4);
    }
}
