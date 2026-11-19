package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.LookaheadDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LookaheadLayoutCoordinates implements LayoutCoordinates {
    public static final int $stable = 0;
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinates(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m25654getLookaheadOffsetF1C5BW0() {
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        LayoutCoordinates coordinates = rootLookaheadDelegate.getCoordinates();
        Offset.Companion companion = Offset.Companion;
        return Offset.m24039minusMKHz9U(mo25636localPositionOfR5De75A(coordinates, companion.m24051getZeroF1C5BW0()), getCoordinator().mo25636localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), companion.m24051getZeroF1C5BW0()));
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        return this.lookaheadDelegate.get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return this.lookaheadDelegate.isPlacedUnderMotionFrameOfReference();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
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

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
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

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public long mo25635getSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.lookaheadDelegate;
        return IntSize.m27065constructorimpl((lookaheadDelegate.getWidth() << 32) | (lookaheadDelegate.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z10) {
        return getCoordinator().localBoundingBoxOf(layoutCoordinates, z10);
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo25636localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j10) {
        return mo25637localPositionOfS_NoaFU(layoutCoordinates, j10, true);
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo25637localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j10, boolean z10) {
        if (!(layoutCoordinates instanceof LookaheadLayoutCoordinates)) {
            LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
            long jMo25637localPositionOfS_NoaFU = mo25637localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j10, z10);
            long jMo25829getPositionnOccac = rootLookaheadDelegate.mo25829getPositionnOccac();
            float fM27027getXimpl = IntOffset.m27027getXimpl(jMo25829getPositionnOccac);
            float fM27028getYimpl = IntOffset.m27028getYimpl(jMo25829getPositionnOccac);
            long jM24039minusMKHz9U = Offset.m24039minusMKHz9U(jMo25637localPositionOfS_NoaFU, Offset.m24027constructorimpl((4294967295L & Float.floatToRawIntBits(fM27028getYimpl)) | (Float.floatToRawIntBits(fM27027getXimpl) << 32)));
            LayoutCoordinates parentCoordinates = rootLookaheadDelegate.getCoordinator().getParentCoordinates();
            if (parentCoordinates == null) {
                parentCoordinates = rootLookaheadDelegate.getCoordinator().getCoordinates();
            }
            return Offset.m24040plusMKHz9U(jM24039minusMKHz9U, parentCoordinates.mo25637localPositionOfS_NoaFU(layoutCoordinates, Offset.Companion.m24051getZeroF1C5BW0(), z10));
        }
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinates) layoutCoordinates).lookaheadDelegate;
        lookaheadDelegate.getCoordinator().onCoordinatesUsed$ui_release();
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM27030minusqkQi6aY = IntOffset.m27030minusqkQi6aY(IntOffset.m27031plusqkQi6aY(lookaheadDelegate.m25837positionIniSbpLlY$ui_release(lookaheadDelegate2, !z10), IntOffsetKt.m27044roundk4lQ0M(j10)), this.lookaheadDelegate.m25837positionIniSbpLlY$ui_release(lookaheadDelegate2, !z10));
            float fM27027getXimpl2 = IntOffset.m27027getXimpl(jM27030minusqkQi6aY);
            float fM27028getYimpl2 = IntOffset.m27028getYimpl(jM27030minusqkQi6aY);
            return Offset.m24027constructorimpl((Float.floatToRawIntBits(fM27027getXimpl2) << 32) | (Float.floatToRawIntBits(fM27028getYimpl2) & 4294967295L));
        }
        LookaheadDelegate rootLookaheadDelegate2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM27031plusqkQi6aY = IntOffset.m27031plusqkQi6aY(IntOffset.m27031plusqkQi6aY(lookaheadDelegate.m25837positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !z10), rootLookaheadDelegate2.mo25829getPositionnOccac()), IntOffsetKt.m27044roundk4lQ0M(j10));
        LookaheadDelegate rootLookaheadDelegate3 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate);
        long jM27030minusqkQi6aY2 = IntOffset.m27030minusqkQi6aY(jM27031plusqkQi6aY, IntOffset.m27031plusqkQi6aY(this.lookaheadDelegate.m25837positionIniSbpLlY$ui_release(rootLookaheadDelegate3, !z10), rootLookaheadDelegate3.mo25829getPositionnOccac()));
        float fM27027getXimpl3 = IntOffset.m27027getXimpl(jM27030minusqkQi6aY2);
        float fM27028getYimpl3 = IntOffset.m27028getYimpl(jM27030minusqkQi6aY2);
        long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(fM27028getYimpl3) & 4294967295L) | (Float.floatToRawIntBits(fM27027getXimpl3) << 32));
        NodeCoordinator wrappedBy$ui_release = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui_release();
        AbstractC9133u.m16130d(wrappedBy$ui_release);
        NodeCoordinator wrappedBy$ui_release2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui_release();
        AbstractC9133u.m16130d(wrappedBy$ui_release2);
        return wrappedBy$ui_release.mo25637localPositionOfS_NoaFU(wrappedBy$ui_release2, jM24027constructorimpl, z10);
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo25638localToRootMKHz9U(long j10) {
        return getCoordinator().mo25638localToRootMKHz9U(Offset.m24040plusMKHz9U(j10, m25654getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo25639localToScreenMKHz9U(long j10) {
        return getCoordinator().mo25639localToScreenMKHz9U(Offset.m24040plusMKHz9U(j10, m25654getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo25640localToWindowMKHz9U(long j10) {
        return getCoordinator().mo25640localToWindowMKHz9U(Offset.m24040plusMKHz9U(j10, m25654getLookaheadOffsetF1C5BW0()));
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo25641screenToLocalMKHz9U(long j10) {
        return Offset.m24040plusMKHz9U(getCoordinator().mo25641screenToLocalMKHz9U(j10), m25654getLookaheadOffsetF1C5BW0());
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo25642transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        getCoordinator().mo25642transformFromEL8BTi8(layoutCoordinates, fArr);
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo25643transformToScreen58bKbWc(float[] fArr) {
        getCoordinator().mo25643transformToScreen58bKbWc(fArr);
    }

    @Override // androidx.compose.p013ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo25644windowToLocalMKHz9U(long j10) {
        return Offset.m24040plusMKHz9U(getCoordinator().mo25644windowToLocalMKHz9U(j10), m25654getLookaheadOffsetF1C5BW0());
    }
}
