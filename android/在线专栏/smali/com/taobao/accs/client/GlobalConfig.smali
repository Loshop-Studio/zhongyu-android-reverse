.class public Lcom/taobao/accs/client/GlobalConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static enableCookie:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static setChannelProcessName(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mChannelProcessName:Ljava/lang/String;

    return-void
.end method

.method public static setControlFrameMaxRetry(I)V
    .locals 0

    sput p0, Lcom/taobao/accs/data/Message;->a:I

    return-void
.end method

.method public static setCurrProcessNameImpl(Lcom/taobao/accs/IProcessName;)V
    .locals 0

    sput-object p0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mProcessNameImpl:Lcom/taobao/accs/IProcessName;

    return-void
.end method

.method public static setEnableForeground(Landroid/content/Context;Z)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "enable"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "GlobalConfig"

    const-string v3, "setEnableForeground"

    invoke-static {v1, v3, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x18

    :goto_0
    const-string p1, "support_foreground_v"

    .line 2
    invoke-static {p0, p1, v2}, Lcom/taobao/accs/utl/OrangeAdapter;->saveConfigToSP(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static setMainProcessName(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mMainProcessName:Ljava/lang/String;

    return-void
.end method
