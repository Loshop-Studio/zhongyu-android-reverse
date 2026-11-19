package p109d1;

import java.util.concurrent.Executor;

/* renamed from: d1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8903d {

    /* renamed from: a */
    public static final Executor f20868a = new a();

    /* renamed from: b */
    public static final Executor f20869b = new b();

    /* renamed from: d1.d$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC8910k.m17491v(runnable);
        }
    }

    /* renamed from: d1.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m17448a() {
        return f20869b;
    }

    /* renamed from: b */
    public static Executor m17449b() {
        return f20868a;
    }
}
