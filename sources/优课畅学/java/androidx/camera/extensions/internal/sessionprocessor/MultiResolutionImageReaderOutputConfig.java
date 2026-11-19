package androidx.camera.extensions.internal.sessionprocessor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    public static MultiResolutionImageReaderOutputConfig create(int i10, int i11, @Nullable String str, @NonNull List<Camera2OutputConfig> list, int i12, int i13) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i10, i11, str, list, i12, i13);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();
}
