package p097l0;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p053f0.C6285d;
import p097l0.InterfaceC7280n;

/* renamed from: l0.y */
/* loaded from: classes3.dex */
public class C7291y implements InterfaceC7280n {

    /* renamed from: b */
    public static final Set f9274b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC7280n f9275a;

    /* renamed from: l0.y$a */
    public static class a implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7291y(c7284r.m8265d(C7274h.class, InputStream.class));
        }
    }

    public C7291y(InterfaceC7280n interfaceC7280n) {
        this.f9275a = interfaceC7280n;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(Uri uri, int i6, int i7, C6285d c6285d) {
        return this.f9275a.mo8191b(new C7274h(uri.toString()), i6, i7, c6285d);
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(Uri uri) {
        return f9274b.contains(uri.getScheme());
    }
}
