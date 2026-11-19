package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\tJ\"\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\"\u0010'\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0096\u0002¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\u00020:8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b;\u00104R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020+0=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010F\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, m5110d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/geometry/Offset;", "relativeToScreen", "screenToLocal-MK-Hz9U", "(J)J", "screenToLocal", "relativeToLocal", "localToScreen-MK-Hz9U", "localToScreen", "relativeToWindow", "windowToLocal-MK-Hz9U", "windowToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Ld6/s;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "transformToScreen-58bKbWc", "([F)V", "transformToScreen", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadOffset-F1C5BW0", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "getIntroducesMotionFrameOfReference", "introducesMotionFrameOfReference", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,201:1\n1#2:202\n30#3:203\n80#4:204\n53#4,3:217\n53#4,3:222\n53#4,3:227\n56#5,5:205\n56#5,5:210\n159#6:215\n159#6:220\n159#6:225\n30#7:216\n30#7:221\n30#7:226\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n35#1:203\n35#1:204\n116#1:217,3\n135#1:222,3\n155#1:227,3\n42#1:205,5\n50#1:210,5\n116#1:215\n135#1:220\n155#1:225\n116#1:216\n135#1:221\n155#1:226\n*E\n"})
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;

    @NotNull
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(@NotNull LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m12060getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.INSTANCE;
        return Offset.m10445minusMKHz9U(mo12042localPositionOfR5De75A(coordinates, companion.m10457getZeroF1C5BW0()), getCoordinator().mo12042localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m10457getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public int get(@NotNull AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    @NotNull
    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }

    @NotNull
    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy = getCoordinator().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @Nullable
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy();
        if (wrappedBy == null || (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo12041getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m13471constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo12042localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return mo12043localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, true);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo12043localPositionOfS_NoaFU(@NotNull LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jMo12043localPositionOfS_NoaFU = mo12043localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = rootLookaheadDelegate.getPosition();
            float fM13433getXimpl = IntOffset.m13433getXimpl(position);
            float fM13434getYimpl = IntOffset.m13434getYimpl(position);
            long jM10445minusMKHz9U = Offset.m10445minusMKHz9U(jMo12043localPositionOfS_NoaFU, Offset.m10433constructorimpl((4294967295L & Float.floatToRawIntBits(fM13434getYimpl)) | (Float.floatToRawIntBits(fM13433getXimpl) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m10446plusMKHz9U(jM10445minusMKHz9U, parentCoordinates.mo12043localPositionOfS_NoaFU(sourceCoordinates, Offset.INSTANCE.m10457getZeroF1C5BW0(), includeMotionFrameOfReference));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) sourceCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM13436minusqkQi6aY = IntOffset.m13436minusqkQi6aY(IntOffset.m13437plusqkQi6aY(lookaheadDelegate.m12243positionIniSbpLlY$ui_release(lookaheadDelegate2, !includeMotionFrameOfReference), IntOffsetKt.m13450roundk4lQ0M(relativeToSource)), this.lookaheadDelegate.m12243positionIniSbpLlY$ui_release(lookaheadDelegate2, !includeMotionFrameOfReference));
            float fM13433getXimpl2 = IntOffset.m13433getXimpl(jM13436minusqkQi6aY);
            float fM13434getYimpl2 = IntOffset.m13434getYimpl(jM13436minusqkQi6aY);
            return Offset.m10433constructorimpl((Float.floatToRawIntBits(fM13433getXimpl2) << 32) | (Float.floatToRawIntBits(fM13434getYimpl2) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM13437plusqkQi6aY = IntOffset.m13437plusqkQi6aY(IntOffset.m13437plusqkQi6aY(lookaheadDelegate.m12243positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !includeMotionFrameOfReference), rootLookaheadDelegate2.getPosition()), IntOffsetKt.m13450roundk4lQ0M(relativeToSource));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jM13436minusqkQi6aY2 = IntOffset.m13436minusqkQi6aY(jM13437plusqkQi6aY, IntOffset.m13437plusqkQi6aY(this.lookaheadDelegate.m12243positionIniSbpLlY$ui_release(rootLookaheadDelegate3, !includeMotionFrameOfReference), rootLookaheadDelegate3.getPosition()));
        float fM13433getXimpl3 = IntOffset.m13433getXimpl(jM13436minusqkQi6aY2);
        float fM13434getYimpl3 = IntOffset.m13434getYimpl(jM13436minusqkQi6aY2);
        long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(fM13434getYimpl3) & 4294967295L) | (Float.floatToRawIntBits(fM13433getXimpl3) << 32));
        NodeCoordinator wrappedBy = rootLookaheadDelegate3.getCoordinator().getWrappedBy();
        AbstractC5830k.m5327d(wrappedBy);
        NodeCoordinator wrappedBy2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy();
        AbstractC5830k.m5327d(wrappedBy2);
        return wrappedBy.mo12043localPositionOfS_NoaFU(wrappedBy2, jM10433constructorimpl, includeMotionFrameOfReference);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo12044localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo12044localToRootMKHz9U(Offset.m10446plusMKHz9U(relativeToLocal, m12060getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo12045localToScreenMKHz9U(long relativeToLocal) {
        return getCoordinator().mo12045localToScreenMKHz9U(Offset.m10446plusMKHz9U(relativeToLocal, m12060getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo12046localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo12046localToWindowMKHz9U(Offset.m10446plusMKHz9U(relativeToLocal, m12060getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo12047screenToLocalMKHz9U(long relativeToScreen) {
        return Offset.m10446plusMKHz9U(getCoordinator().mo12047screenToLocalMKHz9U(relativeToScreen), m12060getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo12048transformFromEL8BTi8(@NotNull LayoutCoordinates sourceCoordinates, @NotNull float[] matrix) {
        getCoordinator().mo12048transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo12049transformToScreen58bKbWc(@NotNull float[] matrix) {
        getCoordinator().mo12049transformToScreen58bKbWc(matrix);
    }

    @Override // androidx.compose.p011ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo12050windowToLocalMKHz9U(long relativeToWindow) {
        return Offset.m10446plusMKHz9U(getCoordinator().mo12050windowToLocalMKHz9U(relativeToWindow), m12060getLookaheadOffsetF1C5BW0());
    }
}
