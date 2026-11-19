package p178z1;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
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
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003a2.AbstractBinderC0009a;
import p003a2.AbstractBinderC0011c;
import p003a2.BinderC0010b;
import p013b2.InterfaceC1031b;
import p128o2.C2925r;
import p171x2.InterfaceC3459a;
import p171x2.InterfaceC3470l;
import p178z1.C3508a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z1.b */
/* loaded from: classes.dex */
public abstract class EnumC3509b {

    /* renamed from: a */
    public static final EnumC3509b f12309a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC3509b[] f12310b;

    /* renamed from: c */
    public static final a f12311c;

    /* renamed from: z1.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: z1.b$b */
    static final class b extends EnumC3509b {

        /* renamed from: d */
        @Nullable
        private InterfaceC1031b f12312d;

        /* renamed from: e */
        private Application f12313e;

        /* renamed from: f */
        private Timer f12314f;

        /* renamed from: g */
        private List<AbstractBinderC0009a> f12315g;

        /* renamed from: h */
        private final List<InterfaceC3459a<C2925r>> f12316h;

        /* renamed from: i */
        private final h f12317i;

        /* renamed from: j */
        private final Handler f12318j;

        /* renamed from: z1.b$b$a */
        static final class a extends AbstractC2770m implements InterfaceC3459a<C2925r> {

            /* renamed from: b */
            final /* synthetic */ String f12320b;

            /* renamed from: c */
            final /* synthetic */ String f12321c;

            /* renamed from: d */
            final /* synthetic */ String f12322d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, String str3) {
                super(0);
                this.f12320b = str;
                this.f12321c = str2;
                this.f12322d = str3;
            }

            /* renamed from: a */
            public final void m10720a() throws RemoteException {
                InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                if (interfaceC1031bM10715s == null) {
                    C2769l.m9250n();
                }
                interfaceC1031bM10715s.mo4798m(this.f12320b, this.f12321c, this.f12322d);
            }

            @Override // p171x2.InterfaceC3459a
            public /* bridge */ /* synthetic */ C2925r invoke() throws RemoteException {
                m10720a();
                return C2925r.f11415a;
            }
        }

        /* renamed from: z1.b$b$b, reason: collision with other inner class name */
        static final class RunnableC3553b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12324b;

