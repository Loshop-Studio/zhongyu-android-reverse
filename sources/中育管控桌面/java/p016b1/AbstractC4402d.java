package p016b1;

import java.util.concurrent.Executor;

/* renamed from: b1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4402d {

    /* renamed from: a */
    public static final Executor f1253a = new a();

    /* renamed from: b */
    public static final Executor f1254b = new b();

    /* renamed from: b1.d$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC4409k.m1460u(runnable);
        }
    }

    /* renamed from: b1.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m1418a() {
        return f1254b;
    }

    /* renamed from: b */
    public static Executor m1419b() {
        return f1253a;
    }
}
