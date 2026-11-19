package p272w1;

import android.net.Uri;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
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
import p207q1.C8879d;
import p218r1.AbstractC8999c;
import p229s1.C9124a;
import p229s1.C9126c;
import p229s1.InterfaceC9132i;

/* renamed from: w1.d */
/* loaded from: classes4.dex */
public class C9730d {

    /* renamed from: y */
    public static final ExecutorService f17069y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC8999c.m15141y("OkDownload file io", false));

    /* renamed from: a */
    public final SparseArray f17070a;

    /* renamed from: b */
    public final SparseArray f17071b;

    /* renamed from: c */
    public final AtomicLong f17072c;

    /* renamed from: d */
    public final AtomicLong f17073d;

    /* renamed from: e */
    public boolean f17074e;

    /* renamed from: f */
    public final int f17075f;

    /* renamed from: g */
    public final int f17076g;

    /* renamed from: h */
    public final int f17077h;

    /* renamed from: i */
    public final C9126c f17078i;

    /* renamed from: j */
    public final C6327a f17079j;

    /* renamed from: k */
    public final InterfaceC9132i f17080k;

    /* renamed from: l */
    public final boolean f17081l;

    /* renamed from: m */
    public final boolean f17082m;

    /* renamed from: n */
    public volatile Future f17083n;

    /* renamed from: o */
    public volatile Thread f17084o;

    /* renamed from: p */
    public final SparseArray f17085p;

    /* renamed from: q */
    public final Runnable f17086q;

    /* renamed from: r */
    public String f17087r;

    /* renamed from: s */
    public IOException f17088s;

    /* renamed from: t */
    public ArrayList f17089t;

    /* renamed from: u */
    public List f17090u;

    /* renamed from: v */
    public final c f17091v;

    /* renamed from: w */
    public c f17092w;

    /* renamed from: x */
    public volatile boolean f17093x;

    /* renamed from: w1.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9730d.this.m16292v();
        }
    }

    /* renamed from: w1.d$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9730d.this.m16271a();
        }
    }

    /* renamed from: w1.d$c */
    public static class c {

        /* renamed from: a */
        public boolean f17096a;

        /* renamed from: b */
        public List f17097b = new ArrayList();

        /* renamed from: c */
        public List f17098c = new ArrayList();

        /* renamed from: a */
        public boolean m16296a() {
            return this.f17096a || this.f17098c.size() > 0;
        }
    }

    public C9730d(C6327a c6327a, C9126c c9126c, InterfaceC9132i interfaceC9132i, Runnable runnable) {
        this.f17070a = new SparseArray();
        this.f17071b = new SparseArray();
        this.f17072c = new AtomicLong();
        this.f17073d = new AtomicLong();
        this.f17074e = false;
        this.f17085p = new SparseArray();
        this.f17091v = new c();
        this.f17092w = new c();
        this.f17093x = true;
        this.f17079j = c6327a;
        this.f17075f = c6327a.m4394n();
        this.f17076g = c6327a.m4406z();
        this.f17077h = c6327a.m4405y();
        this.f17078i = c9126c;
        this.f17080k = interfaceC9132i;
        this.f17081l = C8879d.m14905k().m14913h().mo16264b();
        this.f17082m = C8879d.m14905k().m14914i().m16301e(c6327a);
        this.f17089t = new ArrayList();
        if (runnable == null) {
            this.f17086q = new a();
        } else {
            this.f17086q = runnable;
        }
        File fileM4392l = c6327a.m4392l();
        if (fileM4392l != null) {
            this.f17087r = fileM4392l.getAbsolutePath();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x000e, B:17:0x0022, B:18:0x0028, B:20:0x002e, B:21:0x0034, B:26:0x0040, B:27:0x006d, B:43:0x00c7, B:44:0x00cd, B:46:0x00d3, B:47:0x00d9, B:50:0x00e2, B:51:0x010f, B:54:0x011e, B:55:0x0124, B:57:0x012a, B:58:0x0130, B:61:0x0139, B:62:0x0166, B:63:0x0173, B:14:0x0016, B:30:0x007c, B:32:0x0080, B:34:0x0088, B:37:0x00a0, B:41:0x00b5, B:42:0x00c6, B:36:0x009d), top: B:75:0x0001, inners: #0, #1, #3, #4 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m16271a() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p272w1.C9730d.m16271a():void");
    }

    /* renamed from: b */
    public void m16272b() {
        f17069y.execute(new b());
    }

    /* renamed from: c */
    public void m16273c(int i10) {
        this.f17089t.add(Integer.valueOf(i10));
    }

    /* renamed from: d */
    public synchronized void m16274d(int i10) {
        InterfaceC9727a interfaceC9727a = (InterfaceC9727a) this.f17070a.get(i10);
        if (interfaceC9727a != null) {
            interfaceC9727a.close();
            this.f17070a.remove(i10);
            AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream close task[" + this.f17079j.mo4385c() + "] block[" + i10 + "]");
        }
    }

    /* renamed from: e */
    public void m16275e(int i10) {
        this.f17089t.add(Integer.valueOf(i10));
        try {
            IOException iOException = this.f17088s;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f17083n != null && !this.f17083n.isDone()) {
                AtomicLong atomicLong = (AtomicLong) this.f17071b.get(i10);
                if (atomicLong != null && atomicLong.get() > 0) {
                    m16283m(this.f17091v);
                    m16276f(this.f17091v.f17096a, i10);
                }
            } else if (this.f17083n == null) {
                AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream done but no need to ensure sync, because the sync job not run yet. task[" + this.f17079j.mo4385c() + "] block[" + i10 + "]");
            } else {
                AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream done but no need to ensure sync, because the syncFuture.isDone[" + this.f17083n.isDone() + "] task[" + this.f17079j.mo4385c() + "] block[" + i10 + "]");
            }
            m16274d(i10);
        } catch (Throwable th) {
            m16274d(i10);
            throw th;
        }
    }

    /* renamed from: f */
    public void m16276f(boolean z9, int i10) throws ExecutionException, InterruptedException {
        if (this.f17083n == null || this.f17083n.isDone()) {
            return;
        }
        if (!z9) {
            this.f17085p.put(i10, Thread.currentThread());
        }
        if (this.f17084o != null) {
            m16294x(this.f17084o);
        } else {
            while (!m16286p()) {
                m16290t(25L);
            }
            m16294x(this.f17084o);
        }
        if (!z9) {
            m16289s();
            return;
        }
        m16294x(this.f17084o);
        try {
            this.f17083n.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* renamed from: g */
    public Future m16277g() {
        return f17069y.submit(this.f17086q);
    }

    /* renamed from: h */
    public void m16278h() {
        int size;
        long j10;
        synchronized (this.f17071b) {
            size = this.f17071b.size();
        }
        SparseArray sparseArray = new SparseArray(size);
        int i10 = 0;
        while (true) {
            j10 = 0;
            if (i10 >= size) {
                break;
            }
            try {
                int iKeyAt = this.f17070a.keyAt(i10);
                long j11 = ((AtomicLong) this.f17071b.get(iKeyAt)).get();
                if (j11 > 0) {
                    sparseArray.put(iKeyAt, Long.valueOf(j11));
                    ((InterfaceC9727a) this.f17070a.get(iKeyAt)).mo16261b();
                }
                i10++;
            } catch (IOException e10) {
                AbstractC8999c.m15142z("MultiPointOutputStream", "OutputStream flush and sync data to filesystem failed " + e10);
                return;
            }
        }
        int size2 = sparseArray.size();
        for (int i11 = 0; i11 < size2; i11++) {
            int iKeyAt2 = sparseArray.keyAt(i11);
            long jLongValue = ((Long) sparseArray.valueAt(i11)).longValue();
            this.f17080k.mo15506a(this.f17078i, iKeyAt2, jLongValue);
            j10 += jLongValue;
            ((AtomicLong) this.f17071b.get(iKeyAt2)).addAndGet(-jLongValue);
            AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream sync success (" + this.f17079j.mo4385c() + ") block(" + iKeyAt2 + ")  syncLength(" + jLongValue + ") currentOffset(" + this.f17078i.m15468c(iKeyAt2).m15458c() + ")");
        }
        this.f17072c.addAndGet(-j10);
        this.f17073d.set(SystemClock.uptimeMillis());
    }

    /* renamed from: i */
    public long m16279i() {
        return this.f17077h - (m16287q() - this.f17073d.get());
    }

    /* renamed from: j */
    public void m16280j() throws IOException {
        IOException iOException = this.f17088s;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f17083n == null) {
            synchronized (this.f17086q) {
                try {
                    if (this.f17083n == null) {
                        this.f17083n = m16277g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: k */
    public void m16281k(int i10) throws IOException {
        C9124a c9124aM15468c = this.f17078i.m15468c(i10);
        if (AbstractC8999c.m15131o(c9124aM15468c.m15458c(), c9124aM15468c.m15457b())) {
            return;
        }
        throw new IOException("The current offset on block-info isn't update correct, " + c9124aM15468c.m15458c() + " != " + c9124aM15468c.m15457b() + " on " + i10);
    }

    /* renamed from: l */
    public void m16282l(StatFs statFs, long j10) throws PreAllocateException {
        long jM15127k = AbstractC8999c.m15127k(statFs);
        if (jM15127k < j10) {
            throw new PreAllocateException(j10, jM15127k);
        }
    }

    /* renamed from: m */
    public void m16283m(c cVar) {
        cVar.f17098c.clear();
        int size = new HashSet((List) this.f17089t.clone()).size();
        if (size != this.f17090u.size()) {
            AbstractC8999c.m15125i("MultiPointOutputStream", "task[" + this.f17079j.mo4385c() + "] current need fetching block count " + this.f17090u.size() + " is not equal to no more stream block count " + size);
            cVar.f17096a = false;
        } else {
            AbstractC8999c.m15125i("MultiPointOutputStream", "task[" + this.f17079j.mo4385c() + "] current need fetching block count " + this.f17090u.size() + " is equal to no more stream block count " + size);
            cVar.f17096a = true;
        }
        SparseArray sparseArrayClone = this.f17070a.clone();
        int size2 = sparseArrayClone.size();
        for (int i10 = 0; i10 < size2; i10++) {
            int iKeyAt = sparseArrayClone.keyAt(i10);
            if (this.f17089t.contains(Integer.valueOf(iKeyAt)) && !cVar.f17097b.contains(Integer.valueOf(iKeyAt))) {
                cVar.f17097b.add(Integer.valueOf(iKeyAt));
                cVar.f17098c.add(Integer.valueOf(iKeyAt));
            }
        }
    }

    /* renamed from: n */
    public final void m16284n() {
        if (this.f17087r != null || this.f17079j.m4392l() == null) {
            return;
        }
        this.f17087r = this.f17079j.m4392l().getAbsolutePath();
    }

    /* renamed from: o */
    public boolean m16285o() {
        return this.f17072c.get() < ((long) this.f17076g);
    }

    /* renamed from: p */
    public boolean m16286p() {
        return this.f17084o != null;
    }

    /* renamed from: q */
    public long m16287q() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: r */
    public synchronized InterfaceC9727a m16288r(int i10) {
        InterfaceC9727a interfaceC9727a;
        Uri uriM4375A;
        try {
            interfaceC9727a = (InterfaceC9727a) this.f17070a.get(i10);
            if (interfaceC9727a == null) {
                boolean zM15136t = AbstractC8999c.m15136t(this.f17079j.m4375A());
                if (zM15136t) {
                    File fileM4392l = this.f17079j.m4392l();
                    if (fileM4392l == null) {
                        throw new FileNotFoundException("Filename is not ready!");
                    }
                    File fileMo4386d = this.f17079j.mo4386d();
                    if (!fileMo4386d.exists() && !fileMo4386d.mkdirs()) {
                        throw new IOException("Create parent folder failed!");
                    }
                    if (fileM4392l.createNewFile()) {
                        AbstractC8999c.m15125i("MultiPointOutputStream", "Create new file: " + fileM4392l.getName());
                    }
                    uriM4375A = Uri.fromFile(fileM4392l);
                } else {
                    uriM4375A = this.f17079j.m4375A();
                }
                InterfaceC9727a interfaceC9727aMo16263a = C8879d.m14905k().m14913h().mo16263a(C8879d.m14905k().m14909d(), uriM4375A, this.f17075f);
                if (this.f17081l) {
                    long jM15459d = this.f17078i.m15468c(i10).m15459d();
                    if (jM15459d > 0) {
                        interfaceC9727aMo16263a.mo16262c(jM15459d);
                        AbstractC8999c.m15125i("MultiPointOutputStream", "Create output stream write from (" + this.f17079j.mo4385c() + ") block(" + i10 + ") " + jM15459d);
                    }
                }
                if (this.f17093x) {
                    this.f17080k.mo15509j(this.f17079j.mo4385c());
                }
                if (!this.f17078i.m15478m() && this.f17093x && this.f17082m) {
                    long jM15475j = this.f17078i.m15475j();
                    if (zM15136t) {
                        File fileM4392l2 = this.f17079j.m4392l();
                        long length = jM15475j - fileM4392l2.length();
                        if (length > 0) {
                            m16282l(new StatFs(fileM4392l2.getAbsolutePath()), length);
                            interfaceC9727aMo16263a.mo16260a(jM15475j);
                        }
                    } else {
                        interfaceC9727aMo16263a.mo16260a(jM15475j);
                    }
                }
                synchronized (this.f17071b) {
                    this.f17070a.put(i10, interfaceC9727aMo16263a);
                    this.f17071b.put(i10, new AtomicLong());
                }
                this.f17093x = false;
                interfaceC9727a = interfaceC9727aMo16263a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC9727a;
    }

    /* renamed from: s */
    public void m16289s() {
        LockSupport.park();
    }

    /* renamed from: t */
    public void m16290t(long j10) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(j10));
    }

    /* renamed from: u */
    public void m16291u() {
        int i10;
        AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream start flush looper task[" + this.f17079j.mo4385c() + "] with syncBufferIntervalMills[" + this.f17077h + "] syncBufferSize[" + this.f17076g + "]");
        this.f17084o = Thread.currentThread();
        long jM16279i = (long) this.f17077h;
        m16278h();
        while (true) {
            m16290t(jM16279i);
            m16283m(this.f17092w);
            if (this.f17092w.m16296a()) {
                AbstractC8999c.m15125i("MultiPointOutputStream", "runSync state change isNoMoreStream[" + this.f17092w.f17096a + "] newNoMoreStreamBlockList[" + this.f17092w.f17098c + "]");
                if (this.f17072c.get() > 0) {
                    m16278h();
                }
                for (Integer num : this.f17092w.f17098c) {
                    Thread thread = (Thread) this.f17085p.get(num.intValue());
                    this.f17085p.remove(num.intValue());
                    if (thread != null) {
                        m16294x(thread);
                    }
                }
                if (this.f17092w.f17096a) {
                    break;
                }
            } else {
                if (m16285o()) {
                    i10 = this.f17077h;
                } else {
                    jM16279i = m16279i();
                    if (jM16279i <= 0) {
                        m16278h();
                        i10 = this.f17077h;
                    }
                }
                jM16279i = i10;
            }
        }
        int size = this.f17085p.size();
        for (int i11 = 0; i11 < size; i11++) {
            Thread thread2 = (Thread) this.f17085p.valueAt(i11);
            if (thread2 != null) {
                m16294x(thread2);
            }
        }
        this.f17085p.clear();
        AbstractC8999c.m15125i("MultiPointOutputStream", "OutputStream stop flush looper task[" + this.f17079j.mo4385c() + "]");
    }

    /* renamed from: v */
    public void m16292v() {
        try {
            m16291u();
        } catch (IOException e10) {
            this.f17088s = e10;
            AbstractC8999c.m15142z("MultiPointOutputStream", "Sync to breakpoint-store for task[" + this.f17079j.mo4385c() + "] failed with cause: " + e10);
        }
    }

    /* renamed from: w */
    public void m16293w(List list) {
        this.f17090u = list;
    }

    /* renamed from: x */
    public void m16294x(Thread thread) {
        LockSupport.unpark(thread);
    }

    /* renamed from: y */
    public synchronized void m16295y(int i10, byte[] bArr, int i11) {
        if (this.f17074e) {
            return;
        }
        m16288r(i10).write(bArr, 0, i11);
        long j10 = i11;
        this.f17072c.addAndGet(j10);
        ((AtomicLong) this.f17071b.get(i10)).addAndGet(j10);
        m16280j();
    }

    public C9730d(C6327a c6327a, C9126c c9126c, InterfaceC9132i interfaceC9132i) {
        this(c6327a, c9126c, interfaceC9132i, null);
    }
}
