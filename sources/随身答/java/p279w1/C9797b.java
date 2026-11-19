package p279w1;

import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.io.InputStream;
import p209p1.C9315d;
import p249t1.C9607a;
import p259u1.RunnableC9664f;
import p269v1.C9751d;

/* renamed from: w1.b */
/* loaded from: classes4.dex */
public class C9797b implements InterfaceC9799d {

    /* renamed from: a */
    public final InputStream f17425a;

    /* renamed from: b */
    public final byte[] f17426b;

    /* renamed from: c */
    public final C9751d f17427c;

    /* renamed from: d */
    public final int f17428d;

    /* renamed from: e */
    public final C6593a f17429e;

    /* renamed from: f */
    public final C9607a f17430f = C9315d.m15182k().m15184b();

    public C9797b(int i9, InputStream inputStream, C9751d c9751d, C6593a c6593a) {
        this.f17428d = i9;
        this.f17425a = inputStream;
        this.f17426b = new byte[c6593a.m4605u()];
        this.f17427c = c9751d;
        this.f17429e = c6593a;
    }

    @Override // p279w1.InterfaceC9799d
    /* renamed from: a */
    public long mo16601a(RunnableC9664f runnableC9664f) throws IOException {
        if (runnableC9664f.m16081e().m16046f()) {
            throw InterruptException.f5333a;
        }
        C9315d.m15182k().m15188f().m16103f(runnableC9664f.m16087k());
        int i9 = this.f17425a.read(this.f17426b);
        if (i9 == -1) {
            return i9;
        }
        this.f17427c.m16328y(this.f17428d, this.f17426b, i9);
        long j9 = i9;
        runnableC9664f.m16088l(j9);
        if (this.f17430f.m15843c(this.f17429e)) {
            runnableC9664f.m16079c();
        }
        return j9;
    }
}
