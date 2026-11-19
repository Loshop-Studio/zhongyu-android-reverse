package p114r;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p076j.C3794d;
import p110q.C4458g;
import p110q.C4468q;
import p110q.InterfaceC4464m;
import p110q.InterfaceC4465n;

/* renamed from: r.b */
/* loaded from: classes2.dex */
public class C4486b implements InterfaceC4464m {

    /* renamed from: b */
    public static final Set f5255b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC4464m f5256a;

    /* renamed from: r.b$a */
    public static class a implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4486b(c4468q.m5732d(C4458g.class, InputStream.class));
        }
    }

    public C4486b(InterfaceC4464m interfaceC4464m) {
        this.f5256a = interfaceC4464m;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        return this.f5256a.mo5671b(new C4458g(uri.toString()), i4, i5, c3794d);
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return f5255b.contains(uri.getScheme());
    }
}
