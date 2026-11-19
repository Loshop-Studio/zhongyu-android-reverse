.class public final Ln/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/r;


# instance fields
.field public final a:Lokio/Path;

.field public final b:Lokio/FileSystem;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/AutoCloseable;

.field public final e:Ln/r$a;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public h:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln/q;->a:Lokio/Path;

    .line 5
    .line 6
    iput-object p2, p0, Ln/q;->b:Lokio/FileSystem;

    .line 7
    .line 8
    iput-object p3, p0, Ln/q;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ln/q;->d:Ljava/lang/AutoCloseable;

    .line 11
    .line 12
    iput-object p5, p0, Ln/q;->e:Ln/r$a;

    .line 13
    .line 14
    new-instance p1, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ln/q;->f:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ln/q;->g:Z

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
    const-string v1, "closed"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln/q;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ln/q;->g:Z

    .line 6
    .line 7
    iget-object v1, p0, Ln/q;->h:Lokio/BufferedSource;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lcoil3/util/c;->h(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    iget-object v1, p0, Ln/q;->d:Ljava/lang/AutoCloseable;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Lcoil3/util/c;->i(Ljava/lang/AutoCloseable;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v0

    .line 29
    throw v1
.end method

.method public e()Lokio/Path;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln/q;->f()Lokio/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public f()Lokio/Path;
    .locals 2

    .line 1
    iget-object v0, p0, Ln/q;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ln/q;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ln/q;->a:Lokio/Path;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0

    .line 13
    throw v1
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ln/q;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFileSystem()Lokio/FileSystem;
    .locals 1

    .line 1
    iget-object v0, p0, Ln/q;->b:Lokio/FileSystem;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMetadata()Ln/r$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ln/q;->e:Ln/r$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 3

    .line 1
    iget-object v0, p0, Ln/q;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ln/q;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ln/q;->h:Lokio/BufferedSource;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ln/q;->getFileSystem()Lokio/FileSystem;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Ln/q;->a:Lokio/Path;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lokio/FileSystem;->source(Lokio/Path;)Lokio/Source;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Ln/q;->h:Lokio/BufferedSource;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    monitor-exit v0

    .line 33
    throw v1
.end method
