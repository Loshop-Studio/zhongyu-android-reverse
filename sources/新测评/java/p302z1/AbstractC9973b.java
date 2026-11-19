package p302z1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.util.Map;
import p004a2.C0015a;
import p207q1.InterfaceC8876a;
import p229s1.C9126c;

/* renamed from: z1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9973b implements InterfaceC8876a, C0015a.b {

    /* renamed from: a */
    public final C0015a f17830a;

    public AbstractC9973b(C0015a c0015a) {
        this.f17830a = c0015a;
        c0015a.m27e(this);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: d */
    public void mo14896d(C6327a c6327a, int i10, long j10) {
        this.f17830a.m23a(c6327a, i10);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: g */
    public final void mo14898g(C6327a c6327a, int i10, long j10) {
        this.f17830a.m24b(c6327a, i10, j10);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: k */
    public final void mo10427k(C6327a c6327a, EndCause endCause, Exception exc) {
        this.f17830a.m28f(c6327a, endCause, exc);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: m */
    public final void mo14899m(C6327a c6327a, C9126c c9126c) {
        this.f17830a.m25c(c6327a, c9126c, true);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: p */
    public final void mo14901p(C6327a c6327a, C9126c c9126c, ResumeFailedCause resumeFailedCause) {
        this.f17830a.m25c(c6327a, c9126c, false);
    }

    /* renamed from: v */
    public void m16797v(C0015a.a aVar) {
        this.f17830a.m26d(aVar);
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: o */
    public void mo14900o(C6327a c6327a, Map map) {
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: e */
    public void mo14897e(C6327a c6327a, int i10, long j10) {
    }

    @Override // p207q1.InterfaceC8876a
    /* renamed from: s */
    public void mo14902s(C6327a c6327a, int i10, Map map) {
    }
}
