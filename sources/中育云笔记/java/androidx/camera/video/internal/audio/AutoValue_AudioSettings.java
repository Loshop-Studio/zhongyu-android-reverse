package androidx.camera.video.internal.audio;

import androidx.annotation.IntRange;
import androidx.camera.video.internal.audio.AudioSettings;

/* loaded from: classes.dex */
final class AutoValue_AudioSettings extends AudioSettings {
    private final int audioFormat;
    private final int audioSource;
    private final int channelCount;
    private final int sampleRate;

    public static final class Builder extends AudioSettings.Builder {
        private Integer audioFormat;
        private Integer audioSource;
        private Integer channelCount;
        private Integer sampleRate;

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings autoBuild() {
            String str = "";
            if (this.audioSource == null) {
                str = " audioSource";
            }
            if (this.sampleRate == null) {
                str = str + " sampleRate";
            }
            if (this.channelCount == null) {
                str = str + " channelCount";
            }
            if (this.audioFormat == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioSettings(this.audioSource.intValue(), this.sampleRate.intValue(), this.channelCount.intValue(), this.audioFormat.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioFormat(int i10) {
            this.audioFormat = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setAudioSource(int i10) {
            this.audioSource = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setChannelCount(int i10) {
            this.channelCount = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.video.internal.audio.AudioSettings.Builder
        public AudioSettings.Builder setSampleRate(int i10) {
            this.sampleRate = Integer.valueOf(i10);
            return this;
        }

        public Builder() {
        }

        private Builder(AudioSettings audioSettings) {
            this.audioSource = Integer.valueOf(audioSettings.getAudioSource());
            this.sampleRate = Integer.valueOf(audioSettings.getSampleRate());
            this.channelCount = Integer.valueOf(audioSettings.getChannelCount());
            this.audioFormat = Integer.valueOf(audioSettings.getAudioFormat());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioSettings) {
            AudioSettings audioSettings = (AudioSettings) obj;
            if (this.audioSource == audioSettings.getAudioSource() && this.sampleRate == audioSettings.getSampleRate() && this.channelCount == audioSettings.getChannelCount() && this.audioFormat == audioSettings.getAudioFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioFormat() {
        return this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public int getAudioSource() {
        return this.audioSource;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getChannelCount() {
        return this.channelCount;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    @IntRange(from = 1)
    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return ((((((this.audioSource ^ 1000003) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channelCount) * 1000003) ^ this.audioFormat;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    public AudioSettings.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.audioSource + ", sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", audioFormat=" + this.audioFormat + "}";
    }

    private AutoValue_AudioSettings(int i10, int i11, int i12, int i13) {
        this.audioSource = i10;
        this.sampleRate = i11;
        this.channelCount = i12;
        this.audioFormat = i13;
    }
}
