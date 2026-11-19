package p142j0;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5477a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p164l0.InterfaceC8865b;

/* renamed from: j0.e */
/* loaded from: classes3.dex */
public class C8203e {

    /* renamed from: f */
    public static final C8199a f14213f = new C8199a();

    /* renamed from: a */
    public final C8199a f14214a;

    /* renamed from: b */
    public final InterfaceC8202d f14215b;

    /* renamed from: c */
    public final InterfaceC8865b f14216c;

    /* renamed from: d */
    public final ContentResolver f14217d;

    /* renamed from: e */
    public final List f14218e;

    public C8203e(List list, InterfaceC8202d interfaceC8202d, InterfaceC8865b interfaceC8865b, ContentResolver contentResolver) {
        this(list, f14213f, interfaceC8202d, interfaceC8865b, contentResolver);
    }

    /* renamed from: a */
    public int m13217a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f14217d.openInputStream(uri);
                int iM3082b = AbstractC5477a.m3082b(this.f14218e, inputStreamOpenInputStream, this.f14216c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM3082b;
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
    public final java.lang.String m13218b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            j0.d r1 = r4.f14215b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo13216a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: p142j0.C8203e.m13218b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m13219c(File file) {
        return this.f14214a.m13204a(file) && 0 < this.f14214a.m13206c(file);
    }

    /* renamed from: d */
    public InputStream m13220d(Uri uri) throws Throwable {
        String strM13218b = m13218b(uri);
        if (TextUtils.isEmpty(strM13218b)) {
            return null;
        }
        File fileM13205b = this.f14214a.m13205b(strM13218b);
        if (!m13219c(fileM13205b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM13205b);
        try {
            return this.f14217d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public C8203e(List list, C8199a c8199a, InterfaceC8202d interfaceC8202d, InterfaceC8865b interfaceC8865b, ContentResolver contentResolver) {
        this.f14214a = c8199a;
        this.f14215b = interfaceC8202d;
        this.f14216c = interfaceC8865b;
        this.f14217d = contentResolver;
        this.f14218e = list;
    }
}
