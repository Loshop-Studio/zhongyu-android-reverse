.class public abstract synthetic Lsd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)Lsd/m0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lsd/c0;->k(Lsd/i0;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Lkotlinx/coroutines/CoroutineStart;->d()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lsd/r1;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, Lsd/r1;-><init>(Lkotlin/coroutines/d;Lhd/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lsd/n0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, Lsd/n0;-><init>(Lkotlin/coroutines/d;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lkotlinx/coroutines/a;->I0(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lhd/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic b(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lsd/m0;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->c:Lkotlinx/coroutines/CoroutineStart;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lsd/f;->a(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)Lsd/m0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final c(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)Lkotlinx/coroutines/g;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lsd/c0;->k(Lsd/i0;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Lkotlinx/coroutines/CoroutineStart;->d()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lsd/s1;

    .line 12
    .line 13
    invoke-direct {p1, p0, p3}, Lsd/s1;-><init>(Lkotlin/coroutines/d;Lhd/p;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Lsd/b2;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, v0}, Lsd/b2;-><init>(Lkotlin/coroutines/d;Z)V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lkotlinx/coroutines/a;->I0(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lhd/p;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public static synthetic d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->c:Lkotlinx/coroutines/CoroutineStart;

    .line 12
    .line 13
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lsd/f;->c(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;)Lkotlinx/coroutines/g;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final e(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p2}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0}, Lsd/c0;->j(Lkotlin/coroutines/d;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lsd/o1;->i(Lkotlin/coroutines/d;)V

    .line 10
    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lxd/y;

    .line 15
    .line 16
    invoke-direct {v0, p0, p2}, Lxd/y;-><init>(Lkotlin/coroutines/d;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v0, p1}, Lyd/b;->d(Lxd/y;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, Lkotlin/coroutines/c;->a0:Lkotlin/coroutines/c$b;

    .line 25
    .line 26
    invoke-interface {p0, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    new-instance v0, Lsd/l2;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, Lsd/l2;-><init>(Lkotlin/coroutines/d;Lvc/c;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lkotlinx/coroutines/a;->getContext()Lkotlin/coroutines/d;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p0, v1}, Lxd/j0;->i(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :try_start_0
    invoke-static {v0, v0, p1}, Lyd/b;->d(Lxd/y;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    invoke-static {p0, v1}, Lxd/j0;->f(Lkotlin/coroutines/d;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    invoke-static {p0, v1}, Lxd/j0;->f(Lkotlin/coroutines/d;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_1
    new-instance v0, Lkotlinx/coroutines/e;

    .line 69
    .line 70
    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/e;-><init>(Lkotlin/coroutines/d;Lvc/c;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0, v0}, Lyd/a;->b(Lhd/p;Ljava/lang/Object;Lvc/c;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lkotlinx/coroutines/e;->K0()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_0
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_2

    .line 85
    .line 86
    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-object p0
.end method
