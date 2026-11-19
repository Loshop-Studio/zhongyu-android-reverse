.class final synthetic Lf3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq2/g;Lx2/p;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lx2/p;
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
            ">;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 2
    sget-object v1, Lq2/e;->R:Lq2/e$b;

    invoke-interface {p0, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v1

    check-cast v1, Lq2/e;

    if-nez v1, :cond_0

    .line 3
    sget-object v1, Lf3/i2;->a:Lf3/i2;

    invoke-virtual {v1}, Lf3/i2;->b()Lf3/z0;

    move-result-object v1

    .line 4
    sget-object v2, Lf3/f1;->a:Lf3/f1;

    invoke-interface {p0, v1}, Lq2/g;->plus(Lq2/g;)Lq2/g;

    move-result-object p0

    invoke-static {v2, p0}, Lf3/d0;->c(Lf3/h0;Lq2/g;)Lq2/g;

    move-result-object p0

    goto :goto_3

    .line 5
    :cond_0
    instance-of v2, v1, Lf3/z0;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lf3/z0;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lf3/z0;->W()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v3, v1

    :cond_3
    :goto_1
    if-nez v3, :cond_4

    .line 6
    sget-object v1, Lf3/i2;->a:Lf3/i2;

    invoke-virtual {v1}, Lf3/i2;->a()Lf3/z0;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v3

    .line 7
    :goto_2
    sget-object v2, Lf3/f1;->a:Lf3/f1;

    invoke-static {v2, p0}, Lf3/d0;->c(Lf3/h0;Lq2/g;)Lq2/g;

    move-result-object p0

    .line 8
    :goto_3
    new-instance v2, Lf3/e;

    invoke-direct {v2, p0, v0, v1}, Lf3/e;-><init>(Lq2/g;Ljava/lang/Thread;Lf3/z0;)V

    .line 9
    sget-object p0, Lf3/j0;->a:Lf3/j0;

    invoke-virtual {v2, p0, v2, p1}, Lf3/a;->w0(Lf3/j0;Ljava/lang/Object;Lx2/p;)V

    .line 10
    invoke-virtual {v2}, Lf3/e;->x0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lq2/g;Lx2/p;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Lq2/h;->a:Lq2/h;

    :cond_0
    invoke-static {p0, p1}, Lf3/g;->e(Lq2/g;Lx2/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
