.class public final Lk5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk5/u;


# instance fields
.field public final a:Lj5/d;

.field public final b:Lk5/p;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Z

.field public final j:Lf5/a;

.field public final k:Lk5/t;

.field public final l:Lk5/g;

.field public m:Lk5/v$b;

.field public n:Lk5/v;

.field public o:Lf5/f0;

.field public final p:Lkotlin/collections/ArrayDeque;


# direct methods
.method public constructor <init>(Lj5/d;Lk5/p;IIIIIZZLf5/a;Lk5/t;Lk5/g;)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "connectionPool"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "address"

    .line 12
    .line 13
    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "routeDatabase"

    .line 17
    .line 18
    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "connectionUser"

    .line 22
    .line 23
    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lk5/q;->a:Lj5/d;

    .line 30
    .line 31
    iput-object p2, p0, Lk5/q;->b:Lk5/p;

    .line 32
    .line 33
    iput p3, p0, Lk5/q;->c:I

    .line 34
    .line 35
    iput p4, p0, Lk5/q;->d:I

    .line 36
    .line 37
    iput p5, p0, Lk5/q;->e:I

    .line 38
    .line 39
    iput p6, p0, Lk5/q;->f:I

    .line 40
    .line 41
    iput p7, p0, Lk5/q;->g:I

    .line 42
    .line 43
    iput-boolean p8, p0, Lk5/q;->h:Z

    .line 44
    .line 45
    iput-boolean p9, p0, Lk5/q;->i:Z

    .line 46
    .line 47
    iput-object p10, p0, Lk5/q;->j:Lf5/a;

    .line 48
    .line 49
    iput-object p11, p0, Lk5/q;->k:Lk5/t;

    .line 50
    .line 51
    iput-object p12, p0, Lk5/q;->l:Lk5/g;

    .line 52
    .line 53
    new-instance p1, Lkotlin/collections/ArrayDeque;

    .line 54
    .line 55
    invoke-direct {p1}, Lkotlin/collections/ArrayDeque;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lk5/q;->p:Lkotlin/collections/ArrayDeque;

    .line 59
    .line 60
    return-void
.end method

.method public static synthetic j(Lk5/q;Lf5/f0;Ljava/util/List;ILjava/lang/Object;)Lk5/e;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lk5/q;->i(Lf5/f0;Ljava/util/List;)Lk5/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic m(Lk5/q;Lk5/e;Ljava/util/List;ILjava/lang/Object;)Lk5/s;
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lk5/q;->l(Lk5/e;Ljava/util/List;)Lk5/s;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public a()Lf5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/q;->j:Lf5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lkotlin/collections/ArrayDeque;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/q;->p:Lkotlin/collections/ArrayDeque;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lk5/u$b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk5/q;->k()Lk5/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x3

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1, v1, v0, v1}, Lk5/q;->m(Lk5/q;Lk5/e;Ljava/util/List;ILjava/lang/Object;)Lk5/s;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lk5/q;->b()Lkotlin/collections/ArrayDeque;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lk5/q;->b()Lkotlin/collections/ArrayDeque;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lkotlin/collections/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lk5/u$b;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    invoke-virtual {p0}, Lk5/q;->h()Lk5/e;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lk5/e;->r()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p0, v0, v1}, Lk5/q;->l(Lk5/e;Ljava/util/List;)Lk5/s;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_3
    return-object v0
.end method

.method public e(Lf5/w;)Z
    .locals 3

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/q;->a()Lf5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lf5/a;->l()Lf5/w;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Lf5/w;->m()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Lf5/w;->m()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lf5/w;->h()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0}, Lf5/w;->h()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    return p1
.end method

