.class public Lcom/aliyun/ams/emas/push/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/aliyun/ams/emas/push/j;->f:Z

    .line 3
    iput-object p1, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(IIIILcom/aliyun/ams/emas/push/a;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setDoNotDisturb "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MPS:CloudPushService"

    invoke-static {v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-ltz p1, :cond_2

    const/16 v0, 0x17

    if-gt p1, v0, :cond_2

    if-ltz p3, :cond_2

    if-gt p3, v0, :cond_2

    if-ltz p2, :cond_2

    const/16 v0, 0x3b

    if-gt p2, v0, :cond_2

    if-ltz p4, :cond_2

    if-le p4, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/aliyun/ams/emas/push/j;->f:Z

    .line 3
    iput p1, p0, Lcom/aliyun/ams/emas/push/j;->b:I

    .line 4
    iput p2, p0, Lcom/aliyun/ams/emas/push/j;->c:I

    .line 5
    iput p3, p0, Lcom/aliyun/ams/emas/push/j;->d:I

    .line 6
    iput p4, p0, Lcom/aliyun/ams/emas/push/j;->e:I

    if-eqz p5, :cond_1

    const-string p1, ""

    .line 7
    invoke-interface {p5, p1}, Lcom/aliyun/ams/emas/push/a;->onSuccess(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    if-eqz p5, :cond_3

    .line 8
    sget-object p1, Lcom/taobao/agoo/a;->INVALID_ARG:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p2, p1}, Lcom/aliyun/ams/emas/push/a;->onFailed(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public b(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "MPS:CloudPushService"

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    if-nez v2, :cond_1

    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "context is null"

    .line 3
    invoke-static {v1, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_1
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 5
    sget-object v3, Lcom/aliyun/ams/emas/push/l;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object v3, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/aliyun/ams/emas/push/MsgService;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "action_type"

    const-string v4, "message_open"

    .line 7
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "msgId"

    .line 8
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "extData"

    .line 9
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    iget-object p1, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    invoke-virtual {p1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Click message event upload failed."

    .line 11
    invoke-static {v1, v2, p1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "message is null"

    .line 12
    invoke-static {v1, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/aliyun/ams/emas/push/j;->f:Z

    return-void
.end method

.method public d()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/aliyun/ams/emas/push/j;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 3
    iget v2, p0, Lcom/aliyun/ams/emas/push/j;->b:I

    mul-int/lit8 v2, v2, 0x3c

    iget v3, p0, Lcom/aliyun/ams/emas/push/j;->c:I

    add-int/2addr v2, v3

    .line 4
    iget v3, p0, Lcom/aliyun/ams/emas/push/j;->d:I

    mul-int/lit8 v3, v3, 0x3c

    iget v4, p0, Lcom/aliyun/ams/emas/push/j;->e:I

    add-int/2addr v3, v4

    const/16 v4, 0xb

    .line 5
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x3c

    const/16 v5, 0xc

    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/2addr v4, v0

    const/4 v0, 0x1

    if-gt v2, v3, :cond_2

    if-lt v4, v2, :cond_1

    if-gt v4, v3, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    if-ge v4, v2, :cond_3

    if-gt v4, v3, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method public e(Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "MPS:CloudPushService"

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v2, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    if-nez v2, :cond_1

    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "context is null"

    .line 3
    invoke-static {v1, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_1
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 5
    sget-object v3, Lcom/aliyun/ams/emas/push/l;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object v3, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Lcom/aliyun/ams/emas/push/MsgService;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "action_type"

    const-string v4, "message_delete"

    .line 7
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "msgId"

    .line 8
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "extData"

    .line 9
    invoke-virtual {p1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    iget-object p1, p0, Lcom/aliyun/ams/emas/push/j;->a:Landroid/content/Context;

    invoke-virtual {p1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Dismiss message event upload failed."

    .line 11
    invoke-static {v1, v2, p1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    new-array p1, v0, [Ljava/lang/Object;

    const-string v0, "message is null"

    .line 12
    invoke-static {v1, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
