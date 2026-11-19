package p268v0;

import android.util.Log;
import com.bumptech.glide.load.AbstractC5477a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8865b;

/* renamed from: v0.h */
/* loaded from: classes3.dex */
public class C9747h implements InterfaceC8085e {

    /* renamed from: a */
    public final List f17220a;

    /* renamed from: b */
    public final InterfaceC8085e f17221b;

    /* renamed from: c */
    public final InterfaceC8865b f17222c;

    public C9747h(List list, InterfaceC8085e interfaceC8085e, InterfaceC8865b interfaceC8865b) {
        this.f17220a = list;
        this.f17221b = interfaceC8085e;
        this.f17222c = interfaceC8865b;
    }

    /* renamed from: e */
    public static byte[] m16290e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i9 = inputStream.read(bArr);
                if (i9 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i9);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(InputStream inputStream, int i9, int i10, C8084d c8084d) throws IOException {
        byte[] bArrM16290e = m16290e(inputStream);
        if (bArrM16290e == null) {
            return null;
        }
        return this.f17221b.mo3290b(ByteBuffer.wrap(bArrM16290e), i9, i10, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(InputStream inputStream, C8084d c8084d) {
        return !((Boolean) c8084d.m12908c(AbstractC9746g.f17219b)).booleanValue() && AbstractC5477a.m3085e(this.f17220a, inputStream, this.f17222c) == ImageHeaderParser.ImageType.GIF;
    }
}
