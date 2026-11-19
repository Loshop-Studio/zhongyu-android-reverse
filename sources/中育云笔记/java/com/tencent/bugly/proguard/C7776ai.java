package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.ai */
/* loaded from: classes5.dex */
public final class C7776ai {

    /* renamed from: b */
    private static C7776ai f13691b;

    /* renamed from: a */
    public InterfaceC7775ah f13692a;

    /* renamed from: d */
    private final Context f13694d;

    /* renamed from: f */
    private long f13696f;

    /* renamed from: g */
    private long f13697g;

    /* renamed from: e */
    private Map<Integer, Long> f13695e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f13698h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f13699i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f13700j = new Object();

    /* renamed from: k */
    private long f13701k = 0;

    /* renamed from: l */
    private int f13702l = 0;

    /* renamed from: c */
    private final C7837w f13693c = C7837w.m10986a();

    /* renamed from: com.tencent.bugly.proguard.ai$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Runnable f13703c;

        public a(Runnable runnable) {
            this.f13703c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13703c.run();
            synchronized (C7776ai.this.f13700j) {
                C7776ai.m10587b(C7776ai.this);
            }
        }
    }

    /* renamed from: com.tencent.bugly.proguard.ai$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f13705c;

        /* renamed from: d */
        public final /* synthetic */ LinkedBlockingQueue f13706d;

