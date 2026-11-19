package p091e1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: e1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7832d {

    /* renamed from: a */
    public static final Executor f13149a = new a();

    /* renamed from: b */
    public static final Executor f13150b = new b();

    /* renamed from: e1.d$a */
    public class a implements Executor {

        /* renamed from: a */
        public final Handler f13151a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13151a.post(runnable);
        }
    }

    /* renamed from: e1.d$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m12237a() {
        return f13150b;
    }

    /* renamed from: b */
    public static Executor m12238b() {
        return f13149a;
    }
}
