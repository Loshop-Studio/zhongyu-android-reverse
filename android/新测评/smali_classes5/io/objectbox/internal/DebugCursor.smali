.class public Lio/objectbox/internal/DebugCursor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lio/objectbox/Transaction;

.field public final b:J

.field public c:Z


# direct methods
.method public static native nativeCreate(J)J
.end method

.method public static native nativeDestroy(J)V
.end method

.method public static native nativeGet(J[B)[B
.end method

.method public static native nativeSeekOrNext(J[B)[B
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/objectbox/internal/DebugCursor;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lio/objectbox/internal/DebugCursor;->c:Z

    .line 8
    .line 9
    iget-object v0, p0, Lio/objectbox/internal/DebugCursor;->a:Lio/objectbox/Transaction;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/objectbox/Transaction;->j()Lio/objectbox/BoxStore;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->isClosed()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-wide v0, p0, Lio/objectbox/internal/DebugCursor;->b:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Lio/objectbox/internal/DebugCursor;->nativeDestroy(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
.end method

.method public finalize()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/objectbox/internal/DebugCursor;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/objectbox/internal/DebugCursor;->close()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
