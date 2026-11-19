package p298q0;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p109d1.AbstractC8900a;
import p213k0.InterfaceC9770b;

/* renamed from: q0.q */
/* loaded from: classes3.dex */
public final class C10708q implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo4029a(InputStream inputStream, InterfaceC9770b interfaceC9770b) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo4030b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo4031c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo4032d(ByteBuffer byteBuffer, InterfaceC9770b interfaceC9770b) {
        return mo4029a(AbstractC8900a.m17441g(byteBuffer), interfaceC9770b);
    }
}
