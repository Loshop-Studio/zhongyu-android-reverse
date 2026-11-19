package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.support.v4.media.AbstractC0037f;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {
    protected final MediaCodecInfo.CodecCapabilities mCodecCapabilities;
    private final MediaCodecInfo mMediaCodecInfo;

    public EncoderInfoImpl(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        this.mMediaCodecInfo = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.mCodecCapabilities = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(AbstractC0037f.m85j("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @NonNull
    public String getName() {
        return this.mMediaCodecInfo.getName();
    }
}
