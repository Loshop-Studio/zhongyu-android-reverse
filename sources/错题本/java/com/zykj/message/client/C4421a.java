package com.zykj.message.client;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.a */
/* loaded from: classes3.dex */
public final class C4421a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C4423b f5676a;

    public C4421a(C4423b c4423b) {
        this.f5676a = c4423b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f5676a.f5679a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f5676a.f5679a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        final C4432f0 c4432f0 = this.f5676a.f5681c;
        if (c4432f0 != null) {
            c4432f0.f5692a.getServerInfo(new InterfaceC6471c() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ServerInfo) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull ServerInfo it) {
                    AbstractC5830k.m5331h(it, "it");
                    c4432f0.f5692a.m3901a(it, false);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
