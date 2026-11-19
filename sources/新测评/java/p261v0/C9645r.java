package p261v0;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p117i1.AbstractC7642a;
import p195p0.InterfaceC8802b;

/* renamed from: v0.r */
/* loaded from: classes3.dex */
public final class C9645r implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo3376a(ByteBuffer byteBuffer, InterfaceC8802b interfaceC8802b) {
        return mo3378c(AbstractC7642a.m12656g(byteBuffer), interfaceC8802b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo3377b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo3378c(InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo3379d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
