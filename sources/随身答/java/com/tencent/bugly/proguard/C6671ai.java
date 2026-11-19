package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.ai */
/* loaded from: classes4.dex */
public final class C6671ai {

    /* renamed from: b */
    private static C6671ai f5826b;

    /* renamed from: a */
    public InterfaceC6670ah f5827a;

    /* renamed from: d */
    private final Context f5829d;

    /* renamed from: f */
    private long f5831f;

    /* renamed from: g */
    private long f5832g;

    /* renamed from: e */
    private Map<Integer, Long> f5830e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f5833h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f5834i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f5835j = new Object();

    /* renamed from: k */
    private long f5836k = 0;

    /* renamed from: l */
    private int f5837l = 0;

    /* renamed from: c */
    private final C6732w f5828c = C6732w.m5475a();

    private C6671ai(Context context) {
        this.f5829d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m5076b(C6671ai c6671ai) {
        int i9 = c6671ai.f5837l - 1;
        c6671ai.f5837l = i9;
        return i9;
    }

    /* renamed from: a */
    public static synchronized C6671ai m5068a(Context context) {
        try {
            if (f5826b == null) {
                f5826b = new C6671ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5826b;
    }

    /* renamed from: b */
    public final boolean m5084b(int i9) {
        if (C6725p.f6213c) {
            C6674al.m5106c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m5078a(i9);
        C6674al.m5106c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i9));
        if (jCurrentTimeMillis >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return true;
        }
        C6674al.m5102a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C6671ai m5067a() {
        return f5826b;
    }

    /* renamed from: a */
    public final void m5081a(int i9, C6706bq c6706bq, String str, String str2, InterfaceC6670ah interfaceC6670ah, long j9, boolean z9) {
        try {
            m5073a(new RunnableC6672aj(this.f5829d, i9, c6706bq.f6112g, C6667ae.m5050a((Object) c6706bq), str, str2, interfaceC6670ah, z9), true, true, j9);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m5077b() {
        C6673ak c6673akM5093a = C6673ak.m5093a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f5835j) {
            try {
                C6674al.m5106c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f5833h.size();
                final int size2 = this.f5834i.size();
                if (size == 0 && size2 == 0) {
                    C6674al.m5106c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c6673akM5093a == null || !c6673akM5093a.m5098c()) {
                    size2 = 0;
                }
                m5074a(this.f5833h, linkedBlockingQueue, size);
                m5074a(this.f5834i, linkedBlockingQueue2, size2);
                m5071a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C6674al.m5106c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C6673ak c6673akM5093a2 = C6673ak.m5093a();
                if (c6673akM5093a2 != null) {
                    c6673akM5093a2.m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable;
                            for (int i9 = 0; i9 < size2 && (runnable = (Runnable) linkedBlockingQueue2.poll()) != null; i9++) {
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
    private void m5070a(int i9, int i10, byte[] bArr, String str, String str2, InterfaceC6670ah interfaceC6670ah, boolean z9) {
        try {
            m5073a(new RunnableC6672aj(this.f5829d, i9, i10, bArr, str, str2, interfaceC6670ah, 0, 0, false), z9, false, 0L);
        } catch (Throwable th) {
            if (C6674al.m5103a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m5082a(int i9, C6706bq c6706bq, String str, String str2, InterfaceC6670ah interfaceC6670ah, boolean z9) {
        m5070a(i9, c6706bq.f6112g, C6667ae.m5050a((Object) c6706bq), str, str2, interfaceC6670ah, z9);
    }

    /* renamed from: a */
    public final long m5079a(boolean z9) {
        long jM5171d;
        long jM5157b = C6678ap.m5157b();
        int i9 = z9 ? 5 : 3;
        List<C6734y> listM5492a = this.f5828c.m5492a(i9);
        if (listM5492a != null && listM5492a.size() > 0) {
            jM5171d = 0;
            try {
                C6734y c6734y = listM5492a.get(0);
                if (c6734y.f6293e >= jM5157b) {
                    jM5171d = C6678ap.m5171d(c6734y.f6295g);
                    if (i9 == 3) {
                        this.f5831f = jM5171d;
                    } else {
                        this.f5832g = jM5171d;
                    }
                    listM5492a.remove(c6734y);
                }
            } catch (Throwable th) {
                C6674al.m5103a(th);
            }
            if (listM5492a.size() > 0) {
                this.f5828c.m5494a(listM5492a);
            }
        } else {
            jM5171d = z9 ? this.f5832g : this.f5831f;
        }
        C6674al.m5106c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM5171d / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        return jM5171d;
    }

    /* renamed from: a */
    public final synchronized void m5083a(long j9, boolean z9) {
        int i9 = z9 ? 5 : 3;
        try {
            C6734y c6734y = new C6734y();
            c6734y.f6290b = i9;
            c6734y.f6293e = C6678ap.m5157b();
            c6734y.f6291c = "";
            c6734y.f6292d = "";
            c6734y.f6295g = C6678ap.m5170c(j9);
            this.f5828c.m5497b(i9);
            this.f5828c.m5496a(c6734y);
            if (z9) {
                this.f5832g = j9;
            } else {
                this.f5831f = j9;
            }
            C6674al.m5106c("[UploadManager] Network total consume: %d KB", Long.valueOf(j9 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m5080a(int i9, long j9) {
        if (i9 >= 0) {
            this.f5830e.put(Integer.valueOf(i9), Long.valueOf(j9));
            C6734y c6734y = new C6734y();
            c6734y.f6290b = i9;
            c6734y.f6293e = j9;
            c6734y.f6291c = "";
            c6734y.f6292d = "";
            c6734y.f6295g = new byte[0];
            this.f5828c.m5497b(i9);
            this.f5828c.m5496a(c6734y);
            C6674al.m5106c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i9), C6678ap.m5139a(j9));
            return;
        }
        C6674al.m5108e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i9));
    }

    /* renamed from: a */
    public final synchronized long m5078a(int i9) {
        if (i9 >= 0) {
            Long l9 = this.f5830e.get(Integer.valueOf(i9));
            if (l9 != null) {
                return l9.longValue();
            }
        } else {
            C6674al.m5108e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i9));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m5074a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C6674al.m5108e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m5071a(int i9, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C6673ak c6673akM5093a = C6673ak.m5093a();
        if (i9 > 0) {
            C6674al.m5106c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i9), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i10 = 0; i10 < i9; i10++) {
            final Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f5835j) {
                try {
                    if (this.f5837l >= 2 && c6673akM5093a != null) {
                        c6673akM5093a.m5095a(runnablePoll);
                    } else {
                        C6674al.m5102a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C6678ap.m5145a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnablePoll.run();
                                synchronized (C6671ai.this.f5835j) {
                                    C6671ai.m5076b(C6671ai.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f5835j) {
                                this.f5837l++;
                            }
                        } else {
                            C6674al.m5107d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m5075a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m5075a(Runnable runnable, boolean z9) {
        if (runnable == null) {
            C6674al.m5102a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C6674al.m5106c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f5835j) {
                try {
                    if (z9) {
                        this.f5833h.put(runnable);
                    } else {
                        this.f5834i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C6674al.m5108e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m5072a(Runnable runnable, long j9) {
        if (runnable == null) {
            C6674al.m5107d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C6674al.m5106c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM5145a = C6678ap.m5145a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM5145a == null) {
            C6674al.m5108e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m5075a(runnable, true);
            return;
        }
        try {
            threadM5145a.join(j9);
        } catch (Throwable th) {
            C6674al.m5108e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m5075a(runnable, true);
            m5077b();
        }
    }

    /* renamed from: a */
    private void m5073a(Runnable runnable, boolean z9, boolean z10, long j9) {
        C6674al.m5106c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z10) {
            m5072a(runnable, j9);
        } else {
            m5075a(runnable, z9);
            m5077b();
        }
    }
}
