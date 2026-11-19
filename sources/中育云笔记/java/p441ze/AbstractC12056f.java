package p441ze;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.apache.commons.net.p282io.CopyStreamException;

/* renamed from: ze.f */
/* loaded from: classes6.dex */
public abstract class AbstractC12056f {
    /* renamed from: a */
    public static void m26695a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m26696b(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public static long m26697c(InputStream inputStream, OutputStream outputStream, int i10, long j10, InterfaceC12053c interfaceC12053c, boolean z10) throws IOException {
        IOException iOException;
        if (i10 <= 0) {
            i10 = 1024;
        }
        byte[] bArr = new byte[i10];
        long j11 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                if (i11 == 0) {
                    int i12 = inputStream.read();
                    if (i12 < 0) {
                        break;
                    }
                    outputStream.write(i12);
                    if (z10) {
                        outputStream.flush();
                    }
                    long j12 = j11 + 1;
                    if (interfaceC12053c != null) {
                        try {
                            interfaceC12053c.mo26412a(j12, 1, j10);
                        } catch (IOException e10) {
                            iOException = e10;
                            j11 = j12;
                            throw new CopyStreamException("IOException caught while copying.", j11, iOException);
                        }
                    }
                    j11 = j12;
                } else {
                    outputStream.write(bArr, 0, i11);
                    if (z10) {
                        outputStream.flush();
                    }
                    long j13 = j11 + i11;
                    if (interfaceC12053c != null) {
                        try {
                            interfaceC12053c.mo26412a(j13, i11, j10);
                        } catch (IOException e11) {
                            iOException = e11;
                            j11 = j13;
                            throw new CopyStreamException("IOException caught while copying.", j11, iOException);
                        }
                    }
                    j11 = j13;
                }
            } catch (IOException e12) {
                iOException = e12;
            }
        }
        return j11;
    }
}
