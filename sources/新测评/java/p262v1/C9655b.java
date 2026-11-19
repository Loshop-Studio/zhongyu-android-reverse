package p262v1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import com.liulishuo.okdownload.core.exception.FileBusyAfterRunException;
import com.liulishuo.okdownload.core.exception.ServerCanceledException;
import p207q1.C8879d;
import p229s1.C9126c;

/* renamed from: v1.b */
/* loaded from: classes4.dex */
public class C9655b {

    /* renamed from: a */
    public boolean f16858a;

    /* renamed from: b */
    public boolean f16859b;

    /* renamed from: c */
    public ResumeFailedCause f16860c;

    /* renamed from: d */
    public long f16861d;

    /* renamed from: e */
    public final C6327a f16862e;

    /* renamed from: f */
    public final C9126c f16863f;

    public C9655b(C6327a c6327a, C9126c c9126c) {
        this.f16862e = c6327a;
        this.f16863f = c9126c;
    }

    /* renamed from: a */
    public void m16057a() {
        C9660g c9660gM14911f = C8879d.m14905k().m14911f();
        C9656c c9656cM16058b = m16058b();
        c9656cM16058b.m16071a();
        boolean zM16076i = c9656cM16058b.m16076i();
        boolean zM16077k = c9656cM16058b.m16077k();
        long jM16072e = c9656cM16058b.m16072e();
        String strM16074g = c9656cM16058b.m16074g();
        String strM16075h = c9656cM16058b.m16075h();
        int iM16073f = c9656cM16058b.m16073f();
        c9660gM14911f.m16147k(strM16075h, this.f16862e, this.f16863f);
        this.f16863f.m15483r(zM16077k);
        this.f16863f.m15484s(strM16074g);
        if (C8879d.m14905k().m14910e().m15932p(this.f16862e)) {
            throw FileBusyAfterRunException.f4724a;
        }
        ResumeFailedCause resumeFailedCauseM16139c = c9660gM14911f.m16139c(iM16073f, this.f16863f.m15476k() != 0, this.f16863f, strM16074g);
        boolean z9 = resumeFailedCauseM16139c == null;
        this.f16859b = z9;
        this.f16860c = resumeFailedCauseM16139c;
        this.f16861d = jM16072e;
        this.f16858a = zM16076i;
        if (m16063g(iM16073f, jM16072e, z9)) {
            return;
        }
        if (c9660gM14911f.m16143g(iM16073f, this.f16863f.m15476k() != 0)) {
            throw new ServerCanceledException(iM16073f, this.f16863f.m15476k());
        }
    }

    /* renamed from: b */
    public C9656c m16058b() {
        return new C9656c(this.f16862e, this.f16863f);
    }

    /* renamed from: c */
    public ResumeFailedCause m16059c() {
        ResumeFailedCause resumeFailedCause = this.f16860c;
        if (resumeFailedCause != null) {
            return resumeFailedCause;
        }
        throw new IllegalStateException("No cause find with resumable: " + this.f16859b);
    }

    /* renamed from: d */
    public long m16060d() {
        return this.f16861d;
    }

    /* renamed from: e */
    public boolean m16061e() {
        return this.f16858a;
    }

    /* renamed from: f */
    public boolean m16062f() {
        return this.f16859b;
    }

    /* renamed from: g */
    public boolean m16063g(int i10, long j10, boolean z9) {
        return i10 == 416 && j10 >= 0 && z9;
    }

    public String toString() {
        return "acceptRange[" + this.f16858a + "] resumable[" + this.f16859b + "] failedCause[" + this.f16860c + "] instanceLength[" + this.f16861d + "] " + super.toString();
    }
}
