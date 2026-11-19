.class final synthetic Lf3/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf3/m1;)Lf3/w;
    .locals 1
    .param p0    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lf3/p1;

    invoke-direct {v0, p0}, Lf3/p1;-><init>(Lf3/m1;)V

    return-object v0
.end method

.method public static synthetic b(Lf3/m1;ILjava/lang/Object;)Lf3/w;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lf3/q1;->a(Lf3/m1;)Lf3/w;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lq2/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p0, v0}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p0

    check-cast p0, Lf3/m1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lf3/m1;->B(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lq2/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lf3/q1;->c(Lq2/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lf3/m1;)V
    .locals 1
    .param p0    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-interface {p0}, Lf3/m1;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lf3/m1;->u()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final f(Lq2/g;)V
    .locals 1
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p0, v0}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p0

    check-cast p0, Lf3/m1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lf3/q1;->e(Lf3/m1;)V

    :goto_0
    return-void
.end method
