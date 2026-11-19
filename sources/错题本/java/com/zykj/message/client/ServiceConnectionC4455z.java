package com.zykj.message.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import java.util.Iterator;
import java.util.Timer;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p028c4.AbstractBinderC3223a;
import p043d4.AbstractBinderC5421c;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.message.client.z */
/* loaded from: classes3.dex */
public final class ServiceConnectionC4455z implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f5727a;

    public ServiceConnectionC4455z(MessageClient.INSTANCES instances) {
        this.f5727a = instances;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName className, IBinder service) {
        InterfaceC5422d interfaceC5422d;
        AbstractC5830k.m5331h(className, "className");
        AbstractC5830k.m5331h(service, "service");
        Log.d("MessageClient", "连接到个人中心服务" + System.currentTimeMillis());
        MessageClient.INSTANCES instances = this.f5727a;
        Timer timer = instances.timeOut;
        if (timer != null) {
            timer.cancel();
        }
        instances.timeOut = null;
        int i = AbstractBinderC5421c.f8386c;
        IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface("com.zykj.message.server.MessageServer");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5422d)) {
            C5420b c5420b = new C5420b();
            c5420b.f8385c = service;
            interfaceC5422d = c5420b;
        } else {
            interfaceC5422d = (InterfaceC5422d) iInterfaceQueryLocalInterface;
        }
        instances.setRemoteServer(interfaceC5422d);
        instances.getServerInfo(new InterfaceC6471c() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
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
                this.this$0.f5727a.m3901a(it, false);
            }
        });
        Iterator it = instances.listenerList.iterator();
        while (it.hasNext()) {
            instances.registerListener((AbstractBinderC3223a) it.next());
        }
        MessageClient.INSTANCES.access$registerResumeListener(instances);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName className) {
        MessageClient.INSTANCES instances = this.f5727a;
        AbstractC5830k.m5331h(className, "className");
        Log.d("MessageClient", "个人中心服务失去连接");
        try {
            MessageClient.INSTANCES.access$getMContext$p(instances).unbindService(this);
        } catch (Exception unused) {
        }
        instances.setRemoteServer(null);
    }
}
