package androidx.compose.foundation.gestures.snapping;

/* loaded from: classes.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i10, int i11, int i12, int i13, int i14, int i15, SnapPosition snapPosition, int i16) {
        return i14 - snapPosition.position(i10, i13, i11, i12, i15, i16);
    }
}
