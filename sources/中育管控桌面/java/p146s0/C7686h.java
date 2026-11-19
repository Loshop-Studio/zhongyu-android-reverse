package p146s0;

import android.util.Log;
import com.bumptech.glide.load.AbstractC4687a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6497b;

/* renamed from: s0.h */
/* loaded from: classes3.dex */
public class C7686h implements InterfaceC6286e {

    /* renamed from: a */
    public final List f10147a;

    /* renamed from: b */
    public final InterfaceC6286e f10148b;

    /* renamed from: c */
    public final InterfaceC6497b f10149c;

    public C7686h(List list, InterfaceC6286e interfaceC6286e, InterfaceC6497b interfaceC6497b) {
        this.f10147a = list;
        this.f10148b = interfaceC6286e;
        this.f10149c = interfaceC6497b;
    }

    /* renamed from: e */
    public static byte[] m9142e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            }
        } catch (IOException e6) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            return null;
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(InputStream inputStream, int i6, int i7, C6285d c6285d) throws IOException {
        byte[] bArrM9142e = m9142e(inputStream);
        if (bArrM9142e == null) {
            return null;
        }
        return this.f10148b.mo2796a(ByteBuffer.wrap(bArrM9142e), i6, i7, c6285d);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(InputStream inputStream, C6285d c6285d) {
        return !((Boolean) c6285d.m6420c(AbstractC7685g.f10146b)).booleanValue() && AbstractC4687a.m2568f(this.f10147a, inputStream, this.f10149c) == ImageHeaderParser.ImageType.GIF;
    }
}
