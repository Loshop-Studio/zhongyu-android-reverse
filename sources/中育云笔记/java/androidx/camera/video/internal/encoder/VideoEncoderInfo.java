package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    boolean canSwapWidthHeight();

    int getHeightAlignment();

    @NonNull
    Range<Integer> getSupportedBitrateRange();

    @NonNull
    Range<Integer> getSupportedHeights();

    @NonNull
    Range<Integer> getSupportedHeightsFor(int i10);

    @NonNull
    Range<Integer> getSupportedWidths();

    @NonNull
    Range<Integer> getSupportedWidthsFor(int i10);

    int getWidthAlignment();

    boolean isSizeSupported(int i10, int i11);

    default boolean isSizeSupportedAllowSwapping(int i10, int i11) {
        if (isSizeSupported(i10, i11)) {
            return true;
        }
        return canSwapWidthHeight() && isSizeSupported(i11, i10);
    }
}
