package com.huawei.hms.framework.common;

/* loaded from: classes5.dex */
public class RunnableEnhance implements Runnable {
    static final String TRANCELOGO = " ->";

    /* renamed from: c */
    public Runnable f11648c;

    /* renamed from: d */
    public String f11649d = Thread.currentThread().getName();

    public RunnableEnhance(Runnable runnable) {
        this.f11648c = runnable;
    }

    public String getParentName() {
        return this.f11649d;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11648c.run();
    }
}
