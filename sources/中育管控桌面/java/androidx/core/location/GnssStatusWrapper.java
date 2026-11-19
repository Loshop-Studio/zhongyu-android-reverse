package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static float getCarrierFrequencyHz(GnssStatus gnssStatus, int i6) {
            return gnssStatus.getCarrierFrequencyHz(i6);
        }

        public static boolean hasCarrierFrequencyHz(GnssStatus gnssStatus, int i6) {
            return gnssStatus.hasCarrierFrequencyHz(i6);
        }
    }

    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static float getBasebandCn0DbHz(GnssStatus gnssStatus, int i6) {
            return gnssStatus.getBasebandCn0DbHz(i6);
        }

        public static boolean hasBasebandCn0DbHz(GnssStatus gnssStatus, int i6) {
            return gnssStatus.hasBasebandCn0DbHz(i6);
        }
    }

    public GnssStatusWrapper(Object obj) {
        this.mWrapped = (GnssStatus) Preconditions.checkNotNull((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.mWrapped.equals(((GnssStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i6) {
        return this.mWrapped.getAzimuthDegrees(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i6) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getBasebandCn0DbHz(this.mWrapped, i6);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i6) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getCarrierFrequencyHz(this.mWrapped, i6);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i6) {
        return this.mWrapped.getCn0DbHz(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i6) {
        return this.mWrapped.getConstellationType(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i6) {
        return this.mWrapped.getElevationDegrees(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return this.mWrapped.getSatelliteCount();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i6) {
        return this.mWrapped.getSvid(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i6) {
        return this.mWrapped.hasAlmanacData(i6);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i6) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.hasBasebandCn0DbHz(this.mWrapped, i6);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i6) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasCarrierFrequencyHz(this.mWrapped, i6);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i6) {
        return this.mWrapped.hasEphemerisData(i6);
    }

    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i6) {
        return this.mWrapped.usedInFix(i6);
    }
}
