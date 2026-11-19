package p226r;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p160l.C9230d;
import p160l.InterfaceC9227a;
import p193o.InterfaceC9498b;

/* renamed from: r.u */
/* loaded from: classes3.dex */
public class C9895u implements InterfaceC9227a {

    /* renamed from: a */
    public final InterfaceC9498b f19853a;

    public C9895u(InterfaceC9498b interfaceC9498b) {
        this.f19853a = interfaceC9498b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p160l.InterfaceC9227a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo16931b(InputStream inputStream, File file, C9230d c9230d) throws Throwable {
        byte[] bArr = (byte[]) this.f19853a.mo17614b(65536, byte[].class);
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
                        this.f19853a.put(bArr);
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
                        this.f19853a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f19853a.put(bArr);
                z10 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z10;
    }
}
