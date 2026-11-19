.class public Lio/objectbox/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/objectbox/BoxStore;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/ThreadLocal;

.field public final d:Ljava/lang/ThreadLocal;

.field public final e:Ln6/c;


# direct methods
.method public constructor <init>(Lio/objectbox/BoxStore;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 17
    .line 18
    iput-object p1, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 19
    .line 20
    iput-object p2, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lio/objectbox/BoxStore;->r(Ljava/lang/Class;)Lio/objectbox/EntityInfo;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lio/objectbox/EntityInfo;->getIdGetter()Ln6/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lio/objectbox/a;->e:Ln6/c;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/objectbox/Cursor;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/objectbox/Cursor;->close()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public b(Lio/objectbox/Cursor;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/objectbox/Cursor;->close()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lio/objectbox/Transaction;->d()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public c(J)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->f()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lio/objectbox/Cursor;->get(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public d()Lio/objectbox/Cursor;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iget-object v0, v0, Lio/objectbox/BoxStore;->p:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lio/objectbox/Transaction;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/objectbox/Transaction;->isClosed()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lio/objectbox/Cursor;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lio/objectbox/Transaction;->isClosed()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v1

    .line 41
    :cond_1
    :goto_0
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->e(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "Active TX is closed"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Lio/objectbox/Cursor;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    iget-object v0, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lio/objectbox/Cursor;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v1, v0, Lio/objectbox/Cursor;->tx:Lio/objectbox/Transaction;

    .line 19
    .line 20
    invoke-virtual {v1}, Lio/objectbox/Transaction;->isClosed()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/objectbox/Transaction;->h()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Lio/objectbox/Transaction;->j()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lio/objectbox/Cursor;->renew()V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "Illegal reader TX state"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 48
    .line 49
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->b()Lio/objectbox/Transaction;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->e(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method

.method public g()Lio/objectbox/BoxStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lio/objectbox/Cursor;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 9
    .line 10
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->c()Lio/objectbox/Transaction;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->e(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object v0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 23
    .line 24
    .line 25
    throw v1
.end method

.method public i(Ln6/a;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->f()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0}, Lio/objectbox/Cursor;->internalHandle()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-interface {p1, v1, v2}, Ln6/a;->a(J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public j(ILio/objectbox/Property;J)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->f()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1, p2, p3, p4}, Lio/objectbox/Cursor;->getBacklinkEntities(ILio/objectbox/Property;J)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-virtual {p0, v0}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public k(IIJZ)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->f()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    move v2, p1

    .line 6
    move v3, p2

    .line 7
    move-wide v4, p3

    .line 8
    move v6, p5

    .line 9
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lio/objectbox/Cursor;->getRelationEntities(IIJZ)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {p0, v1}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    move-object p1, v0

    .line 19
    invoke-virtual {p0, v1}, Lio/objectbox/a;->p(Lio/objectbox/Cursor;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public l(Ljava/lang/Object;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->h()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p0, v0}, Lio/objectbox/a;->b(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 13
    .line 14
    .line 15
    return-wide v1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public m(Ljava/util/Collection;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lio/objectbox/a;->h()Lio/objectbox/Cursor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->b(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    :goto_2
    return-void
.end method

.method public n()Lio/objectbox/query/QueryBuilder;
    .locals 5

    .line 1
    new-instance v0, Lio/objectbox/query/QueryBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    invoke-virtual {v1}, Lio/objectbox/BoxStore;->v()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 10
    .line 11
    iget-object v4, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lio/objectbox/BoxStore;->p(Ljava/lang/Class;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v0, p0, v1, v2, v3}, Lio/objectbox/query/QueryBuilder;-><init>(Lio/objectbox/a;JLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public o(Lio/objectbox/Transaction;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/objectbox/Cursor;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v1, p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/objectbox/Cursor;->close()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public p(Lio/objectbox/Cursor;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lio/objectbox/Transaction;->isClosed()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/objectbox/Transaction;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/objectbox/Transaction;->isReadOnly()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lio/objectbox/Transaction;->i()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "Illegal reader TX state"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    return-void
.end method

.method public q(Lio/objectbox/Cursor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lio/objectbox/Transaction;->isClosed()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lio/objectbox/Cursor;->close()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lio/objectbox/Transaction;->a()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public r(Ljava/util/Collection;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lio/objectbox/a;->h()Lio/objectbox/Cursor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lio/objectbox/Cursor;->getId(Ljava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Lio/objectbox/Cursor;->deleteEntity(J)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->b(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    :goto_2
    return-void
.end method

.method public s(J)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->h()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lio/objectbox/Cursor;->deleteEntity(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, v0}, Lio/objectbox/a;->b(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 13
    .line 14
    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public t(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->h()Lio/objectbox/Cursor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {v0, p1}, Lio/objectbox/Cursor;->getId(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lio/objectbox/Cursor;->deleteEntity(J)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, v0}, Lio/objectbox/a;->b(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 17
    .line 18
    .line 19
    return p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    invoke-virtual {p0, v0}, Lio/objectbox/a;->q(Lio/objectbox/Cursor;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public u(Lio/objectbox/Transaction;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lio/objectbox/Cursor;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lio/objectbox/Cursor;->close()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
