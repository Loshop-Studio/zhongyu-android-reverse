package com.zykj.message.client;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3380c;
import com.zykj.message.UnInstallActivity;
import com.zykj.message.UnLoginActivity;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003a2.InterfaceC0010b;
import p144y1.AbstractC4686b;
import p144y1.C4685a;
import p148z1.AbstractBinderC4706a;
import p148z1.AbstractBinderC4707b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u001c\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u001e\u0010\u000b\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\b\u0010\r\u001a\u00020\fH&j\u0002\b\n¨\u0006\u0010"}, m5175d2 = {"Lcom/zykj/message/client/MessageClient;", "", "Landroid/app/Application;", C3380c.f1965R, "", "d", "e", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/ServerInfo;", "callBack", C3335ai.f1705at, C3335ai.f1663aD, "", "b", "<init>", "(Ljava/lang/String;I)V", "messageclient_release"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class MessageClient {

    /* renamed from: a */
    public static final MessageClient f4242a;

    /* renamed from: b */
    public static final /* synthetic */ MessageClient[] f4243b;

    @Metadata(m5174d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001-\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u001e\u0010\u0011\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020*0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m5175d2 = {"Lcom/zykj/message/client/MessageClient$INSTANCES;", "Lcom/zykj/message/client/MessageClient;", "", C3335ai.f1665aF, "r", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "hidden", "n", "Landroid/app/Application;", C3380c.f1965R, "d", "e", "Lkotlin/Function1;", "callBack", C3335ai.f1705at, C3335ai.f1663aD, "Landroid/content/Context;", C3335ai.f1707av, "q", "Lz1/a;", "messageCallBack", C3335ai.f1711az, "b", "La2/b;", "La2/b;", "o", "()La2/b;", C3335ai.f1664aE, "(La2/b;)V", "remoteServer", "Landroid/app/Application;", "mContext", "Ljava/util/Timer;", "f", "Ljava/util/Timer;", "timeOut", "", "g", "Ljava/util/List;", "listenerList", "Lkotlin/Function0;", "h", "doTask", "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1", C3335ai.f1660aA, "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;", "mConnection", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "mHandler", "messageclient_release"}, m5176k = 1, m5177mv = {1, 4, 0})
    public static final class INSTANCES extends MessageClient {

        /* renamed from: d, reason: from kotlin metadata */
        public InterfaceC0010b remoteServer;

        /* renamed from: e, reason: from kotlin metadata */
        public Application mContext;

        /* renamed from: f, reason: from kotlin metadata */
        public Timer timeOut;

        /* renamed from: g, reason: from kotlin metadata */
        public List listenerList;

        /* renamed from: h, reason: from kotlin metadata */
        public final List doTask;

        /* renamed from: i, reason: from kotlin metadata */
        public final MessageClient$INSTANCES$mConnection$1 mConnection;

        /* renamed from: j, reason: from kotlin metadata */
        public final Handler mHandler;

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a */
        public static final class RunnableC3677a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f4253b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ ServerInfo f4255b;

                public a(ServerInfo serverInfo) {
                    this.f4255b = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1 function1 = RunnableC3677a.this.f4253b;
                    ServerInfo serverInfo = this.f4255b;
                    if (serverInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    function1.invoke(serverInfo);
                }
            }

            public RunnableC3677a(Function1 function1) {
                this.f4253b = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0010b remoteServer = INSTANCES.this.getRemoteServer();
                INSTANCES.this.mHandler.post(new a(remoteServer != null ? remoteServer.mo21c() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b */
        public static final class C3678b implements Handler.Callback {
            public C3678b() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                INSTANCES instances = INSTANCES.this;
                instances.m4647q(INSTANCES.m4639i(instances), false);
                return true;
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$c */
        public static final class C3679c extends TimerTask {
            public C3679c() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("重启服务 1S后的超时任务启动");
                sb.append(System.currentTimeMillis());
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (INSTANCES.m4639i(INSTANCES.this).bindService(intent, INSTANCES.this.mConnection, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                INSTANCES.this.mHandler.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$d */
        public static final class BinderC3680d extends AbstractBinderC4707b {

            /* renamed from: b */
            public final /* synthetic */ Function1 f4258b;

            public BinderC3680d(Function1 function1) {
                this.f4258b = function1;
            }

            @Override // p003a2.InterfaceC0009a
            /* renamed from: e */
            public void mo19e(ServerInfo serverInfo) {
                this.f4258b.invoke(serverInfo);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$e */
        public static final class RunnableC3681e implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractBinderC4706a f4260b;

            public RunnableC3681e(AbstractBinderC4706a abstractBinderC4706a) {
                this.f4260b = abstractBinderC4706a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0010b remoteServer = INSTANCES.this.getRemoteServer();
                if (remoteServer != null) {
                    remoteServer.mo22d(this.f4260b);
                }
            }
        }

        public INSTANCES(String str, int i4) {
            super(str, i4, null);
            this.listenerList = new ArrayList();
            this.doTask = new ArrayList();
            this.mConnection = new MessageClient$INSTANCES$mConnection$1(this);
            this.mHandler = new Handler(new C3678b());
        }

        /* renamed from: i */
        public static final /* synthetic */ Application m4639i(INSTANCES instances) {
            Application application = instances.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            return application;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: a */
        public void mo4631a(Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC0010b interfaceC0010b = this.remoteServer;
            if (interfaceC0010b != null) {
                if (interfaceC0010b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC0010b.asBinder().pingBinder()) {
                    new Thread(new RunnableC3677a(callBack)).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo4634d(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: b */
        public boolean mo4632b() throws PackageManager.NameNotFoundException {
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            try {
                application.getPackageManager().getPackageInfo("com.zykj.manage", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000c, B:7:0x000f, B:9:0x0019, B:11:0x001d, B:12:0x0020, B:13:0x0029, B:15:0x002d, B:16:0x0032, B:19:0x003b, B:21:0x0045, B:27:0x0052, B:28:0x0055, B:30:0x0059, B:31:0x005d), top: B:39:0x0001 }] */
        @Override // com.zykj.message.client.MessageClient
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo4633c(kotlin.jvm.functions.Function1 r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)     // Catch: java.lang.Throwable -> L64
                a2.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L29
                if (r0 != 0) goto Lf
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L64
            Lf:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L64
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L29
                a2.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L64
                if (r0 != 0) goto L20
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L64
            L20:
                com.zykj.message.client.MessageClient$INSTANCES$d r1 = new com.zykj.message.client.MessageClient$INSTANCES$d     // Catch: java.lang.Throwable -> L64
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L64
                r0.mo20a(r1)     // Catch: java.lang.Throwable -> L64
                goto L62
            L29:
                android.app.Application r0 = r3.mContext     // Catch: java.lang.Throwable -> L64
                if (r0 != 0) goto L32
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L64
            L32:
                r3.mo4634d(r0)     // Catch: java.lang.Throwable -> L64
                r0 = 0
            L36:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L62
                r1 = 100
                java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L64
                a2.b r1 = r3.remoteServer     // Catch: java.lang.Throwable -> L64
                r2 = 0
                if (r1 == 0) goto L4a
                com.zykj.message.server.bean.ServerInfo r1 = r1.mo21c()     // Catch: java.lang.Throwable -> L64
                goto L4b
            L4a:
                r1 = r2
            L4b:
                if (r1 != 0) goto L55
                r1 = 40
                if (r0 <= r1) goto L52
                goto L55
            L52:
                int r0 = r0 + 1
                goto L36
            L55:
                a2.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L5d
                com.zykj.message.server.bean.ServerInfo r2 = r0.mo21c()     // Catch: java.lang.Throwable -> L64
            L5d:
                r4.invoke(r2)     // Catch: java.lang.Throwable -> L64
                monitor-exit(r3)
                return
            L62:
                monitor-exit(r3)
                return
            L64:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.mo4633c(kotlin.jvm.functions.Function1):void"); // DEX body: android/网阅联考/smali_classes2/com/zykj/message/client/MessageClient$INSTANCES.smali:459
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: d */
        public void mo4634d(Application context) {
            IBinder iBinderAsBinder;
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            C4685a c4685aM6621i = C4685a.m6621i();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c4685aM6621i.m6625f(application);
            if (!mo4632b()) {
                Application application2 = this.mContext;
                if (application2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m4646p(application2, false);
                return;
            }
            InterfaceC0010b interfaceC0010b = this.remoteServer;
            if (interfaceC0010b != null) {
                if (interfaceC0010b != null && (iBinderAsBinder = interfaceC0010b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application3 = this.mContext;
                        if (application3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        }
                        application3.unbindService(this.mConnection);
                    } catch (Exception unused) {
                    }
                }
                this.remoteServer = null;
            }
            if (this.remoteServer == null) {
                try {
                    Application application4 = this.mContext;
                    if (application4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    }
                    application4.unbindService(this.mConnection);
                } catch (Exception unused2) {
                }
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                StringBuilder sb = new StringBuilder();
                sb.append("开始连接服务->");
                sb.append(System.currentTimeMillis());
                Application application5 = this.mContext;
                if (application5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                if (application5.bindService(intent, this.mConnection, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("绑定个人中心服务成功 result= true : ");
                    sb2.append(System.currentTimeMillis());
                } else {
                    Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                    m4648r();
                }
            }
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: e */
        public void mo4635e() {
            IBinder iBinderAsBinder;
            InterfaceC0010b interfaceC0010b = this.remoteServer;
            if (interfaceC0010b != null && interfaceC0010b != null && (iBinderAsBinder = interfaceC0010b.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                application.unbindService(this.mConnection);
            }
            C4685a c4685aM6621i = C4685a.m6621i();
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c4685aM6621i.m6627h(application2);
        }

        /* renamed from: n */
        public final void m4644n(ServerInfo serverInfo, boolean hidden) {
            Status statusM4655d;
            if (serverInfo == null || (statusM4655d = serverInfo.m4655d()) == null) {
                statusM4655d = Status.LOGOUT;
            }
            int i4 = AbstractC4686b.f6006a[statusM4655d.ordinal()];
            if (i4 == 1) {
                Iterator it = this.doTask.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.doTask.clear();
                return;
            }
            if (i4 == 2) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m4647q(application, hidden);
                return;
            }
            if (i4 != 3) {
                return;
            }
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            m4647q(application2, hidden);
        }

        /* renamed from: o, reason: from getter */
        public final InterfaceC0010b getRemoteServer() {
            return this.remoteServer;
        }

        /* renamed from: p */
        public void m4646p(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C4685a c4685aM6621i = C4685a.m6621i();
            Intrinsics.checkExpressionValueIsNotNull(c4685aM6621i, "ActivityCollectionHelper.with()");
            if (c4685aM6621i.m6624e() != null) {
                C4685a c4685aM6621i2 = C4685a.m6621i();
                Intrinsics.checkExpressionValueIsNotNull(c4685aM6621i2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c4685aM6621i2.m6624e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C4685a.m6621i().m6623d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }

        /* renamed from: q */
        public void m4647q(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C4685a c4685aM6621i = C4685a.m6621i();
            Intrinsics.checkExpressionValueIsNotNull(c4685aM6621i, "ActivityCollectionHelper.with()");
            if (c4685aM6621i.m6624e() != null) {
                C4685a c4685aM6621i2 = C4685a.m6621i();
                Intrinsics.checkExpressionValueIsNotNull(c4685aM6621i2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c4685aM6621i2.m6624e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C4685a.m6621i().m6623d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }

        /* renamed from: r */
        public final void m4648r() {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.message.service.awaken");
            intent.setFlags(268435456);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            application.startActivity(intent);
            Timer timer = new Timer();
            this.timeOut = timer;
            timer.schedule(new C3679c(), 1000L);
        }

        /* renamed from: s */
        public void m4649s(AbstractBinderC4706a messageCallBack) {
            Intrinsics.checkParameterIsNotNull(messageCallBack, "messageCallBack");
            InterfaceC0010b interfaceC0010b = this.remoteServer;
            if (interfaceC0010b != null) {
                if (interfaceC0010b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC0010b.asBinder().pingBinder()) {
                    new Thread(new RunnableC3681e(messageCallBack)).start();
                    return;
                }
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo4634d(application);
        }

        /* renamed from: t */
        public final void m4650t() {
            C4685a.m6621i().m6626g(new C4685a.b() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // p144y1.C4685a.b
                public final void onResume() {
                    this.f4268a.mo4631a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
                        {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m4653a(ServerInfo it) {
                            Intrinsics.checkParameterIsNotNull(it, "it");
                            MessageClient$INSTANCES$registerResumeListener$1.this.f4268a.m4644n(it, false);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                            m4653a(serverInfo);
                            return Unit.INSTANCE;
                        }
                    });
                }
            });
        }

        /* renamed from: u */
        public final void m4651u(InterfaceC0010b interfaceC0010b) {
            this.remoteServer = interfaceC0010b;
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f4242a = instances;
        f4243b = new MessageClient[]{instances};
        INSTANCE = new Companion(null);
    }

    public MessageClient(String str, int i4) {
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f4243b.clone();
    }

    /* renamed from: a */
    public abstract void mo4631a(Function1 callBack);

    /* renamed from: b */
    public abstract boolean mo4632b();

    /* renamed from: c */
    public abstract void mo4633c(Function1 callBack);

    /* renamed from: d */
    public abstract void mo4634d(Application context);

    /* renamed from: e */
    public abstract void mo4635e();

    public /* synthetic */ MessageClient(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i4);
    }
}
