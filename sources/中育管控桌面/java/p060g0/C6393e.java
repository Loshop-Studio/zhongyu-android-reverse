package p060g0;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC4687a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p074i0.InterfaceC6497b;

/* renamed from: g0.e */
/* loaded from: classes3.dex */
public class C6393e {

    /* renamed from: f */
    public static final C6389a f8017f = new C6389a();

    /* renamed from: a */
    public final C6389a f8018a;

    /* renamed from: b */
    public final InterfaceC6392d f8019b;

    /* renamed from: c */
    public final InterfaceC6497b f8020c;

    /* renamed from: d */
    public final ContentResolver f8021d;

    /* renamed from: e */
    public final List f8022e;

    public C6393e(List list, InterfaceC6392d interfaceC6392d, InterfaceC6497b interfaceC6497b, ContentResolver contentResolver) {
        this(list, f8017f, interfaceC6392d, interfaceC6497b, contentResolver);
    }

    /* renamed from: a */
    public int m6909a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f8021d.openInputStream(uri);
                int iM2564b = AbstractC4687a.m2564b(this.f8022e, inputStreamOpenInputStream, this.f8020c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM2564b;
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
    public final java.lang.String m6910b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            g0.d r1 = r4.f8019b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo6908a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: p060g0.C6393e.m6910b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m6911c(File file) {
        return this.f8018a.m6895a(file) && 0 < this.f8018a.m6897c(file);
    }

    /* renamed from: d */
    public InputStream m6912d(Uri uri) throws Throwable {
        String strM6910b = m6910b(uri);
        if (TextUtils.isEmpty(strM6910b)) {
            return null;
        }
        File fileM6896b = this.f8018a.m6896b(strM6910b);
        if (!m6911c(fileM6896b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM6896b);
        try {
            return this.f8021d.openInputStream(uriFromFile);
        } catch (NullPointerException e6) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e6));
        }
    }

    public C6393e(List list, C6389a c6389a, InterfaceC6392d interfaceC6392d, InterfaceC6497b interfaceC6497b, ContentResolver contentResolver) {
        this.f8018a = c6389a;
        this.f8019b = interfaceC6392d;
        this.f8020c = interfaceC6497b;
        this.f8021d = contentResolver;
        this.f8022e = list;
    }
}
