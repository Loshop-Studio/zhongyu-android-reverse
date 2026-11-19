.class public abstract Lcom/aliyun/ams/emas/push/AgooMessageReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lcom/aliyun/ams/emas/push/b;
.implements Lcom/aliyun/ams/emas/push/c;


# static fields
.field public static final EXTRA_MAP:Ljava/lang/String; = "extraMap"

.field public static final MESSAGE_ID:Ljava/lang/String; = "messageId"

.field public static final NOTIFICATION_GROUP:Ljava/lang/String; = "group"

.field public static final NOTIFICATION_ID:Ljava/lang/String; = "notificationId"

.field public static final NOTIFICATION_OPENED_ACTION:Ljava/lang/String; = "com.alibaba.push2.action.NOTIFICATION_OPENED"

.field public static final NOTIFICATION_OPEN_TYPE:Ljava/lang/String; = "notificationOpenType"

.field public static final NOTIFICATION_REMOVED_ACTION:Ljava/lang/String; = "com.alibaba.push2.action.NOTIFICATION_REMOVED"

.field public static final SUMMARY:Ljava/lang/String; = "summary"

.field public static final TAG:Ljava/lang/String; = "MPS:AgooMessageReceiver"

.field public static final TITLE:Ljava/lang/String; = "title"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AgooMessageReceiver onReceive begin...intent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MPS:AgooMessageReceiver"

    invoke-static {v3, v0, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v2, "com.alibaba.sdk.android.push.RECEIVE"

    .line 4
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-static {p1, p2, p0, p0}, Lcom/aliyun/ams/emas/push/f;->b(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/c;Lcom/aliyun/ams/emas/push/b;)V

    goto :goto_0

    :cond_1
    const-string v2, "com.alibaba.push2.action.NOTIFICATION_OPENED"

    .line 6
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 7
    invoke-static {p1, p2, p0}, Lcom/aliyun/ams/emas/push/f;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V

    goto :goto_0

    :cond_2
    const-string v2, "com.alibaba.push2.action.NOTIFICATION_REMOVED"

    .line 8
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    invoke-static {p1, p2, p0}, Lcom/aliyun/ams/emas/push/f;->e(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-array p2, v1, [Ljava/lang/Object;

    const-string v0, "handle action error:"

    .line 10
    invoke-static {v3, v0, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method
