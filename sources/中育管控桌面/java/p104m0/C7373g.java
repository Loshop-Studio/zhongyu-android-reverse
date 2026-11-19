package p104m0;

import java.io.InputStream;
import java.net.URL;
import p053f0.C6285d;
import p097l0.C7274h;
import p097l0.C7284r;
import p097l0.InterfaceC7280n;
import p097l0.InterfaceC7281o;

/* renamed from: m0.g */
/* loaded from: classes3.dex */
public class C7373g implements InterfaceC7280n {

    /* renamed from: a */
    public final InterfaceC7280n f9385a;

    /* renamed from: m0.g$a */
    public static class a implements InterfaceC7281o {
        @Override // p097l0.InterfaceC7281o
        /* renamed from: d */
        public InterfaceC7280n mo8195d(C7284r c7284r) {
            return new C7373g(c7284r.m8265d(C7274h.class, InputStream.class));
        }
    }

    public C7373g(InterfaceC7280n interfaceC7280n) {
        this.f9385a = interfaceC7280n;
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7280n.a mo8191b(URL url, int i6, int i7, C6285d c6285d) {
        return this.f9385a.mo8191b(new C7274h(url), i6, i7, c6285d);
    }

    @Override // p097l0.InterfaceC7280n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo8190a(URL url) {
        return true;
    }
}
