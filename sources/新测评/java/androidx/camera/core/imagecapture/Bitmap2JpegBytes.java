package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
class Bitmap2JpegBytes implements Operation<AbstractC0528In, Packet<byte[]>> {

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static boolean hasGainmap(@NonNull Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.Bitmap2JpegBytes$In */
    public static abstract class AbstractC0528In {
        @NonNull
        /* renamed from: of */
        public static AbstractC0528In m753of(@NonNull Packet<Bitmap> packet, int i10) {
            return new AutoValue_Bitmap2JpegBytes_In(packet, i10);
        }

        public abstract int getJpegQuality();

        public abstract Packet<Bitmap> getPacket();
    }

    private static int getOutputFormat(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !Api34Impl.hasGainmap(bitmap)) ? 256 : 4101;
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Packet<byte[]> apply(@NonNull AbstractC0528In abstractC0528In) throws ImageCaptureException {
        Packet<Bitmap> packet = abstractC0528In.getPacket();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        packet.getData().compress(Bitmap.CompressFormat.JPEG, abstractC0528In.getJpegQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m851of(byteArray, exif, getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
