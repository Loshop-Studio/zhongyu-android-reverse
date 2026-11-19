package com.zykj.message;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p016b0.RunnableC3059a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/message/KillSelfService;", "Landroid/app/Service;", "<init>", "()V", "messageclient_release"}, m5111k = 1, m5112mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KillSelfService extends Service {

    /* renamed from: a */
    public final Handler f5663a = new Handler();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC5830k.m5331h(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i8) {
        this.f5663a.postDelayed(new RunnableC3059a(this, 11), 200L);
        return super.onStartCommand(intent, i, i8);
    }
}
