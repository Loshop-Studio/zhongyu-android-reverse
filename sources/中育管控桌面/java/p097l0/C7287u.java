package p097l0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p053f0.C6285d;
import p053f0.InterfaceC6282a;
import p074i0.InterfaceC6497b;

/* renamed from: l0.u */
/* loaded from: classes3.dex */
public class C7287u implements InterfaceC6282a {

    /* renamed from: a */
    public final InterfaceC6497b f9264a;

    public C7287u(InterfaceC6497b interfaceC6497b) {
        this.f9264a = interfaceC6497b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p053f0.InterfaceC6282a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo6411a(InputStream inputStream, File file, C6285d c6285d) throws Throwable {
        byte[] bArr = (byte[]) this.f9264a.mo7190c(65536, byte[].class);
        boolean z6 = false;
        ?? r12 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i6 = inputStream.read(bArr);
                        r12 = -1;
                        if (i6 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i6);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f9264a.put(bArr);
                        r12 = fileOutputStream;
                        return z6;
                    } catch (Throwable th) {
                        th = th;
                        r12 = fileOutputStream2;
                        if (r12 != 0) {
                            try {
                                r12.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f9264a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f9264a.put(bArr);
                z6 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z6;
    }
}
