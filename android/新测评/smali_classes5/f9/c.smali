.class public final Lf9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf9/c$a;,
        Lf9/c$b;
    }
.end annotation


# instance fields
.field public final a:Lf9/e;

.field public final b:La9/o;

.field public final c:Lf9/d;

.field public final d:Lg9/d;

.field public e:Z

.field public f:Z

.field public final g:Lokhttp3/internal/connection/RealConnection;


# direct methods
.method public constructor <init>(Lf9/e;La9/o;Lf9/d;Lg9/d;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "finder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "codec"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lf9/c;->a:Lf9/e;

    .line 25
    .line 26
    iput-object p2, p0, Lf9/c;->b:La9/o;

    .line 27
    .line 28
    iput-object p3, p0, Lf9/c;->c:Lf9/d;

    .line 29
    .line 30
    iput-object p4, p0, Lf9/c;->d:Lg9/d;

    .line 31
    .line 32
    invoke-interface {p4}, Lg9/d;->d()Lokhttp3/internal/connection/RealConnection;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lf9/c;->g:Lokhttp3/internal/connection/RealConnection;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p5}, Lf9/c;->t(Ljava/io/IOException;)V

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
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 11
    .line 12
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p5}, La9/o;->r(La9/e;Ljava/io/IOException;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 19
    .line 20
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, p2}, La9/o;->p(La9/e;J)V

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
    iget-object p1, p0, Lf9/c;->b:La9/o;

    .line 30
    .line 31
    iget-object p2, p0, Lf9/c;->a:Lf9/e;

    .line 32
    .line 33
    invoke-virtual {p1, p2, p5}, La9/o;->w(La9/e;Ljava/io/IOException;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 38
    .line 39
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1, p2}, La9/o;->u(La9/e;J)V

    .line 42
    .line 43
    .line 44
    :cond_4
    :goto_1
    iget-object p1, p0, Lf9/c;->a:Lf9/e;

    .line 45
    .line 46
    invoke-virtual {p1, p0, p4, p3, p5}, Lf9/e;->u(Lf9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lg9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(La9/w;Z)Lokio/Sink;
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lf9/c;->e:Z

    .line 7
    .line 8
    invoke-virtual {p1}, La9/w;->a()La9/x;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, La9/x;->contentLength()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object p2, p0, Lf9/c;->b:La9/o;

    .line 20
    .line 21
    iget-object v2, p0, Lf9/c;->a:Lf9/e;

    .line 22
    .line 23
    invoke-virtual {p2, v2}, La9/o;->q(La9/e;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lf9/c;->d:Lg9/d;

    .line 27
    .line 28
    invoke-interface {p2, p1, v0, v1}, Lg9/d;->c(La9/w;J)Lokio/Sink;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, Lf9/c$a;

    .line 33
    .line 34
    invoke-direct {p2, p0, p1, v0, v1}, Lf9/c$a;-><init>(Lf9/c;Lokio/Sink;J)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lg9/d;->cancel()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf9/c;->a:Lf9/e;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, v1, v2}, Lf9/e;->u(Lf9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lg9/d;->a()V
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
    iget-object v1, p0, Lf9/c;->b:La9/o;

    .line 9
    .line 10
    iget-object v2, p0, Lf9/c;->a:Lf9/e;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, La9/o;->r(La9/e;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lf9/c;->t(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final f()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lg9/d;->h()V
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
    iget-object v1, p0, Lf9/c;->b:La9/o;

    .line 9
    .line 10
    iget-object v2, p0, Lf9/c;->a:Lf9/e;

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, La9/o;->r(La9/e;Ljava/io/IOException;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lf9/c;->t(Ljava/io/IOException;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final g()Lf9/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->a:Lf9/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lokhttp3/internal/connection/RealConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->g:Lokhttp3/internal/connection/RealConnection;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()La9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lf9/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->c:Lf9/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf9/c;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/c;->c:Lf9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf9/d;->d()La9/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, La9/a;->l()La9/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, La9/r;->i()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lf9/c;->g:Lokhttp3/internal/connection/RealConnection;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/internal/connection/RealConnection;->z()La9/a0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, La9/a0;->a()La9/a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, La9/a;->l()La9/r;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, La9/r;->i()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    xor-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf9/c;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lg9/d;->d()Lokhttp3/internal/connection/RealConnection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->y()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf9/c;->a:Lf9/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-virtual {v0, p0, v3, v1, v2}, Lf9/e;->u(Lf9/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p(La9/y;)La9/z;
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1, v0, v2, v1, v2}, La9/y;->n(La9/y;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lf9/c;->d:Lg9/d;

    .line 15
    .line 16
    invoke-interface {v1, p1}, Lg9/d;->e(La9/y;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-object v3, p0, Lf9/c;->d:Lg9/d;

    .line 21
    .line 22
    invoke-interface {v3, p1}, Lg9/d;->g(La9/y;)Lokio/Source;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Lf9/c$b;

    .line 27
    .line 28
    invoke-direct {v3, p0, p1, v1, v2}, Lf9/c$b;-><init>(Lf9/c;Lokio/Source;J)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lg9/h;

    .line 32
    .line 33
    invoke-static {v3}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-direct {p1, v0, v1, v2, v3}, Lg9/h;-><init>(Ljava/lang/String;JLokio/BufferedSource;)V
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
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 43
    .line 44
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, La9/o;->w(La9/e;Ljava/io/IOException;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lf9/c;->t(Ljava/io/IOException;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method

.method public final q(Z)La9/y$a;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lg9/d;->f(Z)La9/y$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La9/y$a;->l(Lf9/c;)V
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
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 17
    .line 18
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 19
    .line 20
    invoke-virtual {v0, v1, p1}, La9/o;->w(La9/e;Ljava/io/IOException;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lf9/c;->t(Ljava/io/IOException;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final r(La9/y;)V
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 7
    .line 8
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, La9/o;->x(La9/e;La9/y;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 2
    .line 3
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La9/o;->y(La9/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final t(Ljava/io/IOException;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf9/c;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Lf9/c;->c:Lf9/d;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lf9/d;->h(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 10
    .line 11
    invoke-interface {v0}, Lg9/d;->d()Lokhttp3/internal/connection/RealConnection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Lokhttp3/internal/connection/RealConnection;->G(Lf9/e;Ljava/io/IOException;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final u(La9/w;)V
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 7
    .line 8
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La9/o;->t(La9/e;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lf9/c;->d:Lg9/d;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lg9/d;->b(La9/w;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 19
    .line 20
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, La9/o;->s(La9/e;La9/w;)V
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
    iget-object v0, p0, Lf9/c;->b:La9/o;

    .line 28
    .line 29
    iget-object v1, p0, Lf9/c;->a:Lf9/e;

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, La9/o;->r(La9/e;Ljava/io/IOException;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lf9/c;->t(Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