.method public f(Lk5/o;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk5/q;->b()Lkotlin/collections/ArrayDeque;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, Lk5/q;->o:Lf5/f0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    if-eqz p1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lk5/q;->n(Lk5/o;)Lf5/f0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iput-object p1, p0, Lk5/q;->o:Lf5/f0;

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    iget-object p1, p0, Lk5/q;->m:Lk5/v$b;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Lk5/v$b;->b()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, v1, :cond_3

    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    iget-object p1, p0, Lk5/q;->n:Lk5/v;

    .line 41
    .line 42
    if-nez p1, :cond_4

    .line 43
    .line 44
    return v1

    .line 45
    :cond_4
    invoke-virtual {p1}, Lk5/v;->a()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
.end method

.method public final g(Lf5/f0;)Lf5/b0;
    .locals 4

    .line 1
    new-instance v0, Lf5/b0$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf5/b0$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lf5/f0;->a()Lf5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lf5/a;->l()Lf5/w;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lf5/b0$a;->v(Lf5/w;)Lf5/b0$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "CONNECT"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Lf5/b0$a;->q(Ljava/lang/String;Lf5/c0;)Lf5/b0$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lf5/f0;->a()Lf5/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lf5/a;->l()Lf5/w;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-static {v1, v2}, Lg5/k;->t(Lf5/w;Z)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "Host"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1}, Lf5/b0$a;->o(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "Proxy-Connection"

    .line 45
    .line 46
    const-string v2, "Keep-Alive"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Lf5/b0$a;->o(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "User-Agent"

    .line 53
    .line 54
    const-string v2, "okhttp/5.1.0"

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Lf5/b0$a;->o(Ljava/lang/String;Ljava/lang/String;)Lf5/b0$a;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lf5/b0$a;->b()Lf5/b0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lf5/d0$a;

    .line 65
    .line 66
    invoke-direct {v1}, Lf5/d0$a;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lf5/d0$a;->q(Lf5/b0;)Lf5/d0$a;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    sget-object v2, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lf5/d0$a;->o(Lokhttp3/Protocol;)Lf5/d0$a;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const/16 v2, 0x197

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Lf5/d0$a;->f(I)Lf5/d0$a;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "Preemptive Authenticate"

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Lf5/d0$a;->l(Ljava/lang/String;)Lf5/d0$a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-wide/16 v2, -0x1

    .line 92
    .line 93
    invoke-virtual {v1, v2, v3}, Lf5/d0$a;->r(J)Lf5/d0$a;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1, v2, v3}, Lf5/d0$a;->p(J)Lf5/d0$a;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "Proxy-Authenticate"

    .line 102
    .line 103
    const-string v3, "OkHttp-Preemptive"

    .line 104
    .line 105
    invoke-virtual {v1, v2, v3}, Lf5/d0$a;->i(Ljava/lang/String;Ljava/lang/String;)Lf5/d0$a;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Lf5/d0$a;->c()Lf5/d0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1}, Lf5/f0;->a()Lf5/a;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Lf5/a;->h()Lf5/b;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v2, p1, v1}, Lf5/b;->a(Lf5/f0;Lf5/d0;)Lf5/b0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-nez p1, :cond_0

    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_0
    return-object p1
.end method

