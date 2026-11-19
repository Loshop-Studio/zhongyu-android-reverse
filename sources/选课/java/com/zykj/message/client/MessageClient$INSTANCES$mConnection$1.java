package com.zykj.message.client;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.zykj.message.client.MessageClient;
import com.zykj.message.listener.BaseMessageCallBack;
import com.zykj.message.server.MessageServer;
import com.zykj.message.server.bean.ServerInfo;
import java.util.Iterator;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageClient.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, m18d2 = {"com/zykj/message/client/MessageClient$INSTANCES$mConnection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", BuildConfig.FLAVOR, "className", "Landroid/content/ComponentName;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/IBinder;", "onServiceDisconnected", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MessageClient$INSTANCES$mConnection$1 implements ServiceConnection {
    final /* synthetic */ MessageClient.INSTANCES this$0;

    MessageClient$INSTANCES$mConnection$1(MessageClient.INSTANCES instances) {
        this.this$0 = instances;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName className, IBinder service) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Intrinsics.checkParameterIsNotNull(service, "service");
        Log.d("MessageClient", "连接到个人中心服务" + System.currentTimeMillis());
        Timer timer = this.this$0.timeOut;
        if (timer != null) {
            timer.cancel();
        }
        this.this$0.timeOut = (Timer) null;
        this.this$0.setRemoteServer(MessageServer.Stub.asInterface(service));
        this.this$0.getServerInfo(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mConnection$1$onServiceConnected$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                invoke2(serverInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                this.this$0.this$0.checkStatus(it, false);
            }
        });
        Iterator it = this.this$0.listenerList.iterator();
        while (it.hasNext()) {
            this.this$0.registerListener((BaseMessageCallBack) it.next());
        }
        this.this$0.registerResumeListener();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName className) {
        Intrinsics.checkParameterIsNotNull(className, "className");
        Log.d("MessageClient", "个人中心服务失去连接");
        try {
            MessageClient.INSTANCES.access$getMContext$p(this.this$0).unbindService(this);
        } catch (Exception unused) {
        }
        this.this$0.setRemoteServer((MessageServer) null);
    }
}
