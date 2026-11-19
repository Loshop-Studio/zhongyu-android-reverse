.class public Lz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/a$b;,
        Lz1/a$a;,
        Lz1/a$c;
    }
.end annotation


# instance fields
.field public a:Lz1/a$b;

.field public b:Lz1/a$a;

.field public final c:Lz1/c;


# direct methods
.method public constructor <init>(Lz1/c$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz1/c;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lz1/c;-><init>(Lz1/c$b;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lz1/a;->c:Lz1/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a(Lcom/liulishuo/okdownload/a;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/a;->c:Lz1/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->p()Lr1/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, v1}, Lz1/c;->b(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lz1/a$c;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lz1/a;->b:Lz1/a$a;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v1, p1, p2, v0}, Lz1/a$a;->d(Lcom/liulishuo/okdownload/a;ILz1/a$c;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v1, p0, Lz1/a;->a:Lz1/a$b;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v0, v0, Lz1/a$c;->b:Lr1/c;

    .line 32
    .line 33
    invoke-virtual {v0, p2}, Lr1/c;->c(I)Lr1/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v1, p1, p2, v0}, Lz1/a$b;->r(Lcom/liulishuo/okdownload/a;ILr1/a;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public b(Lcom/liulishuo/okdownload/a;IJ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lz1/a;->c:Lz1/c;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->p()Lr1/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, v1}, Lz1/c;->b(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v6, v0

    .line 12
    check-cast v6, Lz1/a$c;

    .line 13
    .line 14
    if-nez v6, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, v6, Lz1/a$c;->d:Landroid/util/SparseArray;

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    add-long v7, v0, p3

    .line 30
    .line 31
    iget-object v0, v6, Lz1/a$c;->d:Landroid/util/SparseArray;

    .line 32
    .line 33
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-wide v0, v6, Lz1/a$c;->c:J

    .line 41
    .line 42
    add-long/2addr v0, p3

    .line 43
    iput-wide v0, v6, Lz1/a$c;->c:J

    .line 44
    .line 45
    iget-object v1, p0, Lz1/a;->b:Lz1/a$a;

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    move v3, p2

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    move-wide v4, p3

    .line 52
    invoke-interface/range {v1 .. v6}, Lz1/a$a;->b(Lcom/liulishuo/okdownload/a;IJLz1/a$c;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object p1, p0, Lz1/a;->a:Lz1/a$b;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-interface {p1, v2, v3, v7, v8}, Lz1/a$b;->k(Lcom/liulishuo/okdownload/a;IJ)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lz1/a;->a:Lz1/a$b;

    .line 67
    .line 68
    iget-wide p2, v6, Lz1/a$c;->c:J

    .line 69
    .line 70
    invoke-interface {p1, v2, p2, p3}, Lz1/a$b;->n(Lcom/liulishuo/okdownload/a;J)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_0
    return-void
.end method

.method public c(Lcom/liulishuo/okdownload/a;Lr1/c;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz1/a;->c:Lz1/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lz1/c;->a(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz1/a$c;

    .line 8
    .line 9
    iget-object v1, p0, Lz1/a;->b:Lz1/a$a;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1, p1, p2, p3, v0}, Lz1/a$a;->e(Lcom/liulishuo/okdownload/a;Lr1/c;ZLz1/a$c;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lz1/a;->a:Lz1/a$b;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v1, p1, p2, p3, v0}, Lz1/a$b;->e(Lcom/liulishuo/okdownload/a;Lr1/c;ZLz1/a$c;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Lz1/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz1/a;->b:Lz1/a$a;

    .line 2
    .line 3
    return-void
.end method

.method public e(Lz1/a$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz1/a;->a:Lz1/a$b;

    .line 2
    .line 3
    return-void
.end method

.method public declared-synchronized f(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lz1/a;->c:Lz1/c;

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->p()Lr1/c;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v0, p1, v1}, Lz1/c;->d(Lcom/liulishuo/okdownload/a;Lr1/c;)Lz1/c$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lz1/a$c;

    .line 13
    .line 14
    iget-object v1, p0, Lz1/a;->b:Lz1/a$a;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, p1, p2, p3, v0}, Lz1/a$a;->a(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lz1/a$c;)Z

    .line 19
    .line 20
    .line 21
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_1
    iget-object v1, p0, Lz1/a;->a:Lz1/a$b;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v1, p1, p2, p3, v0}, Lz1/a$b;->s(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lz1/a$c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    throw p1
.end method
