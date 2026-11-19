package com.p068uc.crashsdk.p069a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.uc.crashsdk.a.f */
/* loaded from: classes.dex */
public class C1820f {

    /* renamed from: a */
    static final /* synthetic */ boolean f7944a = true;

    /* renamed from: b */
    private static volatile HandlerThread f7945b;

    /* renamed from: c */
    private static volatile HandlerThread f7946c;

    /* renamed from: d */
    private static volatile HandlerThread f7947d;

    /* renamed from: e */
    private static Handler f7948e;

    /* renamed from: f */
    private static Handler f7949f;

    /* renamed from: g */
    private static Handler f7950g;

    /* renamed from: h */
    private static Handler f7951h;

    /* renamed from: i */
    private static final HashMap<Object, Object[]> f7952i = new HashMap<>();

    /* renamed from: a */
    public static Handler m6275a(int i4) {
        if (i4 == 0) {
            if (f7945b == null) {
                m6276a();
            }
            return f7948e;
        }
        if (i4 == 1) {
            if (f7946c == null) {
                m6281b();
            }
            return f7949f;
        }
        if (i4 == 2) {
            if (f7950g == null) {
                f7950g = new Handler(Looper.getMainLooper());
            }
            return f7950g;
        }
        if (i4 == 3) {
            if (f7951h == null) {
                m6283c();
            }
            return f7951h;
        }
        throw new RuntimeException("unknown thread type: " + i4);
    }

    /* renamed from: b */
    public static boolean m6282b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> map = f7952i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        return objArr != null;
    }

    /* renamed from: c */
    private static synchronized void m6283c() {
        if (f7947d == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
            f7947d = handlerThread;
            handlerThread.start();
            f7951h = new Handler(f7947d.getLooper());
        }
    }

    /* renamed from: b */
    private static synchronized void m6281b() {
        if (f7946c == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
            f7946c = handlerThread;
            handlerThread.start();
            f7949f = new Handler(f7946c.getLooper());
        }
    }

    /* renamed from: a */
    public static boolean m6280a(int i4, Runnable runnable, long j4) {
        Handler handlerM6275a;
        if (runnable == null || (handlerM6275a = m6275a(i4)) == null) {
            return false;
        }
        RunnableC1819e runnableC1819e = new RunnableC1819e(10, new Object[]{runnable});
        HashMap<Object, Object[]> map = f7952i;
        synchronized (map) {
            map.put(runnable, new Object[]{runnableC1819e, Integer.valueOf(i4)});
        }
        return handlerM6275a.postDelayed(runnableC1819e, j4);
    }

    /* renamed from: a */
    public static void m6277a(int i4, Object[] objArr) {
        if (i4 != 10) {
            if (!f7944a) {
                throw new AssertionError();
            }
        } else {
            if (!f7944a && objArr == null) {
                throw new AssertionError();
            }
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> map = f7952i;
            synchronized (map) {
                if (map.get(runnable) != null) {
                    map.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m6279a(int i4, Runnable runnable) {
        return m6280a(i4, runnable, 0L);
    }

    /* renamed from: a */
    public static void m6278a(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> map = f7952i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int iIntValue = ((Integer) objArr[1]).intValue();
        Handler handler = null;
        if (iIntValue == 0) {
            handler = f7948e;
        } else if (iIntValue == 1) {
            handler = f7949f;
        } else if (iIntValue == 2) {
            handler = f7950g;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (map) {
            if (map.get(runnable) != null) {
                map.remove(runnable);
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m6276a() {
        if (f7945b == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
            f7945b = handlerThread;
            handlerThread.start();
            f7948e = new Handler(f7945b.getLooper());
        }
    }
}
