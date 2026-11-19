package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.compose.foundation.text.selection.SingleSelectionLayout;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioSettings autoBuild();

        @NonNull
        public final AudioSettings build() {
            AudioSettings audioSettingsAutoBuild = autoBuild();
            String strM74C = audioSettingsAutoBuild.getAudioSource() == -1 ? " audioSource" : "";
            if (audioSettingsAutoBuild.getSampleRate() <= 0) {
                strM74C = AbstractC0037f.m74C(strM74C, " sampleRate");
            }
            if (audioSettingsAutoBuild.getChannelCount() <= 0) {
                strM74C = AbstractC0037f.m74C(strM74C, " channelCount");
            }
            if (audioSettingsAutoBuild.getAudioFormat() == -1) {
                strM74C = AbstractC0037f.m74C(strM74C, " audioFormat");
            }
            if (strM74C.isEmpty()) {
                return audioSettingsAutoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strM74C));
        }

        @NonNull
        public abstract Builder setAudioFormat(int i);

        @NonNull
        public abstract Builder setAudioSource(int i);

        @NonNull
        public abstract Builder setChannelCount(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) int i);

        @NonNull
        public abstract Builder setSampleRate(@IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID) int i);
    }

    @NonNull
    @SuppressLint({HttpHeaders.RANGE})
    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID)
    public abstract int getChannelCount();

    @IntRange(from = SingleSelectionLayout.DEFAULT_SELECTABLE_ID)
    public abstract int getSampleRate();

    @NonNull
    public abstract Builder toBuilder();
}
