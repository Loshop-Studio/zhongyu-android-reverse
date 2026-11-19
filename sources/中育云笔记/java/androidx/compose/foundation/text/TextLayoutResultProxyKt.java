package androidx.compose.foundation.text;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;

/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m27927coerceIn3MmeM6k(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i10) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i10) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i10)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i11) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i11)) & 4294967295L));
    }
}
