package p249t1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p209p1.C9315d;
import p209p1.InterfaceC9312a;
import p219q1.AbstractC9353c;
import p229r1.C9419c;

/* renamed from: t1.a */
/* loaded from: classes4.dex */
public class C9607a {

    /* renamed from: a */
    public final InterfaceC9312a f16825a;

    /* renamed from: b */
    public final Handler f16826b;

    /* renamed from: t1.a$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f16827a;

        public a(Collection collection) {
            this.f16827a = collection;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C6593a c6593a : this.f16827a) {
                c6593a.m4602r().mo15175i(c6593a, EndCause.CANCELED, null);
            }
        }
    }

    /* renamed from: t1.a$b */
    public static class b implements InterfaceC9312a {

        /* renamed from: a */
        public final Handler f16829a;

        /* renamed from: t1.a$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16830a;

            /* renamed from: b */
            public final /* synthetic */ int f16831b;

            /* renamed from: c */
            public final /* synthetic */ long f16832c;

            public a(C6593a c6593a, int i9, long j9) {
                this.f16830a = c6593a;
                this.f16831b = i9;
                this.f16832c = j9;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16830a.m4602r().mo15172c(this.f16830a, this.f16831b, this.f16832c);
            }
        }

        /* renamed from: t1.a$b$b, reason: collision with other inner class name */
        public class RunnableC10087b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16834a;

            /* renamed from: b */
            public final /* synthetic */ EndCause f16835b;

            /* renamed from: c */
            public final /* synthetic */ Exception f16836c;

