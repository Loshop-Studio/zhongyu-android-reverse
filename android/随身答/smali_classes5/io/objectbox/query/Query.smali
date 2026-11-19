.class public Lio/objectbox/query/Query;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;"
    }
.end annotation


# instance fields
.field public final a:Lb8/a;

.field public final b:Lio/objectbox/BoxStore;

.field public final c:Le8/j;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Comparator;

.field public final f:I

.field public g:J


# direct methods
.method public constructor <init>(Lb8/a;JLjava/util/List;Le8/f;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/query/Query;->a:Lb8/a;

    .line 5
    .line 6
    invoke-virtual {p1}, Lb8/a;->g()Lio/objectbox/BoxStore;

    .line 7
    .line 8
    .line 9
    move-result-object p5

    .line 10
    iput-object p5, p0, Lio/objectbox/query/Query;->b:Lio/objectbox/BoxStore;

    .line 11
    .line 12
    invoke-virtual {p5}, Lio/objectbox/BoxStore;->A()I

    .line 13
    .line 14
    .line 15
    move-result p5

    .line 16
    iput p5, p0, Lio/objectbox/query/Query;->f:I

    .line 17
    .line 18
    iput-wide p2, p0, Lio/objectbox/query/Query;->g:J

    .line 19
    .line 20
    new-instance p2, Le8/j;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1}, Le8/j;-><init>(Lio/objectbox/query/Query;Lb8/a;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lio/objectbox/query/Query;->c:Le8/j;

    .line 26
    .line 27
    iput-object p4, p0, Lio/objectbox/query/Query;->d:Ljava/util/List;

    .line 28
    .line 29
    iput-object p6, p0, Lio/objectbox/query/Query;->e:Ljava/util/Comparator;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic a(Lio/objectbox/query/Query;JJ)Ljava/util/List;
    .locals 9

    .line 1
    iget-wide v1, p0, Lio/objectbox/query/Query;->g:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/objectbox/query/Query;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    move-object v0, p0

    .line 8
    move-wide v5, p1

    .line 9
    move-wide v7, p3

    .line 10
    invoke-virtual/range {v0 .. v8}, Lio/objectbox/query/Query;->nativeFind(JJJJ)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v0, p0}, Lio/objectbox/query/Query;->t(Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public static synthetic c(Lio/objectbox/query/Query;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/objectbox/query/Query;->g:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/objectbox/query/Query;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Lio/objectbox/query/Query;->nativeFindUnique(JJ)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->q(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static synthetic g(Lio/objectbox/query/Query;J)Ljava/lang/Long;
    .locals 2

    .line 1
    iget-wide v0, p0, Lio/objectbox/query/Query;->g:J

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1, p1, p2}, Lio/objectbox/query/Query;->nativeCount(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic h(Lio/objectbox/query/Query;)Ljava/util/List;
    .locals 9

    .line 1
    iget-wide v1, p0, Lio/objectbox/query/Query;->g:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/objectbox/query/Query;->j()J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const-wide/16 v5, 0x0

    .line 8
    .line 9
    const-wide/16 v7, 0x0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    invoke-virtual/range {v0 .. v8}, Lio/objectbox/query/Query;->nativeFind(JJJJ)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lio/objectbox/query/Query;->t(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lio/objectbox/query/Query;->e:Ljava/util/Comparator;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object p0
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lio/objectbox/query/Query;->g:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    iput-wide v2, p0, Lio/objectbox/query/Query;->g:J

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Lio/objectbox/query/Query;->nativeDestroy(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public count()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/Query;->l()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/query/Query;->a:Lb8/a;

    .line 5
    .line 6
    new-instance v1, Le8/c;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Le8/c;-><init>(Lio/objectbox/query/Query;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lb8/a;->i(Lc8/a;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Long;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/Query;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public i(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iget v1, p0, Lio/objectbox/query/Query;->f:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, p1, v1, v2, v3}, Lio/objectbox/BoxStore;->j(Ljava/util/concurrent/Callable;IIZ)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->a:Lb8/a;

    .line 2
    .line 3
    invoke-static {v0}, Lb8/d;->a(Lb8/a;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->e:Ljava/util/Comparator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Does not work with a sorting comparator. Only find() supports sorting with a comparator."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/Query;->l()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/objectbox/query/Query;->k()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public n()Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Le8/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le8/e;-><init>(Lio/objectbox/query/Query;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->i(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/List;

    .line 11
    .line 12
    return-object v0
.end method

.method public native nativeCount(JJ)J
.end method

.method public native nativeDescribeParameters(J)Ljava/lang/String;
.end method

.method public native nativeDestroy(J)V
.end method

.method public native nativeFind(JJJJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJJ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public native nativeFindFirst(JJ)Ljava/lang/Object;
.end method

.method public native nativeFindIds(JJJJ)[J
.end method

.method public native nativeFindUnique(JJ)Ljava/lang/Object;
.end method

.method public native nativeRemove(JJ)J
.end method

.method public native nativeSetParameter(JIILjava/lang/String;D)V
.end method

.method public native nativeSetParameter(JIILjava/lang/String;J)V
.end method

.method public native nativeSetParameter(JIILjava/lang/String;Ljava/lang/String;)V
.end method

.method public native nativeSetParameter(JIILjava/lang/String;[B)V
.end method

.method public native nativeSetParameters(JIILjava/lang/String;DD)V
.end method

.method public native nativeSetParameters(JIILjava/lang/String;JJ)V
.end method

.method public native nativeSetParameters(JIILjava/lang/String;[I)V
.end method

.method public native nativeSetParameters(JIILjava/lang/String;[J)V
.end method

.method public native nativeSetParameters(JIILjava/lang/String;[Ljava/lang/String;)V
.end method

.method public native nativeToString(J)Ljava/lang/String;
.end method

.method public o(JJ)Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/Query;->m()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le8/b;

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-wide v2, p1

    .line 8
    move-wide v4, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Le8/b;-><init>(Lio/objectbox/query/Query;JJ)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->i(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    return-object p1
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/objectbox/query/Query;->l()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le8/d;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Le8/d;-><init>(Lio/objectbox/query/Query;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->i(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public q(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->d:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p0, p1, v1}, Lio/objectbox/query/Query;->r(Ljava/lang/Object;Le8/a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public r(Ljava/lang/Object;Le8/a;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/objectbox/query/Query;->d:Ljava/util/List;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public s(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/objectbox/query/Query;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lq/a;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public t(Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->d:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p0, v1, v0}, Lio/objectbox/query/Query;->s(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public u()Lf8/g;
    .locals 4

    .line 1
    new-instance v0, Lf8/g;

    .line 2
    .line 3
    iget-object v1, p0, Lio/objectbox/query/Query;->c:Le8/j;

    .line 4
    .line 5
    iget-object v2, p0, Lio/objectbox/query/Query;->a:Lb8/a;

    .line 6
    .line 7
    invoke-virtual {v2}, Lb8/a;->g()Lio/objectbox/BoxStore;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lio/objectbox/BoxStore;->C()Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, v1, v3, v2}, Lf8/g;-><init>(Lf8/b;Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
