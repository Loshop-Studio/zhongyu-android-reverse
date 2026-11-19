package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.utils.SizeUtil;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class SurfaceConfig {
    public static final long DEFAULT_STREAM_USE_CASE_VALUE = 0;

    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i10) {
            this.mId = i10;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    @NonNull
    public static SurfaceConfig create(@NonNull ConfigType configType, @NonNull ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    @NonNull
    public static ConfigType getConfigType(int i10) {
        return i10 == 35 ? ConfigType.YUV : i10 == 256 ? ConfigType.JPEG : i10 == 4101 ? ConfigType.JPEG_R : i10 == 32 ? ConfigType.RAW : ConfigType.PRIV;
    }

    @NonNull
    public static SurfaceConfig transformSurfaceConfig(int i10, int i11, @NonNull Size size, @NonNull SurfaceSizeDefinition surfaceSizeDefinition) {
        ConfigType configType = getConfigType(i11);
        ConfigSize configSize = ConfigSize.NOT_SUPPORT;
        int area = SizeUtil.getArea(size);
        if (i10 == 1) {
            if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS720pSize(i11))) {
                configSize = ConfigSize.s720p;
            } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getS1440pSize(i11))) {
                configSize = ConfigSize.s1440p;
            }
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getAnalysisSize())) {
            configSize = ConfigSize.VGA;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getPreviewSize())) {
            configSize = ConfigSize.PREVIEW;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getRecordSize())) {
            configSize = ConfigSize.RECORD;
        } else if (area <= SizeUtil.getArea(surfaceSizeDefinition.getMaximumSize(i11))) {
            configSize = ConfigSize.MAXIMUM;
        } else {
            Size ultraMaximumSize = surfaceSizeDefinition.getUltraMaximumSize(i11);
            if (ultraMaximumSize != null && area <= SizeUtil.getArea(ultraMaximumSize)) {
                configSize = ConfigSize.ULTRA_MAXIMUM;
            }
        }
        return create(configType, configSize);
    }

    @NonNull
    public abstract ConfigSize getConfigSize();

    @NonNull
    public abstract ConfigType getConfigType();

    public abstract long getStreamUseCase();

    public final boolean isSupported(@NonNull SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    @NonNull
    public static SurfaceConfig create(@NonNull ConfigType configType, @NonNull ConfigSize configSize, long j10) {
        return new AutoValue_SurfaceConfig(configType, configSize, j10);
    }
}
