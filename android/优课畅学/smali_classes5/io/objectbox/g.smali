.class public Lio/objectbox/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lio/objectbox/BoxStore;

.field public final b:Lorg/greenrobot/essentials/collections/MultimapSet;

.field public final c:Ljava/util/Deque;

.field public volatile d:Z


# direct methods
.method public constructor <init>(Lio/objectbox/BoxStore;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/greenrobot/essentials/collections/MultimapSet$SetType;->b:Lorg/greenrobot/essentials/collections/MultimapSet$SetType;

    .line 5
    .line 6
    invoke-static {v0}, Lorg/greenrobot/essentials/collections/MultimapSet;->f(Lorg/greenrobot/essentials/collections/MultimapSet$SetType;)Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lio/objectbox/g;->b:Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lio/objectbox/g;->c:Ljava/util/Deque;

    .line 18
    .line 19
    iput-object p1, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic d(Lio/objectbox/g;Ljava/lang/Object;Lq6/a;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/objectbox/BoxStore;->l()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Class;

    .line 34
    .line 35
    :try_start_0
    invoke-interface {p2, v0}, Lq6/a;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    invoke-virtual {p0, v0}, Lio/objectbox/g;->e(Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lq6/a;Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lio/objectbox/BoxStore;->s(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p0, p1, p2}, Lio/objectbox/g;->g(Lq6/a;I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p2, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 16
    .line 17
    invoke-virtual {p2}, Lio/objectbox/BoxStore;->m()[I

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    array-length v0, p2

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_1

    .line 24
    .line 25
    aget v2, p2, v1

    .line 26
    .line 27
    invoke-virtual {p0, p1, v2}, Lio/objectbox/g;->g(Lq6/a;I)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public b(Lq6/a;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    new-instance v1, Lio/objectbox/f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p1}, Lio/objectbox/f;-><init>(Lio/objectbox/g;Ljava/lang/Object;Lq6/a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->x(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Lq6/a;Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    iget-object p2, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    invoke-virtual {p2}, Lio/objectbox/BoxStore;->m()[I

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    array-length v0, p2

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    aget v2, p2, v1

    .line 14
    .line 15
    iget-object v3, p0, Lio/objectbox/g;->b:Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v3, v2, p1}, Lz9/a;->d(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    iget-object v0, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lio/objectbox/BoxStore;->s(Ljava/lang/Class;)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget-object v0, p0, Lio/objectbox/g;->b:Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {v0, p2, p1}, Lz9/a;->d(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final e(Ljava/lang/Class;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Observer failed while processing data for "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, ". Consider using an ErrorObserver"

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public f([I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/g;->c:Ljava/util/Deque;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/objectbox/g;->c:Ljava/util/Deque;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget-boolean p1, p0, Lio/objectbox/g;->d:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lio/objectbox/g;->d:Z

    .line 15
    .line 16
    iget-object p1, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lio/objectbox/BoxStore;->x(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method public final g(Lq6/a;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/g;->b:Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p2}, Lz9/a;->b(Ljava/lang/Object;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/util/Set;

    .line 12
    .line 13
    invoke-static {p2, p1}, Lq6/c;->a(Ljava/util/Set;Lq6/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    :cond_0
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lio/objectbox/g;->c:Ljava/util/Deque;

    .line 3
    .line 4
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    iget-object v2, p0, Lio/objectbox/g;->c:Ljava/util/Deque;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/Deque;->pollFirst()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, [I

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iput-boolean v0, p0, Lio/objectbox/g;->d:Z

    .line 16
    .line 17
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    iput-boolean v0, p0, Lio/objectbox/g;->d:Z

    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v2

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    :try_start_3
    array-length v1, v2

    .line 25
    move v3, v0

    .line 26
    :goto_0
    if-ge v3, v1, :cond_0

    .line 27
    .line 28
    aget v4, v2, v3

    .line 29
    .line 30
    iget-object v5, p0, Lio/objectbox/g;->b:Lorg/greenrobot/essentials/collections/MultimapSet;

    .line 31
    .line 32
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v5, v6}, Lz9/a;->b(Ljava/lang/Object;)Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_2

    .line 47
    .line 48
    iget-object v6, p0, Lio/objectbox/g;->a:Lio/objectbox/BoxStore;

    .line 49
    .line 50
    invoke-virtual {v6, v4}, Lio/objectbox/BoxStore;->q(I)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    :try_start_4
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Lq6/a;

    .line 69
    .line 70
    invoke-interface {v6, v4}, Lq6/a;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    goto :goto_3

    .line 76
    :catch_0
    :try_start_5
    invoke-virtual {p0, v4}, Lio/objectbox/g;->e(Ljava/lang/Class;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 77
    .line 78
    .line 79
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :goto_2
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 83
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 84
    :goto_3
    iput-boolean v0, p0, Lio/objectbox/g;->d:Z

    .line 85
    .line 86
    throw v1
.end method
