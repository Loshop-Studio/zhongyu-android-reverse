package p055f0;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p180v0.AbstractC6654a;
import p202y.C6763f;
import p202y.InterfaceC6758a;

/* renamed from: f0.a0 */
/* loaded from: classes2.dex */
public final class C5492a0 implements InterfaceC5512q, InterfaceC6758a {

    /* renamed from: b */
    public static final C5492a0 f8492b = new C5492a0(0);

    /* renamed from: a */
    public final /* synthetic */ int f8493a;

    public /* synthetic */ C5492a0(int i) {
        this.f8493a = i;
    }

    /* renamed from: a */
    public static ByteArrayInputStream m4871a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* renamed from: b */
    public Class m4872b() {
        switch (this.f8493a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        switch (this.f8493a) {
            case 0:
                return C5494b0.f8497b;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return new C5500e0(c5519x.m4889a(C5501f.class, InputStream.class));
            case 2:
                return new C5495c(new C5492a0(1), 0);
            case 4:
                return new C5495c(new C5492a0(3), 0);
            case 6:
                return new C5494b0(1);
            case 10:
                return new C5521z(c5519x.m4889a(Uri.class, AssetFileDescriptor.class), 0);
            case 11:
                return new C5521z(c5519x.m4889a(Uri.class, ParcelFileDescriptor.class), 0);
            case 12:
                return new C5521z(c5519x.m4889a(Uri.class, InputStream.class), 0);
        }
    }

    @Override // p202y.InterfaceC6758a
    /* renamed from: s */
    public boolean mo124s(Object obj, File file, C6763f c6763f) throws Throwable {
        try {
            AbstractC6654a.m6313b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}
