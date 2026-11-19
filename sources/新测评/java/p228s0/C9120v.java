package p228s0;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.v */
/* loaded from: classes3.dex */
public class C9120v implements InterfaceC9112n {

    /* renamed from: a */
    public final InterfaceC9112n f15819a;

    /* renamed from: s0.v$a */
    public static final class a implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9120v(c9116r.m15429d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: s0.v$b */
    public static class b implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9120v(c9116r.m15429d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: s0.v$c */
    public static class c implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9120v(c9116r.m15429d(Uri.class, InputStream.class));
        }
    }

    public C9120v(InterfaceC9112n interfaceC9112n) {
        this.f15819a = interfaceC9112n;
    }

    /* renamed from: e */
    public static Uri m15445e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m15446f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m15446f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m15446f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(String str, int i10, int i11, C8539d c8539d) {
        Uri uriM15445e = m15445e(str);
        if (uriM15445e == null || !this.f15819a.mo15354a(uriM15445e)) {
            return null;
        }
        return this.f15819a.mo15355b(uriM15445e, i10, i11, c8539d);
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(String str) {
        return true;
    }
}
