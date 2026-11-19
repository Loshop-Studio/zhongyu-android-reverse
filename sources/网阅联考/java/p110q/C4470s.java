package p110q;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p076j.C3794d;
import p076j.InterfaceC3791a;
import p098n.InterfaceC4393b;

/* renamed from: q.s */
/* loaded from: classes2.dex */
public class C4470s implements InterfaceC3791a {

    /* renamed from: a */
    public final InterfaceC4393b f5224a;

    public C4470s(InterfaceC4393b interfaceC4393b) {
        this.f5224a = interfaceC4393b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p076j.InterfaceC3791a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4941a(InputStream inputStream, File file, C3794d c3794d) throws Throwable {
        byte[] bArr = (byte[]) this.f5224a.mo5386d(65536, byte[].class);
        boolean z3 = false;
        ?? r12 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i4 = inputStream.read(bArr);
                        r12 = -1;
                        if (i4 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i4);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f5224a.put(bArr);
                        r12 = fileOutputStream;
                        return z3;
                    } catch (Throwable th) {
                        th = th;
                        r12 = fileOutputStream2;
                        if (r12 != 0) {
                            try {
                                r12.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f5224a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f5224a.put(bArr);
                z3 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z3;
    }
}
