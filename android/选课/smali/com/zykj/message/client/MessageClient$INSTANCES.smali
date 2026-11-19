.class final Lcom/zykj/message/client/MessageClient$INSTANCES;
.super Lcom/zykj/message/client/MessageClient;
.source "MessageClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/message/client/MessageClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "INSTANCES"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMessageClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageClient.kt\ncom/zykj/message/client/MessageClient$INSTANCES\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1586#2,2:552\n*E\n*S KotlinDebug\n*F\n+ 1 MessageClient.kt\ncom/zykj/message/client/MessageClient$INSTANCES\n*L\n183#1,2:552\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013*\u0001\t\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0017\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001eH\u0016J\u001e\u0010!\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00050#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010$\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0016\u0010$\u001a\u00020\u00052\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00190%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001c\u0010&\u001a\u00020\u00052\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0016\u0010&\u001a\u00020\u00052\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\'0%H\u0016J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000cH\u0016J\u0008\u0010-\u001a\u00020\u001bH\u0016J\u0008\u0010.\u001a\u00020\u001bH\u0016J\u0008\u0010/\u001a\u00020\u0005H\u0002J\u001e\u00100\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J4\u00101\u001a\u00020\u00052\u0014\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#2\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0007H\u0016J\u0008\u00105\u001a\u00020\u0005H\u0002J\u001e\u00106\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050#H\u0016J\u001e\u00107\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\'\u0012\u0004\u0012\u00020\u00050#H\u0016J\u0008\u00108\u001a\u00020\u0005H\u0016J\u0010\u00109\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000cH\u0016J\u0008\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0007H\u0016J\u0008\u0010<\u001a\u00020\u0005H\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient$INSTANCES;",
        "Lcom/zykj/message/client/MessageClient;",
        "doTask",
        "",
        "Lkotlin/Function0;",
        "",
        "listenerList",
        "Lcom/zykj/message/listener/BaseMessageCallBack;",
        "mConnection",
        "com/zykj/message/client/MessageClient$INSTANCES$mConnection$1",
        "Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;",
        "mContext",
        "Landroid/app/Application;",
        "mHandler",
        "Landroid/os/Handler;",
        "remoteServer",
        "Lcom/zykj/message/server/MessageServer;",
        "getRemoteServer",
        "()Lcom/zykj/message/server/MessageServer;",
        "setRemoteServer",
        "(Lcom/zykj/message/server/MessageServer;)V",
        "timeOut",
        "Ljava/util/Timer;",
        "checkStatus",
        "serverInfo",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "hidden",
        "",
        "checkUrl",
        "url",
        "",
        "appName",
        "appPackageName",
        "getSNInfo",
        "callBack",
        "Lkotlin/Function1;",
        "getServerInfo",
        "Lcom/zykj/message/client/DataCallBack;",
        "getUserInfo",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "goUnInstallActivity",
        "context",
        "Landroid/content/Context;",
        "goUnLoginActivity",
        "init",
        "isInit",
        "isInstallApp",
        "reStartService",
        "refreshToken",
        "registerListener",
        "serverCallBack",
        "userCallBack",
        "messageCallBack",
        "registerResumeListener",
        "registerServerListener",
        "registerUserListener",
        "requestLogout",
        "startService",
        "stopService",
        "unRegisterListener",
        "unRegisterResumeListener",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field private final doTask:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private listenerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/message/listener/BaseMessageCallBack;",
            ">;"
        }
    .end annotation
.end field

.field private final mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

.field private mContext:Landroid/app/Application;

.field private final mHandler:Landroid/os/Handler;

.field private remoteServer:Lcom/zykj/message/server/MessageServer;

