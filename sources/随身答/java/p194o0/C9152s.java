package p194o0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p122h0.C8084d;
import p122h0.InterfaceC8081a;
import p164l0.InterfaceC8865b;

/* renamed from: o0.s */
/* loaded from: classes3.dex */
public class C9152s implements InterfaceC8081a {

    /* renamed from: a */
    public final InterfaceC8865b f15455a;

    public C9152s(InterfaceC8865b interfaceC8865b) {
        this.f15455a = interfaceC8865b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p122h0.InterfaceC8081a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo12898a(InputStream inputStream, File file, C8084d c8084d) throws Throwable {
        byte[] bArr = (byte[]) this.f15455a.mo13725c(65536, byte[].class);
        boolean z9 = false;
        ?? r12 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i9 = inputStream.read(bArr);
                        r12 = -1;
                        if (i9 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i9);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f15455a.put(bArr);
                        r12 = fileOutputStream;
                        return z9;
                    } catch (Throwable th) {
                        th = th;
                        r12 = fileOutputStream2;
                        if (r12 != 0) {
                            try {
                                r12.close();
                            } catch (IOException unused3) {
                            }
                        }
                        this.f15455a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f15455a.put(bArr);
                z9 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z9;
    }
}
