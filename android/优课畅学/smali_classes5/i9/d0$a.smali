.class public Li9/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Li9/b0;

.field public b:Lokhttp3/Protocol;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lokhttp3/c;

.field public f:Li9/v$a;

.field public g:Li9/e0;

.field public h:Li9/d0;

.field public i:Li9/d0;

.field public j:Li9/d0;

.field public k:J

.field public l:J

.field public m:Ln9/h;

.field public n:Li9/g0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Li9/d0$a;->c:I

    .line 3
    sget-object v0, Li9/e0;->EMPTY:Li9/e0;

    iput-object v0, p0, Li9/d0$a;->g:Li9/e0;

    .line 4
    sget-object v0, Li9/g0;->b:Li9/g0;

    iput-object v0, p0, Li9/d0$a;->n:Li9/g0;

    .line 5
    new-instance v0, Li9/v$a;

    invoke-direct {v0}, Li9/v$a;-><init>()V

    iput-object v0, p0, Li9/d0$a;->f:Li9/v$a;

    return-void
.end method

.method public constructor <init>(Li9/d0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Li9/d0$a;->c:I

    .line 8
    sget-object v0, Li9/e0;->EMPTY:Li9/e0;

    iput-object v0, p0, Li9/d0$a;->g:Li9/e0;

    .line 9
    sget-object v0, Li9/g0;->b:Li9/g0;

    iput-object v0, p0, Li9/d0$a;->n:Li9/g0;

    .line 10
    invoke-virtual {p1}, Li9/d0;->t()Li9/b0;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->a:Li9/b0;

    .line 11
    invoke-virtual {p1}, Li9/d0;->r()Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->b:Lokhttp3/Protocol;

    .line 12
    invoke-virtual {p1}, Li9/d0;->f()I

    move-result v0

    iput v0, p0, Li9/d0$a;->c:I

    .line 13
    invoke-virtual {p1}, Li9/d0;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->d:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Li9/d0;->h()Lokhttp3/c;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->e:Lokhttp3/c;

    .line 15
    invoke-virtual {p1}, Li9/d0;->l()Li9/v;

    move-result-object v0

    invoke-virtual {v0}, Li9/v;->d()Li9/v$a;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->f:Li9/v$a;

    .line 16
    invoke-virtual {p1}, Li9/d0;->b()Li9/e0;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->g:Li9/e0;

    .line 17
    invoke-virtual {p1}, Li9/d0;->o()Li9/d0;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->h:Li9/d0;

    .line 18
    invoke-virtual {p1}, Li9/d0;->d()Li9/d0;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->i:Li9/d0;

    .line 19
    invoke-virtual {p1}, Li9/d0;->q()Li9/d0;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->j:Li9/d0;

    .line 20
    invoke-virtual {p1}, Li9/d0;->u()J

    move-result-wide v0

    iput-wide v0, p0, Li9/d0$a;->k:J

    .line 21
    invoke-virtual {p1}, Li9/d0;->s()J

    move-result-wide v0

    iput-wide v0, p0, Li9/d0$a;->l:J

    .line 22
    invoke-virtual {p1}, Li9/d0;->g()Ln9/h;

    move-result-object v0

    iput-object v0, p0, Li9/d0$a;->m:Ln9/h;

    .line 23
    invoke-static {p1}, Li9/d0;->a(Li9/d0;)Li9/g0;

    move-result-object p1

    iput-object p1, p0, Li9/d0$a;->n:Li9/g0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li9/d0$a;->f:Li9/v$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Li9/v$a;->a(Ljava/lang/String;Ljava/lang/String;)Li9/v$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b(Li9/e0;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->g:Li9/e0;

    .line 7
    .line 8
    return-object p0
.end method

.method public c()Li9/d0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v5, v0, Li9/d0$a;->c:I

    .line 4
    .line 5
    if-ltz v5, :cond_3

    .line 6
    .line 7
    iget-object v2, v0, Li9/d0$a;->a:Li9/b0;

    .line 8
    .line 9
    if-eqz v2, :cond_2

    .line 10
    .line 11
    iget-object v3, v0, Li9/d0$a;->b:Lokhttp3/Protocol;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    iget-object v4, v0, Li9/d0$a;->d:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v6, v0, Li9/d0$a;->e:Lokhttp3/c;

    .line 20
    .line 21
    iget-object v1, v0, Li9/d0$a;->f:Li9/v$a;

    .line 22
    .line 23
    invoke-virtual {v1}, Li9/v$a;->f()Li9/v;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v8, v0, Li9/d0$a;->g:Li9/e0;

    .line 28
    .line 29
    iget-object v9, v0, Li9/d0$a;->h:Li9/d0;

    .line 30
    .line 31
    iget-object v10, v0, Li9/d0$a;->i:Li9/d0;

    .line 32
    .line 33
    iget-object v11, v0, Li9/d0$a;->j:Li9/d0;

    .line 34
    .line 35
    iget-wide v12, v0, Li9/d0$a;->k:J

    .line 36
    .line 37
    iget-wide v14, v0, Li9/d0$a;->l:J

    .line 38
    .line 39
    iget-object v1, v0, Li9/d0$a;->m:Ln9/h;

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    iget-object v1, v0, Li9/d0$a;->n:Li9/g0;

    .line 44
    .line 45
    move-object/from16 v17, v1

    .line 46
    .line 47
    new-instance v1, Li9/d0;

    .line 48
    .line 49
    invoke-direct/range {v1 .. v17}, Li9/d0;-><init>(Li9/b0;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/c;Li9/v;Li9/e0;Li9/d0;Li9/d0;Li9/d0;JJLn9/h;Li9/g0;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "message == null"

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "protocol == null"

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v2, "request == null"

    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "code < 0: "

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget v2, v0, Li9/d0$a;->c:I

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v2
.end method

.method public d(Li9/d0;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "cacheResponse"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Li9/d0$a;->e(Ljava/lang/String;Li9/d0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->i:Li9/d0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final e(Ljava/lang/String;Li9/d0;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    invoke-virtual {p2}, Li9/d0;->o()Li9/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2}, Li9/d0;->d()Li9/d0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Li9/d0;->q()Li9/d0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, ".priorResponse != null"

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2

    .line 49
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ".cacheResponse != null"

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ".networkResponse != null"

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2

    .line 103
    :cond_3
    return-void
.end method

.method public f(I)Li9/d0$a;
    .locals 0

    .line 1
    iput p1, p0, Li9/d0$a;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Li9/d0$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public h(Lokhttp3/c;)Li9/d0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Li9/d0$a;->e:Lokhttp3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li9/d0$a;->f:Li9/v$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Li9/v$a;->i(Ljava/lang/String;Ljava/lang/String;)Li9/v$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public j(Li9/v;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li9/v;->d()Li9/v$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Li9/d0$a;->f:Li9/v$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final k(Ln9/h;)V
    .locals 1

    .line 1
    const-string v0, "exchange"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->m:Ln9/h;

    .line 7
    .line 8
    return-void
.end method

.method public l(Ljava/lang/String;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public m(Li9/d0;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "networkResponse"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Li9/d0$a;->e(Ljava/lang/String;Li9/d0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->h:Li9/d0;

    .line 7
    .line 8
    return-object p0
.end method

.method public n(Li9/d0;)Li9/d0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Li9/d0$a;->j:Li9/d0;

    .line 2
    .line 3
    return-object p0
.end method

.method public o(Lokhttp3/Protocol;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "protocol"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->b:Lokhttp3/Protocol;

    .line 7
    .line 8
    return-object p0
.end method

.method public p(J)Li9/d0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Li9/d0$a;->l:J

    .line 2
    .line 3
    return-object p0
.end method

.method public q(Li9/b0;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->a:Li9/b0;

    .line 7
    .line 8
    return-object p0
.end method

.method public r(J)Li9/d0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Li9/d0$a;->k:J

    .line 2
    .line 3
    return-object p0
.end method

.method public s(Li9/g0;)Li9/d0$a;
    .locals 1

    .line 1
    const-string v0, "trailersSource"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li9/d0$a;->n:Li9/g0;

    .line 7
    .line 8
    return-object p0
.end method
