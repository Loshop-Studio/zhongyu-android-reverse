package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* loaded from: classes.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
    }

    @NonNull
    public static Pair<Double, Double> adjustGeoLocation(double d9, double d10) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d9 = adjustInternal(d9);
            d10 = adjustInternal(d10);
        }
        return Pair.create(Double.valueOf(d9), Double.valueOf(d10));
    }

    private static double adjustInternal(double d9) {
        return d9 >= AudioStats.AUDIO_AMPLITUDE_NONE ? d9 : ((d9 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
