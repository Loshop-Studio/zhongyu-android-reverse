.class public final Ln1/c;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRecord$OnRecordPositionUpdateListener;


# instance fields
.field public a:Lcom/blankj/utilcode/util/h;

.field public b:[B

.field public c:Ljava/io/FileOutputStream;

.field public d:Ljava/util/List;


# virtual methods
.method public final a()I
    .locals 5

    .line 1
    iget-object v0, p0, Ln1/c;->b:[B

    .line 2
    .line 3
    iget-object v1, p0, Ln1/c;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-lez v2, :cond_1

    .line 11
    .line 12
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ln1/b;

    .line 17
    .line 18
    iget-object v2, v1, Ln1/b;->a:[S

    .line 19
    .line 20
    iget v1, v1, Ln1/b;->b:I

    .line 21
    .line 22
    invoke-static {v2, v2, v1, v0}, Lcom/stormdzh/lame4android/Lame;->encode([S[SI[B)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-lez v2, :cond_0

    .line 27
    .line 28
    :try_start_0
    iget-object v4, p0, Ln1/c;->c:Ljava/io/FileOutputStream;

    .line 29
    .line 30
    invoke-virtual {v4, v0, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return v1

    .line 34
    :catch_0
    move-exception v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return v1

    .line 39
    :cond_1
    return v3
.end method

.method public final onMarkerReached(Landroid/media/AudioRecord;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onPeriodicNotification(Landroid/media/AudioRecord;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ln1/c;->a()I

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final declared-synchronized start()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Thread;->start()V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/blankj/utilcode/util/h;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/h;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    iput-object p0, v0, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v0, p0, Ln1/c;->a:Lcom/blankj/utilcode/util/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method
