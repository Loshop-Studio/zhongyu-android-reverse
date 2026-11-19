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
.field public final a:Lio/objectbox/a;

.field public final b:Lio/objectbox/BoxStore;

.field public final c:I

.field public d:J


# direct methods
.method public constructor <init>(Lio/objectbox/a;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/query/Query;->a:Lio/objectbox/a;

    .line 5
    .line 6
    iget-object p1, p1, Lio/objectbox/a;->a:Lio/objectbox/BoxStore;

    .line 7
    .line 8
    iput-object p1, p0, Lio/objectbox/query/Query;->b:Lio/objectbox/BoxStore;

    .line 9
    .line 10
    iget p1, p1, Lio/objectbox/BoxStore;->r:I

    .line 11
    .line 12
    iput p1, p0, Lio/objectbox/query/Query;->c:I

    .line 13
    .line 14
    iput-wide p2, p0, Lio/objectbox/query/Query;->d:J

    .line 15
    .line 16
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lio/objectbox/query/Query;->b:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iget-wide v1, v0, Lio/objectbox/BoxStore;->b:J

    .line 4
    .line 5
    iget v3, p0, Lio/objectbox/query/Query;->c:I

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    if-ne v3, v4, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lio/objectbox/BoxStore;->d(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    if-lt v3, v4, :cond_2

    .line 16
    .line 17
    const/16 v5, 0xa

    .line 18
    .line 19
    int-to-long v5, v5

    .line 20
    const/4 v7, 0x0

    .line 21
    :goto_0
    if-gt v4, v3, :cond_1

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v0, p1}, Lio/objectbox/BoxStore;->d(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Lio/objectbox/exception/DbException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception v7

    .line 29
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeDiagnose(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    new-instance v9, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v10, " of "

    .line 42
    .line 43
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v10, " attempts of calling a read TX failed:"

    .line 50
    .line 51
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    sget-object v10, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 59
    .line 60
    invoke-virtual {v10, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    sget-object v9, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 67
    .line 68
    invoke-virtual {v9, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v8, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 72
    .line 73
    invoke-virtual {v8}, Ljava/io/PrintStream;->flush()V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v2}, Lio/objectbox/BoxStore;->nativeCleanStaleReadTransactions(J)I

    .line 83
    .line 84
    .line 85
    :try_start_1
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    .line 87
    .line 88
    const-wide/16 v8, 0x2

    .line 89
    .line 90
    mul-long/2addr v5, v8

    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_1
    move-exception p1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    throw v7

    .line 99
    :cond_1
    throw v7

    .line 100
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string v0, "Illegal value of attempts: "

    .line 103
    .line 104
    invoke-static {v3, v0}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1
.end method

.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lo5/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lo5/a;-><init>(Ljava/io/Closeable;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lo5/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lo5/a;-><init>(Ljava/io/Closeable;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lio/objectbox/query/Query;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lio/objectbox/query/Query;->d:J

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
    iput-wide v2, p0, Lio/objectbox/query/Query;->d:J

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

.method public final finalize()V
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

.method public native nativeFindUnique(JJ)Ljava/lang/Object;
.end method
