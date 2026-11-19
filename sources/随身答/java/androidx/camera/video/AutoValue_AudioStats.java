package androidx.camera.video;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
final class AutoValue_AudioStats extends AudioStats {
    private final double audioAmplitudeInternal;
    private final int audioState;
    private final Throwable errorCause;

    public AutoValue_AudioStats(int i9, double d10, @Nullable Throwable th) {
        this.audioState = i9;
        this.audioAmplitudeInternal = d10;
        this.errorCause = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStats) {
            AudioStats audioStats = (AudioStats) obj;
            if (this.audioState == audioStats.getAudioState() && Double.doubleToLongBits(this.audioAmplitudeInternal) == Double.doubleToLongBits(audioStats.getAudioAmplitudeInternal()) && ((th = this.errorCause) != null ? th.equals(audioStats.getErrorCause()) : audioStats.getErrorCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioStats
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public double getAudioAmplitudeInternal() {
        return this.audioAmplitudeInternal;
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
        return this.audioState;
    }

    @Override // androidx.camera.video.AudioStats
    @Nullable
    public Throwable getErrorCause() {
        return this.errorCause;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.audioState ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.audioAmplitudeInternal) >>> 32) ^ Double.doubleToLongBits(this.audioAmplitudeInternal)))) * 1000003;
        Throwable th = this.errorCause;
        return iDoubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.audioState + ", audioAmplitudeInternal=" + this.audioAmplitudeInternal + ", errorCause=" + this.errorCause + "}";
    }
}
