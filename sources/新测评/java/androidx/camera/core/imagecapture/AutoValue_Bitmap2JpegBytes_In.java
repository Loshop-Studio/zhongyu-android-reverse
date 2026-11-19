package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.processing.Packet;

/* loaded from: classes.dex */
final class AutoValue_Bitmap2JpegBytes_In extends Bitmap2JpegBytes.AbstractC0528In {
    private final int jpegQuality;
    private final Packet<Bitmap> packet;

    public AutoValue_Bitmap2JpegBytes_In(Packet<Bitmap> packet, int i10) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Bitmap2JpegBytes.AbstractC0528In) {
            Bitmap2JpegBytes.AbstractC0528In abstractC0528In = (Bitmap2JpegBytes.AbstractC0528In) obj;
            if (this.packet.equals(abstractC0528In.getPacket()) && this.jpegQuality == abstractC0528In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0528In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Bitmap2JpegBytes.AbstractC0528In
    public Packet<Bitmap> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }
}
