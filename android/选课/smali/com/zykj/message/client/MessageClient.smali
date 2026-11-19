.class public abstract enum Lcom/zykj/message/client/MessageClient;
.super Ljava/lang/Enum;
.source "MessageClient.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/client/MessageClient$INSTANCES;,
        Lcom/zykj/message/client/MessageClient$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/message/client/MessageClient;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u0000 (2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\t\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u000bH&J\n\u0010\u000c\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\u000c\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0016\u0010\u000c\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u001c\u0010\u000f\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0016\u0010\u000f\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000eH&J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H&J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0018H&J\u0008\u0010\u0019\u001a\u00020\u0015H&J\u0008\u0010\u001a\u001a\u00020\u0015H&J\u001e\u0010\u001b\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000bH&J4\u0010\u001c\u001a\u00020\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000b2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H&J\u001e\u0010!\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\u000bH&J\u001e\u0010\"\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00040\u000bH&J\u0008\u0010#\u001a\u00020\u0004H&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0018H&J\u0008\u0010%\u001a\u00020\u0004H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H&j\u0002\u0008\'\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient;",
        "",
        "(Ljava/lang/String;I)V",
        "checkUrl",
        "",
        "url",
        "",
        "appName",
        "appPackageName",
        "getSNInfo",
        "callBack",
        "Lkotlin/Function1;",
        "getServerInfo",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lcom/zykj/message/client/DataCallBack;",
        "getUserInfo",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "goUnInstallActivity",
        "context",
        "Landroid/content/Context;",
        "hidden",
        "",
        "goUnLoginActivity",
        "init",
        "Landroid/app/Application;",
        "isInit",
        "isInstallApp",
        "refreshToken",
        "registerListener",
        "serverCallBack",
        "userCallBack",
        "messageCallBack",
        "Lcom/zykj/message/listener/BaseMessageCallBack;",
        "registerServerListener",
        "registerUserListener",
        "requestLogout",
        "startService",
        "stopService",
        "unRegisterListener",
        "INSTANCES",
        "Companion",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/zykj/message/client/MessageClient;

.field public static final Companion:Lcom/zykj/message/client/MessageClient$Companion;

.field public static final enum INSTANCES:Lcom/zykj/message/client/MessageClient;

.field public static final INTENT_KEY:Ljava/lang/String; = "hidden"

.field public static final LOGOUT_ACTION_NAME:Ljava/lang/String; = "com.zykj.action.zykj.LOGOUT"

.field public static final RESTART_SERVER_FAIL:I = 0x2

.field public static final SERVER_REQUEST_CODE:I = 0xc8

.field public static final serverAction:Ljava/lang/String; = "com.zykj.action.zykj.message.service"

.field public static final serverAwakenAction:Ljava/lang/String; = "com.zykj.action.zykj.message.service.awaken"

.field public static final serverLoginAction:Ljava/lang/String; = "com.zykj.action.zykj.LOGIN"

.field public static final serverPackageName:Ljava/lang/String; = "com.zykj.manage"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/zykj/message/client/MessageClient;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES;

    const-string v2, "INSTANCES"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    aput-object v1, v0, v3

    sput-object v0, Lcom/zykj/message/client/MessageClient;->$VALUES:[Lcom/zykj/message/client/MessageClient;

    new-instance v0, Lcom/zykj/message/client/MessageClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/message/client/MessageClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/message/client/MessageClient;->Companion:Lcom/zykj/message/client/MessageClient$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic goUnInstallActivity$default(Lcom/zykj/message/client/MessageClient;Landroid/content/Context;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 509
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;->goUnInstallActivity(Landroid/content/Context;Z)V

    return-void
.end method

.method public static synthetic goUnLoginActivity$default(Lcom/zykj/message/client/MessageClient;Landroid/content/Context;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 510
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;->goUnLoginActivity(Landroid/content/Context;Z)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/message/client/MessageClient;
    .locals 1

    const-class v0, Lcom/zykj/message/client/MessageClient;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/message/client/MessageClient;

    return-object p0
.end method

.method public static values()[Lcom/zykj/message/client/MessageClient;
    .locals 1

    sget-object v0, Lcom/zykj/message/client/MessageClient;->$VALUES:[Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, [Lcom/zykj/message/client/MessageClient;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/client/MessageClient;

    return-object v0
.end method


# virtual methods
.method public abstract checkUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract getSNInfo()Ljava/lang/String;
.end method

.method public abstract getSNInfo(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;
.end method

.method public abstract getServerInfo(Lcom/zykj/message/client/DataCallBack;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/DataCallBack<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getServerInfo(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract getUserInfo()Lcom/zykj/message/server/bean/UserInfo;
.end method

.method public abstract getUserInfo(Lcom/zykj/message/client/DataCallBack;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/DataCallBack<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getUserInfo(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract goUnInstallActivity(Landroid/content/Context;Z)V
.end method

.method public abstract goUnLoginActivity(Landroid/content/Context;Z)V
.end method

.method public abstract init(Landroid/app/Application;)V
.end method

.method public abstract isInit()Z
.end method

.method public abstract isInstallApp()Z
.end method

.method public abstract refreshToken(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract registerListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V
.end method

.method public abstract registerListener(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract registerServerListener(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract registerUserListener(Lkotlin/jvm/functions/Function1;)V
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
.end method

.method public abstract requestLogout()V
.end method

.method public abstract startService(Landroid/app/Application;)V
.end method

.method public abstract stopService()V
.end method

.method public abstract unRegisterListener(Lcom/zykj/message/listener/BaseMessageCallBack;)V
.end method
