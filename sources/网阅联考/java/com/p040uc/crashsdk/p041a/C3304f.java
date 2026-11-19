package com.p040uc.crashsdk.p041a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.uc.crashsdk.a.f */
/* loaded from: classes2.dex */
public class C3304f {

    /* renamed from: a */
    static final /* synthetic */ boolean f1352a = true;

    /* renamed from: b */
    private static volatile HandlerThread f1353b;

    /* renamed from: c */
    private static volatile HandlerThread f1354c;

    /* renamed from: d */
    private static volatile HandlerThread f1355d;

    /* renamed from: e */
    private static Handler f1356e;

    /* renamed from: f */
    private static Handler f1357f;

    /* renamed from: g */
    private static Handler f1358g;

    /* renamed from: h */
    private static Handler f1359h;

    /* renamed from: i */
    private static final HashMap<Object, Object[]> f1360i = new HashMap<>();

    /* renamed from: a */
    public static Handler m2352a(int i4) {
        if (i4 == 0) {
            if (f1353b == null) {
                m2353a();
            }
            return f1356e;
        }
        if (i4 == 1) {
            if (f1354c == null) {
                m2358b();
            }
            return f1357f;
        }
        if (i4 == 2) {
            if (f1358g == null) {
                f1358g = new Handler(Looper.getMainLooper());
            }
            return f1358g;
        }
        if (i4 == 3) {
            if (f1359h == null) {
                m2360c();
            }
            return f1359h;
        }
        throw new RuntimeException("unknown thread type: " + i4);
    }

    /* renamed from: b */
    public static boolean m2359b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> map = f1360i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        return objArr != null;
    }

    /* renamed from: c */
    private static synchronized void m2360c() {
        if (f1355d == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
            f1355d = handlerThread;
            handlerThread.start();
            f1359h = new Handler(f1355d.getLooper());
        }
    }

    /* renamed from: b */
    private static synchronized void m2358b() {
        if (f1354c == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
            f1354c = handlerThread;
            handlerThread.start();
            f1357f = new Handler(f1354c.getLooper());
        }
    }

    /* renamed from: a */
    public static boolean m2357a(int i4, Runnable runnable, long j4) {
        Handler handlerM2352a;
        if (runnable == null || (handlerM2352a = m2352a(i4)) == null) {
            return false;
        }
        RunnableC3303e runnableC3303e = new RunnableC3303e(10, new Object[]{runnable});
        HashMap<Object, Object[]> map = f1360i;
        synchronized (map) {
            map.put(runnable, new Object[]{runnableC3303e, Integer.valueOf(i4)});
        }
        return handlerM2352a.postDelayed(runnableC3303e, j4);
    }

    /* renamed from: a */
    public static void m2354a(int i4, Object[] objArr) {
        if (i4 != 10) {
            if (!f1352a) {
                throw new AssertionError();
            }
        } else {
            if (!f1352a && objArr == null) {
                throw new AssertionError();
            }
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> map = f1360i;
            synchronized (map) {
                if (map.get(runnable) != null) {
                    map.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m2356a(int i4, Runnable runnable) {
        return m2357a(i4, runnable, 0L);
    }

    /* renamed from: a */
    public static void m2355a(Runnable runnable) {
        Object[] objArr;
        Handler handler;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> map = f1360i;
        synchronized (map) {
            objArr = map.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int iIntValue = ((Integer) objArr[1]).intValue();
        if (iIntValue == 0) {
            handler = f1356e;
        } else if (iIntValue != 1) {
            handler = iIntValue != 2 ? null : f1358g;
        } else {
            handler = f1357f;
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
    private static synchronized void m2353a() {
        if (f1353b == null) {
            HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
            f1353b = handlerThread;
            handlerThread.start();
            f1356e = new Handler(f1353b.getLooper());
        }
    }
}
