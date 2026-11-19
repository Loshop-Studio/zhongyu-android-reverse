package p303y;

import android.util.Log;
import com.bumptech.glide.load.AbstractC5400a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9498b;

/* renamed from: y.h */
/* loaded from: classes3.dex */
public class C10598h implements InterfaceC9231e {

    /* renamed from: a */
    public final List f20998a;

    /* renamed from: b */
    public final InterfaceC9231e f20999b;

    /* renamed from: c */
    public final InterfaceC9498b f21000c;

    public C10598h(List list, InterfaceC9231e interfaceC9231e, InterfaceC9498b interfaceC9498b) {
        this.f20998a = list;
        this.f20999b = interfaceC9231e;
        this.f21000c = interfaceC9498b;
    }

    /* renamed from: e */
    public static byte[] m19763e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(InputStream inputStream, int i10, int i11, C9230d c9230d) throws IOException {
        byte[] bArrM19763e = m19763e(inputStream);
        if (bArrM19763e == null) {
            return null;
        }
        return this.f20999b.mo3061a(ByteBuffer.wrap(bArrM19763e), i10, i11, c9230d);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(InputStream inputStream, C9230d c9230d) {
        return !((Boolean) c9230d.m16940c(AbstractC10597g.f20997b)).booleanValue() && AbstractC5400a.m2834f(this.f20998a, inputStream, this.f21000c) == ImageHeaderParser.ImageType.GIF;
    }
}
