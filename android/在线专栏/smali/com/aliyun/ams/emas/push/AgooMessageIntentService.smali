.class public abstract Lcom/aliyun/ams/emas/push/AgooMessageIntentService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/aliyun/ams/emas/push/b;
.implements Lcom/aliyun/ams/emas/push/c;


# static fields
.field private static final TAG:Ljava/lang/String; = "MPS:AliyunMessageIntentService"


# instance fields
.field private messenger:Landroid/os/Messenger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/aliyun/ams/emas/push/e;

    invoke-direct {v1, p0}, Lcom/aliyun/ams/emas/push/e;-><init>(Lcom/aliyun/ams/emas/push/AgooMessageIntentService;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/aliyun/ams/emas/push/AgooMessageIntentService;->messenger:Landroid/os/Messenger;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Lcom/aliyun/ams/emas/push/AgooMessageIntentService;->messenger:Landroid/os/Messenger;

    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "MPS:AliyunMessageIntentService"

    if-eqz v1, :cond_0

    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Action is null, return."

    .line 3
    invoke-static {v3, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AgooMessageIntentService onHandleIntent action: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v1, v4}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "com.alibaba.sdk.android.push.RECEIVE"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p0, p0}, Lcom/aliyun/ams/emas/push/f;->b(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/c;Lcom/aliyun/ams/emas/push/b;)V

    goto :goto_0

    :cond_1
    const-string v1, "com.alibaba.push2.action.NOTIFICATION_OPENED"

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lcom/aliyun/ams/emas/push/f;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V

    goto :goto_0

    :cond_2
    const-string v1, "com.alibaba.push2.action.NOTIFICATION_REMOVED"

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lcom/aliyun/ams/emas/push/f;->e(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V

    goto :goto_0

    :cond_3
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Invalid action"

    .line 11
    invoke-static {v3, v0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aliyun/ams/emas/push/AgooMessageIntentService;->onHandleIntent(Landroid/content/Intent;)V

    const/4 p1, 0x2

    return p1
.end method
