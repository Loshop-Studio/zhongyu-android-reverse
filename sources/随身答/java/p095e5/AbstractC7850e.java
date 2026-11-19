package p095e5;

import com.zykj.blackboard.enums.PlayStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p169l5.InterfaceC8891e;
import p243s5.InterfaceC9480h;
import p272v4.C9766e;
import p312z4.C9998a;

/* renamed from: e5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7850e extends Thread {

    /* renamed from: a */
    public InterfaceC0039c f13187a;

    /* renamed from: b */
    public InterfaceC8891e f13188b;

    /* renamed from: c */
    public C9998a f13189c;

    /* renamed from: e */
    public C9766e f13191e;

    /* renamed from: d */
    public PlayStatus f13190d = PlayStatus.RECORD_END;

    /* renamed from: f */
    public List f13192f = new ArrayList();

    /* renamed from: g */
    public List f13193g = new ArrayList();

    public AbstractC7850e() {
        System.out.println((Object) ("PlayThread " + Thread.currentThread().getName()));
    }

    /* renamed from: a */
    public final List m12309a() {
        return this.f13193g;
    }

    /* renamed from: b */
    public final InterfaceC0039c m12310b() {
        return this.f13187a;
    }

    /* renamed from: c */
    public final C9998a m12311c() {
        return this.f13189c;
    }

    /* renamed from: d */
    public final List m12312d() {
        return this.f13192f;
    }

    /* renamed from: e */
    public final C9766e m12313e() {
        return this.f13191e;
    }

    /* renamed from: f */
    public final PlayStatus m12314f() {
        return this.f13190d;
    }

    /* renamed from: g */
    public final InterfaceC8891e m12315g() {
        return this.f13188b;
    }

    /* renamed from: h */
    public final PlayStatus m12316h() {
        return this.f13190d;
    }

    /* renamed from: i */
    public final void m12317i(boolean z9) {
        Iterator it = this.f13193g.iterator();
        while (it.hasNext()) {
            ((InterfaceC7849d) it.next()).mo12308a(this, z9);
        }
    }

    /* renamed from: j */
    public final void m12318j(long j9) {
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onProgress(j9);
        }
    }

    /* renamed from: k */
    public void mo7893k() {
        this.f13190d = PlayStatus.RECORD_PAUSE;
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onPlayPause();
        }
    }

    /* renamed from: l */
    public void mo7894l() {
        this.f13190d = PlayStatus.RECORD_END;
    }

    /* renamed from: m */
    public void mo7895m() {
        this.f13190d = PlayStatus.RECORD_RESUME;
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onPlayResume();
        }
    }

    /* renamed from: n */
    public final void m12319n(InterfaceC0039c interfaceC0039c) {
        this.f13187a = interfaceC0039c;
    }

    /* renamed from: o */
    public final void m12320o(C9998a c9998a) {
        this.f13189c = c9998a;
    }

    /* renamed from: p */
    public final void m12321p(C9766e c9766e) {
        this.f13191e = c9766e;
    }

    /* renamed from: q */
    public final void m12322q(PlayStatus playStatus) {
        Intrinsics.checkNotNullParameter(playStatus, "<set-?>");
        this.f13190d = playStatus;
    }

    /* renamed from: r */
    public final void m12323r(InterfaceC8891e interfaceC8891e) {
        this.f13188b = interfaceC8891e;
    }

    /* renamed from: s */
    public void mo7896s() {
        this.f13190d = PlayStatus.RECORD_END;
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onPlayEnd();
        }
        this.f13192f.clear();
    }

    /* renamed from: t */
    public void mo12324t() {
        this.f13190d = PlayStatus.RECORD_START;
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onPlayStart();
        }
    }

    /* renamed from: u */
    public void mo7897u() {
        this.f13190d = PlayStatus.RECORD_END;
        Iterator it = this.f13192f.iterator();
        while (it.hasNext()) {
            ((InterfaceC9480h) it.next()).onPlayEnd();
        }
    }
}
