package androidx.compose.foundation.text.input.internal;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;

/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m28072coerceIn3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i10) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i10) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i10)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i11) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i11)) & 4294967295L));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m28073fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j10) {
        Offset offsetM30626boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offsetM30626boximpl = Offset.m30626boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo32238localPositionOfR5De75A(decoratorNodeCoordinates, j10) : j10);
            } else {
                offsetM30626boximpl = null;
            }
            if (offsetM30626boximpl != null) {
                return offsetM30626boximpl.m30647unboximpl();
            }
        }
        return j10;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m28074fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offsetM30626boximpl = null;
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
                        offsetM30626boximpl = Offset.m30626boximpl(coreNodeCoordinates.mo32238localPositionOfR5De75A(textLayoutNodeCoordinates, j10));
                    }
                }
                if (offsetM30626boximpl != null) {
                    return offsetM30626boximpl.m30647unboximpl();
                }
            }
        }
        return j10;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m28075fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j10) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j10 : decoratorNodeCoordinates.mo32246windowToLocalMKHz9U(j10);
    }
}
