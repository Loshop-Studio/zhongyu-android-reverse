.class public Lcom/tendcloud/tenddata/fm;
.super Lcom/tendcloud/tenddata/fk;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "accounts"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/fk;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cp;->d(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "accounts"

    .line 8
    .line 9
    invoke-virtual {p0, v1, v0}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c()V
    .locals 8

    .line 1
    const-string v0, "IMEI"

    .line 2
    .line 3
    const-string v1, "accounts"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-ge v3, v4, :cond_3

    .line 30
    .line 31
    const-string v4, "sim"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "type"

    .line 38
    .line 39
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-static {}, Lcom/tendcloud/tenddata/du;->a()Lcom/tendcloud/tenddata/du;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v5, v5, Lcom/tendcloud/tenddata/fw;->a:Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iget-object v6, v6, Lcom/tendcloud/tenddata/fw;->b:Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-virtual {v4, v0, v5, v6}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    const-string v5, "extra"

    .line 70
    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    :try_start_1
    sget-object v6, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {v6}, Lcom/tendcloud/tenddata/ch;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-lez v5, :cond_2

    .line 91
    .line 92
    invoke-static {}, Lcom/tendcloud/tenddata/fw;->b()Lcom/tendcloud/tenddata/fw;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5, v0, v4}, Lcom/tendcloud/tenddata/fw;->a(Ljava/lang/String;Lorg/json/JSONArray;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    move v5, v2

    .line 111
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-ge v5, v6, :cond_2

    .line 116
    .line 117
    const-string v6, "imei"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {p0, v6, v7}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    add-int/lit8 v5, v5, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :catchall_0
    :cond_3
    :goto_3
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    const-string v0, "accounts"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/tendcloud/tenddata/cp;->d(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :catchall_0
    :goto_0
    return-void
.end method

.method public setUserAccount(Lcom/tendcloud/tenddata/fg;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 11
    .line 12
    const-string v1, "accounts"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Lorg/json/JSONArray;

    .line 21
    .line 22
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, v1, p1}, Lcom/tendcloud/tenddata/fk;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/fk;->b:Lorg/json/JSONObject;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/fk;->b()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
.end method
