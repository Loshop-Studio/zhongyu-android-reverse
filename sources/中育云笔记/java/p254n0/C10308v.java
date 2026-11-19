package p254n0;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.v */
/* loaded from: classes3.dex */
public class C10308v implements InterfaceC10300n {

    /* renamed from: a */
    public final InterfaceC10300n f24577a;

    /* renamed from: n0.v$a */
    public static final class a implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10308v(c10304r.m21491d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: n0.v$b */
    public static class b implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10308v(c10304r.m21491d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: n0.v$c */
    public static class c implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10308v(c10304r.m21491d(Uri.class, InputStream.class));
        }
    }

    public C10308v(InterfaceC10300n interfaceC10300n) {
        this.f24577a = interfaceC10300n;
    }

    /* renamed from: e */
    public static Uri m21507e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m21508f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m21508f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m21508f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(String str, int i10, int i11, C9438e c9438e) {
        Uri uriM21507e = m21507e(str);
        if (uriM21507e == null || !this.f24577a.mo21420a(uriM21507e)) {
            return null;
        }
        return this.f24577a.mo21421b(uriM21507e, i10, i11, c9438e);
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(String str) {
        return true;
    }
}
