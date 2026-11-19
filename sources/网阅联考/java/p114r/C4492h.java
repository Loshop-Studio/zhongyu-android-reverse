package p114r;

import java.io.InputStream;
import java.net.URL;
import p076j.C3794d;
import p110q.C4458g;
import p110q.C4468q;
import p110q.InterfaceC4464m;
import p110q.InterfaceC4465n;

/* renamed from: r.h */
/* loaded from: classes2.dex */
public class C4492h implements InterfaceC4464m {

    /* renamed from: a */
    public final InterfaceC4464m f5278a;

    /* renamed from: r.h$a */
    public static class a implements InterfaceC4465n {
        @Override // p110q.InterfaceC4465n
        /* renamed from: b */
        public InterfaceC4464m mo5675b(C4468q c4468q) {
            return new C4492h(c4468q.m5732d(C4458g.class, InputStream.class));
        }
    }

    public C4492h(InterfaceC4464m interfaceC4464m) {
        this.f5278a = interfaceC4464m;
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4464m.a mo5671b(URL url, int i4, int i5, C3794d c3794d) {
        return this.f5278a.mo5671b(new C4458g(url), i4, i5, c3794d);
    }

    @Override // p110q.InterfaceC4464m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo5670a(URL url) {
        return true;
    }
}
