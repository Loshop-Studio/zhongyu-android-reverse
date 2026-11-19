package p333s5;

import android.util.Log;

/* renamed from: s5.l */
/* loaded from: classes5.dex */
public class RunnableC11072l implements Runnable {

    /* renamed from: c */
    public final Runnable f26709c;

    public RunnableC11072l(Runnable runnable) {
        this.f26709c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f26709c;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
                Log.e("HmsPushThreads", "exception in task run");
            }
        }
    }
}
