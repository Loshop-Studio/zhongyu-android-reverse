package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements Camera2OutputConfig {
    public static SurfaceOutputConfig create(int i10, int i11, @Nullable String str, @NonNull List<Camera2OutputConfig> list, @NonNull Surface surface) {
        return new AutoValue_SurfaceOutputConfig(i10, i11, str, list, surface);
    }

    @NonNull
    public abstract Surface getSurface();

    public static SurfaceOutputConfig create(int i10, @NonNull Surface surface) {
        return create(i10, -1, null, Collections.EMPTY_LIST, surface);
    }
}
