package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class PointerEventKt {
    @InterfaceC8721a
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @InterfaceC8721a
    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @InterfaceC8721a
    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @InterfaceC8721a
    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (Offset.m24032equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m24051getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @InterfaceC8721a
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m25446isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j10) {
        long jM25502getPositionF1C5BW0 = pointerInputChange.m25502getPositionF1C5BW0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM25502getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM25502getPositionF1C5BW0 & 4294967295L));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return (fIntBitsToFloat > ((float) i10)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i11));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m25447isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j10, long j11) {
        boolean zM25573equalsimpl0 = PointerType.m25573equalsimpl0(pointerInputChange.m25505getTypeT8wyACA(), PointerType.Companion.m25580getTouchT8wyACA());
        long jM25502getPositionF1C5BW0 = pointerInputChange.m25502getPositionF1C5BW0();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM25502getPositionF1C5BW0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM25502getPositionF1C5BW0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32));
        float f10 = zM25573equalsimpl0 ? 1.0f : 0.0f;
        float f11 = fIntBitsToFloat3 * f10;
        float f12 = ((int) (j10 >> 32)) + f11;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f12) | (fIntBitsToFloat < (-f11)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j10 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @InterfaceC8721a
    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z10) {
        return (z10 || !pointerInputChange.isConsumed()) ? Offset.m24039minusMKHz9U(pointerInputChange.m25502getPositionF1C5BW0(), pointerInputChange.m25503getPreviousPositionF1C5BW0()) : Offset.Companion.m24051getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return positionChangeInternal(pointerInputChange, z10);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m24032equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m24051getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m24032equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m24051getZeroF1C5BW0());
    }

    private static final int toInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
