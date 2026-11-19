package p000a.p031h.p040g;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: a.h.g.n */
/* loaded from: classes.dex */
public class ThreadFactoryC0232n implements ThreadFactory {

    /* renamed from: a */
    public String f1519a;

    /* renamed from: b */
    public int f1520b;

    /* renamed from: a.h.g.n$a */
    public static class a extends Thread {

        /* renamed from: b */
        public final int f1521b;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f1521b = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(this.f1521b);
            super.run();
        }
    }

    public ThreadFactoryC0232n(String str, int i) {
        this.f1519a = str;
        this.f1520b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f1519a, this.f1520b);
    }
}
