package p097l0;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.v */
/* loaded from: classes3.dex */
public class C7288v implements InterfaceC7280n {

    /* renamed from: a */
    public final InterfaceC7280n f9265a;

    /* renamed from: l0.v$a */
    public static final class a implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7288v(c7284r.m8265d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: l0.v$b */
    public static class b implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7288v(c7284r.m8265d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: l0.v$c */
    public static class c implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7288v(c7284r.m8265d(Uri.class, InputStream.class));
        }
    }

    public C7288v(InterfaceC7280n interfaceC7280n) {
        this.f9265a = interfaceC7280n;
    }

    /* renamed from: e */
    public static Uri m8281e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m8282f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m8282f(str) : uri;
    }

    /* renamed from: f */
    public static Uri m8282f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(String str, int i6, int i7, C6285d c6285d) {
        Uri uriM8281e = m8281e(str);
        if (uriM8281e == null || !this.f9265a.mo8190a(uriM8281e)) {
            return null;
        }
        return this.f9265a.mo8191b(uriM8281e, i6, i7, c6285d);
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(String str) {
        return true;
    }
}
