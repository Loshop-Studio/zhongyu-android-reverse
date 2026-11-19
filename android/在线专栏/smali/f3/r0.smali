.class public final Lf3/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLq2/d;)Ljava/lang/Object;
    .locals 4
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    .line 1
    sget-object p0, Lo2/r;->a:Lo2/r;

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lf3/m;

    invoke-static {p2}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf3/m;-><init>(Lq2/d;I)V

    .line 3
    invoke-virtual {v0}, Lf3/m;->v()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v3, p0, v1

    if-gez v3, :cond_1

    .line 4
    invoke-interface {v0}, Lq2/d;->getContext()Lq2/g;

    move-result-object v1

    invoke-static {v1}, Lf3/r0;->b(Lq2/g;)Lf3/q0;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, Lf3/q0;->y(JLf3/l;)V

    .line 5
    :cond_1
    invoke-virtual {v0}, Lf3/m;->s()Ljava/lang/Object;

    move-result-object p0

    .line 6
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    .line 7
    :cond_2
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Lo2/r;->a:Lo2/r;

    return-object p0
.end method

.method public static final b(Lq2/g;)Lf3/q0;
    .locals 1
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lq2/e;->R:Lq2/e$b;

    invoke-interface {p0, v0}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object p0

    instance-of v0, p0, Lf3/q0;

    if-eqz v0, :cond_0

    check-cast p0, Lf3/q0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lf3/n0;->a()Lf3/q0;

    move-result-object p0

    :cond_1
    return-object p0
.end method
