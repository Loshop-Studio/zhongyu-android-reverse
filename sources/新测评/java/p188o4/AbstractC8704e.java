package p188o4;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5125h;
import p087f4.C7439d;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p265v4.InterfaceC9668d;

/* renamed from: o4.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8704e extends Thread {

    /* renamed from: a */
    public InterfaceC7880c f14472a;

    /* renamed from: b */
    public InterfaceC9668d f14473b;

    /* renamed from: c */
    public C7792a f14474c;

    /* renamed from: e */
    public C7439d f14476e;

    /* renamed from: d */
    public PlayStatus f14475d = PlayStatus.RECORD_END;

    /* renamed from: f */
    public List f14477f = new ArrayList();

    /* renamed from: g */
    public List f14478g = new ArrayList();

    public AbstractC8704e() {
        System.out.println((Object) ("PlayThread " + Thread.currentThread().getName()));
    }

    /* renamed from: a */
    public final List m14318a() {
        return this.f14478g;
    }

    /* renamed from: b */
    public final InterfaceC7880c m14319b() {
        return this.f14472a;
    }

    /* renamed from: c */
    public final C7792a m14320c() {
        return this.f14474c;
    }

    /* renamed from: d */
    public final List m14321d() {
        return this.f14477f;
    }

    /* renamed from: e */
    public final C7439d m14322e() {
        return this.f14476e;
    }

    /* renamed from: f */
    public final PlayStatus m14323f() {
        return this.f14475d;
    }

    /* renamed from: g */
    public final InterfaceC9668d m14324g() {
        return this.f14473b;
    }

    /* renamed from: h */
    public final PlayStatus m14325h() {
        return this.f14475d;
    }

    /* renamed from: i */
    public final void m14326i(boolean z9) {
        Iterator it = this.f14478g.iterator();
        while (it.hasNext()) {
            ((InterfaceC8703d) it.next()).mo14317a(this, z9);
        }
    }

    /* renamed from: j */
    public final void m14327j(long j10) {
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onProgress(j10);
        }
    }

    /* renamed from: k */
    public void mo6781k() {
        this.f14475d = PlayStatus.RECORD_PAUSE;
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onPlayPause();
        }
    }

    /* renamed from: l */
    public void mo6782l() {
        this.f14475d = PlayStatus.RECORD_END;
    }

    /* renamed from: m */
    public void mo6783m() {
        this.f14475d = PlayStatus.RECORD_RESUME;
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onPlayResume();
        }
    }

    /* renamed from: n */
    public final void m14328n(InterfaceC7880c interfaceC7880c) {
        this.f14472a = interfaceC7880c;
    }

    /* renamed from: o */
    public final void m14329o(C7792a c7792a) {
        this.f14474c = c7792a;
    }

    /* renamed from: p */
    public final void m14330p(C7439d c7439d) {
        this.f14476e = c7439d;
    }

    /* renamed from: q */
    public final void m14331q(PlayStatus playStatus) {
        Intrinsics.checkNotNullParameter(playStatus, "<set-?>");
        this.f14475d = playStatus;
    }

    /* renamed from: r */
    public final void m14332r(InterfaceC9668d interfaceC9668d) {
        this.f14473b = interfaceC9668d;
    }

    /* renamed from: s */
    public void mo6784s() {
        this.f14475d = PlayStatus.RECORD_END;
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onPlayEnd();
        }
        this.f14477f.clear();
    }

    /* renamed from: t */
    public void mo14333t() {
        this.f14475d = PlayStatus.RECORD_START;
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onPlayStart();
        }
    }

    /* renamed from: u */
    public void mo6785u() {
        this.f14475d = PlayStatus.RECORD_END;
        Iterator it = this.f14477f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5125h) it.next()).onPlayEnd();
        }
    }
}
