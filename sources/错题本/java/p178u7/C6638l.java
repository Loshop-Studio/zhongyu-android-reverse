package p178u7;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.internal.http2.ErrorCode;
import p153r7.AbstractC6479a;

/* renamed from: u7.l */
/* loaded from: classes4.dex */
public final class C6638l extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ int f11134e;

    /* renamed from: f */
    public final /* synthetic */ C6641o f11135f;

    /* renamed from: g */
    public final /* synthetic */ int f11136g;

    /* renamed from: h */
    public final /* synthetic */ Object f11137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6638l(String str, C6641o c6641o, int i, Object obj, int i8) {
        super(str, true);
        this.f11134e = i8;
        this.f11135f = c6641o;
        this.f11136g = i;
        this.f11137h = obj;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() throws IOException {
        switch (this.f11134e) {
            case 0:
                this.f11135f.f11154k.getClass();
                try {
                    this.f11135f.f11166w.m6310g(this.f11136g, ErrorCode.CANCEL);
                    synchronized (this.f11135f) {
                        this.f11135f.f11168y.remove(Integer.valueOf(this.f11136g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            case 1:
                this.f11135f.f11154k.getClass();
                try {
                    this.f11135f.f11166w.m6310g(this.f11136g, ErrorCode.CANCEL);
                    synchronized (this.f11135f) {
                        this.f11135f.f11168y.remove(Integer.valueOf(this.f11136g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
            default:
                C6641o c6641o = this.f11135f;
                try {
                    int i = this.f11136g;
                    ErrorCode statusCode = (ErrorCode) this.f11137h;
                    AbstractC5830k.m5330g(statusCode, "statusCode");
                    c6641o.f11166w.m6310g(i, statusCode);
                    return -1L;
                } catch (IOException e) {
                    c6641o.m6278b(e);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6638l(String str, C6641o c6641o, int i, List list, boolean z8) {
        super(str, true);
        this.f11134e = 0;
        this.f11135f = c6641o;
        this.f11136g = i;
        this.f11137h = list;
    }
}
