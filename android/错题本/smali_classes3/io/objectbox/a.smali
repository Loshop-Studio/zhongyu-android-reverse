.class public final Lio/objectbox/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/objectbox/BoxStore;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/ThreadLocal;

.field public final d:Ljava/lang/ThreadLocal;

.field public final e:Lm5/b;


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
    iget-object p1, p1, Lio/objectbox/BoxStore;->e:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lio/objectbox/EntityInfo;

    .line 29
    .line 30
    invoke-interface {p1}, Lio/objectbox/EntityInfo;->getIdGetter()Lm5/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lio/objectbox/a;->e:Lm5/b;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(Lio/objectbox/Cursor;)V
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
    invoke-virtual {p1}, Lio/objectbox/Transaction;->b()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lio/objectbox/Transaction;->close()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b()Lio/objectbox/Cursor;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iget-object v0, v0, Lio/objectbox/BoxStore;->n:Ljava/lang/ThreadLocal;

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
    iget-boolean v1, v0, Lio/objectbox/Transaction;->e:Z

    .line 14
    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lio/objectbox/Cursor;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-boolean v2, v2, Lio/objectbox/Transaction;->e:Z

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object v1

    .line 37
    :cond_1
    :goto_0
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->c(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "Active TX is closed"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    const/4 v0, 0x0

    .line 58
    return-object v0
.end method

.method public final c()Lio/objectbox/Cursor;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

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
    iget-boolean v2, v1, Lio/objectbox/Transaction;->e:Z

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Lio/objectbox/Transaction;->a()V

    .line 25
    .line 26
    .line 27
    iget-wide v2, v1, Lio/objectbox/Transaction;->a:J

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Lio/objectbox/Transaction;->nativeIsRecycled(J)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Lio/objectbox/Transaction;->a()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 39
    .line 40
    iget v2, v2, Lio/objectbox/BoxStore;->q:I

    .line 41
    .line 42
    iput v2, v1, Lio/objectbox/Transaction;->d:I

    .line 43
    .line 44
    iget-wide v2, v1, Lio/objectbox/Transaction;->a:J

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Lio/objectbox/Transaction;->nativeRenew(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lio/objectbox/Cursor;->renew()V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v1, "Illegal reader TX state"

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_2
    iget-object v0, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 62
    .line 63
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->a()Lio/objectbox/Transaction;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->c(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, Lio/objectbox/a;->d:Ljava/lang/ThreadLocal;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method

.method public final d()Lio/objectbox/Cursor;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->b()Lio/objectbox/Cursor;

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
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->b()Lio/objectbox/Transaction;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lio/objectbox/Transaction;->c(Ljava/lang/Class;)Lio/objectbox/Cursor;

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

.method public final e(Ljava/lang/Object;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    invoke-virtual {p0, v0}, Lio/objectbox/a;->a(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 13
    .line 14
    .line 15
    return-wide v1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public final f(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lio/objectbox/Cursor;->put(Ljava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->a(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final g()Lio/objectbox/query/QueryBuilder;
    .locals 5

    .line 1
    new-instance v0, Lio/objectbox/query/QueryBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    iget-wide v2, v1, Lio/objectbox/BoxStore;->b:J

    .line 6
    .line 7
    iget-object v4, p0, Lio/objectbox/a;->b:Ljava/lang/Class;

    .line 8
    .line 9
    iget-object v1, v1, Lio/objectbox/BoxStore;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, p0, v2, v3, v1}, Lio/objectbox/query/QueryBuilder;-><init>(Lio/objectbox/a;JLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final h(Lio/objectbox/Cursor;)V
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
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lio/objectbox/Cursor;->getTx()Lio/objectbox/Transaction;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-boolean v0, p1, Lio/objectbox/Transaction;->e:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/objectbox/Transaction;->a()V

    .line 18
    .line 19
    .line 20
    iget-wide v0, p1, Lio/objectbox/Transaction;->a:J

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Lio/objectbox/Transaction;->nativeIsRecycled(J)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-boolean v0, p1, Lio/objectbox/Transaction;->c:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Lio/objectbox/Transaction;->a()V

    .line 33
    .line 34
    .line 35
    iget-wide v0, p1, Lio/objectbox/Transaction;->a:J

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lio/objectbox/Transaction;->nativeRecycle(J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "Illegal reader TX state"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    return-void
.end method

.method public final i(Lio/objectbox/Cursor;)V
    .locals 3

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
    iget-boolean v1, v0, Lio/objectbox/Transaction;->e:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/objectbox/Cursor;->close()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lio/objectbox/Transaction;->a()V

    .line 21
    .line 22
    .line 23
    iget-wide v1, v0, Lio/objectbox/Transaction;->a:J

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lio/objectbox/Transaction;->nativeAbort(J)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lio/objectbox/Transaction;->close()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    invoke-virtual {p0, v0}, Lio/objectbox/a;->a(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public final k(Ljava/util/List;)V
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
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    invoke-virtual {p0, v0}, Lio/objectbox/a;->a(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :goto_1
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    :goto_2
    return-void
.end method

.method public final l(J)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/a;->d()Lio/objectbox/Cursor;

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
    invoke-virtual {p0, v0}, Lio/objectbox/a;->a(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 13
    .line 14
    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p0, v0}, Lio/objectbox/a;->i(Lio/objectbox/Cursor;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method
