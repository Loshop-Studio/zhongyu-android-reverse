package p228s0;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.C5353a;
import com.bumptech.glide.load.data.C5361i;
import com.bumptech.glide.load.data.C5366n;
import com.bumptech.glide.load.data.InterfaceC5356d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p106h1.C7617b;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.x */
/* loaded from: classes3.dex */
public class C9122x implements InterfaceC9112n {

    /* renamed from: b */
    public static final Set f15823b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    public final c f15824a;

    /* renamed from: s0.x$a */
    public static final class a implements InterfaceC9113o, c {

        /* renamed from: a */
        public final ContentResolver f15825a;

        public a(ContentResolver contentResolver) {
            this.f15825a = contentResolver;
        }

        @Override // p228s0.C9122x.c
        /* renamed from: a */
        public InterfaceC5356d mo15453a(Uri uri) {
            return new C5353a(this.f15825a, uri);
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9122x(this);
        }
    }

    /* renamed from: s0.x$b */
    public static class b implements InterfaceC9113o, c {

        /* renamed from: a */
        public final ContentResolver f15826a;

        public b(ContentResolver contentResolver) {
            this.f15826a = contentResolver;
        }

        @Override // p228s0.C9122x.c
        /* renamed from: a */
        public InterfaceC5356d mo15453a(Uri uri) {
            return new C5361i(this.f15826a, uri);
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9122x(this);
        }
    }

    /* renamed from: s0.x$c */
    public interface c {
        /* renamed from: a */
        InterfaceC5356d mo15453a(Uri uri);
    }

    /* renamed from: s0.x$d */
    public static class d implements InterfaceC9113o, c {

        /* renamed from: a */
        public final ContentResolver f15827a;

        public d(ContentResolver contentResolver) {
            this.f15827a = contentResolver;
        }

        @Override // p228s0.C9122x.c
        /* renamed from: a */
        public InterfaceC5356d mo15453a(Uri uri) {
            return new C5366n(this.f15827a, uri);
        }

        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9122x(this);
        }
    }

    public C9122x(c cVar) {
        this.f15824a = cVar;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        return new InterfaceC9112n.a(new C7617b(uri), this.f15824a.mo15453a(uri));
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return f15823b.contains(uri.getScheme());
    }
}
