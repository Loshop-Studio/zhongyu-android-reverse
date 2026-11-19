package p178u7;

import okhttp3.internal.http2.ErrorCode;
import p153r7.AbstractC6479a;

/* renamed from: u7.m */
/* loaded from: classes4.dex */
public final class C6639m extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ C6641o f11138e;

    /* renamed from: f */
    public final /* synthetic */ int f11139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6639m(String str, C6641o c6641o, int i, ErrorCode errorCode) {
        super(str, true);
        this.f11138e = c6641o;
        this.f11139f = i;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() {
        this.f11138e.f11154k.getClass();
        synchronized (this.f11138e) {
            this.f11138e.f11168y.remove(Integer.valueOf(this.f11139f));
        }
        return -1L;
    }
}
