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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p048cb.AbstractC5417c;
import p048cb.C5415a;
import p048cb.InterfaceC5416b;
import p119db.AbstractBinderC9013a;
import p119db.AbstractBinderC9014b;
import p135eb.InterfaceC9115b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class MessageClient {

    /* renamed from: c */
    public static final MessageClient f19777c;

    /* renamed from: d */
    public static final /* synthetic */ MessageClient[] f19778d;

    /* renamed from: e */
    public static final C8620a f19779e;

    public static final class INSTANCES extends MessageClient {

        /* renamed from: f */
        public InterfaceC9115b f19780f;

        /* renamed from: g */
        public Application f19781g;

        /* renamed from: h */
        public Timer f19782h;

        /* renamed from: i */
        public List f19783i;

        /* renamed from: j */
        public final List f19784j;

        /* renamed from: k */
        public final MessageClient$INSTANCES$mConnection$1 f19785k;

        /* renamed from: l */
        public final Handler f19786l;

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a */
        public static final class RunnableC8610a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ InterfaceC5416b f19788d;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a$a */
            public static final class a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ServerInfo f19790d;

                public a(ServerInfo serverInfo) {
                    this.f19790d = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8610a.this.f19788d.mo2890a(this.f19790d);
                }
            }

            public RunnableC8610a(InterfaceC5416b interfaceC5416b) {
                this.f19788d = interfaceC5416b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9115b interfaceC9115bM16558D = INSTANCES.this.m16558D();
                INSTANCES.this.f19786l.post(new a(interfaceC9115bM16558D != null ? interfaceC9115bM16558D.mo17937k() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b */
        public static final class RunnableC8611b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ InterfaceC9540l f19792d;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b$a */
            public static final class a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ ServerInfo f19794d;

                public a(ServerInfo serverInfo) {
                    this.f19794d = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC9540l interfaceC9540l = RunnableC8611b.this.f19792d;
                    ServerInfo serverInfo = this.f19794d;
                    if (serverInfo == null) {
                        AbstractC9979u.m20306s();
                    }
                    interfaceC9540l.invoke(serverInfo);
                }
            }

            public RunnableC8611b(InterfaceC9540l interfaceC9540l) {
                this.f19792d = interfaceC9540l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9115b interfaceC9115bM16558D = INSTANCES.this.m16558D();
                INSTANCES.this.f19786l.post(new a(interfaceC9115bM16558D != null ? interfaceC9115bM16558D.mo17937k() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$c */
        public static final class C8612c implements Handler.Callback {
            public C8612c() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                INSTANCES instances = INSTANCES.this;
                instances.m16560F(INSTANCES.m16553u(instances), false);
                return true;
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$d */
        public static final class C8613d extends TimerTask {
            public C8613d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (INSTANCES.m16553u(INSTANCES.this).bindService(intent, INSTANCES.this.f19785k, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                INSTANCES.this.f19786l.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$e */
        public static final class BinderC8614e extends AbstractBinderC9014b {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC9540l f19797b;

            public BinderC8614e(InterfaceC9540l interfaceC9540l) {
                this.f19797b = interfaceC9540l;
            }

            @Override // p135eb.InterfaceC9114a
            /* renamed from: i */
            public void mo7150i(ServerInfo serverInfo) {
                this.f19797b.invoke(serverInfo);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$f */
        public static final class RunnableC8615f implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AbstractBinderC9013a f19799d;

            public RunnableC8615f(AbstractBinderC9013a abstractBinderC9013a) {
                this.f19799d = abstractBinderC9013a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9115b interfaceC9115bM16558D = INSTANCES.this.m16558D();
                if (interfaceC9115bM16558D != null) {
                    interfaceC9115bM16558D.mo17935g(this.f19799d);
                }
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$g */
        public static final class RunnableC8616g implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AbstractBinderC9013a f19801d;

            public RunnableC8616g(AbstractBinderC9013a abstractBinderC9013a) {
                this.f19801d = abstractBinderC9013a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC9115b interfaceC9115bM16558D = INSTANCES.this.m16558D();
                if (interfaceC9115bM16558D != null) {
                    interfaceC9115bM16558D.mo17936h(this.f19801d);
                }
            }
        }

        public INSTANCES(String str, int i10) {
            super(str, i10, null);
            this.f19783i = new ArrayList();
            this.f19784j = new ArrayList();
            this.f19785k = new MessageClient$INSTANCES$mConnection$1(this);
            this.f19786l = new Handler(new C8612c());
        }

        /* renamed from: u */
        public static final /* synthetic */ Application m16553u(INSTANCES instances) {
            Application application = instances.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            return application;
        }

        /* renamed from: C */
        public final void m16557C(ServerInfo serverInfo, boolean z10) {
            Status statusM16567b;
            if (serverInfo == null || (statusM16567b = serverInfo.m16567b()) == null) {
                statusM16567b = Status.LOGOUT;
            }
            int i10 = AbstractC5417c.f3500a[statusM16567b.ordinal()];
            if (i10 == 1) {
                Iterator it = this.f19784j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9529a) it.next()).invoke();
                }
                this.f19784j.clear();
                return;
            }
            if (i10 == 2) {
                Application application = this.f19781g;
                if (application == null) {
                    AbstractC9979u.m20312y("mContext");
                }
                m16560F(application, z10);
                return;
            }
            if (i10 != 3) {
                return;
            }
            Application application2 = this.f19781g;
            if (application2 == null) {
                AbstractC9979u.m20312y("mContext");
            }
            m16560F(application2, z10);
        }

        /* renamed from: D */
        public final InterfaceC9115b m16558D() {
            return this.f19780f;
        }

        /* renamed from: E */
        public void m16559E(Context context, boolean z10) {
            AbstractC9979u.m20295h(context, "context");
            C5415a c5415aM2883i = C5415a.m2883i();
            AbstractC9979u.m20290c(c5415aM2883i, "ActivityCollectionHelper.with()");
            if (c5415aM2883i.m2886e() != null) {
                C5415a c5415aM2883i2 = C5415a.m2883i();
                AbstractC9979u.m20290c(c5415aM2883i2, "ActivityCollectionHelper.with()");
                if (AbstractC9979u.m20289b(c5415aM2883i2.m2886e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C5415a.m2883i().m2885d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", z10);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: F */
        public void m16560F(Context context, boolean z10) {
            AbstractC9979u.m20295h(context, "context");
            C5415a c5415aM2883i = C5415a.m2883i();
            AbstractC9979u.m20290c(c5415aM2883i, "ActivityCollectionHelper.with()");
            if (c5415aM2883i.m2886e() != null) {
                C5415a c5415aM2883i2 = C5415a.m2883i();
                AbstractC9979u.m20290c(c5415aM2883i2, "ActivityCollectionHelper.with()");
                if (AbstractC9979u.m20289b(c5415aM2883i2.m2886e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C5415a.m2883i().m2885d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", z10);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: G */
        public final void m16561G() {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.message.service.awaken");
            intent.setFlags(268435456);
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            application.startActivity(intent);
            Timer timer = new Timer();
            this.f19782h = timer;
            timer.schedule(new C8613d(), 1000L);
        }

        /* renamed from: H */
        public final void m16562H() {
            C5415a.m2883i().m2888g(new C5415a.b() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // p048cb.C5415a.b
                public final void onResume() {
                    this.f19814a.mo16540c(new InterfaceC9540l() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
                        {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m16565a(ServerInfo it) {
                            AbstractC9979u.m20295h(it, "it");
                            MessageClient$INSTANCES$registerResumeListener$1.this.f19814a.m16557C(it, false);
                        }

                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m16565a((ServerInfo) obj);
                            return C10786q.f26013a;
                        }
                    });
                }
            });
        }

        /* renamed from: I */
        public final void m16563I(InterfaceC9115b interfaceC9115b) {
            this.f19780f = interfaceC9115b;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: a */
        public void mo16539a(InterfaceC5416b callBack) {
            AbstractC9979u.m20295h(callBack, "callBack");
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null) {
                if (interfaceC9115b == null) {
                    AbstractC9979u.m20306s();
                }
                if (interfaceC9115b.asBinder().pingBinder()) {
                    new Thread(new RunnableC8610a(callBack)).start();
                    return;
                }
            }
            this.f19784j.add(new MessageClient$INSTANCES$getServerInfo$2(this, callBack));
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            mo16546m(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: c */
        public void mo16540c(InterfaceC9540l callBack) {
            AbstractC9979u.m20295h(callBack, "callBack");
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null) {
                if (interfaceC9115b == null) {
                    AbstractC9979u.m20306s();
                }
                if (interfaceC9115b.asBinder().pingBinder()) {
                    new Thread(new RunnableC8611b(callBack)).start();
                    return;
                }
            }
            this.f19784j.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            mo16546m(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: d */
        public UserInfo mo16541d() {
            InterfaceC9115b interfaceC9115b;
            InterfaceC9115b interfaceC9115b2 = this.f19780f;
            if (interfaceC9115b2 != null) {
                if (interfaceC9115b2 == null) {
                    AbstractC9979u.m20306s();
                }
                if (interfaceC9115b2.asBinder().pingBinder() && (interfaceC9115b = this.f19780f) != null) {
                    return interfaceC9115b.mo17934d();
                }
            }
            return null;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: e */
        public void mo16542e(Application context) {
            AbstractC9979u.m20295h(context, "context");
            this.f19781g = context;
            C5415a c5415aM2883i = C5415a.m2883i();
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            c5415aM2883i.m2887f(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: f */
        public boolean mo16543f() throws PackageManager.NameNotFoundException {
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
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
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo16544g(p181hd.InterfaceC9540l r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.AbstractC9979u.m20295h(r4, r0)     // Catch: java.lang.Throwable -> L10
                eb.b r0 = r3.f19780f     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                if (r0 != 0) goto L12
                kotlin.jvm.internal.AbstractC9979u.m20306s()     // Catch: java.lang.Throwable -> L10
                goto L12
            L10:
                r4 = move-exception
                goto L67
            L12:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L10
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                eb.b r0 = r3.f19780f     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L23
                kotlin.jvm.internal.AbstractC9979u.m20306s()     // Catch: java.lang.Throwable -> L10
            L23:
                com.zykj.message.client.MessageClient$INSTANCES$e r1 = new com.zykj.message.client.MessageClient$INSTANCES$e     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
                r0.mo17933a(r1)     // Catch: java.lang.Throwable -> L10
                goto L65
            L2c:
                android.app.Application r0 = r3.f19781g     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L35
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.AbstractC9979u.m20312y(r1)     // Catch: java.lang.Throwable -> L10
            L35:
                r3.mo16546m(r0)     // Catch: java.lang.Throwable -> L10
                r0 = 0
            L39:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L65
                r1 = 100
                java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L10
                eb.b r1 = r3.f19780f     // Catch: java.lang.Throwable -> L10
                r2 = 0
                if (r1 == 0) goto L4d
                com.zykj.message.server.bean.ServerInfo r1 = r1.mo17937k()     // Catch: java.lang.Throwable -> L10
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
                eb.b r0 = r3.f19780f     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L60
                com.zykj.message.server.bean.ServerInfo r2 = r0.mo17937k()     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.mo16544g(hd.l):void"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/message/client/MessageClient$INSTANCES.smali:1283
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: k */
        public void mo16545k(AbstractBinderC9013a messageCallBack) {
            AbstractC9979u.m20295h(messageCallBack, "messageCallBack");
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null) {
                if (interfaceC9115b == null) {
                    AbstractC9979u.m20306s();
                }
                if (interfaceC9115b.asBinder().pingBinder()) {
                    new Thread(new RunnableC8615f(messageCallBack)).start();
                    return;
                }
            }
            this.f19783i.add(messageCallBack);
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            mo16546m(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: m */
        public void mo16546m(Application context) {
            IBinder iBinderAsBinder;
            AbstractC9979u.m20295h(context, "context");
            this.f19781g = context;
            C5415a c5415aM2883i = C5415a.m2883i();
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            c5415aM2883i.m2887f(application);
            if (!mo16543f()) {
                Application application2 = this.f19781g;
                if (application2 == null) {
                    AbstractC9979u.m20312y("mContext");
                }
                m16559E(application2, false);
                return;
            }
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null) {
                if (interfaceC9115b != null && (iBinderAsBinder = interfaceC9115b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application3 = this.f19781g;
                        if (application3 == null) {
                            AbstractC9979u.m20312y("mContext");
                        }
                        application3.unbindService(this.f19785k);
                    } catch (Exception unused) {
                    }
                }
                this.f19780f = null;
            }
            if (this.f19780f == null) {
                try {
                    Application application4 = this.f19781g;
                    if (application4 == null) {
                        AbstractC9979u.m20312y("mContext");
                    }
                    application4.unbindService(this.f19785k);
                } catch (Exception unused2) {
                }
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                System.currentTimeMillis();
                Application application5 = this.f19781g;
                if (application5 == null) {
                    AbstractC9979u.m20312y("mContext");
                }
                if (application5.bindService(intent, this.f19785k, 1)) {
                    System.currentTimeMillis();
                    return;
                }
                Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                m16561G();
            }
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: n */
        public void mo16547n() {
            IBinder iBinderAsBinder;
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null && interfaceC9115b != null && (iBinderAsBinder = interfaceC9115b.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.f19781g;
                if (application == null) {
                    AbstractC9979u.m20312y("mContext");
                }
                application.unbindService(this.f19785k);
            }
            C5415a c5415aM2883i = C5415a.m2883i();
            Application application2 = this.f19781g;
            if (application2 == null) {
                AbstractC9979u.m20312y("mContext");
            }
            c5415aM2883i.m2889h(application2);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: o */
        public void mo16548o(AbstractBinderC9013a messageCallBack) {
            AbstractC9979u.m20295h(messageCallBack, "messageCallBack");
            InterfaceC9115b interfaceC9115b = this.f19780f;
            if (interfaceC9115b != null) {
                if (interfaceC9115b == null) {
                    AbstractC9979u.m20306s();
                }
                if (interfaceC9115b.asBinder().pingBinder()) {
                    new Thread(new RunnableC8616g(messageCallBack)).start();
                    return;
                }
            }
            this.f19783i.add(messageCallBack);
            Application application = this.f19781g;
            if (application == null) {
                AbstractC9979u.m20312y("mContext");
            }
            mo16546m(application);
        }
    }

    /* renamed from: com.zykj.message.client.MessageClient$a */
    public static final class C8620a {
        public C8620a() {
        }

        public /* synthetic */ C8620a(AbstractC9972n abstractC9972n) {
            this();
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f19777c = instances;
        f19778d = new MessageClient[]{instances};
        f19779e = new C8620a(null);
    }

    public MessageClient(String str, int i10) {
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f19778d.clone();
    }

    /* renamed from: a */
    public abstract void mo16539a(InterfaceC5416b interfaceC5416b);

    /* renamed from: c */
    public abstract void mo16540c(InterfaceC9540l interfaceC9540l);

    /* renamed from: d */
    public abstract UserInfo mo16541d();

    /* renamed from: e */
    public abstract void mo16542e(Application application);

    /* renamed from: f */
    public abstract boolean mo16543f();

    /* renamed from: g */
    public abstract void mo16544g(InterfaceC9540l interfaceC9540l);

    /* renamed from: k */
    public abstract void mo16545k(AbstractBinderC9013a abstractBinderC9013a);

    /* renamed from: m */
    public abstract void mo16546m(Application application);

    /* renamed from: n */
    public abstract void mo16547n();

    /* renamed from: o */
    public abstract void mo16548o(AbstractBinderC9013a abstractBinderC9013a);

    public /* synthetic */ MessageClient(String str, int i10, AbstractC9972n abstractC9972n) {
        this(str, i10);
    }
}
