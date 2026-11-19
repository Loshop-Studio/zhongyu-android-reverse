.class public final Lcom/bumptech/glide/load/engine/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/x;
.implements Lb0/z;


# static fields
.field public static final i:Z


# instance fields
.field public final a:Lb0/d0;

.field public final b:Lio/reactivex/internal/operators/observable/h;

.field public final c:Ld0/f;

.field public final d:Lb0/s;

.field public final e:Lb0/k0;

.field public final f:Lb0/t;

.field public final g:Lb0/q;

.field public final h:Lb0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, Lcom/bumptech/glide/load/engine/c;->i:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ld0/f;Lo2/a;Le0/b;Le0/b;Le0/b;Le0/b;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/c;->c:Ld0/f;

    .line 5
    .line 6
    new-instance v0, Lb0/t;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Lb0/t;-><init>(Lo2/a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/c;->f:Lb0/t;

    .line 12
    .line 13
    new-instance p2, Lb0/d;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {p2, v1}, Lb0/d;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/c;->h:Lb0/d;

    .line 20
    .line 21
    monitor-enter p0

    .line 22
    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :try_start_1
    iput-object p0, p2, Lb0/d;->d:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    new-instance p2, Lio/reactivex/internal/operators/observable/h;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p2, v1}, Lio/reactivex/internal/operators/observable/h;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/c;->b:Lio/reactivex/internal/operators/observable/h;

    .line 34
    .line 35
    new-instance p2, Lb0/d0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {p2, v1}, Lb0/d0;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/c;->a:Lb0/d0;

    .line 42
    .line 43
    new-instance v2, Lb0/s;

    .line 44
    .line 45
    move-object v8, p0

    .line 46
    move-object v7, p0

    .line 47
    move-object v3, p3

    .line 48
    move-object v4, p4

    .line 49
    move-object v5, p5

    .line 50
    move-object v6, p6

    .line 51
    invoke-direct/range {v2 .. v8}, Lb0/s;-><init>(Le0/b;Le0/b;Le0/b;Le0/b;Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/load/engine/c;)V

    .line 52
    .line 53
    .line 54
    iput-object v2, v7, Lcom/bumptech/glide/load/engine/c;->d:Lb0/s;

    .line 55
    .line 56
    new-instance p2, Lb0/q;

    .line 57
    .line 58
    invoke-direct {p2, v0}, Lb0/q;-><init>(Lb0/t;)V

    .line 59
    .line 60
    .line 61
    iput-object p2, v7, Lcom/bumptech/glide/load/engine/c;->g:Lb0/q;

    .line 62
    .line 63
    new-instance p2, Lb0/k0;

    .line 64
    .line 65
    invoke-direct {p2}, Lb0/k0;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p2, v7, Lcom/bumptech/glide/load/engine/c;->e:Lb0/k0;

    .line 69
    .line 70
    iput-object v7, p1, Ld0/f;->d:Lcom/bumptech/glide/load/engine/c;

    .line 71
    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object v7, p0

    .line 75
    :goto_0
    move-object p1, v0

    .line 76
    goto :goto_2

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    move-object v7, p0

    .line 79
    :goto_1
    move-object p1, v0

    .line 80
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 81
    :try_start_4
    throw p1

    .line 82
    :catchall_2
    move-exception v0

    .line 83
    goto :goto_0

    .line 84
    :catchall_3
    move-exception v0

    .line 85
    goto :goto_1

    .line 86
    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 87
    throw p1
.end method

