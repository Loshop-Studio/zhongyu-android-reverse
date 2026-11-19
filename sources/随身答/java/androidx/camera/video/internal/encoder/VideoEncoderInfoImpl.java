package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper;
import java.util.Objects;

/* loaded from: classes.dex */
public class VideoEncoderInfoImpl extends EncoderInfoImpl implements VideoEncoderInfo {

    @NonNull
    public static final Function<VideoEncoderConfig, VideoEncoderInfo> FINDER = new Function() { // from class: androidx.camera.video.internal.encoder.r0
        @Override // androidx.arch.core.util.Function
        public final Object apply(Object obj) {
            return VideoEncoderInfoImpl.m786a((VideoEncoderConfig) obj);
        }
    };
    private static final String TAG = "VideoEncoderInfoImpl";
    private final MediaCodecInfo.VideoCapabilities mVideoCapabilities;

    public VideoEncoderInfoImpl(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.mCodecCapabilities.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.mVideoCapabilities = videoCapabilities;
    }

    /* renamed from: a */
    public static /* synthetic */ VideoEncoderInfo m786a(VideoEncoderConfig videoEncoderConfig) {
        try {
            return VideoEncoderInfoWrapper.from(from(videoEncoderConfig), null);
        } catch (InvalidConfigException e10) {
            Logger.m508w(TAG, "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    @NonNull
    public static VideoEncoderInfoImpl from(@NonNull VideoEncoderConfig videoEncoderConfig) throws InvalidConfigException {
        return new VideoEncoderInfoImpl(CodecUtil.findCodecAndGetCodecInfo(videoEncoderConfig), videoEncoderConfig.getMimeType());
    }

    @NonNull
    private static IllegalArgumentException toIllegalArgumentException(@NonNull Throwable th) {
        return th instanceof IllegalArgumentException ? (IllegalArgumentException) th : new IllegalArgumentException(th);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.mVideoCapabilities.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedBitrateRange() {
        return this.mVideoCapabilities.getBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeights() {
        return this.mVideoCapabilities.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedHeightsFor(int i9) {
        try {
            return this.mVideoCapabilities.getSupportedHeightsFor(i9);
        } catch (Throwable th) {
            throw toIllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidths() {
        return this.mVideoCapabilities.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NonNull
    public Range<Integer> getSupportedWidthsFor(int i9) {
        try {
            return this.mVideoCapabilities.getSupportedWidthsFor(i9);
        } catch (Throwable th) {
            throw toIllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.mVideoCapabilities.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i9, int i10) {
        return this.mVideoCapabilities.isSizeSupported(i9, i10);
    }
}
