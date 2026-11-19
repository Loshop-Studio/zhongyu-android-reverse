package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import com.google.auto.value.AutoValue;
import java.util.UUID;

@AutoValue
/* loaded from: classes.dex */
public abstract class OutConfig {
    @NonNull
    /* renamed from: of */
    public static OutConfig m742of(@NonNull SurfaceEdge surfaceEdge) {
        return m740of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    @NonNull
    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Size getSize();

    public abstract int getTargets();

    @NonNull
    public abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    @NonNull
    /* renamed from: of */
    public static OutConfig m740of(int i, int i8, @NonNull Rect rect, @NonNull Size size, int i9, boolean z8) {
        return m741of(i, i8, rect, size, i9, z8, false);
    }

    @NonNull
    /* renamed from: of */
    public static OutConfig m741of(int i, int i8, @NonNull Rect rect, @NonNull Size size, int i9, boolean z8, boolean z9) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i, i8, rect, size, i9, z8, z9);
    }
}
