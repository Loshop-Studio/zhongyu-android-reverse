.class public final Lcoil3/disk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Z

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/AutoCloseable;


# direct methods
.method public constructor <init>(Lcoil3/disk/f;Lcoil3/disk/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    iput-object p2, p0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 2
    new-array p1, p1, [Z

    iput-object p1, p0, Lcoil3/disk/b;->a:[Z

    return-void
.end method

.method public constructor <init>(Lw/d;Lw/c;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 4
    iput-object p2, p0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 5
    iget-boolean p2, p2, Lw/c;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 6
    :cond_0
    iget p1, p1, Lw/d;->g:I

    .line 7
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lcoil3/disk/b;->a:[Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 2
    .line 3
    check-cast v0, Lw/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p0, v1}, Lw/d;->a(Lw/d;Lcoil3/disk/b;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 2
    .line 3
    check-cast v0, Lcoil3/disk/f;

    .line 4
    .line 5
    iget-object v1, v0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, p0, Lcoil3/disk/b;->b:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcoil3/disk/c;

    .line 15
    .line 16
    iget-object v2, v2, Lcoil3/disk/c;->g:Lcoil3/disk/b;

    .line 17
    .line 18
    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-static {v0, p0, p1}, Lcoil3/disk/f;->a(Lcoil3/disk/f;Lcoil3/disk/b;Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcoil3/disk/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v1

    .line 34
    return-void

    .line 35
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 36
    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :goto_1
    monitor-exit v1

    .line 44
    throw p1
.end method

.method public c(I)Lokio/Path;
    .locals 4

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 2
    .line 3
    check-cast v0, Lcoil3/disk/f;

    .line 4
    .line 5
    iget-object v1, v0, Lcoil3/disk/f;->h:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, p0, Lcoil3/disk/b;->b:Z

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lcoil3/disk/b;->a:[Z

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aput-boolean v3, v2, p1

    .line 16
    .line 17
    iget-object v2, p0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcoil3/disk/c;

    .line 20
    .line 21
    iget-object v2, v2, Lcoil3/disk/c;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, v0, Lcoil3/disk/f;->q:Lcoil3/disk/e;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Lokio/Path;

    .line 31
    .line 32
    invoke-static {v0, v2}, Lv7/l;->f(Lokio/FileSystem;Lokio/Path;)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Lokio/Path;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit v1

    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_1
    const-string p1, "editor is closed"

    .line 42
    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    :goto_0
    monitor-exit v1

    .line 50
    throw p1
.end method

.method public d()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 2
    .line 3
    check-cast v0, Lw/d;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcoil3/disk/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lw/c;

    .line 9
    .line 10
    iget-object v2, v1, Lw/c;->f:Lcoil3/disk/b;

    .line 11
    .line 12
    if-ne v2, p0, :cond_2

    .line 13
    .line 14
    iget-boolean v2, v1, Lw/c;->e:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcoil3/disk/b;->a:[Z

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    aput-boolean v4, v2, v3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object v1, v1, Lw/c;->d:[Ljava/io/File;

    .line 28
    .line 29
    aget-object v1, v1, v3

    .line 30
    .line 31
    iget-object v2, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 32
    .line 33
    check-cast v2, Lw/d;

    .line 34
    .line 35
    iget-object v2, v2, Lw/d;->a:Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-object v2, p0, Lcoil3/disk/b;->d:Ljava/lang/AutoCloseable;

    .line 44
    .line 45
    check-cast v2, Lw/d;

    .line 46
    .line 47
    iget-object v2, v2, Lw/d;->a:Ljava/io/File;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 50
    .line 51
    .line 52
    :cond_1
    monitor-exit v0

    .line 53
    return-object v1

    .line 54
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw v1
.end method
