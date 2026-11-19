package com.zykj;

import android.app.Application;
import com.zykj.message.client.BuildConfig;
import com.zykj.message.client.MessageClient;
import kotlin.Metadata;

/* compiled from: MyApplication.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m18d2 = {"Lcom/zykj/MyApplication;", "Landroid/app/Application;", "()V", "onCreate", BuildConfig.FLAVOR, "onTerminate", "app_release"}, m19k = 1, m20mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class MyApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        MessageClient.INSTANCES.startService(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        MessageClient.INSTANCES.stopService();
    }
}
