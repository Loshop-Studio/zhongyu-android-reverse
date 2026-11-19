package com.zykj.mistake.application;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.multidex.MultiDex;
import com.tencent.bugly.crashreport.CrashReport;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.network.C5088a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p009a8.RunnableC0023a;
import p073h4.BinderC5627c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/application/MistakeApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MistakeApplication extends Application {

    /* renamed from: b */
    public static final /* synthetic */ int f5988b = 0;

    /* renamed from: a */
    public final BinderC5627c f5989a = new BinderC5627c(this, 0);

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this, "b81c44048c", false);
        C5088a c5088a = C5088a.f7986a;
        String string = getSharedPreferences("zykjMistake", 0).getString("SP_API_URL", "");
        AbstractC5830k.m5329f(string, "getString(...)");
        C5088a.f7987b = string;
        String string2 = getSharedPreferences("zykjMistake", 0).getString("SP_API_TOKEN", "");
        AbstractC5830k.m5329f(string2, "getString(...)");
        C5088a.f7988c = string2;
        MessageClient messageClient = MessageClient.INSTANCES;
        messageClient.startService(this);
        messageClient.registerListener(this.f5989a);
        new Thread(new RunnableC0023a(this, 22)).start();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        MessageClient messageClient = MessageClient.INSTANCES;
        messageClient.unRegisterListener(this.f5989a);
        messageClient.stopService();
    }
}
