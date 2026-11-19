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
/* loaded from: classes3.dex */
public final class C5788ai {

    /* renamed from: b */
    private static C5788ai f3970b;

    /* renamed from: a */
    public InterfaceC5787ah f3971a;

    /* renamed from: d */
    private final Context f3973d;

    /* renamed from: f */
    private long f3975f;

    /* renamed from: g */
    private long f3976g;

    /* renamed from: e */
    private Map<Integer, Long> f3974e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f3977h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f3978i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f3979j = new Object();

    /* renamed from: k */
    private long f3980k = 0;

    /* renamed from: l */
    private int f3981l = 0;

    /* renamed from: c */
    private final C5849w f3972c = C5849w.m4301a();

    private C5788ai(Context context) {
        this.f3973d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m3902b(C5788ai c5788ai) {
        int i6 = c5788ai.f3981l - 1;
        c5788ai.f3981l = i6;
        return i6;
    }

    /* renamed from: a */
    public static synchronized C5788ai m3894a(Context context) {
        try {
            if (f3970b == null) {
                f3970b = new C5788ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3970b;
    }

    /* renamed from: b */
    public final boolean m3910b(int i6) {
        if (C5842p.f4357c) {
            C5791al.m3932c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m3904a(i6);
        C5791al.m3932c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i6));
        if (jCurrentTimeMillis >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return true;
        }
        C5791al.m3928a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C5788ai m3893a() {
        return f3970b;
    }

    /* renamed from: a */
    public final void m3907a(int i6, C5823bq c5823bq, String str, String str2, InterfaceC5787ah interfaceC5787ah, long j6, boolean z6) {
        try {
            m3899a(new RunnableC5789aj(this.f3973d, i6, c5823bq.f4256g, C5784ae.m3876a((Object) c5823bq), str, str2, interfaceC5787ah, z6), true, true, j6);
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m3903b() {
        C5790ak c5790akM3919a = C5790ak.m3919a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f3979j) {
            try {
                C5791al.m3932c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f3977h.size();
                final int size2 = this.f3978i.size();
                if (size == 0 && size2 == 0) {
                    C5791al.m3932c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c5790akM3919a == null || !c5790akM3919a.m3924c()) {
                    size2 = 0;
                }
                m3900a(this.f3977h, linkedBlockingQueue, size);
                m3900a(this.f3978i, linkedBlockingQueue2, size2);
                m3897a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C5791al.m3932c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C5790ak c5790akM3919a2 = C5790ak.m3919a();
                if (c5790akM3919a2 != null) {
                    c5790akM3919a2.m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable;
                            for (int i6 = 0; i6 < size2 && (runnable = (Runnable) linkedBlockingQueue2.poll()) != null; i6++) {
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
    private void m3896a(int i6, int i7, byte[] bArr, String str, String str2, InterfaceC5787ah interfaceC5787ah, boolean z6) {
        try {
            m3899a(new RunnableC5789aj(this.f3973d, i6, i7, bArr, str, str2, interfaceC5787ah, 0, 0, false), z6, false, 0L);
        } catch (Throwable th) {
            if (C5791al.m3929a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m3908a(int i6, C5823bq c5823bq, String str, String str2, InterfaceC5787ah interfaceC5787ah, boolean z6) {
        m3896a(i6, c5823bq.f4256g, C5784ae.m3876a((Object) c5823bq), str, str2, interfaceC5787ah, z6);
    }

    /* renamed from: a */
    public final long m3905a(boolean z6) {
        long jM3997d;
        long jM3983b = C5795ap.m3983b();
        int i6 = z6 ? 5 : 3;
        List<C5851y> listM4318a = this.f3972c.m4318a(i6);
        if (listM4318a != null && listM4318a.size() > 0) {
            jM3997d = 0;
            try {
                C5851y c5851y = listM4318a.get(0);
                if (c5851y.f4437e >= jM3983b) {
                    jM3997d = C5795ap.m3997d(c5851y.f4439g);
                    if (i6 == 3) {
                        this.f3975f = jM3997d;
                    } else {
                        this.f3976g = jM3997d;
                    }
                    listM4318a.remove(c5851y);
                }
            } catch (Throwable th) {
                C5791al.m3929a(th);
            }
            if (listM4318a.size() > 0) {
                this.f3972c.m4320a(listM4318a);
            }
        } else {
            jM3997d = z6 ? this.f3976g : this.f3975f;
        }
        C5791al.m3932c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM3997d / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        return jM3997d;
    }

    /* renamed from: a */
    public final synchronized void m3909a(long j6, boolean z6) {
        int i6 = z6 ? 5 : 3;
        try {
            C5851y c5851y = new C5851y();
            c5851y.f4434b = i6;
            c5851y.f4437e = C5795ap.m3983b();
            c5851y.f4435c = "";
            c5851y.f4436d = "";
            c5851y.f4439g = C5795ap.m3996c(j6);
            this.f3972c.m4323b(i6);
            this.f3972c.m4322a(c5851y);
            if (z6) {
                this.f3976g = j6;
            } else {
                this.f3975f = j6;
            }
            C5791al.m3932c("[UploadManager] Network total consume: %d KB", Long.valueOf(j6 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m3906a(int i6, long j6) {
        if (i6 >= 0) {
            this.f3974e.put(Integer.valueOf(i6), Long.valueOf(j6));
            C5851y c5851y = new C5851y();
            c5851y.f4434b = i6;
            c5851y.f4437e = j6;
            c5851y.f4435c = "";
            c5851y.f4436d = "";
            c5851y.f4439g = new byte[0];
            this.f3972c.m4323b(i6);
            this.f3972c.m4322a(c5851y);
            C5791al.m3932c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i6), C5795ap.m3965a(j6));
            return;
        }
        C5791al.m3934e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i6));
    }

    /* renamed from: a */
    public final synchronized long m3904a(int i6) {
        if (i6 >= 0) {
            Long l6 = this.f3974e.get(Integer.valueOf(i6));
            if (l6 != null) {
                return l6.longValue();
            }
        } else {
            C5791al.m3934e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i6));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m3900a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C5791al.m3934e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m3897a(int i6, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C5790ak c5790akM3919a = C5790ak.m3919a();
        if (i6 > 0) {
            C5791al.m3932c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i6), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i7 = 0; i7 < i6; i7++) {
            final Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f3979j) {
                try {
                    if (this.f3981l >= 2 && c5790akM3919a != null) {
                        c5790akM3919a.m3921a(runnablePoll);
                    } else {
                        C5791al.m3928a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C5795ap.m3971a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                runnablePoll.run();
                                synchronized (C5788ai.this.f3979j) {
                                    C5788ai.m3902b(C5788ai.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f3979j) {
                                this.f3981l++;
                            }
                        } else {
                            C5791al.m3933d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m3901a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m3901a(Runnable runnable, boolean z6) {
        if (runnable == null) {
            C5791al.m3928a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C5791al.m3932c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f3979j) {
                try {
                    if (z6) {
                        this.f3977h.put(runnable);
                    } else {
                        this.f3978i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C5791al.m3934e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m3898a(Runnable runnable, long j6) {
        if (runnable == null) {
            C5791al.m3933d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C5791al.m3932c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM3971a = C5795ap.m3971a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM3971a == null) {
            C5791al.m3934e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m3901a(runnable, true);
            return;
        }
        try {
            threadM3971a.join(j6);
        } catch (Throwable th) {
            C5791al.m3934e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m3901a(runnable, true);
            m3903b();
        }
    }

    /* renamed from: a */
    private void m3899a(Runnable runnable, boolean z6, boolean z7, long j6) {
        C5791al.m3932c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z7) {
            m3898a(runnable, j6);
        } else {
            m3901a(runnable, z6);
            m3903b();
        }
    }
}
