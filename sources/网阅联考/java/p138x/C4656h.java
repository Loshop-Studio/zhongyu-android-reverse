package p138x;

import android.util.Log;
import com.bumptech.glide.load.AbstractC2864a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4393b;

/* renamed from: x.h */
/* loaded from: classes2.dex */
public class C4656h implements InterfaceC3795e {

    /* renamed from: a */
    public final List f5946a;

    /* renamed from: b */
    public final InterfaceC3795e f5947b;

    /* renamed from: c */
    public final InterfaceC4393b f5948c;

    public C4656h(List list, InterfaceC3795e interfaceC3795e, InterfaceC4393b interfaceC4393b) {
        this.f5946a = list;
        this.f5947b = interfaceC3795e;
        this.f5948c = interfaceC4393b;
    }

    /* renamed from: e */
    public static byte[] m6553e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i4 = inputStream.read(bArr);
                if (i4 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            }
        } catch (IOException e4) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e4);
            return null;
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(InputStream inputStream, int i4, int i5, C3794d c3794d) throws IOException {
        byte[] bArrM6553e = m6553e(inputStream);
        if (bArrM6553e == null) {
            return null;
        }
        return this.f5947b.mo1966b(ByteBuffer.wrap(bArrM6553e), i4, i5, c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(InputStream inputStream, C3794d c3794d) {
        return !((Boolean) c3794d.m4951c(AbstractC4655g.f5945b)).booleanValue() && AbstractC2864a.m1759d(this.f5946a, inputStream, this.f5948c) == ImageHeaderParser.ImageType.GIF;
    }
}
