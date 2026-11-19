.class final synthetic Lf3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;)Lf3/o0;
    .locals 1
    .param p0    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf3/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf3/h0;",
            "Lq2/g;",
            "Lf3/j0;",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lf3/o0<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lf3/d0;->c(Lf3/h0;Lq2/g;)Lq2/g;

    move-result-object p0

    .line 2
    invoke-virtual {p2}, Lf3/j0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lf3/v1;

    invoke-direct {p1, p0, p3}, Lf3/v1;-><init>(Lq2/g;Lx2/p;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lf3/p0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lf3/p0;-><init>(Lq2/g;Z)V

    .line 5
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lf3/a;->w0(Lf3/j0;Ljava/lang/Object;Lx2/p;)V

    return-object p1
.end method

.method public static synthetic b(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/o0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 1
    sget-object p1, Lq2/h;->a:Lq2/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 2
    sget-object p2, Lf3/j0;->a:Lf3/j0;

    .line 3
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf3/g;->a(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;)Lf3/o0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;)Lf3/m1;
    .locals 1
    .param p0    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf3/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/g;",
            "Lf3/j0;",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lf3/m1;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lf3/d0;->c(Lf3/h0;Lq2/g;)Lq2/g;

    move-result-object p0

    .line 2
    invoke-virtual {p2}, Lf3/j0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lf3/w1;

    invoke-direct {p1, p0, p3}, Lf3/w1;-><init>(Lq2/g;Lx2/p;)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Lf3/d2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lf3/d2;-><init>(Lq2/g;Z)V

    .line 5
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lf3/a;->w0(Lf3/j0;Ljava/lang/Object;Lx2/p;)V

    return-object p1
.end method

.method public static synthetic d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 1
    sget-object p1, Lq2/h;->a:Lq2/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 2
    sget-object p2, Lf3/j0;->a:Lf3/j0;

    .line 3
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lf3/g;->c(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;)Lf3/m1;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;
    .locals 8
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq2/g;",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lq2/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-interface {p2}, Lq2/d;->getContext()Lq2/g;

    move-result-object v0

    .line 2
    invoke-interface {v0, p0}, Lq2/g;->plus(Lq2/g;)Lq2/g;

    move-result-object p0

    .line 3
    invoke-static {p0}, Lf3/q1;->f(Lq2/g;)V

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lkotlinx/coroutines/internal/s;

    invoke-direct {v0, p0, p2}, Lkotlinx/coroutines/internal/s;-><init>(Lq2/g;Lq2/d;)V

    .line 5
    invoke-static {v0, v0, p1}, Lk3/b;->b(Lkotlinx/coroutines/internal/s;Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lq2/e;->R:Lq2/e$b;

    invoke-interface {p0, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v2

    invoke-interface {v0, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    new-instance v0, Lf3/k2;

    invoke-direct {v0, p0, p2}, Lf3/k2;-><init>(Lq2/g;Lq2/d;)V

    const/4 v1, 0x0

    .line 8
    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/x;->c(Lq2/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 9
    :try_start_0
    invoke-static {v0, v0, p1}, Lk3/b;->b(Lkotlinx/coroutines/internal/s;Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/x;->a(Lq2/g;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, Lkotlinx/coroutines/internal/x;->a(Lq2/g;Ljava/lang/Object;)V

    throw p1

    .line 11
    :cond_1
    new-instance v0, Lf3/s0;

    invoke-direct {v0, p0, p2}, Lf3/s0;-><init>(Lq2/g;Lq2/d;)V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    .line 12
    invoke-static/range {v2 .. v7}, Lk3/a;->e(Lx2/p;Ljava/lang/Object;Lq2/d;Lx2/l;ILjava/lang/Object;)V

    .line 13
    invoke-virtual {v0}, Lf3/s0;->y0()Ljava/lang/Object;

    move-result-object p0

    .line 14
    :goto_0
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    :cond_2
    return-object p0
.end method
