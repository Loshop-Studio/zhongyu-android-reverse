package p097l0;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C4689a;
import com.bumptech.glide.load.data.C4697i;
import com.bumptech.glide.load.data.C4702n;
import com.bumptech.glide.load.data.InterfaceC4692d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p002a1.C0007b;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.x */
/* loaded from: classes3.dex */
public class C7290x implements InterfaceC7280n {

    /* renamed from: b */
    public static final Set f9269b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    public final c f9270a;

    /* renamed from: l0.x$a */
    public static final class a implements InterfaceC7281o, c {

        /* renamed from: a */
        public final ContentResolver f9271a;

        public a(ContentResolver contentResolver) {
            this.f9271a = contentResolver;
        }

        @Override // p097l0.C7290x.c
        /* renamed from: a */
        public InterfaceC4692d mo8289a(Uri uri) {
            return new C4689a(this.f9271a, uri);
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7290x(this);
        }
    }

    /* renamed from: l0.x$b */
    public static class b implements InterfaceC7281o, c {

        /* renamed from: a */
        public final ContentResolver f9272a;

        public b(ContentResolver contentResolver) {
            this.f9272a = contentResolver;
        }

        @Override // p097l0.C7290x.c
        /* renamed from: a */
        public InterfaceC4692d mo8289a(Uri uri) {
            return new C4697i(this.f9272a, uri);
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7290x(this);
        }
    }

    /* renamed from: l0.x$c */
    public interface c {
        /* renamed from: a */
        InterfaceC4692d mo8289a(Uri uri);
    }

    /* renamed from: l0.x$d */
    public static class d implements InterfaceC7281o, c {

        /* renamed from: a */
        public final ContentResolver f9273a;

        public d(ContentResolver contentResolver) {
            this.f9273a = contentResolver;
        }

        @Override // p097l0.C7290x.c
        /* renamed from: a */
        public InterfaceC4692d mo8289a(Uri uri) {
            return new C4702n(this.f9273a, uri);
        }

        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7290x(this);
        }
    }

    public C7290x(c cVar) {
        this.f9270a = cVar;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        return new InterfaceC7280n.a(new C0007b(uri), this.f9270a.mo8289a(uri));
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return f9269b.contains(uri.getScheme());
    }
}
