.class public Lz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/c$a;,
        Lz1/c$b;
    }
.end annotation


# instance fields
.field public volatile a:Lz1/c$a;

.field public final b:Landroid/util/SparseArray;

.field public c:Ljava/lang/Boolean;

.field public final d:Lz1/c$b;


# direct methods
.method public constructor <init>(Lz1/c$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz1/c;->b:Landroid/util/SparseArray;

    .line 10
    .line 11
    iput-object p1, p0, Lz1/c;->d:Lz1/c$b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/c;->d:Lz1/c$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Lz1/c$b;->c(I)Lz1/c$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v1, p0, Lz1/c;->a:Lz1/c$a;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iput-object v0, p0, Lz1/c;->a:Lz1/c$a;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v1, p0, Lz1/c;->b:Landroid/util/SparseArray;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0, p2}, Lz1/c$a;->a(Lr1/c;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit p0

    .line 36
    return-object v0

    .line 37
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1
.end method

.method public b(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v1, p0, Lz1/c;->a:Lz1/c$a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lz1/c;->a:Lz1/c$a;

    .line 11
    .line 12
    invoke-interface {v1}, Lz1/c$a;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v1, v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lz1/c;->a:Lz1/c$a;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lz1/c;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v1, v0

    .line 34
    check-cast v1, Lz1/c$a;

    .line 35
    .line 36
    :cond_1
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lz1/c;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {p0, p1, p2}, Lz1/c;->a(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    :goto_1
    return-object v1

    .line 51
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/c;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public d(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->c()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lz1/c;->a:Lz1/c$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lz1/c;->a:Lz1/c$a;

    .line 11
    .line 12
    invoke-interface {v0}, Lz1/c$a;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, p1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lz1/c;->a:Lz1/c$a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, p0, Lz1/c;->a:Lz1/c$a;

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
    iget-object v0, p0, Lz1/c;->b:Landroid/util/SparseArray;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lz1/c$a;

    .line 33
    .line 34
    iget-object v1, p0, Lz1/c;->b:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lz1/c;->d:Lz1/c$b;

    .line 43
    .line 44
    invoke-interface {v0, p1}, Lz1/c$b;->c(I)Lz1/c$a;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-interface {p1, p2}, Lz1/c$a;->a(Lr1/c;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object p1

    .line 54
    :cond_2
    return-object v0

    .line 55
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
.end method
