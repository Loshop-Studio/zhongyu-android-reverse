package androidx.camera.core.imagecapture;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class Image2JpegBytes implements Operation<AbstractC0333In, Packet<byte[]>> {
    private final JpegMetadataCorrector mJpegMetadataCorrector;

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.Image2JpegBytes$In */
    public static abstract class AbstractC0333In {
        @NonNull
        /* renamed from: of */
        public static AbstractC0333In m624of(@NonNull Packet<ImageProxy> packet, int i) {
            return new AutoValue_Image2JpegBytes_In(packet, i);
        }

        public abstract int getJpegQuality();

        public abstract Packet<ImageProxy> getPacket();
    }

    public Image2JpegBytes(@NonNull Quirks quirks) {
        this.mJpegMetadataCorrector = new JpegMetadataCorrector(quirks);
    }

    private static Exif extractExif(@NonNull byte[] bArr) throws ImageCaptureException {
        try {
            return Exif.createFromInputStream(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    private Packet<byte[]> processJpegImage(@NonNull AbstractC0333In abstractC0333In, int i) {
        Packet<ImageProxy> packet = abstractC0333In.getPacket();
        byte[] bArrJpegImageToJpegByteArray = this.mJpegMetadataCorrector.jpegImageToJpegByteArray(packet.getData());
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        return Packet.m712of(bArrJpegImageToJpegByteArray, exif, i, packet.getSize(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult());
    }

    private Packet<byte[]> processYuvImage(@NonNull AbstractC0333In abstractC0333In) throws ImageCaptureException {
        Packet<ImageProxy> packet = abstractC0333In.getPacket();
        ImageProxy data = packet.getData();
        Rect cropRect = packet.getCropRect();
        try {
            byte[] bArrYuvImageToJpegByteArray = ImageUtil.yuvImageToJpegByteArray(data, cropRect, abstractC0333In.getJpegQuality(), packet.getRotationDegrees());
            return Packet.m712of(bArrYuvImageToJpegByteArray, extractExif(bArrYuvImageToJpegByteArray), 256, new Size(cropRect.width(), cropRect.height()), new Rect(0, 0, cropRect.width(), cropRect.height()), packet.getRotationDegrees(), TransformUtils.updateSensorToBufferTransform(packet.getSensorToBufferTransform(), cropRect), packet.getCameraCaptureResult());
        } catch (ImageUtil.CodecFailedException e) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public Packet<byte[]> apply(@NonNull AbstractC0333In abstractC0333In) throws ImageCaptureException {
        Packet<byte[]> packetProcessYuvImage;
        try {
            int format = abstractC0333In.getPacket().getFormat();
            if (format != 35) {
                if (format != 256 && format != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + format);
                }
                packetProcessYuvImage = processJpegImage(abstractC0333In, format);
            } else {
                packetProcessYuvImage = processYuvImage(abstractC0333In);
            }
            abstractC0333In.getPacket().getData().close();
            return packetProcessYuvImage;
        } catch (Throwable th) {
            abstractC0333In.getPacket().getData().close();
            throw th;
        }
    }
}
