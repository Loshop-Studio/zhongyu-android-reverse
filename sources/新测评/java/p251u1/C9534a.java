package p251u1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p207q1.C8879d;
import p207q1.InterfaceC8876a;
import p218r1.AbstractC8999c;
import p229s1.C9126c;

/* renamed from: u1.a */
/* loaded from: classes4.dex */
public class C9534a {

    /* renamed from: a */
    public final InterfaceC8876a f16643a;

    /* renamed from: b */
    public final Handler f16644b;

    /* renamed from: u1.a$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f16645a;

        public a(Collection collection) {
            this.f16645a = collection;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C6327a c6327a : this.f16645a) {
                c6327a.m4398r().mo10427k(c6327a, EndCause.CANCELED, null);
            }
        }
    }

    /* renamed from: u1.a$b */
    public static class b implements InterfaceC8876a {

        /* renamed from: a */
        public final Handler f16647a;

        /* renamed from: u1.a$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16648a;

            /* renamed from: b */
            public final /* synthetic */ int f16649b;

            /* renamed from: c */
            public final /* synthetic */ long f16650c;

            public a(C6327a c6327a, int i10, long j10) {
                this.f16648a = c6327a;
                this.f16649b = i10;
                this.f16650c = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16648a.m4398r().mo14896d(this.f16648a, this.f16649b, this.f16650c);
            }
        }

        /* renamed from: u1.a$b$b, reason: collision with other inner class name */
        public class RunnableC10161b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16652a;

            /* renamed from: b */
            public final /* synthetic */ EndCause f16653b;

            /* renamed from: c */
            public final /* synthetic */ Exception f16654c;

