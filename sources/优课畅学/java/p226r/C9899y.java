package p226r;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p160l.C9230d;
import p226r.InterfaceC9888n;

/* renamed from: r.y */
/* loaded from: classes3.dex */
public class C9899y implements InterfaceC9888n {

    /* renamed from: b */
    public static final Set f19863b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC9888n f19864a;

    /* renamed from: r.y$a */
    public static class a implements InterfaceC9889o {
        @Override // p226r.InterfaceC9889o
        /* renamed from: d */
        public InterfaceC9888n mo18450d(C9892r c9892r) {
            return new C9899y(c9892r.m18520d(C9882h.class, InputStream.class));
        }
    }

    public C9899y(InterfaceC9888n interfaceC9888n) {
        this.f19864a = interfaceC9888n;
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9888n.a mo18446b(Uri uri, int i10, int i11, C9230d c9230d) {
        return this.f19864a.mo18446b(new C9882h(uri.toString()), i10, i11, c9230d);
    }

    @Override // p226r.InterfaceC9888n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18445a(Uri uri) {
        return f19863b.contains(uri.getScheme());
    }
}
