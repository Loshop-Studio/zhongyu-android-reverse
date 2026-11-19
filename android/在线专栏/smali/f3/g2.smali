.class public final Lf3/g2;
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

    new-instance v0, Lf3/f2;

    invoke-direct {v0, p0}, Lf3/f2;-><init>(Lf3/m1;)V

    return-object v0
.end method

.method public static synthetic b(Lf3/m1;ILjava/lang/Object;)Lf3/w;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lf3/g2;->a(Lf3/m1;)Lf3/w;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lx2/p;Lq2/d;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx2/p<",
            "-",
            "Lf3/h0;",
            "-",
            "Lq2/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lq2/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    new-instance v0, Lf3/e2;

    invoke-interface {p1}, Lq2/d;->getContext()Lq2/g;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf3/e2;-><init>(Lq2/g;Lq2/d;)V

    .line 2
    invoke-static {v0, v0, p0}, Lk3/b;->b(Lkotlinx/coroutines/internal/s;Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p0

    .line 3
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    :cond_0
    return-object p0
.end method
