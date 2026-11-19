package androidx.camera.video.internal.config;

import android.support.v4.media.AbstractC0037f;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$selectSampleRateOrNearestSupported$0(int i, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
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
                Logger.m585d(TAG, "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            } else if (mediaSpec.getOutputFormat() == -1) {
                Logger.m585d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + profile + ")]");
                strOutputFormatToAudioMime = mediaType;
                iOutputFormatToAudioProfile = profile;
            } else if (Objects.equals(strOutputFormatToAudioMime, mediaType) && iOutputFormatToAudioProfile == profile) {
                Logger.m585d(TAG, "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + iOutputFormatToAudioProfile + ")]");
                strOutputFormatToAudioMime = mediaType;
            } else {
                Logger.m585d(TAG, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + mediaType + "(profile: " + profile + "), chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
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
            Logger.m585d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.m585d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public static int resolveAudioSourceFormat(@NonNull AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.m585d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.m585d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    public static int scaleAndClampBitrate(int i, int i8, int i9, int i10, int i11, Range<Integer> range) {
        int iDoubleValue = (int) (new Rational(i10, i11).doubleValue() * new Rational(i8, i9).doubleValue() * i);
        String strConcat = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(iDoubleValue)) : "";
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                strConcat = strConcat.concat(String.format("\nClamped to range %s -> %dbps", range, num));
            }
        }
        Logger.m585d(TAG, strConcat);
        return iDoubleValue;
    }

    public static int selectSampleRateOrNearestSupported(@NonNull Range<Integer> range, int i, int i8, final int i9) {
        ArrayList arrayList = null;
        int i10 = 0;
        int iIntValue = i9;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                Logger.m585d(TAG, "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (AudioSource.isSettingsSupported(iIntValue, i, i8)) {
                    return iIntValue;
                }
                StringBuilder sbM99x = AbstractC0037f.m99x("Sample rate ", "Hz is not supported by audio source with channel count ", iIntValue, " and source format ", i);
                sbM99x.append(i8);
                Logger.m585d(TAG, sbM99x.toString());
            }
            if (arrayList == null) {
                Logger.m585d(TAG, "Trying common sample rates in proximity order to target " + i9 + "Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AudioConfigUtil.lambda$selectSampleRateOrNearestSupported$0(i9, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i10 >= arrayList.size()) {
                Logger.m585d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return AUDIO_SAMPLE_RATE_DEFAULT;
            }
            iIntValue = ((Integer) arrayList.get(i10)).intValue();
            i10++;
        }
    }
}
