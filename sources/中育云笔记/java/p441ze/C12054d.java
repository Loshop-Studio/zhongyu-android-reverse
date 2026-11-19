package p441ze;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: ze.d */
/* loaded from: classes6.dex */
public final class C12054d extends PushbackInputStream {

    /* renamed from: d */
    public static final boolean f28438d;

    /* renamed from: e */
    public static final String f28439e;

    /* renamed from: f */
    public static final byte[] f28440f;

    /* renamed from: c */
    public int f28441c;

    static {
        String property = System.getProperty("line.separator");
        f28439e = property;
        f28438d = property.equals("\r\n");
        f28440f = property.getBytes(StandardCharsets.US_ASCII);
    }

    public C12054d(InputStream inputStream) {
        super(inputStream, f28440f.length + 1);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((PushbackInputStream) this).in != null) {
            return (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos) + ((PushbackInputStream) this).in.available();
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return f28438d ? super.read() : readInt();
    }

    public final int readInt() throws IOException {
        int i10 = super.read();
        if (i10 != 13) {
            return i10;
        }
        int i11 = super.read();
        if (i11 != 10) {
            if (i11 != -1) {
                unread(i11);
            }
            return 13;
        }
        unread(f28440f);
        this.f28441c--;
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (f28438d) {
            return super.read(bArr, i10, i11);
        }
        if (i11 < 1) {
            return 0;
        }
        int iAvailable = available();
        if (i11 > iAvailable) {
            i11 = iAvailable;
        }
        this.f28441c = i11;
        if (i11 < 1) {
            this.f28441c = 1;
        }
        int i13 = readInt();
        if (i13 == -1) {
            return -1;
        }
        int i14 = i10;
        while (true) {
            i12 = i14 + 1;
            bArr[i14] = (byte) i13;
            int i15 = this.f28441c - 1;
            this.f28441c = i15;
            if (i15 <= 0 || (i13 = readInt()) == -1) {
                break;
            }
            i14 = i12;
        }
        return i12 - i10;
    }
}
