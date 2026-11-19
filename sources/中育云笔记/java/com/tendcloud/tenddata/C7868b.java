package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: com.tendcloud.tenddata.b */
/* loaded from: classes5.dex */
public class C7868b implements Application.ActivityLifecycleCallbacks {
    C8003g mAEPEditState;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8020y.m12122a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            C7843ab.f14274I = false;
            C7895c.m11367b(activity, AbstractC7841a.UNIVERSAL);
            C8003g c8003g = this.mAEPEditState;
            if (c8003g != null) {
                c8003g.remove(activity);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        String scheme;
        Uri data;
        C7843ab.f14276K = true;
        C7843ab.f14274I = true;
        try {
            C7895c.m11363a(activity, AbstractC7841a.UNIVERSAL);
            C8016u.m12091a().m12093b();
            Intent intent = activity.getIntent();
            if (intent != null && (scheme = intent.getScheme()) != null && scheme.startsWith(C7842aa.f14262w) && (data = intent.getData()) != null) {
                String queryParameter = data.getQueryParameter("loginToken");
                C8016u.m12091a().connectWebSocket(queryParameter);
                C7896ca.iForDeveloper("Codeless Scheme: " + scheme);
                C7896ca.iForDeveloper("Codeless Token:  " + queryParameter);
            }
            C8003g c8003g = this.mAEPEditState;
            if (c8003g != null) {
                c8003g.add(activity);
            }
            C8008l.m12042a();
            C7843ab.f14313m = true;
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public void setEditState(C8003g c8003g) {
        this.mAEPEditState = c8003g;
    }
}
