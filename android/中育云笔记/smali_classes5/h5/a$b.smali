.class public Lh5/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

.field public d:Ljava/lang/String;

.field public e:Landroid/content/Context;

.field public f:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public g:Li5/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5/a$b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lh5/a$b;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    .line 9
    .line 10
    iput-object p4, p0, Lh5/a$b;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lh5/a$b;->e:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lh5/a$b;->f:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lh5/a$b;->g:Li5/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    .line 1
    iget-object v0, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s"

    if-nez v0, :cond_0

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lh5/a$b;->b:Ljava/lang/String;

    iget-object v4, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-static {v4}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    iget-object v1, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File"

    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$b;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    move-result-object v2

    iget-object v3, p0, Lh5/a$b;->e:Landroid/content/Context;

    iget-object v4, p0, Lh5/a$b;->g:Li5/a;

    iget-object v5, p0, Lh5/a$b;->f:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    iget-object v6, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v7, p0, Lh5/a$b;->b:Ljava/lang/String;

    const/4 v8, 0x1

    invoke-virtual/range {v2 .. v8}, Lj5/b;->b(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v4, p0, Lh5/a$b;->b:Ljava/lang/String;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"

    invoke-static {v2, v4, v3}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v4, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    invoke-interface {v1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lh5/a$b;->b:Ljava/lang/String;

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "GrsClientManager.ayncGetGrsUrl\uff1aReturn [%s][%s] Url is Empty"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackFail(I)V

    return-void
.end method

.method public a(Lk5/d;)V
    .locals 10

    .line 2
    invoke-virtual {p1}, Lk5/d;->y()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$b;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lh5/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s"

    invoke-static {p1, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    iget-object v1, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s"

    if-nez v1, :cond_1

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    iget-object v0, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lh5/a$b;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v1, p0, Lh5/a$b;->b:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The serviceName[%s][%s] is not configured on the GRS server."

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File"

    invoke-static {p1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$b;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    move-result-object v3

    iget-object v4, p0, Lh5/a$b;->e:Landroid/content/Context;

    iget-object v5, p0, Lh5/a$b;->g:Li5/a;

    iget-object v6, p0, Lh5/a$b;->f:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    iget-object v7, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v8, p0, Lh5/a$b;->b:Ljava/lang/String;

    const/4 v9, 0x1

    invoke-virtual/range {v3 .. v9}, Lj5/b;->b(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lh5/a$b;->b:Ljava/lang/String;

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"

    invoke-static {v0, v3, v1}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lh5/a$b;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v1, v3, v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$b;->a:Ljava/lang/String;

    iget-object v1, p0, Lh5/a$b;->b:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "GrsClientManager.ayncGetGrsUrl\uff1aReturn [%s][%s] Url is Empty"

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$b;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;

    const/4 v0, -0x5

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackFail(I)V

    return-void
.end method
