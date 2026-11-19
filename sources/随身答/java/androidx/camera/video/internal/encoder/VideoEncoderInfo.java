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
    Range<Integer> getSupportedHeightsFor(int i9);

    @NonNull
    Range<Integer> getSupportedWidths();

    @NonNull
    Range<Integer> getSupportedWidthsFor(int i9);

    int getWidthAlignment();

    boolean isSizeSupported(int i9, int i10);

    default boolean isSizeSupportedAllowSwapping(int i9, int i10) {
        if (isSizeSupported(i9, i10)) {
            return true;
        }
        return canSwapWidthHeight() && isSizeSupported(i10, i9);
    }
}
