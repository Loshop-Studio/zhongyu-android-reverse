.class public final Lkotlinx/coroutines/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/f;->a:Lkotlinx/coroutines/internal/t;

    .line 2
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/f;->b:Lkotlinx/coroutines/internal/t;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/t;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/f;->a:Lkotlinx/coroutines/internal/t;

    return-object v0
.end method

.method public static final b(Lq2/d;Ljava/lang/Object;Lx2/l;)V
    .locals 6
    .param p0    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq2/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lkotlinx/coroutines/internal/e;

    if-eqz v0, :cond_8

    check-cast p0, Lkotlinx/coroutines/internal/e;

    .line 2
    invoke-static {p1, p2}, Lf3/c0;->c(Ljava/lang/Object;Lx2/l;)Ljava/lang/Object;

    move-result-object p2

    .line 3
    iget-object v0, p0, Lkotlinx/coroutines/internal/e;->d:Lf3/e0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/e;->getContext()Lq2/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf3/e0;->K(Lq2/g;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    iput-object p2, p0, Lkotlinx/coroutines/internal/e;->f:Ljava/lang/Object;

    .line 5
    iput v1, p0, Lf3/t0;->c:I

    .line 6
    iget-object p1, p0, Lkotlinx/coroutines/internal/e;->d:Lf3/e0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/e;->getContext()Lq2/g;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lf3/e0;->J(Lq2/g;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    .line 7
    :cond_0
    sget-object v0, Lf3/i2;->a:Lf3/i2;

    invoke-virtual {v0}, Lf3/i2;->b()Lf3/z0;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lf3/z0;->S()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    iput-object p2, p0, Lkotlinx/coroutines/internal/e;->f:Ljava/lang/Object;

    .line 10
    iput v1, p0, Lf3/t0;->c:I

    .line 11
    invoke-virtual {v0, p0}, Lf3/z0;->O(Lf3/t0;)V

    goto/16 :goto_4

    .line 12
    :cond_1
    invoke-virtual {v0, v1}, Lf3/z0;->Q(Z)V

    const/4 v2, 0x0

    .line 13
    :try_start_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/e;->getContext()Lq2/g;

    move-result-object v3

    sget-object v4, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {v3, v4}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v3

    check-cast v3, Lf3/m1;

    if-eqz v3, :cond_2

    .line 14
    invoke-interface {v3}, Lf3/m1;->isActive()Z

    move-result v4

    if-nez v4, :cond_2

    .line 15
    invoke-interface {v3}, Lf3/m1;->u()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    .line 16
    invoke-virtual {p0, p2, v3}, Lkotlinx/coroutines/internal/e;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 17
    sget-object p2, Lo2/l;->a:Lo2/l$a;

    invoke-static {v3}, Lo2/m;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    .line 18
    iget-object p2, p0, Lkotlinx/coroutines/internal/e;->e:Lq2/d;

    iget-object v3, p0, Lkotlinx/coroutines/internal/e;->g:Ljava/lang/Object;

    .line 19
    invoke-interface {p2}, Lq2/d;->getContext()Lq2/g;

    move-result-object v4

    .line 20
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/x;->c(Lq2/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 21
    sget-object v5, Lkotlinx/coroutines/internal/x;->a:Lkotlinx/coroutines/internal/t;

    if-eq v3, v5, :cond_3

    .line 22
    invoke-static {p2, v4, v3}, Lf3/d0;->e(Lq2/d;Lq2/g;Ljava/lang/Object;)Lf3/k2;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    .line 23
    :goto_1
    :try_start_1
    iget-object v5, p0, Lkotlinx/coroutines/internal/e;->e:Lq2/d;

    invoke-interface {v5, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    .line 24
    sget-object p1, Lo2/r;->a:Lo2/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    .line 25
    :try_start_2
    invoke-virtual {p2}, Lf3/k2;->y0()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 26
    :cond_4
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/x;->a(Lq2/g;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    .line 27
    invoke-virtual {p2}, Lf3/k2;->y0()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 28
    :cond_5
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/x;->a(Lq2/g;Ljava/lang/Object;)V

    :cond_6
    throw p1

    .line 29
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lf3/z0;->V()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    .line 30
    :try_start_3
    invoke-virtual {p0, p1, v2}, Lf3/t0;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 31
    :goto_3
    invoke-virtual {v0, v1}, Lf3/z0;->L(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lf3/z0;->L(Z)V

    throw p0

    .line 32
    :cond_8
    invoke-interface {p0, p1}, Lq2/d;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lq2/d;Ljava/lang/Object;Lx2/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/internal/f;->b(Lq2/d;Ljava/lang/Object;Lx2/l;)V

    return-void
.end method
