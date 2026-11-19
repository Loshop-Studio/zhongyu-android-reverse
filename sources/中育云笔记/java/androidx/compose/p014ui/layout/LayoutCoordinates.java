package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import java.util.Set;

/* loaded from: classes2.dex */
public interface LayoutCoordinates {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return LayoutCoordinates.super.getIntroducesMotionFrameOfReference();
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }

        @Deprecated
        /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m32247localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10) {
            return LayoutCoordinates.super.mo32239localPositionOfS_NoaFU(layoutCoordinates2, j10, z10);
        }

        @Deprecated
        /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m32249localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j10) {
            return LayoutCoordinates.super.mo32241localToScreenMKHz9U(j10);
        }

        @Deprecated
        /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m32250screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j10) {
            return LayoutCoordinates.super.mo32243screenToLocalMKHz9U(j10);
        }

        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m32251transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            LayoutCoordinates.super.mo32244transformFromEL8BTi8(layoutCoordinates2, fArr);
        }

        @Deprecated
        /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m32252transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            LayoutCoordinates.super.mo32245transformToScreen58bKbWc(fArr);
        }
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z10);
    }

    /* renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m32236localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.Companion.m30653getZeroF1C5BW0();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return layoutCoordinates.mo32239localPositionOfS_NoaFU(layoutCoordinates2, j10, z10);
    }

    int get(AlignmentLine alignmentLine);

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo32237getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z10);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo32238localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j10);

    /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    default long mo32239localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j10, boolean z10) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo32240localToRootMKHz9U(long j10);

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    default long mo32241localToScreenMKHz9U(long j10) {
        return Offset.Companion.m30652getUnspecifiedF1C5BW0();
    }

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo32242localToWindowMKHz9U(long j10);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    default long mo32243screenToLocalMKHz9U(long j10) {
        return Offset.Companion.m30652getUnspecifiedF1C5BW0();
    }

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo32244transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    default void mo32245transformToScreen58bKbWc(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo32246windowToLocalMKHz9U(long j10);
}
