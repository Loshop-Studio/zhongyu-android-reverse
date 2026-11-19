package p254n0;

import android.net.Uri;
import anet.channel.util.HttpConstant;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p168h0.C9438e;
import p254n0.InterfaceC10300n;

/* renamed from: n0.y */
/* loaded from: classes3.dex */
public class C10311y implements InterfaceC10300n {

    /* renamed from: b */
    public static final Set f24586b = Collections.unmodifiableSet(new HashSet(Arrays.asList(HttpConstant.HTTP, "https")));

    /* renamed from: a */
    public final InterfaceC10300n f24587a;

    /* renamed from: n0.y$a */
    public static class a implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10311y(c10304r.m21491d(C10294h.class, InputStream.class));
        }
    }

    public C10311y(InterfaceC10300n interfaceC10300n) {
        this.f24587a = interfaceC10300n;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(Uri uri, int i10, int i11, C9438e c9438e) {
        return this.f24587a.mo21421b(new C10294h(uri.toString()), i10, i11, c9438e);
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(Uri uri) {
        return f24586b.contains(uri.getScheme());
    }
}
