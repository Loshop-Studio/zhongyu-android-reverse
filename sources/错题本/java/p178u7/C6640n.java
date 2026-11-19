package p178u7;

import java.io.IOException;
import p153r7.AbstractC6479a;

/* renamed from: u7.n */
/* loaded from: classes4.dex */
public final class C6640n extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ C6641o f11140e;

    /* renamed from: f */
    public final /* synthetic */ int f11141f;

    /* renamed from: g */
    public final /* synthetic */ long f11142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6640n(String str, C6641o c6641o, int i, long j7) {
        super(str, true);
        this.f11140e = c6641o;
        this.f11141f = i;
        this.f11142g = j7;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() throws IOException {
        C6641o c6641o = this.f11140e;
        try {
            c6641o.f11166w.m6311h(this.f11141f, this.f11142g);
            return -1L;
        } catch (IOException e) {
            c6641o.m6278b(e);
            return -1L;
        }
    }
}
