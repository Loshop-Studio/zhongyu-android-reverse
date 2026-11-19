package p194o0;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p080d1.C7737b;
import p122h0.C8084d;
import p132i0.C8112a;
import p132i0.C8120i;
import p132i0.C8126o;
import p132i0.InterfaceC8115d;
import p194o0.InterfaceC9146m;

/* renamed from: o0.v */
/* loaded from: classes3.dex */
public class C9155v implements InterfaceC9146m {

    /* renamed from: b */
    public static final Set f15460b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final c f15461a;

    /* renamed from: o0.v$a */
    public static final class a implements InterfaceC9147n, c {

        /* renamed from: a */
        public final ContentResolver f15462a;

        public a(ContentResolver contentResolver) {
            this.f15462a = contentResolver;
        }

        @Override // p194o0.C9155v.c
        /* renamed from: a */
        public InterfaceC8115d mo14734a(Uri uri) {
            return new C8112a(this.f15462a, uri);
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9155v(this);
        }
    }

    /* renamed from: o0.v$b */
    public static class b implements InterfaceC9147n, c {

        /* renamed from: a */
        public final ContentResolver f15463a;

        public b(ContentResolver contentResolver) {
            this.f15463a = contentResolver;
        }

        @Override // p194o0.C9155v.c
        /* renamed from: a */
        public InterfaceC8115d mo14734a(Uri uri) {
            return new C8120i(this.f15463a, uri);
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9155v(this);
        }
    }

    /* renamed from: o0.v$c */
    public interface c {
        /* renamed from: a */
        InterfaceC8115d mo14734a(Uri uri);
    }

    /* renamed from: o0.v$d */
    public static class d implements InterfaceC9147n, c {

        /* renamed from: a */
        public final ContentResolver f15464a;

        public d(ContentResolver contentResolver) {
            this.f15464a = contentResolver;
        }

        @Override // p194o0.C9155v.c
        /* renamed from: a */
        public InterfaceC8115d mo14734a(Uri uri) {
            return new C8126o(this.f15464a, uri);
        }

        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9155v(this);
        }
    }

    public C9155v(c cVar) {
        this.f15461a = cVar;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        return new InterfaceC9146m.a(new C7737b(uri), this.f15461a.mo14734a(uri));
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return f15460b.contains(uri.getScheme());
    }
}
