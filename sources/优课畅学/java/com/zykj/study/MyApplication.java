package com.zykj.study;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.multidex.MultiDex;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.smtt.sdk.QbSdk;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.study.bean.ClientCodeLiveData;
import com.zykj.study.utils.AppContext;
import com.zykj.utils.AppUtils;
import javax.inject.Inject;
import kotlin.jvm.internal.AbstractC9133u;
import me.weishu.reflection.Reflection;
import p005a4.C0024a;
import p024b4.AbstractBinderC5032b;
import p086e5.C8359h;
import p150k1.AbstractC9051b;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public class MyApplication extends Hilt_MyApplication {
    public static final int $stable = 8;

    @Inject
    public ClientCodeLiveData clientCodeLiveData;
    private final BinderC7597a messageServerListener = new BinderC7597a();

    /* renamed from: com.zykj.study.MyApplication$a */
    public static final class BinderC7597a extends AbstractBinderC5032b {
        @Override // p035c4.InterfaceC5232a
        /* renamed from: h */
        public void mo2136h(ServerInfo serverInfo) {
            if ((serverInfo != null ? serverInfo.m9596b() : null) != Status.LOGIN) {
                C0024a.m54i().m55c();
            }
        }
    }

    private final void initX5() throws Throwable {
        QbSdk.initX5Environment(this, null);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(context);
        Reflection.m17224b(context);
    }

    public final ClientCodeLiveData getClientCodeLiveData() {
        ClientCodeLiveData clientCodeLiveData = this.clientCodeLiveData;
        if (clientCodeLiveData != null) {
            return clientCodeLiveData;
        }
        AbstractC9133u.m16151y("clientCodeLiveData");
        return null;
    }

    @Override // com.zykj.study.Hilt_MyApplication, android.app.Application
    public void onCreate() throws Throwable {
        super.onCreate();
        CrashReport.initCrashReport(this, "fbf15e0de7", false);
        AbstractC9051b.m15852g(this);
        getClientCodeLiveData().setValue(C8359h.f15883a.m13628b("", ""));
        AppContext.f13703a.mo11861c(this);
        AppUtils.INSTANCE.mo12324b(this);
        new Thread(new Runnable() { // from class: m4.b
            @Override // java.lang.Runnable
            public final void run() {
                QbSdk.preinstallStaticTbs(this.f18326a);
            }
        }).start();
        MessageClient messageClient = MessageClient.f10416a;
        messageClient.mo9573e(this);
        if (messageClient.mo9574g()) {
            messageClient.mo9576i(this.messageServerListener);
        }
        initX5();
    }

    @Override // android.app.Application
    public void onTerminate() {
        MessageClient messageClient = MessageClient.f10416a;
        if (messageClient.mo9574g()) {
            messageClient.mo9579l(this.messageServerListener);
        }
        messageClient.mo9578k();
        super.onTerminate();
    }

    public final void setClientCodeLiveData(ClientCodeLiveData clientCodeLiveData) {
        AbstractC9133u.m16133g(clientCodeLiveData, "<set-?>");
        this.clientCodeLiveData = clientCodeLiveData;
    }
}
