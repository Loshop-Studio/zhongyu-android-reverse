.class public final Lcom/tendcloud/tenddata/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x3


# instance fields
.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lorg/json/JSONObject;

.field private k:I

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Lcom/tendcloud/tenddata/w;
    .locals 7

    .line 2
    const-string v0, "eventParams"

    const/4 v1, 0x0

    if-nez p0, :cond_0

    return-object v1

    .line 3
    :cond_0
    :try_start_0
    new-instance v2, Lcom/tendcloud/tenddata/w;

    invoke-direct {v2}, Lcom/tendcloud/tenddata/w;-><init>()V

    .line 4
    const-string v3, "eventId"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventId(Ljava/lang/String;)V

    .line 5
    const-string v3, "eventName"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventName(Ljava/lang/String;)V

    .line 6
    const-string v3, "eventValue"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventValue(Ljava/lang/String;)V

    .line 7
    const-string v3, "pagePath"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setPagePath(Ljava/lang/String;)V

    .line 8
    const-string v3, "eventPath"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventPath(Ljava/lang/String;)V

    .line 9
    const-string v3, "eventSame"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventSame(Ljava/lang/String;)V

    .line 10
    const-string v3, "eventSameRules"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/tendcloud/tenddata/w;->setEventSameRules(Lorg/json/JSONObject;)V

    .line 11
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 12
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    if-nez v3, :cond_1

    .line 13
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 14
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 17
    new-instance v4, Lcom/tendcloud/tenddata/k;

    invoke-direct {v4}, Lcom/tendcloud/tenddata/k;-><init>()V

    .line 18
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 19
    const-string v6, "key"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/tendcloud/tenddata/k;->setKey(Ljava/lang/String;)V

    .line 20
    const-string v6, "xpath"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tendcloud/tenddata/k;->setXpath(Ljava/lang/String;)V

    .line 21
    invoke-interface {p0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {v2, p0}, Lcom/tendcloud/tenddata/w;->setEventParams(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    return-object v2

    :catchall_0
    return-object v1
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->j:Lorg/json/JSONObject;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tendcloud/tenddata/w;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/k;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/w;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->f()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->d()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eq v1, v0, :cond_3

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq v1, v2, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->b()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->c()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    return v0

    .line 46
    :cond_3
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->h()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return v0

    .line 55
    :goto_0
    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    return v0
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEventName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEventParams(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->l:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public setEventPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEventSame(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEventSameRules(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->j:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-void
.end method

.method public setEventValue(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPagePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/w;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPropagation(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tendcloud/tenddata/w;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "eventId"

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->f()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    const-string v1, "eventName"

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->g()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const-string v1, "eventValue"

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->h()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    const-string v1, "pagePath"

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->i()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    const-string v1, "eventPath"

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->c()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string v1, "eventParams"

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->e()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-string v1, "eventSame"

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    const-string v1, "eventSameRules"

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/w;->a()Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    :catchall_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method
