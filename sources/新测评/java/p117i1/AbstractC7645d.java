package p117i1;

import java.util.concurrent.Executor;

/* renamed from: i1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7645d {

    /* renamed from: a */
    public static final Executor f12886a = new a();

    /* renamed from: b */
    public static final Executor f12887b = new b();

    /* renamed from: i1.d$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            AbstractC7652k.m12705u(runnable);
        }
    }

    /* renamed from: i1.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m12663a() {
        return f12887b;
    }

    /* renamed from: b */
    public static Executor m12664b() {
        return f12886a;
    }
}
