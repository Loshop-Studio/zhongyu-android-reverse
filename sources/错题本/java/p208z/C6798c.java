package p208z;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p024c0.C3210g;

/* renamed from: z.c */
/* loaded from: classes2.dex */
public final class C6798c extends OutputStream {

    /* renamed from: a */
    public final FileOutputStream f11469a;

    /* renamed from: b */
    public byte[] f11470b;

    /* renamed from: c */
    public final C3210g f11471c;

    /* renamed from: d */
    public int f11472d;

    public C6798c(FileOutputStream fileOutputStream, C3210g c3210g) {
        this.f11469a = fileOutputStream;
        this.f11471c = c3210g;
        this.f11470b = (byte[]) c3210g.m2155e(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f11469a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f11470b;
            if (bArr != null) {
                this.f11471c.m2160j(bArr);
                this.f11470b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f11472d;
        FileOutputStream fileOutputStream = this.f11469a;
        if (i > 0) {
            fileOutputStream.write(this.f11470b, 0, i);
            this.f11472d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f11470b;
        int i8 = this.f11472d;
        int i9 = i8 + 1;
        this.f11472d = i9;
        bArr[i8] = (byte) i;
        if (i9 != bArr.length || i9 <= 0) {
            return;
        }
        this.f11469a.write(bArr, 0, i9);
        this.f11472d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i8) throws IOException {
        int i9 = 0;
        do {
            int i10 = i8 - i9;
            int i11 = i + i9;
            int i12 = this.f11472d;
            FileOutputStream fileOutputStream = this.f11469a;
            if (i12 == 0 && i10 >= this.f11470b.length) {
                fileOutputStream.write(bArr, i11, i10);
                return;
            }
            int iMin = Math.min(i10, this.f11470b.length - i12);
            System.arraycopy(bArr, i11, this.f11470b, this.f11472d, iMin);
            int i13 = this.f11472d + iMin;
            this.f11472d = i13;
            i9 += iMin;
            byte[] bArr2 = this.f11470b;
            if (i13 == bArr2.length && i13 > 0) {
                fileOutputStream.write(bArr2, 0, i13);
                this.f11472d = 0;
            }
        } while (i9 < i8);
    }
}
