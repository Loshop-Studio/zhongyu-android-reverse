package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements Camera2OutputConfig {
    public static ImageReaderOutputConfig create(int i10, int i11, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Size size, int i12, int i13) {
        return new AutoValue_ImageReaderOutputConfig(i10, i11, str, list, size, i12, i13);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    @NonNull
    public abstract Size getSize();

    public static ImageReaderOutputConfig create(int i10, @NonNull Size size, int i11, int i12) {
        return new AutoValue_ImageReaderOutputConfig(i10, -1, null, Collections.EMPTY_LIST, size, i11, i12);
    }
}
