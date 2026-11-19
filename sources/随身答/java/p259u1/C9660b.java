package p259u1;

import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.FileBusyAfterRunException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import p209p1.C9315d;
import p229r1.C9419c;

/* renamed from: u1.b */
/* loaded from: classes4.dex */
public class C9660b {

    /* renamed from: a */
    public boolean f17010a;

    /* renamed from: b */
    public boolean f17011b;

    /* renamed from: c */
    public ResumeFailedCause f17012c;

    /* renamed from: d */
    public long f17013d;

    /* renamed from: e */
    public final C6593a f17014e;

    /* renamed from: f */
    public final C9419c f17015f;

    public C9660b(C6593a c6593a, C9419c c9419c) {
        this.f17014e = c6593a;
        this.f17015f = c9419c;
    }

    /* renamed from: a */
    public void m16018a() {
        C9665g c9665gM15188f = C9315d.m15182k().m15188f();
        C9661c c9661cM16019b = m16019b();
        c9661cM16019b.m16032a();
        boolean zM16037i = c9661cM16019b.m16037i();
        boolean zM16038k = c9661cM16019b.m16038k();
        long jM16033e = c9661cM16019b.m16033e();
        String strM16035g = c9661cM16019b.m16035g();
        String strM16036h = c9661cM16019b.m16036h();
        int iM16034f = c9661cM16019b.m16034f();
        c9665gM15188f.m16108k(strM16036h, this.f17014e, this.f17015f);
        this.f17015f.m15537r(zM16038k);
        this.f17015f.m15538s(strM16035g);
        if (C9315d.m15182k().m15187e().m15864q(this.f17014e)) {
            throw FileBusyAfterRunException.f5332a;
        }
        ResumeFailedCause resumeFailedCauseM16100c = c9665gM15188f.m16100c(iM16034f, this.f17015f.m15530k() != 0, this.f17015f, strM16035g);
        boolean z9 = resumeFailedCauseM16100c == null;
        this.f17011b = z9;
        this.f17012c = resumeFailedCauseM16100c;
        this.f17013d = jM16033e;
        this.f17010a = zM16037i;
        if (m16024g(iM16034f, jM16033e, z9)) {
            return;
        }
        if (c9665gM15188f.m16104g(iM16034f, this.f17015f.m15530k() != 0)) {
            throw new ServerCanceledException(iM16034f, this.f17015f.m15530k());
        }
    }

    /* renamed from: b */
    public C9661c m16019b() {
        return new C9661c(this.f17014e, this.f17015f);
    }

    /* renamed from: c */
    public ResumeFailedCause m16020c() {
        ResumeFailedCause resumeFailedCause = this.f17012c;
        if (resumeFailedCause != null) {
            return resumeFailedCause;
        }
        throw new IllegalStateException("No cause find with resumable: " + this.f17011b);
    }

    /* renamed from: d */
    public long m16021d() {
        return this.f17013d;
    }

    /* renamed from: e */
    public boolean m16022e() {
        return this.f17010a;
    }

    /* renamed from: f */
    public boolean m16023f() {
        return this.f17011b;
    }

    /* renamed from: g */
    public boolean m16024g(int i9, long j9, boolean z9) {
        return i9 == 416 && j9 >= 0 && z9;
    }

    public String toString() {
        return "acceptRange[" + this.f17010a + "] resumable[" + this.f17011b + "] failedCause[" + this.f17012c + "] instanceLength[" + this.f17013d + "] " + super.toString();
    }
}
