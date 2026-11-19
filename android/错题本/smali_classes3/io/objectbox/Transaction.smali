.class public Lio/objectbox/Transaction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation build Lio/objectbox/annotation/apihint/Internal;
.end annotation

.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field public final a:J

.field public final b:Lio/objectbox/BoxStore;

.field public final c:Z

.field public d:I

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lio/objectbox/BoxStore;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 5
    .line 6
    iput-wide p2, p0, Lio/objectbox/Transaction;->a:J

    .line 7
    .line 8
    iput p4, p0, Lio/objectbox/Transaction;->d:I

    .line 9
    .line 10
    invoke-virtual {p0, p2, p3}, Lio/objectbox/Transaction;->nativeIsReadOnly(J)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lio/objectbox/Transaction;->c:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/objectbox/Transaction;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Transaction is closed"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final b()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/objectbox/Transaction;->a()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lio/objectbox/Transaction;->a:J

    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Lio/objectbox/Transaction;->nativeCommit(J)[I

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 11
    .line 12
    const-string v2, "TX committed. New commit count: "

    .line 13
    .line 14
    iget-object v3, v1, Lio/objectbox/BoxStore;->p:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v3

    .line 17
    :try_start_0
    iget v4, v1, Lio/objectbox/BoxStore;->q:I

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    add-int/2addr v4, v5

    .line 21
    iput v4, v1, Lio/objectbox/BoxStore;->q:I

    .line 22
    .line 23
    iget-boolean v4, v1, Lio/objectbox/BoxStore;->m:Z

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 28
    .line 29
    new-instance v6, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget v2, v1, Lio/objectbox/BoxStore;->q:I

    .line 35
    .line 36
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", entity types affected: "

    .line 40
    .line 41
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    array-length v2, v0

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_4

    .line 50
    :cond_0
    const/4 v2, 0x0

    .line 51
    :goto_0
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    iget-object v2, v1, Lio/objectbox/BoxStore;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lio/objectbox/a;

    .line 83
    .line 84
    iget-object v3, v3, Lio/objectbox/a;->c:Ljava/lang/ThreadLocal;

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lio/objectbox/Cursor;

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->remove()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget-object v1, v1, Lio/objectbox/BoxStore;->k:Lio/objectbox/f;

    .line 104
    .line 105
    iget-object v2, v1, Lio/objectbox/f;->c:Ljava/util/ArrayDeque;

    .line 106
    .line 107
    monitor-enter v2

    .line 108
    :try_start_1
    iget-object v3, v1, Lio/objectbox/f;->c:Ljava/util/ArrayDeque;

    .line 109
    .line 110
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    iget-boolean v0, v1, Lio/objectbox/f;->d:Z

    .line 114
    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    iput-boolean v5, v1, Lio/objectbox/f;->d:Z

    .line 118
    .line 119
    iget-object v0, v1, Lio/objectbox/f;->a:Lio/objectbox/BoxStore;

    .line 120
    .line 121
    iget-object v0, v0, Lio/objectbox/BoxStore;->j:Lm5/e;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    goto :goto_3

    .line 129
    :cond_4
    :goto_2
    monitor-exit v2

    .line 130
    return-void

    .line 131
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    throw v0

    .line 133
    :cond_5
    return-void

    .line 134
    :goto_4
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    throw v0
.end method

.method public final c(Ljava/lang/Class;)Lio/objectbox/Cursor;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lio/objectbox/Transaction;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 5
    .line 6
    iget-object v1, v0, Lio/objectbox/BoxStore;->e:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lio/objectbox/EntityInfo;

    .line 13
    .line 14
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getCursorFactory()Lm5/a;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-wide v3, p0, Lio/objectbox/Transaction;->a:J

    .line 19
    .line 20
    invoke-interface {v1}, Lio/objectbox/EntityInfo;->getDbName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v3, v4, v1, p1}, Lio/objectbox/Transaction;->nativeCreateCursor(JLjava/lang/String;Ljava/lang/Class;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long p1, v3, v5

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-interface {v2, p0, v3, v4, v0}, Lm5/a;->createCursor(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)Lio/objectbox/Cursor;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_0
    new-instance p1, Lio/objectbox/exception/DbException;

    .line 40
    .line 41
    const-string v0, "Could not create native cursor"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 6

    .line 1
    const-string v0, "Hint: use closeThreadResources() to avoid finalizing recycled transactions"

    .line 2
    .line 3
    const-string v1, "Transaction is still active"

    .line 4
    .line 5
    const-string v2, " (initial commit count: "

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-boolean v3, p0, Lio/objectbox/Transaction;->e:Z

    .line 9
    .line 10
    if-nez v3, :cond_3

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iput-boolean v3, p0, Lio/objectbox/Transaction;->e:Z

    .line 14
    .line 15
    iget-object v3, p0, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 16
    .line 17
    iget-object v4, v3, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 18
    .line 19
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :try_start_1
    iget-object v3, v3, Lio/objectbox/BoxStore;->i:Ljava/util/Set;

    .line 21
    .line 22
    invoke-interface {v3, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :try_start_2
    iget-wide v3, p0, Lio/objectbox/Transaction;->a:J

    .line 27
    .line 28
    invoke-virtual {p0, v3, v4}, Lio/objectbox/Transaction;->nativeIsOwnerThread(J)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    iget-wide v3, p0, Lio/objectbox/Transaction;->a:J

    .line 35
    .line 36
    invoke-virtual {p0, v3, v4}, Lio/objectbox/Transaction;->nativeIsActive(J)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    iget-wide v4, p0, Lio/objectbox/Transaction;->a:J

    .line 41
    .line 42
    invoke-virtual {p0, v4, v5}, Lio/objectbox/Transaction;->nativeIsRecycled(J)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget v2, p0, Lio/objectbox/Transaction;->d:I

    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ")."

    .line 61
    .line 62
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 72
    .line 73
    new-instance v3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 92
    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 111
    .line 112
    .line 113
    :goto_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    .line 116
    .line 117
    .line 118
    :cond_2
    iget-object v0, p0, Lio/objectbox/Transaction;->b:Lio/objectbox/BoxStore;

    .line 119
    .line 120
    iget-boolean v0, v0, Lio/objectbox/BoxStore;->o:Z

    .line 121
    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    iget-wide v0, p0, Lio/objectbox/Transaction;->a:J

    .line 125
    .line 126
    invoke-virtual {p0, v0, v1}, Lio/objectbox/Transaction;->nativeDestroy(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 133
    :cond_3
    :goto_1
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 136
    throw v0
.end method

.method public final finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/Transaction;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public native nativeAbort(J)V
.end method

.method public native nativeCommit(J)[I
.end method

.method public native nativeCreateCursor(JLjava/lang/String;Ljava/lang/Class;)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)J"
        }
    .end annotation
.end method

.method public native nativeDestroy(J)V
.end method

.method public native nativeIsActive(J)Z
.end method

.method public native nativeIsOwnerThread(J)Z
.end method

.method public native nativeIsReadOnly(J)Z
.end method

.method public native nativeIsRecycled(J)Z
.end method

.method public native nativeRecycle(J)V
.end method

.method public native nativeRenew(J)V
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TX "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lio/objectbox/Transaction;->a:J

    .line 9
    .line 10
    const/16 v3, 0x10

    .line 11
    .line 12
    invoke-static {v1, v2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " ("

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-boolean v1, p0, Lio/objectbox/Transaction;->c:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const-string v1, "read-only"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "write"

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", initialCommitCount="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget v1, p0, Lio/objectbox/Transaction;->d:I

    .line 42
    .line 43
    const-string v2, ")"

    .line 44
    .line 45
    invoke-static {v0, v2, v1}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
