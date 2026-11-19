.class public final Lcom/bumptech/glide/load/engine/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb0/h;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lw0/e;


# instance fields
.field public A:Lz/e;

.field public volatile B:Lb0/i;

.field public volatile C:Z

.field public volatile D:Z

.field public final a:Lb0/j;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lw0/h;

.field public final d:Lb0/t;

.field public final e:Landroidx/core/util/Pools$Pool;

.field public final f:Lb0/g;

.field public final g:Lb0/k;

.field public h:Lcom/bumptech/glide/c;

.field public i:Ly/c;

.field public j:Lcom/bumptech/glide/Priority;

.field public k:Lb0/y;

.field public l:I

.field public m:I

.field public n:Lb0/o;

.field public o:Ly/f;

.field public p:Lb0/w;

.field public q:I

.field public r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

.field public s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

.field public t:J

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Thread;

.field public w:Ly/c;

.field public x:Ly/c;

.field public y:Ljava/lang/Object;

.field public z:Lcom/bumptech/glide/load/DataSource;


# direct methods
.method public constructor <init>(Lb0/t;Lw0/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb0/j;

    .line 5
    .line 6
    invoke-direct {v0}, Lb0/j;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lw0/h;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->c:Lw0/h;

    .line 24
    .line 25
    new-instance v0, Lb0/g;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1}, Lb0/g;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->f:Lb0/g;

    .line 32
    .line 33
    new-instance v0, Lb0/k;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->g:Lb0/k;

    .line 39
    .line 40
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/b;->d:Lb0/t;

    .line 41
    .line 42
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/b;->e:Landroidx/core/util/Pools$Pool;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Ly/c;Ljava/lang/Exception;Lz/e;Lcom/bumptech/glide/load/DataSource;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Lz/e;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Lz/e;->b()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p1, p4, p2}, Lcom/bumptech/glide/load/engine/GlideException;->setLoggingDetails(Ly/c;Lcom/bumptech/glide/load/DataSource;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, Lcom/bumptech/glide/load/engine/b;->v:Ljava/lang/Thread;

    .line 28
    .line 29
    if-eq p1, p2, :cond_1

    .line 30
    .line 31
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;->SWITCH_TO_SOURCE_SERVICE:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 34
    .line 35
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 36
    .line 37
    iget-boolean p2, p1, Lb0/w;->m:Z

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    iget-object p1, p1, Lb0/w;->i:Le0/b;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p1, p1, Lb0/w;->h:Le0/b;

    .line 45
    .line 46
    :goto_0
    invoke-virtual {p1, p0}, Le0/b;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->m()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final b(Ly/c;Ljava/lang/Object;Lz/e;Lcom/bumptech/glide/load/DataSource;Ly/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/b;->y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bumptech/glide/load/engine/b;->A:Lz/e;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bumptech/glide/load/engine/b;->z:Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bumptech/glide/load/engine/b;->x:Ly/c;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/bumptech/glide/load/engine/b;->v:Ljava/lang/Thread;

    .line 16
    .line 17
    if-eq p1, p2, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;->DECODE_DATA:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 24
    .line 25
    iget-boolean p2, p1, Lb0/w;->m:Z

    .line 26
    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, Lb0/w;->i:Le0/b;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p1, Lb0/w;->h:Le0/b;

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, p0}, Le0/b;->execute(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->f()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final c()Lw0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->c:Lw0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lcom/bumptech/glide/load/engine/b;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->j:Lcom/bumptech/glide/Priority;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, Lcom/bumptech/glide/load/engine/b;->j:Lcom/bumptech/glide/Priority;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lcom/bumptech/glide/load/engine/b;->q:I

    .line 19
    .line 20
    iget p1, p1, Lcom/bumptech/glide/load/engine/b;->q:I

    .line 21
    .line 22
    sub-int/2addr v0, p1

    .line 23
    :cond_0
    return v0
.end method

.method public final d(Lz/e;Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)Lb0/g0;
    .locals 5

    .line 1
    const-string v0, "Decoded result "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Lz/e;->a()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    sget v2, Lv0/f;->b:I

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p0, p2, p3}, Lcom/bumptech/glide/load/engine/b;->e(Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)Lb0/g0;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "DecodeJob"

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p0, v2, v3, p3, v1}, Lcom/bumptech/glide/load/engine/b;->i(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {p1}, Lz/e;->a()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :goto_1
    invoke-interface {p1}, Lz/e;->a()V

    .line 52
    .line 53
    .line 54
    throw p2
.end method

.method public final e(Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)Lb0/g0;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lb0/j;->c(Ljava/lang/Class;)Lb0/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 12
    .line 13
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v3, 0x1a

    .line 16
    .line 17
    if-ge v1, v3, :cond_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    sget-object v1, Lcom/bumptech/glide/load/DataSource;->RESOURCE_DISK_CACHE:Lcom/bumptech/glide/load/DataSource;

    .line 22
    .line 23
    if-eq p2, v1, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 26
    .line 27
    iget-boolean v1, v1, Lb0/j;->r:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    goto :goto_2

    .line 34
    :cond_3
    :goto_1
    const/4 v1, 0x1

    .line 35
    :goto_2
    sget-object v3, Li0/m;->i:Ly/e;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-eqz v4, :cond_4

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    new-instance v0, Ly/f;

    .line 55
    .line 56
    invoke-direct {v0}, Ly/f;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 60
    .line 61
    iget-object v5, v0, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 62
    .line 63
    iget-object v4, v4, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 64
    .line 65
    invoke-virtual {v5, v4}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->putAll(Landroidx/collection/SimpleArrayMap;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v4, v0, Ly/f;->b:Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 73
    .line 74
    invoke-virtual {v4, v3, v1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :goto_3
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->h:Lcom/bumptech/glide/c;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/d;

    .line 81
    .line 82
    iget-object v1, v0, Lcom/bumptech/glide/d;->e:Lz/h;

    .line 83
    .line 84
    monitor-enter v1

    .line 85
    :try_start_0
    iget-object v0, v1, Lz/h;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Ljava/util/HashMap;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lz/f;

    .line 98
    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    iget-object v3, v1, Lz/h;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Ljava/util/HashMap;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_6

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Lz/f;

    .line 124
    .line 125
    invoke-interface {v4}, Lz/f;->b()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    move-object v0, v4

    .line 140
    goto :goto_4

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    move-object p1, v0

    .line 143
    goto :goto_5

    .line 144
    :cond_6
    :goto_4
    if-nez v0, :cond_7

    .line 145
    .line 146
    sget-object v0, Lz/h;->c:Lj0/a;

    .line 147
    .line 148
    :cond_7
    invoke-interface {v0, p1}, Lz/f;->a(Ljava/lang/Object;)Lz/g;

    .line 149
    .line 150
    .line 151
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit v1

    .line 153
    :try_start_1
    iget v3, p0, Lcom/bumptech/glide/load/engine/b;->l:I

    .line 154
    .line 155
    iget v4, p0, Lcom/bumptech/glide/load/engine/b;->m:I

    .line 156
    .line 157
    new-instance v5, Landroid/support/v4/media/h;

    .line 158
    .line 159
    const/4 p1, 0x1

    .line 160
    invoke-direct {v5, p1, p0, p2}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v2 .. v7}, Lb0/e0;->a(IILandroid/support/v4/media/h;Ly/f;Lz/g;)Lb0/g0;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    invoke-interface {v7}, Lz/g;->a()V

    .line 168
    .line 169
    .line 170
    return-object p1

    .line 171
    :catchall_1
    move-exception v0

    .line 172
    move-object p1, v0

    .line 173
    invoke-interface {v7}, Lz/g;->a()V

    .line 174
    .line 175
    .line 176
    throw p1

    .line 177
    :goto_5
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    throw p1
.end method

.method public final f()V
    .locals 12

    .line 1
    const-string v0, "DecodeJob"

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
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Retrieved data"

    .line 11
    .line 12
    iget-wide v1, p0, Lcom/bumptech/glide/load/engine/b;->t:J

    .line 13
    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "data: "

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/b;->y:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v4, ", cache key: "

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, ", fetcher: "

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/b;->A:Lz/e;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p0, v1, v2, v0, v3}, Lcom/bumptech/glide/load/engine/b;->i(JLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    const/4 v1, 0x0

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->A:Lz/e;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->y:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->z:Lcom/bumptech/glide/load/DataSource;

    .line 59
    .line 60
    invoke-virtual {p0, v0, v2, v3}, Lcom/bumptech/glide/load/engine/b;->d(Lz/e;Ljava/lang/Object;Lcom/bumptech/glide/load/DataSource;)Lb0/g0;

    .line 61
    .line 62
    .line 63
    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->x:Ly/c;

    .line 67
    .line 68
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->z:Lcom/bumptech/glide/load/DataSource;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v3}, Lcom/bumptech/glide/load/engine/GlideException;->setLoggingDetails(Ly/c;Lcom/bumptech/glide/load/DataSource;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :goto_0
    if-eqz v0, :cond_b

    .line 80
    .line 81
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->z:Lcom/bumptech/glide/load/DataSource;

    .line 82
    .line 83
    instance-of v3, v0, Lb0/c0;

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    move-object v3, v0

    .line 88
    check-cast v3, Lb0/c0;

    .line 89
    .line 90
    invoke-interface {v3}, Lb0/c0;->initialize()V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->f:Lb0/g;

    .line 94
    .line 95
    iget-object v3, v3, Lb0/g;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lb0/f0;

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    const/4 v5, 0x1

    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    sget-object v1, Lb0/f0;->e:Lw0/d;

    .line 104
    .line 105
    invoke-virtual {v1}, Lw0/d;->acquire()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Lb0/f0;

    .line 110
    .line 111
    iput-boolean v4, v1, Lb0/f0;->d:Z

    .line 112
    .line 113
    iput-boolean v5, v1, Lb0/f0;->c:Z

    .line 114
    .line 115
    iput-object v0, v1, Lb0/f0;->b:Lb0/g0;

    .line 116
    .line 117
    move-object v0, v1

    .line 118
    :cond_2
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->o()V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 122
    .line 123
    monitor-enter v3

    .line 124
    :try_start_1
    iput-object v0, v3, Lb0/w;->n:Lb0/g0;

    .line 125
    .line 126
    iput-object v2, v3, Lb0/w;->o:Lcom/bumptech/glide/load/DataSource;

    .line 127
    .line 128
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 129
    monitor-enter v3

    .line 130
    :try_start_2
    iget-object v0, v3, Lb0/w;->b:Lw0/h;

    .line 131
    .line 132
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 133
    .line 134
    .line 135
    iget-boolean v0, v3, Lb0/w;->u:Z

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-object v0, v3, Lb0/w;->n:Lb0/g0;

    .line 140
    .line 141
    invoke-interface {v0}, Lb0/g0;->recycle()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, Lb0/w;->g()V

    .line 145
    .line 146
    .line 147
    monitor-exit v3

    .line 148
    goto :goto_2

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto/16 :goto_5

    .line 151
    .line 152
    :cond_3
    iget-object v0, v3, Lb0/w;->a:Lb0/v;

    .line 153
    .line 154
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_a

    .line 161
    .line 162
    iget-boolean v0, v3, Lb0/w;->p:Z

    .line 163
    .line 164
    if-nez v0, :cond_9

    .line 165
    .line 166
    iget-object v0, v3, Lb0/w;->e:Lio/reactivex/internal/operators/observable/g;

    .line 167
    .line 168
    iget-object v7, v3, Lb0/w;->n:Lb0/g0;

    .line 169
    .line 170
    iget-boolean v8, v3, Lb0/w;->l:Z

    .line 171
    .line 172
    iget-object v10, v3, Lb0/w;->k:Lb0/y;

    .line 173
    .line 174
    iget-object v11, v3, Lb0/w;->c:Lb0/z;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v6, Lb0/a0;

    .line 180
    .line 181
    const/4 v9, 0x1

    .line 182
    invoke-direct/range {v6 .. v11}, Lb0/a0;-><init>(Lb0/g0;ZZLy/c;Lb0/z;)V

    .line 183
    .line 184
    .line 185
    iput-object v6, v3, Lb0/w;->s:Lb0/a0;

    .line 186
    .line 187
    iput-boolean v5, v3, Lb0/w;->p:Z

    .line 188
    .line 189
    iget-object v0, v3, Lb0/w;->a:Lb0/v;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v2, Ljava/util/ArrayList;

    .line 195
    .line 196
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    add-int/2addr v0, v5

    .line 206
    invoke-virtual {v3, v0}, Lb0/w;->e(I)V

    .line 207
    .line 208
    .line 209
    iget-object v0, v3, Lb0/w;->k:Lb0/y;

    .line 210
    .line 211
    iget-object v6, v3, Lb0/w;->s:Lb0/a0;

    .line 212
    .line 213
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    iget-object v7, v3, Lb0/w;->f:Lb0/x;

    .line 215
    .line 216
    check-cast v7, Lcom/bumptech/glide/load/engine/c;

    .line 217
    .line 218
    invoke-virtual {v7, v3, v0, v6}, Lcom/bumptech/glide/load/engine/c;->d(Lb0/w;Ly/c;Lb0/a0;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    move v6, v4

    .line 226
    :goto_1
    if-ge v6, v0, :cond_4

    .line 227
    .line 228
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    check-cast v7, Lb0/u;

    .line 235
    .line 236
    iget-object v8, v7, Lb0/u;->b:Ljava/util/concurrent/Executor;

    .line 237
    .line 238
    new-instance v9, Lcom/bumptech/glide/load/engine/d;

    .line 239
    .line 240
    iget-object v7, v7, Lb0/u;->a:Lcom/bumptech/glide/request/a;

    .line 241
    .line 242
    const/4 v10, 0x1

    .line 243
    invoke-direct {v9, v3, v7, v10}, Lcom/bumptech/glide/load/engine/d;-><init>(Lb0/w;Lcom/bumptech/glide/request/a;I)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v8, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 247
    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_4
    invoke-virtual {v3}, Lb0/w;->d()V

    .line 251
    .line 252
    .line 253
    :goto_2
    sget-object v0, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->ENCODE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 254
    .line 255
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 256
    .line 257
    :try_start_3
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->f:Lb0/g;

    .line 258
    .line 259
    iget-object v0, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v0, Lb0/f0;

    .line 262
    .line 263
    if-eqz v0, :cond_5

    .line 264
    .line 265
    move v4, v5

    .line 266
    :cond_5
    if-eqz v4, :cond_6

    .line 267
    .line 268
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->d:Lb0/t;

    .line 269
    .line 270
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 273
    .line 274
    .line 275
    :try_start_4
    invoke-virtual {v0}, Lb0/t;->a()Ld0/a;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v4, v2, Lb0/g;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v4, Ly/c;

    .line 282
    .line 283
    new-instance v6, Lb0/g;

    .line 284
    .line 285
    iget-object v7, v2, Lb0/g;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v7, Ly/h;

    .line 288
    .line 289
    iget-object v8, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v8, Lb0/f0;

    .line 292
    .line 293
    const/4 v9, 0x0

    .line 294
    invoke-direct {v6, v7, v8, v9, v3}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v0, v4, v6}, Ld0/a;->c(Ly/c;Lb0/g;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 298
    .line 299
    .line 300
    :try_start_5
    iget-object v0, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Lb0/f0;

    .line 303
    .line 304
    invoke-virtual {v0}, Lb0/f0;->b()V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    iget-object v2, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v2, Lb0/f0;

    .line 312
    .line 313
    invoke-virtual {v2}, Lb0/f0;->b()V

    .line 314
    .line 315
    .line 316
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 317
    :catchall_2
    move-exception v0

    .line 318
    goto :goto_4

    .line 319
    :cond_6
    :goto_3
    if-eqz v1, :cond_7

    .line 320
    .line 321
    invoke-virtual {v1}, Lb0/f0;->b()V

    .line 322
    .line 323
    .line 324
    :cond_7
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->g:Lb0/k;

    .line 325
    .line 326
    monitor-enter v2

    .line 327
    :try_start_6
    iput-boolean v5, v2, Lb0/k;->b:Z

    .line 328
    .line 329
    invoke-virtual {v2}, Lb0/k;->a()Z

    .line 330
    .line 331
    .line 332
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 333
    monitor-exit v2

    .line 334
    if-eqz v0, :cond_c

    .line 335
    .line 336
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->k()V

    .line 337
    .line 338
    .line 339
    goto :goto_6

    .line 340
    :catchall_3
    move-exception v0

    .line 341
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 342
    throw v0

    .line 343
    :goto_4
    if-eqz v1, :cond_8

    .line 344
    .line 345
    invoke-virtual {v1}, Lb0/f0;->b()V

    .line 346
    .line 347
    .line 348
    :cond_8
    throw v0

    .line 349
    :cond_9
    :try_start_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    const-string v1, "Already have resource"

    .line 352
    .line 353
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 358
    .line 359
    const-string v1, "Received a resource without any callbacks to notify"

    .line 360
    .line 361
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v0

    .line 365
    :goto_5
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 366
    throw v0

    .line 367
    :catchall_4
    move-exception v0

    .line 368
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 369
    throw v0

    .line 370
    :cond_b
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->m()V

    .line 371
    .line 372
    .line 373
    :cond_c
    :goto_6
    return-void
.end method

.method public final g()Lb0/i;
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/engine/a;->b:[I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 13
    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Unrecognized stage: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    new-instance v0, Lb0/l0;

    .line 50
    .line 51
    invoke-direct {v0, v2, p0}, Lb0/l0;-><init>(Lb0/j;Lcom/bumptech/glide/load/engine/b;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    new-instance v0, Lb0/e;

    .line 56
    .line 57
    invoke-virtual {v2}, Lb0/j;->a()Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v0, v1, v2, p0}, Lb0/e;-><init>(Ljava/util/List;Lb0/j;Lb0/h;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    new-instance v0, Lb0/h0;

    .line 66
    .line 67
    invoke-direct {v0, v2, p0}, Lb0/h0;-><init>(Lb0/j;Lcom/bumptech/glide/load/engine/b;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public final h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/engine/a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->n:Lb0/o;

    .line 25
    .line 26
    invoke-virtual {p1}, Lb0/o;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/b;->h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "Unrecognized stage: "

    .line 47
    .line 48
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->FINISHED:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->SOURCE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_4
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->n:Lb0/o;

    .line 69
    .line 70
    invoke-virtual {p1}, Lb0/o;->a()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->DATA_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_5
    sget-object p1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->DATA_CACHE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/b;->h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method public final i(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p3, v0}, Landroid/support/v4/media/f;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-static {p1, p2}, Lv0/f;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, ", load key: "

    .line 15
    .line 16
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/b;->k:Lb0/y;

    .line 20
    .line 21
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    if-eqz p4, :cond_0

    .line 25
    .line 26
    const-string p1, ", "

    .line 27
    .line 28
    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p1, ""

    .line 34
    .line 35
    :goto_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, ", thread: "

    .line 39
    .line 40
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "DecodeJob"

    .line 59
    .line 60
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final j()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->o()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    .line 5
    .line 6
    const-string v1, "Failed to load resource"

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iput-object v0, v1, Lb0/w;->q:Lcom/bumptech/glide/load/engine/GlideException;

    .line 22
    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    monitor-enter v1

    .line 25
    :try_start_1
    iget-object v0, v1, Lb0/w;->b:Lw0/h;

    .line 26
    .line 27
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, v1, Lb0/w;->u:Z

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Lb0/w;->g()V

    .line 36
    .line 37
    .line 38
    monitor-exit v1

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    iget-object v0, v1, Lb0/w;->a:Lb0/v;

    .line 43
    .line 44
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    iget-boolean v0, v1, Lb0/w;->r:Z

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    iput-boolean v2, v1, Lb0/w;->r:Z

    .line 57
    .line 58
    iget-object v0, v1, Lb0/w;->k:Lb0/y;

    .line 59
    .line 60
    iget-object v3, v1, Lb0/w;->a:Lb0/v;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v4, Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v3, v3, Lb0/v;->a:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-int/2addr v3, v2

    .line 77
    invoke-virtual {v1, v3}, Lb0/w;->e(I)V

    .line 78
    .line 79
    .line 80
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    iget-object v3, v1, Lb0/w;->f:Lb0/x;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    check-cast v3, Lcom/bumptech/glide/load/engine/c;

    .line 85
    .line 86
    invoke-virtual {v3, v1, v0, v5}, Lcom/bumptech/glide/load/engine/c;->d(Lb0/w;Ly/c;Lb0/a0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v3, 0x0

    .line 94
    :goto_0
    if-ge v3, v0, :cond_1

    .line 95
    .line 96
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    add-int/lit8 v3, v3, 0x1

    .line 101
    .line 102
    check-cast v5, Lb0/u;

    .line 103
    .line 104
    iget-object v6, v5, Lb0/u;->b:Ljava/util/concurrent/Executor;

    .line 105
    .line 106
    new-instance v7, Lcom/bumptech/glide/load/engine/d;

    .line 107
    .line 108
    iget-object v5, v5, Lb0/u;->a:Lcom/bumptech/glide/request/a;

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    invoke-direct {v7, v1, v5, v8}, Lcom/bumptech/glide/load/engine/d;-><init>(Lb0/w;Lcom/bumptech/glide/request/a;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {v1}, Lb0/w;->d()V

    .line 119
    .line 120
    .line 121
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->g:Lb0/k;

    .line 122
    .line 123
    monitor-enter v0

    .line 124
    :try_start_2
    iput-boolean v2, v0, Lb0/k;->c:Z

    .line 125
    .line 126
    invoke-virtual {v0}, Lb0/k;->a()Z

    .line 127
    .line 128
    .line 129
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    monitor-exit v0

    .line 131
    if-eqz v1, :cond_2

    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->k()V

    .line 134
    .line 135
    .line 136
    :cond_2
    return-void

    .line 137
    :catchall_1
    move-exception v1

    .line 138
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    throw v1

    .line 140
    :cond_3
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    const-string v2, "Already failed once"

    .line 143
    .line 144
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    const-string v2, "Received an exception without any callbacks to notify"

    .line 151
    .line 152
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 157
    throw v0

    .line 158
    :catchall_2
    move-exception v0

    .line 159
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 160
    throw v0
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->g:Lb0/k;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, Lb0/k;->b:Z

    .line 6
    .line 7
    iput-boolean v1, v0, Lb0/k;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lb0/k;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->f:Lb0/g;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lb0/g;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v2, v0, Lb0/g;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, v0, Lb0/g;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->a:Lb0/j;

    .line 22
    .line 23
    iput-object v2, v0, Lb0/j;->c:Lcom/bumptech/glide/c;

    .line 24
    .line 25
    iput-object v2, v0, Lb0/j;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, v0, Lb0/j;->n:Ly/c;

    .line 28
    .line 29
    iput-object v2, v0, Lb0/j;->g:Ljava/lang/Class;

    .line 30
    .line 31
    iput-object v2, v0, Lb0/j;->k:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v2, v0, Lb0/j;->i:Ly/f;

    .line 34
    .line 35
    iput-object v2, v0, Lb0/j;->o:Lcom/bumptech/glide/Priority;

    .line 36
    .line 37
    iput-object v2, v0, Lb0/j;->j:Ljava/util/Map;

    .line 38
    .line 39
    iput-object v2, v0, Lb0/j;->p:Lb0/o;

    .line 40
    .line 41
    iget-object v3, v0, Lb0/j;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, v0, Lb0/j;->l:Z

    .line 47
    .line 48
    iget-object v3, v0, Lb0/j;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v0, Lb0/j;->m:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->C:Z

    .line 56
    .line 57
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->h:Lcom/bumptech/glide/c;

    .line 58
    .line 59
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->i:Ly/c;

    .line 60
    .line 61
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->o:Ly/f;

    .line 62
    .line 63
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->j:Lcom/bumptech/glide/Priority;

    .line 64
    .line 65
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->k:Lb0/y;

    .line 66
    .line 67
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 68
    .line 69
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 70
    .line 71
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 72
    .line 73
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->v:Ljava/lang/Thread;

    .line 74
    .line 75
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->w:Ly/c;

    .line 76
    .line 77
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->y:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->z:Lcom/bumptech/glide/load/DataSource;

    .line 80
    .line 81
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->A:Lz/e;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    iput-wide v3, p0, Lcom/bumptech/glide/load/engine/b;->t:J

    .line 86
    .line 87
    iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 88
    .line 89
    iput-object v2, p0, Lcom/bumptech/glide/load/engine/b;->u:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->e:Landroidx/core/util/Pools$Pool;

    .line 97
    .line 98
    invoke-interface {v0, p0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception v1

    .line 103
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw v1
.end method

.method public final l()V
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;->SWITCH_TO_SOURCE_SERVICE:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->p:Lb0/w;

    .line 6
    .line 7
    iget-boolean v1, v0, Lb0/w;->m:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lb0/w;->i:Le0/b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, v0, Lb0/w;->h:Le0/b;

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p0}, Le0/b;->execute(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->v:Ljava/lang/Thread;

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
    iput-wide v0, p0, Lcom/bumptech/glide/load/engine/b;->t:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 25
    .line 26
    invoke-interface {v0}, Lb0/i;->d()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lcom/bumptech/glide/load/engine/b;->h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->g()Lb0/i;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 47
    .line 48
    sget-object v2, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->SOURCE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 49
    .line 50
    if-ne v1, v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->l()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 57
    .line 58
    sget-object v2, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->FINISHED:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 59
    .line 60
    if-eq v1, v2, :cond_2

    .line 61
    .line 62
    iget-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    :cond_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->j()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/engine/a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->f()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "Unrecognized run reason: "

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->s:Lcom/bumptech/glide/load/engine/DecodeJob$RunReason;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->m()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    sget-object v0, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->INITIALIZE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/engine/b;->h(Lcom/bumptech/glide/load/engine/DecodeJob$Stage;)Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->g()Lb0/i;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->m()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->c:Lw0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/b;->C:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-int/2addr v2, v1

    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v2, "Already notified"

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_1
    iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->C:Z

    .line 43
    .line 44
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/b;->A:Lz/e;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->j()V
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/CallbackException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v2}, Lz/e;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->n()V
    :try_end_1
    .catch Lcom/bumptech/glide/load/engine/CallbackException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lz/e;->a()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :goto_0
    const/4 v4, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", stage: "

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception v0

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->r:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 71
    .line 72
    sget-object v1, Lcom/bumptech/glide/load/engine/DecodeJob$Stage;->ENCODE:Lcom/bumptech/glide/load/engine/DecodeJob$Stage;

    .line 73
    .line 74
    if-eq v0, v1, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/b;->b:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/b;->j()V

    .line 82
    .line 83
    .line 84
    :cond_3
    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 85
    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    throw v3

    .line 89
    :cond_4
    throw v3

    .line 90
    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    :goto_3
    if-eqz v2, :cond_5

    .line 92
    .line 93
    invoke-interface {v2}, Lz/e;->a()V

    .line 94
    .line 95
    .line 96
    :cond_5
    throw v0
.end method
