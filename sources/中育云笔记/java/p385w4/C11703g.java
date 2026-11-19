package p385w4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p401x4.C11791a;

/* renamed from: w4.g */
/* loaded from: classes5.dex */
public final class C11703g {

    /* renamed from: d */
    public static final C11703g f27810d = new C11703g();

    /* renamed from: b */
    public final ExecutorService f27812b = C11791a.m26019a();

    /* renamed from: a */
    public final Executor f27811a = new a();

    /* renamed from: c */
    public final Executor f27813c = C11791a.m26020b();

    /* renamed from: w4.g$a */
    public static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m25875a() {
        return f27810d.f27813c;
    }
}
