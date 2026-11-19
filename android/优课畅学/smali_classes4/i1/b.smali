.class public Li1/b;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRecord$OnRecordPositionUpdateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/b$b;,
        Li1/b$a;
    }
.end annotation


# instance fields
.field public a:Li1/b$a;

.field public b:[B

.field public c:Ljava/io/FileOutputStream;

.field public d:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/io/File;I)V
    .locals 2

    .line 1
    const-string v0, "DataEncodeThread"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li1/b;->d:Ljava/util/List;

    .line 16
    .line 17
    new-instance v0, Ljava/io/FileOutputStream;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 23
    .line 24
    mul-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    int-to-double p1, p2

    .line 27
    const-wide/high16 v0, 0x3ff4000000000000L    # 1.25

    .line 28
    .line 29
    mul-double/2addr p1, v0

    .line 30
    const-wide v0, 0x40bc200000000000L    # 7200.0

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    add-double/2addr p1, v0

    .line 36
    double-to-int p1, p1

    .line 37
    new-array p1, p1, [B

    .line 38
    .line 39
    iput-object p1, p0, Li1/b;->b:[B

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic a(Li1/b;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Li1/b;->g()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(Li1/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li1/b;->f()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()Li1/b$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li1/b;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li1/b;->a:Li1/b$a;

    .line 5
    .line 6
    return-object v0
.end method

.method public c([SI)V
    .locals 2

    .line 1
    iget-object v0, p0, Li1/b;->d:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Li1/b$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Li1/b$b;-><init>(Li1/b;[SI)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Li1/b;->a:Li1/b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw v0
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Li1/b;->b:[B

    .line 2
    .line 3
    invoke-static {v0}, Lcom/stormdzh/lame4android/Lame;->flush([B)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 10
    .line 11
    iget-object v2, p0, Li1/b;->b:[B

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v2, v3, v0}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_2

    .line 29
    :catch_1
    move-exception v0

    .line 30
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    .line 43
    .line 44
    :cond_0
    :goto_1
    invoke-static {}, Lcom/stormdzh/lame4android/Lame;->close()V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :goto_2
    iget-object v1, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :catch_2
    move-exception v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_3
    invoke-static {}, Lcom/stormdzh/lame4android/Lame;->close()V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    :goto_4
    iget-object v0, p0, Li1/b;->d:Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final g()I
    .locals 5

    .line 1
    iget-object v0, p0, Li1/b;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Li1/b;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Li1/b$b;

    .line 17
    .line 18
    invoke-virtual {v0}, Li1/b$b;->a()[S

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0}, Li1/b$b;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v3, p0, Li1/b;->b:[B

    .line 27
    .line 28
    invoke-static {v2, v2, v0, v3}, Lcom/stormdzh/lame4android/Lame;->encode([S[SI[B)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-lez v2, :cond_0

    .line 33
    .line 34
    :try_start_0
    iget-object v3, p0, Li1/b;->c:Ljava/io/FileOutputStream;

    .line 35
    .line 36
    iget-object v4, p0, Li1/b;->b:[B

    .line 37
    .line 38
    invoke-virtual {v3, v4, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return v0

    .line 42
    :catch_0
    move-exception v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return v0

    .line 47
    :cond_1
    return v1
.end method

.method public onMarkerReached(Landroid/media/AudioRecord;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onPeriodicNotification(Landroid/media/AudioRecord;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li1/b;->g()I

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized start()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Thread;->start()V

    .line 3
    .line 4
    .line 5
    new-instance v0, Li1/b$a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1, p0}, Li1/b$a;-><init>(Landroid/os/Looper;Li1/b;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Li1/b;->a:Li1/b$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v0
.end method
