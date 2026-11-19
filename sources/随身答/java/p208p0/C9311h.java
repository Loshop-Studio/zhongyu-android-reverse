package p208p0;

import java.io.InputStream;
import java.net.URL;
import p122h0.C8084d;
import p194o0.C9140g;
import p194o0.C9150q;
import p194o0.InterfaceC9146m;
import p194o0.InterfaceC9147n;

/* renamed from: p0.h */
/* loaded from: classes3.dex */
public class C9311h implements InterfaceC9146m {

    /* renamed from: a */
    public final InterfaceC9146m f16137a;

    /* renamed from: p0.h$a */
    public static class a implements InterfaceC9147n {
        @Override // p194o0.InterfaceC9147n
        /* renamed from: b */
        public InterfaceC9146m mo14660b(C9150q c9150q) {
            return new C9311h(c9150q.m14716d(C9140g.class, InputStream.class));
        }
    }

    public C9311h(InterfaceC9146m interfaceC9146m) {
        this.f16137a = interfaceC9146m;
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9146m.a mo14656b(URL url, int i9, int i10, C8084d c8084d) {
        return this.f16137a.mo14656b(new C9140g(url), i9, i10, c8084d);
    }

    @Override // p194o0.InterfaceC9146m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo14655a(URL url) {
        return true;
    }
}
