package p178u7;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import p153r7.AbstractC6479a;

/* renamed from: u7.k */
/* loaded from: classes4.dex */
public final class C6637k extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ C6641o f11130e;

    /* renamed from: f */
    public final /* synthetic */ int f11131f;

    /* renamed from: g */
    public final /* synthetic */ Buffer f11132g;

    /* renamed from: h */
    public final /* synthetic */ int f11133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6637k(String str, C6641o c6641o, int i, Buffer buffer, int i8, boolean z8) {
        super(str, true);
        this.f11130e = c6641o;
        this.f11131f = i;
        this.f11132g = buffer;
        this.f11133h = i8;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() {
        try {
            C6626a0 c6626a0 = this.f11130e.f11154k;
            Buffer buffer = this.f11132g;
            int i = this.f11133h;
            c6626a0.getClass();
            buffer.skip(i);
            this.f11130e.f11166w.m6310g(this.f11131f, ErrorCode.CANCEL);
            synchronized (this.f11130e) {
                this.f11130e.f11168y.remove(Integer.valueOf(this.f11131f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
