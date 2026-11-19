package com.blankj.utilcode.util;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.blankj.utilcode.util.z */
/* loaded from: classes2.dex */
public final class RunnableC3406z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2190a;

    /* renamed from: b */
    public final /* synthetic */ Activity f2191b;

    /* renamed from: c */
    public final /* synthetic */ C3381b0 f2192c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC3405y f2193d;

    public /* synthetic */ RunnableC3406z(C3381b0 c3381b0, Activity activity, C3401u c3401u, int i) {
        this.f2190a = i;
        this.f2192c = c3381b0;
        this.f2191b = activity;
        this.f2193d = c3401u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2190a) {
            case 0:
                C3401u c3401u = (C3401u) this.f2193d;
                ConcurrentHashMap concurrentHashMap = this.f2192c.f2126c;
                Activity activity = this.f2191b;
                List copyOnWriteArrayList = (List) concurrentHashMap.get(activity);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    concurrentHashMap.put(activity, copyOnWriteArrayList);
                } else if (copyOnWriteArrayList.contains(c3401u)) {
                }
                copyOnWriteArrayList.add(c3401u);
                break;
            default:
                List list = (List) this.f2192c.f2126c.get(this.f2191b);
                if (list != null && !list.isEmpty()) {
                    list.remove(this.f2193d);
                    break;
                }
                break;
        }
    }
}
