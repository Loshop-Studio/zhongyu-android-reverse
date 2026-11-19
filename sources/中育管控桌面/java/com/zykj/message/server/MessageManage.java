package com.zykj.message.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p108m4.InterfaceC7403b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012j\u0002\b\u000b¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/message/server/MessageManage;", "", "<init>", "(Ljava/lang/String;I)V", "Lm4/c;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "Ljava/lang/Class;", "messageService", "", "a", "(Landroid/content/Context;Ljava/lang/Class;)V", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "c", "(Lcom/zykj/message/server/bean/ServerInfo;)V", "b", "(Landroid/content/Context;)V", "messageserver_release"}, m7881k = 1, m7882mv = {1, 4, 0})
/* loaded from: classes4.dex */
public abstract class MessageManage {

    /* renamed from: a */
    public static final MessageManage f7396a;

    /* renamed from: b */
    public static final /* synthetic */ MessageManage[] f7397b;

    @Metadata(m7879d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0014\bÆ\u0001\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/message/server/MessageManage$INSTANCES;", "Lcom/zykj/message/server/MessageManage;", "Lm4/c;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "Ljava/lang/Class;", "messageService", "", "a", "(Landroid/content/Context;Ljava/lang/Class;)V", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "c", "(Lcom/zykj/message/server/bean/ServerInfo;)V", "b", "(Landroid/content/Context;)V", "Lm4/b;", "Lm4/b;", "mService", "com/zykj/message/server/MessageManage$INSTANCES$a", "d", "Lcom/zykj/message/server/MessageManage$INSTANCES$a;", "mConnection", "messageserver_release"}, m7881k = 1, m7882mv = {1, 4, 0})
    public static final class INSTANCES extends MessageManage {

        /* renamed from: c, reason: from kotlin metadata */
        public InterfaceC7403b mService;

        /* renamed from: d, reason: from kotlin metadata */
        public final ServiceConnectionC6195a mConnection;

        /* renamed from: com.zykj.message.server.MessageManage$INSTANCES$a */
        public static final class ServiceConnectionC6195a implements ServiceConnection {
            public ServiceConnectionC6195a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder service) {
                Intrinsics.checkParameterIsNotNull(componentName, "componentName");
                Intrinsics.checkParameterIsNotNull(service, "service");
                INSTANCES.this.mService = InterfaceC7403b.a.m8416p(service);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Intrinsics.checkParameterIsNotNull(componentName, "componentName");
                INSTANCES.this.mService = null;
            }
        }

        /* renamed from: com.zykj.message.server.MessageManage$INSTANCES$b */
        public static final class RunnableC6196b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ServerInfo f7402b;

            public RunnableC6196b(ServerInfo serverInfo) {
                this.f7402b = serverInfo;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7403b interfaceC7403b = INSTANCES.this.mService;
                if (interfaceC7403b != null) {
                    interfaceC7403b.mo6212d(this.f7402b);
                }
            }
        }

        public INSTANCES(String str, int i6) {
            super(str, i6, null);
            this.mConnection = new ServiceConnectionC6195a();
        }

        @Override // com.zykj.message.server.MessageManage
        /* renamed from: a */
        public void mo6206a(Context context, Class messageService) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(messageService, "messageService");
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(new Intent(context, (Class<?>) messageService));
            } else {
                context.startService(new Intent(context, (Class<?>) messageService));
            }
            Intent intent = new Intent("com.zykj.action.zykj.message.service");
            intent.setPackage(context.getPackageName());
            context.bindService(intent, this.mConnection, 1);
        }

        @Override // com.zykj.message.server.MessageManage
        /* renamed from: b */
        public void mo6207b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (this.mService != null) {
                context.unbindService(this.mConnection);
                this.mService = null;
            }
        }

        @Override // com.zykj.message.server.MessageManage
        /* renamed from: c */
        public void mo6208c(ServerInfo serverInfo) {
            Intrinsics.checkParameterIsNotNull(serverInfo, "serverInfo");
            new Thread(new RunnableC6196b(serverInfo)).start();
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f7396a = instances;
        f7397b = new MessageManage[]{instances};
    }

    public MessageManage(String str, int i6) {
    }

    public static MessageManage valueOf(String str) {
        return (MessageManage) Enum.valueOf(MessageManage.class, str);
    }

    public static MessageManage[] values() {
        return (MessageManage[]) f7397b.clone();
    }

    /* renamed from: a */
    public abstract void mo6206a(Context context, Class messageService);

    /* renamed from: b */
    public abstract void mo6207b(Context context);

    /* renamed from: c */
    public abstract void mo6208c(ServerInfo serverInfo);

    public /* synthetic */ MessageManage(String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i6);
    }
}
