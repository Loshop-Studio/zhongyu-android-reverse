package p070b.p146d.p147a.p148b;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.util.Log;
import com.zykj.message.UnInstallActivity;
import com.zykj.message.UnLoginActivity;
import com.zykj.satisfaction.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p146d.p147a.p149c.AbstractBinderC0887a;
import p070b.p146d.p147a.p149c.AbstractBinderC0888b;
import p070b.p146d.p147a.p150d.InterfaceC0890b;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p070b.p146d.p147a.p150d.p151c.C0893c;
import p070b.p146d.p147a.p150d.p151c.EnumC0892b;
import p160d.C0994d;
import p160d.p162f.p163a.InterfaceC1005a;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.AbstractC1012e;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b.d.a.b.b */
/* loaded from: classes.dex */
public abstract class EnumC0881b {

    /* renamed from: b */
    public static final EnumC0881b f4691b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC0881b[] f4692c;

    /* renamed from: b.d.a.b.b$a */
    public static final class a extends EnumC0881b {

        /* renamed from: d */
        public InterfaceC0890b f4693d;

        /* renamed from: e */
        public Application f4694e;

        /* renamed from: f */
        public Timer f4695f;

        /* renamed from: g */
        public List<AbstractBinderC0887a> f4696g;

        /* renamed from: h */
        public final List<InterfaceC1005a<C0994d>> f4697h;

        /* renamed from: i */
        public final e f4698i;

        /* renamed from: j */
        public final Handler f4699j;

        /* renamed from: b.d.a.b.b$a$a, reason: collision with other inner class name */
        public static final class RunnableC1093a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ InterfaceC1006b f4701c;

            /* renamed from: b.d.a.b.b$a$a$a, reason: collision with other inner class name */
            public static final class RunnableC1094a implements Runnable {

                /* renamed from: c */
                public final /* synthetic */ C0891a f4703c;

                public RunnableC1094a(C0891a c0891a) {
                    this.f4703c = c0891a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1006b interfaceC1006b = RunnableC1093a.this.f4701c;
                    C0891a c0891a = this.f4703c;
                    if (c0891a != null) {
                        interfaceC1006b.mo2586c(c0891a);
                    } else {
                        C1011d.m2815k();
                        throw null;
                    }
                }
            }

            public RunnableC1093a(InterfaceC1006b interfaceC1006b) {
                this.f4701c = interfaceC1006b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0890b interfaceC0890b = a.this.f4693d;
                a.this.f4699j.post(new RunnableC1094a(interfaceC0890b != null ? interfaceC0890b.mo2590d() : null));
            }
        }

        /* renamed from: b.d.a.b.b$a$b */
        public static final class b extends AbstractC1012e implements InterfaceC1005a<C0994d> {

            /* renamed from: c */
            public final /* synthetic */ InterfaceC1006b f4705c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC1006b interfaceC1006b) {
                super(0);
                this.f4705c = interfaceC1006b;
            }

