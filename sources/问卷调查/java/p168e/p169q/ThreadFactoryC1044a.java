package p168e.p169q;

import java.util.concurrent.ThreadFactory;

/* renamed from: e.q.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC1044a implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f5574a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5575b;

    public ThreadFactoryC1044a(String str, boolean z) {
        this.f5574a = str;
        this.f5575b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5574a);
        thread.setDaemon(this.f5575b);
        return thread;
    }
}
