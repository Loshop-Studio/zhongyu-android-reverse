package com.zykj.message.client;

import android.app.Activity;
import android.os.Process;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.zykj.message.client.b */
/* loaded from: classes3.dex */
public final class C4423b {

    /* renamed from: e */
    public static final C4423b f5678e;

    /* renamed from: a */
    public CopyOnWriteArrayList f5679a;

    /* renamed from: b */
    public boolean f5680b;

    /* renamed from: c */
    public C4432f0 f5681c;

    /* renamed from: d */
    public C4421a f5682d;

    static {
        C4423b c4423b = new C4423b();
        c4423b.f5679a = new CopyOnWriteArrayList();
        c4423b.f5680b = false;
        c4423b.f5682d = new C4421a(c4423b);
        f5678e = c4423b;
    }

    /* renamed from: a */
    public final void m3902a() {
        m3903b();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    /* renamed from: b */
    public final void m3903b() {
        Iterator it = this.f5679a.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    /* renamed from: c */
    public final Activity m3904c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5679a;
        if (copyOnWriteArrayList.size() == 0) {
            return null;
        }
        return (Activity) copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1);
    }
}
