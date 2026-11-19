package p228s0;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p162m0.C8539d;
import p228s0.InterfaceC9112n;

/* renamed from: s0.y */
/* loaded from: classes3.dex */
public class C9123y implements InterfaceC9112n {

    /* renamed from: b */
    public static final Set f15828b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC9112n f15829a;

    /* renamed from: s0.y$a */
    public static class a implements InterfaceC9113o {
        @Override // p228s0.InterfaceC9113o
        /* renamed from: d */
        public InterfaceC9112n mo15359d(C9116r c9116r) {
            return new C9123y(c9116r.m15429d(C9106h.class, InputStream.class));
        }
    }

    public C9123y(InterfaceC9112n interfaceC9112n) {
        this.f15829a = interfaceC9112n;
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9112n.a mo15355b(Uri uri, int i10, int i11, C8539d c8539d) {
        return this.f15829a.mo15355b(new C9106h(uri.toString()), i10, i11, c8539d);
    }

    @Override // p228s0.InterfaceC9112n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo15354a(Uri uri) {
        return f15828b.contains(uri.getScheme());
    }
}
