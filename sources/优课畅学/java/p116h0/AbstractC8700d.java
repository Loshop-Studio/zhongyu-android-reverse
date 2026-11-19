package p116h0;

import java.util.concurrent.Executor;

/* renamed from: h0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8700d {

    /* renamed from: a */
    public static final Executor f16310a = new a();

    /* renamed from: b */
    public static final Executor f16311b = new b();

    /* renamed from: h0.d$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC8707k.m14204v(runnable);
        }
    }

    /* renamed from: h0.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m14161a() {
        return f16311b;
    }

    /* renamed from: b */
    public static Executor m14162b() {
        return f16310a;
    }
}
