.class public final Ln9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/g;


# instance fields
.field public final a:Ln9/n;

.field public final b:Ln9/f;

.field public final c:Lo9/g;


# direct methods
.method public constructor <init>(Ln9/n;Ln9/f;Lo9/g;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "poolConnectionListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "chain"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ln9/a;->a:Ln9/n;

    .line 20
    .line 21
    iput-object p2, p0, Ln9/a;->b:Ln9/f;

    .line 22
    .line 23
    iput-object p3, p0, Ln9/a;->c:Lo9/g;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public a(Li9/f0;Lokhttp3/Protocol;)V
    .locals 3

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {p1}, Li9/f0;->d()Ljava/net/InetSocketAddress;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Li9/f0;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, v1, v2, p1, p2}, Li9/r;->g(Li9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public b(Ln9/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/o;->i()Ln9/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ln9/f;->h(Li9/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "socketHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1, p2}, Li9/r;->l(Li9/e;Ljava/lang/String;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public d(Li9/w;Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proxies"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1, p2}, Li9/r;->o(Li9/e;Li9/w;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public e(Li9/j;Li9/f0;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "route"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ln9/a;->b:Ln9/f;

    .line 12
    .line 13
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2, v1}, Ln9/f;->b(Li9/j;Li9/f0;Li9/e;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public f(Ln9/e;)V
    .locals 1

    .line 1
    const-string v0, "connectPlan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln9/n;->r()Ljava/util/concurrent/CopyOnWriteArrayList;

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

.method public g(Li9/f0;)V
    .locals 1

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln9/n;->l()Li9/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Li9/a0;->u()Ln9/t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Ln9/t;->a(Li9/f0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public h(Li9/j;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Li9/r;->k(Li9/e;Li9/j;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public i(Ln9/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ln9/n;->f(Ln9/o;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/n;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(Ln9/o;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/o;->i()Ln9/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Ln9/f;->e(Li9/j;Li9/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public k(Li9/f0;)V
    .locals 4

    .line 1
    const-string v0, "route"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {p1}, Li9/f0;->d()Ljava/net/InetSocketAddress;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {p1}, Li9/f0;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v0, v1, v2, v3}, Li9/r;->i(Li9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ln9/a;->b:Ln9/f;

    .line 24
    .line 25
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Ln9/f;->d(Li9/f0;Li9/e;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ln9/a;->c:Lo9/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo9/g;->i()Li9/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Li9/b0;->h()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "GET"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public m(Ln9/e;)V
    .locals 1

    .line 1
    const-string v0, "connectPlan"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln9/n;->r()Ljava/util/concurrent/CopyOnWriteArrayList;

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

.method public n(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "socketHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Li9/r;->m(Li9/e;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public o(Li9/w;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Li9/r;->p(Li9/e;Li9/w;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public p(Lokhttp3/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Li9/r;->C(Li9/e;Lokhttp3/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public q(Li9/f0;Lokhttp3/Protocol;Ljava/io/IOException;)V
    .locals 6

    .line 1
    const-string p2, "route"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "e"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 16
    .line 17
    invoke-virtual {p1}, Li9/f0;->d()Ljava/net/InetSocketAddress;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1}, Li9/f0;->b()Ljava/net/Proxy;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v5, p3

    .line 27
    invoke-virtual/range {v0 .. v5}, Li9/r;->h(Li9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Ln9/a;->b:Ln9/f;

    .line 31
    .line 32
    iget-object p3, p0, Ln9/a;->a:Ln9/n;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p3, v5}, Ln9/f;->c(Li9/f0;Li9/e;Ljava/io/IOException;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Li9/r;->D(Li9/e;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public s()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/n;->y()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public t(Ln9/o;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/o;->i()Ln9/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ln9/f;->f(Li9/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public u()Ln9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/n;->m()Ln9/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public v(Ln9/o;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ln9/o;->i()Ln9/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Ln9/f;->g(Li9/j;Li9/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public w(Li9/j;)V
    .locals 2

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ln9/a;->x()Li9/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ln9/a;->a:Ln9/n;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Li9/r;->j(Li9/e;Li9/j;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final x()Li9/r;
    .locals 1

    .line 1
    iget-object v0, p0, Ln9/a;->a:Ln9/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/n;->n()Li9/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
