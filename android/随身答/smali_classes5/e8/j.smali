.class public Le8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/b;


# instance fields
.field public final a:Lio/objectbox/query/Query;

.field public final b:Lb8/a;

.field public final c:Ljava/util/Set;

.field public d:Lf8/a;

.field public e:Lf8/d;


# direct methods
.method public constructor <init>(Lio/objectbox/query/Query;Lb8/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le8/j;->c:Ljava/util/Set;

    .line 10
    .line 11
    iput-object p1, p0, Le8/j;->a:Lio/objectbox/query/Query;

    .line 12
    .line 13
    iput-object p2, p0, Le8/j;->b:Lb8/a;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic d(Le8/j;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le8/j;->a:Lio/objectbox/query/Query;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/objectbox/query/Query;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Le8/j;->c:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lf8/a;

    .line 24
    .line 25
    invoke-interface {v1, v0}, Lf8/a;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public static synthetic e(Le8/j;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le8/j;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Le8/j;Lf8/a;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le8/j;->a:Lio/objectbox/query/Query;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/objectbox/query/Query;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p1, p0}, Lf8/a;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lf8/a;Ljava/lang/Object;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Le8/j;->b:Lb8/a;

    .line 3
    .line 4
    invoke-virtual {p2}, Lb8/a;->g()Lio/objectbox/BoxStore;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget-object v0, p0, Le8/j;->d:Lf8/a;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Le8/h;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Le8/h;-><init>(Le8/j;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Le8/j;->d:Lf8/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Le8/j;->c:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Le8/j;->e:Lf8/d;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Le8/j;->b:Lb8/a;

    .line 35
    .line 36
    invoke-virtual {v0}, Lb8/a;->e()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->J(Ljava/lang/Class;)Lf8/g;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2}, Lf8/g;->c()Lf8/g;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lf8/g;->b()Lf8/g;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object v0, p0, Le8/j;->d:Lf8/a;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Lf8/g;->a(Lf8/a;)Lf8/d;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iput-object p2, p0, Le8/j;->e:Lf8/d;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "Existing subscription found"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    :goto_1
    iget-object p2, p0, Le8/j;->c:Ljava/util/Set;

    .line 70
    .line 71
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    monitor-exit p0

    .line 75
    return-void

    .line 76
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1
.end method

.method public b(Lf8/a;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p2, p0, Le8/j;->b:Lb8/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lb8/a;->g()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Le8/g;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Le8/g;-><init>(Le8/j;Lf8/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Lio/objectbox/BoxStore;->B(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public declared-synchronized c(Lf8/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Le8/j;->c:Ljava/util/Set;

    .line 3
    .line 4
    invoke-static {p2, p1}, Lf8/c;->a(Ljava/util/Set;Lf8/a;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Le8/j;->c:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Le8/j;->e:Lf8/d;

    .line 16
    .line 17
    invoke-interface {p1}, Lf8/d;->cancel()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Le8/j;->e:Lf8/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Le8/j;->b:Lb8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb8/a;->g()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Le8/i;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Le8/i;-><init>(Le8/j;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->B(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 13
    .line 14
    .line 15
    return-void
.end method
