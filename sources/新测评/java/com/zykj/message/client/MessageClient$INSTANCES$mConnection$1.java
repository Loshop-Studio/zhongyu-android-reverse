package com.zykj.message.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import java.util.Iterator;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p169m7.AbstractBinderC8566a;
import p180n7.InterfaceC8669b;

/* loaded from: classes.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10668a;

    public MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.f10668a = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(service, "service");
        System.currentTimeMillis();
        Timer timer = this.f10668a.timeOut;
        if (timer != null) {
            timer.cancel();
        }
        this.f10668a.timeOut = null;
        this.f10668a.m10589J(InterfaceC8669b.a.m14274h(service));
        this.f10668a.mo10565f(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m10591a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                this.f10669a.f10668a.m10582C(it, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m10591a(serverInfo);
                return Unit.INSTANCE;
            }
        });
        Iterator it = this.f10668a.listenerList.iterator();
        while (it.hasNext()) {
            this.f10668a.m10587H((AbstractBinderC8566a) it.next());
        }
        this.f10668a.m10588I();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        try {
            MessageClient.INSTANCES.m10579x(this.f10668a).unbindService(this);
        } catch (Exception unused) {
        }
        this.f10668a.m10589J(null);
    }
}