            public RunnableC10087b(C6593a c6593a, EndCause endCause, Exception exc) {
                this.f16834a = c6593a;
                this.f16835b = endCause;
                this.f16836c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16834a.m4602r().mo15175i(this.f16834a, this.f16835b, this.f16836c);
            }
        }

        /* renamed from: t1.a$b$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16838a;

            public c(C6593a c6593a) {
                this.f16838a = c6593a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16838a.m4602r().mo10265g(this.f16838a);
            }
        }

        /* renamed from: t1.a$b$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16840a;

            /* renamed from: b */
            public final /* synthetic */ Map f16841b;

            public d(C6593a c6593a, Map map) {
                this.f16840a = c6593a;
                this.f16841b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16840a.m4602r().mo15176m(this.f16840a, this.f16841b);
            }
        }

        /* renamed from: t1.a$b$e */
        public class e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16843a;

            /* renamed from: b */
            public final /* synthetic */ int f16844b;

            /* renamed from: c */
            public final /* synthetic */ Map f16845c;

            public e(C6593a c6593a, int i9, Map map) {
                this.f16843a = c6593a;
                this.f16844b = i9;
                this.f16845c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16843a.m4602r().mo15179t(this.f16843a, this.f16844b, this.f16845c);
            }
        }

        /* renamed from: t1.a$b$f */
        public class f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16847a;

            /* renamed from: b */
            public final /* synthetic */ C9419c f16848b;

            /* renamed from: c */
            public final /* synthetic */ ResumeFailedCause f16849c;

            public f(C6593a c6593a, C9419c c9419c, ResumeFailedCause resumeFailedCause) {
                this.f16847a = c6593a;
                this.f16848b = c9419c;
                this.f16849c = resumeFailedCause;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16847a.m4602r().mo15177p(this.f16847a, this.f16848b, this.f16849c);
            }
        }

        /* renamed from: t1.a$b$g */
        public class g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16851a;

            /* renamed from: b */
            public final /* synthetic */ C9419c f16852b;

            public g(C6593a c6593a, C9419c c9419c) {
                this.f16851a = c6593a;
                this.f16852b = c9419c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16851a.m4602r().mo15178q(this.f16851a, this.f16852b);
            }
        }

        /* renamed from: t1.a$b$h */
        public class h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16854a;

            /* renamed from: b */
            public final /* synthetic */ int f16855b;

            /* renamed from: c */
            public final /* synthetic */ Map f16856c;

            public h(C6593a c6593a, int i9, Map map) {
                this.f16854a = c6593a;
                this.f16855b = i9;
                this.f16856c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16854a.m4602r().mo10270u(this.f16854a, this.f16855b, this.f16856c);
            }
        }

        /* renamed from: t1.a$b$i */
        public class i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16858a;

            /* renamed from: b */
            public final /* synthetic */ int f16859b;

            /* renamed from: c */
            public final /* synthetic */ int f16860c;

            /* renamed from: d */
            public final /* synthetic */ Map f16861d;

            public i(C6593a c6593a, int i9, int i10, Map map) {
                this.f16858a = c6593a;
                this.f16859b = i9;
                this.f16860c = i10;
                this.f16861d = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16858a.m4602r().mo10269o(this.f16858a, this.f16859b, this.f16860c, this.f16861d);
            }
        }

        /* renamed from: t1.a$b$j */
        public class j implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16863a;

            /* renamed from: b */
            public final /* synthetic */ int f16864b;

            /* renamed from: c */
            public final /* synthetic */ long f16865c;

            public j(C6593a c6593a, int i9, long j9) {
                this.f16863a = c6593a;
                this.f16864b = i9;
                this.f16865c = j9;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16863a.m4602r().mo15173d(this.f16863a, this.f16864b, this.f16865c);
            }
        }

        /* renamed from: t1.a$b$k */
        public class k implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6593a f16867a;

            /* renamed from: b */
            public final /* synthetic */ int f16868b;

            /* renamed from: c */
            public final /* synthetic */ long f16869c;

            public k(C6593a c6593a, int i9, long j9) {
                this.f16867a = c6593a;
                this.f16868b = i9;
                this.f16869c = j9;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16867a.m4602r().mo15174f(this.f16867a, this.f16868b, this.f16869c);
            }
        }

        public b(Handler handler) {
            this.f16829a = handler;
        }

        /* renamed from: a */
        public void m15844a(C6593a c6593a, C9419c c9419c, ResumeFailedCause resumeFailedCause) {
            C9315d.m15182k().m15189g();
        }

        /* renamed from: b */
        public void m15845b(C6593a c6593a, C9419c c9419c) {
            C9315d.m15182k().m15189g();
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: c */
        public void mo15172c(C6593a c6593a, int i9, long j9) {
            AbstractC9353c.m15306i("CallbackDispatcher", "fetchEnd: " + c6593a.mo4589c());
            if (c6593a.m4580B()) {
                this.f16829a.post(new a(c6593a, i9, j9));
            } else {
                c6593a.m4602r().mo15172c(c6593a, i9, j9);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: d */
        public void mo15173d(C6593a c6593a, int i9, long j9) {
            AbstractC9353c.m15306i("CallbackDispatcher", "fetchStart: " + c6593a.mo4589c());
            if (c6593a.m4580B()) {
                this.f16829a.post(new j(c6593a, i9, j9));
            } else {
                c6593a.m4602r().mo15173d(c6593a, i9, j9);
            }
        }

        /* renamed from: e */
        public void m15846e(C6593a c6593a, EndCause endCause, Exception exc) {
            C9315d.m15182k().m15189g();
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: f */
        public void mo15174f(C6593a c6593a, int i9, long j9) {
            if (c6593a.m4603s() > 0) {
                C6593a.c.m4617c(c6593a, SystemClock.uptimeMillis());
            }
            if (c6593a.m4580B()) {
                this.f16829a.post(new k(c6593a, i9, j9));
            } else {
                c6593a.m4602r().mo15174f(c6593a, i9, j9);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: g */
        public void mo10265g(C6593a c6593a) {
            AbstractC9353c.m15306i("CallbackDispatcher", "taskStart: " + c6593a.mo4589c());
            m15847h(c6593a);
            if (c6593a.m4580B()) {
                this.f16829a.post(new c(c6593a));
            } else {
                c6593a.m4602r().mo10265g(c6593a);
            }
        }

        /* renamed from: h */
        public void m15847h(C6593a c6593a) {
            C9315d.m15182k().m15189g();
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: i */
        public void mo15175i(C6593a c6593a, EndCause endCause, Exception exc) {
            if (endCause == EndCause.ERROR) {
                AbstractC9353c.m15306i("CallbackDispatcher", "taskEnd: " + c6593a.mo4589c() + " " + endCause + " " + exc);
            }
            m15846e(c6593a, endCause, exc);
            if (c6593a.m4580B()) {
                this.f16829a.post(new RunnableC10087b(c6593a, endCause, exc));
            } else {
                c6593a.m4602r().mo15175i(c6593a, endCause, exc);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: m */
        public void mo15176m(C6593a c6593a, Map map) {
            AbstractC9353c.m15306i("CallbackDispatcher", "-----> start trial task(" + c6593a.mo4589c() + ") " + map);
            if (c6593a.m4580B()) {
                this.f16829a.post(new d(c6593a, map));
            } else {
                c6593a.m4602r().mo15176m(c6593a, map);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: o */
        public void mo10269o(C6593a c6593a, int i9, int i10, Map map) {
            AbstractC9353c.m15306i("CallbackDispatcher", "<----- finish connection task(" + c6593a.mo4589c() + ") block(" + i9 + ") code[" + i10 + "]" + map);
            if (c6593a.m4580B()) {
                this.f16829a.post(new i(c6593a, i9, i10, map));
            } else {
                c6593a.m4602r().mo10269o(c6593a, i9, i10, map);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: p */
        public void mo15177p(C6593a c6593a, C9419c c9419c, ResumeFailedCause resumeFailedCause) {
            AbstractC9353c.m15306i("CallbackDispatcher", "downloadFromBeginning: " + c6593a.mo4589c());
            m15844a(c6593a, c9419c, resumeFailedCause);
            if (c6593a.m4580B()) {
                this.f16829a.post(new f(c6593a, c9419c, resumeFailedCause));
            } else {
                c6593a.m4602r().mo15177p(c6593a, c9419c, resumeFailedCause);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: q */
        public void mo15178q(C6593a c6593a, C9419c c9419c) {
            AbstractC9353c.m15306i("CallbackDispatcher", "downloadFromBreakpoint: " + c6593a.mo4589c());
            m15845b(c6593a, c9419c);
            if (c6593a.m4580B()) {
                this.f16829a.post(new g(c6593a, c9419c));
            } else {
                c6593a.m4602r().mo15178q(c6593a, c9419c);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: t */
        public void mo15179t(C6593a c6593a, int i9, Map map) {
            AbstractC9353c.m15306i("CallbackDispatcher", "<----- finish trial task(" + c6593a.mo4589c() + ") code[" + i9 + "]" + map);
            if (c6593a.m4580B()) {
                this.f16829a.post(new e(c6593a, i9, map));
            } else {
                c6593a.m4602r().mo15179t(c6593a, i9, map);
            }
        }

        @Override // p209p1.InterfaceC9312a
        /* renamed from: u */
        public void mo10270u(C6593a c6593a, int i9, Map map) {
            AbstractC9353c.m15306i("CallbackDispatcher", "-----> start connection task(" + c6593a.mo4589c() + ") block(" + i9 + ") " + map);
            if (c6593a.m4580B()) {
                this.f16829a.post(new h(c6593a, i9, map));
            } else {
                c6593a.m4602r().mo10270u(c6593a, i9, map);
            }
        }
    }

    public C9607a() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16826b = handler;
        this.f16825a = new b(handler);
    }

    /* renamed from: a */
    public InterfaceC9312a m15841a() {
        return this.f16825a;
    }

    /* renamed from: b */
    public void m15842b(Collection collection) {
        if (collection.size() <= 0) {
            return;
        }
        AbstractC9353c.m15306i("CallbackDispatcher", "endTasksWithCanceled canceled[" + collection.size() + "]");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6593a c6593a = (C6593a) it.next();
            if (!c6593a.m4580B()) {
                c6593a.m4602r().mo15175i(c6593a, EndCause.CANCELED, null);
                it.remove();
            }
        }
        this.f16826b.post(new a(collection));
    }

    /* renamed from: c */
    public boolean m15843c(C6593a c6593a) {
        long jM4603s = c6593a.m4603s();
        return jM4603s <= 0 || SystemClock.uptimeMillis() - C6593a.c.m4615a(c6593a) >= jM4603s;
    }
}
