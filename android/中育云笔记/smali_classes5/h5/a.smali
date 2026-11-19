.class public Lh5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh5/a$b;,
        Lh5/a$a;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String; = "a"


# instance fields
.field public final a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public b:Li5/a;

.field public c:Lk5/g;

.field public d:Li5/c;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;Lk5/g;Li5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 5
    .line 6
    iput-object p2, p0, Lh5/a;->b:Li5/a;

    .line 7
    .line 8
    iput-object p3, p0, Lh5/a;->c:Lk5/g;

    .line 9
    .line 10
    iput-object p4, p0, Lh5/a;->d:Li5/c;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/content/Context;Z)Lcom/huawei/hms/framework/network/grs/local/model/CountryCodeBean;
    .locals 1

    .line 1
    new-instance v0, Lcom/huawei/hms/framework/network/grs/local/model/CountryCodeBean;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/huawei/hms/framework/network/grs/local/model/CountryCodeBean;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lh5/a;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object p0, Lh5/a;->e:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "isSpExpire jsonValue is null."

    .line 17
    .line 18
    invoke-static {p0, v1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    invoke-static {v3}, Lh5/a;->i(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    return-object v0

    .line 64
    :goto_1
    sget-object v1, Lh5/a;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v2, "getServicesUrlsMap occur a JSONException: %s"

    .line 79
    .line 80
    invoke-static {v1, v2, p0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object p0, Lh5/a;->e:Ljava/lang/String;

    .line 13
    .line 14
    const-string p1, "isSpExpire jsonValue from server is null."

    .line 15
    .line 16
    invoke-static {p0, p1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception p0

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    :goto_0
    if-nez p0, :cond_2

    .line 40
    .line 41
    sget-object p0, Lh5/a;->e:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    const-string v1, "getServiceNameUrls: paser null from server json data by {%s}."

    .line 44
    .line 45
    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, v1, p1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    return-object v0

    .line 82
    :goto_2
    sget-object p1, Lh5/a;->e:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    const-string v1, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s"

    .line 97
    .line 98
    invoke-static {p1, v1, p0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-object v0
.end method

.method public static i(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    return-object v0

    .line 51
    :goto_1
    sget-object v1, Lh5/a;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v2, "getServiceUrls occur a JSONException: %s"

    .line 66
    .line 67
    invoke-static {v1, v2, p0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method


# virtual methods
.method public c(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lh5/a;->c:Lk5/g;

    .line 2
    .line 3
    new-instance v1, Lm5/c;

    .line 4
    .line 5
    iget-object v2, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lh5/a;->d:Li5/c;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p2, v2, p3}, Lk5/g;->c(Lm5/c;Ljava/lang/String;Li5/c;I)Lk5/d;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string p3, ""

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-object p3

    .line 21
    :cond_0
    invoke-virtual {p2}, Lk5/d;->B()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p2, p0, Lh5/a;->b:Li5/a;

    .line 28
    .line 29
    invoke-virtual {p2}, Li5/a;->a()Li5/c;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v0, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1, v1, p1}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2, p1, p3}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    invoke-virtual {p2}, Lk5/d;->y()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;I)Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Li5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Li5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p3}, Lh5/a;->g(Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0}, Li5/b;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s"

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    filled-new-array {p1, p2, p4}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p3, v2, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_0
    invoke-virtual {p0, p3, p1, p4}, Lh5/a;->c(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-static {p4, p1}, Lh5/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    filled-new-array {p1, p2, p4}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s"

    .line 75
    .line 76
    invoke-static {p3, p2, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    if-nez p4, :cond_2

    .line 91
    .line 92
    sget-object p4, Lh5/a;->e:Ljava/lang/String;

    .line 93
    .line 94
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "The serviceName[%s][%s] is not configured on the GRS server."

    .line 99
    .line 100
    invoke-static {p4, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    sget-object p4, Lh5/a;->e:Ljava/lang/String;

    .line 104
    .line 105
    const-string v0, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File."

    .line 106
    .line 107
    invoke-static {p4, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iget-object v5, p0, Lh5/a;->b:Li5/a;

    .line 119
    .line 120
    iget-object v6, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 121
    .line 122
    const/4 v9, 0x1

    .line 123
    move-object v7, p1

    .line 124
    move-object v8, p2

    .line 125
    move-object v4, p3

    .line 126
    invoke-virtual/range {v3 .. v9}, Lj5/b;->b(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    :cond_3
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const-string p2, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"

    .line 143
    .line 144
    invoke-static {p4, p2, p1}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    move-object v7, p1

    .line 149
    move-object v8, p2

    .line 150
    :cond_5
    :goto_0
    sget-object p1, Lh5/a;->e:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    filled-new-array {v7, v8, p2}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-static {p1, v2, p2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    return-object v1
.end method

.method public f(Ljava/lang/String;Landroid/content/Context;I)Ljava/util/Map;
    .locals 7

    .line 1
    new-instance v0, Li5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Li5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p2}, Lh5/a;->g(Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, Li5/b;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object p2, Lh5/a;->e:Ljava/lang/String;

    .line 23
    .line 24
    new-instance p3, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {p3, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-static {p3}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    filled-new-array {p1, p3}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p3, "Return [%s] Urls: %s"

    .line 42
    .line 43
    invoke-static {p2, p3, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    invoke-virtual {p0, p2, p1, p3}, Lh5/a;->c(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-static {p3, p1}, Lh5/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    sget-object p2, Lh5/a;->e:Ljava/lang/String;

    .line 62
    .line 63
    new-instance p3, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-direct {p3, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-static {p3}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    filled-new-array {p1, p3}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p3, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s"

    .line 81
    .line 82
    invoke-static {p2, p3, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p3

    .line 96
    if-nez p3, :cond_2

    .line 97
    .line 98
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 99
    .line 100
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "The serviceName[%s] is not configured on the GRS server."

    .line 105
    .line 106
    invoke-static {p3, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 110
    .line 111
    const-string v0, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File."

    .line 112
    .line 113
    invoke-static {p3, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v3, p0, Lh5/a;->b:Li5/a;

    .line 125
    .line 126
    iget-object v4, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 127
    .line 128
    const/4 v6, 0x1

    .line 129
    move-object v5, p1

    .line 130
    move-object v2, p2

    .line 131
    invoke-virtual/range {v1 .. v6}, Lj5/b;->c(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-eqz v1, :cond_3

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    :cond_3
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-string p2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"

    .line 148
    .line 149
    invoke-static {p3, p2, p1}, Lcom/huawei/hms/framework/common/Logger;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    move-object v5, p1

    .line 154
    :cond_5
    :goto_0
    sget-object p1, Lh5/a;->e:Ljava/lang/String;

    .line 155
    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    new-instance p2, Lorg/json/JSONObject;

    .line 159
    .line 160
    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    goto :goto_1

    .line 168
    :cond_6
    const-string p2, ""

    .line 169
    .line 170
    :goto_1
    invoke-static {p2}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    filled-new-array {v5, p2}, [Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const-string p3, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s"

    .line 179
    .line 180
    invoke-static {p1, p3, p2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    return-object v1
.end method

.method public final g(Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lh5/a;->b:Li5/a;

    .line 2
    .line 3
    iget-object v1, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2, p3}, Li5/a;->b(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lh5/a;->e:Ljava/lang/String;

    .line 18
    .line 19
    const-string p3, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache"

    .line 20
    .line 21
    invoke-static {p1, p3}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, Lh5/a;->b:Li5/a;

    .line 34
    .line 35
    iget-object v3, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v4, p1

    .line 39
    move-object v1, p3

    .line 40
    invoke-virtual/range {v0 .. v5}, Lj5/b;->c(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object p2, Lh5/a;->e:Ljava/lang/String;

    .line 45
    .line 46
    const-string p3, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File"

    .line 47
    .line 48
    invoke-static {p2, p3}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    return-object p1
.end method

.method public j(Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;Landroid/content/Context;I)V
    .locals 10

    .line 1
    new-instance v0, Li5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Li5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p3}, Lh5/a;->g(Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-virtual {v0}, Li5/b;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 23
    .line 24
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p4, "GrsClientManager.ayncGetGrsUrls\uff1aReturn [%s] Urls is Empty"

    .line 29
    .line 30
    invoke-static {p3, p4, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, -0x5

    .line 34
    invoke-interface {p2, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackFail(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-object p3, Lh5/a;->e:Ljava/lang/String;

    .line 39
    .line 40
    new-instance p4, Lorg/json/JSONObject;

    .line 41
    .line 42
    invoke-direct {p4, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    invoke-static {p4}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    filled-new-array {p1, p4}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string p4, "GrsClientManager.ayncGetGrsUrls\uff1aReturn [%s] Urls: %s"

    .line 58
    .line 59
    invoke-static {p3, p4, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-direct {p1, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string p4, "ayncGetGrsUrls: %s"

    .line 80
    .line 81
    invoke-static {p3, p4, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, v3}, Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;->onCallBackSuccess(Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    new-instance v0, Lm5/c;

    .line 89
    .line 90
    iget-object v1, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 91
    .line 92
    invoke-direct {v0, v1, p3}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    iget-object v8, p0, Lh5/a;->c:Lk5/g;

    .line 96
    .line 97
    new-instance v1, Lh5/a$a;

    .line 98
    .line 99
    iget-object v6, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 100
    .line 101
    iget-object v7, p0, Lh5/a;->b:Li5/a;

    .line 102
    .line 103
    move-object v2, p1

    .line 104
    move-object v4, p2

    .line 105
    move-object v5, p3

    .line 106
    invoke-direct/range {v1 .. v7}, Lh5/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/huawei/hms/framework/network/grs/IQueryUrlsCallBack;Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;)V

    .line 107
    .line 108
    .line 109
    move-object v4, v8

    .line 110
    iget-object v8, p0, Lh5/a;->d:Li5/c;

    .line 111
    .line 112
    move v9, p4

    .line 113
    move-object v5, v0

    .line 114
    move-object v6, v1

    .line 115
    move-object v7, v2

    .line 116
    invoke-virtual/range {v4 .. v9}, Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;Landroid/content/Context;I)V
    .locals 10

    .line 1
    new-instance v0, Li5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Li5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p4}, Lh5/a;->g(Ljava/lang/String;Li5/b;Landroid/content/Context;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v6, v1

    .line 15
    check-cast v6, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0}, Li5/b;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    if-eqz p4, :cond_0

    .line 28
    .line 29
    sget-object p4, Lh5/a;->e:Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "GrsClientManager.ayncGetGrsUrl\uff1aReturn [%s][%s] Url is Empty"

    .line 36
    .line 37
    invoke-static {p4, p2, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, -0x5

    .line 41
    invoke-interface {p3, p1}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackFail(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    sget-object p4, Lh5/a;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v6}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p5

    .line 51
    filled-new-array {p1, p2, p5}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "GrsClientManager.ayncGetGrsUrl\uff1aReturn [%s][%s] Url: %s"

    .line 56
    .line 57
    invoke-static {p4, p2, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p3, v6}, Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;->onCallBackSuccess(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    new-instance v1, Lm5/c;

    .line 65
    .line 66
    iget-object v0, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 67
    .line 68
    invoke-direct {v1, v0, p4}, Lm5/c;-><init>(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lh5/a;->c:Lk5/g;

    .line 72
    .line 73
    new-instance v2, Lh5/a$b;

    .line 74
    .line 75
    iget-object v8, p0, Lh5/a;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 76
    .line 77
    iget-object v9, p0, Lh5/a;->b:Li5/a;

    .line 78
    .line 79
    move-object v3, p1

    .line 80
    move-object v4, p2

    .line 81
    move-object v5, p3

    .line 82
    move-object v7, p4

    .line 83
    invoke-direct/range {v2 .. v9}, Lh5/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/IQueryUrlCallBack;Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/a;)V

    .line 84
    .line 85
    .line 86
    iget-object v4, p0, Lh5/a;->d:Li5/c;

    .line 87
    .line 88
    move v5, p5

    .line 89
    invoke-virtual/range {v0 .. v5}, Lk5/g;->h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
