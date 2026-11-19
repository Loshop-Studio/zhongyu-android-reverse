package p226r;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C5402a;
import com.bumptech.glide.load.data.C5410i;
import com.bumptech.glide.load.data.C5415n;
import com.bumptech.glide.load.data.InterfaceC5405d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p105g0.C8514b;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.x */
/* loaded from: classes3.dex */
public class C9898x implements InterfaceC9888n {

    /* renamed from: b */
    public static final Set f19858b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    public final c f19859a;

    /* renamed from: r.x$a */
    public static final class a implements InterfaceC9889o, c {

        /* renamed from: a */
        public final ContentResolver f19860a;

        public a(ContentResolver contentResolver) {
            this.f19860a = contentResolver;
        }

        @Override // p226r.C9898x.c
        /* renamed from: a */
        public InterfaceC5405d mo18544a(Uri uri) {
            return new C5402a(this.f19860a, uri);
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9898x(this);
        }
    }

    /* renamed from: r.x$b */
    public static class b implements InterfaceC9889o, c {

        /* renamed from: a */
        public final ContentResolver f19861a;

        public b(ContentResolver contentResolver) {
            this.f19861a = contentResolver;
        }

        @Override // p226r.C9898x.c
        /* renamed from: a */
        public InterfaceC5405d mo18544a(Uri uri) {
            return new C5410i(this.f19861a, uri);
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9898x(this);
        }
    }

    /* renamed from: r.x$c */
    public interface c {
        /* renamed from: a */
        InterfaceC5405d mo18544a(Uri uri);
    }

    /* renamed from: r.x$d */
    public static class d implements InterfaceC9889o, c {

        /* renamed from: a */
        public final ContentResolver f19862a;

        public d(ContentResolver contentResolver) {
            this.f19862a = contentResolver;
        }

        @Override // p226r.C9898x.c
        /* renamed from: a */
        public InterfaceC5405d mo18544a(Uri uri) {
            return new C5415n(this.f19862a, uri);
        }

        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9898x(this);
        }
    }

    public C9898x(c cVar) {
        this.f19859a = cVar;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        return new InterfaceC9888n.a(new C8514b(uri), this.f19859a.mo18544a(uri));
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return f19858b.contains(uri.getScheme());
    }
}
