package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.blankj.utilcode.util.RunnableC3379a0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.tencent.bugly.proguard.ai */
/* loaded from: classes3.dex */
public final class C4052ai {

    /* renamed from: b */
    private static C4052ai f3486b;

    /* renamed from: a */
    public InterfaceC4051ah f3487a;

    /* renamed from: d */
    private final Context f3489d;

    /* renamed from: f */
    private long f3491f;

    /* renamed from: g */
    private long f3492g;

    /* renamed from: e */
    private Map<Integer, Long> f3490e = new HashMap();

    /* renamed from: h */
    private LinkedBlockingQueue<Runnable> f3493h = new LinkedBlockingQueue<>();

    /* renamed from: i */
    private LinkedBlockingQueue<Runnable> f3494i = new LinkedBlockingQueue<>();

    /* renamed from: j */
    private final Object f3495j = new Object();

    /* renamed from: k */
    private long f3496k = 0;

    /* renamed from: l */
    private int f3497l = 0;

    /* renamed from: c */
    private final C4143w f3488c = C4143w.m3393a();

    private C4052ai(Context context) {
        this.f3489d = context;
    }

    /* renamed from: b */
    public static /* synthetic */ int m2995b(C4052ai c4052ai) {
        int i = c4052ai.f3497l - 1;
        c4052ai.f3497l = i;
        return i;
    }

