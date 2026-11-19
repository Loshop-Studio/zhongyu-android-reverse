package p088l;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC2864a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p098n.InterfaceC4393b;

/* renamed from: l.e */
/* loaded from: classes2.dex */
public class C4333e {

    /* renamed from: f */
    public static final C4329a f4836f = new C4329a();

    /* renamed from: a */
    public final C4329a f4837a;

    /* renamed from: b */
    public final InterfaceC4332d f4838b;

    /* renamed from: c */
    public final InterfaceC4393b f4839c;

    /* renamed from: d */
    public final ContentResolver f4840d;

    /* renamed from: e */
    public final List f4841e;

    public C4333e(List list, InterfaceC4332d interfaceC4332d, InterfaceC4393b interfaceC4393b, ContentResolver contentResolver) {
        this(list, f4836f, interfaceC4332d, interfaceC4393b, contentResolver);
    }

    /* renamed from: a */
    public int m5342a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f4840d.openInputStream(uri);
                int iM1756a = AbstractC2864a.m1756a(this.f4841e, inputStreamOpenInputStream, this.f4839c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM1756a;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open uri: ");
                    sb.append(uri);
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m5343b(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            l.d r1 = r4.f4838b     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L20
            android.database.Cursor r1 = r1.mo5341a(r5)     // Catch: java.lang.Throwable -> L1e java.lang.SecurityException -> L20
            if (r1 == 0) goto L18
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.SecurityException -> L21 java.lang.Throwable -> L3d
            if (r2 == 0) goto L18
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.SecurityException -> L21 java.lang.Throwable -> L3d
            r1.close()
            return r5
        L18:
            if (r1 == 0) goto L1d
            r1.close()
        L1d:
            return r0
        L1e:
            r5 = move-exception
            goto L3f
        L20:
            r1 = r0
        L21:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d
            r2.append(r5)     // Catch: java.lang.Throwable -> L3d
        L37:
            if (r1 == 0) goto L3c
            r1.close()
        L3c:
            return r0
        L3d:
            r5 = move-exception
            r0 = r1
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p088l.C4333e.m5343b(android.net.Uri):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m5344c(File file) {
        return this.f4837a.m5329a(file) && 0 < this.f4837a.m5331c(file);
    }

    /* renamed from: d */
    public InputStream m5345d(Uri uri) throws Throwable {
        String strM5343b = m5343b(uri);
        if (TextUtils.isEmpty(strM5343b)) {
            return null;
        }
        File fileM5330b = this.f4837a.m5330b(strM5343b);
        if (!m5344c(fileM5330b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM5330b);
        try {
            return this.f4840d.openInputStream(uriFromFile);
        } catch (NullPointerException e4) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
        }
    }

    public C4333e(List list, C4329a c4329a, InterfaceC4332d interfaceC4332d, InterfaceC4393b interfaceC4393b, ContentResolver contentResolver) {
        this.f4837a = c4329a;
        this.f4838b = interfaceC4332d;
        this.f4839c = interfaceC4393b;
        this.f4840d = contentResolver;
        this.f4841e = list;
    }
}
