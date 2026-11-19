package p254n0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p168h0.C9438e;
import p168h0.InterfaceC9434a;
import p213k0.InterfaceC9770b;

/* renamed from: n0.u */
/* loaded from: classes3.dex */
public class C10307u implements InterfaceC9434a {

    /* renamed from: a */
    public final InterfaceC9770b f24576a;

    public C10307u(InterfaceC9770b interfaceC9770b) {
        this.f24576a = interfaceC9770b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p168h0.InterfaceC9434a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo18616a(InputStream inputStream, File file, C9438e c9438e) throws Throwable {
        byte[] bArr = (byte[]) this.f24576a.mo19703c(65536, byte[].class);
        boolean z10 = false;
        ?? r12 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        r12 = -1;
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i10);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f24576a.put(bArr);
                        r12 = fileOutputStream;
                        return z10;
                    } catch (Throwable th) {
                        th = th;
                        r12 = fileOutputStream2;
                        if (r12 != 0) {
                            try {
                                r12.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f24576a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f24576a.put(bArr);
                z10 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z10;
    }
}
