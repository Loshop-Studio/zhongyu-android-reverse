package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.ai */
/* loaded from: classes4.dex */
public final class C6433ai {

    /* renamed from: b */
    private static C6433ai f4592b;

    /* renamed from: a */
    public InterfaceC6432ah f4593a;

    /* renamed from: d */
    private final Context f4595d;

    /* renamed from: f */
    private long f4597f;

    /* renamed from: g */
    private long f4598g;

    /* renamed from: e */
    private Map<Integer, Long> f4596e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f4599h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f4600i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f4601j = new Object();

    /* renamed from: k */
    private long f4602k = 0;

    /* renamed from: l */
    private int f4603l = 0;

    /* renamed from: c */
    private final C6494w f4594c = C6494w.m4656a();

    private C6433ai(Context context) {
        this.f4595d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m4257b(C6433ai c6433ai) {
        int i10 = c6433ai.f4603l - 1;
        c6433ai.f4603l = i10;
        return i10;
    }

    /* renamed from: a */
    public static synchronized C6433ai m4249a(Context context) {
        try {
            if (f4592b == null) {
                f4592b = new C6433ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4592b;
    }

    /* renamed from: b */
    public final boolean m4265b(int i10) {
        if (C6487p.f4979c) {
            C6436al.m4287c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m4259a(i10);
        C6436al.m4287c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i10));
        if (jCurrentTimeMillis >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return true;
        }
        C6436al.m4283a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C6433ai m4248a() {
        return f4592b;
    }

    /* renamed from: a */
    public final void m4262a(int i10, C6468bq c6468bq, String str, String str2, InterfaceC6432ah interfaceC6432ah, long j10, boolean z10) {
        try {
            m4254a(new RunnableC6434aj(this.f4595d, i10, c6468bq.f4878g, C6429ae.m4231a((Object) c6468bq), str, str2, interfaceC6432ah, z10), true, true, j10);
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m4258b() {
        C6435ak c6435akM4274a = C6435ak.m4274a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f4601j) {
            try {
                C6436al.m4287c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f4599h.size();
                final int size2 = this.f4600i.size();
                if (size == 0 && size2 == 0) {
                    C6436al.m4287c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c6435akM4274a == null || !c6435akM4274a.m4279c()) {
                    size2 = 0;
                }
                m4255a(this.f4599h, linkedBlockingQueue, size);
                m4255a(this.f4600i, linkedBlockingQueue2, size2);
                m4252a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C6436al.m4287c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C6435ak c6435akM4274a2 = C6435ak.m4274a();
                if (c6435akM4274a2 != null) {
                    c6435akM4274a2.m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable;
                            for (int i10 = 0; i10 < size2 && (runnable = (Runnable) linkedBlockingQueue2.poll()) != null; i10++) {
                                runnable.run();
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m4251a(int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6432ah interfaceC6432ah, boolean z10) {
        try {
            m4254a(new RunnableC6434aj(this.f4595d, i10, i11, bArr, str, str2, interfaceC6432ah, 0, 0, false), z10, false, 0L);
        } catch (Throwable th) {
            if (C6436al.m4284a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m4263a(int i10, C6468bq c6468bq, String str, String str2, InterfaceC6432ah interfaceC6432ah, boolean z10) {
        m4251a(i10, c6468bq.f4878g, C6429ae.m4231a((Object) c6468bq), str, str2, interfaceC6432ah, z10);
    }

    /* renamed from: a */
    public final long m4260a(boolean z10) {
        long jM4352d;
        long jM4338b = C6440ap.m4338b();
        int i10 = z10 ? 5 : 3;
        List<C6496y> listM4673a = this.f4594c.m4673a(i10);
        if (listM4673a != null && listM4673a.size() > 0) {
            jM4352d = 0;
            try {
                C6496y c6496y = listM4673a.get(0);
                if (c6496y.f5059e >= jM4338b) {
                    jM4352d = C6440ap.m4352d(c6496y.f5061g);
                    if (i10 == 3) {
                        this.f4597f = jM4352d;
                    } else {
                        this.f4598g = jM4352d;
                    }
                    listM4673a.remove(c6496y);
                }
            } catch (Throwable th) {
                C6436al.m4284a(th);
            }
            if (listM4673a.size() > 0) {
                this.f4594c.m4675a(listM4673a);
            }
        } else {
            jM4352d = z10 ? this.f4598g : this.f4597f;
        }
        C6436al.m4287c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM4352d / 1024));
        return jM4352d;
    }

    /* renamed from: a */
    public final synchronized void m4264a(long j10, boolean z10) {
        int i10 = z10 ? 5 : 3;
        try {
            C6496y c6496y = new C6496y();
            c6496y.f5056b = i10;
            c6496y.f5059e = C6440ap.m4338b();
            c6496y.f5057c = "";
            c6496y.f5058d = "";
            c6496y.f5061g = C6440ap.m4351c(j10);
            this.f4594c.m4678b(i10);
            this.f4594c.m4677a(c6496y);
            if (z10) {
                this.f4598g = j10;
            } else {
                this.f4597f = j10;
            }
            C6436al.m4287c("[UploadManager] Network total consume: %d KB", Long.valueOf(j10 / 1024));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m4261a(int i10, long j10) {
        if (i10 >= 0) {
            this.f4596e.put(Integer.valueOf(i10), Long.valueOf(j10));
            C6496y c6496y = new C6496y();
            c6496y.f5056b = i10;
            c6496y.f5059e = j10;
            c6496y.f5057c = "";
            c6496y.f5058d = "";
            c6496y.f5061g = new byte[0];
            this.f4594c.m4678b(i10);
            this.f4594c.m4677a(c6496y);
            C6436al.m4287c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i10), C6440ap.m4320a(j10));
            return;
        }
        C6436al.m4289e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i10));
    }

    /* renamed from: a */
    public final synchronized long m4259a(int i10) {
        if (i10 >= 0) {
            Long l10 = this.f4596e.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10.longValue();
            }
        } else {
            C6436al.m4289e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i10));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m4255a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C6436al.m4289e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m4252a(int i10, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C6435ak c6435akM4274a = C6435ak.m4274a();
        if (i10 > 0) {
            C6436al.m4287c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i11 = 0; i11 < i10; i11++) {
            final Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f4601j) {
                try {
                    if (this.f4603l >= 2 && c6435akM4274a != null) {
                        c6435akM4274a.m4276a(runnablePoll);
                    } else {
                        C6436al.m4283a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C6440ap.m4326a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnablePoll.run();
                                synchronized (C6433ai.this.f4601j) {
                                    C6433ai.m4257b(C6433ai.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f4601j) {
                                this.f4603l++;
                            }
                        } else {
                            C6436al.m4288d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m4256a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4256a(Runnable runnable, boolean z10) {
        if (runnable == null) {
            C6436al.m4283a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C6436al.m4287c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f4601j) {
                try {
                    if (z10) {
                        this.f4599h.put(runnable);
                    } else {
                        this.f4600i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C6436al.m4289e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m4253a(Runnable runnable, long j10) {
        if (runnable == null) {
            C6436al.m4288d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C6436al.m4287c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM4326a = C6440ap.m4326a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM4326a == null) {
            C6436al.m4289e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m4256a(runnable, true);
            return;
        }
        try {
            threadM4326a.join(j10);
        } catch (Throwable th) {
            C6436al.m4289e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m4256a(runnable, true);
            m4258b();
        }
    }

    /* renamed from: a */
    private void m4254a(Runnable runnable, boolean z10, boolean z11, long j10) {
        C6436al.m4287c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z11) {
            m4253a(runnable, j10);
        } else {
            m4256a(runnable, z10);
            m4258b();
        }
    }
}
