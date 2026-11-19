.class public final Landroidx/lifecycle/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/f;Lx2/p;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p0    # Landroidx/lifecycle/f;
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
            "Landroidx/lifecycle/f;",
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

    sget-object v0, Landroidx/lifecycle/f$c;->c:Landroidx/lifecycle/f$c;

    invoke-static {p0, v0, p1, p2}, Landroidx/lifecycle/w;->c(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/lifecycle/f;Lx2/p;Lq2/d;)Ljava/lang/Object;
    .locals 1
    .param p0    # Landroidx/lifecycle/f;
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
            "Landroidx/lifecycle/f;",
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

    sget-object v0, Landroidx/lifecycle/f$c;->e:Landroidx/lifecycle/f$c;

    invoke-static {p0, v0, p1, p2}, Landroidx/lifecycle/w;->c(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)Ljava/lang/Object;
    .locals 3
    .param p0    # Landroidx/lifecycle/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/lifecycle/f$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/f;",
            "Landroidx/lifecycle/f$c;",
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

    invoke-static {}, Lf3/v0;->c()Lf3/x1;

    move-result-object v0

    invoke-virtual {v0}, Lf3/x1;->L()Lf3/x1;

    move-result-object v0

    new-instance v1, Landroidx/lifecycle/w$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/lifecycle/w$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/f$c;Lx2/p;Lq2/d;)V

    invoke-static {v0, v1, p3}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
