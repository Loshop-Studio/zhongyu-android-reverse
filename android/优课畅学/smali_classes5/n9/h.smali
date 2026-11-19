.class public final Ln9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/h$a;,
        Ln9/h$b;
    }
.end annotation


# instance fields
.field public final a:Ln9/n;

.field public final b:Li9/r;

.field public final c:Ln9/i;

.field public final d:Lo9/d;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Ln9/n;Li9/r;Ln9/i;Lo9/d;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "finder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "codec"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ln9/h;->a:Ln9/n;

    .line 25
    .line 26
    iput-object p2, p0, Ln9/h;->b:Li9/r;

    .line 27
    .line 28
    iput-object p3, p0, Ln9/h;->c:Ln9/i;

    .line 29
    .line 30
    iput-object p4, p0, Ln9/h;->d:Lo9/d;

    .line 31
    .line 32
    return-void
.end method

.method public static final synthetic a(Ln9/h;)Lo9/d;
    .locals 0

    .line 1
    iget-object p0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Ln9/h;JZZLjava/io/IOException;ILjava/lang/Object;)Ljava/io/IOException;
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, -0x1

    .line 6
    .line 7
    :cond_0
    move-wide v1, p1

    .line 8
    and-int/lit8 p1, p6, 0x2

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    move v3, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move v3, p3

    .line 16
    :goto_0
    and-int/lit8 p1, p6, 0x4

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    move v4, p2

    .line 21
    :goto_1
    move-object v0, p0

    .line 22
    move-object v5, p5

    .line 23
    goto :goto_2

    .line 24
    :cond_2
    move v4, p4

    .line 25
    goto :goto_1

    .line 26
    :goto_2
    invoke-virtual/range {v0 .. v5}, Ln9/h;->b(JZZLjava/io/IOException;)Ljava/io/IOException;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method


# virtual methods
.method public final b(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p5}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p4, :cond_2

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 11
    .line 12
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p5}, Li9/r;->s(Li9/e;Ljava/io/IOException;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 19
    .line 20
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, p2}, Li9/r;->q(Li9/e;J)V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    .line 26
    .line 27
    if-eqz p5, :cond_3

    .line 28
    .line 29
    iget-object p1, p0, Ln9/h;->b:Li9/r;

    .line 30
    .line 31
    iget-object p2, p0, Ln9/h;->a:Ln9/n;

    .line 32
    .line 33
    invoke-virtual {p1, p2, p5}, Li9/r;->x(Li9/e;Ljava/io/IOException;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 38
    .line 39
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1, p2}, Li9/r;->v(Li9/e;J)V

    .line 42
    .line 43
    .line 44
    :cond_4
    :goto_1
    iget-object p1, p0, Ln9/h;->a:Ln9/n;

    .line 45
    .line 46
    invoke-virtual {p1, p0, p4, p3, p5}, Ln9/n;->u(Ln9/h;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Li9/b0;Z)Lokio/Sink;
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Ln9/h;->e:Z

    .line 7
    .line 8
    invoke-virtual {p1}, Li9/b0;->a()Li9/c0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Li9/c0;->contentLength()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object p2, p0, Ln9/h;->b:Li9/r;

    .line 20
    .line 21
    iget-object v2, p0, Ln9/h;->a:Ln9/n;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, Li9/r;->r(Li9/e;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Ln9/h;->d:Lo9/d;

    .line 27
    .line 28
    invoke-interface {p2, p1, v0, v1}, Lo9/d;->b(Li9/b0;J)Lokio/Sink;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, Ln9/h$a;

    .line 33
    .line 34
    invoke-direct {p2, p0, p1, v0, v1}, Ln9/h$a;-><init>(Ln9/h;Lokio/Sink;J)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/h;->a:Ln9/n;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, v1, v2}, Ln9/n;->u(Ln9/h;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Ln9/h;->b:Li9/r;

    .line 9
    .line 10
    iget-object v2, p0, Ln9/h;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Li9/r;->s(Li9/e;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final h()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->g()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Ln9/h;->b:Li9/r;

    .line 9
    .line 10
    iget-object v2, p0, Ln9/h;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Li9/r;->s(Li9/e;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final i()Ln9/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/h;->a:Ln9/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ln9/o;
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->h()Lo9/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ln9/o;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ln9/o;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "no connection for CONNECT tunnels"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final k()Li9/r;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ln9/i;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/h;->c:Ln9/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln9/h;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->c:Ln9/i;

    .line 2
    .line 3
    invoke-interface {v0}, Ln9/i;->b()Ln9/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ln9/u;->a()Li9/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Li9/a;->l()Li9/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Li9/w;->h()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Ln9/h;->d:Lo9/d;

    .line 20
    .line 21
    invoke-interface {v1}, Lo9/d;->h()Lo9/d$a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Lo9/d$a;->d()Li9/f0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Li9/f0;->a()Li9/a;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Li9/a;->l()Li9/w;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Li9/w;->h()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    xor-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    return v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln9/h;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lo9/d;->h()Lo9/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lo9/d$a;->b()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final q()V
    .locals 7

    .line 1
    iget-object v0, p0, Ln9/h;->a:Ln9/n;

    .line 2
    .line 3
    const/4 v5, 0x4

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v1, p0

    .line 9
    invoke-static/range {v0 .. v6}, Ln9/n;->v(Ln9/n;Ln9/h;ZZLjava/io/IOException;ILjava/lang/Object;)Ljava/io/IOException;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r(Li9/d0;)Li9/e0;
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v0, "Content-Type"

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p1, v0, v2, v1, v2}, Li9/d0;->k(Li9/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Ln9/h;->d:Lo9/d;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Lo9/d;->i(Li9/d0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-object v3, p0, Ln9/h;->d:Lo9/d;

    .line 21
    .line 22
    invoke-interface {v3, p1}, Lo9/d;->c(Li9/d0;)Lokio/Source;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Ln9/h$b;

    .line 27
    .line 28
    invoke-direct {v3, p0, p1, v1, v2}, Ln9/h$b;-><init>(Ln9/h;Lokio/Source;J)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lo9/h;

    .line 32
    .line 33
    invoke-static {v3}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-direct {p1, v0, v1, v2, v3}, Lo9/h;-><init>(Ljava/lang/String;JLokio/BufferedSource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 43
    .line 44
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Li9/r;->x(Li9/e;Ljava/io/IOException;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final s(Z)Li9/d0$a;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lo9/d;->e(Z)Li9/d0$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Li9/d0$a;->k(Ln9/h;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-object p1

    .line 16
    :goto_0
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 17
    .line 18
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, Li9/r;->x(Li9/e;Ljava/io/IOException;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final t(Li9/d0;)V
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 7
    .line 8
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Li9/r;->y(Li9/e;Li9/d0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 2
    .line 3
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li9/r;->z(Li9/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final v(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ln9/h;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 5
    .line 6
    invoke-interface {v0}, Lo9/d;->h()Lo9/d$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 11
    .line 12
    invoke-interface {v0, v1, p1}, Lo9/d$a;->f(Ln9/n;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final w(Li9/b0;)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 7
    .line 8
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Li9/r;->u(Li9/e;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ln9/h;->d:Lo9/d;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lo9/d;->f(Li9/b0;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 19
    .line 20
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Li9/r;->t(Li9/e;Li9/b0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    iget-object v0, p0, Ln9/h;->b:Li9/r;

    .line 28
    .line 29
    iget-object v1, p0, Ln9/h;->a:Ln9/n;

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, Li9/r;->s(Li9/e;Ljava/io/IOException;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ln9/h;->v(Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
