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
    public static OutConfig m659of(@NonNull SurfaceEdge surfaceEdge) {
        return m657of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
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
    public static OutConfig m657of(int i9, int i10, @NonNull Rect rect, @NonNull Size size, int i11, boolean z9) {
        return m658of(i9, i10, rect, size, i11, z9, false);
    }

    @NonNull
    /* renamed from: of */
    public static OutConfig m658of(int i9, int i10, @NonNull Rect rect, @NonNull Size size, int i11, boolean z9, boolean z10) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i9, i10, rect, size, i11, z9, z10);
    }
}
