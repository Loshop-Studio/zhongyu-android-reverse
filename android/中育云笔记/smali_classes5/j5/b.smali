.class public Lj5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/lang/Object;


# instance fields
.field public a:Lj5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

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
    sput-object v0, Lj5/b;->b:Ljava/util/Map;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lj5/b;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj5/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lj5/d;-><init>(ZZ)V

    iput-object v0, p0, Lj5/b;->a:Lj5/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2}, Lj5/b;->e(Landroid/content/Context;Z)V

    sget-object p2, Lj5/b;->b:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lj5/b;
    .locals 1

    .line 1
    sget-object v0, Lj5/b;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lj5/b;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public b(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v1, Lj5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lj5/b;->a:Lj5/a;

    .line 5
    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    move-object v6, p4

    .line 10
    move-object v7, p5

    .line 11
    move v8, p6

    .line 12
    invoke-virtual/range {v2 .. v8}, Lj5/a;->b(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    monitor-exit v1

    .line 17
    return-object p1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
.end method

.method public c(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 8

    .line 1
    sget-object v1, Lj5/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lj5/b;->a:Lj5/a;

    .line 5
    .line 6
    move-object v3, p1

    .line 7
    move-object v4, p2

    .line 8
    move-object v5, p3

    .line 9
    move-object v6, p4

    .line 10
    move v7, p5

    .line 11
    invoke-virtual/range {v2 .. v7}, Lj5/a;->e(Landroid/content/Context;Li5/a;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Ljava/lang/String;Z)Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    monitor-exit v1

    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    move-object p1, v0

    .line 19
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw p1
.end method

.method public d()Lq5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/b;->a:Lj5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/a;->k()Lq5/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e(Landroid/content/Context;Z)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-string v2, "grs_route_config_files_list.txt"

    .line 6
    .line 7
    invoke-static {v2, p1}, Ln5/c;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    sub-long/2addr v3, v0

    .line 16
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "initLocalManager configFileListContent TimeCost:%d  Content:%s"

    .line 25
    .line 26
    const-string v3, "LocalManagerProxy"

    .line 27
    .line 28
    invoke-static {v3, v1, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, ""

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getBrand(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {p1, v2}, Lcom/huawei/hms/framework/common/AssetsUtil;->list(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v5, "list by AssetsManager, timeCost:"

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    sub-long/2addr v5, v0

    .line 70
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v3, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const-string v0, "#"

    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_0
    if-nez v2, :cond_1

    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_1
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getAppConfigName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-instance v2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v4, "appConfigName is: "

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v3, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v2, Lj5/d;

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-direct {v2, v4, p2}, Lj5/d;-><init>(ZZ)V

    .line 131
    .line 132
    .line 133
    iput-object v2, p0, Lj5/b;->a:Lj5/a;

    .line 134
    .line 135
    const-string v2, "grs_app_global_route_config.json"

    .line 136
    .line 137
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_2

    .line 142
    .line 143
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_3

    .line 148
    .line 149
    :cond_2
    new-instance v2, Lj5/d;

    .line 150
    .line 151
    invoke-direct {v2, p1, v1, p2}, Lj5/d;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    iput-object v2, p0, Lj5/b;->a:Lj5/a;

    .line 155
    .line 156
    :cond_3
    iget-object v1, p0, Lj5/b;->a:Lj5/a;

    .line 157
    .line 158
    invoke-virtual {v1}, Lj5/a;->o()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_4

    .line 163
    .line 164
    const-string v1, "grs_sdk_global_route_config.json"

    .line 165
    .line 166
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    new-instance v1, Lj5/c;

    .line 173
    .line 174
    invoke-direct {v1, p1, p2}, Lj5/c;-><init>(Landroid/content/Context;Z)V

    .line 175
    .line 176
    .line 177
    iput-object v1, p0, Lj5/b;->a:Lj5/a;

    .line 178
    .line 179
    :cond_4
    iget-object p2, p0, Lj5/b;->a:Lj5/a;

    .line 180
    .line 181
    invoke-virtual {p2, p1, v0}, Lj5/a;->h(Landroid/content/Context;Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    new-instance p1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string p2, "on initLocalManager finish, check appGrs: "

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    iget-object p2, p0, Lj5/b;->a:Lj5/a;

    .line 195
    .line 196
    iget-object p2, p2, Lj5/a;->a:Lq5/a;

    .line 197
    .line 198
    if-nez p2, :cond_5

    .line 199
    .line 200
    const/4 v4, 0x1

    .line 201
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-static {v3, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public f(Ljava/lang/String;Li5/c;)V
    .locals 3

    .line 1
    const-string v0, "LocalManagerProxy"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lj5/b;->a:Lj5/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lj5/a;->g()Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p1, "#localConfig"

    .line 18
    .line 19
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p2, p1, v1}, Li5/c;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    new-instance p2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v1, "save local config encounter Throwable:"

    .line 41
    .line 42
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :goto_0
    invoke-static {v0, p1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catch_0
    const-string p1, "save local config encounter JSONException."

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :goto_1
    return-void
.end method

.method public g(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/b;->a:Lj5/a;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lj5/a;->p(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    sget-object v0, Lj5/b;->b:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return p2
.end method

.method public h()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lj5/b;->a:Lj5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/a;->n()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
