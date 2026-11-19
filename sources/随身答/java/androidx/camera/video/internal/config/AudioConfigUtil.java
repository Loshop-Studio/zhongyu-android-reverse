package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.config.AudioMimeInfo;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    /* renamed from: a */
    public static /* synthetic */ int m746a(int i9, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i9) - Math.abs(num2.intValue() - i9);
        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
    }

    @NonNull
    public static AudioEncoderConfig resolveAudioEncoderConfig(@NonNull AudioMimeInfo audioMimeInfo, @NonNull Timebase timebase, @NonNull AudioSettings audioSettings, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioEncoderConfig) (compatibleAudioProfile != null ? new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, compatibleAudioProfile) : new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings)).get();
    }

    @NonNull
    public static AudioMimeInfo resolveAudioMimeInfo(@NonNull MediaSpec mediaSpec, @Nullable VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
        String strOutputFormatToAudioMime = MediaSpec.outputFormatToAudioMime(mediaSpec.getOutputFormat());
        int iOutputFormatToAudioProfile = MediaSpec.outputFormatToAudioProfile(mediaSpec.getOutputFormat());
        if (videoValidatedEncoderProfilesProxy == null || videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() == null) {
            defaultAudioProfile = null;
        } else {
            defaultAudioProfile = videoValidatedEncoderProfilesProxy.getDefaultAudioProfile();
            String mediaType = defaultAudioProfile.getMediaType();
            int profile = defaultAudioProfile.getProfile();
            if (Objects.equals(mediaType, EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE)) {
                Logger.m501d(TAG, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            } else if (mediaSpec.getOutputFormat() == -1) {
                Logger.m501d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + profile + ")]");
                strOutputFormatToAudioMime = mediaType;
                iOutputFormatToAudioProfile = profile;
            } else if (Objects.equals(strOutputFormatToAudioMime, mediaType) && iOutputFormatToAudioProfile == profile) {
                Logger.m501d(TAG, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + iOutputFormatToAudioProfile + ")]");
                strOutputFormatToAudioMime = mediaType;
            } else {
                Logger.m501d(TAG, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + mediaType + "(profile: " + profile + "), chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            }
            defaultAudioProfile = null;
        }
        AudioMimeInfo.Builder profile2 = AudioMimeInfo.builder(strOutputFormatToAudioMime).setProfile(iOutputFormatToAudioProfile);
        if (defaultAudioProfile != null) {
            profile2.setCompatibleAudioProfile(defaultAudioProfile);
        }
        return profile2.build();
    }

    @NonNull
    public static AudioSettings resolveAudioSettings(@NonNull AudioMimeInfo audioMimeInfo, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioSettings) (compatibleAudioProfile != null ? new AudioSettingsAudioProfileResolver(audioSpec, compatibleAudioProfile) : new AudioSettingsDefaultResolver(audioSpec)).get();
    }

    public static int resolveAudioSource(@NonNull AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.m501d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.m501d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public static int resolveAudioSourceFormat(@NonNull AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.m501d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.m501d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    public static int scaleAndClampBitrate(int i9, int i10, int i11, int i12, int i13, Range<Integer> range) {
        int iDoubleValue = (int) (i9 * new Rational(i10, i11).doubleValue() * new Rational(i12, i13).doubleValue());
        String str = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(iDoubleValue)) : "";
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        Logger.m501d(TAG, str);
        return iDoubleValue;
    }

    public static int selectSampleRateOrNearestSupported(@NonNull Range<Integer> range, int i9, int i10, final int i11) {
        ArrayList arrayList = null;
        int i12 = 0;
        int iIntValue = i11;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                Logger.m501d(TAG, "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (AudioSource.isSettingsSupported(iIntValue, i9, i10)) {
                    return iIntValue;
                }
                Logger.m501d(TAG, "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i9 + " and source format " + i10);
            }
            if (arrayList == null) {
                Logger.m501d(TAG, "Trying common sample rates in proximity order to target " + i11 + "Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AudioConfigUtil.m746a(i11, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i12 >= arrayList.size()) {
                Logger.m501d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return AUDIO_SAMPLE_RATE_DEFAULT;
            }
            iIntValue = ((Integer) arrayList.get(i12)).intValue();
            i12++;
        }
    }
}
