.class public Lg2/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/k0$c;,
        Lg2/k0$b;
    }
.end annotation


# static fields
.field public static o:Landroid/content/Context;

.field public static p:Ljava/lang/Class;

.field public static q:Ljava/lang/reflect/Method;


# instance fields
.field public a:Lg2/k0$c;

.field public b:Landroid/content/SharedPreferences;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Lorg/json/JSONArray;

.field public final g:I

.field public h:I

.field public i:I

.field public j:J

.field public final k:J

.field public l:Z

.field public m:Z

.field public n:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lg2/k0;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 4
    iput-object v0, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 5
    iput-object v0, p0, Lg2/k0;->c:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lg2/k0;->d:Ljava/lang/String;

    const/16 v0, 0xa

    .line 7
    iput v0, p0, Lg2/k0;->e:I

    .line 8
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    const/16 v0, 0x1388

    .line 9
    iput v0, p0, Lg2/k0;->g:I

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lg2/k0;->h:I

    .line 11
    iput v0, p0, Lg2/k0;->i:I

    const-wide/16 v1, 0x0

    .line 12
    iput-wide v1, p0, Lg2/k0;->j:J

    const-wide/32 v3, 0x1b77400

    .line 13
    iput-wide v3, p0, Lg2/k0;->k:J

    .line 14
    iput-boolean v0, p0, Lg2/k0;->l:Z

    .line 15
    iput-boolean v0, p0, Lg2/k0;->m:Z

    .line 16
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lg2/k0;->n:Ljava/lang/Object;

    .line 17
    :try_start_0
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    invoke-static {v3}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 18
    const-string v4, "thtstart"

    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lg2/k0;->j:J

    .line 19
    const-string v1, "gkvc"

    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lg2/k0;->h:I

    .line 20
    const-string v1, "ekvc"

    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lg2/k0;->i:I

    .line 21
    new-instance v0, Lg2/k0$c;

    invoke-direct {v0}, Lg2/k0$c;-><init>()V

    iput-object v0, p0, Lg2/k0;->a:Lg2/k0$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public synthetic constructor <init>(Lg2/k0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg2/k0;-><init>()V

    return-void
.end method

.method public static synthetic G()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public static J()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    const-class v1, Lb3/b;

    .line 4
    .line 5
    sput-object v1, Lg2/k0;->p:Ljava/lang/Class;

    .line 6
    .line 7
    const-string v2, "setPuidAndProvider"

    .line 8
    .line 9
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sput-object v0, Lg2/k0;->q:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :catchall_0
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Lg2/k0;
    .locals 1

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lg2/k0;->o:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lg2/k0$b;->a()Lg2/k0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final A(Z)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg2/k0$c;

    .line 6
    .line 7
    invoke-direct {v0}, Lg2/k0$c;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 13
    .line 14
    invoke-virtual {v0}, Lg2/k0$c;->f()Lv2/e$h;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lv2/e$b;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast v0, Lv2/e$b;

    .line 25
    .line 26
    invoke-virtual {v0}, Lv2/e$b;->c()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, p1}, Lv2/e$h;->b(Z)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_2
    const/4 p1, 0x1

    .line 38
    return p1
.end method

