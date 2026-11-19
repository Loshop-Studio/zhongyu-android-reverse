.class public Lcom/bumptech/glide/load/engine/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/engine/c;
.implements Lcom/bumptech/glide/load/engine/c$a;


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/d;

.field public final b:Lcom/bumptech/glide/load/engine/c$a;

.field public c:I

.field public d:Lcom/bumptech/glide/load/engine/b;

.field public e:Ljava/lang/Object;

.field public volatile f:Lq/m$a;

.field public g:Lm/a;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/d;Lcom/bumptech/glide/load/engine/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lj/b;Ljava/lang/Object;Lk/d;Lcom/bumptech/glide/load/DataSource;Lj/b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 2
    .line 3
    iget-object p4, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 4
    .line 5
    iget-object p4, p4, Lq/m$a;->c:Lk/d;

    .line 6
    .line 7
    invoke-interface {p4}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move-object v5, p1

    .line 15
    invoke-interface/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/c$a;->a(Lj/b;Ljava/lang/Object;Lk/d;Lcom/bumptech/glide/load/DataSource;Lj/b;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->e:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/k;->e:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/engine/k;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->d:Lcom/bumptech/glide/load/engine/b;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/b;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/k;->d:Lcom/bumptech/glide/load/engine/b;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    :cond_2
    :goto_0
    if-nez v0, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/k;->f()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/d;->g()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget v3, p0, Lcom/bumptech/glide/load/engine/k;->c:I

    .line 43
    .line 44
    add-int/lit8 v4, v3, 0x1

    .line 45
    .line 46
    iput v4, p0, Lcom/bumptech/glide/load/engine/k;->c:I

    .line 47
    .line 48
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lq/m$a;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/d;->e()Lm/c;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 67
    .line 68
    iget-object v3, v3, Lq/m$a;->c:Lk/d;

    .line 69
    .line 70
    invoke-interface {v3}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v1, v3}, Lm/c;->c(Lcom/bumptech/glide/load/DataSource;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 81
    .line 82
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 83
    .line 84
    iget-object v3, v3, Lq/m$a;->c:Lk/d;

    .line 85
    .line 86
    invoke-interface {v3}, Lk/d;->a()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v3}, Lcom/bumptech/glide/load/engine/d;->t(Ljava/lang/Class;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/engine/k;->j(Lq/m$a;)V

    .line 99
    .line 100
    .line 101
    move v0, v2

    .line 102
    goto :goto_0

    .line 103
    :cond_4
    return v0
.end method

.method public c()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 6
    .line 7
    invoke-interface {v0}, Lk/d;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Lj/b;Ljava/lang/Exception;Lk/d;Lcom/bumptech/glide/load/DataSource;)V
    .locals 1

    .line 1
    iget-object p4, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 4
    .line 5
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 6
    .line 7
    invoke-interface {v0}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p4, p1, p2, p3, v0}, Lcom/bumptech/glide/load/engine/c$a;->d(Lj/b;Ljava/lang/Exception;Lk/d;Lcom/bumptech/glide/load/DataSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-static {}, Lg0/e;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lcom/bumptech/glide/load/engine/d;->p(Ljava/lang/Object;)Lj/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Lm/b;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 14
    .line 15
    invoke-virtual {v4}, Lcom/bumptech/glide/load/engine/d;->k()Lj/d;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-direct {v3, v2, p1, v4}, Lm/b;-><init>(Lj/a;Ljava/lang/Object;Lj/d;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lm/a;

    .line 23
    .line 24
    iget-object v5, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 25
    .line 26
    iget-object v5, v5, Lq/m$a;->a:Lj/b;

    .line 27
    .line 28
    iget-object v6, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 29
    .line 30
    invoke-virtual {v6}, Lcom/bumptech/glide/load/engine/d;->o()Lj/b;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-direct {v4, v5, v6}, Lm/a;-><init>(Lj/b;Lj/b;)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p0, Lcom/bumptech/glide/load/engine/k;->g:Lm/a;

    .line 38
    .line 39
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/bumptech/glide/load/engine/d;->d()Lo/a;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v5, p0, Lcom/bumptech/glide/load/engine/k;->g:Lm/a;

    .line 46
    .line 47
    invoke-interface {v4, v5, v3}, Lo/a;->a(Lj/b;Lo/a$b;)V

    .line 48
    .line 49
    .line 50
    const-string v3, "SourceGenerator"

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v4, "Finished encoding source to cache, key: "

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v4, p0, Lcom/bumptech/glide/load/engine/k;->g:Lm/a;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v4, ", data: "

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, ", encoder: "

    .line 83
    .line 84
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, ", duration: "

    .line 91
    .line 92
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lg0/e;->a(J)D

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :cond_0
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 103
    .line 104
    iget-object p1, p1, Lq/m$a;->c:Lk/d;

    .line 105
    .line 106
    invoke-interface {p1}, Lk/d;->b()V

    .line 107
    .line 108
    .line 109
    new-instance p1, Lcom/bumptech/glide/load/engine/b;

    .line 110
    .line 111
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 112
    .line 113
    iget-object v0, v0, Lq/m$a;->a:Lj/b;

    .line 114
    .line 115
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 120
    .line 121
    invoke-direct {p1, v0, v1, p0}, Lcom/bumptech/glide/load/engine/b;-><init>(Ljava/util/List;Lcom/bumptech/glide/load/engine/d;Lcom/bumptech/glide/load/engine/c$a;)V

    .line 122
    .line 123
    .line 124
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/k;->d:Lcom/bumptech/glide/load/engine/b;

    .line 125
    .line 126
    return-void

    .line 127
    :catchall_0
    move-exception p1

    .line 128
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 129
    .line 130
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 131
    .line 132
    invoke-interface {v0}, Lk/d;->b()V

    .line 133
    .line 134
    .line 135
    throw p1
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/engine/k;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/d;->g()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method

.method public g(Lq/m$a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    return p1
.end method

.method public h(Lq/m$a;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/d;->e()Lm/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-object v1, p1, Lq/m$a;->c:Lk/d;

    .line 10
    .line 11
    invoke-interface {v1}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lm/c;->c(Lcom/bumptech/glide/load/DataSource;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/k;->e:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/bumptech/glide/load/engine/c$a;->c()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 30
    .line 31
    iget-object v1, p1, Lq/m$a;->a:Lj/b;

    .line 32
    .line 33
    iget-object v3, p1, Lq/m$a;->c:Lk/d;

    .line 34
    .line 35
    invoke-interface {v3}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, p0, Lcom/bumptech/glide/load/engine/k;->g:Lm/a;

    .line 40
    .line 41
    move-object v2, p2

    .line 42
    invoke-interface/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/c$a;->a(Lj/b;Ljava/lang/Object;Lk/d;Lcom/bumptech/glide/load/DataSource;Lj/b;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void
.end method

.method public i(Lq/m$a;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->b:Lcom/bumptech/glide/load/engine/c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->g:Lm/a;

    .line 4
    .line 5
    iget-object p1, p1, Lq/m$a;->c:Lk/d;

    .line 6
    .line 7
    invoke-interface {p1}, Lk/d;->d()Lcom/bumptech/glide/load/DataSource;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v0, v1, p2, p1, v2}, Lcom/bumptech/glide/load/engine/c$a;->d(Lj/b;Ljava/lang/Exception;Lk/d;Lcom/bumptech/glide/load/DataSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final j(Lq/m$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/k;->f:Lq/m$a;

    .line 2
    .line 3
    iget-object v0, v0, Lq/m$a;->c:Lk/d;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/k;->a:Lcom/bumptech/glide/load/engine/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/d;->l()Lcom/bumptech/glide/Priority;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Lcom/bumptech/glide/load/engine/k$a;

    .line 12
    .line 13
    invoke-direct {v2, p0, p1}, Lcom/bumptech/glide/load/engine/k$a;-><init>(Lcom/bumptech/glide/load/engine/k;Lq/m$a;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lk/d;->f(Lcom/bumptech/glide/Priority;Lk/d$a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
