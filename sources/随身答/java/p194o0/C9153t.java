package p194o0;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p122h0.C8084d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.t */
/* loaded from: classes3.dex */
public class C9153t implements InterfaceC9146m {

    /* renamed from: a */
    public final InterfaceC9146m f15456a;

    /* renamed from: o0.t$a */
    public static final class a implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9153t(c9150q.m14716d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o0.t$b */
    public static class b implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9153t(c9150q.m14716d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o0.t$c */
    public static class c implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9153t(c9150q.m14716d(Uri.class, InputStream.class));
        }
    }

    public C9153t(InterfaceC9146m interfaceC9146m) {
        this.f15456a = interfaceC9146m;
    }

    /* renamed from: e */
    public static Uri m14726e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m14727f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m14727f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m14727f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(String str, int i9, int i10, C8084d c8084d) {
        Uri uriM14726e = m14726e(str);
        if (uriM14726e == null || !this.f15456a.mo14655a(uriM14726e)) {
            return null;
        }
        return this.f15456a.mo14656b(uriM14726e, i9, i10, c8084d);
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(String str) {
        return true;
    }
}
