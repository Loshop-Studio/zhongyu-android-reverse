package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class GnssStatusCompat {

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_BEIDOU = 5;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GALILEO = 6;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GLONASS = 3;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GPS = 1;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_IRNSS = 7;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_QZSS = 4;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_SBAS = 2;

    @SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_UNKNOWN = 0;

    public static abstract class Callback {
        public void onFirstFix(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i) {
        }

        public void onSatelliteStatusChanged(GnssStatusCompat gnssStatusCompat) {
        }

        public void onStarted() {
        }

        public void onStopped() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ConstellationType {
    }

    @RequiresApi(24)
    public static GnssStatusCompat wrap(GnssStatus gnssStatus) {
        return new GnssStatusWrapper(gnssStatus);
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 360.0d)
    public abstract float getAzimuthDegrees(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 63.0d)
    public abstract float getBasebandCn0DbHz(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE)
    public abstract float getCarrierFrequencyHz(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 63.0d)
    public abstract float getCn0DbHz(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract int getConstellationType(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @FloatRange(from = -90.0d, m246to = 90.0d)
    public abstract float getElevationDegrees(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public abstract int getSatelliteCount();

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = 200)
    public abstract int getSvid(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract boolean hasAlmanacData(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract boolean hasBasebandCn0DbHz(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract boolean hasCarrierFrequencyHz(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract boolean hasEphemerisData(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    public abstract boolean usedInFix(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    @SuppressLint({"ReferencesDeprecated"})
    public static GnssStatusCompat wrap(GpsStatus gpsStatus) {
        return new GpsStatusWrapper(gpsStatus);
    }
}
