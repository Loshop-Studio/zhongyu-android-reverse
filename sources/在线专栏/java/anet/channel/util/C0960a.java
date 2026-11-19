package anet.channel.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: anet.channel.util.a */
/* loaded from: classes.dex */
public class C0960a extends InputStream {

    /* renamed from: a */
    private InputStream f5470a;

    /* renamed from: b */
    private long f5471b = 0;

    public C0960a(InputStream inputStream) {
        this.f5470a = null;
        Objects.requireNonNull(inputStream, "input stream cannot be null");
        this.f5470a = inputStream;
    }

    /* renamed from: a */
    public long m4642a() {
        return this.f5471b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.f5471b++;
        return this.f5470a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = this.f5470a.read(bArr, i4, i5);
        if (i6 != -1) {
            this.f5471b += i6;
        }
        return i6;
    }
}
