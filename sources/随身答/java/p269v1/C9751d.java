package p269v1;

import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.exception.PreAllocateException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import p209p1.C9315d;
import p219q1.AbstractC9353c;
import p229r1.C9417a;
import p229r1.C9419c;
import p229r1.InterfaceC9425i;

/* renamed from: v1.d */
/* loaded from: classes4.dex */
public class C9751d {

    /* renamed from: y */
    public static final ExecutorService f17230y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9353c.m15322y("OkDownload file io", false));

    /* renamed from: a */
    public final SparseArray f17231a;

    /* renamed from: b */
    public final SparseArray f17232b;

    /* renamed from: c */
    public final AtomicLong f17233c;

    /* renamed from: d */
    public final AtomicLong f17234d;

    /* renamed from: e */
    public boolean f17235e;

    /* renamed from: f */
    public final int f17236f;

    /* renamed from: g */
    public final int f17237g;

    /* renamed from: h */
    public final int f17238h;

    /* renamed from: i */
    public final C9419c f17239i;

    /* renamed from: j */
    public final C6593a f17240j;

    /* renamed from: k */
    public final InterfaceC9425i f17241k;

    /* renamed from: l */
    public final boolean f17242l;

    /* renamed from: m */
    public final boolean f17243m;

    /* renamed from: n */
    public volatile Future f17244n;

    /* renamed from: o */
    public volatile Thread f17245o;

    /* renamed from: p */
    public final SparseArray f17246p;

    /* renamed from: q */
    public final Runnable f17247q;

    /* renamed from: r */
    public String f17248r;

    /* renamed from: s */
    public IOException f17249s;

    /* renamed from: t */
    public ArrayList f17250t;

    /* renamed from: u */
    public List f17251u;

    /* renamed from: v */
    public final c f17252v;

    /* renamed from: w */
    public c f17253w;

    /* renamed from: x */
    public volatile boolean f17254x;

    /* renamed from: v1.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9751d.this.m16325v();
        }
    }

    /* renamed from: v1.d$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9751d.this.m16304a();
        }
    }

    /* renamed from: v1.d$c */
    public static class c {

        /* renamed from: a */
        public boolean f17257a;

        /* renamed from: b */
        public List f17258b = new ArrayList();

        /* renamed from: c */
        public List f17259c = new ArrayList();

        /* renamed from: a */
        public boolean m16329a() {
            return this.f17257a || this.f17259c.size() > 0;
        }
    }

    public C9751d(C6593a c6593a, C9419c c9419c, InterfaceC9425i interfaceC9425i, Runnable runnable) {
        this.f17231a = new SparseArray();
        this.f17232b = new SparseArray();
        this.f17233c = new AtomicLong();
        this.f17234d = new AtomicLong();
        this.f17235e = false;
        this.f17246p = new SparseArray();
        this.f17252v = new c();
        this.f17253w = new c();
        this.f17254x = true;
        this.f17240j = c6593a;
        this.f17236f = c6593a.m4598n();
        this.f17237g = c6593a.m4610z();
        this.f17238h = c6593a.m4609y();
        this.f17239i = c9419c;
        this.f17241k = interfaceC9425i;
        this.f17242l = C9315d.m15182k().m15190h().mo16297b();
        this.f17243m = C9315d.m15182k().m15191i().m16334e(c6593a);
        this.f17250t = new ArrayList();
        if (runnable == null) {
            this.f17247q = new a();
        } else {
            this.f17247q = runnable;
        }
        File fileM4596l = c6593a.m4596l();
        if (fileM4596l != null) {
            this.f17248r = fileM4596l.getAbsolutePath();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x000e, B:17:0x0022, B:18:0x0028, B:20:0x002e, B:21:0x0034, B:26:0x0040, B:27:0x006d, B:43:0x00c7, B:44:0x00cd, B:46:0x00d3, B:47:0x00d9, B:50:0x00e2, B:51:0x010f, B:54:0x011e, B:55:0x0124, B:57:0x012a, B:58:0x0130, B:61:0x0139, B:62:0x0166, B:63:0x0173, B:14:0x0016, B:30:0x007c, B:32:0x0080, B:34:0x0088, B:37:0x00a0, B:41:0x00b5, B:42:0x00c6, B:36:0x009d), top: B:75:0x0001, inners: #0, #1, #3, #4 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m16304a() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p269v1.C9751d.m16304a():void");
    }

    /* renamed from: b */
    public void m16305b() {
        f17230y.execute(new b());
    }

    /* renamed from: c */
    public void m16306c(int i9) {
        this.f17250t.add(Integer.valueOf(i9));
    }

    /* renamed from: d */
    public synchronized void m16307d(int i9) {
        InterfaceC9748a interfaceC9748a = (InterfaceC9748a) this.f17231a.get(i9);
        if (interfaceC9748a != null) {
            interfaceC9748a.close();
            this.f17231a.remove(i9);
            AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream close task[" + this.f17240j.mo4589c() + "] block[" + i9 + "]");
        }
    }

    /* renamed from: e */
    public void m16308e(int i9) {
        this.f17250t.add(Integer.valueOf(i9));
        try {
            IOException iOException = this.f17249s;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f17244n != null && !this.f17244n.isDone()) {
                AtomicLong atomicLong = (AtomicLong) this.f17232b.get(i9);
                if (atomicLong != null && atomicLong.get() > 0) {
                    m16316m(this.f17252v);
                    m16309f(this.f17252v.f17257a, i9);
                }
            } else if (this.f17244n == null) {
                AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream done but no need to ensure sync, because the sync job not run yet. task[" + this.f17240j.mo4589c() + "] block[" + i9 + "]");
            } else {
                AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream done but no need to ensure sync, because the syncFuture.isDone[" + this.f17244n.isDone() + "] task[" + this.f17240j.mo4589c() + "] block[" + i9 + "]");
            }
            m16307d(i9);
        } catch (Throwable th) {
            m16307d(i9);
            throw th;
        }
    }

    /* renamed from: f */
    public void m16309f(boolean z9, int i9) throws ExecutionException, InterruptedException {
        if (this.f17244n == null || this.f17244n.isDone()) {
            return;
        }
        if (!z9) {
            this.f17246p.put(i9, Thread.currentThread());
        }
        if (this.f17245o != null) {
            m16327x(this.f17245o);
        } else {
            while (!m16319p()) {
                m16323t(25L);
            }
            m16327x(this.f17245o);
        }
        if (!z9) {
            m16322s();
            return;
        }
        m16327x(this.f17245o);
        try {
            this.f17244n.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* renamed from: g */
    public Future m16310g() {
        return f17230y.submit(this.f17247q);
    }

    /* renamed from: h */
    public void m16311h() {
        int size;
        long j9;
        synchronized (this.f17232b) {
            size = this.f17232b.size();
        }
        SparseArray sparseArray = new SparseArray(size);
        int i9 = 0;
        while (true) {
            j9 = 0;
            if (i9 >= size) {
                break;
            }
            try {
                int iKeyAt = this.f17231a.keyAt(i9);
                long j10 = ((AtomicLong) this.f17232b.get(iKeyAt)).get();
                if (j10 > 0) {
                    sparseArray.put(iKeyAt, Long.valueOf(j10));
                    ((InterfaceC9748a) this.f17231a.get(iKeyAt)).mo16294b();
                }
                i9++;
            } catch (IOException e10) {
                AbstractC9353c.m15323z("MultiPointOutputStream", "OutputStream flush and sync data to filesystem failed " + e10);
                return;
            }
        }
        int size2 = sparseArray.size();
        for (int i10 = 0; i10 < size2; i10++) {
            int iKeyAt2 = sparseArray.keyAt(i10);
            long jLongValue = ((Long) sparseArray.valueAt(i10)).longValue();
            this.f17241k.mo15564j(this.f17239i, iKeyAt2, jLongValue);
            j9 += jLongValue;
            ((AtomicLong) this.f17232b.get(iKeyAt2)).addAndGet(-jLongValue);
            AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream sync success (" + this.f17240j.mo4589c() + ") block(" + iKeyAt2 + ")  syncLength(" + jLongValue + ") currentOffset(" + this.f17239i.m15522c(iKeyAt2).m15512c() + ")");
        }
        this.f17233c.addAndGet(-j9);
        this.f17234d.set(SystemClock.uptimeMillis());
    }

    /* renamed from: i */
    public long m16312i() {
        return this.f17238h - (m16320q() - this.f17234d.get());
    }

    /* renamed from: j */
    public void m16313j() throws IOException {
        IOException iOException = this.f17249s;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f17244n == null) {
            synchronized (this.f17247q) {
                try {
                    if (this.f17244n == null) {
                        this.f17244n = m16310g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: k */
    public void m16314k(int i9) throws IOException {
        C9417a c9417aM15522c = this.f17239i.m15522c(i9);
        if (AbstractC9353c.m15312o(c9417aM15522c.m15512c(), c9417aM15522c.m15511b())) {
            return;
        }
        throw new IOException("The current offset on block-info isn't update correct, " + c9417aM15522c.m15512c() + " != " + c9417aM15522c.m15511b() + " on " + i9);
    }

    /* renamed from: l */
    public void m16315l(StatFs statFs, long j9) throws PreAllocateException {
        long jM15308k = AbstractC9353c.m15308k(statFs);
        if (jM15308k < j9) {
            throw new PreAllocateException(j9, jM15308k);
        }
    }

    /* renamed from: m */
    public void m16316m(c cVar) {
        cVar.f17259c.clear();
        int size = new HashSet((List) this.f17250t.clone()).size();
        if (size != this.f17251u.size()) {
            AbstractC9353c.m15306i("MultiPointOutputStream", "task[" + this.f17240j.mo4589c() + "] current need fetching block count " + this.f17251u.size() + " is not equal to no more stream block count " + size);
            cVar.f17257a = false;
        } else {
            AbstractC9353c.m15306i("MultiPointOutputStream", "task[" + this.f17240j.mo4589c() + "] current need fetching block count " + this.f17251u.size() + " is equal to no more stream block count " + size);
            cVar.f17257a = true;
        }
        SparseArray sparseArrayClone = this.f17231a.clone();
        int size2 = sparseArrayClone.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int iKeyAt = sparseArrayClone.keyAt(i9);
            if (this.f17250t.contains(Integer.valueOf(iKeyAt)) && !cVar.f17258b.contains(Integer.valueOf(iKeyAt))) {
                cVar.f17258b.add(Integer.valueOf(iKeyAt));
                cVar.f17259c.add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* renamed from: n */
    public final void m16317n() {
        if (this.f17248r != null || this.f17240j.m4596l() == null) {
            return;
        }
        this.f17248r = this.f17240j.m4596l().getAbsolutePath();
    }

    /* renamed from: o */
    public boolean m16318o() {
        return this.f17233c.get() < ((long) this.f17237g);
    }

    /* renamed from: p */
    public boolean m16319p() {
        return this.f17245o != null;
    }

    /* renamed from: q */
    public long m16320q() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: r */
    public synchronized InterfaceC9748a m16321r(int i9) {
        InterfaceC9748a interfaceC9748a;
        Uri uriM4579A;
        try {
            interfaceC9748a = (InterfaceC9748a) this.f17231a.get(i9);
            if (interfaceC9748a == null) {
                boolean zM15317t = AbstractC9353c.m15317t(this.f17240j.m4579A());
                if (zM15317t) {
                    File fileM4596l = this.f17240j.m4596l();
                    if (fileM4596l == null) {
                        throw new FileNotFoundException("Filename is not ready!");
                    }
                    File fileMo4590d = this.f17240j.mo4590d();
                    if (!fileMo4590d.exists() && !fileMo4590d.mkdirs()) {
                        throw new IOException("Create parent folder failed!");
                    }
                    if (fileM4596l.createNewFile()) {
                        AbstractC9353c.m15306i("MultiPointOutputStream", "Create new file: " + fileM4596l.getName());
                    }
                    uriM4579A = Uri.fromFile(fileM4596l);
                } else {
                    uriM4579A = this.f17240j.m4579A();
                }
                InterfaceC9748a interfaceC9748aMo16296a = C9315d.m15182k().m15190h().mo16296a(C9315d.m15182k().m15186d(), uriM4579A, this.f17236f);
                if (this.f17242l) {
                    long jM15513d = this.f17239i.m15522c(i9).m15513d();
                    if (jM15513d > 0) {
                        interfaceC9748aMo16296a.mo16295c(jM15513d);
                        AbstractC9353c.m15306i("MultiPointOutputStream", "Create output stream write from (" + this.f17240j.mo4589c() + ") block(" + i9 + ") " + jM15513d);
                    }
                }
                if (this.f17254x) {
                    this.f17241k.mo15562h(this.f17240j.mo4589c());
                }
                if (!this.f17239i.m15532m() && this.f17254x && this.f17243m) {
                    long jM15529j = this.f17239i.m15529j();
                    if (zM15317t) {
                        File fileM4596l2 = this.f17240j.m4596l();
                        long length = jM15529j - fileM4596l2.length();
                        if (length > 0) {
                            m16315l(new StatFs(fileM4596l2.getAbsolutePath()), length);
                            interfaceC9748aMo16296a.mo16293a(jM15529j);
                        }
                    } else {
                        interfaceC9748aMo16296a.mo16293a(jM15529j);
                    }
                }
                synchronized (this.f17232b) {
                    this.f17231a.put(i9, interfaceC9748aMo16296a);
                    this.f17232b.put(i9, new AtomicLong());
                }
                this.f17254x = false;
                interfaceC9748a = interfaceC9748aMo16296a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC9748a;
    }

    /* renamed from: s */
    public void m16322s() {
        LockSupport.park();
    }

    /* renamed from: t */
    public void m16323t(long j9) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(j9));
    }

    /* renamed from: u */
    public void m16324u() {
        int i9;
        AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream start flush looper task[" + this.f17240j.mo4589c() + "] with syncBufferIntervalMills[" + this.f17238h + "] syncBufferSize[" + this.f17237g + "]");
        this.f17245o = Thread.currentThread();
        long jM16312i = (long) this.f17238h;
        m16311h();
        while (true) {
            m16323t(jM16312i);
            m16316m(this.f17253w);
            if (this.f17253w.m16329a()) {
                AbstractC9353c.m15306i("MultiPointOutputStream", "runSync state change isNoMoreStream[" + this.f17253w.f17257a + "] newNoMoreStreamBlockList[" + this.f17253w.f17259c + "]");
                if (this.f17233c.get() > 0) {
                    m16311h();
                }
                for (Integer num : this.f17253w.f17259c) {
                    Thread thread = (Thread) this.f17246p.get(num.intValue());
                    this.f17246p.remove(num.intValue());
                    if (thread != null) {
                        m16327x(thread);
                    }
                }
                if (this.f17253w.f17257a) {
                    break;
                }
            } else {
                if (m16318o()) {
                    i9 = this.f17238h;
                } else {
                    jM16312i = m16312i();
                    if (jM16312i <= 0) {
                        m16311h();
                        i9 = this.f17238h;
                    }
                }
                jM16312i = i9;
            }
        }
        int size = this.f17246p.size();
        for (int i10 = 0; i10 < size; i10++) {
            Thread thread2 = (Thread) this.f17246p.valueAt(i10);
            if (thread2 != null) {
                m16327x(thread2);
            }
        }
        this.f17246p.clear();
        AbstractC9353c.m15306i("MultiPointOutputStream", "OutputStream stop flush looper task[" + this.f17240j.mo4589c() + "]");
    }

    /* renamed from: v */
    public void m16325v() {
        try {
            m16324u();
        } catch (IOException e10) {
            this.f17249s = e10;
            AbstractC9353c.m15323z("MultiPointOutputStream", "Sync to breakpoint-store for task[" + this.f17240j.mo4589c() + "] failed with cause: " + e10);
        }
    }

    /* renamed from: w */
    public void m16326w(List list) {
        this.f17251u = list;
    }

    /* renamed from: x */
    public void m16327x(Thread thread) {
        LockSupport.unpark(thread);
    }

    /* renamed from: y */
    public synchronized void m16328y(int i9, byte[] bArr, int i10) {
        if (this.f17235e) {
            return;
        }
        m16321r(i9).write(bArr, 0, i10);
        long j9 = i10;
        this.f17233c.addAndGet(j9);
        ((AtomicLong) this.f17232b.get(i9)).addAndGet(j9);
        m16313j();
    }

    public C9751d(C6593a c6593a, C9419c c9419c, InterfaceC9425i interfaceC9425i) {
        this(c6593a, c9419c, interfaceC9425i, null);
    }
}
