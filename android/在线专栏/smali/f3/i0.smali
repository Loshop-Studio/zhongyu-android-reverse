.class public final Lf3/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq2/g;)Lf3/h0;
    .locals 3
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/d;

    sget-object v1, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p0, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lf3/q1;->b(Lf3/m1;ILjava/lang/Object;)Lf3/w;

    move-result-object v1

    invoke-interface {p0, v1}, Lq2/g;->plus(Lq2/g;)Lq2/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/d;-><init>(Lq2/g;)V

    return-object v0
.end method

.method public static final b(Lf3/h0;)Z
    .locals 1
    .param p0    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-interface {p0}, Lf3/h0;->e()Lq2/g;

    move-result-object p0

    sget-object v0, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {p0, v0}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p0

    check-cast p0, Lf3/m1;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lf3/m1;->isActive()Z

    move-result p0

    :goto_0
    return p0
.end method
