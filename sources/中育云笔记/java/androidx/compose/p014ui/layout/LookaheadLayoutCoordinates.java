package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.LookaheadDelegate;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m32256getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m30641minusMKHz9U(mo32238localPositionOfR5De75A(coordinates, companion.m30653getZeroF1C5BW0()), getCoordinator().mo32238localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m30653getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        LookaheadDelegate lookaheadDelegate;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(NodeCoordinator.ExpectAttachedLayoutCoordinates);
        }
        NodeCoordinator wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo32237getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m33667constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z10) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z10);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo32238localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j10) {
        return mo32239localPositionOfS_NoaFU(layoutCoordinates, j10, true);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo32239localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j10, boolean z10) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jMo32239localPositionOfS_NoaFU = mo32239localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j10, z10);
            long jMo32431getPositionnOccac = rootLookaheadDelegate.mo32431getPositionnOccac();
            float fM33629getXimpl = IntOffset.m33629getXimpl(jMo32431getPositionnOccac);
            float fM33630getYimpl = IntOffset.m33630getYimpl(jMo32431getPositionnOccac);
            long jM30641minusMKHz9U = Offset.m30641minusMKHz9U(jMo32239localPositionOfS_NoaFU, Offset.m30629constructorimpl((4294967295L & Float.floatToRawIntBits(fM33630getYimpl)) | (Float.floatToRawIntBits(fM33629getXimpl) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m30642plusMKHz9U(jM30641minusMKHz9U, parentCoordinates.mo32239localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m30653getZeroF1C5BW0(), z10));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM33632minusqkQi6aY = IntOffset.m33632minusqkQi6aY(IntOffset.m33633plusqkQi6aY(lookaheadDelegate.m32439positionIniSbpLlY$ui_release(lookaheadDelegate2, !z10), IntOffsetKt.m33646roundk4lQ0M(j10)), this.lookaheadDelegate.m32439positionIniSbpLlY$ui_release(lookaheadDelegate2, !z10));
            float fM33629getXimpl2 = IntOffset.m33629getXimpl(jM33632minusqkQi6aY);
            float fM33630getYimpl2 = IntOffset.m33630getYimpl(jM33632minusqkQi6aY);
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl2) << 32) | (Float.floatToRawIntBits(fM33630getYimpl2) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM33633plusqkQi6aY = IntOffset.m33633plusqkQi6aY(IntOffset.m33633plusqkQi6aY(lookaheadDelegate.m32439positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !z10), rootLookaheadDelegate2.mo32431getPositionnOccac()), IntOffsetKt.m33646roundk4lQ0M(j10));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jM33632minusqkQi6aY2 = IntOffset.m33632minusqkQi6aY(jM33633plusqkQi6aY, IntOffset.m33633plusqkQi6aY(this.lookaheadDelegate.m32439positionIniSbpLlY$ui_release(rootLookaheadDelegate3, !z10), rootLookaheadDelegate3.mo32431getPositionnOccac()));
        float fM33629getXimpl3 = IntOffset.m33629getXimpl(jM33632minusqkQi6aY2);
        float fM33630getYimpl3 = IntOffset.m33630getYimpl(jM33632minusqkQi6aY2);
        long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33630getYimpl3) & 4294967295L) | (Float.floatToRawIntBits(fM33629getXimpl3) << 32));
        NodeCoordinator wrappedBy$ui_release = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui_release();
        AbstractC9979u.m20291d(wrappedBy$ui_release);
        NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui_release();
        AbstractC9979u.m20291d(wrappedBy$ui_release2);
        return wrappedBy$ui_release.mo32239localPositionOfS_NoaFU(wrappedBy$ui_release2, jM30629constructorimpl, z10);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo32240localToRootMKHz9U(long j10) {
        return getCoordinator().mo32240localToRootMKHz9U(Offset.m30642plusMKHz9U(j10, m32256getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo32241localToScreenMKHz9U(long j10) {
        return getCoordinator().mo32241localToScreenMKHz9U(Offset.m30642plusMKHz9U(j10, m32256getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo32242localToWindowMKHz9U(long j10) {
        return getCoordinator().mo32242localToWindowMKHz9U(Offset.m30642plusMKHz9U(j10, m32256getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo32243screenToLocalMKHz9U(long j10) {
        return Offset.m30642plusMKHz9U(getCoordinator().mo32243screenToLocalMKHz9U(j10), m32256getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo32244transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo32244transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo32245transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo32245transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo32246windowToLocalMKHz9U(long j10) {
        return Offset.m30642plusMKHz9U(getCoordinator().mo32246windowToLocalMKHz9U(j10), m32256getLookaheadOffsetF1C5BW0());
    }
}