    /* renamed from: a */
    public static synchronized C4052ai m2987a(Context context) {
        try {
            if (f3486b == null) {
                f3486b = new C4052ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3486b;
    }

    /* renamed from: b */
    public final boolean m3003b(int i) {
        if (C4129p.f3864c) {
            C4055al.m3025c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m2997a(i);
        C4055al.m3025c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i));
        if (jCurrentTimeMillis >= 30000) {
            return true;
        }
        C4055al.m3021a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* renamed from: a */
    public static synchronized C4052ai m2986a() {
        return f3486b;
    }

    /* renamed from: a */
    public final void m3000a(int i, C4089bq c4089bq, String str, String str2, InterfaceC4051ah interfaceC4051ah, long j7, boolean z8) {
        try {
            m2992a(new RunnableC4053aj(this.f3489d, i, c4089bq.f3737g, C4048ae.m2970a((Object) c4089bq), str, str2, interfaceC4051ah, z8), true, true, j7);
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2996b() {
        C4054ak c4054akM3012a = C4054ak.m3012a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f3495j) {
            try {
                C4055al.m3025c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f3493h.size();
                int size2 = this.f3494i.size();
                if (size == 0 && size2 == 0) {
                    C4055al.m3025c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (c4054akM3012a == null || !c4054akM3012a.m3017c()) {
                    size2 = 0;
                }
                m2993a(this.f3493h, linkedBlockingQueue, size);
                m2993a(this.f3494i, linkedBlockingQueue2, size2);
                m2990a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    C4055al.m3025c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                C4054ak c4054akM3012a2 = C4054ak.m3012a();
                if (c4054akM3012a2 != null) {
                    c4054akM3012a2.m3014a(new RunnableC4124m0(size2, linkedBlockingQueue2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m2989a(int i, int i8, byte[] bArr, String str, String str2, InterfaceC4051ah interfaceC4051ah, boolean z8) {
        try {
            m2992a(new RunnableC4053aj(this.f3489d, i, i8, bArr, str, str2, interfaceC4051ah, 0, 0, false), z8, false, 0L);
        } catch (Throwable th) {
            if (C4055al.m3022a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m3001a(int i, C4089bq c4089bq, String str, String str2, InterfaceC4051ah interfaceC4051ah, boolean z8) {
        m2989a(i, c4089bq.f3737g, C4048ae.m2970a((Object) c4089bq), str, str2, interfaceC4051ah, z8);
    }

    /* renamed from: a */
    public final long m2998a(boolean z8) {
        long jM3090d;
        long jM3076b = C4059ap.m3076b();
        int i = z8 ? 5 : 3;
        List<C4147y> listM3410a = this.f3488c.m3410a(i);
        if (listM3410a != null && listM3410a.size() > 0) {
            jM3090d = 0;
            try {
                C4147y c4147y = listM3410a.get(0);
                if (c4147y.f3913e >= jM3076b) {
                    jM3090d = C4059ap.m3090d(c4147y.f3915g);
                    if (i == 3) {
                        this.f3491f = jM3090d;
                    } else {
                        this.f3492g = jM3090d;
                    }
                    listM3410a.remove(c4147y);
                }
            } catch (Throwable th) {
                C4055al.m3022a(th);
            }
            if (listM3410a.size() > 0) {
                this.f3488c.m3412a(listM3410a);
            }
        } else {
            jM3090d = z8 ? this.f3492g : this.f3491f;
        }
        C4055al.m3025c("[UploadManager] Local network consume: %d KB", Long.valueOf(jM3090d / 1024));
        return jM3090d;
    }

    /* renamed from: a */
    public final synchronized void m3002a(long j7, boolean z8) {
        int i = z8 ? 5 : 3;
        try {
            C4147y c4147y = new C4147y();
            c4147y.f3910b = i;
            c4147y.f3913e = C4059ap.m3076b();
            c4147y.f3911c = "";
            c4147y.f3912d = "";
            c4147y.f3915g = C4059ap.m3089c(j7);
            this.f3488c.m3415b(i);
            this.f3488c.m3414a(c4147y);
            if (z8) {
                this.f3492g = j7;
            } else {
                this.f3491f = j7;
            }
            C4055al.m3025c("[UploadManager] Network total consume: %d KB", Long.valueOf(j7 / 1024));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m2999a(int i, long j7) {
        if (i >= 0) {
            this.f3490e.put(Integer.valueOf(i), Long.valueOf(j7));
            C4147y c4147y = new C4147y();
            c4147y.f3910b = i;
            c4147y.f3913e = j7;
            c4147y.f3911c = "";
            c4147y.f3912d = "";
            c4147y.f3915g = new byte[0];
            this.f3488c.m3415b(i);
            this.f3488c.m3414a(c4147y);
            C4055al.m3025c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i), C4059ap.m3058a(j7));
            return;
        }
        C4055al.m3027e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized long m2997a(int i) {
        if (i >= 0) {
            Long l = this.f3490e.get(Integer.valueOf(i));
            if (l != null) {
                return l.longValue();
            }
        } else {
            C4055al.m3027e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i));
        }
        return 0L;
    }

    /* renamed from: a */
    private static void m2993a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i) {
        for (int i8 = 0; i8 < i; i8++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                C4055al.m3027e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m2990a(int i, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C4054ak c4054akM3012a = C4054ak.m3012a();
        if (i > 0) {
            C4055al.m3025c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i8 = 0; i8 < i; i8++) {
            Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f3495j) {
                try {
                    if (this.f3497l >= 2 && c4054akM3012a != null) {
                        c4054akM3012a.m3014a(runnablePoll);
                    } else {
                        C4055al.m3021a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (C4059ap.m3064a(new RunnableC3379a0(1, this, false, runnablePoll), "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f3495j) {
                                this.f3497l++;
                            }
                        } else {
                            C4055al.m3026d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m2994a(runnablePoll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m2994a(Runnable runnable, boolean z8) {
        if (runnable == null) {
            C4055al.m3021a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C4055al.m3025c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f3495j) {
                try {
                    if (z8) {
                        this.f3493h.put(runnable);
                    } else {
                        this.f3494i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            C4055al.m3027e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    private void m2991a(Runnable runnable, long j7) {
        if (runnable == null) {
            C4055al.m3026d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C4055al.m3025c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM3064a = C4059ap.m3064a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadM3064a == null) {
            C4055al.m3027e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m2994a(runnable, true);
            return;
        }
        try {
            threadM3064a.join(j7);
        } catch (Throwable th) {
            C4055al.m3027e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            m2994a(runnable, true);
            m2996b();
        }
    }

    /* renamed from: a */
    private void m2992a(Runnable runnable, boolean z8, boolean z9, long j7) {
        C4055al.m3025c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z9) {
            m2991a(runnable, j7);
        } else {
            m2994a(runnable, z8);
            m2996b();
        }
    }
}
