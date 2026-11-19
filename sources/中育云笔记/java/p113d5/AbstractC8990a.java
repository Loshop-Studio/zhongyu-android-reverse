package p113d5;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p333s5.RunnableC11072l;
import p333s5.ThreadFactoryC11062b;

/* renamed from: d5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8990a {

    /* renamed from: a */
    public static final ThreadPoolExecutor f20955a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11062b("SeqIO"), new ThreadPoolExecutor.AbortPolicy());

    /* renamed from: a */
    public static void m17533a(Runnable runnable) {
        try {
            f20955a.execute(new RunnableC11072l(runnable));
        } catch (Exception e10) {
            Log.e("HmsPushThreads", "submit seq io task failed, Exception:" + e10);
        }
    }
}
