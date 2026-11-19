package p228s0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p162m0.C8539d;
import p162m0.InterfaceC8536a;
import p195p0.InterfaceC8802b;

/* renamed from: s0.u */
/* loaded from: classes3.dex */
public class C9119u implements InterfaceC8536a {

    /* renamed from: a */
    public final InterfaceC8802b f15818a;

    public C9119u(InterfaceC8802b interfaceC8802b) {
        this.f15818a = interfaceC8802b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p162m0.InterfaceC8536a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo14048a(InputStream inputStream, File file, C8539d c8539d) throws Throwable {
        byte[] bArr = (byte[]) this.f15818a.mo14705c(65536, byte[].class);
        boolean z9 = false;
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
                        this.f15818a.put(bArr);
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
                        this.f15818a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                this.f15818a.put(bArr);
                z9 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
        return z9;
    }
}
