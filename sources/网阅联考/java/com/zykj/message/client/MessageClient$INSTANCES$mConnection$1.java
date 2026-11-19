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
import p003a2.InterfaceC0010b;
import p148z1.AbstractBinderC4706a;

/* loaded from: classes2.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f4266a;

    public MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.f4266a = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(service, "service");
        StringBuilder sb = new StringBuilder();
        sb.append("连接到个人中心服务");
        sb.append(System.currentTimeMillis());
        Timer timer = this.f4266a.timeOut;
        if (timer != null) {
            timer.cancel();
        }
        this.f4266a.timeOut = null;
        this.f4266a.m4651u(InterfaceC0010b.a.m23f(service));
        this.f4266a.mo4631a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m4652a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                this.f4267a.f4266a.m4644n(it, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m4652a(serverInfo);
                return Unit.INSTANCE;
            }
        });
        Iterator it = this.f4266a.listenerList.iterator();
        while (it.hasNext()) {
            this.f4266a.m4649s((AbstractBinderC4706a) it.next());
        }
        this.f4266a.m4650t();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        try {
            MessageClient.INSTANCES.m4639i(this.f4266a).unbindService(this);
        } catch (Exception unused) {
        }
        this.f4266a.m4651u(null);
    }
}
