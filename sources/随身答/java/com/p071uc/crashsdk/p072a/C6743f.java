package com.p071uc.crashsdk.p072a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.uc.crashsdk.a.f */
/* loaded from: classes4.dex */
public class C6743f {

    /* renamed from: a */
    static final /* synthetic */ boolean f6350a = true;

    /* renamed from: b */
    private static volatile HandlerThread f6351b;

    /* renamed from: c */
    private static volatile HandlerThread f6352c;

    /* renamed from: d */
    private static volatile HandlerThread f6353d;

    /* renamed from: e */
    private static Handler f6354e;

    /* renamed from: f */
    private static Handler f6355f;

    /* renamed from: g */
    private static Handler f6356g;

    /* renamed from: h */
    private static Handler f6357h;

    /* renamed from: i */
    private static final HashMap<Object, Object[]> f6358i = new HashMap<>();

    /* renamed from: a */
    public static Handler m5596a(int i9) {
        if (i9 == 0) {
            if (f6351b == null) {
                m5597a();
            }
            return f6354e;
        }
        if (i9 == 1) {
            if (f6352c == null) {
                m5602b();
            }
            return f6355f;
        }
        if (i9 == 2) {
            if (f6356g == null) {
                f6356g = new Handler(Looper.getMainLooper());
            }
            return f6356g;
        }
        if (i9 == 3) {
            if (f6357h == null) {
                m5604c();
            }
            return f6357h;
        }
        throw new RuntimeException("unknown thread type: " + i9);
    }

    /* renamed from: b */
    public static boolean m5603b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> map = f6358i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        return objArr != null;
    }

    /* renamed from: c */
    private static synchronized void m5604c() {
        if (f6353d == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
            f6353d = handlerThread;
            handlerThread.start();
            f6357h = new Handler(f6353d.getLooper());
        }
    }

    /* renamed from: b */
    private static synchronized void m5602b() {
        if (f6352c == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
            f6352c = handlerThread;
            handlerThread.start();
            f6355f = new Handler(f6352c.getLooper());
        }
    }

    /* renamed from: a */
    public static boolean m5601a(int i9, Runnable runnable, long j9) {
        Handler handlerM5596a;
        if (runnable == null || (handlerM5596a = m5596a(i9)) == null) {
            return false;
        }
        RunnableC6742e runnableC6742e = new RunnableC6742e(10, new Object[]{runnable});
        HashMap<Object, Object[]> map = f6358i;
        synchronized (map) {
            map.put(runnable, new Object[]{runnableC6742e, Integer.valueOf(i9)});
        }
        return handlerM5596a.postDelayed(runnableC6742e, j9);
    }

    /* renamed from: a */
    public static void m5598a(int i9, Object[] objArr) {
        if (i9 != 10) {
            if (!f6350a) {
                throw new AssertionError();
            }
            return;
        }
        if (!f6350a && objArr == null) {
            throw new AssertionError();
        }
        Runnable runnable = (Runnable) objArr[0];
        HashMap<Object, Object[]> map = f6358i;
        synchronized (map) {
            try {
                if (map.get(runnable) != null) {
                    map.remove(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        runnable.run();
    }

    /* renamed from: a */
    public static boolean m5600a(int i9, Runnable runnable) {
        return m5601a(i9, runnable, 0L);
    }

    /* renamed from: a */
    public static void m5599a(Runnable runnable) {
        Object[] objArr;
        Handler handler;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> map = f6358i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int iIntValue = ((Integer) objArr[1]).intValue();
        if (iIntValue == 0) {
            handler = f6354e;
        } else if (iIntValue != 1) {
            handler = iIntValue != 2 ? null : f6356g;
        } else {
            handler = f6355f;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (map) {
            try {
                if (map.get(runnable) != null) {
                    map.remove(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m5597a() {
        if (f6351b == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
            f6351b = handlerThread;
            handlerThread.start();
            f6354e = new Handler(f6351b.getLooper());
        }
    }
}
