package p299y1;

import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.util.Map;
import p209p1.InterfaceC9312a;
import p229r1.C9419c;
import p309z1.C9987a;

/* renamed from: y1.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9943a implements InterfaceC9312a, C9987a.b {

    /* renamed from: a */
    public final C9987a f17871a;

    public AbstractC9943a(C9987a c9987a) {
        this.f17871a = c9987a;
        c9987a.m17295e(this);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: c */
    public void mo15172c(C6593a c6593a, int i9, long j9) {
        this.f17871a.m17291a(c6593a, i9);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: f */
    public final void mo15174f(C6593a c6593a, int i9, long j9) {
        this.f17871a.m17292b(c6593a, i9, j9);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: i */
    public final void mo15175i(C6593a c6593a, EndCause endCause, Exception exc) {
        this.f17871a.m17296f(c6593a, endCause, exc);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: p */
    public final void mo15177p(C6593a c6593a, C9419c c9419c, ResumeFailedCause resumeFailedCause) {
        this.f17871a.m17293c(c6593a, c9419c, false);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: q */
    public final void mo15178q(C6593a c6593a, C9419c c9419c) {
        this.f17871a.m17293c(c6593a, c9419c, true);
    }

    /* renamed from: v */
    public void m17129v(C9987a.a aVar) {
        this.f17871a.m17294d(aVar);
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: m */
    public void mo15176m(C6593a c6593a, Map map) {
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: d */
    public void mo15173d(C6593a c6593a, int i9, long j9) {
    }

    @Override // p209p1.InterfaceC9312a
    /* renamed from: t */
    public void mo15179t(C6593a c6593a, int i9, Map map) {
    }
}
