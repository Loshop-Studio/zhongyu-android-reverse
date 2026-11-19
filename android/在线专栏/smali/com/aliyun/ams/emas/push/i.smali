.class final Lcom/aliyun/ams/emas/push/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aliyun/ams/emas/push/k;


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ll1/a;

.field final synthetic c:Ll1/b;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lcom/aliyun/ams/emas/push/b;


# direct methods
.method constructor <init>(Ljava/util/Map;Ll1/a;Ll1/b;Landroid/content/Context;Lcom/aliyun/ams/emas/push/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aliyun/ams/emas/push/i;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    iput-object p3, p0, Lcom/aliyun/ams/emas/push/i;->c:Ll1/b;

    iput-object p4, p0, Lcom/aliyun/ams/emas/push/i;->d:Landroid/content/Context;

    iput-object p5, p0, Lcom/aliyun/ams/emas/push/i;->e:Lcom/aliyun/ams/emas/push/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Notification;Landroid/app/Notification;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/aliyun/ams/emas/push/i;->a:Ljava/util/Map;

    const-string v1, "emas_group"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    invoke-virtual {v1, v0}, Ll1/a;->C(Ljava/lang/String;)V

    .line 4
    :cond_0
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "push created notification"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    .line 5
    invoke-virtual {v2}, Ll1/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/aliyun/ams/emas/push/i;->c:Ll1/b;

    iget-object v2, p0, Lcom/aliyun/ams/emas/push/i;->d:Landroid/content/Context;

    iget-object v3, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    invoke-virtual {v1, v2, p1, p2, v3}, Ll1/b;->d(Landroid/content/Context;Landroid/app/Notification;Landroid/app/Notification;Ll1/a;)V

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "push onNotificationShow "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    .line 9
    invoke-virtual {p2}, Ll1/a;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-interface {v0, p1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/aliyun/ams/emas/push/i;->e:Lcom/aliyun/ams/emas/push/b;

    iget-object p2, p0, Lcom/aliyun/ams/emas/push/i;->d:Landroid/content/Context;

    iget-object v0, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    .line 12
    invoke-virtual {v0}, Ll1/a;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    invoke-virtual {v1}, Ll1/a;->h()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/aliyun/ams/emas/push/i;->b:Ll1/a;

    .line 13
    invoke-virtual {v2}, Ll1/a;->l()Ljava/util/Map;

    move-result-object v2

    .line 14
    invoke-interface {p1, p2, v0, v1, v2}, Lcom/aliyun/ams/emas/push/b;->onNotificationShow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
