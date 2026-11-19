package p259u1;

import android.os.SystemClock;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.cause.ResumeFailedCause;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p219q1.AbstractRunnableC9352b;
import p229r1.C9417a;
import p229r1.C9419c;
import p229r1.InterfaceC9425i;

/* renamed from: u1.e */
/* loaded from: classes4.dex */
public class C9663e extends AbstractRunnableC9352b implements Comparable {

    /* renamed from: j */
    public static final ExecutorService f17034j = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9353c.m15322y("OkDownload Block", false));

    /* renamed from: b */
    public final C6593a f17035b;

    /* renamed from: c */
    public final boolean f17036c;

    /* renamed from: d */
    public final ArrayList f17037d;

    /* renamed from: e */
    public volatile C9662d f17038e;

    /* renamed from: f */
    public volatile boolean f17039f;

    /* renamed from: g */
    public volatile boolean f17040g;

    /* renamed from: h */
    public volatile Thread f17041h;

    /* renamed from: i */
    public final InterfaceC9425i f17042i;

    public C9663e(C6593a c6593a, boolean z9, InterfaceC9425i interfaceC9425i) {
        this(c6593a, z9, new ArrayList(), interfaceC9425i);
    }

    /* renamed from: g */
    public static C9663e m16059g(C6593a c6593a, boolean z9, InterfaceC9425i interfaceC9425i) {
        return new C9663e(c6593a, z9, interfaceC9425i);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015f A[EDGE_INSN: B:78:0x015f->B:47:0x015f BREAK  A[LOOP:0: B:3:0x0013->B:81:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:0: B:3:0x0013->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // p219q1.AbstractRunnableC9352b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15295a() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p259u1.C9663e.mo15295a():void");
    }

    @Override // p219q1.AbstractRunnableC9352b
    /* renamed from: b */
    public void mo15296b() {
        C9315d.m15182k().m15187e().m15855h(this);
        AbstractC9353c.m15306i("DownloadCall", "call is finished " + this.f17035b.mo4589c());
    }

    /* renamed from: d */
    public void m16060d(C9419c c9419c, C9660b c9660b, ResumeFailedCause resumeFailedCause) {
        AbstractC9353c.m15301d(this.f17035b, c9419c, c9660b.m16021d(), c9660b.m16022e());
        C9315d.m15182k().m15184b().m15841a().mo15177p(this.f17035b, c9419c, resumeFailedCause);
    }

    /* renamed from: e */
    public boolean m16061e() {
        synchronized (this) {
            try {
                if (this.f17039f) {
                    return false;
                }
                if (this.f17040g) {
                    return false;
                }
                this.f17039f = true;
                long jUptimeMillis = SystemClock.uptimeMillis();
                C9315d.m15182k().m15187e().m15856i(this);
                C9662d c9662d = this.f17038e;
                if (c9662d != null) {
                    c9662d.m16058r();
                }
                Object[] array = this.f17037d.toArray();
                if (array != null && array.length != 0) {
                    for (Object obj : array) {
                        if (obj instanceof RunnableC9664f) {
                            ((RunnableC9664f) obj).m16078a();
                        }
                    }
                } else if (this.f17041h != null) {
                    AbstractC9353c.m15306i("DownloadCall", "interrupt thread with cancel operation because of chains are not running " + this.f17035b.mo4589c());
                    this.f17041h.interrupt();
                }
                if (c9662d != null) {
                    c9662d.m16042b().m16305b();
                }
                AbstractC9353c.m15306i("DownloadCall", "cancel task " + this.f17035b.mo4589c() + " consume: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(C9663e c9663e) {
        return c9663e.m16068m() - m16068m();
    }

    /* renamed from: h */
    public C9662d m16063h(C9419c c9419c) {
        return new C9662d(C9315d.m15182k().m15191i().m16331b(this.f17035b, c9419c, this.f17042i));
    }

    /* renamed from: i */
    public C9659a m16064i(C9419c c9419c, long j9) {
        return new C9659a(this.f17035b, c9419c, j9);
    }

    /* renamed from: j */
    public C9660b m16065j(C9419c c9419c) {
        return new C9660b(this.f17035b, c9419c);
    }

    /* renamed from: k */
    public boolean m16066k(C6593a c6593a) {
        return this.f17035b.equals(c6593a);
    }

    /* renamed from: l */
    public File m16067l() {
        return this.f17035b.m4596l();
    }

    /* renamed from: m */
    public int m16068m() {
        return this.f17035b.m4604t();
    }

    /* renamed from: n */
    public final void m16069n(C9662d c9662d, EndCause endCause, Exception exc) {
        if (endCause == EndCause.CANCELED) {
            throw new IllegalAccessError("can't recognize cancelled on here");
        }
        synchronized (this) {
            try {
                if (this.f17039f) {
                    return;
                }
                this.f17040g = true;
                this.f17042i.mo15561f(this.f17035b.mo4589c(), endCause, exc);
                if (endCause == EndCause.COMPLETED) {
                    this.f17042i.mo15565m(this.f17035b.mo4589c());
                    C9315d.m15182k().m15191i().m16330a(c9662d.m16042b(), this.f17035b);
                }
                C9315d.m15182k().m15184b().m15841a().mo15175i(this.f17035b, endCause, exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m16070o() {
        this.f17042i.mo15560d(this.f17035b.mo4589c());
        C9315d.m15182k().m15184b().m15841a().mo10265g(this.f17035b);
    }

    /* renamed from: p */
    public boolean m16071p() {
        return this.f17039f;
    }

    /* renamed from: q */
    public boolean m16072q() {
        return this.f17040g;
    }

    /* renamed from: r */
    public void m16073r(C9419c c9419c) {
        C6593a.c.m4616b(this.f17035b, c9419c);
    }

    /* renamed from: s */
    public void m16074s(C9662d c9662d, C9419c c9419c) {
        int iM15523d = c9419c.m15523d();
        ArrayList arrayList = new ArrayList(c9419c.m15523d());
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < iM15523d; i9++) {
            C9417a c9417aM15522c = c9419c.m15522c(i9);
            if (!AbstractC9353c.m15312o(c9417aM15522c.m15512c(), c9417aM15522c.m15511b())) {
                AbstractC9353c.m15321x(c9417aM15522c);
                RunnableC9664f runnableC9664fM16077b = RunnableC9664f.m16077b(i9, this.f17035b, c9419c, c9662d, this.f17042i);
                arrayList.add(runnableC9664fM16077b);
                arrayList2.add(Integer.valueOf(runnableC9664fM16077b.m16080d()));
            }
        }
        if (this.f17039f) {
            return;
        }
        c9662d.m16042b().m16326w(arrayList2);
        m16075t(arrayList);
    }

    /* renamed from: t */
    public void m16075t(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i9 = 0;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m16076u((RunnableC9664f) it.next()));
            }
            this.f17037d.addAll(list);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                Future future = (Future) obj;
                if (!future.isDone()) {
                    try {
                        future.get();
                    } catch (CancellationException | ExecutionException unused) {
                    }
                }
            }
            this.f17037d.removeAll(list);
        } catch (Throwable th) {
            try {
                int size2 = arrayList.size();
                while (i9 < size2) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    ((Future) obj2).cancel(true);
                }
                throw th;
            } finally {
                this.f17037d.removeAll(list);
            }
        }
    }

    /* renamed from: u */
    public Future m16076u(RunnableC9664f runnableC9664f) {
        return f17034j.submit(runnableC9664f);
    }

    public C9663e(C6593a c6593a, boolean z9, ArrayList arrayList, InterfaceC9425i interfaceC9425i) {
        super("download call: " + c6593a.mo4589c());
        this.f17035b = c6593a;
        this.f17036c = z9;
        this.f17037d = arrayList;
        this.f17042i = interfaceC9425i;
    }

    @Override // p219q1.AbstractRunnableC9352b
    /* renamed from: c */
    public void mo15297c(InterruptedException interruptedException) {
    }
}
