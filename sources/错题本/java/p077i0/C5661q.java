package p077i0;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p024c0.C3210g;
import p202y.InterfaceC6759b;

/* renamed from: i0.q */
/* loaded from: classes2.dex */
public final class C5661q implements InterfaceC6759b {
    @Override // p202y.InterfaceC6759b
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo4982a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p202y.InterfaceC6759b
    /* renamed from: b */
    public final ImageHeaderParser$ImageType mo4983b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p202y.InterfaceC6759b
    /* renamed from: c */
    public final int mo4984c(InputStream inputStream, C3210g c3210g) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
