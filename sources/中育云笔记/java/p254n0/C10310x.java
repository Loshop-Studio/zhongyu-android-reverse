package p254n0;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C5821a;
import com.bumptech.glide.load.data.C5829i;
import com.bumptech.glide.load.data.C5834n;
import com.bumptech.glide.load.data.InterfaceC5824d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p039c1.C5222d;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.x */
/* loaded from: classes3.dex */
public class C10310x implements InterfaceC10300n {

    /* renamed from: b */
    public static final Set f24581b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    public final c f24582a;

    /* renamed from: n0.x$a */
    public static final class a implements InterfaceC10301o, c {

        /* renamed from: a */
        public final ContentResolver f24583a;

        public a(ContentResolver contentResolver) {
            this.f24583a = contentResolver;
        }

        @Override // p254n0.C10310x.c
        /* renamed from: a */
        public InterfaceC5824d mo21515a(Uri uri) {
            return new C5821a(this.f24583a, uri);
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10310x(this);
        }
    }

    /* renamed from: n0.x$b */
    public static class b implements InterfaceC10301o, c {

        /* renamed from: a */
        public final ContentResolver f24584a;

        public b(ContentResolver contentResolver) {
            this.f24584a = contentResolver;
        }

        @Override // p254n0.C10310x.c
        /* renamed from: a */
        public InterfaceC5824d mo21515a(Uri uri) {
            return new C5829i(this.f24584a, uri);
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10310x(this);
        }
    }

    /* renamed from: n0.x$c */
    public interface c {
        /* renamed from: a */
        InterfaceC5824d mo21515a(Uri uri);
    }

    /* renamed from: n0.x$d */
    public static class d implements InterfaceC10301o, c {

        /* renamed from: a */
        public final ContentResolver f24585a;

        public d(ContentResolver contentResolver) {
            this.f24585a = contentResolver;
        }

        @Override // p254n0.C10310x.c
        /* renamed from: a */
        public InterfaceC5824d mo21515a(Uri uri) {
            return new C5834n(this.f24585a, uri);
        }

        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10310x(this);
        }
    }

    public C10310x(c cVar) {
        this.f24582a = cVar;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        return new InterfaceC10300n.a(new C5222d(uri), this.f24582a.mo21515a(uri));
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return f24581b.contains(uri.getScheme());
    }
}
