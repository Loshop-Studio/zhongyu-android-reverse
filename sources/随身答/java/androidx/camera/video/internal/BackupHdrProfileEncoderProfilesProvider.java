package androidx.camera.video.internal;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "BackupHdrProfileEncoderProfilesProvider";
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;
    private final Function<VideoEncoderConfig, VideoEncoderInfo> mVideoEncoderInfoFinder;

    public BackupHdrProfileEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = function;
    }

    @Nullable
    private EncoderProfilesProxy appendBackupVideoProfile(@Nullable EncoderProfilesProxy encoderProfilesProxy, int i9, int i10) {
        EncoderProfilesProxy.VideoProfileProxy next;
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(encoderProfilesProxy.getVideoProfiles());
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getHdrFormat() == 0) {
                break;
            }
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyValidateOrAdapt = validateOrAdapt(generateBackupProfile(next, i9, i10), this.mVideoEncoderInfoFinder);
        if (videoProfileProxyValidateOrAdapt != null) {
            arrayList.add(videoProfileProxyValidateOrAdapt);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    private static int deriveCodec(int i9) {
        if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i9);
    }

    @NonNull
    private static String deriveMediaType(int i9) {
        return EncoderProfilesProxy.getVideoCodecMimeType(i9);
    }

    private static int deriveProfile(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 4096;
        }
        if (i9 == 3) {
            return 8192;
        }
        if (i9 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i9);
    }

    @Nullable
    private static EncoderProfilesProxy.VideoProfileProxy generateBackupProfile(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i9, int i10) {
        if (videoProfileProxy == null) {
            return null;
        }
        int codec = videoProfileProxy.getCodec();
        String mediaType = videoProfileProxy.getMediaType();
        int profile = videoProfileProxy.getProfile();
        if (i9 != videoProfileProxy.getHdrFormat()) {
            codec = deriveCodec(i9);
            mediaType = deriveMediaType(codec);
            profile = deriveProfile(i9);
        }
        return EncoderProfilesProxy.VideoProfileProxy.create(codec, mediaType, scaleBitrate(videoProfileProxy.getBitrate(), i10, videoProfileProxy.getBitDepth()), videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), profile, i10, videoProfileProxy.getChromaSubsampling(), i9);
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i9) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i9))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i9));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i9)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyAppendBackupVideoProfile = appendBackupVideoProfile(this.mEncoderProfilesProvider.getAll(i9), 1, 10);
        this.mEncoderProfilesCache.put(Integer.valueOf(i9), encoderProfilesProxyAppendBackupVideoProfile);
        return encoderProfilesProxyAppendBackupVideoProfile;
    }

    @NonNull
    private static EncoderProfilesProxy.VideoProfileProxy modifyBitrate(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i9) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), i9, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    private static int scaleBitrate(int i9, int i10, int i11) {
        if (i10 == i11) {
            return i9;
        }
        int iDoubleValue = (int) (i9 * new Rational(i10, i11).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            Logger.m501d(TAG, String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    @Nullable
    @VisibleForTesting
    public static EncoderProfilesProxy.VideoProfileProxy validateOrAdapt(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull Function<VideoEncoderConfig, VideoEncoderInfo> function) {
        VideoEncoderConfig videoEncoderConfig;
        VideoEncoderInfo videoEncoderInfoApply;
        if (videoProfileProxy == null || (videoEncoderInfoApply = function.apply((videoEncoderConfig = VideoConfigUtil.toVideoEncoderConfig(videoProfileProxy)))) == null || !videoEncoderInfoApply.isSizeSupportedAllowSwapping(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())) {
            return null;
        }
        int bitrate = videoEncoderConfig.getBitrate();
        int iIntValue = ((Integer) videoEncoderInfoApply.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate))).intValue();
        return iIntValue == bitrate ? videoProfileProxy : modifyBitrate(videoProfileProxy, iIntValue);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i9) {
        return getProfilesInternal(i9);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i9) {
        return this.mEncoderProfilesProvider.hasProfile(i9) && getProfilesInternal(i9) != null;
    }
}