        public b(int i10, LinkedBlockingQueue linkedBlockingQueue) {
            this.f13705c = i10;
            this.f13706d = linkedBlockingQueue;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable;
            for (int i10 = 0; i10 < this.f13705c && (runnable = (Runnable) this.f13706d.poll()) != null; i10++) {
                runnable.run();
            }
        }
    }

    private C7776ai(Context context) {
        this.f13694d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m10587b(C7776ai c7776ai) {
        int i10 = c7776ai.f13702l - 1;
        c7776ai.f13702l = i10;
        return i10;
    }

    /* renamed from: a */
    public static synchronized C7776ai m10579a(Context context) {
        try {
            if (f13691b == null) {
                f13691b = new C7776ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13691b;
    }

    /* renamed from: b */
    public final boolean m10595b(int i10) {
        if (C7830p.f14078c) {
            C7779al.m10617c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m10589a(i10);
        C7779al.m10617c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i10));
        if (jCurrentTimeMillis >= 30000) {
            return true;
        }
        C7779al.m10613a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C7776ai m10578a() {
        return f13691b;
    }

    /* renamed from: a */
    public final void m10592a(int i10, C7811bq c7811bq, String str, String str2, InterfaceC7775ah interfaceC7775ah, long j10, boolean z10) {
        try {
            m10584a(new RunnableC7777aj(this.f13694d, i10, c7811bq.f13977g, C7772ae.m10561a((Object) c7811bq), str, str2, interfaceC7775ah, z10), true, true, j10);
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m10588b() {
        C7778ak c7778akM10604a = C7778ak.m10604a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f13700j) {
            try {
                C7779al.m10617c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f13698h.size();
                int size2 = this.f13699i.size();
                if (size == 0 && size2 == 0) {
                    C7779al.m10617c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c7778akM10604a == null || !c7778akM10604a.m10609c()) {
                    size2 = 0;
                }
                m10585a(this.f13698h, linkedBlockingQueue, size);
                m10585a(this.f13699i, linkedBlockingQueue2, size2);
                m10582a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C7779al.m10617c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C7778ak c7778akM10604a2 = C7778ak.m10604a();
                if (c7778akM10604a2 != null) {
                    c7778akM10604a2.m10606a(new b(size2, linkedBlockingQueue2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m10581a(int i10, int i11, byte[] bArr, String str, String str2, InterfaceC7775ah interfaceC7775ah, boolean z10) {
        try {
            m10584a(new RunnableC7777aj(this.f13694d, i10, i11, bArr, str, str2, interfaceC7775ah, 0, 0, false), z10, false, 0L);
        } catch (Throwable th) {
            if (C7779al.m10614a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m10593a(int i10, C7811bq c7811bq, String str, String str2, InterfaceC7775ah interfaceC7775ah, boolean z10) {
        m10581a(i10, c7811bq.f13977g, C7772ae.m10561a((Object) c7811bq), str, str2, interfaceC7775ah, z10);
    }

    /* renamed from: a */
    public final long m10590a(boolean z10) {
        long jM10682d;
        long jM10668b = C7783ap.m10668b();
        int i10 = z10 ? 5 : 3;
        List<C7839y> listM11003a = this.f13693c.m11003a(i10);
        if (listM11003a != null && listM11003a.size() > 0) {
            jM10682d = 0;
            try {
                C7839y c7839y = listM11003a.get(0);
                if (c7839y.f14158e >= jM10668b) {
                    jM10682d = C7783ap.m10682d(c7839y.f14160g);
                    if (i10 == 3) {
                        this.f13696f = jM10682d;
                    } else {
                        this.f13697g = jM10682d;
                    }
                    listM11003a.remove(c7839y);
                }
            } catch (Throwable th) {
                C7779al.m10614a(th);
            }
            if (listM11003a.size() > 0) {
                this.f13693c.m11005a(listM11003a);
            }
        } else {
            jM10682d = z10 ? this.f13697g : this.f13696f;
        }
        C7779al.m10617c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM10682d / 1024));
        return jM10682d;
    }

    /* renamed from: a */
    public final synchronized void m10594a(long j10, boolean z10) {
        int i10 = z10 ? 5 : 3;
        try {
            C7839y c7839y = new C7839y();
            c7839y.f14155b = i10;
            c7839y.f14158e = C7783ap.m10668b();
            c7839y.f14156c = "";
            c7839y.f14157d = "";
            c7839y.f14160g = C7783ap.m10681c(j10);
            this.f13693c.m11008b(i10);
            this.f13693c.m11007a(c7839y);
            if (z10) {
                this.f13697g = j10;
            } else {
                this.f13696f = j10;
            }
            C7779al.m10617c("[UploadManager] Network total consume: %d KB", Long.valueOf(j10 / 1024));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m10591a(int i10, long j10) {
        if (i10 >= 0) {
            this.f13695e.put(Integer.valueOf(i10), Long.valueOf(j10));
            C7839y c7839y = new C7839y();
            c7839y.f14155b = i10;
            c7839y.f14158e = j10;
            c7839y.f14156c = "";
            c7839y.f14157d = "";
            c7839y.f14160g = new byte[0];
            this.f13693c.m11008b(i10);
            this.f13693c.m11007a(c7839y);
            C7779al.m10617c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i10), C7783ap.m10650a(j10));
            return;
        }
        C7779al.m10619e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i10));
    }

    /* renamed from: a */
    public final synchronized long m10589a(int i10) {
        if (i10 >= 0) {
            Long l10 = this.f13695e.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10.longValue();
            }
        } else {
            C7779al.m10619e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i10));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m10585a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C7779al.m10619e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m10582a(int i10, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C7778ak c7778akM10604a = C7778ak.m10604a();
        if (i10 > 0) {
            C7779al.m10617c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f13700j) {
                try {
                    if (this.f13702l >= 2 && c7778akM10604a != null) {
                        c7778akM10604a.m10606a(runnablePoll);
                    } else {
                        C7779al.m10613a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C7783ap.m10656a(new a(runnablePoll), "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f13700j) {
                                this.f13702l++;
                            }
                        } else {
                            C7779al.m10618d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m10586a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m10586a(Runnable runnable, boolean z10) {
        if (runnable == null) {
            C7779al.m10613a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C7779al.m10617c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f13700j) {
                try {
                    if (z10) {
                        this.f13698h.put(runnable);
                    } else {
                        this.f13699i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C7779al.m10619e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m10583a(Runnable runnable, long j10) {
        if (runnable == null) {
            C7779al.m10618d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C7779al.m10617c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM10656a = C7783ap.m10656a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM10656a == null) {
            C7779al.m10619e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m10586a(runnable, true);
            return;
        }
        try {
            threadM10656a.join(j10);
        } catch (Throwable th) {
            C7779al.m10619e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m10586a(runnable, true);
            m10588b();
        }
    }

    /* renamed from: a */
    private void m10584a(Runnable runnable, boolean z10, boolean z11, long j10) {
        C7779al.m10617c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z11) {
            m10583a(runnable, j10);
        } else {
            m10586a(runnable, z10);
            m10588b();
        }
    }
}