            @Override // p160d.p162f.p163a.InterfaceC1005a
            /* renamed from: a */
            public C0994d mo2585a() {
                new Thread(new RunnableC0882c(this)).start();
                return C0994d.f5474a;
            }
        }

        /* renamed from: b.d.a.b.b$a$c */
        public static final class c implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ InterfaceC1006b f4707c;

            /* renamed from: b.d.a.b.b$a$c$a, reason: collision with other inner class name */
            public static final class RunnableC1095a implements Runnable {

                /* renamed from: c */
                public final /* synthetic */ C0893c f4709c;

                public RunnableC1095a(C0893c c0893c) {
                    this.f4709c = c0893c;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC1006b interfaceC1006b = c.this.f4707c;
                    C0893c c0893c = this.f4709c;
                    if (c0893c != null) {
                        interfaceC1006b.mo2586c(c0893c);
                    } else {
                        C1011d.m2815k();
                        throw null;
                    }
                }
            }

            public c(InterfaceC1006b interfaceC1006b) {
                this.f4707c = interfaceC1006b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC0890b interfaceC0890b = a.this.f4693d;
                a.this.f4699j.post(new RunnableC1095a(interfaceC0890b != null ? interfaceC0890b.mo2589c() : null));
            }
        }

        /* renamed from: b.d.a.b.b$a$d */
        public static final class d extends AbstractC1012e implements InterfaceC1005a<C0994d> {

            /* renamed from: c */
            public final /* synthetic */ InterfaceC1006b f4711c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InterfaceC1006b interfaceC1006b) {
                super(0);
                this.f4711c = interfaceC1006b;
            }

            @Override // p160d.p162f.p163a.InterfaceC1005a
            /* renamed from: a */
            public C0994d mo2585a() {
                new Thread(new RunnableC0883d(this)).start();
                return C0994d.f5474a;
            }
        }

        /* renamed from: b.d.a.b.b$a$e */
        public static final class e implements ServiceConnection {

            /* renamed from: b.d.a.b.b$a$e$a, reason: collision with other inner class name */
            public static final class C1096a extends AbstractC1012e implements InterfaceC1006b<C0891a, C0994d> {
                public C1096a() {
                    super(1);
                }

                @Override // p160d.p162f.p163a.InterfaceC1006b
                /* renamed from: c */
                public C0994d mo2586c(C0891a c0891a) {
                    C0891a c0891a2 = c0891a;
                    C1011d.m2810f(c0891a2, "it");
                    a.m2582g(a.this, c0891a2, false);
                    return C0994d.f5474a;
                }
            }

            public e() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C1011d.m2810f(componentName, "className");
                C1011d.m2810f(iBinder, "service");
                Log.d("MessageClient", "连接到个人中心服务" + System.currentTimeMillis());
                Timer timer = a.this.f4695f;
                if (timer != null) {
                    timer.cancel();
                }
                a aVar = a.this;
                aVar.f4695f = null;
                int i = InterfaceC0890b.a.f4728a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.zykj.message.server.MessageServer");
                aVar.f4693d = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0890b)) ? new InterfaceC0890b.a.C1097a(iBinder) : (InterfaceC0890b) iInterfaceQueryLocalInterface;
                a.this.mo2576a(new C1096a());
                for (AbstractBinderC0887a abstractBinderC0887a : a.this.f4696g) {
                    a aVar2 = a.this;
                    Objects.requireNonNull(aVar2);
                    C1011d.m2810f(abstractBinderC0887a, "messageCallBack");
                    InterfaceC0890b interfaceC0890b = aVar2.f4693d;
                    if (interfaceC0890b == null || !interfaceC0890b.asBinder().pingBinder()) {
                        aVar2.f4696g.add(abstractBinderC0887a);
                        Application application = aVar2.f4694e;
                        if (application == null) {
                            C1011d.m2816l("mContext");
                            throw null;
                        }
                        aVar2.mo2580e(application);
                    } else {
                        new Thread(new RunnableC0885f(aVar2, abstractBinderC0887a)).start();
                    }
                }
                a aVar3 = a.this;
                Objects.requireNonNull(aVar3);
                C0880a.f4685e.f4688c = new C0886g(aVar3);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                C1011d.m2810f(componentName, "className");
                Log.d("MessageClient", "个人中心服务失去连接");
                try {
                    a.m2583h(a.this).unbindService(this);
                } catch (Exception unused) {
                }
                a.this.f4693d = null;
            }
        }

        /* renamed from: b.d.a.b.b$a$f */
        public static final class f implements Handler.Callback {
            public f() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                a aVar = a.this;
                aVar.m2584i(a.m2583h(aVar), false);
                return true;
            }
        }

        /* renamed from: b.d.a.b.b$a$g */
        public static final class g extends AbstractBinderC0888b {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC1006b f4715b;

            public g(InterfaceC1006b interfaceC1006b) {
                this.f4715b = interfaceC1006b;
            }
        }

        public a(String str, int i) {
            super(str, i, null);
            this.f4696g = new ArrayList();
            this.f4697h = new ArrayList();
            this.f4698i = new e();
            this.f4699j = new Handler(new f());
        }

        /* renamed from: g */
        public static final void m2582g(a aVar, C0891a c0891a, boolean z) {
            Application application;
            Objects.requireNonNull(aVar);
            EnumC0892b enumC0892b = c0891a.f4730b;
            if (enumC0892b == null) {
                enumC0892b = EnumC0892b.LOGOUT;
            }
            int iOrdinal = enumC0892b.ordinal();
            if (iOrdinal == 0) {
                Iterator<T> it = aVar.f4697h.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1005a) it.next()).mo2585a();
                }
                aVar.f4697h.clear();
                return;
            }
            if (iOrdinal == 1) {
                application = aVar.f4694e;
                if (application == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                application = aVar.f4694e;
                if (application == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
            }
            aVar.m2584i(application, z);
        }

        /* renamed from: h */
        public static final /* synthetic */ Application m2583h(a aVar) {
            Application application = aVar.f4694e;
            if (application != null) {
                return application;
            }
            C1011d.m2816l("mContext");
            throw null;
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: a */
        public void mo2576a(InterfaceC1006b<? super C0891a, C0994d> interfaceC1006b) {
            C1011d.m2810f(interfaceC1006b, "callBack");
            InterfaceC0890b interfaceC0890b = this.f4693d;
            if (interfaceC0890b != null && interfaceC0890b.asBinder().pingBinder()) {
                new Thread(new RunnableC1093a(interfaceC1006b)).start();
                return;
            }
            this.f4697h.add(new b(interfaceC1006b));
            Application application = this.f4694e;
            if (application != null) {
                mo2580e(application);
            } else {
                C1011d.m2816l("mContext");
                throw null;
            }
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: b */
        public void mo2577b(InterfaceC1006b<? super C0893c, C0994d> interfaceC1006b) {
            C1011d.m2810f(interfaceC1006b, "callBack");
            InterfaceC0890b interfaceC0890b = this.f4693d;
            if (interfaceC0890b != null && interfaceC0890b.asBinder().pingBinder()) {
                new Thread(new c(interfaceC1006b)).start();
                return;
            }
            this.f4697h.add(new d(interfaceC1006b));
            Application application = this.f4694e;
            if (application != null) {
                mo2580e(application);
            } else {
                C1011d.m2816l("mContext");
                throw null;
            }
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: c */
        public boolean mo2578c() throws PackageManager.NameNotFoundException {
            Application application = this.f4694e;
            if (application == null) {
                C1011d.m2816l("mContext");
                throw null;
            }
            try {
                application.getPackageManager().getPackageInfo("com.zykj.manage", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: d */
        public synchronized void mo2579d(InterfaceC1006b<? super C0891a, C0994d> interfaceC1006b) {
            int i;
            C1011d.m2810f(interfaceC1006b, "callBack");
            InterfaceC0890b interfaceC0890b = this.f4693d;
            if (interfaceC0890b == null || !interfaceC0890b.asBinder().pingBinder()) {
                Application application = this.f4694e;
                if (application == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                mo2580e(application);
                while (i < Integer.MAX_VALUE) {
                    Thread.sleep(100L);
                    InterfaceC0890b interfaceC0890b2 = this.f4693d;
                    i = ((interfaceC0890b2 != null ? interfaceC0890b2.mo2590d() : null) == null && i <= 40) ? i + 1 : 0;
                    InterfaceC0890b interfaceC0890b3 = this.f4693d;
                    ((MainActivity.C0989a.a) interfaceC1006b).mo2586c(interfaceC0890b3 != null ? interfaceC0890b3.mo2590d() : null);
                    return;
                }
            }
            InterfaceC0890b interfaceC0890b4 = this.f4693d;
            if (interfaceC0890b4 == null) {
                C1011d.m2815k();
                throw null;
            }
            interfaceC0890b4.mo2588b(new g(interfaceC1006b));
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: e */
        public void mo2580e(Application application) {
            Application application2;
            IBinder iBinderAsBinder;
            C1011d.m2810f(application, "context");
            this.f4694e = application;
            C0880a c0880a = C0880a.f4685e;
            if (application == null) {
                C1011d.m2816l("mContext");
                throw null;
            }
            if (!c0880a.f4687b) {
                c0880a.f4687b = true;
                application.registerActivityLifecycleCallbacks(c0880a.f4689d);
            }
            if (!mo2578c()) {
                Application application3 = this.f4694e;
                if (application3 == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                C1011d.m2810f(application3, "context");
                C0880a c0880a2 = C0880a.f4685e;
                C1011d.m2806b(c0880a2, "ActivityCollectionHelper.with()");
                if (c0880a2.m2574c() != null) {
                    C0880a c0880a3 = C0880a.f4685e;
                    C1011d.m2806b(c0880a3, "ActivityCollectionHelper.with()");
                    if (C1011d.m2805a(c0880a3.m2574c().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                        return;
                    }
                }
                C0880a.f4685e.m2573b();
                Intent intent = new Intent(application3, (Class<?>) UnInstallActivity.class);
                intent.putExtra("hidden", false);
                intent.addFlags(268435456);
                intent.addFlags(67108864);
                application3.startActivity(intent);
                Log.d("MessageClient", "去启动安装界面");
                return;
            }
            InterfaceC0890b interfaceC0890b = this.f4693d;
            if (interfaceC0890b != null) {
                if (interfaceC0890b != null && (iBinderAsBinder = interfaceC0890b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application4 = this.f4694e;
                        if (application4 == null) {
                            C1011d.m2816l("mContext");
                            throw null;
                        }
                        application4.unbindService(this.f4698i);
                    } catch (Exception unused) {
                    }
                }
                this.f4693d = null;
            }
            if (this.f4693d == null) {
                try {
                    application2 = this.f4694e;
                } catch (Exception unused2) {
                }
                if (application2 == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                application2.unbindService(this.f4698i);
                Intent intent2 = new Intent("com.zykj.action.zykj.message.service");
                intent2.setPackage("com.zykj.manage");
                StringBuilder sbM2079g = C0561a.m2079g("开始连接服务->");
                sbM2079g.append(System.currentTimeMillis());
                Log.d("MessageClient", sbM2079g.toString());
                Application application5 = this.f4694e;
                if (application5 == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                if (application5.bindService(intent2, this.f4698i, 1)) {
                    StringBuilder sbM2079g2 = C0561a.m2079g("绑定个人中心服务成功 result= true : ");
                    sbM2079g2.append(System.currentTimeMillis());
                    Log.d("MessageClient", sbM2079g2.toString());
                    return;
                }
                StringBuilder sbM2079g3 = C0561a.m2079g("绑定个人中心服务失败,准备重新启动该任务 ");
                sbM2079g3.append(System.currentTimeMillis());
                Log.e("MessageClient", sbM2079g3.toString());
                Intent intent3 = new Intent();
                intent3.setAction("com.zykj.action.zykj.message.service.awaken");
                intent3.setFlags(268435456);
                Application application6 = this.f4694e;
                if (application6 == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                application6.startActivity(intent3);
                Timer timer = new Timer();
                this.f4695f = timer;
                timer.schedule(new C0884e(this), 1000L);
            }
        }

        @Override // p070b.p146d.p147a.p148b.EnumC0881b
        /* renamed from: f */
        public void mo2581f() {
            IBinder iBinderAsBinder;
            InterfaceC0890b interfaceC0890b = this.f4693d;
            if (interfaceC0890b != null && interfaceC0890b != null && (iBinderAsBinder = interfaceC0890b.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.f4694e;
                if (application == null) {
                    C1011d.m2816l("mContext");
                    throw null;
                }
                application.unbindService(this.f4698i);
            }
            C0880a c0880a = C0880a.f4685e;
            Application application2 = this.f4694e;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(c0880a.f4689d);
            } else {
                C1011d.m2816l("mContext");
                throw null;
            }
        }

        /* renamed from: i */
        public void m2584i(Context context, boolean z) {
            C1011d.m2810f(context, "context");
            C0880a c0880a = C0880a.f4685e;
            C1011d.m2806b(c0880a, "ActivityCollectionHelper.with()");
            if (c0880a.m2574c() != null) {
                C0880a c0880a2 = C0880a.f4685e;
                C1011d.m2806b(c0880a2, "ActivityCollectionHelper.with()");
                if (C1011d.m2805a(c0880a2.m2574c().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C0880a.f4685e.m2573b();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", z);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动登录界面");
        }
    }

    static {
        a aVar = new a("INSTANCES", 0);
        f4691b = aVar;
        f4692c = new EnumC0881b[]{aVar};
    }

    public EnumC0881b(String str, int i, C1010c c1010c) {
    }

    public static EnumC0881b valueOf(String str) {
        return (EnumC0881b) Enum.valueOf(EnumC0881b.class, str);
    }

    public static EnumC0881b[] values() {
        return (EnumC0881b[]) f4692c.clone();
    }

    /* renamed from: a */
    public abstract void mo2576a(InterfaceC1006b<? super C0891a, C0994d> interfaceC1006b);

    /* renamed from: b */
    public abstract void mo2577b(InterfaceC1006b<? super C0893c, C0994d> interfaceC1006b);

    /* renamed from: c */
    public abstract boolean mo2578c();

    /* renamed from: d */
    public abstract void mo2579d(InterfaceC1006b<? super C0891a, C0994d> interfaceC1006b);

    /* renamed from: e */
    public abstract void mo2580e(Application application);

    /* renamed from: f */
    public abstract void mo2581f();
}
