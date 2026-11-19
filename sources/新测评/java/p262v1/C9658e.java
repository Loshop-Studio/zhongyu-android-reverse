package p262v1;

import android.os.SystemClock;
import com.liulishuo.okdownload.C6327a;
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
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p218r1.AbstractRunnableC8998b;
import p229s1.C9124a;
import p229s1.C9126c;
import p229s1.InterfaceC9132i;

/* renamed from: v1.e */
/* loaded from: classes4.dex */
public class C9658e extends AbstractRunnableC8998b implements Comparable {

    /* renamed from: j */
    public static final ExecutorService f16882j = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC8999c.m15141y("OkDownload Block", false));

    /* renamed from: b */
    public final C6327a f16883b;

    /* renamed from: c */
    public final boolean f16884c;

    /* renamed from: d */
    public final ArrayList f16885d;

    /* renamed from: e */
    public volatile C9657d f16886e;

    /* renamed from: f */
    public volatile boolean f16887f;

    /* renamed from: g */
    public volatile boolean f16888g;

    /* renamed from: h */
    public volatile Thread f16889h;

    /* renamed from: i */
    public final InterfaceC9132i f16890i;

    public C9658e(C6327a c6327a, boolean z9, InterfaceC9132i interfaceC9132i) {
        this(c6327a, z9, new ArrayList(), interfaceC9132i);
    }

    /* renamed from: g */
    public static C9658e m16098g(C6327a c6327a, boolean z9, InterfaceC9132i interfaceC9132i) {
        return new C9658e(c6327a, z9, interfaceC9132i);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015f A[EDGE_INSN: B:78:0x015f->B:47:0x015f BREAK  A[LOOP:0: B:3:0x0013->B:81:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[LOOP:0: B:3:0x0013->B:81:?, LOOP_END, SYNTHETIC] */
    @Override // p218r1.AbstractRunnableC8998b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15114a() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p262v1.C9658e.mo15114a():void");
    }

    @Override // p218r1.AbstractRunnableC8998b
    /* renamed from: b */
    public void mo15115b() {
        C8879d.m14905k().m14910e().m15923g(this);
        AbstractC8999c.m15125i("DownloadCall", "call is finished " + this.f16883b.mo4385c());
    }

    /* renamed from: d */
    public void m16099d(C9126c c9126c, C9655b c9655b, ResumeFailedCause resumeFailedCause) {
        AbstractC8999c.m15120d(this.f16883b, c9126c, c9655b.m16060d(), c9655b.m16061e());
        C8879d.m14905k().m14907b().m15910a().mo14901p(this.f16883b, c9126c, resumeFailedCause);
    }

    /* renamed from: e */
    public boolean m16100e() {
        synchronized (this) {
            try {
                if (this.f16887f) {
                    return false;
                }
                if (this.f16888g) {
                    return false;
                }
                this.f16887f = true;
                long jUptimeMillis = SystemClock.uptimeMillis();
                C8879d.m14905k().m14910e().m15924h(this);
                C9657d c9657d = this.f16886e;
                if (c9657d != null) {
                    c9657d.m16097r();
                }
                Object[] array = this.f16885d.toArray();
                if (array != null && array.length != 0) {
                    for (Object obj : array) {
                        if (obj instanceof RunnableC9659f) {
                            ((RunnableC9659f) obj).m16117a();
                        }
                    }
                } else if (this.f16889h != null) {
                    AbstractC8999c.m15125i("DownloadCall", "interrupt thread with cancel operation because of chains are not running " + this.f16883b.mo4385c());
                    this.f16889h.interrupt();
                }
                if (c9657d != null) {
                    c9657d.m16081b().m16272b();
                }
                AbstractC8999c.m15125i("DownloadCall", "cancel task " + this.f16883b.mo4385c() + " consume: " + (SystemClock.uptimeMillis() - jUptimeMillis) + "ms");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(C9658e c9658e) {
        return c9658e.m16107m() - m16107m();
    }

    /* renamed from: h */
    public C9657d m16102h(C9126c c9126c) {
        return new C9657d(C8879d.m14905k().m14914i().m16298b(this.f16883b, c9126c, this.f16890i));
    }

    /* renamed from: i */
    public C9654a m16103i(C9126c c9126c, long j10) {
        return new C9654a(this.f16883b, c9126c, j10);
    }

    /* renamed from: j */
    public C9655b m16104j(C9126c c9126c) {
        return new C9655b(this.f16883b, c9126c);
    }

    /* renamed from: k */
    public boolean m16105k(C6327a c6327a) {
        return this.f16883b.equals(c6327a);
    }

    /* renamed from: l */
    public File m16106l() {
        return this.f16883b.m4392l();
    }

    /* renamed from: m */
    public int m16107m() {
        return this.f16883b.m4400t();
    }

    /* renamed from: n */
    public final void m16108n(C9657d c9657d, EndCause endCause, Exception exc) {
        if (endCause == EndCause.CANCELED) {
            throw new IllegalAccessError("can't recognize cancelled on here");
        }
        synchronized (this) {
            try {
                if (this.f16887f) {
                    return;
                }
                this.f16888g = true;
                this.f16890i.mo15508h(this.f16883b.mo4385c(), endCause, exc);
                if (endCause == EndCause.COMPLETED) {
                    this.f16890i.mo15511m(this.f16883b.mo4385c());
                    C8879d.m14905k().m14914i().m16297a(c9657d.m16081b(), this.f16883b);
                }
                C8879d.m14905k().m14907b().m15910a().mo10427k(this.f16883b, endCause, exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public final void m16109o() {
        this.f16890i.mo15507g(this.f16883b.mo4385c());
        C8879d.m14905k().m14907b().m15910a().mo10426h(this.f16883b);
    }

    /* renamed from: p */
    public boolean m16110p() {
        return this.f16887f;
    }

    /* renamed from: q */
    public boolean m16111q() {
        return this.f16888g;
    }

    /* renamed from: r */
    public void m16112r(C9126c c9126c) {
        C6327a.c.m4411b(this.f16883b, c9126c);
    }

    /* renamed from: s */
    public void m16113s(C9657d c9657d, C9126c c9126c) {
        int iM15469d = c9126c.m15469d();
        ArrayList arrayList = new ArrayList(c9126c.m15469d());
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < iM15469d; i10++) {
            C9124a c9124aM15468c = c9126c.m15468c(i10);
            if (!AbstractC8999c.m15131o(c9124aM15468c.m15458c(), c9124aM15468c.m15457b())) {
                AbstractC8999c.m15140x(c9124aM15468c);
                RunnableC9659f runnableC9659fM16116b = RunnableC9659f.m16116b(i10, this.f16883b, c9126c, c9657d, this.f16890i);
                arrayList.add(runnableC9659fM16116b);
                arrayList2.add(Integer.valueOf(runnableC9659fM16116b.m16119d()));
            }
        }
        if (this.f16887f) {
            return;
        }
        c9657d.m16081b().m16293w(arrayList2);
        m16114t(arrayList);
    }

    /* renamed from: t */
    public void m16114t(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m16115u((RunnableC9659f) it.next()));
            }
            this.f16885d.addAll(list);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Future future = (Future) obj;
                if (!future.isDone()) {
                    try {
                        future.get();
                    } catch (CancellationException | ExecutionException unused) {
                    }
                }
            }
            this.f16885d.removeAll(list);
        } catch (Throwable th) {
            try {
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((Future) obj2).cancel(true);
                }
                throw th;
            } finally {
                this.f16885d.removeAll(list);
            }
        }
    }

    /* renamed from: u */
    public Future m16115u(RunnableC9659f runnableC9659f) {
        return f16882j.submit(runnableC9659f);
    }

    public C9658e(C6327a c6327a, boolean z9, ArrayList arrayList, InterfaceC9132i interfaceC9132i) {
        super("download call: " + c6327a.mo4385c());
        this.f16883b = c6327a;
        this.f16884c = z9;
        this.f16885d = arrayList;
        this.f16890i = interfaceC9132i;
    }

    @Override // p218r1.AbstractRunnableC8998b
    /* renamed from: c */
    public void mo15116c(InterruptedException interruptedException) {
    }
}
