package androidx.compose.foundation.text.input.internal;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m21470coerceIn3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i10) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i10) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i10)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i11) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i11)) & 4294967295L));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m21471fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j10) {
        Offset offsetM24024boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offsetM24024boximpl = Offset.m24024boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo25636localPositionOfR5De75A(decoratorNodeCoordinates, j10) : j10);
            } else {
                offsetM24024boximpl = null;
            }
            if (offsetM24024boximpl != null) {
                return offsetM24024boximpl.m24045unboximpl();
            }
        }
        return j10;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m21472fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offsetM24024boximpl = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offsetM24024boximpl = Offset.m24024boximpl(coreNodeCoordinates.mo25636localPositionOfR5De75A(textLayoutNodeCoordinates, j10));
                    }
                }
                if (offsetM24024boximpl != null) {
                    return offsetM24024boximpl.m24045unboximpl();
                }
            }
        }
        return j10;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m21473fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j10 : decoratorNodeCoordinates.mo25644windowToLocalMKHz9U(j10);
    }
}
