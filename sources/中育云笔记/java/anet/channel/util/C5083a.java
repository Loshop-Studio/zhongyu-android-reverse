package anet.channel.util;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: anet.channel.util.a */
/* loaded from: classes3.dex */
public class C5083a extends InputStream {

    /* renamed from: a */
    private InputStream f2748a;

    /* renamed from: b */
    private long f2749b = 0;

    public C5083a(InputStream inputStream) {
        this.f2748a = null;
        if (inputStream == null) {
            throw new NullPointerException("input stream cannot be null");
        }
        this.f2748a = inputStream;
    }

    /* renamed from: a */
    public long m2533a() {
        return this.f2749b;
    }

    @Override // java.io.InputStream
    public int read() {
        this.f2749b++;
        return this.f2748a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f2748a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f2749b += i12;
        }
        return i12;
    }
}
