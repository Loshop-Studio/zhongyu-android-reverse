package p111m0;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p016b0.InterfaceC3072g0;
import p024c0.C3210g;
import p169t6.AbstractC6600a;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: m0.g */
/* loaded from: classes2.dex */
public final class C6084g implements InterfaceC6764g {

    /* renamed from: a */
    public final ArrayList f9710a;

    /* renamed from: b */
    public final C6078a f9711b;

    /* renamed from: c */
    public final C3210g f9712c;

    public C6084g(ArrayList arrayList, C6078a c6078a, C3210g c3210g) {
        this.f9710a = arrayList;
        this.f9711b = c6078a;
        this.f9712c = c3210g;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        return !((Boolean) c6763f.m6436c(AbstractC6083f.f9709b)).booleanValue() && AbstractC6600a.m6235g(this.f9710a, (InputStream) obj, this.f9712c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i9 = inputStream.read(bArr);
                if (i9 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i9);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f9711b.mo4971b(ByteBuffer.wrap(byteArray), i, i8, c6763f);
    }
}
