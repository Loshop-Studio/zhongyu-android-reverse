package p114g2;

import com.umeng.analytics.pro.C6768ce;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: g2.a0 */
/* loaded from: classes4.dex */
public class C8004a0 extends AbstractC8008c0 {

    /* renamed from: a */
    public InputStream f13481a;

    /* renamed from: b */
    public OutputStream f13482b;

    public C8004a0(InputStream inputStream) {
        this.f13482b = null;
        this.f13481a = inputStream;
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: a */
    public int mo12559a(byte[] bArr, int i9, int i10) throws IOException, C6768ce {
        InputStream inputStream = this.f13481a;
        if (inputStream == null) {
            throw new C6768ce(1, "Cannot read from null inputStream");
        }
        try {
            int i11 = inputStream.read(bArr, i9, i10);
            if (i11 >= 0) {
                return i11;
            }
            throw new C6768ce(4);
        } catch (IOException e10) {
            throw new C6768ce(0, e10);
        }
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: d */
    public void mo12560d(byte[] bArr, int i9, int i10) throws IOException, C6768ce {
        OutputStream outputStream = this.f13482b;
        if (outputStream == null) {
            throw new C6768ce(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i9, i10);
        } catch (IOException e10) {
            throw new C6768ce(0, e10);
        }
    }

    public C8004a0(OutputStream outputStream) {
        this.f13481a = null;
        this.f13482b = outputStream;
    }
}
