package p178u7;

import java.io.IOException;
import p153r7.AbstractC6479a;

/* renamed from: u7.j */
/* loaded from: classes4.dex */
public final class C6636j extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ C6641o f11127e;

    /* renamed from: f */
    public final /* synthetic */ int f11128f;

    /* renamed from: g */
    public final /* synthetic */ int f11129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6636j(String str, C6641o c6641o, int i, int i8) {
        super(str, true);
        this.f11127e = c6641o;
        this.f11128f = i;
        this.f11129g = i8;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() throws IOException {
        C6641o c6641o = this.f11127e;
        try {
            c6641o.f11166w.m6309f(true, this.f11128f, this.f11129g);
            return -1L;
        } catch (IOException e) {
            c6641o.m6278b(e);
            return -1L;
        }
    }
}
