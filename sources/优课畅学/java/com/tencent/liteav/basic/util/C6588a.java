package com.tencent.liteav.basic.util;

import java.lang.ref.WeakReference;

/* renamed from: com.tencent.liteav.basic.util.a */
/* loaded from: classes4.dex */
public class C6588a<T> {

    /* renamed from: b */
    private final a<T> f5505b;

    /* renamed from: a */
    private final ThreadLocal<T> f5504a = new ThreadLocal<>();

    /* renamed from: c */
    private WeakReference<T> f5506c = new WeakReference<>(null);

    /* renamed from: com.tencent.liteav.basic.util.a$a */
    public interface a<T> {
        /* renamed from: a */
        T mo5020a();
    }

    public C6588a(a<T> aVar) {
        this.f5505b = aVar;
    }

    /* renamed from: b */
    private T m5018b() {
        T tMo5020a;
        T t10 = this.f5506c.get();
        if (t10 != null) {
            return t10;
        }
        synchronized (this) {
            try {
                tMo5020a = this.f5506c.get();
                if (tMo5020a == null) {
                    tMo5020a = this.f5505b.mo5020a();
                    this.f5506c = new WeakReference<>(tMo5020a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tMo5020a;
    }

    /* renamed from: a */
    public T m5019a() {
        T t10 = this.f5504a.get();
        if (t10 != null) {
            return t10;
        }
        T tM5018b = m5018b();
        this.f5504a.set(tM5018b);
        return tM5018b;
    }
}
