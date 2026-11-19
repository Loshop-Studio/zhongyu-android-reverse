package com.zykj.huiwei.launcher.server;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.datastore.core.DataStore;
import com.blankj.utilcode.util.AbstractC4640d;
import com.blankj.utilcode.util.AbstractC4672w;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.receiver.LogoutReceiver;
import com.zykj.huiwei.launcher.repository.UserRepository;
import com.zykj.manage.R;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import p078i4.AbstractC6537g;
import p135q3.AbstractC7624a;
import p177w3.C7811a;
import p184x3.AbstractC7834b;
import p184x3.AbstractServiceC7833a;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R(\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00100\u001a\b\u0012\u0004\u0012\u00020,0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R(\u00105\u001a\b\u0012\u0004\u0012\u0002010#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R.\u0010?\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u0010\u0003\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010T\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u0010P\u001a\u0004\bA\u0010Q\"\u0004\bR\u0010SR$\u0010[\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006\\"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/server/MyService;", "Lm4/c;", "<init>", "()V", "", "message", "", "o", "(Ljava/lang/String;)V", "onCreate", "Lcom/zykj/message/server/bean/ServerInfo;", "c", "()Lcom/zykj/message/server/bean/ServerInfo;", "b", "()Ljava/lang/String;", "url", "appName", "appPackageName", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/zykj/message/server/bean/UserInfo;", "d", "()Lcom/zykj/message/server/bean/UserInfo;", "Lkotlin/Function1;", "callBack", "e", "(Lkotlin/jvm/functions/Function1;)V", "onDestroy", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "threadExecutor", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "checkDevicesThread", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/a;", "g", "Landroidx/datastore/core/DataStore;", "l", "()Landroidx/datastore/core/DataStore;", "setServerDataStore", "(Landroidx/datastore/core/DataStore;)V", "serverDataStore", "Lcom/zykj/huiwei/launcher/proto/m;", "h", "n", "setUserDataStore", "userDataStore", "Lcom/zykj/huiwei/launcher/proto/d;", "i", "m", "setSettingDataStore", "settingDataStore", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "j", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHeaderBeanFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setHeaderBeanFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getHeaderBeanFlow$annotations", "headerBeanFlow", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "k", "Lcom/zykj/huiwei/launcher/repository/UserRepository;", "getUserRepository", "()Lcom/zykj/huiwei/launcher/repository/UserRepository;", "setUserRepository", "(Lcom/zykj/huiwei/launcher/repository/UserRepository;)V", "userRepository", "Lw3/a;", "Lw3/a;", "getDeviceRepository", "()Lw3/a;", "setDeviceRepository", "(Lw3/a;)V", "deviceRepository", "Lq3/a;", "Lq3/a;", "()Lq3/a;", "setRefreshRepository", "(Lq3/a;)V", "refreshRepository", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "job", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMyService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyService.kt\ncom/zykj/huiwei/launcher/server/MyService\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,348:1\n32#2,2:349\n230#3,5:351\n*S KotlinDebug\n*F\n+ 1 MyService.kt\ncom/zykj/huiwei/launcher/server/MyService\n*L\n240#1:349,2\n309#1:351,5\n*E\n"})
/* loaded from: classes4.dex */
public final class MyService extends AbstractServiceC7833a {

    /* renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: p */
    public static final int f6245p;

    /* renamed from: q */
    public static final String f6246q;

    /* renamed from: e, reason: from kotlin metadata */
    public ScheduledThreadPoolExecutor threadExecutor;

    /* renamed from: f, reason: from kotlin metadata */
    public Thread checkDevicesThread;

    /* renamed from: g, reason: from kotlin metadata */
    public DataStore serverDataStore;

    /* renamed from: h, reason: from kotlin metadata */
    public DataStore userDataStore;

    /* renamed from: i, reason: from kotlin metadata */
    public DataStore settingDataStore;

    /* renamed from: j, reason: from kotlin metadata */
    public MutableStateFlow headerBeanFlow;

    /* renamed from: k, reason: from kotlin metadata */
    public UserRepository userRepository;

    /* renamed from: l, reason: from kotlin metadata */
    public C7811a deviceRepository;

    /* renamed from: m, reason: from kotlin metadata */
    public AbstractC7624a refreshRepository;

    /* renamed from: n, reason: from kotlin metadata */
    public Job job;

    /* renamed from: com.zykj.huiwei.launcher.server.MyService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m5495a() {
            return MyService.f6246q;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f6245p = 8;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f6246q = name;
    }

    @Override // p108m4.InterfaceC7405d
    /* renamed from: a */
    public void mo5485a(String url, String appName, String appPackageName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
    }

    @Override // p108m4.InterfaceC7405d
    /* renamed from: b */
    public String mo5486b() {
        return AbstractC6537g.f8372a.m7311b();
    }

    @Override // p108m4.InterfaceC7405d
    /* renamed from: c */
    public ServerInfo mo5487c() {
        return (ServerInfo) BuildersKt__BuildersKt.runBlocking$default(null, new MyService$serverInfo$1(this, null), 1, null);
    }

    @Override // p108m4.InterfaceC7405d
    /* renamed from: d */
    public UserInfo mo5488d() {
        return (UserInfo) BuildersKt__BuildersKt.runBlocking$default(null, new MyService$userInfo$1(this, null), 1, null);
    }

    @Override // p108m4.InterfaceC7405d
    /* renamed from: e */
    public synchronized void mo5489e(Function1 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Log.i(f6246q, "开始刷新Token");
        BuildersKt__BuildersKt.runBlocking$default(null, new MyService$refreshToken$1(this, callBack, null), 1, null);
    }

    /* renamed from: k */
    public final AbstractC7624a m5490k() {
        AbstractC7624a abstractC7624a = this.refreshRepository;
        if (abstractC7624a != null) {
            return abstractC7624a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refreshRepository");
        return null;
    }

    /* renamed from: l */
    public final DataStore m5491l() {
        DataStore dataStore = this.serverDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serverDataStore");
        return null;
    }

    /* renamed from: m */
    public final DataStore m5492m() {
        DataStore dataStore = this.settingDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingDataStore");
        return null;
    }

    /* renamed from: n */
    public final DataStore m5493n() {
        DataStore dataStore = this.userDataStore;
        if (dataStore != null) {
            return dataStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userDataStore");
        return null;
    }

    /* renamed from: o */
    public final void m5494o(String message) {
        App appM5206a = App.INSTANCE.m5206a();
        Intent intent = new Intent();
        intent.setAction("com.zykj.action.zykj.LOGOUT");
        intent.setComponent(new ComponentName(getPackageName(), LogoutReceiver.class.getName()));
        intent.putExtra("Toast", message);
        appM5206a.sendBroadcast(intent);
    }

    @Override // p184x3.AbstractServiceC7833a, p108m4.AbstractServiceC7404c, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC7834b.m9512a();
            NotificationChannel notificationChannelM2435a = AbstractC4672w.m2435a("com.zykj.manage", getString(R.string.app_name), 3);
            notificationChannelM2435a.enableVibration(false);
            notificationChannelM2435a.setSound(null, null);
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelM2435a);
            NotificationCompat.Builder defaults = new NotificationCompat.Builder(this, "com.zykj.manage").setTicker(AbstractC4640d.m2148b() + "正在运行").setContentTitle(AbstractC4640d.m2148b()).setContentText(AbstractC4640d.m2148b() + "正在运行").setOngoing(true).setSound(null).setDefaults(-1);
            Intrinsics.checkNotNullExpressionValue(defaults, "setDefaults(...)");
            Notification notificationBuild = defaults.build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
            startForeground(1, notificationBuild);
        }
    }

    @Override // p108m4.AbstractServiceC7404c, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.threadExecutor;
        if (scheduledThreadPoolExecutor != null) {
            scheduledThreadPoolExecutor.remove(this.checkDevicesThread);
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.threadExecutor;
        if (scheduledThreadPoolExecutor2 != null) {
            scheduledThreadPoolExecutor2.shutdown();
        }
    }
}
