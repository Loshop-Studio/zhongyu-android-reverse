package p001a0;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p055f0.C5492a0;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;

/* renamed from: a0.b */
/* loaded from: classes2.dex */
public final class C0002b implements InterfaceC6800e {

    /* renamed from: a */
    public final /* synthetic */ int f4a;

    /* renamed from: b */
    public final Comparable f5b;

    /* renamed from: c */
    public final Object f6c;

    /* renamed from: d */
    public Object f7d;

    public /* synthetic */ C0002b(int i, Comparable comparable, Object obj) {
        this.f4a = i;
        this.f5b = comparable;
        this.f6c = obj;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: a */
    public final void mo21a() throws IOException {
        switch (this.f4a) {
            case 0:
                InputStream inputStream = (InputStream) this.f7d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f7d).close();
                    break;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f7d;
                if (obj != null) {
                    try {
                        switch (((C5492a0) this.f6c).f8493a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                        break;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: b */
    public final Class mo22b() {
        switch (this.f4a) {
            case 0:
                return InputStream.class;
            case 1:
                ((C5492a0) this.f6c).getClass();
                return InputStream.class;
            default:
                return ((C5492a0) this.f6c).m4872b();
        }
    }

    @Override // p208z.InterfaceC6800e
    public final void cancel() {
        int i = this.f4a;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: d */
    public final DataSource mo23d() {
        switch (this.f4a) {
        }
        return DataSource.LOCAL;
    }

    @Override // p208z.InterfaceC6800e
    /* renamed from: e */
    public final void mo24e(Priority priority, InterfaceC6799d interfaceC6799d) throws Throwable {
        Object objOpen;
        switch (this.f4a) {
            case 0:
                try {
                    InputStream inputStreamM25h = m25h();
                    this.f7d = inputStreamM25h;
                    interfaceC6799d.mo121o(inputStreamM25h);
                    break;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
                    }
                    interfaceC6799d.mo109c(e);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamM4871a = C5492a0.m4871a((String) this.f5b);
                    this.f7d = byteArrayInputStreamM4871a;
                    interfaceC6799d.mo121o(byteArrayInputStreamM4871a);
                    break;
                } catch (IllegalArgumentException e4) {
                    interfaceC6799d.mo109c(e4);
                }
            default:
                try {
                    C5492a0 c5492a0 = (C5492a0) this.f6c;
                    File file = (File) this.f5b;
                    switch (c5492a0.f8493a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f7d = objOpen;
                    interfaceC6799d.mo121o(objOpen);
                    break;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e8);
                    }
                    interfaceC6799d.mo109c(e8);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0028: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[PHI: r7
      0x002f: PHI (r7v6 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:23:0x004e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.IOException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream m25h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0002b.m25h():java.io.InputStream");
    }

    /* renamed from: c */
    private final void m18c() {
    }

    /* renamed from: f */
    private final void m19f() {
    }

    /* renamed from: g */
    private final void m20g() {
    }
}
