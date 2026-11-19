package p118o0;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p016b1.AbstractC4399a;
import p074i0.InterfaceC6497b;

/* renamed from: o0.r */
/* loaded from: classes3.dex */
public final class C7507r implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo2557a(InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo2558b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo2559c(ByteBuffer byteBuffer, InterfaceC6497b interfaceC6497b) {
        return mo2557a(AbstractC4399a.m1411g(byteBuffer), interfaceC6497b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo2560d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
