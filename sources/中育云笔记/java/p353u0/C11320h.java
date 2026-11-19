package p353u0;

import android.util.Log;
import com.bumptech.glide.load.AbstractC5819a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9770b;

/* renamed from: u0.h */
/* loaded from: classes3.dex */
public class C11320h implements InterfaceC9439f {

    /* renamed from: a */
    public final List f27131a;

    /* renamed from: b */
    public final InterfaceC9439f f27132b;

    /* renamed from: c */
    public final InterfaceC9770b f27133c;

    public C11320h(List list, InterfaceC9439f interfaceC9439f, InterfaceC9770b interfaceC9770b) {
        this.f27131a = list;
        this.f27132b = interfaceC9439f;
        this.f27133c = interfaceC9770b;
    }

    /* renamed from: e */
    public static byte[] m25270e(InputStream inputStream) throws IOException {
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

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(InputStream inputStream, int i10, int i11, C9438e c9438e) throws IOException {
        byte[] bArrM25270e = m25270e(inputStream);
        if (bArrM25270e == null) {
            return null;
        }
        return this.f27132b.mo4266b(ByteBuffer.wrap(bArrM25270e), i10, i11, c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(InputStream inputStream, C9438e c9438e) {
        return !((Boolean) c9438e.m18626c(AbstractC11319g.f27130b)).booleanValue() && AbstractC5819a.m4040f(this.f27131a, inputStream, this.f27133c) == ImageHeaderParser.ImageType.GIF;
    }
}
