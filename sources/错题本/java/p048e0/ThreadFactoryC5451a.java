package p048e0;

import com.tencent.bugly.proguard.C4150z0;
import java.util.concurrent.ThreadFactory;

/* renamed from: e0.a */
/* loaded from: classes2.dex */
public final class ThreadFactoryC5451a implements ThreadFactory {

    /* renamed from: a */
    public final String f8417a;

    /* renamed from: b */
    public final boolean f8418b;

    /* renamed from: c */
    public int f8419c;

    public ThreadFactoryC5451a(String str, boolean z8) {
        this.f8417a = str;
        this.f8418b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        C4150z0 c4150z0;
        c4150z0 = new C4150z0(this, runnable, "glide-" + this.f8417a + "-thread-" + this.f8419c);
        this.f8419c = this.f8419c + 1;
        return c4150z0;
    }
}