.method public static c(Ljava/lang/String;JLb0/y;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroid/support/v4/media/f;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1, p2}, Lv0/f;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "ms, key: "

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "Engine"

    .line 27
    .line 28
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static f(Lb0/g0;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lb0/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lb0/a0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb0/a0;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Cannot release anything but an EngineResource"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/c;Ljava/lang/Object;Ly/c;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lb0/o;Lcom/bumptech/glide/util/CachedHashCodeArrayMap;ZZLy/f;ZZLcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lb0/g;
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-boolean v0, Lcom/bumptech/glide/load/engine/c;->i:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Lv0/f;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    iget-object v3, v2, Lcom/bumptech/glide/load/engine/c;->b:Lio/reactivex/internal/operators/observable/h;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v4, Lb0/y;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    move-object/from16 v6, p3

    .line 26
    .line 27
    move/from16 v7, p4

    .line 28
    .line 29
    move/from16 v8, p5

    .line 30
    .line 31
    move-object/from16 v10, p6

    .line 32
    .line 33
    move-object/from16 v11, p7

    .line 34
    .line 35
    move-object/from16 v9, p10

    .line 36
    .line 37
    move-object/from16 v12, p13

    .line 38
    .line 39
    invoke-direct/range {v4 .. v12}, Lb0/y;-><init>(Ljava/lang/Object;Ly/c;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Ly/f;)V

    .line 40
    .line 41
    .line 42
    monitor-enter p0

    .line 43
    move/from16 v3, p14

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, Lcom/bumptech/glide/load/engine/c;->b(Lb0/y;ZJ)Lb0/a0;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object/from16 v5, p3

    .line 52
    .line 53
    move/from16 v6, p4

    .line 54
    .line 55
    move/from16 v7, p5

    .line 56
    .line 57
    move-object/from16 v8, p6

    .line 58
    .line 59
    move-object/from16 v9, p7

    .line 60
    .line 61
    move-object/from16 v10, p8

    .line 62
    .line 63
    move-object/from16 v11, p9

    .line 64
    .line 65
    move-object/from16 v12, p10

    .line 66
    .line 67
    move/from16 v13, p11

    .line 68
    .line 69
    move/from16 v14, p12

    .line 70
    .line 71
    move-object/from16 v15, p13

    .line 72
    .line 73
    move/from16 v17, p15

    .line 74
    .line 75
    move-object/from16 v18, p16

    .line 76
    .line 77
    move-object/from16 v19, p17

    .line 78
    .line 79
    move-wide/from16 v21, v0

    .line 80
    .line 81
    move/from16 v16, v3

    .line 82
    .line 83
    move-object/from16 v20, v4

    .line 84
    .line 85
    move-object/from16 v3, p1

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-virtual/range {v2 .. v22}, Lcom/bumptech/glide/load/engine/c;->g(Lcom/bumptech/glide/c;Ljava/lang/Object;Ly/c;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lb0/o;Ljava/util/Map;ZZLy/f;ZZLcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;Lb0/y;J)Lb0/g;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v0, v5

    .line 98
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    sget-object v1, Lcom/bumptech/glide/load/DataSource;->MEMORY_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 100
    .line 101
    move-object/from16 v2, p16

    .line 102
    .line 103
    invoke-virtual {v2, v0, v1}, Lcom/bumptech/glide/request/a;->k(Lb0/g0;Lcom/bumptech/glide/load/DataSource;)V

    .line 104
    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    return-object v0

    .line 108
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw v0
.end method

.method public final b(Lb0/y;ZJ)Lb0/a0;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    move-object v7, p0

    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    iget-object p2, p0, Lcom/bumptech/glide/load/engine/c;->h:Lb0/d;

    .line 8
    .line 9
    monitor-enter p2

    .line 10
    :try_start_0
    iget-object v1, p2, Lb0/d;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lb0/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    monitor-exit p2

    .line 23
    move-object v2, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lb0/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 30
    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    :try_start_2
    invoke-virtual {p2, v1}, Lb0/d;->d(Lb0/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    move-object v7, p0

    .line 40
    goto/16 :goto_8

    .line 41
    .line 42
    :cond_2
    :goto_0
    monitor-exit p2

    .line 43
    :goto_1
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2}, Lb0/a0;->b()V

    .line 46
    .line 47
    .line 48
    :cond_3
    if-eqz v2, :cond_5

    .line 49
    .line 50
    sget-boolean p2, Lcom/bumptech/glide/load/engine/c;->i:Z

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    const-string p2, "Loaded resource from active resources"

    .line 55
    .line 56
    invoke-static {p2, p3, p4, p1}, Lcom/bumptech/glide/load/engine/c;->c(Ljava/lang/String;JLb0/y;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    return-object v2

    .line 60
    :cond_5
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/c;->c:Ld0/f;

    .line 61
    .line 62
    monitor-enter v1

    .line 63
    :try_start_3
    iget-object p2, v1, Lv0/g;->a:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 69
    if-eqz p2, :cond_6

    .line 70
    .line 71
    :try_start_4
    iget-wide v2, v1, Lv0/g;->c:J

    .line 72
    .line 73
    invoke-virtual {v1, p2}, Ld0/f;->b(Ljava/lang/Object;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    int-to-long v4, v4

    .line 78
    sub-long/2addr v2, v4

    .line 79
    iput-wide v2, v1, Lv0/g;->c:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    move-object p1, v0

    .line 84
    move-object v7, p0

    .line 85
    goto :goto_6

    .line 86
    :cond_6
    :goto_2
    monitor-exit v1

    .line 87
    move-object v3, p2

    .line 88
    check-cast v3, Lb0/g0;

    .line 89
    .line 90
    if-nez v3, :cond_7

    .line 91
    .line 92
    move-object v7, p0

    .line 93
    move-object v6, p1

    .line 94
    move-object v3, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_7
    instance-of p2, v3, Lb0/a0;

    .line 97
    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    check-cast v3, Lb0/a0;

    .line 101
    .line 102
    move-object v7, p0

    .line 103
    move-object v6, p1

    .line 104
    goto :goto_3

    .line 105
    :cond_8
    new-instance v2, Lb0/a0;

    .line 106
    .line 107
    const/4 v4, 0x1

    .line 108
    const/4 v5, 0x1

    .line 109
    move-object v7, p0

    .line 110
    move-object v6, p1

    .line 111
    invoke-direct/range {v2 .. v7}, Lb0/a0;-><init>(Lb0/g0;ZZLy/c;Lb0/z;)V

    .line 112
    .line 113
    .line 114
    move-object v3, v2

    .line 115
    :goto_3
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {v3}, Lb0/a0;->b()V

    .line 118
    .line 119
    .line 120
    iget-object p1, v7, Lcom/bumptech/glide/load/engine/c;->h:Lb0/d;

    .line 121
    .line 122
    invoke-virtual {p1, v6, v3}, Lb0/d;->a(Ly/c;Lb0/a0;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    if-eqz v3, :cond_b

    .line 126
    .line 127
    sget-boolean p1, Lcom/bumptech/glide/load/engine/c;->i:Z

    .line 128
    .line 129
    if-eqz p1, :cond_a

    .line 130
    .line 131
    const-string p1, "Loaded resource from cache"

    .line 132
    .line 133
    invoke-static {p1, p3, p4, v6}, Lcom/bumptech/glide/load/engine/c;->c(Ljava/lang/String;JLb0/y;)V

    .line 134
    .line 135
    .line 136
    :cond_a
    return-object v3

    .line 137
    :cond_b
    :goto_4
    return-object v0

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object v7, p0

    .line 140
    :goto_5
    move-object p1, v0

    .line 141
    :goto_6
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 142
    throw p1

    .line 143
    :catchall_3
    move-exception v0

    .line 144
    goto :goto_5

    .line 145
    :catchall_4
    move-exception v0

    .line 146
    move-object v7, p0

    .line 147
    :goto_7
    move-object p1, v0

    .line 148
    :goto_8
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 149
    throw p1

    .line 150
    :catchall_5
    move-exception v0

    .line 151
    goto :goto_7
.end method

.method public final declared-synchronized d(Lb0/w;Ly/c;Lb0/a0;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p3, Lb0/a0;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/c;->h:Lb0/d;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p3}, Lb0/d;->a(Ly/c;Lb0/a0;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p3, p0, Lcom/bumptech/glide/load/engine/c;->a:Lb0/d0;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p3, p3, Lb0/d0;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public final e(Ly/c;Lb0/a0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/c;->h:Lb0/d;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lb0/d;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lb0/c;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v1, Lb0/c;->c:Lb0/g0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    iget-boolean v0, p2, Lb0/a0;->a:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/c;->c:Ld0/f;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lv0/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lb0/g0;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/c;->e:Lb0/k0;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, p2, v0}, Lb0/k0;->i(Lb0/g0;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public final g(Lcom/bumptech/glide/c;Ljava/lang/Object;Ly/c;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lb0/o;Ljava/util/Map;ZZLy/f;ZZLcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;Lb0/y;J)Lb0/g;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p13

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    move-wide/from16 v12, p19

    .line 1
    iget-object v14, v1, Lcom/bumptech/glide/load/engine/c;->a:Lb0/d0;

    .line 2
    iget-object v14, v14, Lb0/d0;->a:Ljava/util/HashMap;

    .line 3
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lb0/w;

    if-eqz v14, :cond_1

    .line 4
    invoke-virtual {v14, v9, v10}, Lb0/w;->a(Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)V

    .line 5
    sget-boolean v0, Lcom/bumptech/glide/load/engine/c;->i:Z

    if-eqz v0, :cond_0

    .line 6
    const-string v0, "Added to existing load"

    invoke-static {v0, v12, v13, v11}, Lcom/bumptech/glide/load/engine/c;->c(Ljava/lang/String;JLb0/y;)V

    .line 7
    :cond_0
    new-instance v0, Lb0/g;

    invoke-direct {v0, v1, v9, v14}, Lb0/g;-><init>(Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/request/a;Lb0/w;)V

    return-object v0

    .line 8
    :cond_1
    iget-object v14, v1, Lcom/bumptech/glide/load/engine/c;->d:Lb0/s;

    .line 9
    iget-object v14, v14, Lb0/s;->g:Lw0/d;

    .line 10
    invoke-virtual {v14}, Lw0/d;->acquire()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lb0/w;

    .line 11
    monitor-enter v14

    .line 12
    :try_start_0
    iput-object v11, v14, Lb0/w;->k:Lb0/y;

    move/from16 v15, p14

    .line 13
    iput-boolean v15, v14, Lb0/w;->l:Z

    move/from16 v15, p15

    .line 14
    iput-boolean v15, v14, Lb0/w;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    monitor-exit v14

    .line 16
    iget-object v15, v1, Lcom/bumptech/glide/load/engine/c;->g:Lb0/q;

    .line 17
    iget-object v12, v15, Lb0/q;->b:Lw0/d;

    .line 18
    invoke-virtual {v12}, Lw0/d;->acquire()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/bumptech/glide/load/engine/b;

    .line 19
    iget v13, v15, Lb0/q;->c:I

    add-int/lit8 v9, v13, 0x1

    iput v9, v15, Lb0/q;->c:I

    .line 20
    iget-object v9, v12, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    iget-object v15, v12, Lcom/bumptech/glide/load/engine/b;->d:Lb0/t;

    .line 21
    iput-object v0, v9, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 22
    iput-object v2, v9, Lb0/j;->d:Ljava/lang/Object;

    .line 23
    iput-object v3, v9, Lb0/j;->n:Ly/c;

    .line 24
    iput v4, v9, Lb0/j;->e:I

    .line 25
    iput v5, v9, Lb0/j;->f:I

    .line 26
    iput-object v7, v9, Lb0/j;->p:Lb0/o;

    move-object/from16 v10, p6

    .line 27
    iput-object v10, v9, Lb0/j;->g:Ljava/lang/Class;

    .line 28
    iput-object v15, v9, Lb0/j;->h:Lb0/t;

    move-object/from16 v10, p7

    .line 29
    iput-object v10, v9, Lb0/j;->k:Ljava/lang/Class;

    .line 30
    iput-object v6, v9, Lb0/j;->o:Lcom/bumptech/glide/Priority;

    .line 31
    iput-object v8, v9, Lb0/j;->i:Ly/f;

    move-object/from16 v10, p10

    .line 32
    iput-object v10, v9, Lb0/j;->j:Ljava/util/Map;

    move/from16 v10, p11

    .line 33
    iput-boolean v10, v9, Lb0/j;->q:Z

    move/from16 v10, p12

    .line 34
    iput-boolean v10, v9, Lb0/j;->r:Z

    .line 35
    iput-object v0, v12, Lcom/bumptech/glide/load/engine/b;->h:Lcom/bumptech/glide/c;

    .line 36
    iput-object v3, v12, Lcom/bumptech/glide/load/engine/b;->i:Ly/c;

    .line 37
    iput-object v6, v12, Lcom/bumptech/glide/load/engine/b;->j:Lcom/bumptech/glide/Priority;

    .line 38
    iput-object v11, v12, Lcom/bumptech/glide/load/engine/b;->k:Lb0/y;

    .line 39
    iput v4, v12, Lcom/bumptech/glide/load/engine/b;->l:I

    .line 40
    iput v5, v12, Lcom/bumptech/glide/load/engine/b;->m:I

    .line 41
    iput-object v7, v12, Lcom/bumptech/glide/load/engine/b;->n:Lb0/o;

    .line 42
    iput-object v8, v12, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 43
    iput-object v14, v12, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 44
    iput v13, v12, Lcom/bumptech/glide/load/engine/b;->q:I

    .line 45
    sget-object v0, Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;->INITIALIZE:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    iput-object v0, v12, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 46
    iput-object v2, v12, Lcom/bumptech/glide/load/engine/b;->u:Ljava/lang/Object;

    .line 47
    iget-object v0, v1, Lcom/bumptech/glide/load/engine/c;->a:Lb0/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    iget-object v0, v0, Lb0/d0;->a:Ljava/util/HashMap;

    .line 49
    invoke-virtual {v0, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    .line 50
    invoke-virtual {v14, v9, v10}, Lb0/w;->a(Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)V

    .line 51
    monitor-enter v14

    .line 52
    :try_start_1
    iput-object v12, v14, Lb0/w;->t:Lcom/bumptech/glide/load/engine/b;

    .line 53
    sget-object v0, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->INITIALIZE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 54
    invoke-virtual {v12, v0}, Lcom/bumptech/glide/load/engine/b;->h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    move-result-object v0

    .line 55
    sget-object v2, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    if-eq v0, v2, :cond_4

    sget-object v2, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->DATA_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    if-ne v0, v2, :cond_2

    goto :goto_0

    .line 56
    :cond_2
    iget-boolean v0, v14, Lb0/w;->m:Z

    if-eqz v0, :cond_3

    iget-object v0, v14, Lb0/w;->i:Le0/b;

    goto :goto_1

    :cond_3
    iget-object v0, v14, Lb0/w;->h:Le0/b;

    goto :goto_1

    .line 57
    :cond_4
    :goto_0
    iget-object v0, v14, Lb0/w;->g:Le0/b;

    .line 58
    :goto_1
    invoke-virtual {v0, v12}, Le0/b;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    monitor-exit v14

    .line 60
    sget-boolean v0, Lcom/bumptech/glide/load/engine/c;->i:Z

    if-eqz v0, :cond_5

    .line 61
    const-string v0, "Started new load"

    move-wide/from16 v12, p19

    invoke-static {v0, v12, v13, v11}, Lcom/bumptech/glide/load/engine/c;->c(Ljava/lang/String;JLb0/y;)V

    .line 62
    :cond_5
    new-instance v0, Lb0/g;

    invoke-direct {v0, v1, v9, v14}, Lb0/g;-><init>(Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/request/a;Lb0/w;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 63
    :try_start_2
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    .line 64
    :try_start_3
    monitor-exit v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method