.method public B()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lg2/k0;->A(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lg2/k0;->M()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final C(Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "__t"

    .line 2
    .line 3
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x802

    .line 10
    .line 11
    if-ne v2, v1, :cond_1

    .line 12
    .line 13
    iget-wide v0, p0, Lg2/k0;->j:J

    .line 14
    .line 15
    iget v2, p0, Lg2/k0;->h:I

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1, v2}, Lg2/k0;->j(JI)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget v0, p0, Lg2/k0;->h:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lg2/k0;->h:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0x801

    .line 38
    .line 39
    if-ne v1, v0, :cond_3

    .line 40
    .line 41
    iget-wide v0, p0, Lg2/k0;->j:J

    .line 42
    .line 43
    iget v2, p0, Lg2/k0;->i:I

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1, v2}, Lg2/k0;->j(JI)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    :goto_0
    return-void

    .line 52
    :cond_2
    iget v0, p0, Lg2/k0;->i:I

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    iput v0, p0, Lg2/k0;->i:I

    .line 57
    .line 58
    :cond_3
    :goto_1
    iget-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 59
    .line 60
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, Lg2/k0;->e:I

    .line 65
    .line 66
    if-lt v0, v1, :cond_4

    .line 67
    .line 68
    const-string v0, "MobclickRT"

    .line 69
    .line 70
    const-string v1, "--->>>*** \u8d85\u8fc710\u4e2a\u4e8b\u4ef6\uff0c\u4e8b\u4ef6\u843d\u5e93\u3002"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 76
    .line 77
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/h;->h(Lorg/json/JSONArray;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Lorg/json/JSONArray;

    .line 87
    .line 88
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 92
    .line 93
    :cond_4
    iget-wide v0, p0, Lg2/k0;->j:J

    .line 94
    .line 95
    const-wide/16 v2, 0x0

    .line 96
    .line 97
    cmp-long v0, v0, v2

    .line 98
    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    iput-wide v0, p0, Lg2/k0;->j:J

    .line 106
    .line 107
    :cond_5
    iget-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :goto_2
    invoke-static {p1}, Lv2/d;->g(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final D(Lorg/json/JSONObject;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "version_code"

    .line 4
    .line 5
    const-string v2, "analytics"

    .line 6
    .line 7
    const-string v3, "channel"

    .line 8
    .line 9
    const-string v4, "appkey"

    .line 10
    .line 11
    const-string v5, "device_model"

    .line 12
    .line 13
    const-string v6, "device_id"

    .line 14
    .line 15
    const-string v7, "sdk_version"

    .line 16
    .line 17
    const-string v8, "header"

    .line 18
    .line 19
    const-string v9, "active_user"

    .line 20
    .line 21
    const-string v10, "sessions"

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    if-gtz v11, :cond_1

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_1
    new-instance v11, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v12

    .line 42
    if-eqz v12, :cond_5

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    if-eqz v12, :cond_4

    .line 53
    .line 54
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    new-instance v13, Lorg/json/JSONArray;

    .line 59
    .line 60
    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 61
    .line 62
    .line 63
    const/4 v14, 0x0

    .line 64
    :goto_1
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-ge v14, v15, :cond_3

    .line 69
    .line 70
    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    if-eqz v15, :cond_2

    .line 75
    .line 76
    invoke-virtual {v15}, Lorg/json/JSONObject;->length()I

    .line 77
    .line 78
    .line 79
    move-result v16

    .line 80
    if-lez v16, :cond_2

    .line 81
    .line 82
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto/16 :goto_3

    .line 88
    .line 89
    :cond_2
    :goto_2
    add-int/lit8 v14, v14, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v11, v10, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-lez v10, :cond_4

    .line 100
    .line 101
    new-instance v10, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v12, "\u672c\u6b21\u542f\u52a8\u4f1a\u8bdd:"

    .line 107
    .line 108
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static {v10}, Lv2/d;->a(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v11, Lorg/json/JSONObject;

    .line 126
    .line 127
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v10

    .line 134
    if-eqz v10, :cond_5

    .line 135
    .line 136
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v11, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-lez v2, :cond_5

    .line 148
    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v9, "\u672c\u6b21\u542f\u52a8\u8d26\u53f7:"

    .line 155
    .line 156
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v2}, Lv2/d;->a(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v11, Lorg/json/JSONObject;

    .line 174
    .line 175
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 176
    .line 177
    .line 178
    :cond_5
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_c

    .line 183
    .line 184
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_c

    .line 189
    .line 190
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_c

    .line 195
    .line 196
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-lez v2, :cond_c

    .line 201
    .line 202
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_6

    .line 207
    .line 208
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v11, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    :cond_6
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_7

    .line 220
    .line 221
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v11, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 226
    .line 227
    .line 228
    :cond_7
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-eqz v2, :cond_8

    .line 233
    .line 234
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v11, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    :cond_8
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_9

    .line 246
    .line 247
    const-string v2, "version"

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-virtual {v11, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    :cond_9
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_a

    .line 261
    .line 262
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v11, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 267
    .line 268
    .line 269
    :cond_a
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-eqz v1, :cond_b

    .line 274
    .line 275
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    :cond_b
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-lez v0, :cond_c

    .line 287
    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const-string v1, "\u672c\u6b21\u542f\u52a8\u57fa\u7840\u4fe1\u606f:"

    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, Lv2/d;->a(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    new-instance v11, Lorg/json/JSONObject;

    .line 313
    .line 314
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 315
    .line 316
    .line 317
    :cond_c
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :goto_3
    invoke-static {v0}, Lv2/d;->g(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    return-void
.end method

.method public final E(Ljava/lang/Object;)V
    .locals 7

    .line 1
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-gtz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :cond_0
    const-string v0, "ts"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {p1}, Le2/c;->b(Landroid/content/Context;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    aget-object v3, p1, v2

    .line 37
    .line 38
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    aget-object p1, p1, v3

    .line 46
    .line 47
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 58
    .line 59
    invoke-virtual {p1, v4, v0, v1}, Lcom/umeng/analytics/pro/e;->f(Landroid/content/Context;J)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {p1, v4}, Lcom/umeng/analytics/pro/g;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v4, "MobclickRT"

    .line 73
    .line 74
    new-instance v5, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v6, "--->>> onProfileSignIn: force generate new session: session id = "

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v4, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {p1, v4, v0, v1, v2}, Lcom/umeng/analytics/pro/e;->n(Landroid/content/Context;JZ)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    sget-object v2, Lg2/k0;->o:Landroid/content/Context;

    .line 105
    .line 106
    invoke-static {v2}, Le2/c;->c(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 114
    .line 115
    invoke-virtual {v2, v4, v0, v1, v3}, Lcom/umeng/analytics/pro/e;->e(Landroid/content/Context;JZ)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_1

    .line 119
    .line 120
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v2, Lg2/k0;->o:Landroid/content/Context;

    .line 125
    .line 126
    invoke-virtual {p1, v2, v0, v1}, Lcom/umeng/analytics/pro/e;->l(Landroid/content/Context;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    sget-boolean v0, Lv2/d;->a:Z

    .line 132
    .line 133
    if-eqz v0, :cond_1

    .line 134
    .line 135
    const-string v0, " Excepthon  in  onProfileSignOff"

    .line 136
    .line 137
    invoke-static {v0, p1}, Lv2/d;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :cond_1
    :goto_0
    return-void
.end method

.method public final F(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    :try_start_0
    const-string v0, "header"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "eof"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, "sessions"

    .line 15
    .line 16
    const-string v3, "analytics"

    .line 17
    .line 18
    const-string v4, "content"

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    const-string v4, "MobclickRT"

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    :try_start_2
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const-string v0, "id"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    const-string v0, "--->>> removeAllInstantData: really delete instant session data"

    .line 73
    .line 74
    invoke-static {v4, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/h;->q(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->p()V

    .line 93
    .line 94
    .line 95
    const-string p1, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE."

    .line 96
    .line 97
    invoke-static {v4, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 101
    .line 102
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/4 v1, 0x0

    .line 107
    const/16 v2, 0x1101

    .line 108
    .line 109
    invoke-static {p1, v2, v0, v1}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_2
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :cond_3
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-lez v0, :cond_4

    .line 140
    .line 141
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_4

    .line 146
    .line 147
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 148
    .line 149
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const/4 v0, 0x1

    .line 154
    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/pro/h;->j(ZZ)V

    .line 155
    .line 156
    .line 157
    :cond_4
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->p()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 164
    .line 165
    .line 166
    :catch_0
    return-void
.end method

.method public final H(Ljava/lang/Object;)V
    .locals 8

    .line 1
    :try_start_0
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 7
    .line 8
    .line 9
    check-cast p1, Lorg/json/JSONObject;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "provider"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "uid"

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "ts"

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {p1}, Le2/c;->b(Landroid/content/Context;)[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    aget-object v6, p1, v5

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    aget-object p1, p1, v4

    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    :cond_1
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object v6, Lg2/k0;->o:Landroid/content/Context;

    .line 69
    .line 70
    invoke-virtual {p1, v6, v2, v3}, Lcom/umeng/analytics/pro/e;->f(Landroid/content/Context;J)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object v6, Lg2/k0;->o:Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {p1, v6}, Lcom/umeng/analytics/pro/g;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    sget-object v7, Lg2/k0;->o:Landroid/content/Context;

    .line 88
    .line 89
    invoke-virtual {v6, v7, v2, v3, v5}, Lcom/umeng/analytics/pro/e;->n(Landroid/content/Context;JZ)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    sget-object v6, Lg2/k0;->o:Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {v6, v0, v1}, Le2/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v0, "MobclickRT"

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v6, "--->>> onProfileSignIn: force generate new session: session id = "

    .line 106
    .line 107
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {v0, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 125
    .line 126
    invoke-virtual {p1, v0, v2, v3, v4}, Lcom/umeng/analytics/pro/e;->e(Landroid/content/Context;JZ)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    if-eqz v5, :cond_2

    .line 130
    .line 131
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 136
    .line 137
    invoke-virtual {p1, v0, v2, v3}, Lcom/umeng/analytics/pro/e;->l(Landroid/content/Context;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final I(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    :try_start_0
    const-string v0, "header"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "eof"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    const-string v3, "sessions"

    .line 16
    .line 17
    const-string v4, "analytics"

    .line 18
    .line 19
    const-string v5, "content"

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_8

    .line 38
    .line 39
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->D()V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->C()V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, v2, v1}, Lcom/umeng/analytics/pro/h;->t(ZZ)V

    .line 74
    .line 75
    .line 76
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 77
    .line 78
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->e()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    const-string p1, "MobclickRT"

    .line 87
    .line 88
    const-string v0, "--->>> Error, Should not go to this branch."

    .line 89
    .line 90
    invoke-static {p1, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_3
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-lez v0, :cond_7

    .line 121
    .line 122
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 129
    .line 130
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0, v2, v1}, Lcom/umeng/analytics/pro/h;->t(ZZ)V

    .line 135
    .line 136
    .line 137
    :cond_4
    const-string v0, "ekv"

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_5

    .line 144
    .line 145
    const-string v0, "gkv"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    :cond_5
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 154
    .line 155
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/h;->C()V

    .line 160
    .line 161
    .line 162
    :cond_6
    const-string v0, "error"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_7

    .line 169
    .line 170
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->D()V

    .line 177
    .line 178
    .line 179
    :cond_7
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 180
    .line 181
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 186
    .line 187
    .line 188
    :catch_0
    :cond_8
    return-void
.end method

.method public final K(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "__ii"

    .line 2
    .line 3
    :try_start_0
    move-object v1, p1

    .line 4
    check-cast v1, Lorg/json/JSONObject;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-lez v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v1, 0x2

    .line 44
    invoke-virtual {v0, v2, p1, v1}, Lcom/umeng/analytics/pro/h;->k(Ljava/lang/String;Ljava/lang/String;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    :cond_0
    return-void
.end method

.method public final L()V
    .locals 5

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/a;->l(Landroid/content/Context;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0, v1, v2}, Lg2/k0;->m(J)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v2, "header"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lorg/json/JSONObject;

    .line 30
    .line 31
    const-string v3, "content"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lorg/json/JSONObject;

    .line 38
    .line 39
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const-string v3, "--->>> constructInstantMessage: request build envelope."

    .line 48
    .line 49
    const-string v4, "MobclickRT"

    .line 50
    .line 51
    invoke-static {v4, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {v3, v2, v1}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v3, "Build envelope error code: "

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v4, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :catchall_0
    :cond_1
    invoke-static {}, Lk2/a;->e()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {p0, v1}, Lg2/k0;->D(Lorg/json/JSONObject;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0, v1}, Lg2/k0;->r(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    :goto_0
    return-void
.end method

.method public final M()V
    .locals 5

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/umeng/commonsdk/framework/a;->l(Landroid/content/Context;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0, v1, v2}, Lg2/k0;->b(J)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ge v2, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v2, "header"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lorg/json/JSONObject;

    .line 30
    .line 31
    const-string v3, "content"

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lorg/json/JSONObject;

    .line 38
    .line 39
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-static {v3, v2, v1}, Lcom/umeng/commonsdk/framework/a;->b(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    const-string v2, "MobclickRT"

    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v4, "Build envelope error code: "

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :catchall_0
    :cond_1
    invoke-static {}, Lk2/a;->e()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lg2/k0;->z(Lorg/json/JSONObject;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual {p0, v1}, Lg2/k0;->e(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_0
    return-void
.end method

.method public final N()Lorg/json/JSONObject;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg2/k0;->O()Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    const-string v1, "st"

    .line 8
    .line 9
    const-string v2, "1"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    :cond_0
    return-object v0
.end method

.method public final O()Lorg/json/JSONObject;
    .locals 11

    .line 1
    const-string v0, "vers_name"

    .line 2
    .line 3
    const-string v1, "$ud_da"

    .line 4
    .line 5
    const-string v2, "$pr_ve"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    new-instance v4, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    sget-object v5, Le2/a;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sget-object v5, Le2/a;->c:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    const-string v6, "wrapper_version"

    .line 23
    .line 24
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    const-string v5, "wrapper_type"

    .line 28
    .line 29
    sget-object v6, Le2/a;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_0
    :goto_0
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v5}, Le2/a;->d(Landroid/content/Context;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "vertical_type"

    .line 45
    .line 46
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    const-string v7, "sdk_version"

    .line 51
    .line 52
    const-string v8, "9.3.7"

    .line 53
    .line 54
    if-ne v5, v6, :cond_2

    .line 55
    .line 56
    :try_start_1
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 57
    .line 58
    invoke-static {v5}, Le2/a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v8, v5

    .line 70
    :goto_1
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    :goto_2
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 78
    .line 79
    invoke-static {v5}, Le2/a;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5}, Lv2/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    const-string v6, "secret"

    .line 94
    .line 95
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    :cond_3
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 99
    .line 100
    const-string v6, "pr_ve"

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    invoke-static {v5, v6, v7}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    sget-object v6, Lg2/k0;->o:Landroid/content/Context;

    .line 108
    .line 109
    invoke-static {v6}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    sget-object v7, Lg2/k0;->o:Landroid/content/Context;

    .line 114
    .line 115
    const-string v8, "ekv_bl_ver"

    .line 116
    .line 117
    invoke-static {v7, v8, v3}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-nez v8, :cond_5

    .line 126
    .line 127
    sget-boolean v8, Le2/a;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    const-string v9, "$ekv_bl_ver"

    .line 130
    .line 131
    if-eqz v8, :cond_4

    .line 132
    .line 133
    :try_start_2
    invoke-virtual {v4, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    invoke-virtual {v4, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    :cond_5
    :goto_3
    sget-object v7, Lg2/k0;->o:Landroid/content/Context;

    .line 141
    .line 142
    const-string v8, "ekv_wl_ver"

    .line 143
    .line 144
    invoke-static {v7, v8, v3}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-nez v8, :cond_7

    .line 153
    .line 154
    sget-boolean v8, Le2/a;->h:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    .line 156
    const-string v9, "$ekv_wl_ver"

    .line 157
    .line 158
    if-eqz v8, :cond_6

    .line 159
    .line 160
    :try_start_3
    invoke-virtual {v4, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_6
    invoke-virtual {v4, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_4
    const-string v7, "pro_ver"

    .line 168
    .line 169
    const-string v8, "1.0.0"

    .line 170
    .line 171
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lg2/k0;->V()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_8

    .line 179
    .line 180
    const-string v7, "atm"

    .line 181
    .line 182
    const-string v8, "1"

    .line 183
    .line 184
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    if-eqz v6, :cond_8

    .line 188
    .line 189
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    const-string v8, "ana_is_f"

    .line 194
    .line 195
    const-wide/16 v9, 0x0

    .line 196
    .line 197
    invoke-interface {v7, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 202
    .line 203
    .line 204
    :cond_8
    invoke-virtual {p0}, Lg2/k0;->P()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-virtual {v4, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Lg2/k0;->Q()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-virtual {v4, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    if-eqz v6, :cond_a

    .line 219
    .line 220
    invoke-interface {v6, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-nez v7, :cond_a

    .line 229
    .line 230
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 231
    .line 232
    const-string v8, "yyyy-MM-dd"

    .line 233
    .line 234
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 239
    .line 240
    .line 241
    new-instance v8, Ljava/util/Date;

    .line 242
    .line 243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 244
    .line 245
    .line 246
    move-result-wide v9

    .line 247
    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 255
    .line 256
    .line 257
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 258
    const-string v8, "vers_date"

    .line 259
    .line 260
    const-string v9, "vers_pre_version"

    .line 261
    .line 262
    if-eqz v5, :cond_9

    .line 263
    .line 264
    :try_start_4
    const-string v5, "0"

    .line 265
    .line 266
    invoke-interface {v6, v9, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    invoke-interface {v6, v8, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 278
    .line 279
    .line 280
    :cond_9
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 281
    .line 282
    invoke-static {v1}, Lv2/b;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const-string v5, "pre_version"

    .line 291
    .line 292
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    const-string v3, "cur_version"

    .line 297
    .line 298
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    const-string v2, "pre_date"

    .line 303
    .line 304
    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const-string v1, "vers_code"

    .line 313
    .line 314
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-interface {v0, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface {v0, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 327
    .line 328
    .line 329
    :cond_a
    return-object v4

    .line 330
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 331
    .line 332
    .line 333
    return-object v4
.end method

.method public final P()Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "0"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "pre_version"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 9
    .line 10
    const-string v5, "pr_ve"

    .line 11
    .line 12
    invoke-static {v4, v5, v3}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_4

    .line 21
    .line 22
    iget-object v4, p0, Lg2/k0;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lg2/k0;->c:Ljava/lang/String;

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    iget-object v4, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {v4}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iput-object v4, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 44
    .line 45
    :cond_1
    iget-object v4, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 46
    .line 47
    invoke-interface {v4, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 52
    .line 53
    invoke-static {v5}, Lv2/b;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    const-string v7, "cur_version"

    .line 62
    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    :try_start_1
    iget-object v1, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 66
    .line 67
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v1, v7, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object v0, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 84
    .line 85
    invoke-interface {v0, v7, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    iget-object v1, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 96
    .line 97
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v1, v7, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    move-object v0, v4

    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    :cond_4
    move-object v0, v3

    .line 116
    :goto_0
    iput-object v0, p0, Lg2/k0;->c:Ljava/lang/String;

    .line 117
    .line 118
    return-object v0
.end method

.method public final Q()Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "pre_date"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    sget-object v2, Lg2/k0;->o:Landroid/content/Context;

    .line 5
    .line 6
    const-string v3, "ud_da"

    .line 7
    .line 8
    invoke-static {v2, v3, v1}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    iget-object v2, p0, Lg2/k0;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lg2/k0;->d:Ljava/lang/String;

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    iget-object v2, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 30
    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Lg2/k0;->o:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v2}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    :cond_1
    iget-object v2, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    const-string v3, ""

    .line 44
    .line 45
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    const-string v4, "yyyy-MM-dd"

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    :try_start_1
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 58
    .line 59
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Ljava/util/Date;

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v3, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 80
    .line 81
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 90
    .line 91
    .line 92
    :cond_2
    move-object v1, v2

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 95
    .line 96
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 101
    .line 102
    .line 103
    new-instance v4, Ljava/util/Date;

    .line 104
    .line 105
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-nez v4, :cond_2

    .line 121
    .line 122
    iget-object v2, p0, Lg2/k0;->b:Landroid/content/SharedPreferences;

    .line 123
    .line 124
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    move-object v1, v3

    .line 136
    :catchall_0
    :cond_4
    :goto_0
    iput-object v1, p0, Lg2/k0;->d:Ljava/lang/String;

    .line 137
    .line 138
    return-object v1
.end method

.method public final R()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iput v0, p0, Lg2/k0;->h:I

    .line 3
    .line 4
    iput v0, p0, Lg2/k0;->i:I

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iput-wide v1, p0, Lg2/k0;->j:J

    .line 11
    .line 12
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "dstk_last_time"

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "dstk_cnt"

    .line 33
    .line 34
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :catchall_0
    return-void
.end method

.method public final S()Z
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/e;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 21
    .line 22
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    if-lez v0, :cond_3

    .line 28
    .line 29
    move v0, v1

    .line 30
    :goto_0
    iget-object v2, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 31
    .line 32
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v0, v2, :cond_4

    .line 37
    .line 38
    iget-object v2, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-lez v3, :cond_2

    .line 51
    .line 52
    const-string v3, "__i"

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_1

    .line 63
    .line 64
    const-string v3, "-1"

    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    :cond_1
    return v1

    .line 73
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return v1

    .line 77
    :catchall_0
    :cond_4
    const/4 v0, 0x1

    .line 78
    return v0
.end method

.method public final T()V
    .locals 7

    .line 1
    const-string v0, "__i"

    .line 2
    .line 3
    iget-object v1, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_5

    .line 10
    .line 11
    new-instance v1, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    iget-object v3, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 18
    .line 19
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v2, v3, :cond_4

    .line 24
    .line 25
    :try_start_0
    iget-object v3, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-lez v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const-string v6, "-1"

    .line 48
    .line 49
    if-nez v5, :cond_0

    .line 50
    .line 51
    :try_start_1
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v4}, Lcom/umeng/analytics/pro/e;->j()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move-object v6, v4

    .line 73
    :goto_1
    invoke-virtual {v3, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    :catchall_0
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iput-object v1, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 87
    .line 88
    :cond_5
    return-void
.end method

.method public final U()V
    .locals 6

    .line 1
    const-string v0, "first_activate_time"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lg2/k0;->V()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    cmp-long v2, v4, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :catchall_0
    :cond_0
    return-void
.end method

.method public final V()Z
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v1, "ana_is_f"

    .line 12
    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public b(J)Lorg/json/JSONObject;
    .locals 8

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lg2/k0;->o(Z)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Lg2/n0;->b()Lg2/n0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lg2/n0;->a(Landroid/content/Context;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x3

    .line 39
    if-gtz v3, :cond_1

    .line 40
    .line 41
    if-eq v2, v4, :cond_5

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v5, 0x1

    .line 49
    const-string v6, "userlevel"

    .line 50
    .line 51
    const-string v7, "active_user"

    .line 52
    .line 53
    if-ne v3, v5, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    if-eq v2, v4, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_2
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    if-eq v2, v4, :cond_4

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const/4 v5, 0x2

    .line 82
    if-ne v3, v5, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_4

    .line 99
    .line 100
    if-eq v2, v4, :cond_4

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_4
    const-string v3, "sessions"

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const-string v5, "gkv"

    .line 110
    .line 111
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const-string v6, "ekv"

    .line 116
    .line 117
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_5

    .line 126
    .line 127
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_5

    .line 132
    .line 133
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_5

    .line 138
    .line 139
    invoke-virtual {p0, v0}, Lg2/k0;->l(Lorg/json/JSONObject;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_5
    invoke-virtual {p0}, Lg2/k0;->O()Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lg2/k0;->v(Lorg/json/JSONObject;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    new-instance v3, Lorg/json/JSONObject;

    .line 156
    .line 157
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 158
    .line 159
    .line 160
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    .line 161
    .line 162
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    const-string v6, "analytics"

    .line 166
    .line 167
    if-ne v2, v4, :cond_7

    .line 168
    .line 169
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 170
    .line 171
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_7
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-lez v2, :cond_8

    .line 183
    .line 184
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    :cond_8
    :goto_0
    if-eqz v1, :cond_9

    .line 188
    .line 189
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-lez v0, :cond_9

    .line 194
    .line 195
    const-string v0, "header"

    .line 196
    .line 197
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    .line 199
    .line 200
    :cond_9
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-lez v0, :cond_a

    .line 205
    .line 206
    const-string v0, "content"

    .line 207
    .line 208
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-virtual {p0, v3, p1, p2}, Lg2/k0;->c(Lorg/json/JSONObject;J)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 215
    return-object p1

    .line 216
    :catchall_0
    return-object v3
.end method

.method public final c(Lorg/json/JSONObject;J)Lorg/json/JSONObject;
    .locals 5

    .line 1
    const-string v0, "header"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Lg2/m0;->b(Lorg/json/JSONObject;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    cmp-long v1, v1, p2

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "eof"

    .line 16
    .line 17
    invoke-static {p1}, Lg2/m0;->b(Lorg/json/JSONObject;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 28
    .line 29
    invoke-static {v0, p2, p3, p1}, Lg2/m0;->c(Landroid/content/Context;JLorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :catchall_0
    :cond_0
    return-object p1
.end method

.method public d()V
    .locals 5

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lg2/k0;->n:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-boolean v1, p0, Lg2/k0;->l:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, "MobclickRT"

    .line 14
    .line 15
    const-string v3, "--->>> network is now available, rebuild instant session data packet."

    .line 16
    .line 17
    invoke-static {v1, v3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/16 v4, 0x1101

    .line 27
    .line 28
    invoke-static {v1, v4, v3, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    goto :goto_3

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object v1, p0, Lg2/k0;->n:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v1

    .line 38
    :try_start_1
    iget-boolean v0, p0, Lg2/k0;->m:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 43
    .line 44
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const/16 v4, 0x1102

    .line 49
    .line 50
    invoke-static {v0, v4, v3, v2}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    :goto_1
    monitor-exit v1

    .line 57
    return-void

    .line 58
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    throw v0

    .line 60
    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    throw v1

    .line 62
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x65

    .line 24
    .line 25
    if-ne v1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0, p1}, Lg2/k0;->I(Lorg/json/JSONObject;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0, p1}, Lg2/k0;->I(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public f(Ljava/lang/Object;I)V
    .locals 6

    .line 1
    sget-boolean v0, Le2/a;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_0

    .line 6
    .line 7
    :cond_0
    const/16 v0, 0x2015

    .line 8
    .line 9
    if-eq p2, v0, :cond_9

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    packed-switch p2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    packed-switch p2, :pswitch_data_1

    .line 18
    .line 19
    .line 20
    packed-switch p2, :pswitch_data_2

    .line 21
    .line 22
    .line 23
    packed-switch p2, :pswitch_data_3

    .line 24
    .line 25
    .line 26
    packed-switch p2, :pswitch_data_4

    .line 27
    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :pswitch_0
    const-string p1, "MobclickRT"

    .line 32
    .line 33
    const-string p2, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY."

    .line 34
    .line 35
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {p1}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_b

    .line 45
    .line 46
    iget-object p1, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 47
    .line 48
    invoke-virtual {p1}, Lg2/k0$c;->f()Lv2/e$h;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of p1, p1, Lv2/e$f;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_1
    invoke-virtual {p0, v2}, Lg2/k0;->i(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    invoke-virtual {p0, p1, v0}, Lg2/k0;->g(Ljava/lang/Object;Z)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    const-string p1, "MobclickRT"

    .line 67
    .line 68
    const-string p2, "--->>> receive DELAY_BUILD_ENVELOPE event."

    .line 69
    .line 70
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 74
    .line 75
    const/16 p2, 0x2011

    .line 76
    .line 77
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p1, p2, v0, v1}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 85
    .line 86
    const/16 p2, 0x1102

    .line 87
    .line 88
    invoke-static {p1}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {p1, p2, v0, v1}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_3
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, v1}, Lcom/umeng/analytics/a;->i(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_4
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p2, p1}, Lcom/umeng/analytics/a;->i(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_5
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lcom/umeng/analytics/a;->q()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_6
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Lcom/umeng/analytics/a;->r()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_7
    invoke-static {}, Lcom/umeng/analytics/a;->b()Lcom/umeng/analytics/a;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2, p1}, Lcom/umeng/analytics/a;->g(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_8
    if-nez p1, :cond_2

    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_2
    sget-object p2, Lg2/k0;->p:Ljava/lang/Class;

    .line 141
    .line 142
    if-eqz p2, :cond_b

    .line 143
    .line 144
    sget-object p2, Lg2/k0;->q:Ljava/lang/reflect/Method;

    .line 145
    .line 146
    if-nez p2, :cond_3

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_3
    const-string p2, "MobclickRT"

    .line 151
    .line 152
    const-string v0, "--->>> PROFILE_CHANGE_NOTIFY"

    .line 153
    .line 154
    invoke-static {p2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :try_start_1
    const-string p2, ""

    .line 158
    .line 159
    const-string v0, ""

    .line 160
    .line 161
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 162
    .line 163
    if-eqz v1, :cond_b

    .line 164
    .line 165
    check-cast p1, Lorg/json/JSONObject;

    .line 166
    .line 167
    const-string v1, "uid"

    .line 168
    .line 169
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    const-string v1, "provider"

    .line 176
    .line 177
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_4

    .line 182
    .line 183
    const-string p2, "provider"

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const-string v0, "uid"

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :cond_4
    invoke-virtual {p0, v0, p2}, Lg2/k0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_9
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 200
    .line 201
    invoke-static {p2}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_5

    .line 206
    .line 207
    if-eqz p1, :cond_b

    .line 208
    .line 209
    invoke-virtual {p0, p1}, Lg2/k0;->C(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_5
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 217
    .line 218
    invoke-static {p2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->h(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 223
    .line 224
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/b;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    new-instance v1, Lorg/json/JSONArray;

    .line 229
    .line 230
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->j(Ljava/lang/String;Lorg/json/JSONArray;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_a
    invoke-virtual {p0}, Lg2/k0;->t()V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :pswitch_b
    invoke-virtual {p0, p1, v2}, Lg2/k0;->g(Ljava/lang/Object;Z)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :pswitch_c
    const-string p2, "MobclickRT"

    .line 250
    .line 251
    const-string v0, "--->>> INSTANT_SESSION_START"

    .line 252
    .line 253
    invoke-static {p2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 261
    .line 262
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/e;->m(Landroid/content/Context;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object p2, p0, Lg2/k0;->n:Ljava/lang/Object;

    .line 266
    .line 267
    monitor-enter p2

    .line 268
    :try_start_2
    iput-boolean v2, p0, Lg2/k0;->l:Z

    .line 269
    .line 270
    monitor-exit p2

    .line 271
    return-void

    .line 272
    :catchall_0
    move-exception v0

    .line 273
    move-object p1, v0

    .line 274
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 275
    throw p1

    .line 276
    :pswitch_d
    invoke-virtual {p0, p1}, Lg2/k0;->K(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_e
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_f
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 289
    .line 290
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/e;->q(Landroid/content/Context;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_10
    const-string p2, "MobclickRT"

    .line 295
    .line 296
    const-string v0, "--->>> START_SESSION"

    .line 297
    .line 298
    invoke-static {p2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-static {}, Lcom/umeng/analytics/pro/e;->d()Lcom/umeng/analytics/pro/e;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 306
    .line 307
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/e;->g(Landroid/content/Context;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    iget-object p2, p0, Lg2/k0;->n:Ljava/lang/Object;

    .line 311
    .line 312
    monitor-enter p2

    .line 313
    :try_start_3
    iput-boolean v2, p0, Lg2/k0;->m:Z

    .line 314
    .line 315
    monitor-exit p2

    .line 316
    return-void

    .line 317
    :catchall_1
    move-exception v0

    .line 318
    move-object p1, v0

    .line 319
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 320
    throw p1

    .line 321
    :pswitch_11
    const-string p2, "MobclickRT"

    .line 322
    .line 323
    const-string v0, "--->>> PROFILE_SIGNOFF"

    .line 324
    .line 325
    invoke-static {p2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v1, v2}, Lg2/k0;->g(Ljava/lang/Object;Z)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, p1}, Lg2/k0;->E(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :pswitch_12
    const-string p2, "MobclickRT"

    .line 336
    .line 337
    const-string v0, "--->>> PROFILE_SIGNIN"

    .line 338
    .line 339
    invoke-static {p2, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, v1, v2}, Lg2/k0;->g(Ljava/lang/Object;Z)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0, p1}, Lg2/k0;->H(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :pswitch_13
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 350
    .line 351
    invoke-static {p1}, Lcom/umeng/analytics/pro/d;->p(Landroid/content/Context;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_14
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 356
    .line 357
    invoke-static {p1}, Lcom/umeng/analytics/pro/f;->b(Landroid/content/Context;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :pswitch_15
    if-eqz p1, :cond_6

    .line 362
    .line 363
    :try_start_4
    invoke-virtual {p0, p1}, Lg2/k0;->C(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_6
    check-cast p1, Lorg/json/JSONObject;

    .line 367
    .line 368
    const-string p2, "__i"

    .line 369
    .line 370
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    const-string p2, "-1"

    .line 375
    .line 376
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    if-nez p1, :cond_b

    .line 381
    .line 382
    invoke-virtual {p0, v0}, Lg2/k0;->i(Z)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :pswitch_16
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 387
    .line 388
    invoke-static {p2}, Lz2/d;->s(Landroid/content/Context;)Z

    .line 389
    .line 390
    .line 391
    move-result p2

    .line 392
    if-eqz p2, :cond_8

    .line 393
    .line 394
    if-eqz p1, :cond_7

    .line 395
    .line 396
    invoke-virtual {p0, p1}, Lg2/k0;->C(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_7
    check-cast p1, Lorg/json/JSONObject;

    .line 400
    .line 401
    const-string p2, "__i"

    .line 402
    .line 403
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    const-string p2, "-1"

    .line 408
    .line 409
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    if-nez p1, :cond_b

    .line 414
    .line 415
    invoke-virtual {p0, v0}, Lg2/k0;->i(Z)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :cond_8
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 420
    .line 421
    invoke-static {p2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->h(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 426
    .line 427
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/b;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    new-instance v1, Lorg/json/JSONArray;

    .line 432
    .line 433
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->j(Ljava/lang/String;Lorg/json/JSONArray;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :cond_9
    const-string p1, "header_foreground_count"

    .line 445
    .line 446
    invoke-static {p1}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    if-eqz p1, :cond_b

    .line 451
    .line 452
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 453
    .line 454
    invoke-static {p1}, Lv2/b;->s(Landroid/content/Context;)Landroid/app/Activity;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    if-eqz p1, :cond_a

    .line 459
    .line 460
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 461
    .line 462
    invoke-static {p1}, Lcom/umeng/analytics/pro/e;->k(Landroid/content/Context;)V

    .line 463
    .line 464
    .line 465
    :cond_a
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 466
    .line 467
    invoke-static {v0}, Le2/b;->f(Landroid/content/Context;)Le2/b;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/4 v3, 0x0

    .line 472
    const-wide/16 v4, 0x1388

    .line 473
    .line 474
    const/16 v1, 0x2015

    .line 475
    .line 476
    invoke-static/range {v0 .. v5}, Ln2/c;->n(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    .line 477
    .line 478
    .line 479
    :catchall_2
    :cond_b
    :goto_0
    return-void

    .line 480
    nop

    .line 481
    :pswitch_data_0
    .packed-switch 0x1001
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    :pswitch_data_1
    .packed-switch 0x1100
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    :pswitch_data_2
    .packed-switch 0x2003
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    :pswitch_data_3
    .packed-switch 0x2007
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    :pswitch_data_4
    .packed-switch 0x2010
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lg2/k0;->A(Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lg2/k0;->L()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {p2}, Lcom/umeng/commonsdk/framework/a;->i(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lg2/k0;->A(Z)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lg2/k0;->L()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lg2/k0;->p:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lg2/k0;->q:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_0
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    const-string p1, "MobclickRT"

    .line 18
    .line 19
    const-string p2, "--->>> reflect call setPuidAndProvider method of crash lib failed."

    .line 20
    .line 21
    invoke-static {p1, p2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public i(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lg2/k0;->w(Z)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg2/k0$c;->f()Lv2/e$h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Lv2/e$f;

    .line 14
    .line 15
    const-string v1, "MobclickRT"

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/a;->i(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    const-string p1, "--->>> send session start in policy ReportQuasiRealtime."

    .line 30
    .line 31
    invoke-static {v1, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lg2/k0;->M()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 39
    .line 40
    sget-object v0, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->a:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/framework/a;->j(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const-string p1, "--->>> send normal data in policy ReportQuasiRealtime."

    .line 49
    .line 50
    invoke-static {v1, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lg2/k0;->M()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 58
    .line 59
    sget-object v0, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->a:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/framework/a;->j(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const-string p1, "--->>> constructMessage()"

    .line 68
    .line 69
    invoke-static {v1, p1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lg2/k0;->M()V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final j(JI)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    sub-long/2addr v2, p1

    .line 13
    const-wide/32 p1, 0x1b77400

    .line 14
    .line 15
    .line 16
    cmp-long p1, v2, p1

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lg2/k0;->R()V

    .line 21
    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    const/16 p1, 0x1388

    .line 25
    .line 26
    if-ge p3, p1, :cond_1

    .line 27
    .line 28
    return v1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1

    .line 31
    :cond_2
    return v1
.end method

.method public final k(Lorg/json/JSONArray;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "$$_onUMengEnterBackground"

    .line 6
    .line 7
    const-string v2, "$$_onUMengEnterForegroundInitError"

    .line 8
    .line 9
    const-string v3, "$$_onUMengEnterForeground"

    .line 10
    .line 11
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v3, v0, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    const-string v6, "id"

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    :catchall_0
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-lt v4, v0, :cond_2

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    return v2
.end method

.method public final l(Lorg/json/JSONObject;)Z
    .locals 7

    .line 1
    const-string v0, "ekv"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v2, v0, :cond_2

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Lg2/k0;->k(Lorg/json/JSONArray;)Z

    .line 43
    .line 44
    .line 45
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    if-lt v3, v0, :cond_3

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_3
    return v1
.end method

.method public m(J)Lorg/json/JSONObject;
    .locals 8

    .line 1
    invoke-static {}, Lcom/umeng/analytics/pro/g;->b()Lcom/umeng/analytics/pro/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v1}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/g;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v0}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v0, v2}, Lcom/umeng/analytics/pro/h;->o(Z)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 39
    .line 40
    invoke-static {v3}, Le2/c;->b(Landroid/content/Context;)[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "active_user"

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    aget-object v6, v3, v2

    .line 50
    .line 51
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_1

    .line 56
    .line 57
    aget-object v6, v3, v5

    .line 58
    .line 59
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_1

    .line 64
    .line 65
    new-instance v6, Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 68
    .line 69
    .line 70
    :try_start_0
    const-string v7, "provider"

    .line 71
    .line 72
    aget-object v2, v3, v2

    .line 73
    .line 74
    invoke-virtual {v6, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    const-string v2, "puid"

    .line 78
    .line 79
    aget-object v3, v3, v5

    .line 80
    .line 81
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Lorg/json/JSONObject;->length()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-lez v2, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    :catchall_0
    :cond_1
    invoke-static {}, Lg2/n0;->b()Lg2/n0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lg2/n0;->a(Landroid/content/Context;)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const/4 v6, 0x3

    .line 108
    if-ne v3, v5, :cond_2

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    if-eq v2, v6, :cond_2

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_2
    invoke-static {}, Lg2/n0;->b()Lg2/n0;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget-object v4, Lg2/k0;->o:Landroid/content/Context;

    .line 124
    .line 125
    invoke-virtual {v3, v0, v4}, Lg2/n0;->f(Lorg/json/JSONObject;Landroid/content/Context;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-gtz v3, :cond_3

    .line 133
    .line 134
    if-eq v2, v6, :cond_3

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_3
    invoke-virtual {p0}, Lg2/k0;->N()Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-eqz v1, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0, v1}, Lg2/k0;->s(Lorg/json/JSONObject;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    new-instance v3, Lorg/json/JSONObject;

    .line 147
    .line 148
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v4, Lorg/json/JSONObject;

    .line 152
    .line 153
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v5, "analytics"

    .line 157
    .line 158
    if-ne v2, v6, :cond_5

    .line 159
    .line 160
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 161
    .line 162
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-lez v2, :cond_6

    .line 174
    .line 175
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    :cond_6
    :goto_0
    if-eqz v1, :cond_7

    .line 179
    .line 180
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-lez v0, :cond_7

    .line 185
    .line 186
    const-string v0, "header"

    .line 187
    .line 188
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 189
    .line 190
    .line 191
    :cond_7
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-lez v0, :cond_8

    .line 196
    .line 197
    const-string v0, "content"

    .line 198
    .line 199
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    :cond_8
    invoke-virtual {p0, v3, p1, p2}, Lg2/k0;->n(Lorg/json/JSONObject;J)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    :catchall_1
    return-object v3
.end method

.method public final n(Lorg/json/JSONObject;J)Lorg/json/JSONObject;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Lg2/m0;->b(Lorg/json/JSONObject;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    cmp-long p2, v0, p2

    .line 6
    .line 7
    if-lez p2, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p2}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 p3, 0x1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p2, p3, v0}, Lcom/umeng/analytics/pro/h;->j(ZZ)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Lg2/k0;->o:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p2}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Lcom/umeng/analytics/pro/h;->p()V

    .line 28
    .line 29
    .line 30
    const-string p2, "MobclickRT"

    .line 31
    .line 32
    const-string p3, "--->>> Instant session packet overload !!! "

    .line 33
    .line 34
    invoke-static {p2, p3}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    :cond_0
    return-object p1
.end method

.method public o(Z)Lorg/json/JSONObject;
    .locals 17

    .line 1
    const-string v1, "userlevel"

    .line 2
    .line 3
    const-string v0, "autopages"

    .line 4
    .line 5
    const-string v2, "sessions"

    .line 6
    .line 7
    const-string v3, "pages"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    sget-object v5, Lg2/k0;->o:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v5}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    move/from16 v6, p1

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Lcom/umeng/analytics/pro/h;->d(Z)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    move-object v4, v0

    .line 30
    goto/16 :goto_9

    .line 31
    .line 32
    :cond_0
    :try_start_1
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_a

    .line 37
    .line 38
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v7, Lorg/json/JSONArray;

    .line 43
    .line 44
    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-ge v8, v9, :cond_9

    .line 53
    .line 54
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    check-cast v9, Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    if-nez v10, :cond_1

    .line 69
    .line 70
    if-eqz v11, :cond_1

    .line 71
    .line 72
    invoke-virtual {v9, v3, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catch_0
    move-exception v0

    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_1
    :goto_1
    const-string v12, "page_start"

    .line 83
    .line 84
    if-eqz v10, :cond_5

    .line 85
    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :try_start_2
    new-instance v13, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    :goto_2
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-ge v14, v15, :cond_2

    .line 99
    .line 100
    invoke-virtual {v10, v14}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    check-cast v15, Lorg/json/JSONObject;

    .line 105
    .line 106
    invoke-interface {v13, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    add-int/lit8 v14, v14, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    const/4 v10, 0x0

    .line 113
    :goto_3
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    if-ge v10, v14, :cond_3

    .line 118
    .line 119
    invoke-virtual {v11, v10}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    check-cast v14, Lorg/json/JSONObject;

    .line 124
    .line 125
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_3
    new-instance v10, Lz2/c;

    .line 132
    .line 133
    invoke-direct {v10}, Lz2/c;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10, v12}, Lz2/c;->b(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v13, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 140
    .line 141
    .line 142
    new-instance v10, Lorg/json/JSONArray;

    .line 143
    .line 144
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    const/4 v14, 0x0

    .line 152
    :goto_4
    if-ge v14, v11, :cond_4

    .line 153
    .line 154
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    add-int/lit8 v14, v14, 0x1

    .line 159
    .line 160
    check-cast v15, Lorg/json/JSONObject;

    .line 161
    .line 162
    invoke-virtual {v10, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_4
    invoke-virtual {v9, v3, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v10
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    const-string v11, "$page_num"

    .line 177
    .line 178
    if-eqz v10, :cond_8

    .line 179
    .line 180
    :try_start_3
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    const/4 v13, 0x0

    .line 185
    :goto_5
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 186
    .line 187
    .line 188
    move-result v14

    .line 189
    if-ge v13, v14, :cond_7

    .line 190
    .line 191
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 192
    .line 193
    .line 194
    move-result-object v14

    .line 195
    invoke-virtual {v14, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    if-eqz v15, :cond_6

    .line 200
    .line 201
    const-string v15, "ts"

    .line 202
    .line 203
    move-object/from16 v16, v6

    .line 204
    .line 205
    invoke-virtual {v14, v12}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 206
    .line 207
    .line 208
    move-result-wide v5

    .line 209
    invoke-virtual {v14, v15, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v14, v12}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_6
    move-object/from16 v16, v6

    .line 217
    .line 218
    :goto_6
    add-int/lit8 v13, v13, 0x1

    .line 219
    .line 220
    move-object/from16 v6, v16

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_7
    move-object/from16 v16, v6

    .line 224
    .line 225
    invoke-virtual {v9, v3, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    invoke-virtual {v9, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 233
    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_8
    move-object/from16 v16, v6

    .line 237
    .line 238
    const/4 v5, 0x0

    .line 239
    invoke-virtual {v9, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 240
    .line 241
    .line 242
    :goto_7
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 243
    .line 244
    .line 245
    add-int/lit8 v8, v8, 0x1

    .line 246
    .line 247
    move-object/from16 v6, v16

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_9
    invoke-virtual {v4, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 252
    .line 253
    .line 254
    goto :goto_9

    .line 255
    :goto_8
    :try_start_4
    const-string v2, "merge pages error"

    .line 256
    .line 257
    invoke-static {v2}, Lv2/d;->c(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 261
    .line 262
    .line 263
    :cond_a
    :goto_9
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 264
    .line 265
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_b

    .line 270
    .line 271
    const-string v2, ""

    .line 272
    .line 273
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_b

    .line 282
    .line 283
    invoke-virtual {v4, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 284
    .line 285
    .line 286
    :cond_b
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 287
    .line 288
    invoke-static {v0}, Le2/c;->b(Landroid/content/Context;)[Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_c

    .line 293
    .line 294
    const/4 v5, 0x0

    .line 295
    aget-object v1, v0, v5

    .line 296
    .line 297
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-nez v1, :cond_c

    .line 302
    .line 303
    const/4 v1, 0x1

    .line 304
    aget-object v2, v0, v1

    .line 305
    .line 306
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-nez v2, :cond_c

    .line 311
    .line 312
    new-instance v2, Lorg/json/JSONObject;

    .line 313
    .line 314
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 315
    .line 316
    .line 317
    const-string v3, "provider"

    .line 318
    .line 319
    const/4 v5, 0x0

    .line 320
    aget-object v5, v0, v5

    .line 321
    .line 322
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 323
    .line 324
    .line 325
    const-string v3, "puid"

    .line 326
    .line 327
    aget-object v0, v0, v1

    .line 328
    .line 329
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-lez v0, :cond_c

    .line 337
    .line 338
    const-string v0, "active_user"

    .line 339
    .line 340
    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 341
    .line 342
    .line 343
    :cond_c
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 344
    .line 345
    invoke-static {v0}, Ly2/a;->c(Landroid/content/Context;)Ly2/a;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ly2/a;->f()Z

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    if-eqz v0, :cond_d

    .line 354
    .line 355
    new-instance v0, Lorg/json/JSONObject;

    .line 356
    .line 357
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 358
    .line 359
    .line 360
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 361
    .line 362
    invoke-static {v1}, Ly2/a;->c(Landroid/content/Context;)Ly2/a;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-virtual {v1}, Ly2/a;->d()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    sget-object v2, Lg2/k0;->o:Landroid/content/Context;

    .line 371
    .line 372
    invoke-static {v2}, Ly2/a;->c(Landroid/content/Context;)Ly2/a;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v2}, Ly2/a;->b()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 381
    .line 382
    .line 383
    const-string v1, "group_info"

    .line 384
    .line 385
    invoke-virtual {v4, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 386
    .line 387
    .line 388
    :cond_d
    invoke-static {}, Lg2/n0;->b()Lg2/n0;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 393
    .line 394
    invoke-virtual {v0, v4, v1}, Lg2/n0;->c(Lorg/json/JSONObject;Landroid/content/Context;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 395
    .line 396
    .line 397
    :catchall_0
    return-object v4
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Landroid/content/Context;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/umeng/analytics/pro/h;->y()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lg2/k0;->T()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    return-void
.end method

.method public r(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-lez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x65

    .line 24
    .line 25
    if-ne v1, v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0, p1}, Lg2/k0;->F(Lorg/json/JSONObject;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0, p1}, Lg2/k0;->F(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final s(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/h;->w()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Ls2/a;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/h;->A()Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string v1, "__av"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "__vc"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :try_start_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    const-string v3, "app_version"

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    :try_start_1
    sget-object v1, Lg2/k0;->o:Landroid/content/Context;

    .line 54
    .line 55
    invoke-static {v1}, Lz2/d;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    const-string v2, "version_code"

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    :try_start_2
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 75
    .line 76
    invoke-static {v0}, Lz2/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    :catchall_0
    :cond_2
    return-void
.end method

.method public t()V
    .locals 1

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lg2/k0;->i(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public u(Ljava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p1, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg2/k0;->q(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Lg2/k0;->A(Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lg2/k0;->M()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final v(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/h;->z()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "version_code"

    .line 12
    .line 13
    const-string v2, "app_version"

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/h;->B()Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const-string v3, "__av"

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "__vc"

    .line 36
    .line 37
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    sget-object v3, Lg2/k0;->o:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {v3}, Lz2/d;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v0}, Lz2/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {v0}, Lz2/d;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 90
    .line 91
    invoke-static {v0}, Lz2/d;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    :catchall_0
    :cond_3
    :goto_1
    return-void
.end method

.method public final w(Z)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg2/k0;->V()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lg2/k0$c;

    .line 14
    .line 15
    invoke-direct {v0}, Lg2/k0$c;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 21
    .line 22
    invoke-virtual {v0}, Lg2/k0$c;->b()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lg2/k0;->a:Lg2/k0$c;

    .line 26
    .line 27
    invoke-virtual {v0}, Lg2/k0$c;->f()Lv2/e$h;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p1}, Lv2/e$h;->b(Z)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_5

    .line 36
    .line 37
    instance-of v1, v0, Lv2/e$d;

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    instance-of v1, v0, Lv2/e$a;

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    instance-of v1, v0, Lv2/e$f;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Lg2/k0;->S()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 56
    .line 57
    .line 58
    :cond_3
    instance-of v1, v0, Lv2/e$b;

    .line 59
    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Lg2/k0;->S()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lg2/k0;->x()V

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-static {}, Lk2/a;->e()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "\u6570\u636e\u53d1\u9001\u7b56\u7565 : "

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lv2/d;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    return p1
.end method

.method public x()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "MobclickRT"

    .line 10
    .line 11
    const-string v1, "--->>>*** flushMemoryData: \u4e8b\u4ef6\u843d\u5e93\u3002"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/h;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/h;->h(Lorg/json/JSONArray;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lorg/json/JSONArray;

    .line 28
    .line 29
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lg2/k0;->f:Lorg/json/JSONArray;

    .line 33
    .line 34
    :cond_0
    sget-object v0, Lg2/k0;->o:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "thtstart"

    .line 45
    .line 46
    iget-wide v2, p0, Lg2/k0;->j:J

    .line 47
    .line 48
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "gkvc"

    .line 53
    .line 54
    iget v2, p0, Lg2/k0;->h:I

    .line 55
    .line 56
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "ekvc"

    .line 61
    .line 62
    iget v2, p0, Lg2/k0;->i:I

    .line 63
    .line 64
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :catchall_0
    return-void
.end method

.method public y(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg2/k0;->U()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg2/k0;->P()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lg2/k0;->Q()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-virtual {p0, p1}, Lg2/k0;->i(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final z(Lorg/json/JSONObject;)V
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "version_code"

    .line 4
    .line 5
    const-string v2, "autopages"

    .line 6
    .line 7
    const-string v3, "analytics"

    .line 8
    .line 9
    const-string v4, "channel"

    .line 10
    .line 11
    const-string v5, "appkey"

    .line 12
    .line 13
    const-string v6, "device_model"

    .line 14
    .line 15
    const-string v7, "device_id"

    .line 16
    .line 17
    const-string v8, "sdk_version"

    .line 18
    .line 19
    const-string v9, "header"

    .line 20
    .line 21
    const-string v10, "dplus"

    .line 22
    .line 23
    const-string v11, "active_user"

    .line 24
    .line 25
    const-string v12, "activate_msg"

    .line 26
    .line 27
    const-string v13, "sessions"

    .line 28
    .line 29
    const-string v14, "error"

    .line 30
    .line 31
    const-string v15, "gkv"

    .line 32
    .line 33
    move-object/from16 v16, v4

    .line 34
    .line 35
    const-string v4, "ekv"

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 41
    .line 42
    .line 43
    move-result v17

    .line 44
    if-gtz v17, :cond_1

    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :cond_1
    move-object/from16 v17, v5

    .line 48
    .line 49
    new-instance v5, Lorg/json/JSONObject;

    .line 50
    .line 51
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v18

    .line 58
    if-eqz v18, :cond_b

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v18

    .line 68
    if-eqz v18, :cond_2

    .line 69
    .line 70
    move-object/from16 v18, v1

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v5, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-lez v1, :cond_3

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v4, "\u4e8b\u4ef6:"

    .line 91
    .line 92
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v5, Lorg/json/JSONObject;

    .line 110
    .line 111
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_2
    move-object/from16 v18, v1

    .line 119
    .line 120
    :cond_3
    :goto_1
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_4

    .line 125
    .line 126
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v5, v15, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-lez v1, :cond_4

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v4, "\u6e38\u620f\u4e8b\u4ef6:"

    .line 145
    .line 146
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v5, Lorg/json/JSONObject;

    .line 164
    .line 165
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_5

    .line 173
    .line 174
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v5, v14, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-lez v1, :cond_5

    .line 186
    .line 187
    new-instance v1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    const-string v4, "\u9519\u8bef:"

    .line 193
    .line 194
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    new-instance v5, Lorg/json/JSONObject;

    .line 212
    .line 213
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 214
    .line 215
    .line 216
    :cond_5
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_9

    .line 221
    .line 222
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v4, Lorg/json/JSONArray;

    .line 227
    .line 228
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 229
    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    :goto_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    if-ge v14, v15, :cond_8

    .line 237
    .line 238
    invoke-virtual {v1, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    if-eqz v15, :cond_7

    .line 243
    .line 244
    invoke-virtual {v15}, Lorg/json/JSONObject;->length()I

    .line 245
    .line 246
    .line 247
    move-result v19

    .line 248
    if-lez v19, :cond_7

    .line 249
    .line 250
    invoke-virtual {v15, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 251
    .line 252
    .line 253
    move-result v19

    .line 254
    if-eqz v19, :cond_6

    .line 255
    .line 256
    invoke-virtual {v15, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :cond_6
    invoke-virtual {v4, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 260
    .line 261
    .line 262
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_8
    invoke-virtual {v5, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-lez v1, :cond_9

    .line 273
    .line 274
    new-instance v1, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const-string v2, "\u4f1a\u8bdd:"

    .line 280
    .line 281
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {v1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    new-instance v1, Lorg/json/JSONObject;

    .line 299
    .line 300
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 301
    .line 302
    .line 303
    move-object v5, v1

    .line 304
    :cond_9
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-eqz v1, :cond_a

    .line 309
    .line 310
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-virtual {v5, v12, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 315
    .line 316
    .line 317
    :cond_a
    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_c

    .line 322
    .line 323
    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {v5, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-lez v1, :cond_c

    .line 335
    .line 336
    new-instance v1, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 339
    .line 340
    .line 341
    const-string v2, "\u8d26\u53f7:"

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-static {v1}, Lv2/d;->a(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    new-instance v5, Lorg/json/JSONObject;

    .line 361
    .line 362
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 363
    .line 364
    .line 365
    goto :goto_3

    .line 366
    :cond_b
    move-object/from16 v18, v1

    .line 367
    .line 368
    :cond_c
    :goto_3
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_d

    .line 373
    .line 374
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v5, v10, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    :cond_d
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-eqz v1, :cond_14

    .line 386
    .line 387
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-eqz v1, :cond_14

    .line 392
    .line 393
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-eqz v0, :cond_14

    .line 398
    .line 399
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-lez v1, :cond_14

    .line 404
    .line 405
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_e

    .line 410
    .line 411
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v5, v8, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 416
    .line 417
    .line 418
    :cond_e
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_f

    .line 423
    .line 424
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v5, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 429
    .line 430
    .line 431
    :cond_f
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    if-eqz v1, :cond_10

    .line 436
    .line 437
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v5, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 442
    .line 443
    .line 444
    :cond_10
    move-object/from16 v1, v18

    .line 445
    .line 446
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-eqz v2, :cond_11

    .line 451
    .line 452
    const-string v2, "version"

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    invoke-virtual {v5, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 459
    .line 460
    .line 461
    :cond_11
    move-object/from16 v1, v17

    .line 462
    .line 463
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-eqz v2, :cond_12

    .line 468
    .line 469
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v5, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 474
    .line 475
    .line 476
    :cond_12
    move-object/from16 v1, v16

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    if-eqz v2, :cond_13

    .line 483
    .line 484
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v5, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    :cond_13
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-lez v0, :cond_14

    .line 496
    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 500
    .line 501
    .line 502
    const-string v1, "\u57fa\u7840\u4fe1\u606f:"

    .line 503
    .line 504
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-static {v0}, Lv2/d;->a(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    new-instance v5, Lorg/json/JSONObject;

    .line 522
    .line 523
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 524
    .line 525
    .line 526
    :cond_14
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :goto_4
    invoke-static {v0}, Lv2/d;->g(Ljava/lang/Throwable;)V

    .line 531
    .line 532
    .line 533
    return-void
.end method
