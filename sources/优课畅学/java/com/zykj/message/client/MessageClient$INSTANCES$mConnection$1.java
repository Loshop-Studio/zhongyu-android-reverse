package com.zykj.message.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import java.util.Iterator;
import java.util.Timer;
import kotlin.jvm.internal.AbstractC9133u;
import p024b4.AbstractBinderC5031a;
import p035c4.InterfaceC5233b;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.INSTANCES f10451a;

    public MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.f10451a = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        AbstractC9133u.m16134h(className, "className");
        AbstractC9133u.m16134h(service, "service");
        System.currentTimeMillis();
        Timer timer = this.f10451a.f10421f;
        if (timer != null) {
            timer.cancel();
        }
        this.f10451a.f10421f = null;
        this.f10451a.m9592y(InterfaceC5233b.a.m2142k(service));
        this.f10451a.mo9569a(new InterfaceC10570l() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m9593a(ServerInfo it) {
                AbstractC9133u.m16134h(it, "it");
                this.f10452a.f10451a.m9588u(it, false);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m9593a((ServerInfo) obj);
                return C8736p.f16368a;
            }
        });
        Iterator it = this.f10451a.f10422g.iterator();
        while (it.hasNext()) {
            this.f10451a.mo9576i((AbstractBinderC5031a) it.next());
        }
        this.f10451a.m9591x();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        AbstractC9133u.m16134h(className, "className");
        try {
            MessageClient.INSTANCES.m9583p(this.f10451a).unbindService(this);
        } catch (Exception unused) {
        }
        this.f10451a.m9592y(null);
    }
}
