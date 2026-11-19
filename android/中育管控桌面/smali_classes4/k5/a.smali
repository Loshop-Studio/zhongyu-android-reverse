.class public final Lk5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk5/g;


# instance fields
.field public final a:Lk5/n;

.field public final b:Lk5/f;

.field public final c:Ll5/g;


# direct methods
.method public constructor <init>(Lk5/n;Lk5/f;Ll5/g;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "poolConnectionListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "chain"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lk5/a;->a:Lk5/n;

    .line 20
    .line 21
    iput-object p2, p0, Lk5/a;->b:Lk5/f;

    .line 22
    .line 23
    iput-object p3, p0, Lk5/a;->c:Ll5/g;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(Lf5/w;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lf5/r;->p(Lf5/e;Lf5/w;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b(Lk5/e;)V
    .locals 1

    .line 1
    const-string v0, "connectPlan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/n;->r()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "socketHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1, p2}, Lf5/r;->l(Lf5/e;Ljava/lang/String;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public d(Lf5/f0;Lokhttp3/Protocol;Ljava/io/IOException;)V
    .locals 6

    .line 1
    const-string p2, "route"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "e"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 16
    .line 17
    invoke-virtual {p1}, Lf5/f0;->d()Ljava/net/InetSocketAddress;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1}, Lf5/f0;->b()Ljava/net/Proxy;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v5, p3

    .line 27
    invoke-virtual/range {v0 .. v5}, Lf5/r;->h(Lf5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lk5/a;->b:Lk5/f;

    .line 31
    .line 32
    iget-object p3, p0, Lk5/a;->a:Lk5/n;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p3, v5}, Lk5/f;->c(Lf5/f0;Lf5/e;Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public e(Lk5/o;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lk5/o;->i()Lk5/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lk5/f;->g(Lf5/j;Lf5/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public f(Lf5/f0;)V
    .locals 1

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/n;->l()Lf5/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lf5/a0;->u()Lk5/t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Lk5/t;->a(Lf5/f0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public g(Lf5/w;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proxies"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1, p2}, Lf5/r;->o(Lf5/e;Lf5/w;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public h(Lf5/f0;)V
    .locals 4

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {p1}, Lf5/f0;->d()Ljava/net/InetSocketAddress;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Lf5/f0;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0, v1, v2, v3}, Lf5/r;->i(Lf5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lk5/a;->b:Lk5/f;

    .line 24
    .line 25
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Lk5/f;->d(Lf5/f0;Lf5/e;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public i(Lf5/j;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lf5/r;->k(Lf5/e;Lf5/j;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/n;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(Lk5/e;)V
    .locals 1

    .line 1
    const-string v0, "connectPlan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk5/n;->r()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/a;->c:Ll5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll5/g;->i()Lf5/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lf5/b0;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "GET"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    xor-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    return v0
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "socketHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lf5/r;->m(Lf5/e;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public m(Lokhttp3/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lf5/r;->C(Lf5/e;Lokhttp3/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public n(Lk5/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lk5/o;->i()Lk5/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lk5/f;->f(Lf5/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public o(Lf5/f0;Lokhttp3/Protocol;)V
    .locals 3

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {p1}, Lf5/f0;->d()Ljava/net/InetSocketAddress;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Lf5/f0;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, v1, v2, p1, p2}, Lf5/r;->g(Lf5/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public p(Lf5/j;Lf5/f0;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "route"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lk5/a;->b:Lk5/f;

    .line 12
    .line 13
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, v1}, Lk5/f;->b(Lf5/j;Lf5/f0;Lf5/e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lf5/r;->D(Lf5/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public r()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/n;->y()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public s()Lk5/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/n;->m()Lk5/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public t(Lf5/j;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk5/a;->x()Lf5/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lf5/r;->j(Lf5/e;Lf5/j;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public u(Lk5/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lk5/o;->i()Lk5/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lk5/f;->h(Lf5/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public v(Lk5/o;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lk5/o;->i()Lk5/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lk5/a;->a:Lk5/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lk5/f;->e(Lf5/j;Lf5/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public w(Lk5/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lk5/n;->e(Lk5/o;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x()Lf5/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/a;->a:Lk5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/n;->n()Lf5/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
