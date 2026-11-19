.class public abstract enum Lcom/zykj/message/client/MessageClient;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/client/MessageClient$INSTANCES;
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
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u0000 22\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u00013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008\r\u0010\u0010J\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\u0008\r\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00120\nH&\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00042\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00042\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J\'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008 \u0010!J;\u0010 \u001a\u00020\u00042\u0014\u0010\"\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000f2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008 \u0010$J%\u0010%\u001a\u00020\u00042\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008%\u0010\u0010J%\u0010&\u001a\u00020\u00042\u0014\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\u000fH&\u00a2\u0006\u0004\u0008&\u0010\u0010J\u0017\u0010\'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008\'\u0010!J!\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020(2\u0008\u0008\u0002\u0010*\u001a\u00020)H&\u00a2\u0006\u0004\u0008+\u0010,J!\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020(2\u0008\u0008\u0002\u0010*\u001a\u00020)H&\u00a2\u0006\u0004\u0008-\u0010,J\u000f\u0010.\u001a\u00020)H&\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020)H&\u00a2\u0006\u0004\u00080\u0010/J\u000f\u00101\u001a\u00020\u0004H&\u00a2\u0006\u0004\u00081\u0010\tj\u0002\u00084\u00a8\u00065"
    }
    d2 = {
        "Lcom/zykj/message/client/MessageClient;",
        "",
        "Landroid/app/Application;",
        "context",
        "Ld6/s;",
        "init",
        "(Landroid/app/Application;)V",
        "startService",
        "stopService",
        "()V",
        "Lcom/zykj/message/client/c;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "callBack",
        "getUserInfo",
        "(Lcom/zykj/message/client/c;)V",
        "Lkotlin/Function1;",
        "(Lr6/c;)V",
        "()Lcom/zykj/message/server/bean/UserInfo;",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "getServerInfo",
        "()Lcom/zykj/message/server/bean/ServerInfo;",
        "",
        "getSNInfo",
        "()Ljava/lang/String;",
        "refreshToken",
        "url",
        "appName",
        "appPackageName",
        "checkUrl",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Lc4/a;",
        "messageCallBack",
        "registerListener",
        "(Lc4/a;)V",
        "serverCallBack",
        "userCallBack",
        "(Lr6/c;Lr6/c;)V",
        "registerServerListener",
        "registerUserListener",
        "unRegisterListener",
        "Landroid/content/Context;",
        "",
        "hidden",
        "goUnInstallActivity",
        "(Landroid/content/Context;Z)V",
        "goUnLoginActivity",
        "isInstallApp",
        "()Z",
        "isInit",
        "requestLogout",
        "Companion",
        "com/zykj/message/client/d",
        "INSTANCES",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/message/client/d;

.field public static final enum INSTANCES:Lcom/zykj/message/client/MessageClient;

.field public static final INTENT_KEY:Ljava/lang/String; = "hidden"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final LOGOUT_ACTION_NAME:Ljava/lang/String; = "com.zykj.action.zykj.LOGOUT"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final RESTART_SERVER_FAIL:I = 0x2

.field public static final SERVER_REQUEST_CODE:I = 0xc8

.field public static final synthetic a:[Lcom/zykj/message/client/MessageClient;

.field public static final serverAction:Ljava/lang/String; = "com.zykj.action.zykj.message.service"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final serverAwakenAction:Ljava/lang/String; = "com.zykj.action.zykj.message.service.awaken"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final serverLoginAction:Ljava/lang/String; = "com.zykj.action.zykj.LOGIN"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final serverPackageName:Ljava/lang/String; = "com.zykj.manage"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    const-string v1, "INSTANCES"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lcom/zykj/message/client/MessageClient;

    .line 13
    .line 14
    aput-object v0, v1, v2

    .line 15
    .line 16
    sput-object v1, Lcom/zykj/message/client/MessageClient;->a:[Lcom/zykj/message/client/MessageClient;

    .line 17
    .line 18
    new-instance v0, Lcom/zykj/message/client/d;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/zykj/message/client/MessageClient;->Companion:Lcom/zykj/message/client/d;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic goUnInstallActivity$default(Lcom/zykj/message/client/MessageClient;Landroid/content/Context;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;->goUnInstallActivity(Landroid/content/Context;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic goUnLoginActivity$default(Lcom/zykj/message/client/MessageClient;Landroid/content/Context;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/message/client/MessageClient;->goUnLoginActivity(Landroid/content/Context;Z)V

    .line 7
    .line 8
    .line 9
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

    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:[Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, [Lcom/zykj/message/client/MessageClient;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/message/client/MessageClient;

    return-object v0
.end method


# virtual methods
.method public abstract checkUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract getSNInfo()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getSNInfo(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getServerInfo()Lcom/zykj/message/server/bean/ServerInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getServerInfo(Lcom/zykj/message/client/c;)V
    .param p1    # Lcom/zykj/message/client/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getServerInfo(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getUserInfo()Lcom/zykj/message/server/bean/UserInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getUserInfo(Lcom/zykj/message/client/c;)V
    .param p1    # Lcom/zykj/message/client/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/message/client/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getUserInfo(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract goUnInstallActivity(Landroid/content/Context;Z)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract goUnLoginActivity(Landroid/content/Context;Z)V
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract init(Landroid/app/Application;)V
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isInit()Z
.end method

.method public abstract isInstallApp()Z
.end method

.method public abstract refreshToken(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerListener(Lc4/a;)V
    .param p1    # Lc4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract registerListener(Lr6/c;Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerServerListener(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerUserListener(Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract requestLogout()V
.end method

.method public abstract startService(Landroid/app/Application;)V
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract stopService()V
.end method

.method public abstract unRegisterListener(Lc4/a;)V
    .param p1    # Lc4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
