package p441ze;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: ze.e */
/* loaded from: classes6.dex */
public final class C12055e extends FilterOutputStream {

    /* renamed from: c */
    public boolean f28442c;

    public C12055e(OutputStream outputStream) {
        super(outputStream);
        this.f28442c = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        if (i10 != 10) {
            if (i10 == 13) {
                this.f28442c = true;
                ((FilterOutputStream) this).out.write(13);
                return;
            }
        } else if (!this.f28442c) {
            ((FilterOutputStream) this).out.write(13);
        }
        this.f28442c = false;
        ((FilterOutputStream) this).out.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int i12 = i11 - 1;
            if (i11 > 0) {
                int i13 = i10 + 1;
                write(bArr[i10]);
                i10 = i13;
                i11 = i12;
            }
        }
    }
}
