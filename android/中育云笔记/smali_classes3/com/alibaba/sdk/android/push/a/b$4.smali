.class Lcom/alibaba/sdk/android/push/a/b$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/alibaba/sdk/android/push/a/b;->setLogLevel(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/alibaba/sdk/android/push/a/b;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/push/a/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/alibaba/sdk/android/push/a/b$4;->b:Lcom/alibaba/sdk/android/push/a/b;

    iput p2, p0, Lcom/alibaba/sdk/android/push/a/b$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget v0, p0, Lcom/alibaba/sdk/android/push/a/b$4;->a:I

    sput v0, Lcom/alibaba/sdk/android/ams/common/logger/AmsLogger;->log_level:I

    const/4 v0, 0x0

    invoke-static {v0}, Lanet/channel/util/ALog;->setUseTlog(Z)V

    invoke-static {}, Lcom/taobao/accs/ACCSClient;->changeNetworkSdkLoggerToAccs()V

    iget v1, p0, Lcom/alibaba/sdk/android/push/a/b$4;->a:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->enable(Z)V

    const/4 v0, 0x5

    invoke-static {v0}, Lanet/channel/util/ALog;->setLevel(I)V

    return-void

    :cond_0
    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    if-ne v1, v3, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-static {v3}, Lcom/taobao/accs/utl/AccsLogger;->enable(Z)V

    iget v1, p0, Lcom/alibaba/sdk/android/push/a/b$4;->a:I

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_3

    sget-object v1, Lcom/alibaba/sdk/android/logger/LogLevel;->DEBUG:Lcom/alibaba/sdk/android/logger/LogLevel;

    invoke-static {v1}, Lcom/taobao/accs/utl/AccsLogger;->setLevel(Lcom/alibaba/sdk/android/logger/LogLevel;)V

    invoke-static {v0}, Lanet/channel/util/ALog;->setLevel(I)V

    return-void

    :cond_3
    sget-object v0, Lcom/alibaba/sdk/android/logger/LogLevel;->INFO:Lcom/alibaba/sdk/android/logger/LogLevel;

    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->setLevel(Lcom/alibaba/sdk/android/logger/LogLevel;)V

    invoke-static {v2}, Lanet/channel/util/ALog;->setLevel(I)V

    return-void

    :cond_4
    sget-object v0, Lcom/alibaba/sdk/android/logger/LogLevel;->WARN:Lcom/alibaba/sdk/android/logger/LogLevel;

    invoke-static {v0}, Lcom/taobao/accs/utl/AccsLogger;->setLevel(Lcom/alibaba/sdk/android/logger/LogLevel;)V

    const/4 v0, 0x3

    invoke-static {v0}, Lanet/channel/util/ALog;->setLevel(I)V

    return-void
.end method
