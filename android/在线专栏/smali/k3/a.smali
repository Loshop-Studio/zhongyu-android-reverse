.class public final Lk3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lq2/d;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lk3/a;->b(Lq2/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final b(Lq2/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/m;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    .line 2
    throw p1
.end method

.method public static final c(Lq2/d;Lq2/d;)V
    .locals 3
    .param p0    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;",
            "Lq2/d<",
            "*>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object p0

    sget-object v0, Lo2/l;->a:Lo2/l$a;

    sget-object v0, Lo2/r;->a:Lo2/r;

    invoke-static {v0}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/f;->c(Lq2/d;Ljava/lang/Object;Lx2/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 2
    invoke-static {p1, p0}, Lk3/a;->a(Lq2/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lx2/p;Ljava/lang/Object;Lq2/d;Lx2/l;)V
    .locals 0
    .param p0    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lx2/p<",
            "-TR;-",
            "Lq2/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lq2/d<",
            "-TT;>;",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Lr2/b;->a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p0

    invoke-static {p0}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object p0

    sget-object p1, Lo2/l;->a:Lo2/l$a;

    sget-object p1, Lo2/r;->a:Lo2/r;

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/f;->b(Lq2/d;Ljava/lang/Object;Lx2/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 2
    invoke-static {p2, p0}, Lk3/a;->a(Lq2/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic e(Lx2/p;Ljava/lang/Object;Lq2/d;Lx2/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lk3/a;->d(Lx2/p;Ljava/lang/Object;Lq2/d;Lx2/l;)V

    return-void
.end method
