package androidx.camera.video.internal.workaround;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class QualityValidatedEncoderProfilesProvider implements EncoderProfilesProvider {
    private static final Map<Integer, Quality> CAMCORDER_TO_VIDEO_QUALITY_MAP;

    @NonNull
    private final CameraInfoInternal mCameraInfo;

    @NonNull
    private final EncoderProfilesProvider mProvider;

    @NonNull
    private final Quirks mQuirks;

    static {
        HashMap map = new HashMap();
        CAMCORDER_TO_VIDEO_QUALITY_MAP = map;
        map.put(1, Quality.HIGHEST);
        map.put(8, Quality.UHD);
        map.put(6, Quality.FHD);
        map.put(5, Quality.f876HD);
        map.put(4, Quality.f877SD);
        map.put(0, Quality.LOWEST);
    }

    public QualityValidatedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull CameraInfoInternal cameraInfoInternal, @NonNull Quirks quirks) {
        this.mProvider = encoderProfilesProvider;
        this.mCameraInfo = cameraInfoInternal;
        this.mQuirks = quirks;
    }

    private boolean isDeviceValidQuality(int i10) {
        Quality quality = CAMCORDER_TO_VIDEO_QUALITY_MAP.get(Integer.valueOf(i10));
        if (quality == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.mQuirks.getAll(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.isProblematicVideoQuality(this.mCameraInfo, quality) && !workaroundBySurfaceProcessing(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }

    private static boolean workaroundBySurfaceProcessing(@NonNull Quirk quirk) {
        return (quirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) quirk).workaroundBySurfaceProcessing();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i10) {
        if (hasProfile(i10)) {
            return this.mProvider.getAll(i10);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i10) {
        return this.mProvider.hasProfile(i10) && isDeviceValidQuality(i10);
    }
}
