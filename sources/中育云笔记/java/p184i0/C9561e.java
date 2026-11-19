package p184i0;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC5819a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p213k0.InterfaceC9770b;

/* renamed from: i0.e */
/* loaded from: classes3.dex */
public class C9561e {

    /* renamed from: f */
    public static final C9557a f22067f = new C9557a();

    /* renamed from: a */
    public final C9557a f22068a;

    /* renamed from: b */
    public final InterfaceC9560d f22069b;

    /* renamed from: c */
    public final InterfaceC9770b f22070c;

    /* renamed from: d */
    public final ContentResolver f22071d;

    /* renamed from: e */
    public final List f22072e;

    public C9561e(List list, InterfaceC9560d interfaceC9560d, InterfaceC9770b interfaceC9770b, ContentResolver contentResolver) {
        this(list, f22067f, interfaceC9560d, interfaceC9770b, contentResolver);
    }

    /* renamed from: a */
    public int m18802a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f22071d.openInputStream(uri);
                int iM4036b = AbstractC5819a.m4036b(this.f22072e, inputStreamOpenInputStream, this.f22070c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM4036b;
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
    public final java.lang.String m18803b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            i0.d r1 = r4.f22069b     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.mo18801a(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: p184i0.C9561e.m18803b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m18804c(File file) {
        return this.f22068a.m18788a(file) && 0 < this.f22068a.m18790c(file);
    }

    /* renamed from: d */
    public InputStream m18805d(Uri uri) throws Throwable {
        String strM18803b = m18803b(uri);
        if (TextUtils.isEmpty(strM18803b)) {
            return null;
        }
        File fileM18789b = this.f22068a.m18789b(strM18803b);
        if (!m18804c(fileM18789b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM18789b);
        try {
            return this.f22071d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public C9561e(List list, C9557a c9557a, InterfaceC9560d interfaceC9560d, InterfaceC9770b interfaceC9770b, ContentResolver contentResolver) {
        this.f22068a = c9557a;
        this.f22069b = interfaceC9560d;
        this.f22070c = interfaceC9770b;
        this.f22071d = contentResolver;
        this.f22072e = list;
    }
}