            public RunnableC10161b(C6327a c6327a, EndCause endCause, Exception exc) {
                this.f16652a = c6327a;
                this.f16653b = endCause;
                this.f16654c = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16652a.m4398r().mo10427k(this.f16652a, this.f16653b, this.f16654c);
            }
        }

        /* renamed from: u1.a$b$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16656a;

            public c(C6327a c6327a) {
                this.f16656a = c6327a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16656a.m4398r().mo10426h(this.f16656a);
            }
        }

        /* renamed from: u1.a$b$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16658a;

            /* renamed from: b */
            public final /* synthetic */ Map f16659b;

            public d(C6327a c6327a, Map map) {
                this.f16658a = c6327a;
                this.f16659b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16658a.m4398r().mo14900o(this.f16658a, this.f16659b);
            }
        }

        /* renamed from: u1.a$b$e */
        public class e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16661a;

            /* renamed from: b */
            public final /* synthetic */ int f16662b;

            /* renamed from: c */
            public final /* synthetic */ Map f16663c;

            public e(C6327a c6327a, int i10, Map map) {
                this.f16661a = c6327a;
                this.f16662b = i10;
                this.f16663c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16661a.m4398r().mo14902s(this.f16661a, this.f16662b, this.f16663c);
            }
        }

        /* renamed from: u1.a$b$f */
        public class f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16665a;

            /* renamed from: b */
            public final /* synthetic */ C9126c f16666b;

            /* renamed from: c */
            public final /* synthetic */ ResumeFailedCause f16667c;

            public f(C6327a c6327a, C9126c c9126c, ResumeFailedCause resumeFailedCause) {
                this.f16665a = c6327a;
                this.f16666b = c9126c;
                this.f16667c = resumeFailedCause;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16665a.m4398r().mo14901p(this.f16665a, this.f16666b, this.f16667c);
            }
        }

        /* renamed from: u1.a$b$g */
        public class g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16669a;

            /* renamed from: b */
            public final /* synthetic */ C9126c f16670b;

            public g(C6327a c6327a, C9126c c9126c) {
                this.f16669a = c6327a;
                this.f16670b = c9126c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16669a.m4398r().mo14899m(this.f16669a, this.f16670b);
            }
        }

        /* renamed from: u1.a$b$h */
        public class h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16672a;

            /* renamed from: b */
            public final /* synthetic */ int f16673b;

            /* renamed from: c */
            public final /* synthetic */ Map f16674c;

            public h(C6327a c6327a, int i10, Map map) {
                this.f16672a = c6327a;
                this.f16673b = i10;
                this.f16674c = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16672a.m4398r().mo10541u(this.f16672a, this.f16673b, this.f16674c);
            }
        }

        /* renamed from: u1.a$b$i */
        public class i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16676a;

            /* renamed from: b */
            public final /* synthetic */ int f16677b;

            /* renamed from: c */
            public final /* synthetic */ int f16678c;

            /* renamed from: d */
            public final /* synthetic */ Map f16679d;

            public i(C6327a c6327a, int i10, int i11, Map map) {
                this.f16676a = c6327a;
                this.f16677b = i10;
                this.f16678c = i11;
                this.f16679d = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16676a.m4398r().mo10540r(this.f16676a, this.f16677b, this.f16678c, this.f16679d);
            }
        }

        /* renamed from: u1.a$b$j */
        public class j implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16681a;

            /* renamed from: b */
            public final /* synthetic */ int f16682b;

            /* renamed from: c */
            public final /* synthetic */ long f16683c;

            public j(C6327a c6327a, int i10, long j10) {
                this.f16681a = c6327a;
                this.f16682b = i10;
                this.f16683c = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16681a.m4398r().mo14897e(this.f16681a, this.f16682b, this.f16683c);
            }
        }

        /* renamed from: u1.a$b$k */
        public class k implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6327a f16685a;

            /* renamed from: b */
            public final /* synthetic */ int f16686b;

            /* renamed from: c */
            public final /* synthetic */ long f16687c;

            public k(C6327a c6327a, int i10, long j10) {
                this.f16685a = c6327a;
                this.f16686b = i10;
                this.f16687c = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16685a.m4398r().mo14898g(this.f16685a, this.f16686b, this.f16687c);
            }
        }

        public b(Handler handler) {
            this.f16647a = handler;
        }

        /* renamed from: a */
        public void m15913a(C6327a c6327a, C9126c c9126c, ResumeFailedCause resumeFailedCause) {
            C8879d.m14905k().m14912g();
        }

        /* renamed from: b */
        public void m15914b(C6327a c6327a, C9126c c9126c) {
            C8879d.m14905k().m14912g();
        }

        /* renamed from: c */
        public void m15915c(C6327a c6327a, EndCause endCause, Exception exc) {
            C8879d.m14905k().m14912g();
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: d */
        public void mo14896d(C6327a c6327a, int i10, long j10) {
            AbstractC8999c.m15125i("CallbackDispatcher", "fetchEnd: " + c6327a.mo4385c());
            if (c6327a.m4376B()) {
                this.f16647a.post(new a(c6327a, i10, j10));
            } else {
                c6327a.m4398r().mo14896d(c6327a, i10, j10);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: e */
        public void mo14897e(C6327a c6327a, int i10, long j10) {
            AbstractC8999c.m15125i("CallbackDispatcher", "fetchStart: " + c6327a.mo4385c());
            if (c6327a.m4376B()) {
                this.f16647a.post(new j(c6327a, i10, j10));
            } else {
                c6327a.m4398r().mo14897e(c6327a, i10, j10);
            }
        }

        /* renamed from: f */
        public void m15916f(C6327a c6327a) {
            C8879d.m14905k().m14912g();
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: g */
        public void mo14898g(C6327a c6327a, int i10, long j10) {
            if (c6327a.m4399s() > 0) {
                C6327a.c.m4412c(c6327a, SystemClock.uptimeMillis());
            }
            if (c6327a.m4376B()) {
                this.f16647a.post(new k(c6327a, i10, j10));
            } else {
                c6327a.m4398r().mo14898g(c6327a, i10, j10);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: h */
        public void mo10426h(C6327a c6327a) {
            AbstractC8999c.m15125i("CallbackDispatcher", "taskStart: " + c6327a.mo4385c());
            m15916f(c6327a);
            if (c6327a.m4376B()) {
                this.f16647a.post(new c(c6327a));
            } else {
                c6327a.m4398r().mo10426h(c6327a);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: k */
        public void mo10427k(C6327a c6327a, EndCause endCause, Exception exc) {
            if (endCause == EndCause.ERROR) {
                AbstractC8999c.m15125i("CallbackDispatcher", "taskEnd: " + c6327a.mo4385c() + " " + endCause + " " + exc);
            }
            m15915c(c6327a, endCause, exc);
            if (c6327a.m4376B()) {
                this.f16647a.post(new RunnableC10161b(c6327a, endCause, exc));
            } else {
                c6327a.m4398r().mo10427k(c6327a, endCause, exc);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: m */
        public void mo14899m(C6327a c6327a, C9126c c9126c) {
            AbstractC8999c.m15125i("CallbackDispatcher", "downloadFromBreakpoint: " + c6327a.mo4385c());
            m15914b(c6327a, c9126c);
            if (c6327a.m4376B()) {
                this.f16647a.post(new g(c6327a, c9126c));
            } else {
                c6327a.m4398r().mo14899m(c6327a, c9126c);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: o */
        public void mo14900o(C6327a c6327a, Map map) {
            AbstractC8999c.m15125i("CallbackDispatcher", "-----> start trial task(" + c6327a.mo4385c() + ") " + map);
            if (c6327a.m4376B()) {
                this.f16647a.post(new d(c6327a, map));
            } else {
                c6327a.m4398r().mo14900o(c6327a, map);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: p */
        public void mo14901p(C6327a c6327a, C9126c c9126c, ResumeFailedCause resumeFailedCause) {
            AbstractC8999c.m15125i("CallbackDispatcher", "downloadFromBeginning: " + c6327a.mo4385c());
            m15913a(c6327a, c9126c, resumeFailedCause);
            if (c6327a.m4376B()) {
                this.f16647a.post(new f(c6327a, c9126c, resumeFailedCause));
            } else {
                c6327a.m4398r().mo14901p(c6327a, c9126c, resumeFailedCause);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: r */
        public void mo10540r(C6327a c6327a, int i10, int i11, Map map) {
            AbstractC8999c.m15125i("CallbackDispatcher", "<----- finish connection task(" + c6327a.mo4385c() + ") block(" + i10 + ") code[" + i11 + "]" + map);
            if (c6327a.m4376B()) {
                this.f16647a.post(new i(c6327a, i10, i11, map));
            } else {
                c6327a.m4398r().mo10540r(c6327a, i10, i11, map);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: s */
        public void mo14902s(C6327a c6327a, int i10, Map map) {
            AbstractC8999c.m15125i("CallbackDispatcher", "<----- finish trial task(" + c6327a.mo4385c() + ") code[" + i10 + "]" + map);
            if (c6327a.m4376B()) {
                this.f16647a.post(new e(c6327a, i10, map));
            } else {
                c6327a.m4398r().mo14902s(c6327a, i10, map);
            }
        }

        @Override // p207q1.InterfaceC8876a
        /* renamed from: u */
        public void mo10541u(C6327a c6327a, int i10, Map map) {
            AbstractC8999c.m15125i("CallbackDispatcher", "-----> start connection task(" + c6327a.mo4385c() + ") block(" + i10 + ") " + map);
            if (c6327a.m4376B()) {
                this.f16647a.post(new h(c6327a, i10, map));
            } else {
                c6327a.m4398r().mo10541u(c6327a, i10, map);
            }
        }
    }

    public C9534a() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16644b = handler;
        this.f16643a = new b(handler);
    }

    /* renamed from: a */
    public InterfaceC8876a m15910a() {
        return this.f16643a;
    }

    /* renamed from: b */
    public void m15911b(Collection collection) {
        if (collection.size() <= 0) {
            return;
        }
        AbstractC8999c.m15125i("CallbackDispatcher", "endTasksWithCanceled canceled[" + collection.size() + "]");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6327a c6327a = (C6327a) it.next();
            if (!c6327a.m4376B()) {
                c6327a.m4398r().mo10427k(c6327a, EndCause.CANCELED, null);
                it.remove();
            }
        }
        this.f16644b.post(new a(collection));
    }

    /* renamed from: c */
    public boolean m15912c(C6327a c6327a) {
        long jM4399s = c6327a.m4399s();
        return jM4399s <= 0 || SystemClock.uptimeMillis() - C6327a.c.m4410a(c6327a) >= jM4399s;
    }
}
