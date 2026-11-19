package p110q;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p076j.C3794d;
import p110q.InterfaceC4464m;

/* renamed from: q.t */
/* loaded from: classes2.dex */
public class C4471t implements InterfaceC4464m {

    /* renamed from: a */
    public final InterfaceC4464m f5225a;

    /* renamed from: q.t$a */
    public static final class a implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4471t(c4468q.m5732d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: q.t$b */
    public static class b implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4471t(c4468q.m5732d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: q.t$c */
    public static class c implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4471t(c4468q.m5732d(Uri.class, InputStream.class));
        }
    }

    public C4471t(InterfaceC4464m interfaceC4464m) {
        this.f5225a = interfaceC4464m;
    }

    /* renamed from: e */
    public static Uri m5742e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m5743f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m5743f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m5743f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(String str, int i4, int i5, C3794d c3794d) {
        Uri uriM5742e = m5742e(str);
        if (uriM5742e == null || !this.f5225a.mo5670a(uriM5742e)) {
            return null;
        }
        return this.f5225a.mo5671b(uriM5742e, i4, i5, c3794d);
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(String str) {
        return true;
    }
}