            /* renamed from: z1.b$b$b$a */
            static final class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC3553b runnableC3553b = RunnableC3553b.this;
                    InterfaceC3470l interfaceC3470l = runnableC3553b.f12324b;
                    InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                    interfaceC3470l.invoke(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4797e() : null);
                }
            }

            RunnableC3553b(InterfaceC3470l interfaceC3470l) {
                this.f12324b = interfaceC3470l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.f12318j.post(new a());
            }
        }

        /* renamed from: z1.b$b$c */
        static final class c extends AbstractC2770m implements InterfaceC3459a<C2925r> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12327b;

            /* renamed from: z1.b$b$c$a */
            static final class a implements Runnable {

                /* renamed from: z1.b$b$c$a$a, reason: collision with other inner class name */
                static final class RunnableC3554a implements Runnable {
                    RunnableC3554a() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        InterfaceC3470l interfaceC3470l = cVar.f12327b;
                        InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                        interfaceC3470l.invoke(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4797e() : null);
                    }
                }

                a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.f12318j.post(new RunnableC3554a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC3470l interfaceC3470l) {
                super(0);
                this.f12327b = interfaceC3470l;
            }

            /* renamed from: a */
            public final void m10721a() {
                new Thread(new a()).start();
            }

            @Override // p171x2.InterfaceC3459a
            public /* bridge */ /* synthetic */ C2925r invoke() {
                m10721a();
                return C2925r.f11415a;
            }
        }

        /* renamed from: z1.b$b$d */
        static final class d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12331b;

            /* renamed from: z1.b$b$d$a */
            static final class a implements Runnable {

                /* renamed from: b */
                final /* synthetic */ ServerInfo f12333b;

                a(ServerInfo serverInfo) {
                    this.f12333b = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC3470l interfaceC3470l = d.this.f12331b;
                    ServerInfo serverInfo = this.f12333b;
                    if (serverInfo == null) {
                        C2769l.m9250n();
                    }
                    interfaceC3470l.invoke(serverInfo);
                }
            }

            d(InterfaceC3470l interfaceC3470l) {
                this.f12331b = interfaceC3470l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                b.this.f12318j.post(new a(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4799p() : null));
            }
        }

        /* renamed from: z1.b$b$e */
        static final class e extends AbstractC2770m implements InterfaceC3459a<C2925r> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12335b;

            /* renamed from: z1.b$b$e$a */
            static final class a implements Runnable {

                /* renamed from: z1.b$b$e$a$a, reason: collision with other inner class name */
                static final class RunnableC3555a implements Runnable {

                    /* renamed from: b */
                    final /* synthetic */ ServerInfo f12338b;

                    RunnableC3555a(ServerInfo serverInfo) {
                        this.f12338b = serverInfo;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3470l interfaceC3470l = e.this.f12335b;
                        ServerInfo serverInfo = this.f12338b;
                        if (serverInfo == null) {
                            C2769l.m9250n();
                        }
                        interfaceC3470l.invoke(serverInfo);
                    }
                }

                a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                    b.this.f12318j.post(new RunnableC3555a(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4799p() : null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(InterfaceC3470l interfaceC3470l) {
                super(0);
                this.f12335b = interfaceC3470l;
            }

            /* renamed from: a */
            public final void m10722a() {
                new Thread(new a()).start();
            }

            @Override // p171x2.InterfaceC3459a
            public /* bridge */ /* synthetic */ C2925r invoke() {
                m10722a();
                return C2925r.f11415a;
            }
        }

        /* renamed from: z1.b$b$f */
        static final class f implements Runnable {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12340b;

            /* renamed from: z1.b$b$f$a */
            static final class a implements Runnable {

                /* renamed from: b */
                final /* synthetic */ UserInfo f12342b;

                a(UserInfo userInfo) {
                    this.f12342b = userInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC3470l interfaceC3470l = f.this.f12340b;
                    UserInfo userInfo = this.f12342b;
                    if (userInfo == null) {
                        C2769l.m9250n();
                    }
                    interfaceC3470l.invoke(userInfo);
                }
            }

            f(InterfaceC3470l interfaceC3470l) {
                this.f12340b = interfaceC3470l;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                b.this.f12318j.post(new a(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4796c() : null));
            }
        }

        /* renamed from: z1.b$b$g */
        static final class g extends AbstractC2770m implements InterfaceC3459a<C2925r> {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12344b;

            /* renamed from: z1.b$b$g$a */
            static final class a implements Runnable {

                /* renamed from: z1.b$b$g$a$a, reason: collision with other inner class name */
                static final class RunnableC3556a implements Runnable {

                    /* renamed from: b */
                    final /* synthetic */ UserInfo f12347b;

                    RunnableC3556a(UserInfo userInfo) {
                        this.f12347b = userInfo;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3470l interfaceC3470l = g.this.f12344b;
                        UserInfo userInfo = this.f12347b;
                        if (userInfo == null) {
                            C2769l.m9250n();
                        }
                        interfaceC3470l.invoke(userInfo);
                    }
                }

                a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                    b.this.f12318j.post(new RunnableC3556a(interfaceC1031bM10715s != null ? interfaceC1031bM10715s.mo4796c() : null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(InterfaceC3470l interfaceC3470l) {
                super(0);
                this.f12344b = interfaceC3470l;
            }

            /* renamed from: a */
            public final void m10723a() {
                new Thread(new a()).start();
            }

            @Override // p171x2.InterfaceC3459a
            public /* bridge */ /* synthetic */ C2925r invoke() {
                m10723a();
                return C2925r.f11415a;
            }
        }

        /* renamed from: z1.b$b$h */
        public static final class h implements ServiceConnection {

            /* renamed from: z1.b$b$h$a */
            static final class a extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {
                a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m10724a(@NotNull ServerInfo it) {
                    C2769l.m9242f(it, "it");
                    b.this.m10712r(it, false);
                }

                @Override // p171x2.InterfaceC3470l
                public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
                    m10724a(serverInfo);
                    return C2925r.f11415a;
                }
            }

            h() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName className, @NotNull IBinder service) {
                C2769l.m9242f(className, "className");
                C2769l.m9242f(service, "service");
                Log.d("MessageClient", "连接到个人中心服务" + System.currentTimeMillis());
                Timer timer = b.this.f12314f;
                if (timer != null) {
                    timer.cancel();
                }
                b.this.f12314f = null;
                b.this.m10719y(InterfaceC1031b.a.m4801y(service));
                b.this.mo10697c(new a());
                Iterator it = b.this.f12315g.iterator();
                while (it.hasNext()) {
                    b.this.m10718w((AbstractBinderC0009a) it.next());
                }
                b.this.m10714x();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName className) {
                C2769l.m9242f(className, "className");
                Log.d("MessageClient", "个人中心服务失去连接");
                try {
                    b.m10707m(b.this).unbindService(this);
                } catch (Exception unused) {
                }
                b.this.m10719y(null);
            }
        }

        /* renamed from: z1.b$b$i */
        static final class i implements Handler.Callback {
            i() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                b bVar = b.this;
                bVar.m10717u(b.m10707m(bVar), false);
                return true;
            }
        }

        /* renamed from: z1.b$b$j */
        public static final class j extends TimerTask {
            j() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Log.d("MessageClient", "重启服务 1S后的超时任务启动" + System.currentTimeMillis());
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (b.m10707m(b.this).bindService(intent, b.this.f12317i, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                b.this.f12318j.sendEmptyMessage(2);
            }
        }

        /* renamed from: z1.b$b$k */
        public static final class k extends AbstractBinderC0011c {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12352b;

            k(InterfaceC3470l interfaceC3470l) {
                this.f12352b = interfaceC3470l;
            }

            @Override // p013b2.InterfaceC1030a
            /* renamed from: o */
            public void mo60o(@Nullable ServerInfo serverInfo) {
                this.f12352b.invoke(serverInfo);
            }
        }

        /* renamed from: z1.b$b$l */
        static final class l implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AbstractBinderC0009a f12354b;

            l(AbstractBinderC0009a abstractBinderC0009a) {
                this.f12354b = abstractBinderC0009a;
            }

            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                if (interfaceC1031bM10715s != null) {
                    interfaceC1031bM10715s.mo4800r(this.f12354b);
                }
            }
        }

        /* renamed from: z1.b$b$m */
        static final class m implements C3508a.b {

            /* renamed from: z1.b$b$m$a */
            static final class a extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {
                a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m10725a(@NotNull ServerInfo it) {
                    C2769l.m9242f(it, "it");
                    b.this.m10712r(it, false);
                }

                @Override // p171x2.InterfaceC3470l
                public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
                    m10725a(serverInfo);
                    return C2925r.f11415a;
                }
            }

            m() {
            }

            @Override // p178z1.C3508a.b
            /* renamed from: a */
            public final void mo10694a() {
                b.this.mo10697c(new a());
            }
        }

        /* renamed from: z1.b$b$n */
        static final class n implements Runnable {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3470l f12358b;

            /* renamed from: z1.b$b$n$a */
            static final class a extends AbstractC2770m implements InterfaceC3470l<UserInfo, C2925r> {

                /* renamed from: a */
                public static final a f12359a = new a();

                a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m10726a(@Nullable UserInfo userInfo) {
                }

                @Override // p171x2.InterfaceC3470l
                public /* bridge */ /* synthetic */ C2925r invoke(UserInfo userInfo) {
                    m10726a(userInfo);
                    return C2925r.f11415a;
                }
            }

            n(InterfaceC3470l interfaceC3470l) {
                this.f12358b = interfaceC3470l;
            }

            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                InterfaceC1031b interfaceC1031bM10715s = b.this.m10715s();
                if (interfaceC1031bM10715s != null) {
                    interfaceC1031bM10715s.mo4800r(new BinderC0010b(this.f12358b, a.f12359a));
                }
            }
        }

        /* renamed from: z1.b$b$o */
        static final class o extends AbstractC2770m implements InterfaceC3470l<UserInfo, C2925r> {

            /* renamed from: a */
            public static final o f12360a = new o();

            o() {
                super(1);
            }

            /* renamed from: a */
            public final void m10727a(@Nullable UserInfo userInfo) {
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2925r invoke(UserInfo userInfo) {
                m10727a(userInfo);
                return C2925r.f11415a;
            }
        }

        b(String str, int i4) {
            super(str, i4, null);
            this.f12315g = new ArrayList();
            this.f12316h = new ArrayList();
            this.f12317i = new h();
            this.f12318j = new Handler(new i());
        }

        /* renamed from: m */
        public static final /* synthetic */ Application m10707m(b bVar) {
            Application application = bVar.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            return application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final void m10712r(ServerInfo serverInfo, boolean z3) {
            Status statusM8009b;
            if (serverInfo == null || (statusM8009b = serverInfo.m8009b()) == null) {
                statusM8009b = Status.LOGOUT;
            }
            int i4 = C3510c.f12361a[statusM8009b.ordinal()];
            if (i4 == 1) {
                Iterator<T> it = this.f12316h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3459a) it.next()).invoke();
                }
                this.f12316h.clear();
                return;
            }
            if (i4 == 2) {
                Application application = this.f12313e;
                if (application == null) {
                    C2769l.m9256t("mContext");
                }
                m10717u(application, z3);
                return;
            }
            if (i4 != 3) {
                return;
            }
            Application application2 = this.f12313e;
            if (application2 == null) {
                C2769l.m9256t("mContext");
            }
            m10717u(application2, z3);
        }

        /* renamed from: v */
        private final void m10713v() {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.message.service.awaken");
            intent.setFlags(268435456);
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            application.startActivity(intent);
            Timer timer = new Timer();
            this.f12314f = timer;
            timer.schedule(new j(), 1000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public final void m10714x() {
            C3508a.m10687i().m10692g(new m());
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: a */
        public void mo10695a(@NotNull String url, @NotNull String appName, @NotNull String appPackageName) throws RemoteException {
            C2769l.m9242f(url, "url");
            C2769l.m9242f(appName, "appName");
            C2769l.m9242f(appPackageName, "appPackageName");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    InterfaceC1031b interfaceC1031b2 = this.f12312d;
                    if (interfaceC1031b2 == null) {
                        C2769l.m9250n();
                    }
                    interfaceC1031b2.mo4798m(url, appName, appPackageName);
                    return;
                }
            }
            this.f12316h.add(new a(url, appName, appPackageName));
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: b */
        public void mo10696b(@NotNull InterfaceC3470l<? super String, C2925r> callBack) {
            C2769l.m9242f(callBack, "callBack");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    new Thread(new RunnableC3553b(callBack)).start();
                    return;
                }
            }
            this.f12316h.add(new c(callBack));
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: c */
        public void mo10697c(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> callBack) {
            C2769l.m9242f(callBack, "callBack");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    new Thread(new d(callBack)).start();
                    return;
                }
            }
            this.f12316h.add(new e(callBack));
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: d */
        public void mo10698d(@NotNull InterfaceC3470l<? super UserInfo, C2925r> callBack) {
            C2769l.m9242f(callBack, "callBack");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    new Thread(new f(callBack)).start();
                    return;
                }
            }
            this.f12316h.add(new g(callBack));
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: e */
        public boolean mo10699e() throws PackageManager.NameNotFoundException {
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            try {
                application.getPackageManager().getPackageInfo("com.zykj.manage", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000c, B:7:0x000f, B:9:0x0019, B:11:0x001d, B:12:0x0020, B:13:0x0029, B:15:0x002d, B:16:0x0032, B:18:0x003b, B:20:0x0045, B:26:0x0052, B:27:0x0055, B:29:0x0059, B:30:0x005d), top: B:38:0x0001 }] */
        @Override // p178z1.EnumC3509b
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo10700f(@org.jetbrains.annotations.NotNull p171x2.InterfaceC3470l<? super com.zykj.message.server.bean.ServerInfo, p128o2.C2925r> r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.C2769l.m9242f(r5, r0)     // Catch: java.lang.Throwable -> L64
                b2.b r0 = r4.f12312d     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L29
                if (r0 != 0) goto Lf
                kotlin.jvm.internal.C2769l.m9250n()     // Catch: java.lang.Throwable -> L64
            Lf:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L64
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L29
                b2.b r0 = r4.f12312d     // Catch: java.lang.Throwable -> L64
                if (r0 != 0) goto L20
                kotlin.jvm.internal.C2769l.m9250n()     // Catch: java.lang.Throwable -> L64
            L20:
                z1.b$b$k r1 = new z1.b$b$k     // Catch: java.lang.Throwable -> L64
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L64
                r0.mo4795a(r1)     // Catch: java.lang.Throwable -> L64
                goto L62
            L29:
                android.app.Application r0 = r4.f12313e     // Catch: java.lang.Throwable -> L64
                if (r0 != 0) goto L32
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.C2769l.m9256t(r1)     // Catch: java.lang.Throwable -> L64
            L32:
                r4.mo10702h(r0)     // Catch: java.lang.Throwable -> L64
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
            L39:
                if (r1 >= r0) goto L62
                r2 = 100
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L64
                b2.b r2 = r4.f12312d     // Catch: java.lang.Throwable -> L64
                r3 = 0
                if (r2 == 0) goto L4a
                com.zykj.message.server.bean.ServerInfo r2 = r2.mo4799p()     // Catch: java.lang.Throwable -> L64
                goto L4b
            L4a:
                r2 = r3
            L4b:
                if (r2 != 0) goto L55
                r2 = 40
                if (r1 <= r2) goto L52
                goto L55
            L52:
                int r1 = r1 + 1
                goto L39
            L55:
                b2.b r0 = r4.f12312d     // Catch: java.lang.Throwable -> L64
                if (r0 == 0) goto L5d
                com.zykj.message.server.bean.ServerInfo r3 = r0.mo4799p()     // Catch: java.lang.Throwable -> L64
            L5d:
                r5.invoke(r3)     // Catch: java.lang.Throwable -> L64
                monitor-exit(r4)
                return
            L62:
                monitor-exit(r4)
                return
            L64:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p178z1.EnumC3509b.b.mo10700f(x2.l):void");
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: g */
        public void mo10701g(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> callBack) {
            C2769l.m9242f(callBack, "callBack");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    new Thread(new n(callBack)).start();
                    return;
                }
            }
            this.f12315g.add(new BinderC0010b(callBack, o.f12360a));
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: h */
        public void mo10702h(@NotNull Application context) {
            IBinder iBinderAsBinder;
            C2769l.m9242f(context, "context");
            this.f12313e = context;
            C3508a c3508aM10687i = C3508a.m10687i();
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            c3508aM10687i.m10691f(application);
            if (!mo10699e()) {
                Application application2 = this.f12313e;
                if (application2 == null) {
                    C2769l.m9256t("mContext");
                }
                m10716t(application2, false);
                return;
            }
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b != null && (iBinderAsBinder = interfaceC1031b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application3 = this.f12313e;
                        if (application3 == null) {
                            C2769l.m9256t("mContext");
                        }
                        application3.unbindService(this.f12317i);
                    } catch (Exception unused) {
                    }
                }
                this.f12312d = null;
            }
            if (this.f12312d == null) {
                try {
                    Application application4 = this.f12313e;
                    if (application4 == null) {
                        C2769l.m9256t("mContext");
                    }
                    application4.unbindService(this.f12317i);
                } catch (Exception unused2) {
                }
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                Log.d("MessageClient", "开始连接服务->" + System.currentTimeMillis());
                Application application5 = this.f12313e;
                if (application5 == null) {
                    C2769l.m9256t("mContext");
                }
                if (application5.bindService(intent, this.f12317i, 1)) {
                    Log.d("MessageClient", "绑定个人中心服务成功 result= true : " + System.currentTimeMillis());
                    return;
                }
                Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                m10713v();
            }
        }

        @Override // p178z1.EnumC3509b
        /* renamed from: i */
        public void mo10703i() {
            IBinder iBinderAsBinder;
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null && interfaceC1031b != null && (iBinderAsBinder = interfaceC1031b.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.f12313e;
                if (application == null) {
                    C2769l.m9256t("mContext");
                }
                application.unbindService(this.f12317i);
            }
            C3508a c3508aM10687i = C3508a.m10687i();
            Application application2 = this.f12313e;
            if (application2 == null) {
                C2769l.m9256t("mContext");
            }
            c3508aM10687i.m10693h(application2);
        }

        @Nullable
        /* renamed from: s */
        public final InterfaceC1031b m10715s() {
            return this.f12312d;
        }

        /* renamed from: t */
        public void m10716t(@NotNull Context context, boolean z3) {
            C2769l.m9242f(context, "context");
            C3508a c3508aM10687i = C3508a.m10687i();
            C2769l.m9238b(c3508aM10687i, "ActivityCollectionHelper.with()");
            if (c3508aM10687i.m10690e() != null) {
                C3508a c3508aM10687i2 = C3508a.m10687i();
                C2769l.m9238b(c3508aM10687i2, "ActivityCollectionHelper.with()");
                if (C2769l.m9237a(c3508aM10687i2.m10690e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C3508a.m10687i().m10689d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", z3);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动安装界面");
        }

        /* renamed from: u */
        public void m10717u(@NotNull Context context, boolean z3) {
            C2769l.m9242f(context, "context");
            C3508a c3508aM10687i = C3508a.m10687i();
            C2769l.m9238b(c3508aM10687i, "ActivityCollectionHelper.with()");
            if (c3508aM10687i.m10690e() != null) {
                C3508a c3508aM10687i2 = C3508a.m10687i();
                C2769l.m9238b(c3508aM10687i2, "ActivityCollectionHelper.with()");
                if (C2769l.m9237a(c3508aM10687i2.m10690e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C3508a.m10687i().m10689d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", z3);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动登录界面");
        }

        /* renamed from: w */
        public void m10718w(@NotNull AbstractBinderC0009a messageCallBack) {
            C2769l.m9242f(messageCallBack, "messageCallBack");
            InterfaceC1031b interfaceC1031b = this.f12312d;
            if (interfaceC1031b != null) {
                if (interfaceC1031b == null) {
                    C2769l.m9250n();
                }
                if (interfaceC1031b.asBinder().pingBinder()) {
                    new Thread(new l(messageCallBack)).start();
                    return;
                }
            }
            this.f12315g.add(messageCallBack);
            Application application = this.f12313e;
            if (application == null) {
                C2769l.m9256t("mContext");
            }
            mo10702h(application);
        }

        /* renamed from: y */
        public final void m10719y(@Nullable InterfaceC1031b interfaceC1031b) {
            this.f12312d = interfaceC1031b;
        }
    }

    static {
        b bVar = new b("INSTANCES", 0);
        f12309a = bVar;
        f12310b = new EnumC3509b[]{bVar};
        f12311c = new a(null);
    }

    private EnumC3509b(String str, int i4) {
    }

    public static EnumC3509b valueOf(String str) {
        return (EnumC3509b) Enum.valueOf(EnumC3509b.class, str);
    }

    public static EnumC3509b[] values() {
        return (EnumC3509b[]) f12310b.clone();
    }

    /* renamed from: a */
    public abstract void mo10695a(@NotNull String str, @NotNull String str2, @NotNull String str3);

    /* renamed from: b */
    public abstract void mo10696b(@NotNull InterfaceC3470l<? super String, C2925r> interfaceC3470l);

    /* renamed from: c */
    public abstract void mo10697c(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> interfaceC3470l);

    /* renamed from: d */
    public abstract void mo10698d(@NotNull InterfaceC3470l<? super UserInfo, C2925r> interfaceC3470l);

    /* renamed from: e */
    public abstract boolean mo10699e();

    /* renamed from: f */
    public abstract void mo10700f(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> interfaceC3470l);

    /* renamed from: g */
    public abstract void mo10701g(@NotNull InterfaceC3470l<? super ServerInfo, C2925r> interfaceC3470l);

    /* renamed from: h */
    public abstract void mo10702h(@NotNull Application application);

    /* renamed from: i */
    public abstract void mo10703i();

    public /* synthetic */ EnumC3509b(String str, int i4, C2764g c2764g) {
        this(str, i4);
    }
}
