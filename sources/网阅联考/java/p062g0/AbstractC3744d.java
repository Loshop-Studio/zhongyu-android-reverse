package p062g0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g0.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3744d {

    /* renamed from: a */
    public static final Executor f4384a = new a();

    /* renamed from: b */
    public static final Executor f4385b = new b();

    /* renamed from: g0.d$a */
    public class a implements Executor {

        /* renamed from: a */
        public final Handler f4386a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f4386a.post(runnable);
        }
    }

    /* renamed from: g0.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m4749a() {
        return f4385b;
    }

    /* renamed from: b */
    public static Executor m4750b() {
        return f4384a;
    }
}
