package p016b0;

import com.tencent.bugly.proguard.C4054ak;
import java.util.concurrent.ThreadFactory;

/* renamed from: b0.b */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3061b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f1389a;

    public /* synthetic */ ThreadFactoryC3061b(int i) {
        this.f1389a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1389a) {
            case 0:
                return new Thread(new RunnableC3059a(runnable, 0), "glide-active-resources");
            default:
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + C4054ak.f3517a.getAndIncrement());
                return thread;
        }
    }
}
