package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.node.LookaheadDelegate;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0096\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0016J%\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010/J%\u00102\u001a\u0002032\u0006\u0010\"\u001a\u00020\u000f2\u0006\u00104\u001a\u000205H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010/R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m5175d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isAttached", "", "()Z", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "parentCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "localLookaheadPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;J)J", "localPositionOf", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToWindow", "localToWindow-MK-Hz9U", "transformFrom", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,120:1\n179#2:121\n157#2:124\n179#2:126\n157#2:129\n86#3:122\n79#3:123\n86#3:125\n86#3:127\n79#3:128\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl\n*L\n63#1:121\n64#1:124\n69#1:126\n75#1:129\n63#1:122\n63#1:123\n68#1:125\n71#1:127\n68#1:128\n*E\n"})
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinatesImpl(LookaheadDelegate lookaheadDelegate) {
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return getCoordinator().get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        return getCoordinator().getParentCoordinates();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        return getCoordinator().getParentLayoutCoordinates();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo10589getSizeYbymL2g() {
        return getCoordinator().mo10589getSizeYbymL2g();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.p006ui.layout.LookaheadLayoutCoordinates
    /* renamed from: localLookaheadPositionOf-R5De75A */
    public long mo10598localLookaheadPositionOfR5De75A(LookaheadLayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinatesImpl) sourceCoordinates).lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM10725positionInBjo55l4$ui_release = lookaheadDelegate.m10725positionInBjo55l4$ui_release(lookaheadDelegate2);
            long jIntOffset = IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m8945getXimpl(relativeToSource)), MathKt__MathJVMKt.roundToInt(Offset.m8946getYimpl(relativeToSource)));
            long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM10725positionInBjo55l4$ui_release) + IntOffset.m11643getXimpl(jIntOffset), IntOffset.m11644getYimpl(jM10725positionInBjo55l4$ui_release) + IntOffset.m11644getYimpl(jIntOffset));
            long jM10725positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m10725positionInBjo55l4$ui_release(lookaheadDelegate2);
            long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset2) - IntOffset.m11643getXimpl(jM10725positionInBjo55l4$ui_release2), IntOffset.m11644getYimpl(jIntOffset2) - IntOffset.m11644getYimpl(jM10725positionInBjo55l4$ui_release2));
            return OffsetKt.Offset(IntOffset.m11643getXimpl(jIntOffset3), IntOffset.m11644getYimpl(jIntOffset3));
        }
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM10725positionInBjo55l4$ui_release3 = lookaheadDelegate.m10725positionInBjo55l4$ui_release(rootLookaheadDelegate);
        long position = rootLookaheadDelegate.getPosition();
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM10725positionInBjo55l4$ui_release3) + IntOffset.m11643getXimpl(position), IntOffset.m11644getYimpl(jM10725positionInBjo55l4$ui_release3) + IntOffset.m11644getYimpl(position));
        long jIntOffset5 = IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(Offset.m8945getXimpl(relativeToSource)), MathKt__MathJVMKt.roundToInt(Offset.m8946getYimpl(relativeToSource)));
        long jIntOffset6 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset4) + IntOffset.m11643getXimpl(jIntOffset5), IntOffset.m11644getYimpl(jIntOffset4) + IntOffset.m11644getYimpl(jIntOffset5));
        LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
        long jM10725positionInBjo55l4$ui_release4 = lookaheadDelegate3.m10725positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
        long position2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).getPosition();
        long jIntOffset7 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM10725positionInBjo55l4$ui_release4) + IntOffset.m11643getXimpl(position2), IntOffset.m11644getYimpl(jM10725positionInBjo55l4$ui_release4) + IntOffset.m11644getYimpl(position2));
        long jIntOffset8 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset6) - IntOffset.m11643getXimpl(jIntOffset7), IntOffset.m11644getYimpl(jIntOffset6) - IntOffset.m11644getYimpl(jIntOffset7));
        NodeCoordinator wrappedBy = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy);
        NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
        Intrinsics.checkNotNull(wrappedBy2);
        return wrappedBy.mo10590localPositionOfR5De75A(wrappedBy2, OffsetKt.Offset(IntOffset.m11643getXimpl(jIntOffset8), IntOffset.m11644getYimpl(jIntOffset8)));
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo10590localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().mo10590localPositionOfR5De75A(sourceCoordinates, relativeToSource);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo10591localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo10591localToRootMKHz9U(relativeToLocal);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo10592localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo10592localToWindowMKHz9U(relativeToLocal);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo10593transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        getCoordinator().mo10593transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.p006ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo10594windowToLocalMKHz9U(long relativeToWindow) {
        return getCoordinator().mo10594windowToLocalMKHz9U(relativeToWindow);
    }
}
