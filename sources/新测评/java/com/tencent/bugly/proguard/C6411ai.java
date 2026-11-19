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
public final class C6411ai {

    /* renamed from: b */
    private static C6411ai f5249b;

    /* renamed from: a */
    public InterfaceC6410ah f5250a;

    /* renamed from: d */
    private final Context f5252d;

    /* renamed from: f */
    private long f5254f;

    /* renamed from: g */
    private long f5255g;

    /* renamed from: e */
    private Map<Integer, Long> f5253e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f5256h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f5257i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f5258j = new Object();

    /* renamed from: k */
    private long f5259k = 0;

    /* renamed from: l */
    private int f5260l = 0;

    /* renamed from: c */
    private final C6472w f5251c = C6472w.m5296a();

    private C6411ai(Context context) {
        this.f5252d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m4897b(C6411ai c6411ai) {
        int i10 = c6411ai.f5260l - 1;
        c6411ai.f5260l = i10;
        return i10;
    }

    /* renamed from: a */
    public static synchronized C6411ai m4889a(Context context) {
        try {
            if (f5249b == null) {
                f5249b = new C6411ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5249b;
    }

    /* renamed from: b */
    public final boolean m4905b(int i10) {
        if (C6465p.f5636c) {
            C6414al.m4927c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m4899a(i10);
        C6414al.m4927c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i10));
        if (jCurrentTimeMillis >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return true;
        }
        C6414al.m4923a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C6411ai m4888a() {
        return f5249b;
    }

    /* renamed from: a */
    public final void m4902a(int i10, C6446bq c6446bq, String str, String str2, InterfaceC6410ah interfaceC6410ah, long j10, boolean z9) {
        try {
            m4894a(new RunnableC6412aj(this.f5252d, i10, c6446bq.f5535g, C6407ae.m4871a((Object) c6446bq), str, str2, interfaceC6410ah, z9), true, true, j10);
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m4898b() {
        C6413ak c6413akM4914a = C6413ak.m4914a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f5258j) {
            try {
                C6414al.m4927c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f5256h.size();
                final int size2 = this.f5257i.size();
                if (size == 0 && size2 == 0) {
                    C6414al.m4927c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c6413akM4914a == null || !c6413akM4914a.m4919c()) {
                    size2 = 0;
                }
                m4895a(this.f5256h, linkedBlockingQueue, size);
                m4895a(this.f5257i, linkedBlockingQueue2, size2);
                m4892a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C6414al.m4927c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C6413ak c6413akM4914a2 = C6413ak.m4914a();
                if (c6413akM4914a2 != null) {
                    c6413akM4914a2.m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.2
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
    private void m4891a(int i10, int i11, byte[] bArr, String str, String str2, InterfaceC6410ah interfaceC6410ah, boolean z9) {
        try {
            m4894a(new RunnableC6412aj(this.f5252d, i10, i11, bArr, str, str2, interfaceC6410ah, 0, 0, false), z9, false, 0L);
        } catch (Throwable th) {
            if (C6414al.m4924a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m4903a(int i10, C6446bq c6446bq, String str, String str2, InterfaceC6410ah interfaceC6410ah, boolean z9) {
        m4891a(i10, c6446bq.f5535g, C6407ae.m4871a((Object) c6446bq), str, str2, interfaceC6410ah, z9);
    }

    /* renamed from: a */
    public final long m4900a(boolean z9) {
        long jM4992d;
        long jM4978b = C6418ap.m4978b();
        int i10 = z9 ? 5 : 3;
        List<C6474y> listM5313a = this.f5251c.m5313a(i10);
        if (listM5313a != null && listM5313a.size() > 0) {
            jM4992d = 0;
            try {
                C6474y c6474y = listM5313a.get(0);
                if (c6474y.f5716e >= jM4978b) {
                    jM4992d = C6418ap.m4992d(c6474y.f5718g);
                    if (i10 == 3) {
                        this.f5254f = jM4992d;
                    } else {
                        this.f5255g = jM4992d;
                    }
                    listM5313a.remove(c6474y);
                }
            } catch (Throwable th) {
                C6414al.m4924a(th);
            }
            if (listM5313a.size() > 0) {
                this.f5251c.m5315a(listM5313a);
            }
        } else {
            jM4992d = z9 ? this.f5255g : this.f5254f;
        }
        C6414al.m4927c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM4992d / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        return jM4992d;
    }

    /* renamed from: a */
    public final synchronized void m4904a(long j10, boolean z9) {
        int i10 = z9 ? 5 : 3;
        try {
            C6474y c6474y = new C6474y();
            c6474y.f5713b = i10;
            c6474y.f5716e = C6418ap.m4978b();
            c6474y.f5714c = "";
            c6474y.f5715d = "";
            c6474y.f5718g = C6418ap.m4991c(j10);
            this.f5251c.m5318b(i10);
            this.f5251c.m5317a(c6474y);
            if (z9) {
                this.f5255g = j10;
            } else {
                this.f5254f = j10;
            }
            C6414al.m4927c("[UploadManager] Network total consume: %d KB", Long.valueOf(j10 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m4901a(int i10, long j10) {
        if (i10 >= 0) {
            this.f5253e.put(Integer.valueOf(i10), Long.valueOf(j10));
            C6474y c6474y = new C6474y();
            c6474y.f5713b = i10;
            c6474y.f5716e = j10;
            c6474y.f5714c = "";
            c6474y.f5715d = "";
            c6474y.f5718g = new byte[0];
            this.f5251c.m5318b(i10);
            this.f5251c.m5317a(c6474y);
            C6414al.m4927c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i10), C6418ap.m4960a(j10));
            return;
        }
        C6414al.m4929e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i10));
    }

    /* renamed from: a */
    public final synchronized long m4899a(int i10) {
        if (i10 >= 0) {
            Long l10 = this.f5253e.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10.longValue();
            }
        } else {
            C6414al.m4929e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i10));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m4895a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C6414al.m4929e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m4892a(int i10, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C6413ak c6413akM4914a = C6413ak.m4914a();
        if (i10 > 0) {
            C6414al.m4927c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i10), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i11 = 0; i11 < i10; i11++) {
            final Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f5258j) {
                try {
                    if (this.f5260l >= 2 && c6413akM4914a != null) {
                        c6413akM4914a.m4916a(runnablePoll);
                    } else {
                        C6414al.m4923a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C6418ap.m4966a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnablePoll.run();
                                synchronized (C6411ai.this.f5258j) {
                                    C6411ai.m4897b(C6411ai.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f5258j) {
                                this.f5260l++;
                            }
                        } else {
                            C6414al.m4928d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m4896a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4896a(Runnable runnable, boolean z9) {
        if (runnable == null) {
            C6414al.m4923a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C6414al.m4927c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f5258j) {
                try {
                    if (z9) {
                        this.f5256h.put(runnable);
                    } else {
                        this.f5257i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C6414al.m4929e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m4893a(Runnable runnable, long j10) {
        if (runnable == null) {
            C6414al.m4928d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C6414al.m4927c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM4966a = C6418ap.m4966a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM4966a == null) {
            C6414al.m4929e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m4896a(runnable, true);
            return;
        }
        try {
            threadM4966a.join(j10);
        } catch (Throwable th) {
            C6414al.m4929e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m4896a(runnable, true);
            m4898b();
        }
    }

    /* renamed from: a */
    private void m4894a(Runnable runnable, boolean z9, boolean z10, long j10) {
        C6414al.m4927c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z10) {
            m4893a(runnable, j10);
        } else {
            m4896a(runnable, z9);
            m4898b();
        }
    }
}
