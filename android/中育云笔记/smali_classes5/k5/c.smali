.class public Lk5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Ljava/lang/String; = "c"


# instance fields
.field public final a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

.field public final b:Landroid/content/Context;

.field public final c:Li5/a;

.field public d:Lk5/d;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/List;

.field public final g:Lorg/json/JSONArray;

.field public final h:Ljava/util/List;

.field public final i:Lm5/c;

.field public j:Ljava/lang/String;

.field public k:J


# direct methods
.method public constructor <init>(Lm5/c;Li5/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk5/c;->e:Ljava/util/Map;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lk5/c;->f:Ljava/util/List;

    .line 19
    .line 20
    new-instance v0, Lorg/json/JSONArray;

    .line 21
    .line 22
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lk5/c;->g:Lorg/json/JSONArray;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lk5/c;->h:Ljava/util/List;

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    iput-object v0, p0, Lk5/c;->j:Ljava/lang/String;

    .line 37
    .line 38
    const-wide/16 v0, 0x1

    .line 39
    .line 40
    iput-wide v0, p0, Lk5/c;->k:J

    .line 41
    .line 42
    iput-object p1, p0, Lk5/c;->i:Lm5/c;

    .line 43
    .line 44
    invoke-virtual {p1}, Lm5/c;->c()Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 49
    .line 50
    invoke-virtual {p1}, Lm5/c;->a()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lk5/c;->b:Landroid/content/Context;

    .line 55
    .line 56
    iput-object p2, p0, Lk5/c;->c:Li5/a;

    .line 57
    .line 58
    invoke-virtual {p0}, Lk5/c;->h()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lk5/c;->i()V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/c;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;Li5/c;)Lk5/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/c;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, Lk5/c;->h:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v2, p2, p3}, Lk5/c;->c(Ljava/util/concurrent/ExecutorService;Ljava/util/List;Ljava/lang/String;Li5/c;)Lk5/d;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Lk5/d;->f()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    :goto_0
    sget-object p3, Lk5/c;->l:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v2, "use 2.0 interface return http\'s code is\uff1a{%d}"

    .line 40
    .line 41
    invoke-static {p3, v2, p2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 45
    .line 46
    .line 47
    move-result-wide p2

    .line 48
    sub-long/2addr p2, v0

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v1, p0, Lk5/c;->f:Ljava/util/List;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lk5/c;->g:Lorg/json/JSONArray;

    .line 57
    .line 58
    iget-object v2, p0, Lk5/c;->b:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {v0, p2, p3, v1, v2}, Lk5/e;->b(Ljava/util/ArrayList;JLorg/json/JSONArray;Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Lk5/c;->f:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 66
    .line 67
    .line 68
    return-object p1
.end method

.method public final c(Ljava/util/concurrent/ExecutorService;Ljava/util/List;Ljava/lang/String;Li5/c;)Lk5/d;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    move v5, v1

    .line 5
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge v5, v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v3, Lk5/a;

    .line 25
    .line 26
    iget-object v7, p0, Lk5/c;->b:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v9, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 29
    .line 30
    move-object v6, p0

    .line 31
    move-object v8, p3

    .line 32
    move-object v10, p4

    .line 33
    invoke-direct/range {v3 .. v10}, Lk5/a;-><init>(Ljava/lang/String;ILk5/c;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Li5/c;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lk5/a;->g()Ljava/util/concurrent/Callable;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    iget-object p4, v6, Lk5/c;->e:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {p4, v4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    const/4 p4, 0x1

    .line 50
    :try_start_0
    iget-wide v3, v6, Lk5/c;->k:J

    .line 51
    .line 52
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 53
    .line 54
    invoke-interface {p3, v3, v4, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lk5/d;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_6

    .line 59
    .line 60
    if-eqz p3, :cond_1

    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p3}, Lk5/d;->D()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    invoke-virtual {p3}, Lk5/d;->B()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-object v2, p3

    .line 77
    goto :goto_4

    .line 78
    :catch_1
    move-exception v0

    .line 79
    move-object p4, v0

    .line 80
    move-object v2, p3

    .line 81
    goto :goto_5

    .line 82
    :cond_0
    :goto_1
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 83
    .line 84
    const-string v2, "grs request return body is not null and is OK."

    .line 85
    .line 86
    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 87
    .line 88
    .line 89
    move-object v2, p3

    .line 90
    goto :goto_7

    .line 91
    :catch_2
    move-object v2, p3

    .line 92
    goto :goto_3

    .line 93
    :catch_3
    move-object v2, p3

    .line 94
    goto :goto_6

    .line 95
    :cond_1
    move-object v2, p3

    .line 96
    :goto_2
    move p4, v1

    .line 97
    goto :goto_7

    .line 98
    :catch_4
    move-exception v0

    .line 99
    goto :goto_4

    .line 100
    :catch_5
    move-exception v0

    .line 101
    move-object p4, v0

    .line 102
    goto :goto_5

    .line 103
    :catch_6
    :goto_3
    sget-object p3, Lk5/c;->l:Ljava/lang/String;

    .line 104
    .line 105
    const-string p4, "the wait timed out"

    .line 106
    .line 107
    invoke-static {p3, p4}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :goto_4
    sget-object p3, Lk5/c;->l:Ljava/lang/String;

    .line 112
    .line 113
    const-string v3, "the current thread was interrupted while waiting"

    .line 114
    .line 115
    invoke-static {p3, v3, v0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_7

    .line 119
    :goto_5
    sget-object p3, Lk5/c;->l:Ljava/lang/String;

    .line 120
    .line 121
    const-string v0, "the computation threw an ExecutionException"

    .line 122
    .line 123
    invoke-static {p3, v0, p4}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catch_7
    :goto_6
    sget-object p3, Lk5/c;->l:Ljava/lang/String;

    .line 128
    .line 129
    const-string v0, "{requestServer} the computation was cancelled"

    .line 130
    .line 131
    invoke-static {p3, v0}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_2
    move-object v6, p0

    .line 136
    move-object v8, p3

    .line 137
    move-object v10, p4

    .line 138
    goto :goto_2

    .line 139
    :goto_7
    if-eqz p4, :cond_3

    .line 140
    .line 141
    sget-object p1, Lk5/c;->l:Ljava/lang/String;

    .line 142
    .line 143
    const-string p2, "needBreak is true so need break current circulation"

    .line 144
    .line 145
    invoke-static {p1, p2}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 150
    .line 151
    move-object p3, v8

    .line 152
    move-object p4, v10

    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_4
    move-object v6, p0

    .line 156
    :goto_8
    invoke-virtual {p0, v2}, Lk5/c;->g(Lk5/d;)Lk5/d;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 13
    .line 14
    invoke-virtual {p0}, Lk5/c;->j()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v1, p0, Lk5/c;->b:Landroid/content/Context;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p1, v2, v2, p2, v1}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsReqParamJoint(ZZLjava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    const-string p2, "?"

    .line 32
    .line 33
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lk5/c;->h:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public declared-synchronized e(Lk5/d;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk5/c;->f:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk5/c;->d:Lk5/d;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Lk5/d;->D()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lk5/c;->d:Lk5/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Lk5/d;->B()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :goto_0
    sget-object p1, Lk5/c;->l:Ljava/lang/String;

    .line 30
    .line 31
    const-string v0, "grsResponseResult is ok"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lk5/d;->C()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 46
    .line 47
    const-string v2, "GRS server open 503 limiting strategy."

    .line 48
    .line 49
    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 53
    .line 54
    iget-object v2, p0, Lk5/c;->b:Landroid/content/Context;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v1, v2}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ln5/d$a;

    .line 61
    .line 62
    invoke-virtual {p1}, Lk5/d;->z()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    invoke-direct {v1, v2, v3, v4, v5}, Ln5/d$a;-><init>(JJ)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Ln5/d;->b(Ljava/lang/String;Ln5/d$a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :cond_2
    :try_start_2
    invoke-virtual {p1}, Lk5/d;->B()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 85
    .line 86
    const-string v2, "GRS server open 304 Not Modified."

    .line 87
    .line 88
    invoke-static {v0, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p1}, Lk5/d;->D()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    invoke-virtual {p1}, Lk5/d;->B()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_4

    .line 102
    .line 103
    sget-object p1, Lk5/c;->l:Ljava/lang/String;

    .line 104
    .line 105
    const-string v0, "grsResponseResult has exception so need return"

    .line 106
    .line 107
    invoke-static {p1, v0}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit p0

    .line 111
    return-void

    .line 112
    :cond_4
    :try_start_3
    iput-object p1, p0, Lk5/c;->d:Lk5/d;

    .line 113
    .line 114
    iget-object v0, p0, Lk5/c;->c:Li5/a;

    .line 115
    .line 116
    iget-object v2, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 117
    .line 118
    iget-object v3, p0, Lk5/c;->b:Landroid/content/Context;

    .line 119
    .line 120
    iget-object v4, p0, Lk5/c;->i:Lm5/c;

    .line 121
    .line 122
    invoke-virtual {v0, v2, p1, v3, v4}, Li5/a;->f(Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;Lk5/d;Landroid/content/Context;Lm5/c;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lk5/c;->e:Ljava/util/Map;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Ljava/util/Map$Entry;

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p1}, Lk5/d;->A()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-nez v3, :cond_5

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Ljava/util/concurrent/Future;

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    if-nez v3, :cond_5

    .line 174
    .line 175
    sget-object v3, Lk5/c;->l:Ljava/lang/String;

    .line 176
    .line 177
    const-string v4, "future cancel"

    .line 178
    .line 179
    invoke-static {v3, v4}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Ljava/util/concurrent/Future;

    .line 187
    .line 188
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_6
    monitor-exit p0

    .line 193
    return-void

    .line 194
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 195
    throw p1
.end method

.method public f(Lm5/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(Lk5/d;)Lk5/d;
    .locals 6

    .line 1
    iget-object v0, p0, Lk5/c;->e:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lk5/d;->D()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lk5/d;->B()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    :cond_1
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/util/concurrent/Future;

    .line 42
    .line 43
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 44
    .line 45
    const-wide/32 v4, 0x9c40

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lk5/d;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    .line 53
    .line 54
    move-object p1, v2

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception v1

    .line 57
    goto :goto_1

    .line 58
    :catch_1
    move-exception v1

    .line 59
    goto :goto_3

    .line 60
    :catch_2
    sget-object v2, Lk5/c;->l:Ljava/lang/String;

    .line 61
    .line 62
    const-string v3, "{checkResponse} when check result, find TimeoutException, cancel current request task"

    .line 63
    .line 64
    invoke-static {v2, v3}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Ljava/util/concurrent/Future;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_0

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/util/concurrent/Future;

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :goto_1
    sget-object v2, Lk5/c;->l:Ljava/lang/String;

    .line 91
    .line 92
    const-string v3, "{checkResponse} when check result, find InterruptedException, check others"

    .line 93
    .line 94
    :goto_2
    invoke-static {v2, v3, v1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_3
    sget-object v2, Lk5/c;->l:Ljava/lang/String;

    .line 99
    .line 100
    const-string v3, "{checkResponse} when check result, find ExecutionException, check others"

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catch_3
    sget-object v1, Lk5/c;->l:Ljava/lang/String;

    .line 104
    .line 105
    const-string v2, "{checkResponse} when check result, find CancellationException, check others"

    .line 106
    .line 107
    invoke-static {v1, v2}, Lcom/huawei/hms/framework/common/Logger;->i(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    return-object p1
.end method

.method public final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/c;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Ll5/a;->a(Landroid/content/Context;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "g*s***_se****er_conf*** maybe has a big error"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, v0}, Lk5/c;->f(Lm5/d;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lm5/d;->a()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_5

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-gtz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/16 v3, 0xa

    .line 38
    .line 39
    if-gt v2, v3, :cond_4

    .line 40
    .line 41
    invoke-virtual {v0}, Lm5/d;->e()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-lez v2, :cond_3

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    const-string v3, "https://"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    sget-object v2, Lk5/c;->l:Ljava/lang/String;

    .line 76
    .line 77
    const-string v3, "grs server just support https scheme url,please check."

    .line 78
    .line 79
    invoke-static {v2, v3}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p0, v0, v2}, Lk5/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v1, p0, Lk5/c;->h:Ljava/util/List;

    .line 90
    .line 91
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v2, "request to GRS server url is {%s}"

    .line 96
    .line 97
    invoke-static {v0, v2, v1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    const-string v1, "grs_base_url\'s count is larger than MAX value 10"

    .line 104
    .line 105
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_5
    :goto_1
    sget-object v0, Lk5/c;->l:Ljava/lang/String;

    .line 110
    .line 111
    const-string v1, "maybe grs_base_url config with [],please check."

    .line 112
    .line 113
    invoke-static {v0, v1}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/c;->a:Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/c;->b:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v0, v2, v2, v1}, Lcom/huawei/hms/framework/network/grs/GrsBaseInfo;->getGrsParasKey(ZZLandroid/content/Context;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/c;->c:Li5/a;

    .line 11
    .line 12
    invoke-virtual {v1}, Li5/a;->a()Li5/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, "ETag"

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, ""

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Li5/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lk5/c;->j:Ljava/lang/String;

    .line 40
    .line 41
    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/c;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lj5/b;->a(Ljava/lang/String;)Lj5/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lj5/b;->d()Lq5/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lq5/a;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lk5/c;->l:Ljava/lang/String;

    .line 26
    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "get appName from local assets is{%s}"

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Lcom/huawei/hms/framework/common/Logger;->v(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_1
    const-string v0, ""

    .line 38
    .line 39
    return-object v0
.end method
