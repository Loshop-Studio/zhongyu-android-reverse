package p110q;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p057f0.C3731b;
import p076j.C3794d;
import p081k.C3840a;
import p081k.C3848i;
import p081k.C3854o;
import p081k.InterfaceC3843d;
import p110q.InterfaceC4464m;

/* renamed from: q.v */
/* loaded from: classes2.dex */
public class C4473v implements InterfaceC4464m {

    /* renamed from: b */
    public static final Set f5229b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final c f5230a;

    /* renamed from: q.v$a */
    public static final class a implements InterfaceC4465n, c {

        /* renamed from: a */
        public final ContentResolver f5231a;

        public a(ContentResolver contentResolver) {
            this.f5231a = contentResolver;
        }

        @Override // p110q.C4473v.c
        /* renamed from: a */
        public InterfaceC3843d mo5750a(Uri uri) {
            return new C3840a(this.f5231a, uri);
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4473v(this);
        }
    }

    /* renamed from: q.v$b */
    public static class b implements InterfaceC4465n, c {

        /* renamed from: a */
        public final ContentResolver f5232a;

        public b(ContentResolver contentResolver) {
            this.f5232a = contentResolver;
        }

        @Override // p110q.C4473v.c
        /* renamed from: a */
        public InterfaceC3843d mo5750a(Uri uri) {
            return new C3848i(this.f5232a, uri);
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4473v(this);
        }
    }

    /* renamed from: q.v$c */
    public interface c {
        /* renamed from: a */
        InterfaceC3843d mo5750a(Uri uri);
    }

    /* renamed from: q.v$d */
    public static class d implements InterfaceC4465n, c {

        /* renamed from: a */
        public final ContentResolver f5233a;

        public d(ContentResolver contentResolver) {
            this.f5233a = contentResolver;
        }

        @Override // p110q.C4473v.c
        /* renamed from: a */
        public InterfaceC3843d mo5750a(Uri uri) {
            return new C3854o(this.f5233a, uri);
        }

        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4473v(this);
        }
    }

    public C4473v(c cVar) {
        this.f5230a = cVar;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(Uri uri, int i4, int i5, C3794d c3794d) {
        return new InterfaceC4464m.a(new C3731b(uri), this.f5230a.mo5750a(uri));
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(Uri uri) {
        return f5229b.contains(uri.getScheme());
    }
}
