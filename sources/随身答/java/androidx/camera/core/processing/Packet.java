package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class Packet<T> {
    @NonNull
    /* renamed from: of */
    public static Packet<Bitmap> m626of(@NonNull Bitmap bitmap, @NonNull Exif exif, @NonNull Rect rect, int i9, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bitmap, exif, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i9, matrix, cameraCaptureResult);
    }

    @NonNull
    public abstract CameraCaptureResult getCameraCaptureResult();

    @NonNull
    public abstract Rect getCropRect();

    @NonNull
    public abstract T getData();

    @Nullable
    public abstract Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    @NonNull
    public abstract Matrix getSensorToBufferTransform();

    @NonNull
    public abstract Size getSize();

    public boolean hasCropping() {
        return TransformUtils.hasCropping(getCropRect(), getSize());
    }

    @NonNull
    /* renamed from: of */
    public static Packet<ImageProxy> m627of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Rect rect, int i9, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return m628of(imageProxy, exif, new Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i9, matrix, cameraCaptureResult);
    }

    @NonNull
    /* renamed from: of */
    public static Packet<ImageProxy> m628of(@NonNull ImageProxy imageProxy, @Nullable Exif exif, @NonNull Size size, @NonNull Rect rect, int i9, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        if (ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            Preconditions.checkNotNull(exif, "JPEG image must have Exif.");
        }
        return new AutoValue_Packet(imageProxy, exif, imageProxy.getFormat(), size, rect, i9, matrix, cameraCaptureResult);
    }

    @NonNull
    /* renamed from: of */
    public static Packet<byte[]> m629of(@NonNull byte[] bArr, @NonNull Exif exif, int i9, @NonNull Size size, @NonNull Rect rect, int i10, @NonNull Matrix matrix, @NonNull CameraCaptureResult cameraCaptureResult) {
        return new AutoValue_Packet(bArr, exif, i9, size, rect, i10, matrix, cameraCaptureResult);
    }
}