.method public final h()Lk5/e;
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/q;->o:Lf5/f0;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object v2, p0, Lk5/q;->o:Lf5/f0;

    .line 8
    .line 9
    invoke-static {p0, v0, v2, v1, v2}, Lk5/q;->j(Lk5/q;Lf5/f0;Ljava/util/List;ILjava/lang/Object;)Lk5/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lk5/q;->m:Lk5/v$b;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lk5/v$b;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lk5/v$b;->c()Lf5/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p0, v0, v2, v1, v2}, Lk5/q;->j(Lk5/q;Lf5/f0;Ljava/util/List;ILjava/lang/Object;)Lk5/e;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    iget-object v0, p0, Lk5/q;->n:Lk5/v;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Lk5/v;

    .line 38
    .line 39
    invoke-virtual {p0}, Lk5/q;->a()Lf5/a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lk5/q;->k:Lk5/t;

    .line 44
    .line 45
    iget-object v3, p0, Lk5/q;->l:Lk5/g;

    .line 46
    .line 47
    iget-boolean v4, p0, Lk5/q;->i:Z

    .line 48
    .line 49
    invoke-direct {v0, v1, v2, v3, v4}, Lk5/v;-><init>(Lf5/a;Lk5/t;Lk5/g;Z)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lk5/q;->n:Lk5/v;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0}, Lk5/v;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {v0}, Lk5/v;->c()Lk5/v$b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lk5/q;->m:Lk5/v$b;

    .line 65
    .line 66
    invoke-virtual {p0}, Lk5/q;->isCanceled()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0}, Lk5/v$b;->c()Lf5/f0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0}, Lk5/v$b;->a()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0, v1, v0}, Lk5/q;->i(Lf5/f0;Ljava/util/List;)Lk5/e;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 86
    .line 87
    const-string v1, "Canceled"

    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 94
    .line 95
    const-string v1, "exhausted all routes"

    .line 96
    .line 97
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public final i(Lf5/f0;Ljava/util/List;)Lk5/e;
    .locals 17

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    const-string v0, "route"

    .line 4
    .line 5
    move-object/from16 v11, p1

    .line 6
    .line 7
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11}, Lf5/f0;->a()Lf5/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lf5/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v11}, Lf5/f0;->a()Lf5/a;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lf5/a;->b()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lokhttp3/b;->k:Lokhttp3/b;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v11}, Lf5/f0;->a()Lf5/a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lf5/a;->l()Lf5/w;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lf5/w;->h()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    .line 49
    .line 50
    invoke-virtual {v1}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1, v0}, Lokhttp3/internal/platform/c;->k(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    new-instance v1, Ljava/net/UnknownServiceException;

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "CLEARTEXT communication to "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " not permitted by network security policy"

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-direct {v1, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 90
    .line 91
    const-string v1, "CLEARTEXT communication not enabled for client"

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v0

    .line 97
    :cond_2
    invoke-virtual {v11}, Lf5/f0;->a()Lf5/a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lf5/a;->f()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 106
    .line 107
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_4

    .line 112
    .line 113
    :goto_0
    invoke-virtual {v11}, Lf5/f0;->c()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-virtual/range {p0 .. p1}, Lk5/q;->g(Lf5/f0;)Lf5/b0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :goto_1
    move-object v14, v0

    .line 124
    goto :goto_2

    .line 125
    :cond_3
    const/4 v0, 0x0

    .line 126
    goto :goto_1

    .line 127
    :goto_2
    new-instance v0, Lk5/e;

    .line 128
    .line 129
    iget-object v1, v10, Lk5/q;->a:Lj5/d;

    .line 130
    .line 131
    iget-object v2, v10, Lk5/q;->b:Lk5/p;

    .line 132
    .line 133
    iget v3, v10, Lk5/q;->c:I

    .line 134
    .line 135
    iget v4, v10, Lk5/q;->d:I

    .line 136
    .line 137
    iget v5, v10, Lk5/q;->e:I

    .line 138
    .line 139
    iget v6, v10, Lk5/q;->f:I

    .line 140
    .line 141
    iget v7, v10, Lk5/q;->g:I

    .line 142
    .line 143
    iget-boolean v8, v10, Lk5/q;->h:Z

    .line 144
    .line 145
    iget-object v9, v10, Lk5/q;->l:Lk5/g;

    .line 146
    .line 147
    const/4 v15, -0x1

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    move-object/from16 v12, p2

    .line 152
    .line 153
    invoke-direct/range {v0 .. v16}, Lk5/e;-><init>(Lj5/d;Lk5/p;IIIIIZLk5/g;Lk5/q;Lf5/f0;Ljava/util/List;ILf5/b0;IZ)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :cond_4
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 158
    .line 159
    const-string v1, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 160
    .line 161
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/q;->l:Lk5/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lk5/g;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k()Lk5/s;
    .locals 6

    .line 1
    iget-object v0, p0, Lk5/q;->l:Lk5/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lk5/g;->s()Lk5/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object v2, p0, Lk5/q;->l:Lk5/g;

    .line 12
    .line 13
    invoke-interface {v2}, Lk5/g;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0, v2}, Lk5/o;->p(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    monitor-enter v0

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0}, Lk5/o;->k()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    xor-int/2addr v2, v3

    .line 30
    invoke-virtual {v0, v3}, Lk5/o;->w(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lk5/q;->l:Lk5/g;

    .line 34
    .line 35
    invoke-interface {v3}, Lk5/g;->r()Ljava/net/Socket;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_3

    .line 42
    :cond_1
    invoke-virtual {v0}, Lk5/o;->k()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x0

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Lk5/o;->t()Lf5/f0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Lf5/f0;->a()Lf5/a;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Lf5/a;->l()Lf5/w;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p0, v2}, Lk5/q;->e(Lf5/w;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v2, v3

    .line 69
    move-object v3, v1

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    iget-object v2, p0, Lk5/q;->l:Lk5/g;

    .line 72
    .line 73
    invoke-interface {v2}, Lk5/g;->r()Ljava/net/Socket;

    .line 74
    .line 75
    .line 76
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    move v5, v3

    .line 78
    move-object v3, v2

    .line 79
    move v2, v5

    .line 80
    :goto_1
    monitor-exit v0

    .line 81
    iget-object v4, p0, Lk5/q;->l:Lk5/g;

    .line 82
    .line 83
    invoke-interface {v4}, Lk5/g;->s()Lk5/o;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    if-nez v3, :cond_4

    .line 90
    .line 91
    new-instance v1, Lk5/s;

    .line 92
    .line 93
    invoke-direct {v1, v0}, Lk5/s;-><init>(Lk5/o;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v1, "Check failed."

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v0

    .line 105
    :cond_5
    if-eqz v3, :cond_6

    .line 106
    .line 107
    invoke-static {v3}, Lg5/k;->h(Ljava/net/Socket;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    iget-object v4, p0, Lk5/q;->l:Lk5/g;

    .line 111
    .line 112
    invoke-interface {v4, v0}, Lk5/g;->i(Lf5/j;)V

    .line 113
    .line 114
    .line 115
    iget-object v4, p0, Lk5/q;->l:Lk5/g;

    .line 116
    .line 117
    invoke-interface {v4, v0}, Lk5/g;->e(Lk5/o;)V

    .line 118
    .line 119
    .line 120
    if-eqz v3, :cond_7

    .line 121
    .line 122
    iget-object v2, p0, Lk5/q;->l:Lk5/g;

    .line 123
    .line 124
    invoke-interface {v2, v0}, Lk5/g;->n(Lk5/o;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    if-eqz v2, :cond_8

    .line 129
    .line 130
    iget-object v2, p0, Lk5/q;->l:Lk5/g;

    .line 131
    .line 132
    invoke-interface {v2, v0}, Lk5/g;->u(Lk5/o;)V

    .line 133
    .line 134
    .line 135
    :cond_8
    :goto_2
    return-object v1

    .line 136
    :goto_3
    monitor-exit v0

    .line 137
    throw v1
.end method

.method public final l(Lk5/e;Ljava/util/List;)Lk5/s;
    .locals 6

    .line 1
    iget-object v0, p0, Lk5/q;->b:Lk5/p;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/q;->l:Lk5/g;

    .line 4
    .line 5
    invoke-interface {v1}, Lk5/g;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lk5/q;->a()Lf5/a;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lk5/q;->l:Lk5/g;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lk5/e;->isReady()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    :goto_0
    move v5, v4

    .line 25
    move-object v4, p2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v4, 0x0

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    invoke-virtual/range {v0 .. v5}, Lk5/p;->a(ZLf5/a;Lk5/g;Ljava/util/List;Z)Lk5/o;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1

    .line 37
    :cond_1
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lk5/e;->e()Lf5/f0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lk5/q;->o:Lf5/f0;

    .line 44
    .line 45
    invoke-virtual {p1}, Lk5/e;->i()V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lk5/q;->l:Lk5/g;

    .line 49
    .line 50
    invoke-interface {p1, p2}, Lk5/g;->t(Lf5/j;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lk5/q;->l:Lk5/g;

    .line 54
    .line 55
    invoke-interface {p1, p2}, Lk5/g;->v(Lk5/o;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Lk5/s;

    .line 59
    .line 60
    invoke-direct {p1, p2}, Lk5/s;-><init>(Lk5/o;)V

    .line 61
    .line 62
    .line 63
    return-object p1
.end method

.method public final n(Lk5/o;)Lf5/f0;
    .locals 3

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lk5/o;->l()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lk5/o;->k()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Lk5/o;->t()Lf5/f0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lf5/f0;->a()Lf5/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lf5/a;->l()Lf5/w;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0}, Lk5/q;->a()Lf5/a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lf5/a;->l()Lf5/w;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v2}, Lg5/k;->f(Lf5/w;Lf5/w;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1}, Lk5/o;->t()Lf5/f0;

    .line 45
    .line 46
    .line 47
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    :goto_0
    monitor-exit p1

    .line 49
    return-object v1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    monitor-exit p1

    .line 52
    throw v0
.end method
