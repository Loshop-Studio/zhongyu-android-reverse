package p437z9;

import com.zykj.blackboard.enums.PlayStatus;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10220h;
import p307q9.C10765e;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* renamed from: z9.e */
/* loaded from: classes5.dex */
public abstract class AbstractC12031e extends Thread {

    /* renamed from: c */
    public InterfaceC11552c f28402c;

    /* renamed from: d */
    public InterfaceC9284d f28403d;

    /* renamed from: e */
    public C11373a f28404e;

    /* renamed from: g */
    public C10765e f28406g;

    /* renamed from: f */
    public PlayStatus f28405f = PlayStatus.RECORD_END;

    /* renamed from: h */
    public List f28407h = new ArrayList();

    /* renamed from: i */
    public List f28408i = new ArrayList();

    public AbstractC12031e() {
        System.out.println((Object) ("PlayThread " + Thread.currentThread().getName()));
    }

    /* renamed from: a */
    public final List m26642a() {
        return this.f28408i;
    }

    /* renamed from: b */
    public final InterfaceC11552c m26643b() {
        return this.f28402c;
    }

    /* renamed from: c */
    public final C11373a m26644c() {
        return this.f28404e;
    }

    /* renamed from: d */
    public final List m26645d() {
        return this.f28407h;
    }

    /* renamed from: e */
    public final C10765e m26646e() {
        return this.f28406g;
    }

    /* renamed from: f */
    public final PlayStatus m26647f() {
        return this.f28405f;
    }

    /* renamed from: g */
    public final InterfaceC9284d m26648g() {
        return this.f28403d;
    }

    /* renamed from: h */
    public final PlayStatus m26649h() {
        return this.f28405f;
    }

    /* renamed from: i */
    public final void m26650i(boolean z10) {
        Iterator it = this.f28408i.iterator();
        while (it.hasNext()) {
            ((InterfaceC12030d) it.next()).mo18765a(this, z10);
        }
    }

    /* renamed from: j */
    public final void m26651j(long j10) {
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onProgress(j10);
        }
    }

    /* renamed from: k */
    public void mo14517k() {
        this.f28405f = PlayStatus.RECORD_PAUSE;
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onPlayPause();
        }
    }

    /* renamed from: l */
    public void mo14518l() {
        this.f28405f = PlayStatus.RECORD_END;
    }

    /* renamed from: m */
    public void mo14519m() {
        this.f28405f = PlayStatus.RECORD_RESUME;
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onPlayResume();
        }
    }

    /* renamed from: n */
    public final void m26652n(InterfaceC11552c interfaceC11552c) {
        this.f28402c = interfaceC11552c;
    }

    /* renamed from: o */
    public final void m26653o(C11373a c11373a) {
        this.f28404e = c11373a;
    }

    /* renamed from: p */
    public final void m26654p(C10765e c10765e) {
        this.f28406g = c10765e;
    }

    /* renamed from: q */
    public final void m26655q(PlayStatus playStatus) {
        AbstractC9979u.m20294g(playStatus, "<set-?>");
        this.f28405f = playStatus;
    }

    /* renamed from: r */
    public final void m26656r(InterfaceC9284d interfaceC9284d) {
        this.f28403d = interfaceC9284d;
    }

    /* renamed from: s */
    public void mo14520s() {
        this.f28405f = PlayStatus.RECORD_END;
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onPlayEnd();
        }
        this.f28407h.clear();
    }

    /* renamed from: t */
    public void mo18762t() {
        this.f28405f = PlayStatus.RECORD_START;
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onPlayStart();
        }
    }

    /* renamed from: u */
    public void mo14521u() {
        this.f28405f = PlayStatus.RECORD_END;
        Iterator it = this.f28407h.iterator();
        while (it.hasNext()) {
            ((InterfaceC10220h) it.next()).onPlayEnd();
        }
    }
}
