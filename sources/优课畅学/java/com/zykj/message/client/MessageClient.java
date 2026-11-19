package com.zykj.message.client;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.zykj.message.UnInstallActivity;
import com.zykj.message.UnLoginActivity;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p005a4.AbstractC0025b;
import p005a4.C0024a;
import p024b4.AbstractBinderC5031a;
import p024b4.AbstractBinderC5032b;
import p035c4.InterfaceC5233b;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class MessageClient {

    /* renamed from: a */
    public static final MessageClient f10416a;

    /* renamed from: b */
    public static final /* synthetic */ MessageClient[] f10417b;

    /* renamed from: c */
    public static final C7411a f10418c;

    public static final class INSTANCES extends MessageClient {

        /* renamed from: d */
        public InterfaceC5233b f10419d;

        /* renamed from: e */
        public Application f10420e;

        /* renamed from: f */
        public Timer f10421f;

        /* renamed from: g */
        public List f10422g;

        /* renamed from: h */
        public final List f10423h;

        /* renamed from: i */
        public final MessageClient$INSTANCES$mConnection$1 f10424i;

        /* renamed from: j */
        public final Handler f10425j;

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a */
        public static final class RunnableC7401a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10570l f10427b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ ServerInfo f10429b;

                public a(ServerInfo serverInfo) {
                    this.f10429b = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC10570l interfaceC10570l = RunnableC7401a.this.f10427b;
                    ServerInfo serverInfo = this.f10429b;
                    if (serverInfo == null) {
                        AbstractC9133u.m16145s();
                    }
                    interfaceC10570l.invoke(serverInfo);
                }
            }

            public RunnableC7401a(InterfaceC10570l interfaceC10570l) {
                this.f10427b = interfaceC10570l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC5233b interfaceC5233bM9589v = INSTANCES.this.m9589v();
                INSTANCES.this.f10425j.post(new a(interfaceC5233bM9589v != null ? interfaceC5233bM9589v.mo2141j() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b */
        public static final class RunnableC7402b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10570l f10431b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ UserInfo f10433b;

                public a(UserInfo userInfo) {
                    this.f10433b = userInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC10570l interfaceC10570l = RunnableC7402b.this.f10431b;
                    UserInfo userInfo = this.f10433b;
                    if (userInfo == null) {
                        AbstractC9133u.m16145s();
                    }
                    interfaceC10570l.invoke(userInfo);
                }
            }

            public RunnableC7402b(InterfaceC10570l interfaceC10570l) {
                this.f10431b = interfaceC10570l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC5233b interfaceC5233bM9589v = INSTANCES.this.m9589v();
                INSTANCES.this.f10425j.post(new a(interfaceC5233bM9589v != null ? interfaceC5233bM9589v.mo2138d() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$c */
        public static final class C7403c implements Handler.Callback {
            public C7403c() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                INSTANCES instances = INSTANCES.this;
                instances.mo9572d(INSTANCES.m9583p(instances), false);
                return true;
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$d */
        public static final class C7404d extends TimerTask {
            public C7404d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (INSTANCES.m9583p(INSTANCES.this).bindService(intent, INSTANCES.this.f10424i, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                INSTANCES.this.f10425j.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$e */
        public static final class BinderC7405e extends AbstractBinderC5032b {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC10570l f10436b;

            public BinderC7405e(InterfaceC10570l interfaceC10570l) {
                this.f10436b = interfaceC10570l;
            }

            @Override // p035c4.InterfaceC5232a
            /* renamed from: h */
            public void mo2136h(ServerInfo serverInfo) {
                this.f10436b.invoke(serverInfo);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$f */
        public static final class RunnableC7406f implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractBinderC5031a f10438b;

            public RunnableC7406f(AbstractBinderC5031a abstractBinderC5031a) {
                this.f10438b = abstractBinderC5031a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC5233b interfaceC5233bM9589v = INSTANCES.this.m9589v();
                if (interfaceC5233bM9589v != null) {
                    interfaceC5233bM9589v.mo2137a(this.f10438b);
                }
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$g */
        public static final class RunnableC7407g implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractBinderC5031a f10440b;

            public RunnableC7407g(AbstractBinderC5031a abstractBinderC5031a) {
                this.f10440b = abstractBinderC5031a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC5233b interfaceC5233bM9589v = INSTANCES.this.m9589v();
                if (interfaceC5233bM9589v != null) {
                    interfaceC5233bM9589v.mo2140i(this.f10440b);
                }
            }
        }

        public INSTANCES(String str, int i10) {
            super(str, i10, null);
            this.f10422g = new ArrayList();
            this.f10423h = new ArrayList();
            this.f10424i = new MessageClient$INSTANCES$mConnection$1(this);
            this.f10425j = new Handler(new C7403c());
        }

        /* renamed from: p */
        public static final /* synthetic */ Application m9583p(INSTANCES instances) {
            Application application = instances.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            return application;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: a */
        public void mo9569a(InterfaceC10570l callBack) {
            AbstractC9133u.m16134h(callBack, "callBack");
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null) {
                if (interfaceC5233b == null) {
                    AbstractC9133u.m16145s();
                }
                if (interfaceC5233b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7401a(callBack)).start();
                    return;
                }
            }
            this.f10423h.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            mo9577j(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: b */
        public void mo9570b(InterfaceC10570l callBack) {
            AbstractC9133u.m16134h(callBack, "callBack");
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null) {
                if (interfaceC5233b == null) {
                    AbstractC9133u.m16145s();
                }
                if (interfaceC5233b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7402b(callBack)).start();
                    return;
                }
            }
            this.f10423h.add(new MessageClient$INSTANCES$getUserInfo$4(this, callBack));
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            mo9577j(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: c */
        public void mo9571c(Context context, boolean z10) {
            AbstractC9133u.m16134h(context, "context");
            C0024a c0024aM54i = C0024a.m54i();
            AbstractC9133u.m16129c(c0024aM54i, "ActivityCollectionHelper.with()");
            if (c0024aM54i.m57e() != null) {
                C0024a c0024aM54i2 = C0024a.m54i();
                AbstractC9133u.m16129c(c0024aM54i2, "ActivityCollectionHelper.with()");
                if (AbstractC9133u.m16128b(c0024aM54i2.m57e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C0024a.m54i().m56d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", z10);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: d */
        public void mo9572d(Context context, boolean z10) {
            AbstractC9133u.m16134h(context, "context");
            C0024a c0024aM54i = C0024a.m54i();
            AbstractC9133u.m16129c(c0024aM54i, "ActivityCollectionHelper.with()");
            if (c0024aM54i.m57e() != null) {
                C0024a c0024aM54i2 = C0024a.m54i();
                AbstractC9133u.m16129c(c0024aM54i2, "ActivityCollectionHelper.with()");
                if (AbstractC9133u.m16128b(c0024aM54i2.m57e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C0024a.m54i().m56d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", z10);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: e */
        public void mo9573e(Application context) {
            AbstractC9133u.m16134h(context, "context");
            this.f10420e = context;
            C0024a c0024aM54i = C0024a.m54i();
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            c0024aM54i.m58f(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: g */
        public boolean mo9574g() throws PackageManager.NameNotFoundException {
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            try {
                application.getPackageManager().getPackageInfo("com.zykj.manage", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0001, B:6:0x000c, B:9:0x0012, B:11:0x001c, B:13:0x0020, B:14:0x0023, B:15:0x002c, B:17:0x0030, B:18:0x0035, B:21:0x003e, B:23:0x0048, B:29:0x0055, B:30:0x0058, B:32:0x005c, B:33:0x0060), top: B:40:0x0001 }] */
        @Override // com.zykj.message.client.MessageClient
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo9575h(p300x7.InterfaceC10570l r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.AbstractC9133u.m16134h(r4, r0)     // Catch: java.lang.Throwable -> L10
                c4.b r0 = r3.f10419d     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                if (r0 != 0) goto L12
                kotlin.jvm.internal.AbstractC9133u.m16145s()     // Catch: java.lang.Throwable -> L10
                goto L12
            L10:
                r4 = move-exception
                goto L67
            L12:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L10
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                c4.b r0 = r3.f10419d     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L23
                kotlin.jvm.internal.AbstractC9133u.m16145s()     // Catch: java.lang.Throwable -> L10
            L23:
                com.zykj.message.client.MessageClient$INSTANCES$e r1 = new com.zykj.message.client.MessageClient$INSTANCES$e     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
                r0.mo2139g(r1)     // Catch: java.lang.Throwable -> L10
                goto L65
            L2c:
                android.app.Application r0 = r3.f10420e     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L35
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.AbstractC9133u.m16151y(r1)     // Catch: java.lang.Throwable -> L10
            L35:
                r3.mo9577j(r0)     // Catch: java.lang.Throwable -> L10
                r0 = 0
            L39:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L65
                r1 = 100
                java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L10
                c4.b r1 = r3.f10419d     // Catch: java.lang.Throwable -> L10
                r2 = 0
                if (r1 == 0) goto L4d
                com.zykj.message.server.bean.ServerInfo r1 = r1.mo2141j()     // Catch: java.lang.Throwable -> L10
                goto L4e
            L4d:
                r1 = r2
            L4e:
                if (r1 != 0) goto L58
                r1 = 40
                if (r0 <= r1) goto L55
                goto L58
            L55:
                int r0 = r0 + 1
                goto L39
            L58:
                c4.b r0 = r3.f10419d     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L60
                com.zykj.message.server.bean.ServerInfo r2 = r0.mo2141j()     // Catch: java.lang.Throwable -> L10
            L60:
                r4.invoke(r2)     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)
                return
            L65:
                monitor-exit(r3)
                return
            L67:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.mo9575h(x7.l):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/message/client/MessageClient$INSTANCES.smali:894
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: i */
        public void mo9576i(AbstractBinderC5031a messageCallBack) {
            AbstractC9133u.m16134h(messageCallBack, "messageCallBack");
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null) {
                if (interfaceC5233b == null) {
                    AbstractC9133u.m16145s();
                }
                if (interfaceC5233b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7406f(messageCallBack)).start();
                    return;
                }
            }
            this.f10422g.add(messageCallBack);
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            mo9577j(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: j */
        public void mo9577j(Application context) {
            IBinder iBinderAsBinder;
            AbstractC9133u.m16134h(context, "context");
            this.f10420e = context;
            C0024a c0024aM54i = C0024a.m54i();
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            c0024aM54i.m58f(application);
            if (!mo9574g()) {
                Application application2 = this.f10420e;
                if (application2 == null) {
                    AbstractC9133u.m16151y("mContext");
                }
                mo9571c(application2, false);
                return;
            }
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null) {
                if (interfaceC5233b != null && (iBinderAsBinder = interfaceC5233b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application3 = this.f10420e;
                        if (application3 == null) {
                            AbstractC9133u.m16151y("mContext");
                        }
                        application3.unbindService(this.f10424i);
                    } catch (Exception unused) {
                    }
                }
                this.f10419d = null;
            }
            if (this.f10419d == null) {
                try {
                    Application application4 = this.f10420e;
                    if (application4 == null) {
                        AbstractC9133u.m16151y("mContext");
                    }
                    application4.unbindService(this.f10424i);
                } catch (Exception unused2) {
                }
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                System.currentTimeMillis();
                Application application5 = this.f10420e;
                if (application5 == null) {
                    AbstractC9133u.m16151y("mContext");
                }
                if (application5.bindService(intent, this.f10424i, 1)) {
                    System.currentTimeMillis();
                    return;
                }
                Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                m9590w();
            }
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: k */
        public void mo9578k() {
            IBinder iBinderAsBinder;
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null && interfaceC5233b != null && (iBinderAsBinder = interfaceC5233b.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.f10420e;
                if (application == null) {
                    AbstractC9133u.m16151y("mContext");
                }
                application.unbindService(this.f10424i);
            }
            C0024a c0024aM54i = C0024a.m54i();
            Application application2 = this.f10420e;
            if (application2 == null) {
                AbstractC9133u.m16151y("mContext");
            }
            c0024aM54i.m60h(application2);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: l */
        public void mo9579l(AbstractBinderC5031a messageCallBack) {
            AbstractC9133u.m16134h(messageCallBack, "messageCallBack");
            InterfaceC5233b interfaceC5233b = this.f10419d;
            if (interfaceC5233b != null) {
                if (interfaceC5233b == null) {
                    AbstractC9133u.m16145s();
                }
                if (interfaceC5233b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7407g(messageCallBack)).start();
                    return;
                }
            }
            this.f10422g.add(messageCallBack);
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            mo9577j(application);
        }

        /* renamed from: u */
        public final void m9588u(ServerInfo serverInfo, boolean z10) {
            Status statusM9596b;
            if (serverInfo == null || (statusM9596b = serverInfo.m9596b()) == null) {
                statusM9596b = Status.LOGOUT;
            }
            int i10 = AbstractC0025b.f73a[statusM9596b.ordinal()];
            if (i10 == 1) {
                Iterator it = this.f10423h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC10559a) it.next()).invoke();
                }
                this.f10423h.clear();
                return;
            }
            if (i10 == 2) {
                Application application = this.f10420e;
                if (application == null) {
                    AbstractC9133u.m16151y("mContext");
                }
                mo9572d(application, z10);
                return;
            }
            if (i10 != 3) {
                return;
            }
            Application application2 = this.f10420e;
            if (application2 == null) {
                AbstractC9133u.m16151y("mContext");
            }
            mo9572d(application2, z10);
        }

        /* renamed from: v */
        public final InterfaceC5233b m9589v() {
            return this.f10419d;
        }

        /* renamed from: w */
        public final void m9590w() {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.message.service.awaken");
            intent.setFlags(268435456);
            Application application = this.f10420e;
            if (application == null) {
                AbstractC9133u.m16151y("mContext");
            }
            application.startActivity(intent);
            Timer timer = new Timer();
            this.f10421f = timer;
            timer.schedule(new C7404d(), 1000L);
        }

        /* renamed from: x */
        public final void m9591x() {
            C0024a.m54i().m59g(new C0024a.b() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // p005a4.C0024a.b
                public final void onResume() {
                    this.f10453a.mo9569a(new InterfaceC10570l() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
                        {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m9594a(ServerInfo it) {
                            AbstractC9133u.m16134h(it, "it");
                            MessageClient$INSTANCES$registerResumeListener$1.this.f10453a.m9588u(it, false);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m9594a((ServerInfo) obj);
                            return C8736p.f16368a;
                        }
                    });
                }
            });
        }

        /* renamed from: y */
        public final void m9592y(InterfaceC5233b interfaceC5233b) {
            this.f10419d = interfaceC5233b;
        }
    }

    /* renamed from: com.zykj.message.client.MessageClient$a */
    public static final class C7411a {
        public C7411a() {
        }

        public /* synthetic */ C7411a(AbstractC9126n abstractC9126n) {
            this();
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f10416a = instances;
        f10417b = new MessageClient[]{instances};
        f10418c = new C7411a(null);
    }

    public MessageClient(String str, int i10) {
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f10417b.clone();
    }

    /* renamed from: a */
    public abstract void mo9569a(InterfaceC10570l interfaceC10570l);

    /* renamed from: b */
    public abstract void mo9570b(InterfaceC10570l interfaceC10570l);

    /* renamed from: c */
    public abstract void mo9571c(Context context, boolean z10);

    /* renamed from: d */
    public abstract void mo9572d(Context context, boolean z10);

    /* renamed from: e */
    public abstract void mo9573e(Application application);

    /* renamed from: g */
    public abstract boolean mo9574g();

    /* renamed from: h */
    public abstract void mo9575h(InterfaceC10570l interfaceC10570l);

    /* renamed from: i */
    public abstract void mo9576i(AbstractBinderC5031a abstractBinderC5031a);

    /* renamed from: j */
    public abstract void mo9577j(Application application);

    /* renamed from: k */
    public abstract void mo9578k();

    /* renamed from: l */
    public abstract void mo9579l(AbstractBinderC5031a abstractBinderC5031a);

    public /* synthetic */ MessageClient(String str, int i10, AbstractC9126n abstractC9126n) {
        this(str, i10);
    }
}
