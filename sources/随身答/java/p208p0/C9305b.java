package p208p0;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p122h0.C8084d;
import p194o0.C9140g;
import p194o0.C9150q;
import p194o0.InterfaceC9146m;
import p194o0.InterfaceC9147n;

/* renamed from: p0.b */
/* loaded from: classes3.dex */
public class C9305b implements InterfaceC9146m {

    /* renamed from: b */
    public static final Set f16114b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC9146m f16115a;

    /* renamed from: p0.b$a */
    public static class a implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9305b(c9150q.m14716d(C9140g.class, InputStream.class));
        }
    }

    public C9305b(InterfaceC9146m interfaceC9146m) {
        this.f16115a = interfaceC9146m;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(Uri uri, int i9, int i10, C8084d c8084d) {
        return this.f16115a.mo14656b(new C9140g(uri.toString()), i9, i10, c8084d);
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(Uri uri) {
        return f16114b.contains(uri.getScheme());
    }
}
