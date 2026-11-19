.class public Lk5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/util/Map;

.field public static final d:Ljava/lang/Object;


# instance fields
.field public a:Li5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "GrsReqPool"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/huawei/hms/framework/common/ExecutorsUtils;->newCachedThreadPool(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lk5/g;->b:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lk5/g;->c:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lk5/g;->d:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lk5/g;)Li5/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lk5/g;->a:Li5/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lk5/g;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic g(Lk5/g;Lk5/d;Lh5/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lk5/g;->f(Lk5/d;Lh5/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lm5/c;Ljava/lang/String;Li5/c;I)Lk5/d;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "request to server with service name is: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "RequestController"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lm5/c;->c()Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lm5/c;->a()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {v0, v2, v2, v1}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "request spUrlKey: "

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "RequestController"

    .line 54
    .line 55
    invoke-static {v2, v1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lk5/g;->d:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_0
    invoke-virtual {p1}, Lm5/c;->a()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, Lcom/huawei/hms/framework/common/NetworkUtil;->isNetworkAvailable(Landroid/content/Context;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x0

    .line 70
    if-nez v2, :cond_1

    .line 71
    .line 72
    :cond_0
    monitor-exit v1

    .line 73
    return-object v3

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto/16 :goto_a

    .line 76
    .line 77
    :cond_1
    invoke-static {v0}, Ln5/d;->a(Ljava/lang/String;)Ln5/d$a;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v4, Lk5/g;->c:Ljava/util/Map;

    .line 82
    .line 83
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, Lm5/b;

    .line 88
    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    invoke-virtual {v5}, Lm5/b;->b()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v5}, Lm5/b;->a()Ljava/util/concurrent/Future;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    :goto_0
    if-eqz v2, :cond_4

    .line 104
    .line 105
    invoke-virtual {v2}, Ln5/d$a;->a()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_0

    .line 110
    .line 111
    :cond_4
    const-string v2, "RequestController"

    .line 112
    .line 113
    const-string v5, "hitGrsRequestBean == null or request block is released."

    .line 114
    .line 115
    invoke-static {v2, v5}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Lk5/g;->b:Ljava/util/concurrent/ExecutorService;

    .line 119
    .line 120
    new-instance v5, Lk5/g$a;

    .line 121
    .line 122
    invoke-direct {v5, p0, p1, p2, p3}, Lk5/g$a;-><init>(Lk5/g;Lm5/c;Ljava/lang/String;Li5/c;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v2, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    new-instance p3, Lm5/b;

    .line 130
    .line 131
    invoke-direct {p3, p2}, Lm5/b;-><init>(Ljava/util/concurrent/Future;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v4, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    const/4 p3, -0x1

    .line 139
    if-eq p4, p3, :cond_5

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-virtual {p1}, Lm5/c;->a()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Ll5/a;->a(Landroid/content/Context;)Lm5/d;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_6

    .line 151
    .line 152
    invoke-virtual {p1}, Lm5/d;->f()I

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    goto :goto_2

    .line 157
    :cond_6
    const/16 p4, 0xa

    .line 158
    .line 159
    :goto_2
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const-string p3, "RequestController"

    .line 168
    .line 169
    const-string v0, "use grsQueryTimeout %d"

    .line 170
    .line 171
    invoke-static {p3, v0, p1}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    int-to-long p3, p4

    .line 175
    :try_start_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 176
    .line 177
    invoke-interface {p2, p3, p4, p1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Lk5/d;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 182
    .line 183
    return-object p1

    .line 184
    :catch_0
    move-exception p1

    .line 185
    goto :goto_3

    .line 186
    :catch_1
    move-exception p1

    .line 187
    goto :goto_5

    .line 188
    :catch_2
    move-exception p1

    .line 189
    goto :goto_6

    .line 190
    :catch_3
    move-exception p1

    .line 191
    goto :goto_7

    .line 192
    :catch_4
    move-exception p1

    .line 193
    goto :goto_8

    .line 194
    :goto_3
    const-string p2, "RequestController"

    .line 195
    .line 196
    const-string p3, "when check result, find Other Exception, check others"

    .line 197
    .line 198
    :goto_4
    invoke-static {p2, p3, p1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    goto :goto_9

    .line 202
    :goto_5
    const-string p2, "RequestController"

    .line 203
    .line 204
    const-string p3, "when check result, find TimeoutException, check others"

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :goto_6
    const-string p2, "RequestController"

    .line 208
    .line 209
    const-string p3, "when check result, find InterruptedException, check others"

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :goto_7
    const-string p2, "RequestController"

    .line 213
    .line 214
    const-string p3, "when check result, find ExecutionException, check others"

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :goto_8
    const-string p2, "RequestController"

    .line 218
    .line 219
    const-string p3, "when check result, find CancellationException, check others"

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_9
    return-object v3

    .line 223
    :goto_a
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 224
    throw p1
.end method

.method public d(Li5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/g;->a:Li5/a;

    .line 2
    .line 3
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lk5/g;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lk5/g;->c:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
.end method

.method public final f(Lk5/d;Lh5/b;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const-string v0, "RequestController"

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p1, "GrsResponse is null"

    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Lh5/b;->a()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string v1, "GrsResponse is not null"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p2, p1}, Lh5/b;->a(Lk5/d;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public h(Lm5/c;Lh5/b;Ljava/lang/String;Li5/c;I)V
    .locals 8

    .line 1
    sget-object v0, Lk5/g;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lk5/g$b;

    .line 4
    .line 5
    move-object v2, p0

    .line 6
    move-object v3, p1

    .line 7
    move-object v7, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move v6, p5

    .line 11
    invoke-direct/range {v1 .. v7}, Lk5/g$b;-><init>(Lk5/g;Lm5/c;Ljava/lang/String;Li5/c;ILh5/b;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
