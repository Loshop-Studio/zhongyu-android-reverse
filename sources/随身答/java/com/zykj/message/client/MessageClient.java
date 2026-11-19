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
import androidx.exifinterface.media.ExifInterface;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p035c6.AbstractC5233b;
import p035c6.C5232a;
import p085d6.AbstractBinderC7754a;
import p085d6.AbstractBinderC7756c;
import p085d6.BinderC7755b;
import p096e6.InterfaceC7852b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0011\u0010\u000eJ;\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00060\n2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018j\u0002\b\u0010¨\u0006\u0019"}, m13413d2 = {"Lcom/zykj/message/client/MessageClient;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/Application;", "context", "", "g", "(Landroid/app/Application;)V", "t", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "c", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/zykj/message/server/bean/ServerInfo;", "a", "n", "serverCallBack", "userCallBack", "q", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "k", "()Z", "messageclient_release"}, m13414k = 1, m13415mv = {1, 4, 0})
/* loaded from: classes4.dex */
public abstract class MessageClient {

    /* renamed from: a */
    public static final MessageClient f10078a;

    /* renamed from: b */
    public static final /* synthetic */ MessageClient[] f10079b;

    @Metadata(m13412d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001;\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J#\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0017\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010\"\u001a\u00020\u00022\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u00112\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00106R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000208058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, m13413d2 = {"Lcom/zykj/message/client/MessageClient$INSTANCES;", "Lcom/zykj/message/client/MessageClient;", "", "I", "()V", "G", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "hidden", "C", "(Lcom/zykj/message/server/bean/ServerInfo;Z)V", "Landroid/app/Application;", "context", "g", "(Landroid/app/Application;)V", "t", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "c", "(Lkotlin/jvm/functions/Function1;)V", "a", "n", "Landroid/content/Context;", ExifInterface.LONGITUDE_EAST, "(Landroid/content/Context;Z)V", "F", "Ld6/a;", "messageCallBack", "H", "(Ld6/a;)V", "serverCallBack", "userCallBack", "q", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "k", "()Z", "Le6/b;", "d", "Le6/b;", "D", "()Le6/b;", "J", "(Le6/b;)V", "remoteServer", "e", "Landroid/app/Application;", "mContext", "Ljava/util/Timer;", "f", "Ljava/util/Timer;", "timeOut", "", "Ljava/util/List;", "listenerList", "Lkotlin/Function0;", "h", "doTask", "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1", "i", "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;", "mConnection", "Landroid/os/Handler;", "j", "Landroid/os/Handler;", "mHandler", "messageclient_release"}, m13414k = 1, m13415mv = {1, 4, 0})
    public static final class INSTANCES extends MessageClient {

        /* renamed from: d, reason: from kotlin metadata */
        public InterfaceC7852b remoteServer;

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
        public static final class RunnableC7226a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10089b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ ServerInfo f10091b;

                public a(ServerInfo serverInfo) {
                    this.f10091b = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1 function1 = RunnableC7226a.this.f10089b;
                    ServerInfo serverInfo = this.f10091b;
                    if (serverInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    function1.invoke(serverInfo);
                }
            }

            public RunnableC7226a(Function1 function1) {
                this.f10089b = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7852b remoteServer = INSTANCES.this.getRemoteServer();
                INSTANCES.this.mHandler.post(new a(remoteServer != null ? remoteServer.mo12327e() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b */
        public static final class RunnableC7227b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10093b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ UserInfo f10095b;

                public a(UserInfo userInfo) {
                    this.f10095b = userInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1 function1 = RunnableC7227b.this.f10093b;
                    UserInfo userInfo = this.f10095b;
                    if (userInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    function1.invoke(userInfo);
                }
            }

            public RunnableC7227b(Function1 function1) {
                this.f10093b = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7852b remoteServer = INSTANCES.this.getRemoteServer();
                INSTANCES.this.mHandler.post(new a(remoteServer != null ? remoteServer.mo12326c() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$c */
        public static final class C7228c implements Handler.Callback {
            public C7228c() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                INSTANCES instances = INSTANCES.this;
                instances.m9851F(INSTANCES.m9845x(instances), false);
                return true;
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$d */
        public static final class C7229d extends TimerTask {
            public C7229d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (INSTANCES.m9845x(INSTANCES.this).bindService(intent, INSTANCES.this.mConnection, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                INSTANCES.this.mHandler.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$e */
        public static final class BinderC7230e extends AbstractBinderC7756c {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10098b;

            public BinderC7230e(Function1 function1) {
                this.f10098b = function1;
            }

            @Override // p096e6.InterfaceC7851a
            /* renamed from: d */
            public void mo9856d(ServerInfo serverInfo) {
                this.f10098b.invoke(serverInfo);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$f */
        public static final class RunnableC7231f implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractBinderC7754a f10100b;

            public RunnableC7231f(AbstractBinderC7754a abstractBinderC7754a) {
                this.f10100b = abstractBinderC7754a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7852b remoteServer = INSTANCES.this.getRemoteServer();
                if (remoteServer != null) {
                    remoteServer.mo12325a(this.f10100b);
                }
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$g */
        public static final class RunnableC7232g implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10102b;

            /* renamed from: c */
            public final /* synthetic */ Function1 f10103c;

            public RunnableC7232g(Function1 function1, Function1 function12) {
                this.f10102b = function1;
                this.f10103c = function12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC7852b remoteServer = INSTANCES.this.getRemoteServer();
                if (remoteServer != null) {
                    remoteServer.mo12325a(new BinderC7755b(this.f10102b, this.f10103c));
                }
            }
        }

        public INSTANCES(String str, int i9) {
            super(str, i9, null);
            this.listenerList = new ArrayList();
            this.doTask = new ArrayList();
            this.mConnection = new MessageClient$INSTANCES$mConnection$1(this);
            this.mHandler = new Handler(new C7228c());
        }

        /* renamed from: x */
        public static final /* synthetic */ Application m9845x(INSTANCES instances) {
            Application application = instances.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            return application;
        }

        /* renamed from: C */
        public final void m9848C(ServerInfo serverInfo, boolean hidden) {
            Status statusM9860b;
            if (serverInfo == null || (statusM9860b = serverInfo.m9860b()) == null) {
                statusM9860b = Status.LOGOUT;
            }
            int i9 = AbstractC5233b.f2472a[statusM9860b.ordinal()];
            if (i9 == 1) {
                Iterator it = this.doTask.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.doTask.clear();
                return;
            }
            if (i9 == 2) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m9851F(application, hidden);
                return;
            }
            if (i9 != 3) {
                return;
            }
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            m9851F(application2, hidden);
        }

        /* renamed from: D, reason: from getter */
        public final InterfaceC7852b getRemoteServer() {
            return this.remoteServer;
        }

        /* renamed from: E */
        public void m9850E(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C5232a c5232aM2394h = C5232a.m2394h();
            Intrinsics.checkExpressionValueIsNotNull(c5232aM2394h, "ActivityCollectionHelper.with()");
            if (c5232aM2394h.m2397e() != null) {
                C5232a c5232aM2394h2 = C5232a.m2394h();
                Intrinsics.checkExpressionValueIsNotNull(c5232aM2394h2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c5232aM2394h2.m2397e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C5232a.m2394h().m2396d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: F */
        public void m9851F(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C5232a c5232aM2394h = C5232a.m2394h();
            Intrinsics.checkExpressionValueIsNotNull(c5232aM2394h, "ActivityCollectionHelper.with()");
            if (c5232aM2394h.m2397e() != null) {
                C5232a c5232aM2394h2 = C5232a.m2394h();
                Intrinsics.checkExpressionValueIsNotNull(c5232aM2394h2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c5232aM2394h2.m2397e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C5232a.m2394h().m2396d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: G */
        public final void m9852G() {
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
            timer.schedule(new C7229d(), 1000L);
        }

        /* renamed from: H */
        public void m9853H(AbstractBinderC7754a messageCallBack) {
            Intrinsics.checkParameterIsNotNull(messageCallBack, "messageCallBack");
            InterfaceC7852b interfaceC7852b = this.remoteServer;
            if (interfaceC7852b != null) {
                if (interfaceC7852b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC7852b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7231f(messageCallBack)).start();
                    return;
                }
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo9839t(application);
        }

        /* renamed from: I */
        public final void m9854I() {
            C5232a.m2394h().m2399g(new C5232a.b() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // p035c6.C5232a.b
                public final void onResume() {
                    this.f10116a.mo9833a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
                        {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m9858a(ServerInfo it) {
                            Intrinsics.checkParameterIsNotNull(it, "it");
                            MessageClient$INSTANCES$registerResumeListener$1.this.f10116a.m9848C(it, false);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                            m9858a(serverInfo);
                            return Unit.INSTANCE;
                        }
                    });
                }
            });
        }

        /* renamed from: J */
        public final void m9855J(InterfaceC7852b interfaceC7852b) {
            this.remoteServer = interfaceC7852b;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: a */
        public void mo9833a(Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC7852b interfaceC7852b = this.remoteServer;
            if (interfaceC7852b != null) {
                if (interfaceC7852b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC7852b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7226a(callBack)).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo9839t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: c */
        public void mo9834c(Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC7852b interfaceC7852b = this.remoteServer;
            if (interfaceC7852b != null) {
                if (interfaceC7852b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC7852b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7227b(callBack)).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo9839t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: g */
        public void mo9835g(Application context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            C5232a c5232aM2394h = C5232a.m2394h();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c5232aM2394h.m2398f(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: k */
        public boolean mo9836k() throws PackageManager.NameNotFoundException {
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

        /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0001, B:6:0x000c, B:9:0x0012, B:11:0x001c, B:13:0x0020, B:14:0x0023, B:15:0x002c, B:17:0x0030, B:18:0x0035, B:21:0x003e, B:23:0x0048, B:29:0x0055, B:30:0x0058, B:32:0x005c, B:33:0x0060), top: B:40:0x0001 }] */
        @Override // com.zykj.message.client.MessageClient
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo9837n(kotlin.jvm.functions.Function1 r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)     // Catch: java.lang.Throwable -> L10
                e6.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                if (r0 != 0) goto L12
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L10
                goto L12
            L10:
                r4 = move-exception
                goto L67
            L12:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L10
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                e6.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L23
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L10
            L23:
                com.zykj.message.client.MessageClient$INSTANCES$e r1 = new com.zykj.message.client.MessageClient$INSTANCES$e     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
                r0.mo12328f(r1)     // Catch: java.lang.Throwable -> L10
                goto L65
            L2c:
                android.app.Application r0 = r3.mContext     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L35
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L10
            L35:
                r3.mo9839t(r0)     // Catch: java.lang.Throwable -> L10
                r0 = 0
            L39:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L65
                r1 = 100
                java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L10
                e6.b r1 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                r2 = 0
                if (r1 == 0) goto L4d
                com.zykj.message.server.bean.ServerInfo r1 = r1.mo12327e()     // Catch: java.lang.Throwable -> L10
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
                e6.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L60
                com.zykj.message.server.bean.ServerInfo r2 = r0.mo12327e()     // Catch: java.lang.Throwable -> L10
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
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.mo9837n(kotlin.jvm.functions.Function1):void"); // DEX body: android/随身答/smali_classes4/com/zykj/message/client/MessageClient$INSTANCES.smali:1406
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: q */
        public void mo9838q(Function1 serverCallBack, Function1 userCallBack) {
            Intrinsics.checkParameterIsNotNull(serverCallBack, "serverCallBack");
            Intrinsics.checkParameterIsNotNull(userCallBack, "userCallBack");
            InterfaceC7852b interfaceC7852b = this.remoteServer;
            if (interfaceC7852b != null) {
                if (interfaceC7852b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC7852b.asBinder().pingBinder()) {
                    new Thread(new RunnableC7232g(serverCallBack, userCallBack)).start();
                    return;
                }
            }
            this.listenerList.add(new BinderC7755b(serverCallBack, userCallBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo9839t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: t */
        public void mo9839t(Application context) {
            IBinder iBinderAsBinder;
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            C5232a c5232aM2394h = C5232a.m2394h();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c5232aM2394h.m2398f(application);
            if (!mo9836k()) {
                Application application2 = this.mContext;
                if (application2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m9850E(application2, false);
                return;
            }
            InterfaceC7852b interfaceC7852b = this.remoteServer;
            if (interfaceC7852b != null) {
                if (interfaceC7852b != null && (iBinderAsBinder = interfaceC7852b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
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
                System.currentTimeMillis();
                Application application5 = this.mContext;
                if (application5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                if (application5.bindService(intent, this.mConnection, 1)) {
                    System.currentTimeMillis();
                    return;
                }
                Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                m9852G();
            }
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f10078a = instances;
        f10079b = new MessageClient[]{instances};
        INSTANCE = new Companion(null);
    }

    public MessageClient(String str, int i9) {
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f10079b.clone();
    }

    /* renamed from: a */
    public abstract void mo9833a(Function1 callBack);

    /* renamed from: c */
    public abstract void mo9834c(Function1 callBack);

    /* renamed from: g */
    public abstract void mo9835g(Application context);

    /* renamed from: k */
    public abstract boolean mo9836k();

    /* renamed from: n */
    public abstract void mo9837n(Function1 callBack);

    /* renamed from: q */
    public abstract void mo9838q(Function1 serverCallBack, Function1 userCallBack);

    /* renamed from: t */
    public abstract void mo9839t(Application context);

    public /* synthetic */ MessageClient(String str, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i9);
    }
}
