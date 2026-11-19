package com.zykj.message.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import java.util.Iterator;
import java.util.Timer;
import kotlin.jvm.internal.AbstractC9979u;
import p119db.AbstractBinderC9013a;
import p135eb.InterfaceC9115b;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {

    /* renamed from: c */
    public final /* synthetic */ MessageClient.INSTANCES f19812c;

    public MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.f19812c = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        AbstractC9979u.m20295h(className, "className");
        AbstractC9979u.m20295h(service, "service");
        System.currentTimeMillis();
        Timer timer = this.f19812c.f19782h;
        if (timer != null) {
            timer.cancel();
        }
        this.f19812c.f19782h = null;
        this.f19812c.m16563I(InterfaceC9115b.a.m17938l(service));
        this.f19812c.mo16540c(new InterfaceC9540l() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m16564a(ServerInfo it) {
                AbstractC9979u.m20295h(it, "it");
                this.f19813c.f19812c.m16557C(it, false);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16564a((ServerInfo) obj);
                return C10786q.f26013a;
            }
        });
        Iterator it = this.f19812c.f19783i.iterator();
        while (it.hasNext()) {
            this.f19812c.mo16545k((AbstractBinderC9013a) it.next());
        }
        this.f19812c.m16562H();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        AbstractC9979u.m20295h(className, "className");
        try {
            MessageClient.INSTANCES.m16553u(this.f19812c).unbindService(this);
        } catch (Exception unused) {
        }
        this.f19812c.m16563I(null);
    }
}
