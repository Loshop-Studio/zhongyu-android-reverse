package p173n0;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5351a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p195p0.InterfaceC8802b;

/* renamed from: n0.e */
/* loaded from: classes3.dex */
public class C8616e {

    /* renamed from: f */
    public static final C8612a f14264f = new C8612a();

    /* renamed from: a */
    public final C8612a f14265a;

    /* renamed from: b */
    public final InterfaceC8615d f14266b;

    /* renamed from: c */
    public final InterfaceC8802b f14267c;

    /* renamed from: d */
    public final ContentResolver f14268d;

    /* renamed from: e */
    public final List f14269e;

    public C8616e(List list, InterfaceC8615d interfaceC8615d, InterfaceC8802b interfaceC8802b, ContentResolver contentResolver) {
        this(list, f14264f, interfaceC8615d, interfaceC8802b, contentResolver);
    }

    /* renamed from: a */
    public int m14187a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f14268d.openInputStream(uri);
                int iM3383b = AbstractC5351a.m3383b(this.f14269e, inputStreamOpenInputStream, this.f14267c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM3383b;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m14188b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            n0.d r1 = r4.f14266b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo14186a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L36
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L36
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L30
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L18
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            return r0
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p173n0.C8616e.m14188b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m14189c(File file) {
        return this.f14265a.m14173a(file) && 0 < this.f14265a.m14175c(file);
    }

    /* renamed from: d */
    public InputStream m14190d(Uri uri) throws Throwable {
        String strM14188b = m14188b(uri);
        if (TextUtils.isEmpty(strM14188b)) {
            return null;
        }
        File fileM14174b = this.f14265a.m14174b(strM14188b);
        if (!m14189c(fileM14174b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM14174b);
        try {
            return this.f14268d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public C8616e(List list, C8612a c8612a, InterfaceC8615d interfaceC8615d, InterfaceC8802b interfaceC8802b, ContentResolver contentResolver) {
        this.f14265a = c8612a;
        this.f14266b = interfaceC8615d;
        this.f14267c = interfaceC8802b;
        this.f14268d = contentResolver;
        this.f14269e = list;
    }
}
