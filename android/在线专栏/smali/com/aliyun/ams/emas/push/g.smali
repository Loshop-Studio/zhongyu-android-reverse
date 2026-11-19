.class final Lcom/aliyun/ams/emas/push/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/aliyun/ams/emas/push/c;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Z

.field final synthetic f:Landroid/os/Handler;

.field final synthetic g:Lcom/aliyun/ams/emas/push/k;


# direct methods
.method constructor <init>(Lcom/aliyun/ams/emas/push/c;Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;ZLandroid/os/Handler;Lcom/aliyun/ams/emas/push/k;)V
    .locals 0

    iput-object p1, p0, Lcom/aliyun/ams/emas/push/g;->a:Lcom/aliyun/ams/emas/push/c;

    iput-object p2, p0, Lcom/aliyun/ams/emas/push/g;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/aliyun/ams/emas/push/g;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/aliyun/ams/emas/push/g;->d:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/aliyun/ams/emas/push/g;->e:Z

    iput-object p6, p0, Lcom/aliyun/ams/emas/push/g;->f:Landroid/os/Handler;

    iput-object p7, p0, Lcom/aliyun/ams/emas/push/g;->g:Lcom/aliyun/ams/emas/push/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/aliyun/ams/emas/push/g;->a:Lcom/aliyun/ams/emas/push/c;

    iget-object v1, p0, Lcom/aliyun/ams/emas/push/g;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/aliyun/ams/emas/push/g;->c:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Lcom/aliyun/ams/emas/push/c;->customNotificationUI(Landroid/content/Context;Ljava/util/Map;)Landroid/app/Notification;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/aliyun/ams/emas/push/g;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/aliyun/ams/emas/push/g;->e:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    .line 3
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/aliyun/ams/emas/push/g;->a:Lcom/aliyun/ams/emas/push/c;

    iget-object v2, p0, Lcom/aliyun/ams/emas/push/g;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/aliyun/ams/emas/push/g;->c:Ljava/util/Map;

    invoke-interface {v1, v2, v3}, Lcom/aliyun/ams/emas/push/c;->customSummaryNotification(Landroid/content/Context;Ljava/util/Map;)Landroid/app/Notification;

    move-result-object v1

    .line 4
    :goto_1
    iget-object v2, p0, Lcom/aliyun/ams/emas/push/g;->f:Landroid/os/Handler;

    if-eqz v2, :cond_2

    .line 5
    new-instance v3, Lcom/aliyun/ams/emas/push/h;

    invoke-direct {v3, p0, v0, v1}, Lcom/aliyun/ams/emas/push/h;-><init>(Lcom/aliyun/ams/emas/push/g;Landroid/app/Notification;Landroid/app/Notification;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 6
    :cond_2
    iget-object v2, p0, Lcom/aliyun/ams/emas/push/g;->g:Lcom/aliyun/ams/emas/push/k;

    invoke-interface {v2, v0, v1}, Lcom/aliyun/ams/emas/push/k;->a(Landroid/app/Notification;Landroid/app/Notification;)V

    :goto_2
    return-void
.end method
