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
import p085d6.AbstractBinderC7754a;
import p096e6.InterfaceC7852b;

/* loaded from: classes4.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10114a;

    public MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.f10114a = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(service, "service");
        System.currentTimeMillis();
        Timer timer = this.f10114a.timeOut;
        if (timer != null) {
            timer.cancel();
        }
        this.f10114a.timeOut = null;
        this.f10114a.m9855J(InterfaceC7852b.a.m12329g(service));
        this.f10114a.mo9833a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m9857a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                this.f10115a.f10114a.m9848C(it, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m9857a(serverInfo);
                return Unit.INSTANCE;
            }
        });
        Iterator it = this.f10114a.listenerList.iterator();
        while (it.hasNext()) {
            this.f10114a.m9853H((AbstractBinderC7754a) it.next());
        }
        this.f10114a.m9854I();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        try {
            MessageClient.INSTANCES.m9845x(this.f10114a).unbindService(this);
        } catch (Exception unused) {
        }
        this.f10114a.m9855J(null);
    }
}
