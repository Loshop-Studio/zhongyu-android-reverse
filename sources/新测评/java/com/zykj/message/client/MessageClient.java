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
import p158l7.AbstractC8515b;
import p158l7.C8514a;
import p169m7.AbstractBinderC8566a;
import p169m7.AbstractBinderC8568c;
import p169m7.BinderC8567b;
import p180n7.InterfaceC8669b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0016\u0010\u000eJ%\u0010\u0017\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001aj\u0002\b\u0014¨\u0006\u001d"}, m13558d2 = {"Lcom/zykj/message/client/MessageClient;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/Application;", "context", "", "m", "(Landroid/app/Application;)V", "t", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "k", "(Lkotlin/jvm/functions/Function1;)V", "j", "()Lcom/zykj/message/server/bean/UserInfo;", "Lcom/zykj/message/server/bean/ServerInfo;", "f", "", "a", "()Ljava/lang/String;", "r", "s", "", "q", "()Z", "o", "c", "messageclient_release"}, m13559k = 1, m13560mv = {1, 4, 0})
/* loaded from: classes.dex */
public abstract class MessageClient {

    /* renamed from: a */
    public static final MessageClient f10635a;

    /* renamed from: b */
    public static final /* synthetic */ MessageClient[] f10636b;

    @Metadata(m13557d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001>\bÆ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J#\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00022\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020!078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020;078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010C¨\u0006E"}, m13558d2 = {"Lcom/zykj/message/client/MessageClient$INSTANCES;", "Lcom/zykj/message/client/MessageClient;", "", "I", "()V", "G", "Lcom/zykj/message/server/bean/ServerInfo;", "serverInfo", "", "hidden", "C", "(Lcom/zykj/message/server/bean/ServerInfo;Z)V", "Landroid/app/Application;", "context", "m", "(Landroid/app/Application;)V", "t", "Lkotlin/Function1;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "k", "(Lkotlin/jvm/functions/Function1;)V", "j", "()Lcom/zykj/message/server/bean/UserInfo;", "f", "", "a", "()Ljava/lang/String;", "r", "Landroid/content/Context;", ExifInterface.LONGITUDE_EAST, "(Landroid/content/Context;Z)V", "F", "Lm7/a;", "messageCallBack", "H", "(Lm7/a;)V", "s", "q", "()Z", "o", "Ln7/b;", "d", "Ln7/b;", "D", "()Ln7/b;", "J", "(Ln7/b;)V", "remoteServer", "e", "Landroid/app/Application;", "mContext", "Ljava/util/Timer;", "Ljava/util/Timer;", "timeOut", "", "g", "Ljava/util/List;", "listenerList", "Lkotlin/Function0;", "h", "doTask", "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1", "i", "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;", "mConnection", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "messageclient_release"}, m13559k = 1, m13560mv = {1, 4, 0})
    public static final class INSTANCES extends MessageClient {

        /* renamed from: d, reason: from kotlin metadata */
        public InterfaceC8669b remoteServer;

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
        public static final class RunnableC6990a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10646b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$a$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ ServerInfo f10648b;

                public a(ServerInfo serverInfo) {
                    this.f10648b = serverInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1 function1 = RunnableC6990a.this.f10646b;
                    ServerInfo serverInfo = this.f10648b;
                    if (serverInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    function1.invoke(serverInfo);
                }
            }

            public RunnableC6990a(Function1 function1) {
                this.f10646b = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8669b remoteServer = INSTANCES.this.getRemoteServer();
                INSTANCES.this.mHandler.post(new a(remoteServer != null ? remoteServer.mo14272f() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b */
        public static final class RunnableC6991b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10650b;

            /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$b$a */
            public static final class a implements Runnable {

                /* renamed from: b */
                public final /* synthetic */ UserInfo f10652b;

                public a(UserInfo userInfo) {
                    this.f10652b = userInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Function1 function1 = RunnableC6991b.this.f10650b;
                    UserInfo userInfo = this.f10652b;
                    if (userInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    function1.invoke(userInfo);
                }
            }

            public RunnableC6991b(Function1 function1) {
                this.f10650b = function1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8669b remoteServer = INSTANCES.this.getRemoteServer();
                INSTANCES.this.mHandler.post(new a(remoteServer != null ? remoteServer.mo14269b() : null));
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$c */
        public static final class C6992c implements Handler.Callback {
            public C6992c() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 2) {
                    return true;
                }
                INSTANCES instances = INSTANCES.this;
                instances.m10585F(INSTANCES.m10579x(instances), false);
                return true;
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$d */
        public static final class C6993d extends TimerTask {
            public C6993d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                Intent intent = new Intent("com.zykj.action.zykj.message.service");
                intent.setPackage("com.zykj.manage");
                if (INSTANCES.m10579x(INSTANCES.this).bindService(intent, INSTANCES.this.mConnection, 1)) {
                    return;
                }
                Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                INSTANCES.this.mHandler.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$e */
        public static final class BinderC6994e extends AbstractBinderC8568c {

            /* renamed from: b */
            public final /* synthetic */ Function1 f10655b;

            public BinderC6994e(Function1 function1) {
                this.f10655b = function1;
            }

            @Override // p180n7.InterfaceC8668a
            /* renamed from: e */
            public void mo10590e(ServerInfo serverInfo) {
                this.f10655b.invoke(serverInfo);
            }
        }

        /* renamed from: com.zykj.message.client.MessageClient$INSTANCES$f */
        public static final class RunnableC6995f implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AbstractBinderC8566a f10657b;

            public RunnableC6995f(AbstractBinderC8566a abstractBinderC8566a) {
                this.f10657b = abstractBinderC8566a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC8669b remoteServer = INSTANCES.this.getRemoteServer();
                if (remoteServer != null) {
                    remoteServer.mo14270c(this.f10657b);
                }
            }
        }

        public INSTANCES(String str, int i10) {
            super(str, i10, null);
            this.listenerList = new ArrayList();
            this.doTask = new ArrayList();
            this.mConnection = new MessageClient$INSTANCES$mConnection$1(this);
            this.mHandler = new Handler(new C6992c());
        }

        /* renamed from: x */
        public static final /* synthetic */ Application m10579x(INSTANCES instances) {
            Application application = instances.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            return application;
        }

        /* renamed from: C */
        public final void m10582C(ServerInfo serverInfo, boolean hidden) {
            Status statusM10596b;
            if (serverInfo == null || (statusM10596b = serverInfo.m10596b()) == null) {
                statusM10596b = Status.LOGOUT;
            }
            int i10 = AbstractC8515b.f14128a[statusM10596b.ordinal()];
            if (i10 == 1) {
                Iterator it = this.doTask.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.doTask.clear();
                return;
            }
            if (i10 == 2) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m10585F(application, hidden);
                return;
            }
            if (i10 != 3) {
                return;
            }
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            m10585F(application2, hidden);
        }

        /* renamed from: D, reason: from getter */
        public final InterfaceC8669b getRemoteServer() {
            return this.remoteServer;
        }

        /* renamed from: E */
        public void m10584E(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C8514a c8514aM13989h = C8514a.m13989h();
            Intrinsics.checkExpressionValueIsNotNull(c8514aM13989h, "ActivityCollectionHelper.with()");
            if (c8514aM13989h.m13992e() != null) {
                C8514a c8514aM13989h2 = C8514a.m13989h();
                Intrinsics.checkExpressionValueIsNotNull(c8514aM13989h2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c8514aM13989h2.m13992e().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C8514a.m13989h().m13991d();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: F */
        public void m10585F(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C8514a c8514aM13989h = C8514a.m13989h();
            Intrinsics.checkExpressionValueIsNotNull(c8514aM13989h, "ActivityCollectionHelper.with()");
            if (c8514aM13989h.m13992e() != null) {
                C8514a c8514aM13989h2 = C8514a.m13989h();
                Intrinsics.checkExpressionValueIsNotNull(c8514aM13989h2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(c8514aM13989h2.m13992e().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            C8514a.m13989h().m13991d();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra("hidden", hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
        }

        /* renamed from: G */
        public final void m10586G() {
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
            timer.schedule(new C6993d(), 1000L);
        }

        /* renamed from: H */
        public void m10587H(AbstractBinderC8566a messageCallBack) {
            Intrinsics.checkParameterIsNotNull(messageCallBack, "messageCallBack");
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                if (interfaceC8669b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b.asBinder().pingBinder()) {
                    new Thread(new RunnableC6995f(messageCallBack)).start();
                    return;
                }
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo10573t(application);
        }

        /* renamed from: I */
        public final void m10588I() {
            C8514a.m13989h().m13994g(new C8514a.b() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // p158l7.C8514a.b
                public final void onResume() {
                    this.f10670a.mo10565f(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
                        {
                            super(1);
                        }

                        /* renamed from: a */
                        public final void m10592a(ServerInfo it) {
                            Intrinsics.checkParameterIsNotNull(it, "it");
                            MessageClient$INSTANCES$registerResumeListener$1.this.f10670a.m10582C(it, false);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                            m10592a(serverInfo);
                            return Unit.INSTANCE;
                        }
                    });
                }
            });
        }

        /* renamed from: J */
        public final void m10589J(InterfaceC8669b interfaceC8669b) {
            this.remoteServer = interfaceC8669b;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: a */
        public String mo10564a() {
            InterfaceC8669b interfaceC8669b;
            InterfaceC8669b interfaceC8669b2 = this.remoteServer;
            if (interfaceC8669b2 != null) {
                if (interfaceC8669b2 == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b2.asBinder().pingBinder() && (interfaceC8669b = this.remoteServer) != null) {
                    return interfaceC8669b.mo14273g();
                }
            }
            return null;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: f */
        public void mo10565f(Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                if (interfaceC8669b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b.asBinder().pingBinder()) {
                    new Thread(new RunnableC6990a(callBack)).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo10573t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: j */
        public UserInfo mo10566j() {
            InterfaceC8669b interfaceC8669b;
            InterfaceC8669b interfaceC8669b2 = this.remoteServer;
            if (interfaceC8669b2 != null) {
                if (interfaceC8669b2 == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b2.asBinder().pingBinder() && (interfaceC8669b = this.remoteServer) != null) {
                    return interfaceC8669b.mo14269b();
                }
            }
            return null;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: k */
        public void mo10567k(Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                if (interfaceC8669b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b.asBinder().pingBinder()) {
                    new Thread(new RunnableC6991b(callBack)).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo10573t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: m */
        public void mo10568m(Application context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            C8514a c8514aM13989h = C8514a.m13989h();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c8514aM13989h.m13993f(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: o */
        public boolean mo10569o() {
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                return interfaceC8669b.asBinder().pingBinder();
            }
            return false;
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: q */
        public boolean mo10570q() throws PackageManager.NameNotFoundException {
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

        /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0001, B:6:0x000c, B:9:0x0012, B:11:0x001c, B:13:0x0020, B:14:0x0023, B:15:0x002c, B:17:0x0030, B:18:0x0036, B:21:0x003f, B:23:0x0049, B:29:0x0056, B:30:0x0059, B:32:0x005d, B:33:0x0061), top: B:40:0x0001 }] */
        @Override // com.zykj.message.client.MessageClient
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void mo10571r(kotlin.jvm.functions.Function1 r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)     // Catch: java.lang.Throwable -> L10
                n7.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                if (r0 != 0) goto L12
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L10
                goto L12
            L10:
                r4 = move-exception
                goto L68
            L12:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L10
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L2c
                n7.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L23
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L10
            L23:
                com.zykj.message.client.MessageClient$INSTANCES$e r1 = new com.zykj.message.client.MessageClient$INSTANCES$e     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
                r0.mo14271d(r1)     // Catch: java.lang.Throwable -> L10
                goto L66
            L2c:
                android.app.Application r0 = r3.mContext     // Catch: java.lang.Throwable -> L10
                if (r0 != 0) goto L36
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L10
            L36:
                r3.mo10573t(r0)     // Catch: java.lang.Throwable -> L10
                r0 = 0
            L3a:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 >= r1) goto L66
                r1 = 100
                java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L10
                n7.b r1 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                r2 = 0
                if (r1 == 0) goto L4e
                com.zykj.message.server.bean.ServerInfo r1 = r1.mo14272f()     // Catch: java.lang.Throwable -> L10
                goto L4f
            L4e:
                r1 = r2
            L4f:
                if (r1 != 0) goto L59
                r1 = 40
                if (r0 <= r1) goto L56
                goto L59
            L56:
                int r0 = r0 + 1
                goto L3a
            L59:
                n7.b r0 = r3.remoteServer     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto L61
                com.zykj.message.server.bean.ServerInfo r2 = r0.mo14272f()     // Catch: java.lang.Throwable -> L10
            L61:
                r4.invoke(r2)     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)
                return
            L66:
                monitor-exit(r3)
                return
            L68:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.mo10571r(kotlin.jvm.functions.Function1):void"); // DEX body: android/新测评/smali/com/zykj/message/client/MessageClient$INSTANCES.smali:1593
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: s */
        public void mo10572s(final Function1 callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                if (interfaceC8669b == null) {
                    Intrinsics.throwNpe();
                }
                if (interfaceC8669b.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC8669b remoteServer = this.f10672a.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.mo14270c(new BinderC8567b(callBack, new Function1<UserInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$1.1
                                    /* renamed from: a */
                                    public final void m10593a(UserInfo userInfo) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
                                        m10593a(userInfo);
                                        return Unit.INSTANCE;
                                    }
                                }));
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(new BinderC8567b(callBack, new Function1<UserInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$2
                /* renamed from: a */
                public final void m10594a(UserInfo userInfo) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
                    m10594a(userInfo);
                    return Unit.INSTANCE;
                }
            }));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            mo10573t(application);
        }

        @Override // com.zykj.message.client.MessageClient
        /* renamed from: t */
        public void mo10573t(Application context) {
            IBinder iBinderAsBinder;
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            C8514a c8514aM13989h = C8514a.m13989h();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            c8514aM13989h.m13993f(application);
            if (!mo10570q()) {
                Application application2 = this.mContext;
                if (application2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                m10584E(application2, false);
                return;
            }
            InterfaceC8669b interfaceC8669b = this.remoteServer;
            if (interfaceC8669b != null) {
                if (interfaceC8669b != null && (iBinderAsBinder = interfaceC8669b.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
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
                m10586G();
            }
        }
    }

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        f10635a = instances;
        f10636b = new MessageClient[]{instances};
        INSTANCE = new Companion(null);
    }

    public MessageClient(String str, int i10) {
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f10636b.clone();
    }

    /* renamed from: a */
    public abstract String mo10564a();

    /* renamed from: f */
    public abstract void mo10565f(Function1 callBack);

    /* renamed from: j */
    public abstract UserInfo mo10566j();

    /* renamed from: k */
    public abstract void mo10567k(Function1 callBack);

    /* renamed from: m */
    public abstract void mo10568m(Application context);

    /* renamed from: o */
    public abstract boolean mo10569o();

    /* renamed from: q */
    public abstract boolean mo10570q();

    /* renamed from: r */
    public abstract void mo10571r(Function1 callBack);

    /* renamed from: s */
    public abstract void mo10572s(Function1 callBack);

    /* renamed from: t */
    public abstract void mo10573t(Application context);

    public /* synthetic */ MessageClient(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }
}
