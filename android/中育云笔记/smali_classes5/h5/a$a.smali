.class public Lh5/a$a;
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
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/util/Map;

.field public c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

.field public d:Landroid/content/Context;

.field public e:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public f:Li5/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5/a$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lh5/a$a;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    .line 9
    .line 10
    iput-object p4, p0, Lh5/a$a;->d:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lh5/a$a;->e:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 13
    .line 14
    iput-object p6, p0, Lh5/a$a;->f:Li5/a;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lh5/a$a;->b:Ljava/util/Map;

    const-string v1, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s"

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lh5/a$a;->a:Ljava/lang/String;

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, p0, Lh5/a$a;->b:Ljava/util/Map;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    iget-object v1, p0, Lh5/a$a;->b:Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh5/a$a;->b:Ljava/util/Map;

    if-nez v0, :cond_4

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File"

    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    move-result-object v2

    iget-object v3, p0, Lh5/a$a;->d:Landroid/content/Context;

    iget-object v4, p0, Lh5/a$a;->f:Li5/a;

    iget-object v5, p0, Lh5/a$a;->e:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    iget-object v6, p0, Lh5/a$a;->a:Ljava/lang/String;

    const/4 v7, 0x1

    invoke-virtual/range {v2 .. v7}, Lj5/b;->c(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lh5/a$a;->a:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"

    invoke-static {v2, v4, v3}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_0
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lh5/a$a;->a:Ljava/lang/String;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    invoke-interface {v1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    return-void

    :cond_4
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$a;->a:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "GrsClientManager.ayncGetGrsUrls\uff1aReturn [%s] Urls is Empty"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackFail(I)V

    return-void
.end method

.method public a(Lk5/d;)V
    .locals 6

    .line 2
    invoke-virtual {p1}, Lk5/d;->y()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$a;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lh5/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lh5/a$a;->a:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s"

    invoke-static {p1, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh5/a$a;->b:Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$a;->a:Ljava/lang/String;

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lh5/a$a;->b:Ljava/util/Map;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s"

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    iget-object v0, p0, Lh5/a$a;->b:Ljava/util/Map;

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    return-void

    :cond_1
    iget-object v0, p0, Lh5/a$a;->b:Ljava/util/Map;

    if-nez v0, :cond_6

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$a;->a:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The serviceName[%s] is not configured on the GRS server."

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File"

    invoke-static {p1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$a;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    move-result-object v0

    iget-object v1, p0, Lh5/a$a;->d:Landroid/content/Context;

    iget-object v2, p0, Lh5/a$a;->f:Li5/a;

    iget-object v3, p0, Lh5/a$a;->e:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    iget-object v4, p0, Lh5/a$a;->a:Ljava/lang/String;

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lj5/b;->c(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$a;->a:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :goto_0
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh5/a$a;->a:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s"

    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    invoke-interface {v0, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    return-void

    :cond_6
    invoke-static {}, Lh5/a;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh5/a$a;->a:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "GrsClientManager.ayncGetGrsUrls\uff1aReturn [%s] Urls is Empty"

    invoke-static {p1, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lh5/a$a;->c:Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;

    const/4 v0, -0x5

    invoke-interface {p1, v0}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackFail(I)V

    return-void
.end method
