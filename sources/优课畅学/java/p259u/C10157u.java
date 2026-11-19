package p259u;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p116h0.AbstractC8697a;
import p193o.InterfaceC9498b;

/* renamed from: u.u */
/* loaded from: classes3.dex */
public final class C10157u implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo2823a(ByteBuffer byteBuffer, InterfaceC9498b interfaceC9498b) {
        return mo2825c(AbstractC8697a.m14154g(byteBuffer), interfaceC9498b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo2824b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo2825c(InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo2826d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
