package com.alibaba.sdk.android.emas;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.emas.g */
/* loaded from: classes3.dex */
class C5598g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    private List<a> f4058c;

    /* renamed from: d */
    private int f4059d = 0;

    /* renamed from: a */
    private boolean f4057a = false;

    /* renamed from: com.alibaba.sdk.android.emas.g$a */
    public interface a {
        /* renamed from: b */
        void mo3484b();

        /* renamed from: c */
        void mo3485c();
    }

    /* renamed from: a */
    public void m3510a(a aVar) {
        if (this.f4058c == null) {
            this.f4058c = new ArrayList();
        }
        this.f4058c.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f4059d++;
        if (this.f4057a) {
            return;
        }
        this.f4057a = true;
        List<a> list = this.f4058c;
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo3484b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.f4059d - 1;
        this.f4059d = i10;
        if (i10 == 0) {
            this.f4057a = false;
            List<a> list = this.f4058c;
            if (list != null) {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo3485c();
                }
            }
        }
    }
}
