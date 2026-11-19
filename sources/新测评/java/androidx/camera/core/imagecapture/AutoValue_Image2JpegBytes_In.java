package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.processing.Packet;

/* loaded from: classes.dex */
final class AutoValue_Image2JpegBytes_In extends Image2JpegBytes.AbstractC0532In {
    private final int jpegQuality;
    private final Packet<ImageProxy> packet;

    public AutoValue_Image2JpegBytes_In(Packet<ImageProxy> packet, int i10) {
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
        if (obj instanceof Image2JpegBytes.AbstractC0532In) {
            Image2JpegBytes.AbstractC0532In abstractC0532In = (Image2JpegBytes.AbstractC0532In) obj;
            if (this.packet.equals(abstractC0532In.getPacket()) && this.jpegQuality == abstractC0532In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0532In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0532In
    public Packet<ImageProxy> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", jpegQuality=" + this.jpegQuality + "}";
    }
}
