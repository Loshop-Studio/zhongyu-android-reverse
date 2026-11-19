package p226r;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.v */
/* loaded from: classes3.dex */
public class C9896v implements InterfaceC9888n {

    /* renamed from: a */
    public final InterfaceC9888n f19854a;

    /* renamed from: r.v$a */
    public static final class a implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9896v(c9892r.m18520d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: r.v$b */
    public static class b implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9896v(c9892r.m18520d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: r.v$c */
    public static class c implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9896v(c9892r.m18520d(Uri.class, InputStream.class));
        }
    }

    public C9896v(InterfaceC9888n interfaceC9888n) {
        this.f19854a = interfaceC9888n;
    }

    /* renamed from: e */
    public static Uri m18536e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m18537f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m18537f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m18537f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(String str, int i10, int i11, C9230d c9230d) {
        Uri uriM18536e = m18536e(str);
        if (uriM18536e == null || !this.f19854a.mo18445a(uriM18536e)) {
            return null;
        }
        return this.f19854a.mo18446b(uriM18536e, i10, i11, c9230d);
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(String str) {
        return true;
    }
}
