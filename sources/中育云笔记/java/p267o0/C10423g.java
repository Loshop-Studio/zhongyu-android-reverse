package p267o0;

import java.io.InputStream;
import java.net.URL;
import p168h0.C9438e;
import p254n0.C10294h;
import p254n0.C10304r;
import p254n0.InterfaceC10300n;
import p254n0.InterfaceC10301o;

/* renamed from: o0.g */
/* loaded from: classes3.dex */
public class C10423g implements InterfaceC10300n {

    /* renamed from: a */
    public final InterfaceC10300n f24819a;

    /* renamed from: o0.g$a */
    public static class a implements InterfaceC10301o {
        @Override // p254n0.InterfaceC10301o
        /* renamed from: c */
        public InterfaceC10300n mo21425c(C10304r c10304r) {
            return new C10423g(c10304r.m21491d(C10294h.class, InputStream.class));
        }
    }

    public C10423g(InterfaceC10300n interfaceC10300n) {
        this.f24819a = interfaceC10300n;
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC10300n.a mo21421b(URL url, int i10, int i11, C9438e c9438e) {
        return this.f24819a.mo21421b(new C10294h(url), i10, i11, c9438e);
    }

    @Override // p254n0.InterfaceC10300n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo21420a(URL url) {
        return true;
    }
}
