package p301z0;

import android.util.Log;
import com.bumptech.glide.load.AbstractC5351a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8802b;

/* renamed from: z0.h */
/* loaded from: classes3.dex */
public class C9971h implements InterfaceC8540e {

    /* renamed from: a */
    public final List f17827a;

    /* renamed from: b */
    public final InterfaceC8540e f17828b;

    /* renamed from: c */
    public final InterfaceC8802b f17829c;

    public C9971h(List list, InterfaceC8540e interfaceC8540e, InterfaceC8802b interfaceC8802b) {
        this.f17827a = list;
        this.f17828b = interfaceC8540e;
        this.f17829c = interfaceC8802b;
    }

    /* renamed from: e */
    public static byte[] m16794e(InputStream inputStream) throws IOException {
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

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(InputStream inputStream, int i10, int i11, C8539d c8539d) throws IOException {
        byte[] bArrM16794e = m16794e(inputStream);
        if (bArrM16794e == null) {
            return null;
        }
        return this.f17828b.mo3617b(ByteBuffer.wrap(bArrM16794e), i10, i11, c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(InputStream inputStream, C8539d c8539d) {
        return !((Boolean) c8539d.m14057c(AbstractC9970g.f17826b)).booleanValue() && AbstractC5351a.m3387f(this.f17827a, inputStream, this.f17829c) == ImageHeaderParser.ImageType.GIF;
    }
}
