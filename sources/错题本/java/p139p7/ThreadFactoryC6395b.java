package p139p7;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: p7.b */
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC6395b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f10484a;

    /* renamed from: b */
    public final /* synthetic */ boolean f10485b;

    public /* synthetic */ ThreadFactoryC6395b(String str, boolean z8) {
        this.f10484a = str;
        this.f10485b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f10484a;
        AbstractC5830k.m5330g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f10485b);
        return thread;
    }
}
