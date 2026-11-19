package p282x1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.exception.InterruptException;
import java.io.IOException;
import java.io.InputStream;
import p207q1.C8879d;
import p251u1.C9534a;
import p262v1.RunnableC9659f;
import p272w1.C9730d;

/* renamed from: x1.b */
/* loaded from: classes4.dex */
public class C9840b implements InterfaceC9842d {

    /* renamed from: a */
    public final InputStream f17397a;

    /* renamed from: b */
    public final byte[] f17398b;

    /* renamed from: c */
    public final C9730d f17399c;

    /* renamed from: d */
    public final int f17400d;

    /* renamed from: e */
    public final C6327a f17401e;

    /* renamed from: f */
    public final C9534a f17402f = C8879d.m14905k().m14907b();

    public C9840b(int i10, InputStream inputStream, C9730d c9730d, C6327a c6327a) {
        this.f17400d = i10;
        this.f17397a = inputStream;
        this.f17398b = new byte[c6327a.m4401u()];
        this.f17399c = c9730d;
        this.f17401e = c6327a;
    }

    @Override // p282x1.InterfaceC9842d
    /* renamed from: b */
    public long mo16483b(RunnableC9659f runnableC9659f) throws IOException {
        if (runnableC9659f.m16120e().m16085f()) {
            throw InterruptException.f4725a;
        }
        C8879d.m14905k().m14911f().m16142f(runnableC9659f.m16126k());
        int i10 = this.f17397a.read(this.f17398b);
        if (i10 == -1) {
            return i10;
        }
        this.f17399c.m16295y(this.f17400d, this.f17398b, i10);
        long j10 = i10;
        runnableC9659f.m16127l(j10);
        if (this.f17402f.m15912c(this.f17401e)) {
            runnableC9659f.m16118c();
        }
        return j10;
    }
}
