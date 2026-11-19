.class public Ly8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h;


# instance fields
.field public final a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

.field public final b:Lz8/a;

.field public c:Lz8/l;

.field public d:Lc9/a;

.field public e:Ly8/h$a;

.field public final f:Ld9/a;

.field public g:Lz8/e;

.field public h:Lz8/l;

.field public i:Z

.field public j:J

.field public final k:Ld9/a$b;

.field public l:Z

.field public m:J

.field public n:J

.field public o:I

.field public p:Z

.field public q:Lz8/c;

.field public r:La9/d;

.field public s:Lz8/l;

.field public t:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La9/d;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ly8/e;->h:Lz8/l;

    .line 11
    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    iput-wide v2, p0, Ly8/e;->j:J

    .line 15
    .line 16
    new-instance v0, Ld9/a$b;

    .line 17
    .line 18
    invoke-direct {v0}, Ld9/a$b;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ly8/e;->k:Ld9/a$b;

    .line 22
    .line 23
    new-instance v0, La9/d;

    .line 24
    .line 25
    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ly8/e;->r:La9/d;

    .line 29
    .line 30
    new-instance v0, Ly8/e$a;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ly8/e$a;-><init>(Ly8/e;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ly8/e;->t:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext$a;

    .line 36
    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    iput-object p2, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 40
    .line 41
    invoke-virtual {p2}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->b()Lz8/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Ly8/e;->b:Lz8/a;

    .line 46
    .line 47
    iput-object p3, p0, Ly8/e;->e:Ly8/h$a;

    .line 48
    .line 49
    new-instance p3, Le9/a;

    .line 50
    .line 51
    invoke-direct {p3, p2}, Le9/a;-><init>(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 52
    .line 53
    .line 54
    iput-object p3, p0, Ly8/e;->f:Ld9/a;

    .line 55
    .line 56
    new-instance v0, Ly8/e$b;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Ly8/e$b;-><init>(Ly8/e;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p3, v0}, Ld9/a;->c(Ld9/a$a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->f()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    invoke-virtual {p2}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->e()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const/4 v0, 0x0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 80
    :goto_1
    invoke-interface {p3, v0}, Ld9/a;->d(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ly8/e;->o(Lz8/e;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->d()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const-string p3, "1017_Filter"

    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    iget-object p1, p2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 95
    .line 96
    invoke-virtual {p1, p3}, Ly8/b;->d(Ljava/lang/String;)Ly8/b$e;

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    iget-object p1, p2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 101
    .line 102
    invoke-virtual {p1, p3}, Ly8/b;->g(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string p2, "context is null"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
.end method


# virtual methods
.method public declared-synchronized a(Lz8/c;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly8/e;->c:Lz8/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-boolean v0, p1, Lz8/c;->y:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Ly8/e;->r:La9/d;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, La9/d;->e(Lz8/c;)Z

    .line 15
    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ly8/e;->r(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p0, Ly8/e;->c:Lz8/l;

    .line 26
    .line 27
    invoke-interface {v0}, Lz8/l;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p1, Lz8/c;->r:I

    .line 32
    .line 33
    iget-wide v0, p0, Ly8/e;->m:J

    .line 34
    .line 35
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-gtz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-wide v2, p0, Ly8/e;->n:J

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    if-gtz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Ly8/e;->h:Lz8/l;

    .line 54
    .line 55
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    :try_start_2
    iget-object v1, p0, Ly8/e;->h:Lz8/l;

    .line 57
    .line 58
    invoke-interface {v1, p1}, Lz8/l;->e(Lz8/c;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    monitor-exit v0

    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    :try_start_3
    throw p1

    .line 67
    :cond_2
    iget-boolean v0, p1, Lz8/c;->y:Z

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 v1, 0x1

    .line 74
    :goto_1
    iget-object v0, p0, Ly8/e;->c:Lz8/l;

    .line 75
    .line 76
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    :try_start_4
    iget-object v2, p0, Ly8/e;->c:Lz8/l;

    .line 78
    .line 79
    invoke-interface {v2, p1}, Lz8/l;->e(Lz8/c;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    :try_start_5
    iput-wide v0, p0, Ly8/e;->n:J

    .line 89
    .line 90
    iput-wide v0, p0, Ly8/e;->m:J

    .line 91
    .line 92
    :cond_4
    if-eqz v2, :cond_5

    .line 93
    .line 94
    iget-object v0, p0, Ly8/e;->e:Ly8/h$a;

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    invoke-interface {v0, p1}, Ly8/h$a;->d(Lz8/c;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    iget-object v0, p0, Ly8/e;->q:Lz8/c;

    .line 102
    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    iget-object v2, p0, Ly8/e;->q:Lz8/c;

    .line 112
    .line 113
    invoke-virtual {v2}, Lz8/c;->b()J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    cmp-long v0, v0, v2

    .line 118
    .line 119
    if-lez v0, :cond_7

    .line 120
    .line 121
    :cond_6
    iput-object p1, p0, Ly8/e;->q:Lz8/c;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 122
    .line 123
    :cond_7
    monitor-exit p0

    .line 124
    return-void

    .line 125
    :catchall_2
    move-exception p1

    .line 126
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 127
    :try_start_7
    throw p1

    .line 128
    :goto_2
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 129
    throw p1
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly8/e;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized c(Lz8/a;)Ld9/a$b;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly8/e;->g:Lz8/e;

    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Ly8/e;->m(Lz8/a;Lz8/e;)Ld9/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public d(J)Lz8/l;
    .locals 6

    .line 1
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 4
    .line 5
    iget-wide v0, v0, La9/c;->e:J

    .line 6
    .line 7
    sub-long v2, p1, v0

    .line 8
    .line 9
    const-wide/16 v4, 0x64

    .line 10
    .line 11
    sub-long/2addr v2, v4

    .line 12
    add-long/2addr p1, v0

    .line 13
    iget-object v0, p0, Ly8/e;->c:Lz8/l;

    .line 14
    .line 15
    invoke-interface {v0, v2, v3, p1, p2}, Lz8/l;->a(JJ)Lz8/l;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, La9/d;

    .line 20
    .line 21
    invoke-direct {p2}, La9/d;-><init>()V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Lz8/l;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p1}, Lz8/l;->iterator()Lz8/k;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_0
    :goto_0
    invoke-interface {p1}, Lz8/k;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Lz8/k;->next()Lz8/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lz8/c;->v()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Lz8/c;->s()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    invoke-interface {p2, v0}, Lz8/l;->e(Lz8/c;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-object p2
.end method

.method public e()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ly8/e;->n:J

    .line 4
    .line 5
    iput-wide v0, p0, Ly8/e;->m:J

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Ly8/e;->p:Z

    .line 9
    .line 10
    return-void
.end method

.method public f(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly8/e;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 5
    .line 6
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz8/i;->f()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 12
    .line 13
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz8/i;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 19
    .line 20
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 21
    .line 22
    invoke-virtual {v0}, Lz8/i;->e()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 26
    .line 27
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 28
    .line 29
    invoke-virtual {v0}, Lz8/i;->d()V

    .line 30
    .line 31
    .line 32
    new-instance v0, La9/d;

    .line 33
    .line 34
    const/4 v1, 0x4

    .line 35
    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Ly8/e;->s:Lz8/l;

    .line 39
    .line 40
    const-wide/16 v0, 0x3e8

    .line 41
    .line 42
    cmp-long v0, p1, v0

    .line 43
    .line 44
    if-gez v0, :cond_0

    .line 45
    .line 46
    const-wide/16 p1, 0x0

    .line 47
    .line 48
    :cond_0
    iput-wide p1, p0, Ly8/e;->j:J

    .line 49
    .line 50
    iget-object p1, p0, Ly8/e;->k:Ld9/a$b;

    .line 51
    .line 52
    invoke-virtual {p1}, Ld9/a$b;->d()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ly8/e;->k:Ld9/a$b;

    .line 56
    .line 57
    iget-wide v0, p0, Ly8/e;->j:J

    .line 58
    .line 59
    iput-wide v0, p1, Ld9/a$b;->o:J

    .line 60
    .line 61
    iget-object p1, p0, Ly8/e;->c:Lz8/l;

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-interface {p1}, Lz8/l;->last()Lz8/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-nez p2, :cond_1

    .line 76
    .line 77
    iput-object p1, p0, Ly8/e;->q:Lz8/c;

    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public g(Lc9/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/e;->d:Lc9/a;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Ly8/e;->l:Z

    .line 5
    .line 6
    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/e;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly8/e;->f:Ld9/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Ld9/a;->release()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public j(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly8/e;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 5
    .line 6
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz8/i;->f()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 12
    .line 13
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz8/i;->b()V

    .line 16
    .line 17
    .line 18
    iput-wide p1, p0, Ly8/e;->j:J

    .line 19
    .line 20
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/e;->p:Z

    .line 3
    .line 4
    return-void
.end method

.method public final l(Ld9/a$b;Lz8/l;Lz8/l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ld9/a$b;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ld9/a$b;->b:Lz8/e;

    .line 5
    .line 6
    invoke-static {}, Lf9/c;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-virtual {v0, v1, v2}, Lz8/e;->b(J)J

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p1, Ld9/a$b;->c:I

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-interface {p2}, Lz8/l;->size()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p2, v0

    .line 24
    :goto_0
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-interface {p3}, Lz8/l;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :cond_1
    add-int/2addr p2, v0

    .line 31
    iput p2, p1, Ld9/a$b;->d:I

    .line 32
    .line 33
    return-void
.end method

.method public m(Lz8/a;Lz8/e;)Ld9/a$b;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ly8/e;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Ly8/e;->f:Ld9/a;

    .line 9
    .line 10
    invoke-interface {v1}, Ld9/a;->e()V

    .line 11
    .line 12
    .line 13
    iput-boolean v2, v0, Ly8/e;->i:Z

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Ly8/e;->c:Lz8/l;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v1, :cond_a

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Lz8/a;->p()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/graphics/Canvas;

    .line 25
    .line 26
    invoke-static {v1}, Ly8/d;->a(Landroid/graphics/Canvas;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v1, v0, Ly8/e;->p:Z

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v1, v0, Ly8/e;->k:Ld9/a$b;

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_1
    iget-object v9, v0, Ly8/e;->k:Ld9/a$b;

    .line 37
    .line 38
    move-object/from16 v1, p2

    .line 39
    .line 40
    iget-wide v4, v1, Lz8/e;->a:J

    .line 41
    .line 42
    iget-object v1, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 43
    .line 44
    iget-object v1, v1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 45
    .line 46
    iget-wide v6, v1, La9/c;->e:J

    .line 47
    .line 48
    sub-long v10, v4, v6

    .line 49
    .line 50
    const-wide/16 v12, 0x64

    .line 51
    .line 52
    sub-long/2addr v10, v12

    .line 53
    add-long/2addr v6, v4

    .line 54
    iget-object v1, v0, Ly8/e;->h:Lz8/l;

    .line 55
    .line 56
    iget-wide v12, v0, Ly8/e;->m:J

    .line 57
    .line 58
    cmp-long v8, v12, v10

    .line 59
    .line 60
    if-gtz v8, :cond_3

    .line 61
    .line 62
    iget-wide v14, v0, Ly8/e;->n:J

    .line 63
    .line 64
    cmp-long v4, v4, v14

    .line 65
    .line 66
    if-lez v4, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-wide v10, v12

    .line 70
    :goto_0
    move-object v6, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    iget-object v1, v0, Ly8/e;->c:Lz8/l;

    .line 73
    .line 74
    invoke-interface {v1, v10, v11, v6, v7}, Lz8/l;->c(JJ)Lz8/l;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    iput-object v1, v0, Ly8/e;->h:Lz8/l;

    .line 81
    .line 82
    :cond_4
    iput-wide v10, v0, Ly8/e;->m:J

    .line 83
    .line 84
    iput-wide v6, v0, Ly8/e;->n:J

    .line 85
    .line 86
    move-wide v14, v6

    .line 87
    goto :goto_0

    .line 88
    :goto_2
    iget-object v1, v0, Ly8/e;->s:Lz8/l;

    .line 89
    .line 90
    invoke-virtual {v0, v9, v1, v6}, Ly8/e;->l(Ld9/a$b;Lz8/l;Lz8/l;)V

    .line 91
    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    invoke-interface {v1}, Lz8/l;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_5

    .line 101
    .line 102
    iget-object v5, v0, Ly8/e;->k:Ld9/a$b;

    .line 103
    .line 104
    iput-boolean v4, v5, Ld9/a$b;->a:Z

    .line 105
    .line 106
    iget-object v7, v0, Ly8/e;->f:Ld9/a;

    .line 107
    .line 108
    const-wide/16 v19, 0x0

    .line 109
    .line 110
    move-object/from16 v17, p1

    .line 111
    .line 112
    move-object/from16 v18, v1

    .line 113
    .line 114
    move-object/from16 v21, v5

    .line 115
    .line 116
    move-object/from16 v16, v7

    .line 117
    .line 118
    invoke-interface/range {v16 .. v21}, Ld9/a;->a(Lz8/m;Lz8/l;JLd9/a$b;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    iget-object v1, v0, Ly8/e;->k:Ld9/a$b;

    .line 122
    .line 123
    iput-boolean v2, v1, Ld9/a$b;->a:Z

    .line 124
    .line 125
    if-eqz v6, :cond_9

    .line 126
    .line 127
    invoke-interface {v6}, Lz8/l;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_9

    .line 132
    .line 133
    iget-object v4, v0, Ly8/e;->f:Ld9/a;

    .line 134
    .line 135
    iget-object v5, v0, Ly8/e;->b:Lz8/a;

    .line 136
    .line 137
    iget-wide v7, v0, Ly8/e;->j:J

    .line 138
    .line 139
    invoke-interface/range {v4 .. v9}, Ld9/a;->a(Lz8/m;Lz8/l;JLd9/a$b;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v9}, Ly8/e;->n(Ld9/a$b;)V

    .line 143
    .line 144
    .line 145
    iget-boolean v1, v9, Ld9/a$b;->p:Z

    .line 146
    .line 147
    if-eqz v1, :cond_8

    .line 148
    .line 149
    iget-object v1, v0, Ly8/e;->q:Lz8/c;

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    invoke-virtual {v1}, Lz8/c;->w()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_6

    .line 158
    .line 159
    iput-object v3, v0, Ly8/e;->q:Lz8/c;

    .line 160
    .line 161
    iget-object v1, v0, Ly8/e;->e:Ly8/h$a;

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    invoke-interface {v1}, Ly8/h$a;->c()V

    .line 166
    .line 167
    .line 168
    :cond_6
    iget-wide v1, v9, Ld9/a$b;->n:J

    .line 169
    .line 170
    const-wide/16 v3, -0x1

    .line 171
    .line 172
    cmp-long v1, v1, v3

    .line 173
    .line 174
    if-nez v1, :cond_7

    .line 175
    .line 176
    iput-wide v10, v9, Ld9/a$b;->n:J

    .line 177
    .line 178
    :cond_7
    iget-wide v1, v9, Ld9/a$b;->o:J

    .line 179
    .line 180
    cmp-long v1, v1, v3

    .line 181
    .line 182
    if-nez v1, :cond_8

    .line 183
    .line 184
    iput-wide v14, v9, Ld9/a$b;->o:J

    .line 185
    .line 186
    :cond_8
    return-object v9

    .line 187
    :cond_9
    iput-boolean v4, v9, Ld9/a$b;->p:Z

    .line 188
    .line 189
    iput-wide v10, v9, Ld9/a$b;->n:J

    .line 190
    .line 191
    iput-wide v14, v9, Ld9/a$b;->o:J

    .line 192
    .line 193
    return-object v9

    .line 194
    :cond_a
    return-object v3
.end method

.method public final n(Ld9/a$b;)V
    .locals 4

    .line 1
    iget v0, p1, Ld9/a$b;->k:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-boolean v0, p1, Ld9/a$b;->p:Z

    .line 9
    .line 10
    const-wide/16 v1, -0x1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iput-wide v1, p1, Ld9/a$b;->n:J

    .line 15
    .line 16
    :cond_1
    iget-object v0, p1, Ld9/a$b;->e:Lz8/c;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    iput-object v3, p1, Ld9/a$b;->e:Lz8/c;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Lz8/c;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    :cond_2
    iput-wide v1, p1, Ld9/a$b;->o:J

    .line 28
    .line 29
    iget-object v0, p1, Ld9/a$b;->b:Lz8/e;

    .line 30
    .line 31
    invoke-static {}, Lf9/c;->b()J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-virtual {v0, v1, v2}, Lz8/e;->b(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iput-wide v0, p1, Ld9/a$b;->m:J

    .line 40
    .line 41
    return-void
.end method

.method public o(Lz8/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/e;->g:Lz8/e;

    .line 2
    .line 3
    return-void
.end method

.method public p(Lc9/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lc9/a;->f(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Lc9/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Ly8/e;->b:Lz8/a;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lc9/a;->g(Lz8/m;)Lc9/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Ly8/e;->g:Lz8/e;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lc9/a;->h(Lz8/e;)Lc9/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lc9/a;->a()Lz8/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Ly8/e;->c:Lz8/l;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Lz8/l;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Ly8/e;->c:Lz8/l;

    .line 34
    .line 35
    invoke-interface {p1}, Lz8/l;->first()Lz8/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p1, p1, Lz8/c;->H:Lz8/i;

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Ly8/e;->c:Lz8/l;

    .line 44
    .line 45
    invoke-interface {p1}, Lz8/l;->iterator()Lz8/k;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_0
    :goto_0
    invoke-interface {p1}, Lz8/k;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {p1}, Lz8/k;->next()Lz8/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget-object v1, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 62
    .line 63
    iget-object v1, v1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 64
    .line 65
    iput-object v1, v0, Lz8/c;->H:Lz8/i;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 69
    .line 70
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 71
    .line 72
    invoke-virtual {p1}, Lz8/i;->a()V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Ly8/e;->c:Lz8/l;

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-interface {p1}, Lz8/l;->last()Lz8/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Ly8/e;->q:Lz8/c;

    .line 84
    .line 85
    :cond_2
    return-void
.end method

.method public prepare()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/e;->d:Lc9/a;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ly8/e;->p(Lc9/a;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Ly8/e;->n:J

    .line 9
    .line 10
    iput-wide v0, p0, Ly8/e;->m:J

    .line 11
    .line 12
    iget-object v0, p0, Ly8/e;->e:Ly8/h$a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ly8/h$a;->b()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Ly8/e;->l:Z

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public q(Lz8/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public declared-synchronized r(I)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly8/e;->c:Lz8/l;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-interface {v0}, Lz8/l;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Ly8/e;->r:La9/d;

    .line 13
    .line 14
    invoke-virtual {v0}, La9/d;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-static {}, Lf9/c;->b()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object v2, p0, Ly8/e;->r:La9/d;

    .line 26
    .line 27
    invoke-virtual {v2}, La9/d;->iterator()Lz8/k;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    invoke-interface {v2}, Lz8/k;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v2}, Lz8/k;->next()Lz8/c;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lz8/c;->w()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v2}, Lz8/k;->remove()V

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Ly8/e;->c:Lz8/l;

    .line 51
    .line 52
    invoke-interface {v5, v3}, Lz8/l;->b(Lz8/c;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v3}, Ly8/e;->q(Lz8/c;)V

    .line 56
    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    invoke-static {}, Lf9/c;->b()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    sub-long/2addr v3, v0

    .line 65
    int-to-long v5, p1

    .line 66
    cmp-long v3, v3, v5

    .line 67
    .line 68
    if-lez v3, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :goto_0
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :cond_3
    :goto_1
    monitor-exit p0

    .line 76
    return-void

    .line 77
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1
.end method

.method public s()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/e;->h:Lz8/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La9/d;

    .line 6
    .line 7
    invoke-direct {v0}, La9/d;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ly8/e;->h:Lz8/l;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ly8/e;->f:Ld9/a;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ld9/a;->clear()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/e;->t:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->g(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
