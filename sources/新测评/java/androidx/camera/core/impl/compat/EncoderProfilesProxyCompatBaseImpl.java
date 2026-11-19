package androidx.camera.core.impl.compat;

import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class EncoderProfilesProxyCompatBaseImpl {
    private EncoderProfilesProxyCompatBaseImpl() {
    }

    @NonNull
    public static EncoderProfilesProxy from(@NonNull CamcorderProfile camcorderProfile) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(camcorderProfile.duration, camcorderProfile.fileFormat, toAudioProfiles(camcorderProfile), toVideoProfiles(camcorderProfile));
    }

    @NonNull
    private static List<EncoderProfilesProxy.AudioProfileProxy> toAudioProfiles(@NonNull CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.audioCodec;
        arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(i10, EncoderProfilesProxy.getAudioCodecMimeType(i10), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, EncoderProfilesProxy.getRequiredAudioProfile(camcorderProfile.audioCodec)));
        return arrayList;
    }

    @NonNull
    private static List<EncoderProfilesProxy.VideoProfileProxy> toVideoProfiles(@NonNull CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i10 = camcorderProfile.videoCodec;
        arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(i10, EncoderProfilesProxy.getVideoCodecMimeType(i10), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