.field private timeOut:Ljava/util/Timer;


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    .line 41
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    .line 43
    new-instance p1, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    invoke-direct {p1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 78
    new-instance p1, Landroid/os/Handler;

    new-instance p2, Lcom/zykj/message/client/MessageClient$INSTANCES$mHandler$1;

    invoke-direct {p2, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$mHandler$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    check-cast p2, Landroid/os/Handler$Callback;

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic access$checkStatus(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->checkStatus(Lcom/zykj/message/server/bean/ServerInfo;Z)V

    return-void
.end method

.method public static final synthetic access$getListenerList$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/List;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMConnection$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    return-object p0
.end method

.method public static final synthetic access$getMContext$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;
    .locals 1

    .line 28
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p0, :cond_0

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;)Ljava/util/Timer;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->timeOut:Ljava/util/Timer;

    return-object p0
.end method

.method public static final synthetic access$registerResumeListener(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->registerResumeListener()V

    return-void
.end method

.method public static final synthetic access$setListenerList$p(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/List;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$setMContext$p(Lcom/zykj/message/client/MessageClient$INSTANCES;Landroid/app/Application;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    return-void
.end method

.method public static final synthetic access$setTimeOut$p(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/util/Timer;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->timeOut:Ljava/util/Timer;

    return-void
.end method

.method private final checkStatus(Lcom/zykj/message/server/bean/ServerInfo;Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 181
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->getStatus()Lcom/zykj/message/server/bean/Status;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->LOGOUT:Lcom/zykj/message/server/bean/Status;

    :goto_0
    sget-object v0, Lcom/zykj/message/client/MessageClient$INSTANCES$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/zykj/message/server/bean/Status;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    const-string v1, "mContext"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto :goto_2

    .line 192
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->goUnLoginActivity(Landroid/content/Context;Z)V

    goto :goto_2

    .line 189
    :cond_3
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->goUnLoginActivity(Landroid/content/Context;Z)V

    goto :goto_2

    .line 183
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 552
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 184
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_1

    .line 186
    :cond_6
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :goto_2
    return-void
.end method

.method static synthetic checkStatus$default(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 180
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES;->checkStatus(Lcom/zykj/message/server/bean/ServerInfo;Z)V

    return-void
.end method

.method private final reStartService()V
    .locals 4

    .line 152
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.zykj.action.zykj.message.service.awaken"

    .line 153
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    .line 154
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 155
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v1, :cond_0

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1, v0}, Landroid/app/Application;->startActivity(Landroid/content/Intent;)V

    .line 157
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->timeOut:Ljava/util/Timer;

    if-eqz v0, :cond_1

    .line 158
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;

    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$reStartService$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    check-cast v1, Ljava/util/TimerTask;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1
    return-void
.end method

.method private final registerResumeListener()V
    .locals 2

    .line 91
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;

    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerResumeListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V

    check-cast v1, Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    invoke-virtual {v0, v1}, Lcom/zykj/message/client/ActivityCollectionHelper;->registerResumeListener(Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;)V

    return-void
.end method

.method private final unRegisterResumeListener()V
    .locals 1

    .line 99
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->unRegisterResumeListener()V

    return-void
.end method


# virtual methods
.method public checkUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPackageName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 354
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-interface {v0, p1, p2, p3}, Lcom/zykj/message/server/MessageServer;->checkUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 356
    :cond_2
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$checkUrl$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/zykj/message/client/MessageClient$INSTANCES$checkUrl$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 359
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_3

    const-string p2, "mContext"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public final getRemoteServer()Lcom/zykj/message/server/MessageServer;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    return-object v0
.end method

.method public getSNInfo()Ljava/lang/String;
    .locals 2

    .line 325
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->getSNInfo()Ljava/lang/String;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getSNInfo(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 310
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getSNInfo$2;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;
    .locals 2

    .line 297
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getServerInfo(Lcom/zykj/message/client/DataCallBack;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/DataCallBack<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/client/DataCallBack;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 261
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/client/DataCallBack;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public getServerInfo(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$3;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$3;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 282
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public getUserInfo()Lcom/zykj/message/server/bean/UserInfo;
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->getUserInfo()Lcom/zykj/message/server/bean/UserInfo;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public getUserInfo(Lcom/zykj/message/client/DataCallBack;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/DataCallBack<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/client/DataCallBack;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 212
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 214
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$2;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$2;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/client/DataCallBack;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public getUserInfo(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$3;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 233
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 235
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->doTask:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public goUnInstallActivity(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    const-string v1, "ActivityCollectionHelper.with()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->getTopActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->getTopActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 367
    :cond_0
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->finishAll()V

    .line 368
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/zykj/message/UnInstallActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "hidden"

    .line 369
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    .line 370
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x4000000

    .line 371
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 372
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "MessageClient"

    const-string p2, "\u53bb\u542f\u52a8\u5b89\u88c5\u754c\u9762"

    .line 373
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public goUnLoginActivity(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 377
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    const-string v1, "ActivityCollectionHelper.with()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->getTopActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->getTopActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/zykj/message/UnLoginActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 380
    :cond_0
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->finishAll()V

    .line 381
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/zykj/message/UnLoginActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "hidden"

    .line 382
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    .line 383
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p2, 0x4000000

    .line 384
    invoke-virtual {v0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 385
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "MessageClient"

    const-string p2, "\u53bb\u542f\u52a8\u767b\u5f55\u754c\u9762"

    .line 386
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public init(Landroid/app/Application;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    .line 105
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object p1

    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v0, :cond_0

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->register(Landroid/app/Application;)V

    return-void
.end method

.method public isInit()Z
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_0

    .line 464
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isInstallApp()Z
    .locals 3

    .line 453
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v0, :cond_0

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.zykj.manage"

    .line 455
    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    return v1
.end method

.method public declared-synchronized refreshToken(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_2

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 334
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$refreshToken$1;

    invoke-direct {v1, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$refreshToken$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lcom/zykj/message/server/MessageCallBack;

    invoke-interface {v0, v1}, Lcom/zykj/message/server/MessageServer;->refreshToken(Lcom/zykj/message/server/MessageCallBack;)V

    goto :goto_3

    .line 340
    :cond_2
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v0, :cond_3

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    const v0, 0x7fffffff

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_8

    const-wide/16 v2, 0x64

    .line 343
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 344
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lcom/zykj/message/server/MessageServer;->getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object v2

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    if-nez v2, :cond_6

    const/16 v2, 0x28

    if-le v1, v2, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 345
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;

    move-result-object v3

    :cond_7
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    monitor-exit p0

    return-void

    .line 350
    :cond_8
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_5

    :goto_4
    throw p1

    :goto_5
    goto :goto_4
.end method

.method public registerListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V
    .locals 2

    const-string v0, "messageCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 391
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/listener/BaseMessageCallBack;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 393
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 395
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public registerListener(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "serverCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userCallBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 405
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerListener$2;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 412
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/listener/DefaultMessageCallBack;

    invoke-direct {v1, p1, p2}, Lcom/zykj/message/listener/DefaultMessageCallBack;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string p2, "mContext"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public registerServerListener(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 423
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 425
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/listener/DefaultMessageCallBack;

    sget-object v2, Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$2;->INSTANCE:Lcom/zykj/message/client/MessageClient$INSTANCES$registerServerListener$2;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, p1, v2}, Lcom/zykj/message/listener/DefaultMessageCallBack;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 426
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public registerUserListener(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 431
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 432
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$registerUserListener$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$registerUserListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 434
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 436
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    new-instance v1, Lcom/zykj/message/listener/DefaultMessageCallBack;

    sget-object v2, Lcom/zykj/message/client/MessageClient$INSTANCES$registerUserListener$2;->INSTANCE:Lcom/zykj/message/client/MessageClient$INSTANCES$registerUserListener$2;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v2, p1}, Lcom/zykj/message/listener/DefaultMessageCallBack;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 437
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method

.method public requestLogout()V
    .locals 4

    .line 470
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.zykj.action.zykj.LOGOUT"

    .line 471
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 473
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.zykj.manage"

    const-string v3, "com.zykj.center.receiver.LogoutReceiver"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 474
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v1, :cond_0

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1, v0}, Landroid/app/Application;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public final setRemoteServer(Lcom/zykj/message/server/MessageServer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    return-void
.end method

.method public startService(Landroid/app/Application;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    .line 111
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object p1

    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    const-string v1, "mContext"

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1, v0}, Lcom/zykj/message/client/ActivityCollectionHelper;->register(Landroid/app/Application;)V

    .line 113
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->isInstallApp()Z

    move-result p1

    if-nez p1, :cond_2

    .line 114
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    check-cast p1, Landroid/content/Context;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->goUnInstallActivity(Landroid/content/Context;Z)V

    return-void

    .line 118
    :cond_2
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz p1, :cond_5

    if-eqz p1, :cond_4

    .line 119
    invoke-interface {p1}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroid/os/IBinder;->pingBinder()Z

    move-result p1

    if-nez p1, :cond_4

    .line 121
    :try_start_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    check-cast v0, Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    const/4 p1, 0x0

    .line 125
    check-cast p1, Lcom/zykj/message/server/MessageServer;

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    .line 128
    :cond_5
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-nez p1, :cond_9

    .line 130
    :try_start_1
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    check-cast v0, Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 134
    :goto_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "com.zykj.action.zykj.message.service"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.zykj.manage"

    .line 135
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5f00\u59cb\u8fde\u63a5\u670d\u52a1->"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MessageClient"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    check-cast v1, Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, p1, v1, v3}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_8

    .line 140
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u5931\u8d25,\u51c6\u5907\u91cd\u65b0\u542f\u52a8\u8be5\u4efb\u52a1 "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    invoke-direct {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->reStartService()V

    goto :goto_1

    .line 145
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u7ed1\u5b9a\u4e2a\u4eba\u4e2d\u5fc3\u670d\u52a1\u6210\u529f result= true : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    :goto_1
    return-void
.end method

.method public stopService()V
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    const-string v1, "mContext"

    if-eqz v0, :cond_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 199
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mConnection:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    check-cast v2, Landroid/content/ServiceConnection;

    invoke-virtual {v0, v2}, Landroid/app/Application;->unbindService(Landroid/content/ServiceConnection;)V

    .line 202
    :cond_1
    invoke-static {}, Lcom/zykj/message/client/ActivityCollectionHelper;->with()Lcom/zykj/message/client/ActivityCollectionHelper;

    move-result-object v0

    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, v2}, Lcom/zykj/message/client/ActivityCollectionHelper;->unRegister(Landroid/app/Application;)V

    return-void
.end method

.method public unRegisterListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V
    .locals 2

    const-string v0, "messageCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->remoteServer:Lcom/zykj/message/server/MessageServer;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-interface {v0}, Lcom/zykj/message/server/MessageServer;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v0}, Landroid/os/IBinder;->pingBinder()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 443
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;

    invoke-direct {v1, p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$unRegisterListener$1;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/listener/BaseMessageCallBack;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 445
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 447
    :cond_1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->listenerList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES;->mContext:Landroid/app/Application;

    if-nez p1, :cond_2

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->startService(Landroid/app/Application;)V

    :goto_0
    return-void
.end method
