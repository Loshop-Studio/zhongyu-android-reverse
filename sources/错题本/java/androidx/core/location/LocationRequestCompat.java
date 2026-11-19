package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import androidx.compose.p011ui.text.android.AbstractC2310b;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    public static class Api19Impl {
        private static Method sCreateFromDeprecatedProviderMethod;
        private static Class<?> sLocationRequestClass;
        private static Method sSetExpireInMethod;
        private static Method sSetFastestIntervalMethod;
        private static Method sSetNumUpdatesMethod;
        private static Method sSetQualityMethod;

        private Api19Impl() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                Method method = sCreateFromDeprecatedProviderMethod;
                Class cls = Long.TYPE;
                if (method == null) {
                    Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                    sCreateFromDeprecatedProviderMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = sCreateFromDeprecatedProviderMethod.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                Method method2 = sSetQualityMethod;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", cls2);
                    sSetQualityMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                sSetQualityMethod.invoke(objInvoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (sSetFastestIntervalMethod == null) {
                    Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", cls);
                    sSetFastestIntervalMethod = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                sSetFastestIntervalMethod.invoke(objInvoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (sSetNumUpdatesMethod == null) {
                        Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", cls2);
                        sSetNumUpdatesMethod = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    sSetNumUpdatesMethod.invoke(objInvoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (sSetExpireInMethod == null) {
                        Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", cls);
                        sSetExpireInMethod = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    sSetExpireInMethod.invoke(objInvoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Quality {
    }

    public LocationRequestCompat(long j7, int i, long j8, int i8, long j9, float f, long j10) {
        this.mIntervalMillis = j7;
        this.mQuality = i;
        this.mMinUpdateIntervalMillis = j9;
        this.mDurationMillis = j8;
        this.mMaxUpdates = i8;
        this.mMinUpdateDistanceMeters = f;
        this.mMaxUpdateDelayMillis = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        return this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis;
    }

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = SieveCacheKt.NodeLinkMask)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public long getMinUpdateIntervalMillis() {
        long j7 = this.mMinUpdateIntervalMillis;
        return j7 == -1 ? this.mIntervalMillis : j7;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        int i = this.mQuality * 31;
        long j7 = this.mIntervalMillis;
        int i8 = (i + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.mMinUpdateIntervalMillis;
        return i8 + ((int) (j8 ^ (j8 >>> 32)));
    }

    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    public String toString() {
        StringBuilder sbM97v = AbstractC0037f.m97v("Request[");
        if (this.mIntervalMillis != Long.MAX_VALUE) {
            sbM97v.append("@");
            TimeUtils.formatDuration(this.mIntervalMillis, sbM97v);
            int i = this.mQuality;
            if (i == 100) {
                sbM97v.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sbM97v.append(" BALANCED");
            } else if (i == 104) {
                sbM97v.append(" LOW_POWER");
            }
        } else {
            sbM97v.append("PASSIVE");
        }
        if (this.mDurationMillis != Long.MAX_VALUE) {
            sbM97v.append(", duration=");
            TimeUtils.formatDuration(this.mDurationMillis, sbM97v);
        }
        if (this.mMaxUpdates != Integer.MAX_VALUE) {
            sbM97v.append(", maxUpdates=");
            sbM97v.append(this.mMaxUpdates);
        }
        long j7 = this.mMinUpdateIntervalMillis;
        if (j7 != -1 && j7 < this.mIntervalMillis) {
            sbM97v.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, sbM97v);
        }
        if (this.mMinUpdateDistanceMeters > AudioStats.AUDIO_AMPLITUDE_NONE) {
            sbM97v.append(", minUpdateDistance=");
            sbM97v.append(this.mMinUpdateDistanceMeters);
        }
        if (this.mMaxUpdateDelayMillis / 2 > this.mIntervalMillis) {
            sbM97v.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, sbM97v);
        }
        sbM97v.append(']');
        return sbM97v.toString();
    }

    @SuppressLint({"NewApi"})
    public LocationRequest toLocationRequest(String str) {
        return Build.VERSION.SDK_INT >= 31 ? toLocationRequest() : AbstractC2310b.m1416e(Api19Impl.toLocationRequest(this, str));
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long j7) {
            setIntervalMillis(j7);
            this.mQuality = LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1L;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0L;
        }

        public LocationRequestCompat build() {
            Preconditions.checkState((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j7 = this.mIntervalMillis;
            return new LocationRequestCompat(j7, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j7), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1L;
            return this;
        }

        public Builder setDurationMillis(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) long j7) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j7, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public Builder setIntervalMillis(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) long j7) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j7, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public Builder setMaxUpdateDelayMillis(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) long j7) {
            this.mMaxUpdateDelayMillis = j7;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j7, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        public Builder setMaxUpdates(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID, m247to = SieveCacheKt.NodeLinkMask) int i) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        public Builder setMinUpdateDistanceMeters(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 3.4028234663852886E38d) float f) {
            this.mMinUpdateDistanceMeters = f;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public Builder setMinUpdateIntervalMillis(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) long j7) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j7, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public Builder setQuality(int i) {
            Preconditions.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.mQuality = i;
            return this;
        }

        public Builder(LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }
    }
}
