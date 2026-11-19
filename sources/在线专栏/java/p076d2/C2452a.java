package p076d2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: d2.a */
/* loaded from: classes.dex */
public class C2452a {

    /* renamed from: a */
    private static Object f10030a;

    /* renamed from: d2.a$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object unused = C2452a.f10030a = C2452a.m8198d();
            synchronized (C2452a.class) {
                C2452a.class.notify();
            }
        }
    }

    /* renamed from: c */
    public static Object m8197c() {
        if (f10030a == null) {
            synchronized (C2452a.class) {
                if (f10030a == null) {
                    Object objM8198d = m8198d();
                    f10030a = objM8198d;
                    if (objM8198d != null) {
                        return objM8198d;
                    }
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        f10030a = m8198d();
                    } else {
                        Handler handler = new Handler(Looper.getMainLooper());
                        synchronized (C2452a.class) {
                            handler.post(new a());
                            try {
                                C2452a.class.wait();
                            } catch (InterruptedException e4) {
                                Log.w("Applications", "Waiting notification from UI thread error.", e4);
                            }
                        }
                    }
                }
            }
        }
        return f10030a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static Object m8198d() throws NoSuchMethodException, SecurityException {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            return method.invoke(null, new Object[0]);
        } catch (Exception e4) {
            Log.w("Applications", "Failed to get ActivityThread from ActivityThread#currentActivityThread. In some case, this method return null in worker thread.", e4);
            return null;
        }
    }
}
