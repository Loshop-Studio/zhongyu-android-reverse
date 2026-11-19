package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
class Bitmap2JpegBytes implements Operation<AbstractC0587In, Packet<byte[]>> {

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
    public static abstract class AbstractC0587In {
        @NonNull
        /* renamed from: of */
        public static AbstractC0587In m603of(@NonNull Packet<Bitmap> packet, int i10) {
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
    public Packet<byte[]> apply(@NonNull AbstractC0587In abstractC0587In) {
        Packet<Bitmap> packet = abstractC0587In.getPacket();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        packet.getData().compress(Bitmap.CompressFormat.JPEG, abstractC0587In.getJpegQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m701of(byteArray, exif, getOutputFormat(packet.getData()), packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }
}
