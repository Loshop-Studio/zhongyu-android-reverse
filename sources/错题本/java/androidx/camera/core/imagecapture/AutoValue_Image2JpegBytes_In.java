package androidx.camera.core.imagecapture;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.processing.Packet;

/* loaded from: classes.dex */
final class AutoValue_Image2JpegBytes_In extends Image2JpegBytes.AbstractC0333In {
    private final int jpegQuality;
    private final Packet<ImageProxy> packet;

    public AutoValue_Image2JpegBytes_In(Packet<ImageProxy> packet, int i) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        this.jpegQuality = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Image2JpegBytes.AbstractC0333In) {
            Image2JpegBytes.AbstractC0333In abstractC0333In = (Image2JpegBytes.AbstractC0333In) obj;
            if (this.packet.equals(abstractC0333In.getPacket()) && this.jpegQuality == abstractC0333In.getJpegQuality()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0333In
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.imagecapture.Image2JpegBytes.AbstractC0333In
    public Packet<ImageProxy> getPacket() {
        return this.packet;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.jpegQuality;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("In{packet=");
        sb.append(this.packet);
        sb.append(", jpegQuality=");
        return AbstractC0037f.m90o(sb, "}", this.jpegQuality);
    }
}
