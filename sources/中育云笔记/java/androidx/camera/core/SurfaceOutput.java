package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import com.google.auto.value.AutoValue;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    @AutoValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class CameraInputInfo {
        @NonNull
        /* renamed from: of */
        public static CameraInputInfo m589of(@NonNull Size size, @NonNull Rect rect, @Nullable CameraInternal cameraInternal, int i10, boolean z10) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i10, z10);
        }

        @Nullable
        public abstract CameraInternal getCameraInternal();

        @NonNull
        public abstract Rect getInputCropRect();

        @NonNull
        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();
    }

    @AutoValue
    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: of */
        public static Event m590of(int i10, @NonNull SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i10, surfaceOutput);
        }

        public abstract int getEventCode();

        @NonNull
        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default int getFormat() {
        return 34;
    }

    @NonNull
    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }

    @NonNull
    Size getSize();

    @NonNull
    Surface getSurface(@NonNull Executor executor, @NonNull Consumer<Event> consumer);

    int getTargets();

    void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z10) {
    }
}
