package p329s1;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.danikula.videocache.ProxyCacheException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import p340t1.C11201b;

/* renamed from: s1.e */
/* loaded from: classes3.dex */
public class C11038e extends AbstractC11046m {

    /* renamed from: i */
    public final C11042i f26620i;

    /* renamed from: j */
    public final C11201b f26621j;

    /* renamed from: k */
    public InterfaceC11035b f26622k;

    public C11038e(C11042i c11042i, C11201b c11201b) {
        super(c11042i, c11201b);
        this.f26621j = c11201b;
        this.f26620i = c11042i;
    }

    @Override // p329s1.AbstractC11046m
    /* renamed from: g */
    public void mo24393g(int i10) {
        InterfaceC11035b interfaceC11035b = this.f26622k;
        if (interfaceC11035b != null) {
            interfaceC11035b.onCacheAvailable(this.f26621j.f26889b, this.f26620i.m24451e(), i10);
        }
    }

    /* renamed from: p */
    public final String m24394p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: q */
    public final boolean m24395q(C11037d c11037d) {
        long length = this.f26620i.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && c11037d.f26619c && ((float) c11037d.f26618b) > ((float) this.f26621j.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    /* renamed from: r */
    public final String m24396r(C11037d c11037d) {
        String strM24450d = this.f26620i.m24450d();
        boolean zIsEmpty = TextUtils.isEmpty(strM24450d);
        long jAvailable = this.f26621j.isCompleted() ? this.f26621j.available() : this.f26620i.length();
        boolean z10 = false;
        boolean z11 = jAvailable >= 0;
        boolean z12 = c11037d.f26619c;
        long j10 = z12 ? jAvailable - c11037d.f26618b : jAvailable;
        if (z11 && z12) {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c11037d.f26619c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb2.append("Accept-Ranges: bytes\n");
        sb2.append(z11 ? m24394p("Content-Length: %d\n", Long.valueOf(j10)) : "");
        sb2.append(z10 ? m24394p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(c11037d.f26618b), Long.valueOf(jAvailable - 1), Long.valueOf(jAvailable)) : "");
        sb2.append(zIsEmpty ? "" : m24394p("Content-Type: %s\n", strM24450d));
        sb2.append(SignParameters.NEW_LINE);
        return sb2.toString();
    }

    /* renamed from: s */
    public void m24397s(C11037d c11037d, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(m24396r(c11037d).getBytes(StandardCharsets.UTF_8));
        long j10 = c11037d.f26618b;
        if (m24395q(c11037d)) {
            m24399u(bufferedOutputStream, j10);
        } else {
            m24400v(bufferedOutputStream, j10);
        }
    }

    /* renamed from: t */
    public void m24398t(InterfaceC11035b interfaceC11035b) {
        this.f26622k = interfaceC11035b;
    }

    /* renamed from: u */
    public final void m24399u(OutputStream outputStream, long j10) throws IOException, ProxyCacheException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iM24477j = m24477j(bArr, j10, 8192);
            if (iM24477j == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iM24477j);
                j10 += iM24477j;
            }
        }
    }

    /* renamed from: v */
    public final void m24400v(OutputStream outputStream, long j10) {
        C11042i c11042i = new C11042i(this.f26620i);
        try {
            c11042i.mo24447a(j10);
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = c11042i.read(bArr);
                if (i10 == -1) {
                    outputStream.flush();
                    c11042i.close();
                    return;
                }
                outputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            c11042i.close();
            throw th;
        }
    }
}
