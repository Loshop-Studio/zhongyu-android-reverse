.class public final Lcom/bumptech/glide/request/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/b;
.implements Ls0/h;


# static fields
.field public static final B:Z


# instance fields
.field public A:Z

.field public final a:Ljava/lang/String;

.field public final b:Lw0/h;

.field public final c:Ljava/lang/Object;

.field public final d:Lr0/c;

.field public final e:Landroid/content/Context;

.field public final f:Lcom/bumptech/glide/c;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Class;

.field public final i:Lr0/a;

.field public final j:I

.field public final k:I

.field public final l:Lcom/bumptech/glide/Priority;

.field public final m:Ls0/i;

.field public final n:Ljava/util/List;

.field public final o:Lt0/a;

.field public final p:Ljava/util/concurrent/Executor;

.field public q:Lb0/g0;

.field public r:Lb0/g;

.field public s:J

.field public volatile t:Lcom/bumptech/glide/load/engine/c;

.field public u:Lcom/bumptech/glide/request/SingleRequest$Status;

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:Landroid/graphics/drawable/Drawable;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Request"

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
    sput-boolean v0, Lcom/bumptech/glide/request/a;->B:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/c;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lr0/a;IILcom/bumptech/glide/Priority;Ls0/i;Lr0/c;Ljava/util/ArrayList;Lcom/bumptech/glide/load/engine/c;Lt0/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lcom/bumptech/glide/request/a;->B:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->a:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Lw0/h;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/bumptech/glide/request/a;->e:Landroid/content/Context;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/bumptech/glide/request/a;->f:Lcom/bumptech/glide/c;

    .line 32
    .line 33
    iput-object p4, p0, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p5, p0, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 36
    .line 37
    iput-object p6, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 38
    .line 39
    iput p7, p0, Lcom/bumptech/glide/request/a;->j:I

    .line 40
    .line 41
    iput p8, p0, Lcom/bumptech/glide/request/a;->k:I

    .line 42
    .line 43
    iput-object p9, p0, Lcom/bumptech/glide/request/a;->l:Lcom/bumptech/glide/Priority;

    .line 44
    .line 45
    iput-object p10, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 46
    .line 47
    iput-object p11, p0, Lcom/bumptech/glide/request/a;->d:Lr0/c;

    .line 48
    .line 49
    iput-object p12, p0, Lcom/bumptech/glide/request/a;->n:Ljava/util/List;

    .line 50
    .line 51
    iput-object p13, p0, Lcom/bumptech/glide/request/a;->t:Lcom/bumptech/glide/load/engine/c;

    .line 52
    .line 53
    iput-object p14, p0, Lcom/bumptech/glide/request/a;->o:Lt0/a;

    .line 54
    .line 55
    move-object/from16 p1, p15

    .line 56
    .line 57
    iput-object p1, p0, Lcom/bumptech/glide/request/a;->p:Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    sget-object p1, Lcom/bumptech/glide/request/SingleRequest$Status;->PENDING:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    const-string v0, "finished run method in "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v2, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 7
    .line 8
    if-nez v2, :cond_a

    .line 9
    .line 10
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 11
    .line 12
    invoke-virtual {v2}, Lw0/h;->a()V

    .line 13
    .line 14
    .line 15
    sget v2, Lv0/f;->b:I

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    iput-wide v2, p0, Lcom/bumptech/glide/request/a;->s:J

    .line 22
    .line 23
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 24
    .line 25
    if-nez v2, :cond_3

    .line 26
    .line 27
    iget v0, p0, Lcom/bumptech/glide/request/a;->j:I

    .line 28
    .line 29
    iget v2, p0, Lcom/bumptech/glide/request/a;->k:I

    .line 30
    .line 31
    invoke-static {v0, v2}, Lv0/k;->g(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget v0, p0, Lcom/bumptech/glide/request/a;->j:I

    .line 38
    .line 39
    iput v0, p0, Lcom/bumptech/glide/request/a;->y:I

    .line 40
    .line 41
    iget v0, p0, Lcom/bumptech/glide/request/a;->k:I

    .line 42
    .line 43
    iput v0, p0, Lcom/bumptech/glide/request/a;->z:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    const/4 v0, 0x5

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/4 v0, 0x3

    .line 68
    :goto_1
    new-instance v2, Lcom/bumptech/glide/load/engine/GlideException;

    .line 69
    .line 70
    const-string v3, "Received null model"

    .line 71
    .line 72
    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2, v0}, Lcom/bumptech/glide/request/a;->j(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 76
    .line 77
    .line 78
    monitor-exit v1

    .line 79
    return-void

    .line 80
    :cond_3
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 81
    .line 82
    sget-object v3, Lcom/bumptech/glide/request/SingleRequest$Status;->RUNNING:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 83
    .line 84
    if-eq v2, v3, :cond_9

    .line 85
    .line 86
    sget-object v4, Lcom/bumptech/glide/request/SingleRequest$Status;->COMPLETE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 87
    .line 88
    if-ne v2, v4, :cond_4

    .line 89
    .line 90
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->q:Lb0/g0;

    .line 91
    .line 92
    sget-object v2, Lcom/bumptech/glide/load/DataSource;->MEMORY_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 93
    .line 94
    invoke-virtual {p0, v0, v2}, Lcom/bumptech/glide/request/a;->k(Lb0/g0;Lcom/bumptech/glide/load/DataSource;)V

    .line 95
    .line 96
    .line 97
    monitor-exit v1

    .line 98
    return-void

    .line 99
    :cond_4
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->WAITING_FOR_SIZE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 100
    .line 101
    iput-object v2, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 102
    .line 103
    iget v4, p0, Lcom/bumptech/glide/request/a;->j:I

    .line 104
    .line 105
    iget v5, p0, Lcom/bumptech/glide/request/a;->k:I

    .line 106
    .line 107
    invoke-static {v4, v5}, Lv0/k;->g(II)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    iget v4, p0, Lcom/bumptech/glide/request/a;->j:I

    .line 114
    .line 115
    iget v5, p0, Lcom/bumptech/glide/request/a;->k:I

    .line 116
    .line 117
    invoke-virtual {p0, v4, v5}, Lcom/bumptech/glide/request/a;->m(II)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    iget-object v4, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 122
    .line 123
    invoke-interface {v4, p0}, Ls0/i;->d(Lcom/bumptech/glide/request/a;)V

    .line 124
    .line 125
    .line 126
    :goto_2
    iget-object v4, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 127
    .line 128
    if-eq v4, v3, :cond_6

    .line 129
    .line 130
    if-ne v4, v2, :cond_7

    .line 131
    .line 132
    :cond_6
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->d()Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-interface {v2, v3}, Ls0/i;->e(Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    sget-boolean v2, Lcom/bumptech/glide/request/a;->B:Z

    .line 142
    .line 143
    if-eqz v2, :cond_8

    .line 144
    .line 145
    new-instance v2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-wide v3, p0, Lcom/bumptech/glide/request/a;->s:J

    .line 151
    .line 152
    invoke-static {v3, v4}, Lv0/f;->a(J)D

    .line 153
    .line 154
    .line 155
    move-result-wide v3

    .line 156
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/request/a;->i(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_8
    monitor-exit v1

    .line 167
    return-void

    .line 168
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    const-string v2, "Cannot restart a running request"

    .line 171
    .line 172
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v0

    .line 176
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 179
    .line 180
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :goto_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    throw v0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 11
    .line 12
    invoke-interface {v0, p0}, Ls0/i;->b(Lcom/bumptech/glide/request/a;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lb0/g;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lcom/bumptech/glide/load/engine/c;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    iget-object v2, v0, Lb0/g;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lb0/w;

    .line 27
    .line 28
    iget-object v0, v0, Lb0/g;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/bumptech/glide/request/a;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lb0/w;->h(Lcom/bumptech/glide/request/a;)V

    .line 33
    .line 34
    .line 35
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0

    .line 43
    :cond_0
    return-void

    .line 44
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 9
    .line 10
    invoke-virtual {v1}, Lw0/h;->a()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 14
    .line 15
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->CLEARED:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->b()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->q:Lb0/g0;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iput-object v3, p0, Lcom/bumptech/glide/request/a;->q:Lb0/g0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v1, v3

    .line 35
    :goto_0
    iget-object v3, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->d()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v3, v4}, Ls0/i;->f(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->t:Lcom/bumptech/glide/load/engine/c;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lcom/bumptech/glide/load/engine/c;->f(Lb0/g0;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void

    .line 58
    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw v1
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->w:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lcom/bumptech/glide/request/a;->w:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    iget v0, v0, Lr0/a;->e:I

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/request/a;->h(I)Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->w:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->w:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    return-object v0
.end method

.method public final e()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 5
    .line 6
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->CLEARED:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    monitor-exit v0

    .line 14
    return v1

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public final f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 5
    .line 6
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->COMPLETE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    monitor-exit v0

    .line 14
    return v1

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public final g()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 5
    .line 6
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->RUNNING:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 7
    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    sget-object v2, Lcom/bumptech/glide/request/SingleRequest$Status;->WAITING_FOR_SIZE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 20
    :goto_1
    monitor-exit v0

    .line 21
    return v1

    .line 22
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method

.method public final h(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->e:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->f:Lcom/bumptech/glide/c;

    .line 13
    .line 14
    invoke-static {v1, v1, p1, v0}, Lt6/a;->d(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, " this: "

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/support/v4/media/f;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "Request"

    .line 17
    .line 18
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j(Lcom/bumptech/glide/load/engine/GlideException;I)V
    .locals 6

    .line 1
    const-string v0, "Load failed for "

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 4
    .line 5
    invoke-virtual {v1}, Lw0/h;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p1, v2}, Lcom/bumptech/glide/load/engine/GlideException;->setOrigin(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->f:Lcom/bumptech/glide/c;

    .line 16
    .line 17
    iget v2, v2, Lcom/bumptech/glide/c;->h:I

    .line 18
    .line 19
    if-gt v2, p2, :cond_0

    .line 20
    .line 21
    const-string p2, "Glide"

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " with size ["

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v0, p0, Lcom/bumptech/glide/request/a;->y:I

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v0, "x"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v0, p0, Lcom/bumptech/glide/request/a;->z:I

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, "]"

    .line 55
    .line 56
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    const/4 p2, 0x4

    .line 67
    if-gt v2, p2, :cond_0

    .line 68
    .line 69
    const-string p2, "Glide"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;->logRootCauses(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_0
    :goto_0
    const/4 p2, 0x0

    .line 79
    iput-object p2, p0, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 80
    .line 81
    sget-object v0, Lcom/bumptech/glide/request/SingleRequest$Status;->FAILED:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Lcom/bumptech/glide/request/a;->A:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    :try_start_1
    iget-object v3, p0, Lcom/bumptech/glide/request/a;->n:Ljava/util/List;

    .line 90
    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    move v4, v2

    .line 98
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Lr0/c;

    .line 109
    .line 110
    invoke-virtual {v5, p1}, Lr0/c;->j(Lcom/bumptech/glide/load/engine/GlideException;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    or-int/2addr v4, v5

    .line 115
    goto :goto_1

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    goto :goto_4

    .line 118
    :cond_1
    move v4, v2

    .line 119
    :cond_2
    iget-object v3, p0, Lcom/bumptech/glide/request/a;->d:Lr0/c;

    .line 120
    .line 121
    if-eqz v3, :cond_3

    .line 122
    .line 123
    invoke-virtual {v3, p1}, Lr0/c;->j(Lcom/bumptech/glide/load/engine/GlideException;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_3

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    move v0, v2

    .line 131
    :goto_2
    or-int p1, v4, v0

    .line 132
    .line 133
    if-nez p1, :cond_9

    .line 134
    .line 135
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 136
    .line 137
    if-nez p1, :cond_5

    .line 138
    .line 139
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    if-nez p1, :cond_4

    .line 142
    .line 143
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iput-object p2, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 149
    .line 150
    :cond_4
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->x:Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    move-object p1, p2

    .line 154
    :goto_3
    if-nez p1, :cond_7

    .line 155
    .line 156
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->v:Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    if-nez p1, :cond_6

    .line 159
    .line 160
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iput-object p2, p0, Lcom/bumptech/glide/request/a;->v:Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    iget p1, p1, Lr0/a;->d:I

    .line 168
    .line 169
    if-lez p1, :cond_6

    .line 170
    .line 171
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/request/a;->h(I)Landroid/graphics/drawable/Drawable;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, p0, Lcom/bumptech/glide/request/a;->v:Landroid/graphics/drawable/Drawable;

    .line 176
    .line 177
    :cond_6
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->v:Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    :cond_7
    if-nez p1, :cond_8

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/bumptech/glide/request/a;->d()Landroid/graphics/drawable/Drawable;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    :cond_8
    iget-object p2, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 186
    .line 187
    invoke-interface {p2, p1}, Ls0/i;->h(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 188
    .line 189
    .line 190
    :cond_9
    :try_start_2
    iput-boolean v2, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 191
    .line 192
    monitor-exit v1

    .line 193
    return-void

    .line 194
    :goto_4
    iput-boolean v2, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 195
    .line 196
    throw p1

    .line 197
    :goto_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 198
    throw p1
.end method

.method public final k(Lb0/g0;Lcom/bumptech/glide/load/DataSource;)V
    .locals 7

    .line 1
    const-string v0, "Expected to receive an object of "

    .line 2
    .line 3
    const-string v1, "Expected to receive a Resource<R> with an object of "

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 6
    .line 7
    invoke-virtual {v2}, Lw0/h;->a()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    iget-object v3, p0, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 14
    :try_start_1
    iput-object v2, p0, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, " inside, but instead got null."

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, v4}, Lcom/bumptech/glide/request/a;->j(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 44
    .line 45
    .line 46
    monitor-exit v3

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_0
    invoke-interface {p1}, Lb0/g0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v5, p0, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {p0, p1, v1, p2}, Lcom/bumptech/glide/request/a;->l(Lb0/g0;Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)V

    .line 71
    .line 72
    .line 73
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    return-void

    .line 75
    :cond_2
    :goto_0
    :try_start_2
    iput-object v2, p0, Lcom/bumptech/glide/request/a;->q:Lb0/g0;

    .line 76
    .line 77
    new-instance p2, Lcom/bumptech/glide/load/engine/GlideException;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, " but instead got "

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    move-exception p2

    .line 102
    move-object v2, p1

    .line 103
    move-object p1, p2

    .line 104
    goto :goto_3

    .line 105
    :cond_3
    const-string v0, ""

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string/jumbo v0, "{"

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string/jumbo v0, "} inside Resource{"

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string/jumbo v0, "}."

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    const-string v0, ""

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    const-string v0, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    .line 140
    .line 141
    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {p2, v0}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p2, v4}, Lcom/bumptech/glide/request/a;->j(Lcom/bumptech/glide/load/engine/GlideException;I)V

    .line 152
    .line 153
    .line 154
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    iget-object p2, p0, Lcom/bumptech/glide/request/a;->t:Lcom/bumptech/glide/load/engine/c;

    .line 156
    .line 157
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {p1}, Lcom/bumptech/glide/load/engine/c;->f(Lb0/g0;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :goto_3
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 166
    :catchall_2
    move-exception p1

    .line 167
    if-eqz v2, :cond_5

    .line 168
    .line 169
    iget-object p2, p0, Lcom/bumptech/glide/request/a;->t:Lcom/bumptech/glide/load/engine/c;

    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v2}, Lcom/bumptech/glide/load/engine/c;->f(Lb0/g0;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    throw p1
.end method

.method public final l(Lb0/g0;Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/request/SingleRequest$Status;->COMPLETE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/bumptech/glide/request/a;->q:Lb0/g0;

    .line 6
    .line 7
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->f:Lcom/bumptech/glide/c;

    .line 8
    .line 9
    iget p1, p1, Lcom/bumptech/glide/c;->h:I

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-gt p1, v0, :cond_0

    .line 13
    .line 14
    new-instance p1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "Finished loading "

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, " from "

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p3, " for "

    .line 41
    .line 42
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p3, " with size ["

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget p3, p0, Lcom/bumptech/glide/request/a;->y:I

    .line 56
    .line 57
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string/jumbo p3, "x"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget p3, p0, Lcom/bumptech/glide/request/a;->z:I

    .line 67
    .line 68
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p3, "] in "

    .line 72
    .line 73
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-wide v0, p0, Lcom/bumptech/glide/request/a;->s:J

    .line 77
    .line 78
    invoke-static {v0, v1}, Lv0/f;->a(J)D

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p3, " ms"

    .line 86
    .line 87
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string p3, "Glide"

    .line 95
    .line 96
    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    :cond_0
    const/4 p1, 0x1

    .line 100
    iput-boolean p1, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 101
    .line 102
    const/4 p3, 0x0

    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->n:Ljava/util/List;

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move v1, p3

    .line 112
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lr0/c;

    .line 123
    .line 124
    invoke-virtual {v2, p2}, Lr0/c;->k(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    or-int/2addr v1, v2

    .line 129
    goto :goto_0

    .line 130
    :catchall_0
    move-exception p1

    .line 131
    goto :goto_2

    .line 132
    :cond_1
    move v1, p3

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/request/a;->d:Lr0/c;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    invoke-virtual {v0, p2}, Lr0/c;->k(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    move p1, p3

    .line 145
    :goto_1
    or-int/2addr p1, v1

    .line 146
    if-nez p1, :cond_4

    .line 147
    .line 148
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->o:Lt0/a;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcom/bumptech/glide/request/a;->m:Ls0/i;

    .line 154
    .line 155
    invoke-interface {p1, p2}, Ls0/i;->c(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    :cond_4
    iput-boolean p3, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 159
    .line 160
    return-void

    .line 161
    :goto_2
    iput-boolean p3, p0, Lcom/bumptech/glide/request/a;->A:Z

    .line 162
    .line 163
    throw p1
.end method

.method public final m(II)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "finished onSizeReady in "

    .line 8
    .line 9
    const-string v4, "finished setup for calling load in "

    .line 10
    .line 11
    const-string v5, "Got onSizeReady in "

    .line 12
    .line 13
    iget-object v6, v1, Lcom/bumptech/glide/request/a;->b:Lw0/h;

    .line 14
    .line 15
    invoke-virtual {v6}, Lw0/h;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v6, v1, Lcom/bumptech/glide/request/a;->c:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v6

    .line 21
    :try_start_0
    sget-boolean v20, Lcom/bumptech/glide/request/a;->B:Z

    .line 22
    .line 23
    if-eqz v20, :cond_0

    .line 24
    .line 25
    new-instance v7, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-wide v8, v1, Lcom/bumptech/glide/request/a;->s:J

    .line 31
    .line 32
    invoke-static {v8, v9}, Lv0/f;->a(J)D

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v1, v5}, Lcom/bumptech/glide/request/a;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object v3, v1

    .line 49
    move-object v1, v6

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_0
    :goto_0
    iget-object v5, v1, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 53
    .line 54
    sget-object v7, Lcom/bumptech/glide/request/SingleRequest$Status;->WAITING_FOR_SIZE:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 55
    .line 56
    if-eq v5, v7, :cond_1

    .line 57
    .line 58
    monitor-exit v6

    .line 59
    return-void

    .line 60
    :cond_1
    sget-object v5, Lcom/bumptech/glide/request/SingleRequest$Status;->RUNNING:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 61
    .line 62
    iput-object v5, v1, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 63
    .line 64
    iget-object v7, v1, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/high16 v7, -0x80000000

    .line 70
    .line 71
    const/high16 v8, 0x3f800000    # 1.0f

    .line 72
    .line 73
    if-ne v0, v7, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    int-to-float v0, v0

    .line 77
    mul-float/2addr v0, v8

    .line 78
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :goto_1
    iput v0, v1, Lcom/bumptech/glide/request/a;->y:I

    .line 83
    .line 84
    if-ne v2, v7, :cond_3

    .line 85
    .line 86
    move v0, v2

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    int-to-float v0, v2

    .line 89
    mul-float/2addr v8, v0

    .line 90
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    :goto_2
    iput v0, v1, Lcom/bumptech/glide/request/a;->z:I

    .line 95
    .line 96
    if-eqz v20, :cond_4

    .line 97
    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-wide v7, v1, Lcom/bumptech/glide/request/a;->s:J

    .line 104
    .line 105
    invoke-static {v7, v8}, Lv0/f;->a(J)D

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, v0}, Lcom/bumptech/glide/request/a;->i(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    iget-object v2, v1, Lcom/bumptech/glide/request/a;->t:Lcom/bumptech/glide/load/engine/c;

    .line 120
    .line 121
    move-object v0, v3

    .line 122
    iget-object v3, v1, Lcom/bumptech/glide/request/a;->f:Lcom/bumptech/glide/c;

    .line 123
    .line 124
    iget-object v4, v1, Lcom/bumptech/glide/request/a;->g:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object v7, v1, Lcom/bumptech/glide/request/a;->i:Lr0/a;

    .line 127
    .line 128
    move-object v8, v5

    .line 129
    iget-object v5, v7, Lr0/a;->i:Ly/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    move-object v9, v6

    .line 132
    :try_start_1
    iget v6, v1, Lcom/bumptech/glide/request/a;->y:I

    .line 133
    .line 134
    iget v10, v1, Lcom/bumptech/glide/request/a;->z:I

    .line 135
    .line 136
    move-object v11, v8

    .line 137
    iget-object v8, v7, Lr0/a;->m:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 138
    .line 139
    move-object v12, v9

    .line 140
    :try_start_2
    iget-object v9, v1, Lcom/bumptech/glide/request/a;->h:Ljava/lang/Class;

    .line 141
    .line 142
    move v13, v10

    .line 143
    iget-object v10, v1, Lcom/bumptech/glide/request/a;->l:Lcom/bumptech/glide/Priority;

    .line 144
    .line 145
    move-object v14, v11

    .line 146
    iget-object v11, v7, Lr0/a;->b:Lb0/o;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 147
    .line 148
    move-object v15, v12

    .line 149
    :try_start_3
    iget-object v12, v7, Lr0/a;->l:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 150
    .line 151
    move/from16 v16, v13

    .line 152
    .line 153
    iget-boolean v13, v7, Lr0/a;->j:Z

    .line 154
    .line 155
    move-object/from16 v17, v14

    .line 156
    .line 157
    iget-boolean v14, v7, Lr0/a;->p:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 158
    .line 159
    move-object/from16 v18, v15

    .line 160
    .line 161
    :try_start_4
    iget-object v15, v7, Lr0/a;->k:Ly/f;

    .line 162
    .line 163
    move-object/from16 p1, v0

    .line 164
    .line 165
    iget-boolean v0, v7, Lr0/a;->f:Z

    .line 166
    .line 167
    iget-boolean v7, v7, Lr0/a;->q:Z

    .line 168
    .line 169
    move/from16 v19, v0

    .line 170
    .line 171
    iget-object v0, v1, Lcom/bumptech/glide/request/a;->p:Ljava/util/concurrent/Executor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 172
    .line 173
    move/from16 v21, v19

    .line 174
    .line 175
    move-object/from16 v19, v0

    .line 176
    .line 177
    move-object/from16 v0, v17

    .line 178
    .line 179
    move/from16 v17, v7

    .line 180
    .line 181
    move/from16 v7, v16

    .line 182
    .line 183
    move/from16 v16, v21

    .line 184
    .line 185
    move-object/from16 v21, v18

    .line 186
    .line 187
    move-object/from16 v18, v1

    .line 188
    .line 189
    move-object/from16 v1, v21

    .line 190
    .line 191
    :try_start_5
    invoke-virtual/range {v2 .. v19}, Lcom/bumptech/glide/load/engine/c;->a(Lcom/bumptech/glide/c;Ljava/lang/Object;Ly/c;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lb0/o;Lcom/bumptech/glide/util/CachedHashCodeArrayMap;ZZLy/f;ZZLcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)Lb0/g;

    .line 192
    .line 193
    .line 194
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 195
    move-object/from16 v3, v18

    .line 196
    .line 197
    :try_start_6
    iput-object v2, v3, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 198
    .line 199
    iget-object v2, v3, Lcom/bumptech/glide/request/a;->u:Lcom/bumptech/glide/request/SingleRequest$Status;

    .line 200
    .line 201
    if-eq v2, v0, :cond_5

    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    iput-object v0, v3, Lcom/bumptech/glide/request/a;->r:Lb0/g;

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :catchall_1
    move-exception v0

    .line 208
    goto :goto_4

    .line 209
    :cond_5
    :goto_3
    if-eqz v20, :cond_6

    .line 210
    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    move-object/from16 v2, p1

    .line 214
    .line 215
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-wide v4, v3, Lcom/bumptech/glide/request/a;->s:J

    .line 219
    .line 220
    invoke-static {v4, v5}, Lv0/f;->a(J)D

    .line 221
    .line 222
    .line 223
    move-result-wide v4

    .line 224
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v3, v0}, Lcom/bumptech/glide/request/a;->i(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_6
    monitor-exit v1

    .line 235
    return-void

    .line 236
    :catchall_2
    move-exception v0

    .line 237
    move-object/from16 v3, v18

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :catchall_3
    move-exception v0

    .line 241
    move-object v3, v1

    .line 242
    move-object/from16 v1, v18

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :catchall_4
    move-exception v0

    .line 246
    move-object v3, v1

    .line 247
    move-object v1, v15

    .line 248
    goto :goto_4

    .line 249
    :catchall_5
    move-exception v0

    .line 250
    move-object v3, v1

    .line 251
    move-object v1, v12

    .line 252
    goto :goto_4

    .line 253
    :catchall_6
    move-exception v0

    .line 254
    move-object v3, v1

    .line 255
    move-object v1, v9

    .line 256
    :goto_4
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 257
    throw v0
.end method
