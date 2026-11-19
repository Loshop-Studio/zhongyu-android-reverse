package p171m;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5400a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p193o.InterfaceC9498b;

/* renamed from: m.e */
/* loaded from: classes3.dex */
public class C9290e {

    /* renamed from: f */
    public static final C9286a f18307f = new C9286a();

    /* renamed from: a */
    public final C9286a f18308a;

    /* renamed from: b */
    public final InterfaceC9289d f18309b;

    /* renamed from: c */
    public final InterfaceC9498b f18310c;

    /* renamed from: d */
    public final ContentResolver f18311d;

    /* renamed from: e */
    public final List f18312e;

    public C9290e(List list, InterfaceC9289d interfaceC9289d, InterfaceC9498b interfaceC9498b, ContentResolver contentResolver) {
        this(list, f18307f, interfaceC9289d, interfaceC9498b, contentResolver);
    }

    /* renamed from: a */
    public int m17091a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f18311d.openInputStream(uri);
                int iM2830b = AbstractC5400a.m2830b(this.f18312e, inputStreamOpenInputStream, this.f18310c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM2830b;
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
    public final java.lang.String m17092b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            m.d r1 = r4.f18309b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo17090a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: p171m.C9290e.m17092b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m17093c(File file) {
        return this.f18308a.m17077a(file) && 0 < this.f18308a.m17079c(file);
    }

    /* renamed from: d */
    public InputStream m17094d(Uri uri) throws Throwable {
        String strM17092b = m17092b(uri);
        if (TextUtils.isEmpty(strM17092b)) {
            return null;
        }
        File fileM17078b = this.f18308a.m17078b(strM17092b);
        if (!m17093c(fileM17078b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM17078b);
        try {
            return this.f18311d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public C9290e(List list, C9286a c9286a, InterfaceC9289d interfaceC9289d, InterfaceC9498b interfaceC9498b, ContentResolver contentResolver) {
        this.f18308a = c9286a;
        this.f18309b = interfaceC9289d;
        this.f18310c = interfaceC9498b;
        this.f18311d = contentResolver;
        this.f18312e = list;
    }
}
