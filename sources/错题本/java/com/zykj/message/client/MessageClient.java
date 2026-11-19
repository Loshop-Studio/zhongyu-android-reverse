package com.zykj.message.client;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Parcel;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028c4.AbstractBinderC3223a;
import p028c4.BinderC3224b;
import p043d4.C5420b;
import p043d4.InterfaceC5422d;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\r\u0010\u0010J\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\nH&¢\u0006\u0004\b\u0013\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0016\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0018\u0010\u0010J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J;\u0010 \u001a\u00020\u00042\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b \u0010$J%\u0010%\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b%\u0010\u0010J%\u0010&\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b'\u0010!J!\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020)H&¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020)H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020)H&¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u0004H&¢\u0006\u0004\b1\u0010\tj\u0002\b4¨\u00065"}, m5110d2 = {"Lcom/zykj/message/client/MessageClient;", "", "Landroid/app/Application;", "context", "Ld6/s;", "init", "(Landroid/app/Application;)V", "startService", "stopService", "()V", "Lcom/zykj/message/client/c;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "getUserInfo", "(Lcom/zykj/message/client/c;)V", "Lkotlin/Function1;", "(Lr6/c;)V", "()Lcom/zykj/message/server/bean/UserInfo;", "Lcom/zykj/message/server/bean/ServerInfo;", "getServerInfo", "()Lcom/zykj/message/server/bean/ServerInfo;", "", "getSNInfo", "()Ljava/lang/String;", "refreshToken", "url", "appName", "appPackageName", "checkUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lc4/a;", "messageCallBack", "registerListener", "(Lc4/a;)V", "serverCallBack", "userCallBack", "(Lr6/c;Lr6/c;)V", "registerServerListener", "registerUserListener", "unRegisterListener", "Landroid/content/Context;", "", MessageClient.INTENT_KEY, "goUnInstallActivity", "(Landroid/content/Context;Z)V", "goUnLoginActivity", "isInstallApp", "()Z", "isInit", "requestLogout", "Companion", "com/zykj/message/client/d", "INSTANCES", "messageclient_release"}, m5111k = 1, m5112mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class MessageClient {
    public static final C4427d Companion;
    public static final MessageClient INSTANCES;

    @NotNull
    public static final String INTENT_KEY = "hidden";

    @NotNull
    public static final String LOGOUT_ACTION_NAME = "com.zykj.action.zykj.LOGOUT";
    public static final int RESTART_SERVER_FAIL = 2;
    public static final int SERVER_REQUEST_CODE = 200;

    /* renamed from: a */
    public static final /* synthetic */ MessageClient[] f5673a;

    @NotNull
    public static final String serverAction = "com.zykj.action.zykj.message.service";

    @NotNull
    public static final String serverAwakenAction = "com.zykj.action.zykj.message.service.awaken";

    @NotNull
    public static final String serverLoginAction = "com.zykj.action.zykj.LOGIN";

    @NotNull
    public static final String serverPackageName = "com.zykj.manage";

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        INSTANCES = instances;
        f5673a = new MessageClient[]{instances};
        Companion = new C4427d();
    }

    public MessageClient(String str, int i, AbstractC5824e abstractC5824e) {
    }

    public static /* synthetic */ void goUnInstallActivity$default(MessageClient messageClient, Context context, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        messageClient.goUnInstallActivity(context, z8);
    }

    public static /* synthetic */ void goUnLoginActivity$default(MessageClient messageClient, Context context, boolean z8, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        messageClient.goUnLoginActivity(context, z8);
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) f5673a.clone();
    }

    public abstract void checkUrl(@NotNull String url, @NotNull String appName, @NotNull String appPackageName);

    @Nullable
    public abstract String getSNInfo();

    public abstract void getSNInfo(@NotNull InterfaceC6471c callBack);

    @Nullable
    public abstract ServerInfo getServerInfo();

    public abstract void getServerInfo(@NotNull InterfaceC4425c callBack);

    public abstract void getServerInfo(@NotNull InterfaceC6471c callBack);

    @Nullable
    public abstract UserInfo getUserInfo();

    public abstract void getUserInfo(@NotNull InterfaceC4425c callBack);

    public abstract void getUserInfo(@NotNull InterfaceC6471c callBack);

    public abstract void goUnInstallActivity(@NotNull Context context, boolean hidden);

    public abstract void goUnLoginActivity(@NotNull Context context, boolean hidden);

    public abstract void init(@NotNull Application context);

    public abstract boolean isInit();

    public abstract boolean isInstallApp();

    public abstract void refreshToken(@NotNull InterfaceC6471c callBack);

    public abstract void registerListener(@NotNull AbstractBinderC3223a messageCallBack);

    public abstract void registerListener(@NotNull InterfaceC6471c serverCallBack, @NotNull InterfaceC6471c userCallBack);

    public abstract void registerServerListener(@NotNull InterfaceC6471c callBack);

    public abstract void registerUserListener(@NotNull InterfaceC6471c callBack);

    public abstract void requestLogout();

    public abstract void startService(@NotNull Application context);

    public abstract void stopService();

    public abstract void unRegisterListener(@NotNull AbstractBinderC3223a messageCallBack);

    @Metadata(m5109d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001C\bÆ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J;\u0010&\u001a\u00020\u00042\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b&\u0010*J%\u0010+\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b+\u0010\u0010J%\u0010,\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH\u0016¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\tR$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020$0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040A0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, m5110d2 = {"Lcom/zykj/message/client/MessageClient$INSTANCES;", "Lcom/zykj/message/client/MessageClient;", "Landroid/app/Application;", "context", "Ld6/s;", "init", "(Landroid/app/Application;)V", "startService", "stopService", "()V", "Lcom/zykj/message/client/c;", "Lcom/zykj/message/server/bean/UserInfo;", "callBack", "getUserInfo", "(Lcom/zykj/message/client/c;)V", "Lkotlin/Function1;", "(Lr6/c;)V", "()Lcom/zykj/message/server/bean/UserInfo;", "Lcom/zykj/message/server/bean/ServerInfo;", "getServerInfo", "()Lcom/zykj/message/server/bean/ServerInfo;", "", "getSNInfo", "()Ljava/lang/String;", "refreshToken", "url", "appName", "appPackageName", "checkUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "", MessageClient.INTENT_KEY, "goUnInstallActivity", "(Landroid/content/Context;Z)V", "goUnLoginActivity", "Lc4/a;", "messageCallBack", "registerListener", "(Lc4/a;)V", "serverCallBack", "userCallBack", "(Lr6/c;Lr6/c;)V", "registerServerListener", "registerUserListener", "unRegisterListener", "isInstallApp", "()Z", "isInit", "requestLogout", "Ld4/d;", "remoteServer", "Ld4/d;", "getRemoteServer", "()Ld4/d;", "setRemoteServer", "(Ld4/d;)V", "mContext", "Landroid/app/Application;", "Ljava/util/Timer;", "timeOut", "Ljava/util/Timer;", "", "listenerList", "Ljava/util/List;", "Lkotlin/Function0;", "doTask", "com/zykj/message/client/z", "mConnection", "Lcom/zykj/message/client/z;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "messageclient_release"}, m5111k = 1, m5112mv = {1, 4, 0})
    public static final class INSTANCES extends MessageClient {
        private final List<InterfaceC6469a> doTask;
        private List<AbstractBinderC3223a> listenerList;
        private final ServiceConnectionC4455z mConnection;
        private Application mContext;
        private final Handler mHandler;

        @Nullable
        private InterfaceC5422d remoteServer;
        private Timer timeOut;

        public INSTANCES(String str, int i) {
            super(str, i, null);
            this.listenerList = new ArrayList();
            this.doTask = new ArrayList();
            this.mConnection = new ServiceConnectionC4455z(this);
            this.mHandler = new Handler(new C4422a0(this));
        }

        public static final /* synthetic */ Application access$getMContext$p(INSTANCES instances) {
            Application application = instances.mContext;
            if (application != null) {
                return application;
            }
            AbstractC5830k.m5339p("mContext");
            throw null;
        }

        public static final void access$registerResumeListener(INSTANCES instances) {
            instances.getClass();
            C4423b.f5678e.f5681c = new C4432f0(instances);
        }

        public static /* synthetic */ void checkStatus$default(INSTANCES instances, ServerInfo serverInfo, boolean z8, int i, Object obj) {
            if ((i & 2) != 0) {
                z8 = false;
            }
            instances.m3901a(serverInfo, z8);
        }

        /* renamed from: a */
        public final void m3901a(ServerInfo serverInfo, boolean z8) {
            Status status;
            if (serverInfo == null || (status = serverInfo.f5728a) == null) {
                status = Status.LOGOUT;
            }
            int i = AbstractC4429e.f5687a[status.ordinal()];
            if (i == 1) {
                Iterator<T> it = this.doTask.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6469a) it.next()).invoke();
                }
                this.doTask.clear();
                return;
            }
            if (i == 2) {
                Application application = this.mContext;
                if (application != null) {
                    goUnLoginActivity(application, z8);
                    return;
                } else {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
            }
            if (i != 3) {
                return;
            }
            Application application2 = this.mContext;
            if (application2 != null) {
                goUnLoginActivity(application2, z8);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void checkUrl(@NotNull final String url, @NotNull final String appName, @NotNull final String appPackageName) {
            AbstractC5830k.m5331h(url, "url");
            AbstractC5830k.m5331h(appName, "appName");
            AbstractC5830k.m5331h(appPackageName, "appPackageName");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null) {
                if (interfaceC5422d == null) {
                    AbstractC5830k.m5337n();
                    throw null;
                }
                if (((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                    InterfaceC5422d interfaceC5422d2 = this.remoteServer;
                    if (interfaceC5422d2 != null) {
                        ((C5420b) interfaceC5422d2).m4809d(url, appName, appPackageName);
                        return;
                    } else {
                        AbstractC5830k.m5337n();
                        throw null;
                    }
                }
            }
            this.doTask.add(new InterfaceC6469a() { // from class: com.zykj.message.client.MessageClient$INSTANCES$checkUrl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13842invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13842invoke() {
                    InterfaceC5422d remoteServer = this.this$0.getRemoteServer();
                    if (remoteServer == null) {
                        AbstractC5830k.m5337n();
                        throw null;
                    }
                    ((C5420b) remoteServer).m4809d(url, appName, appPackageName);
                }
            });
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Nullable
        public final InterfaceC5422d getRemoteServer() {
            return this.remoteServer;
        }

        @Override // com.zykj.message.client.MessageClient
        public void getSNInfo(@NotNull InterfaceC6471c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4433g(this, callBack)).start();
                return;
            }
            this.doTask.add(new MessageClient$INSTANCES$getSNInfo$2(this, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void getServerInfo(@NotNull InterfaceC4425c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4440k(this)).start();
                return;
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$2(this, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void getUserInfo(@NotNull InterfaceC4425c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4448s(this)).start();
                return;
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$2(this, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void goUnInstallActivity(@NotNull Context context, boolean hidden) {
            AbstractC5830k.m5331h(context, "context");
            C4423b c4423b = C4423b.f5678e;
            AbstractC5830k.m5326c(c4423b, "ActivityCollectionHelper.with()");
            if (c4423b.m3904c() != null) {
                AbstractC5830k.m5326c(c4423b, "ActivityCollectionHelper.with()");
                if (AbstractC5830k.m5325b(c4423b.m3904c().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            c4423b.m3903b();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra(MessageClient.INTENT_KEY, hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动安装界面");
        }

        @Override // com.zykj.message.client.MessageClient
        public void goUnLoginActivity(@NotNull Context context, boolean hidden) {
            AbstractC5830k.m5331h(context, "context");
            C4423b c4423b = C4423b.f5678e;
            AbstractC5830k.m5326c(c4423b, "ActivityCollectionHelper.with()");
            if (c4423b.m3904c() != null) {
                AbstractC5830k.m5326c(c4423b, "ActivityCollectionHelper.with()");
                if (AbstractC5830k.m5325b(c4423b.m3904c().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            c4423b.m3903b();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra(MessageClient.INTENT_KEY, hidden);
            intent.addFlags(268435456);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动登录界面");
        }

        @Override // com.zykj.message.client.MessageClient
        public void init(@NotNull Application context) {
            AbstractC5830k.m5331h(context, "context");
            this.mContext = context;
            C4423b c4423b = C4423b.f5678e;
            if (c4423b.f5680b) {
                return;
            }
            c4423b.f5680b = true;
            context.registerActivityLifecycleCallbacks(c4423b.f5682d);
        }

        @Override // com.zykj.message.client.MessageClient
        public boolean isInit() {
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null) {
                return ((C5420b) interfaceC5422d).asBinder().pingBinder();
            }
            return false;
        }

        @Override // com.zykj.message.client.MessageClient
        public boolean isInstallApp() throws PackageManager.NameNotFoundException {
            Application application = this.mContext;
            if (application == null) {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
            try {
                application.getPackageManager().getPackageInfo(MessageClient.serverPackageName, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public synchronized void refreshToken(@NotNull InterfaceC6471c callBack) {
            int i;
            try {
                AbstractC5830k.m5331h(callBack, "callBack");
                InterfaceC5422d interfaceC5422d = this.remoteServer;
                if (interfaceC5422d == null || !((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                    Application application = this.mContext;
                    if (application == null) {
                        AbstractC5830k.m5339p("mContext");
                        throw null;
                    }
                    startService(application);
                    while (i < Integer.MAX_VALUE) {
                        Thread.sleep(100L);
                        InterfaceC5422d interfaceC5422d2 = this.remoteServer;
                        i = ((interfaceC5422d2 != null ? ((C5420b) interfaceC5422d2).m4811f() : null) == null && i <= 40) ? i + 1 : 0;
                        InterfaceC5422d interfaceC5422d3 = this.remoteServer;
                        callBack.invoke(interfaceC5422d3 != null ? ((C5420b) interfaceC5422d3).m4811f() : null);
                        return;
                    }
                }
                InterfaceC5422d interfaceC5422d4 = this.remoteServer;
                if (interfaceC5422d4 == null) {
                    AbstractC5830k.m5337n();
                    throw null;
                }
                BinderC4426c0 binderC4426c0 = new BinderC4426c0(callBack);
                C5420b c5420b = (C5420b) interfaceC5422d4;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.zykj.message.server.MessageServer");
                    parcelObtain.writeStrongBinder(binderC4426c0);
                    c5420b.f8385c.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerListener(@NotNull AbstractBinderC3223a messageCallBack) {
            AbstractC5830k.m5331h(messageCallBack, "messageCallBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4428d0(this, messageCallBack)).start();
                return;
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerServerListener(@NotNull InterfaceC6471c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4434g0(this, callBack)).start();
                return;
            }
            this.listenerList.add(new BinderC3224b(callBack, new InterfaceC6471c() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$2
                public final void invoke(@Nullable UserInfo userInfo) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserInfo) obj);
                    return C5443s.f8405a;
                }
            }));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerUserListener(@NotNull InterfaceC6471c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4436h0(this, callBack)).start();
                return;
            }
            this.listenerList.add(new BinderC3224b(new InterfaceC6471c() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerUserListener$2
                public final void invoke(@Nullable ServerInfo serverInfo) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ServerInfo) obj);
                    return C5443s.f8405a;
                }
            }, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void requestLogout() {
            Intent intent = new Intent();
            intent.setAction(MessageClient.LOGOUT_ACTION_NAME);
            intent.setComponent(new ComponentName(MessageClient.serverPackageName, "com.zykj.center.receiver.LogoutReceiver"));
            Application application = this.mContext;
            if (application != null) {
                application.sendBroadcast(intent);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        public final void setRemoteServer(@Nullable InterfaceC5422d interfaceC5422d) {
            this.remoteServer = interfaceC5422d;
        }

        @Override // com.zykj.message.client.MessageClient
        public void startService(@NotNull Application context) {
            Application application;
            AbstractC5830k.m5331h(context, "context");
            this.mContext = context;
            C4423b c4423b = C4423b.f5678e;
            if (!c4423b.f5680b) {
                c4423b.f5680b = true;
                context.registerActivityLifecycleCallbacks(c4423b.f5682d);
            }
            if (!isInstallApp()) {
                Application application2 = this.mContext;
                if (application2 != null) {
                    goUnInstallActivity(application2, false);
                    return;
                } else {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
            }
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null) {
                if (!((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                    try {
                        Application application3 = this.mContext;
                        if (application3 == null) {
                            AbstractC5830k.m5339p("mContext");
                            throw null;
                        }
                        application3.unbindService(this.mConnection);
                    } catch (Exception unused) {
                    }
                }
                this.remoteServer = null;
            }
            if (this.remoteServer == null) {
                try {
                    application = this.mContext;
                } catch (Exception unused2) {
                }
                if (application == null) {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
                application.unbindService(this.mConnection);
                Intent intent = new Intent(MessageClient.serverAction);
                intent.setPackage(MessageClient.serverPackageName);
                Log.d("MessageClient", "开始连接服务->" + System.currentTimeMillis());
                Application application4 = this.mContext;
                if (application4 == null) {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
                if (application4.bindService(intent, this.mConnection, 1)) {
                    Log.d("MessageClient", "绑定个人中心服务成功 result= true : " + System.currentTimeMillis());
                    return;
                }
                Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                Intent intent2 = new Intent();
                intent2.setAction(MessageClient.serverAwakenAction);
                intent2.setFlags(268435456);
                Application application5 = this.mContext;
                if (application5 == null) {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
                application5.startActivity(intent2);
                Timer timer = new Timer();
                this.timeOut = timer;
                timer.schedule(new C4424b0(this), 1000L);
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void stopService() {
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                Application application = this.mContext;
                if (application == null) {
                    AbstractC5830k.m5339p("mContext");
                    throw null;
                }
                application.unbindService(this.mConnection);
            }
            C4423b c4423b = C4423b.f5678e;
            Application application2 = this.mContext;
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(c4423b.f5682d);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void unRegisterListener(@NotNull AbstractBinderC3223a messageCallBack) {
            AbstractC5830k.m5331h(messageCallBack, "messageCallBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4438i0(this, messageCallBack)).start();
                return;
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        @Nullable
        public String getSNInfo() {
            InterfaceC5422d interfaceC5422d;
            InterfaceC5422d interfaceC5422d2 = this.remoteServer;
            if (interfaceC5422d2 != null) {
                if (interfaceC5422d2 != null) {
                    if (!((C5420b) interfaceC5422d2).f8385c.pingBinder() || (interfaceC5422d = this.remoteServer) == null) {
                        return null;
                    }
                    return ((C5420b) interfaceC5422d).m4810e();
                }
                AbstractC5830k.m5337n();
                throw null;
            }
            return null;
        }

        @Override // com.zykj.message.client.MessageClient
        public void getServerInfo(@NotNull InterfaceC6471c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4444o(this, callBack)).start();
                return;
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void getUserInfo(@NotNull InterfaceC6471c callBack) {
            AbstractC5830k.m5331h(callBack, "callBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4452w(this, callBack)).start();
                return;
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$4(this, callBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerListener(@NotNull InterfaceC6471c serverCallBack, @NotNull InterfaceC6471c userCallBack) {
            AbstractC5830k.m5331h(serverCallBack, "serverCallBack");
            AbstractC5830k.m5331h(userCallBack, "userCallBack");
            InterfaceC5422d interfaceC5422d = this.remoteServer;
            if (interfaceC5422d != null && ((C5420b) interfaceC5422d).f8385c.pingBinder()) {
                new Thread(new RunnableC4430e0(this, serverCallBack, userCallBack)).start();
                return;
            }
            this.listenerList.add(new BinderC3224b(serverCallBack, userCallBack));
            Application application = this.mContext;
            if (application != null) {
                startService(application);
            } else {
                AbstractC5830k.m5339p("mContext");
                throw null;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        @Nullable
        public ServerInfo getServerInfo() {
            InterfaceC5422d interfaceC5422d;
            InterfaceC5422d interfaceC5422d2 = this.remoteServer;
            if (interfaceC5422d2 != null) {
                if (interfaceC5422d2 != null) {
                    if (!((C5420b) interfaceC5422d2).f8385c.pingBinder() || (interfaceC5422d = this.remoteServer) == null) {
                        return null;
                    }
                    return ((C5420b) interfaceC5422d).m4811f();
                }
                AbstractC5830k.m5337n();
                throw null;
            }
            return null;
        }

        @Override // com.zykj.message.client.MessageClient
        @Nullable
        public UserInfo getUserInfo() {
            InterfaceC5422d interfaceC5422d;
            InterfaceC5422d interfaceC5422d2 = this.remoteServer;
            if (interfaceC5422d2 != null) {
                if (interfaceC5422d2 != null) {
                    if (!((C5420b) interfaceC5422d2).f8385c.pingBinder() || (interfaceC5422d = this.remoteServer) == null) {
                        return null;
                    }
                    return ((C5420b) interfaceC5422d).m4812g();
                }
                AbstractC5830k.m5337n();
                throw null;
            }
            return null;
        }
    }
}
