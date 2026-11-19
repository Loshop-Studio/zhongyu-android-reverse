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
    public static OutConfig m881of(@NonNull SurfaceEdge surfaceEdge) {
        return m879of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
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
    public static OutConfig m879of(int i10, int i11, @NonNull Rect rect, @NonNull Size size, int i12, boolean z9) {
        return m880of(i10, i11, rect, size, i12, z9, false);
    }

    @NonNull
    /* renamed from: of */
    public static OutConfig m880of(int i10, int i11, @NonNull Rect rect, @NonNull Size size, int i12, boolean z9, boolean z10) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i10, i11, rect, size, i12, z9, z10);
    }
}
