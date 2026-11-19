package com.zykj.message.client;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.zykj.message.UnInstallActivity;
import com.zykj.message.UnLoginActivity;
import com.zykj.message.client.ActivityCollectionHelper;
import com.zykj.message.client.MessageClient;
import com.zykj.message.listener.BaseMessageCallBack;
import com.zykj.message.listener.DefaultMessageCallBack;
import com.zykj.message.server.MessageServer;
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

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessageClient.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\t\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\f\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u000f\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0015H&J\b\u0010\u001a\u001a\u00020\u0015H&J\u001e\u0010\u001b\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000bH&J4\u0010\u001c\u001a\u00020\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000b2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H&J\u001e\u0010!\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000bH&J\u001e\u0010\"\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\b\u0010#\u001a\u00020\u0004H&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0018H&J\b\u0010%\u001a\u00020\u0004H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H&j\u0002\b'¨\u0006)"}, m18d2 = {"Lcom/zykj/message/client/MessageClient;", BuildConfig.FLAVOR, "(Ljava/lang/String;I)V", "checkUrl", BuildConfig.FLAVOR, "url", BuildConfig.FLAVOR, "appName", "appPackageName", "getSNInfo", "callBack", "Lkotlin/Function1;", "getServerInfo", "Lcom/zykj/message/server/bean/ServerInfo;", "Lcom/zykj/message/client/DataCallBack;", "getUserInfo", "Lcom/zykj/message/server/bean/UserInfo;", "goUnInstallActivity", "context", "Landroid/content/Context;", MessageClient.INTENT_KEY, BuildConfig.FLAVOR, "goUnLoginActivity", "init", "Landroid/app/Application;", "isInit", "isInstallApp", "refreshToken", "registerListener", "serverCallBack", "userCallBack", "messageCallBack", "Lcom/zykj/message/listener/BaseMessageCallBack;", "registerServerListener", "registerUserListener", "requestLogout", "startService", "stopService", "unRegisterListener", "INSTANCES", "Companion", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class MessageClient {
    private static final /* synthetic */ MessageClient[] $VALUES;
    public static final MessageClient INSTANCES;
    public static final String INTENT_KEY = "hidden";
    public static final String LOGOUT_ACTION_NAME = "com.zykj.action.zykj.LOGOUT";
    public static final int RESTART_SERVER_FAIL = 2;
    public static final int SERVER_REQUEST_CODE = 200;
    public static final String serverAction = "com.zykj.action.zykj.message.service";
    public static final String serverAwakenAction = "com.zykj.action.zykj.message.service.awaken";
    public static final String serverLoginAction = "com.zykj.action.zykj.LOGIN";
    public static final String serverPackageName = "com.zykj.manage";

    static {
        INSTANCES instances = new INSTANCES("INSTANCES", 0);
        INSTANCES = instances;
        $VALUES = new MessageClient[]{instances};
        INSTANCE = new Companion(null);
    }

    public static MessageClient valueOf(String str) {
        return (MessageClient) Enum.valueOf(MessageClient.class, str);
    }

    public static MessageClient[] values() {
        return (MessageClient[]) $VALUES.clone();
    }

    public abstract void checkUrl(String url, String appName, String appPackageName);

    public abstract String getSNInfo();

    public abstract void getSNInfo(Function1<? super String, Unit> callBack);

    public abstract ServerInfo getServerInfo();

    public abstract void getServerInfo(DataCallBack<ServerInfo> callBack);

    public abstract void getServerInfo(Function1<? super ServerInfo, Unit> callBack);

    public abstract UserInfo getUserInfo();

    public abstract void getUserInfo(DataCallBack<UserInfo> callBack);

    public abstract void getUserInfo(Function1<? super UserInfo, Unit> callBack);

    public abstract void goUnInstallActivity(Context context, boolean hidden);

    public abstract void goUnLoginActivity(Context context, boolean hidden);

    public abstract void init(Application context);

    public abstract boolean isInit();

    public abstract boolean isInstallApp();

    public abstract void refreshToken(Function1<? super ServerInfo, Unit> callBack);

    public abstract void registerListener(BaseMessageCallBack messageCallBack);

    public abstract void registerListener(Function1<? super ServerInfo, Unit> serverCallBack, Function1<? super UserInfo, Unit> userCallBack);

    public abstract void registerServerListener(Function1<? super ServerInfo, Unit> callBack);

    public abstract void registerUserListener(Function1<? super UserInfo, Unit> callBack);

    public abstract void requestLogout();

    public abstract void startService(Application context);

    public abstract void stopService();

    public abstract void unRegisterListener(BaseMessageCallBack messageCallBack);

    private MessageClient(String str, int i) {
    }

    public /* synthetic */ MessageClient(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* compiled from: MessageClient.kt */
    @Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013*\u0001\t\bÆ\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001eH\u0016J\u001e\u0010!\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00050#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010$\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0016\u0010$\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001c\u0010&\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0016\u0010&\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020'0%H\u0016J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020\u001bH\u0016J\b\u0010.\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u0005H\u0002J\u001e\u00100\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J4\u00101\u001a\u00020\u00052\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#2\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u0005H\u0002J\u001e\u00106\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J\u001e\u00107\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u00050#H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\fH\u0016J\b\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020\u0005H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m18d2 = {"Lcom/zykj/message/client/MessageClient$INSTANCES;", "Lcom/zykj/message/client/MessageClient;", "doTask", BuildConfig.FLAVOR, "Lkotlin/Function0;", BuildConfig.FLAVOR, "listenerList", "Lcom/zykj/message/listener/BaseMessageCallBack;", "mConnection", "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1", "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;", "mContext", "Landroid/app/Application;", "mHandler", "Landroid/os/Handler;", "remoteServer", "Lcom/zykj/message/server/MessageServer;", "getRemoteServer", "()Lcom/zykj/message/server/MessageServer;", "setRemoteServer", "(Lcom/zykj/message/server/MessageServer;)V", "timeOut", "Ljava/util/Timer;", "checkStatus", "serverInfo", "Lcom/zykj/message/server/bean/ServerInfo;", MessageClient.INTENT_KEY, BuildConfig.FLAVOR, "checkUrl", "url", BuildConfig.FLAVOR, "appName", "appPackageName", "getSNInfo", "callBack", "Lkotlin/Function1;", "getServerInfo", "Lcom/zykj/message/client/DataCallBack;", "getUserInfo", "Lcom/zykj/message/server/bean/UserInfo;", "goUnInstallActivity", "context", "Landroid/content/Context;", "goUnLoginActivity", "init", "isInit", "isInstallApp", "reStartService", "refreshToken", "registerListener", "serverCallBack", "userCallBack", "messageCallBack", "registerResumeListener", "registerServerListener", "registerUserListener", "requestLogout", "startService", "stopService", "unRegisterListener", "unRegisterResumeListener", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
    static final class INSTANCES extends MessageClient {
        private final List<Function0<Unit>> doTask;
        private List<BaseMessageCallBack> listenerList;
        private final MessageClient$INSTANCES$mConnection$1 mConnection;
        private Application mContext;
        private final Handler mHandler;
        private MessageServer remoteServer;
        private Timer timeOut;

        @Metadata(m16bv = {1, 0, 3}, m19k = 3, m20mv = {1, 1, 15})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Status.LOGIN.ordinal()] = 1;
                iArr[Status.LOGOUT.ordinal()] = 2;
                iArr[Status.CRACK.ordinal()] = 3;
            }
        }

        INSTANCES(String str, int i) {
            super(str, i, null);
            this.listenerList = new ArrayList();
            this.doTask = new ArrayList();
            this.mConnection = new MessageClient$INSTANCES$mConnection$1(this);
            this.mHandler = new Handler(new Handler.Callback() { // from class: com.zykj.message.client.MessageClient$INSTANCES$mHandler$1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    if (message.what != 2) {
                        return true;
                    }
                    MessageClient.INSTANCES instances = this.this$0;
                    instances.goUnLoginActivity(MessageClient.INSTANCES.access$getMContext$p(instances), false);
                    return true;
                }
            });
        }

        public static final /* synthetic */ Application access$getMContext$p(INSTANCES instances) {
            Application application = instances.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            return application;
        }

        public final MessageServer getRemoteServer() {
            return this.remoteServer;
        }

        public final void setRemoteServer(MessageServer messageServer) {
            this.remoteServer = messageServer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void registerResumeListener() {
            ActivityCollectionHelper.with().registerResumeListener(new ActivityCollectionHelper.ActivityResumeListener() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1
                @Override // com.zykj.message.client.ActivityCollectionHelper.ActivityResumeListener
                public final void onResume() {
                    this.this$0.getServerInfo(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerResumeListener$1.1
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
                            MessageClient$INSTANCES$registerResumeListener$1.this.this$0.checkStatus(it, false);
                        }
                    });
                }
            });
        }

        private final void unRegisterResumeListener() {
            ActivityCollectionHelper.with().unRegisterResumeListener();
        }

        @Override // com.zykj.message.client.MessageClient
        public void init(Application context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            ActivityCollectionHelper activityCollectionHelperWith = ActivityCollectionHelper.with();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            activityCollectionHelperWith.register(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void startService(Application context) {
            IBinder iBinderAsBinder;
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.mContext = context;
            ActivityCollectionHelper activityCollectionHelperWith = ActivityCollectionHelper.with();
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            activityCollectionHelperWith.register(application);
            if (!isInstallApp()) {
                Application application2 = this.mContext;
                if (application2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                goUnInstallActivity(application2, false);
                return;
            }
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer != null && (iBinderAsBinder = messageServer.asBinder()) != null && !iBinderAsBinder.pingBinder()) {
                    try {
                        Application application3 = this.mContext;
                        if (application3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mContext");
                        }
                        application3.unbindService(this.mConnection);
                    } catch (Exception unused) {
                    }
                }
                this.remoteServer = (MessageServer) null;
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
                Intent intent = new Intent(MessageClient.serverAction);
                intent.setPackage(MessageClient.serverPackageName);
                Log.d("MessageClient", "开始连接服务->" + System.currentTimeMillis());
                Application application5 = this.mContext;
                if (application5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                if (!application5.bindService(intent, this.mConnection, 1)) {
                    Log.e("MessageClient", "绑定个人中心服务失败,准备重新启动该任务 " + System.currentTimeMillis());
                    reStartService();
                } else {
                    Log.d("MessageClient", "绑定个人中心服务成功 result= true : " + System.currentTimeMillis());
                }
            }
        }

        private final void reStartService() {
            Intent intent = new Intent();
            intent.setAction(MessageClient.serverAwakenAction);
            intent.setFlags(268435456);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            application.startActivity(intent);
            Timer timer = new Timer();
            this.timeOut = timer;
            if (timer != null) {
                timer.schedule(new TimerTask() { // from class: com.zykj.message.client.MessageClient$INSTANCES$reStartService$1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        Log.d("MessageClient", "重启服务 1S后的超时任务启动" + System.currentTimeMillis());
                        Intent intent2 = new Intent(MessageClient.serverAction);
                        intent2.setPackage(MessageClient.serverPackageName);
                        if (MessageClient.INSTANCES.access$getMContext$p(this.this$0).bindService(intent2, this.this$0.mConnection, 1)) {
                            return;
                        }
                        Log.e("MessageClient", "服务没在运行？绑定失败了 " + System.currentTimeMillis());
                        this.this$0.mHandler.sendEmptyMessage(2);
                    }
                }, 1000L);
            }
        }

        static /* synthetic */ void checkStatus$default(INSTANCES instances, ServerInfo serverInfo, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            instances.checkStatus(serverInfo, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkStatus(ServerInfo serverInfo, boolean hidden) {
            Status status;
            if (serverInfo == null || (status = serverInfo.getStatus()) == null) {
                status = Status.LOGOUT;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                Iterator<T> it = this.doTask.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.doTask.clear();
                return;
            }
            if (i == 2) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                goUnLoginActivity(application, hidden);
                return;
            }
            if (i != 3) {
                return;
            }
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            goUnLoginActivity(application2, hidden);
        }

        @Override // com.zykj.message.client.MessageClient
        public void stopService() {
            IBinder iBinderAsBinder;
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null && messageServer != null && (iBinderAsBinder = messageServer.asBinder()) != null && iBinderAsBinder.pingBinder()) {
                Application application = this.mContext;
                if (application == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                application.unbindService(this.mConnection);
            }
            ActivityCollectionHelper activityCollectionHelperWith = ActivityCollectionHelper.with();
            Application application2 = this.mContext;
            if (application2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            activityCollectionHelperWith.unRegister(application2);
        }

        @Override // com.zykj.message.client.MessageClient
        public void getUserInfo(final DataCallBack<UserInfo> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            final UserInfo userInfo = remoteServer != null ? remoteServer.getUserInfo() : null;
                            this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DataCallBack dataCallBack = callBack;
                                    UserInfo userInfo2 = userInfo;
                                    if (userInfo2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    dataCallBack.response(userInfo2);
                                }
                            });
                        }
                    }).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$2(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void getUserInfo(final Function1<? super UserInfo, Unit> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$3
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            final UserInfo userInfo = remoteServer != null ? remoteServer.getUserInfo() : null;
                            this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getUserInfo$3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Function1 function1 = callBack;
                                    UserInfo userInfo2 = userInfo;
                                    if (userInfo2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    function1.invoke(userInfo2);
                                }
                            });
                        }
                    }).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getUserInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public UserInfo getUserInfo() {
            MessageServer messageServer;
            MessageServer messageServer2 = this.remoteServer;
            if (messageServer2 == null) {
                return null;
            }
            if (messageServer2 == null) {
                Intrinsics.throwNpe();
            }
            if (!messageServer2.asBinder().pingBinder() || (messageServer = this.remoteServer) == null) {
                return null;
            }
            return messageServer.getUserInfo();
        }

        @Override // com.zykj.message.client.MessageClient
        public void getServerInfo(final DataCallBack<ServerInfo> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            final ServerInfo serverInfo = remoteServer != null ? remoteServer.getServerInfo() : null;
                            this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    callBack.response(serverInfo);
                                }
                            });
                        }
                    }).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$2(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void getServerInfo(final Function1<? super ServerInfo, Unit> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$3
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            final ServerInfo serverInfo = remoteServer != null ? remoteServer.getServerInfo() : null;
                            this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getServerInfo$3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Function1 function1 = callBack;
                                    ServerInfo serverInfo2 = serverInfo;
                                    if (serverInfo2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    function1.invoke(serverInfo2);
                                }
                            });
                        }
                    }).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getServerInfo$4(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public ServerInfo getServerInfo() {
            MessageServer messageServer;
            MessageServer messageServer2 = this.remoteServer;
            if (messageServer2 == null) {
                return null;
            }
            if (messageServer2 == null) {
                Intrinsics.throwNpe();
            }
            if (!messageServer2.asBinder().pingBinder() || (messageServer = this.remoteServer) == null) {
                return null;
            }
            return messageServer.getServerInfo();
        }

        @Override // com.zykj.message.client.MessageClient
        public void getSNInfo(final Function1<? super String, Unit> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getSNInfo$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.this$0.mHandler.post(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$getSNInfo$1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Function1 function1 = callBack;
                                    MessageServer remoteServer = MessageClient$INSTANCES$getSNInfo$1.this.this$0.getRemoteServer();
                                    function1.invoke(remoteServer != null ? remoteServer.getSNInfo() : null);
                                }
                            });
                        }
                    }).start();
                    return;
                }
            }
            this.doTask.add(new MessageClient$INSTANCES$getSNInfo$2(this, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public String getSNInfo() {
            MessageServer messageServer;
            MessageServer messageServer2 = this.remoteServer;
            if (messageServer2 == null) {
                return null;
            }
            if (messageServer2 == null) {
                Intrinsics.throwNpe();
            }
            if (!messageServer2.asBinder().pingBinder() || (messageServer = this.remoteServer) == null) {
                return null;
            }
            return messageServer.getSNInfo();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000c, B:7:0x000f, B:9:0x0019, B:11:0x001d, B:12:0x0020, B:13:0x002b, B:15:0x002f, B:16:0x0034, B:18:0x003d, B:20:0x0047, B:26:0x0054, B:27:0x0057, B:29:0x005b, B:30:0x005f), top: B:40:0x0001 }] */
        @Override // com.zykj.message.client.MessageClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void refreshToken(final kotlin.jvm.functions.Function1<? super com.zykj.message.server.bean.ServerInfo, kotlin.Unit> r5) {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = "callBack"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)     // Catch: java.lang.Throwable -> L66
                com.zykj.message.server.MessageServer r0 = r4.remoteServer     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L2b
                if (r0 != 0) goto Lf
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L66
            Lf:
                android.os.IBinder r0 = r0.asBinder()     // Catch: java.lang.Throwable -> L66
                boolean r0 = r0.pingBinder()     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L2b
                com.zykj.message.server.MessageServer r0 = r4.remoteServer     // Catch: java.lang.Throwable -> L66
                if (r0 != 0) goto L20
                kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch: java.lang.Throwable -> L66
            L20:
                com.zykj.message.client.MessageClient$INSTANCES$refreshToken$1 r1 = new com.zykj.message.client.MessageClient$INSTANCES$refreshToken$1     // Catch: java.lang.Throwable -> L66
                r1.<init>()     // Catch: java.lang.Throwable -> L66
                com.zykj.message.server.MessageCallBack r1 = (com.zykj.message.server.MessageCallBack) r1     // Catch: java.lang.Throwable -> L66
                r0.refreshToken(r1)     // Catch: java.lang.Throwable -> L66
                goto L64
            L2b:
                android.app.Application r0 = r4.mContext     // Catch: java.lang.Throwable -> L66
                if (r0 != 0) goto L34
                java.lang.String r1 = "mContext"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch: java.lang.Throwable -> L66
            L34:
                r4.startService(r0)     // Catch: java.lang.Throwable -> L66
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
            L3b:
                if (r1 >= r0) goto L64
                r2 = 100
                java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L66
                com.zykj.message.server.MessageServer r2 = r4.remoteServer     // Catch: java.lang.Throwable -> L66
                r3 = 0
                if (r2 == 0) goto L4c
                com.zykj.message.server.bean.ServerInfo r2 = r2.getServerInfo()     // Catch: java.lang.Throwable -> L66
                goto L4d
            L4c:
                r2 = r3
            L4d:
                if (r2 != 0) goto L57
                r2 = 40
                if (r1 <= r2) goto L54
                goto L57
            L54:
                int r1 = r1 + 1
                goto L3b
            L57:
                com.zykj.message.server.MessageServer r0 = r4.remoteServer     // Catch: java.lang.Throwable -> L66
                if (r0 == 0) goto L5f
                com.zykj.message.server.bean.ServerInfo r3 = r0.getServerInfo()     // Catch: java.lang.Throwable -> L66
            L5f:
                r5.invoke(r3)     // Catch: java.lang.Throwable -> L66
                monitor-exit(r4)
                return
            L64:
                monitor-exit(r4)
                return
            L66:
                r5 = move-exception
                monitor-exit(r4)
                goto L6a
            L69:
                throw r5
            L6a:
                goto L69
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.message.client.MessageClient.INSTANCES.refreshToken(kotlin.jvm.functions.Function1):void"); // DEX body: android/选课/smali/com/zykj/message/client/MessageClient$INSTANCES.smali:1370
        }

        @Override // com.zykj.message.client.MessageClient
        public void checkUrl(final String url, final String appName, final String appPackageName) throws RemoteException {
            Intrinsics.checkParameterIsNotNull(url, "url");
            Intrinsics.checkParameterIsNotNull(appName, "appName");
            Intrinsics.checkParameterIsNotNull(appPackageName, "appPackageName");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    MessageServer messageServer2 = this.remoteServer;
                    if (messageServer2 == null) {
                        Intrinsics.throwNpe();
                    }
                    messageServer2.checkUrl(url, appName, appPackageName);
                    return;
                }
            }
            this.doTask.add(new Function0<Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$checkUrl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws RemoteException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws RemoteException {
                    MessageServer remoteServer = this.this$0.getRemoteServer();
                    if (remoteServer == null) {
                        Intrinsics.throwNpe();
                    }
                    remoteServer.checkUrl(url, appName, appPackageName);
                }
            });
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void goUnInstallActivity(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ActivityCollectionHelper activityCollectionHelperWith = ActivityCollectionHelper.with();
            Intrinsics.checkExpressionValueIsNotNull(activityCollectionHelperWith, "ActivityCollectionHelper.with()");
            if (activityCollectionHelperWith.getTopActivity() != null) {
                ActivityCollectionHelper activityCollectionHelperWith2 = ActivityCollectionHelper.with();
                Intrinsics.checkExpressionValueIsNotNull(activityCollectionHelperWith2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(activityCollectionHelperWith2.getTopActivity().getClass().getCanonicalName(), UnInstallActivity.class.getCanonicalName())) {
                    return;
                }
            }
            ActivityCollectionHelper.with().finishAll();
            Intent intent = new Intent(context, (Class<?>) UnInstallActivity.class);
            intent.putExtra(MessageClient.INTENT_KEY, hidden);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动安装界面");
        }

        @Override // com.zykj.message.client.MessageClient
        public void goUnLoginActivity(Context context, boolean hidden) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            ActivityCollectionHelper activityCollectionHelperWith = ActivityCollectionHelper.with();
            Intrinsics.checkExpressionValueIsNotNull(activityCollectionHelperWith, "ActivityCollectionHelper.with()");
            if (activityCollectionHelperWith.getTopActivity() != null) {
                ActivityCollectionHelper activityCollectionHelperWith2 = ActivityCollectionHelper.with();
                Intrinsics.checkExpressionValueIsNotNull(activityCollectionHelperWith2, "ActivityCollectionHelper.with()");
                if (Intrinsics.areEqual(activityCollectionHelperWith2.getTopActivity().getClass().getCanonicalName(), UnLoginActivity.class.getCanonicalName())) {
                    return;
                }
            }
            ActivityCollectionHelper.with().finishAll();
            Intent intent = new Intent(context, (Class<?>) UnLoginActivity.class);
            intent.putExtra(MessageClient.INTENT_KEY, hidden);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
            Log.d("MessageClient", "去启动登录界面");
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerListener(final BaseMessageCallBack messageCallBack) {
            Intrinsics.checkParameterIsNotNull(messageCallBack, "messageCallBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerListener$1
                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.registerCallBack(messageCallBack);
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerListener(final Function1<? super ServerInfo, Unit> serverCallBack, final Function1<? super UserInfo, Unit> userCallBack) {
            Intrinsics.checkParameterIsNotNull(serverCallBack, "serverCallBack");
            Intrinsics.checkParameterIsNotNull(userCallBack, "userCallBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerListener$2
                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.registerCallBack(new DefaultMessageCallBack(serverCallBack, userCallBack));
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(new DefaultMessageCallBack(serverCallBack, userCallBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerServerListener(final Function1<? super ServerInfo, Unit> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$1
                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.registerCallBack(new DefaultMessageCallBack(callBack, new Function1<UserInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$1.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(UserInfo userInfo) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
                                        invoke2(userInfo);
                                        return Unit.INSTANCE;
                                    }
                                }));
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(new DefaultMessageCallBack(callBack, new Function1<UserInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerServerListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(UserInfo userInfo) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserInfo userInfo) {
                    invoke2(userInfo);
                    return Unit.INSTANCE;
                }
            }));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void registerUserListener(final Function1<? super UserInfo, Unit> callBack) {
            Intrinsics.checkParameterIsNotNull(callBack, "callBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerUserListener$1
                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.registerCallBack(new DefaultMessageCallBack(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerUserListener$1.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(ServerInfo serverInfo) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                                        invoke2(serverInfo);
                                        return Unit.INSTANCE;
                                    }
                                }, callBack));
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(new DefaultMessageCallBack(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.client.MessageClient$INSTANCES$registerUserListener$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ServerInfo serverInfo) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                    invoke2(serverInfo);
                    return Unit.INSTANCE;
                }
            }, callBack));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public void unRegisterListener(final BaseMessageCallBack messageCallBack) {
            Intrinsics.checkParameterIsNotNull(messageCallBack, "messageCallBack");
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                if (messageServer == null) {
                    Intrinsics.throwNpe();
                }
                if (messageServer.asBinder().pingBinder()) {
                    new Thread(new Runnable() { // from class: com.zykj.message.client.MessageClient$INSTANCES$unRegisterListener$1
                        @Override // java.lang.Runnable
                        public final void run() throws RemoteException {
                            MessageServer remoteServer = this.this$0.getRemoteServer();
                            if (remoteServer != null) {
                                remoteServer.unRegisterCallBack(messageCallBack);
                            }
                        }
                    }).start();
                    return;
                }
            }
            this.listenerList.add(messageCallBack);
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            startService(application);
        }

        @Override // com.zykj.message.client.MessageClient
        public boolean isInstallApp() throws PackageManager.NameNotFoundException {
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            try {
                application.getPackageManager().getPackageInfo(MessageClient.serverPackageName, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        @Override // com.zykj.message.client.MessageClient
        public boolean isInit() {
            MessageServer messageServer = this.remoteServer;
            if (messageServer != null) {
                return messageServer.asBinder().pingBinder();
            }
            return false;
        }

        @Override // com.zykj.message.client.MessageClient
        public void requestLogout() {
            Intent intent = new Intent();
            intent.setAction(MessageClient.LOGOUT_ACTION_NAME);
            intent.setComponent(new ComponentName(MessageClient.serverPackageName, "com.zykj.center.receiver.LogoutReceiver"));
            Application application = this.mContext;
            if (application == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            application.sendBroadcast(intent);
        }
    }

    public static /* synthetic */ void goUnInstallActivity$default(MessageClient messageClient, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        messageClient.goUnInstallActivity(context, z);
    }

    public static /* synthetic */ void goUnLoginActivity$default(MessageClient messageClient, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        messageClient.goUnLoginActivity(context, z);
    }
}
