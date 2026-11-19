.class public Lf3/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf3/m1;
.implements Lf3/s;
.implements Lf3/b2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf3/t1$c;,
        Lf3/t1$b;,
        Lf3/t1$a;
    }
.end annotation


# static fields
.field private static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _parentHandle:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic _state:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lf3/t1;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lf3/u1;->c()Lf3/y0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lf3/u1;->d()Lf3/y0;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lf3/t1;->_state:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lf3/t1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method private final D(Lf3/h1;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lf3/t1;->N()Lf3/q;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {v0}, Lf3/w0;->b()V

    .line 3
    sget-object v0, Lf3/z1;->a:Lf3/z1;

    invoke-virtual {p0, v0}, Lf3/t1;->i0(Lf3/q;)V

    .line 4
    :goto_0
    instance-of v0, p2, Lf3/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lf3/y;

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p2, Lf3/y;->a:Ljava/lang/Throwable;

    .line 5
    :goto_2
    instance-of p2, p1, Lf3/s1;

    if-eqz p2, :cond_3

    .line 6
    :try_start_0
    move-object p2, p1

    check-cast p2, Lf3/s1;

    invoke-virtual {p2, v1}, Lf3/a0;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    .line 7
    new-instance v0, Lf3/b0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in completion handler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lf3/t1;->Q(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 8
    :cond_3
    invoke-interface {p1}, Lf3/h1;->a()Lf3/y1;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-direct {p0, p1, v1}, Lf3/t1;->b0(Lf3/y1;Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method private final E(Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lf3/t1;->Z(Lkotlinx/coroutines/internal/k;)Lf3/r;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lf3/t1;->s0(Lf3/t1$c;Lf3/r;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-direct {p0, p1, p3}, Lf3/t1;->G(Lf3/t1$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Lf3/t1;->l(Ljava/lang/Object;)V

    return-void
.end method

.method private final F(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 1
    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    .line 2
    new-instance v0, Lf3/n1;

    invoke-static {p0}, Lf3/t1;->c(Lf3/t1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"

    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lf3/b2;

    invoke-interface {p1}, Lf3/b2;->s()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    :cond_2
    :goto_1
    return-object p1
.end method

.method private final G(Lf3/t1$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lf3/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf3/y;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lf3/y;->a:Ljava/lang/Throwable;

    .line 2
    :goto_1
    monitor-enter p1

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lf3/t1$c;->f()Z

    move-result v2

    .line 4
    invoke-virtual {p1, v0}, Lf3/t1$c;->i(Ljava/lang/Throwable;)Ljava/util/List;

    move-result-object v3

    .line 5
    invoke-direct {p0, p1, v3}, Lf3/t1;->J(Lf3/t1$c;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 6
    invoke-direct {p0, v4, v3}, Lf3/t1;->k(Ljava/lang/Throwable;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_2
    monitor-exit p1

    const/4 v3, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    if-ne v4, v0, :cond_4

    goto :goto_2

    .line 8
    :cond_4
    new-instance p2, Lf3/y;

    const/4 v0, 0x2

    invoke-direct {p2, v4, v3, v0, v1}, Lf3/y;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    :goto_2
    if-eqz v4, :cond_7

    .line 9
    invoke-direct {p0, v4}, Lf3/t1;->z(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, v4}, Lf3/t1;->P(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v3, 0x1

    :cond_6
    if-eqz v3, :cond_7

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    .line 10
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lf3/y;

    invoke-virtual {v0}, Lf3/y;->b()Z

    :cond_7
    if-nez v2, :cond_8

    .line 11
    invoke-virtual {p0, v4}, Lf3/t1;->c0(Ljava/lang/Throwable;)V

    .line 12
    :cond_8
    invoke-virtual {p0, p2}, Lf3/t1;->d0(Ljava/lang/Object;)V

    .line 13
    sget-object v0, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lf3/u1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    invoke-direct {p0, p1, p2}, Lf3/t1;->D(Lf3/h1;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    .line 15
    monitor-exit p1

    throw p2
.end method

.method private final H(Lf3/h1;)Lf3/r;
    .locals 2

    instance-of v0, p1, Lf3/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf3/r;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    invoke-interface {p1}, Lf3/h1;->a()Lf3/y1;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1}, Lf3/t1;->Z(Lkotlinx/coroutines/internal/k;)Lf3/r;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    return-object v1
.end method

.method private final I(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Lf3/y;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lf3/y;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p1, Lf3/y;->a:Ljava/lang/Throwable;

    :goto_1
    return-object v1
.end method

.method private final J(Lf3/t1$c;Ljava/util/List;)Ljava/lang/Throwable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/t1$c;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Lf3/t1$c;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Lf3/n1;

    invoke-static {p0}, Lf3/t1;->c(Lf3/t1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    return-object p1

    :cond_0
    return-object v1

    .line 4
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    .line 5
    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_3
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x0

    .line 6
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method private final M(Lf3/h1;)Lf3/y1;
    .locals 1

    .line 1
    invoke-interface {p1}, Lf3/h1;->a()Lf3/y1;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2
    instance-of v0, p1, Lf3/y0;

    if-eqz v0, :cond_0

    new-instance v0, Lf3/y1;

    invoke-direct {v0}, Lf3/y1;-><init>()V

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lf3/s1;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Lf3/s1;

    invoke-direct {p0, p1}, Lf3/t1;->g0(Lf3/s1;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "State should have list: "

    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private final V(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    move-object v1, v0

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v2

    .line 2
    instance-of v3, v2, Lf3/t1$c;

    if-eqz v3, :cond_7

    .line 3
    monitor-enter v2

    .line 4
    :try_start_0
    move-object v3, v2

    check-cast v3, Lf3/t1$c;

    invoke-virtual {v3}, Lf3/t1$c;->h()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lf3/u1;->f()Lkotlinx/coroutines/internal/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object p1

    .line 5
    :cond_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Lf3/t1$c;

    invoke-virtual {v3}, Lf3/t1$c;->f()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v3, :cond_4

    :cond_2
    if-nez v1, :cond_3

    .line 6
    invoke-direct {p0, p1}, Lf3/t1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    .line 7
    :cond_3
    move-object p1, v2

    check-cast p1, Lf3/t1$c;

    invoke-virtual {p1, v1}, Lf3/t1$c;->b(Ljava/lang/Throwable;)V

    .line 8
    :cond_4
    move-object p1, v2

    check-cast p1, Lf3/t1$c;

    invoke-virtual {p1}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v1, v3, 0x1

    if-eqz v1, :cond_5

    move-object v0, p1

    :cond_5
    monitor-exit v2

    if-nez v0, :cond_6

    goto :goto_1

    .line 9
    :cond_6
    check-cast v2, Lf3/t1$c;

    invoke-virtual {v2}, Lf3/t1$c;->a()Lf3/y1;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lf3/t1;->a0(Lf3/y1;Ljava/lang/Throwable;)V

    .line 10
    :goto_1
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v2

    throw p1

    .line 12
    :cond_7
    instance-of v3, v2, Lf3/h1;

    if-eqz v3, :cond_c

    if-nez v1, :cond_8

    .line 13
    invoke-direct {p0, p1}, Lf3/t1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    .line 14
    :cond_8
    move-object v3, v2

    check-cast v3, Lf3/h1;

    invoke-interface {v3}, Lf3/h1;->isActive()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 15
    invoke-direct {p0, v3, v1}, Lf3/t1;->p0(Lf3/h1;Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1

    .line 16
    :cond_9
    new-instance v3, Lf3/y;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v1, v4, v5, v0}, Lf3/y;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-direct {p0, v2, v3}, Lf3/t1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 17
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object v4

    if-eq v3, v4, :cond_b

    .line 18
    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object v2

    if-ne v3, v2, :cond_a

    goto/16 :goto_0

    :cond_a
    return-object v3

    :cond_b
    const-string p1, "Cannot happen in "

    .line 19
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_c
    invoke-static {}, Lf3/u1;->f()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1
.end method

.method private final X(Lx2/l;Z)Lf3/s1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;Z)",
            "Lf3/s1;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    .line 1
    instance-of p2, p1, Lf3/o1;

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lf3/o1;

    :cond_0
    if-nez v0, :cond_4

    .line 2
    new-instance v0, Lf3/k1;

    invoke-direct {v0, p1}, Lf3/k1;-><init>(Lx2/l;)V

    goto :goto_2

    .line 3
    :cond_1
    instance-of p2, p1, Lf3/s1;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Lf3/s1;

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p2

    :goto_1
    if-nez v0, :cond_4

    .line 4
    new-instance v0, Lf3/l1;

    invoke-direct {v0, p1}, Lf3/l1;-><init>(Lx2/l;)V

    .line 5
    :cond_4
    :goto_2
    invoke-virtual {v0, p0}, Lf3/s1;->u(Lf3/t1;)V

    return-object v0
.end method

.method private final Z(Lkotlinx/coroutines/internal/k;)Lf3/r;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->m()Lkotlinx/coroutines/internal/k;

    move-result-object p1

    goto :goto_0

    .line 2
    :cond_0
    :goto_1
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->l()Lkotlinx/coroutines/internal/k;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    instance-of v0, p1, Lf3/r;

    if-eqz v0, :cond_2

    check-cast p1, Lf3/r;

    return-object p1

    .line 5
    :cond_2
    instance-of v0, p1, Lf3/y1;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private final a0(Lf3/y1;Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lf3/t1;->c0(Ljava/lang/Throwable;)V

    .line 2
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/k;

    const/4 v1, 0x0

    move-object v2, v1

    .line 3
    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 4
    instance-of v3, v0, Lf3/o1;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lf3/s1;

    .line 5
    :try_start_0
    invoke-virtual {v3, p2}, Lf3/a0;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    .line 6
    :cond_0
    invoke-static {v2, v4}, Lo2/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    .line 7
    new-instance v2, Lf3/b0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    :cond_1
    :goto_2
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/k;->l()Lkotlinx/coroutines/internal/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    .line 9
    :cond_3
    invoke-virtual {p0, v2}, Lf3/t1;->Q(Ljava/lang/Throwable;)V

    .line 10
    :goto_3
    invoke-direct {p0, p2}, Lf3/t1;->z(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final b0(Lf3/y1;Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/internal/k;

    const/4 v1, 0x0

    move-object v2, v1

    .line 2
    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 3
    instance-of v3, v0, Lf3/s1;

    if-eqz v3, :cond_1

    move-object v3, v0

    check-cast v3, Lf3/s1;

    .line 4
    :try_start_0
    invoke-virtual {v3, p2}, Lf3/a0;->s(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    if-nez v2, :cond_0

    move-object v5, v1

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {v2, v4}, Lo2/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object v5, v2

    :goto_1
    if-nez v5, :cond_1

    .line 6
    new-instance v2, Lf3/b0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Exception in completion handler "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v4}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    :cond_1
    :goto_2
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/k;->l()Lkotlinx/coroutines/internal/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_3

    .line 8
    :cond_3
    invoke-virtual {p0, v2}, Lf3/t1;->Q(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public static final synthetic c(Lf3/t1;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lf3/t1;->A()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final f0(Lf3/y0;)V
    .locals 2

    .line 1
    new-instance v0, Lf3/y1;

    invoke-direct {v0}, Lf3/y1;-><init>()V

    .line 2
    invoke-virtual {p1}, Lf3/y0;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lf3/g1;

    invoke-direct {v1, v0}, Lf3/g1;-><init>(Lf3/y1;)V

    move-object v0, v1

    .line 3
    :goto_0
    sget-object v1, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final g0(Lf3/s1;)V
    .locals 2

    .line 1
    new-instance v0, Lf3/y1;

    invoke-direct {v0}, Lf3/y1;-><init>()V

    invoke-virtual {p1, v0}, Lkotlinx/coroutines/internal/k;->g(Lkotlinx/coroutines/internal/k;)Z

    .line 2
    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->l()Lkotlinx/coroutines/internal/k;

    move-result-object v0

    .line 3
    sget-object v1, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, p1, v0}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static final synthetic i(Lf3/t1;Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lf3/t1;->E(Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V

    return-void
.end method

.method private final j(Ljava/lang/Object;Lf3/y1;Lf3/s1;)Z
    .locals 2

    .line 1
    new-instance v0, Lf3/t1$d;

    invoke-direct {v0, p3, p0, p1}, Lf3/t1$d;-><init>(Lkotlinx/coroutines/internal/k;Lf3/t1;Ljava/lang/Object;)V

    .line 2
    :goto_0
    invoke-virtual {p2}, Lkotlinx/coroutines/internal/k;->m()Lkotlinx/coroutines/internal/k;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3, p2, v0}, Lkotlinx/coroutines/internal/k;->r(Lkotlinx/coroutines/internal/k;Lkotlinx/coroutines/internal/k;Lkotlinx/coroutines/internal/k$a;)I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final j0(Ljava/lang/Object;)I
    .locals 4

    .line 1
    instance-of v0, p1, Lf3/y0;

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    .line 2
    move-object v0, p1

    check-cast v0, Lf3/y0;

    invoke-virtual {v0}, Lf3/y0;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    .line 3
    :cond_0
    sget-object v0, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lf3/u1;->c()Lf3/y0;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-virtual {p0}, Lf3/t1;->e0()V

    return v2

    .line 5
    :cond_2
    instance-of v0, p1, Lf3/g1;

    if-eqz v0, :cond_4

    .line 6
    sget-object v0, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-object v3, p1

    check-cast v3, Lf3/g1;

    invoke-virtual {v3}, Lf3/g1;->a()Lf3/y1;

    move-result-object v3

    invoke-static {v0, p0, p1, v3}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    .line 7
    :cond_3
    invoke-virtual {p0}, Lf3/t1;->e0()V

    return v2

    :cond_4
    return v3
.end method

.method private final k(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    .line 3
    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1, v0}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    .line 4
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    if-eq v1, p1, :cond_1

    .line 5
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-static {p1, v1}, Lo2/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final k0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    instance-of v0, p1, Lf3/t1$c;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lf3/t1$c;

    invoke-virtual {p1}, Lf3/t1$c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lf3/t1$c;->g()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Lf3/h1;

    if-eqz v0, :cond_3

    check-cast p1, Lf3/h1;

    invoke-interface {p1}, Lf3/h1;->isActive()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    .line 5
    :cond_3
    instance-of p1, p1, Lf3/y;

    if-eqz p1, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method

.method public static synthetic m0(Lf3/t1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lf3/t1;->l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: toCancellationException"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final o0(Lf3/h1;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    sget-object v0, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {p2}, Lf3/u1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p1, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf3/t1;->c0(Ljava/lang/Throwable;)V

    .line 3
    invoke-virtual {p0, p2}, Lf3/t1;->d0(Ljava/lang/Object;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lf3/t1;->D(Lf3/h1;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final p0(Lf3/h1;Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lf3/t1;->M(Lf3/h1;)Lf3/y1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    new-instance v2, Lf3/t1$c;

    invoke-direct {v2, v0, v1, p2}, Lf3/t1$c;-><init>(Lf3/y1;ZLjava/lang/Throwable;)V

    .line 3
    sget-object v3, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, p1, v2}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    .line 4
    :cond_1
    invoke-direct {p0, v0, p2}, Lf3/t1;->a0(Lf3/y1;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method private final q(Lq2/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lf3/t1$a;

    invoke-static {p1}, Lr2/b;->b(Lq2/d;)Lq2/d;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lf3/t1$a;-><init>(Lq2/d;Lf3/t1;)V

    .line 2
    invoke-virtual {v0}, Lf3/m;->v()V

    .line 3
    new-instance v1, Lf3/c2;

    invoke-direct {v1, v0}, Lf3/c2;-><init>(Lf3/m;)V

    invoke-virtual {p0, v1}, Lf3/t1;->S(Lx2/l;)Lf3/w0;

    move-result-object v1

    invoke-static {v0, v1}, Lf3/n;->a(Lf3/l;Lf3/w0;)V

    .line 4
    invoke-virtual {v0}, Lf3/m;->s()Ljava/lang/Object;

    move-result-object v0

    .line 5
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lq2/d;)V

    :cond_0
    return-object v0
.end method

.method private final q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lf3/h1;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    instance-of v0, p1, Lf3/y0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lf3/s1;

    if-eqz v0, :cond_3

    :cond_1
    instance-of v0, p1, Lf3/r;

    if-nez v0, :cond_3

    instance-of v0, p2, Lf3/y;

    if-nez v0, :cond_3

    .line 4
    check-cast p1, Lf3/h1;

    invoke-direct {p0, p1, p2}, Lf3/t1;->o0(Lf3/h1;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object p2

    .line 5
    :cond_2
    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1

    .line 6
    :cond_3
    check-cast p1, Lf3/h1;

    invoke-direct {p0, p1, p2}, Lf3/t1;->r0(Lf3/h1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final r0(Lf3/h1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lf3/t1;->M(Lf3/h1;)Lf3/y1;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1

    .line 2
    :cond_0
    instance-of v1, p1, Lf3/t1$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lf3/t1$c;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Lf3/t1$c;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3, v2}, Lf3/t1$c;-><init>(Lf3/y1;ZLjava/lang/Throwable;)V

    .line 3
    :cond_2
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {v1}, Lf3/t1$c;->g()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p1

    :cond_3
    const/4 v3, 0x1

    .line 5
    :try_start_1
    invoke-virtual {v1, v3}, Lf3/t1$c;->j(Z)V

    if-eq v1, p1, :cond_4

    .line 6
    sget-object v4, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, p0, p1, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object p1

    .line 7
    :cond_4
    :try_start_2
    invoke-virtual {v1}, Lf3/t1$c;->f()Z

    move-result v4

    .line 8
    instance-of v5, p2, Lf3/y;

    if-eqz v5, :cond_5

    move-object v5, p2

    check-cast v5, Lf3/y;

    goto :goto_1

    :cond_5
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    iget-object v5, v5, Lf3/y;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Lf3/t1$c;->b(Ljava/lang/Throwable;)V

    .line 9
    :goto_2
    invoke-virtual {v1}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object v5

    xor-int/2addr v3, v4

    if-eqz v3, :cond_7

    move-object v2, v5

    .line 10
    :cond_7
    sget-object v3, Lo2/r;->a:Lo2/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    if-nez v2, :cond_8

    goto :goto_3

    .line 11
    :cond_8
    invoke-direct {p0, v0, v2}, Lf3/t1;->a0(Lf3/y1;Ljava/lang/Throwable;)V

    .line 12
    :goto_3
    invoke-direct {p0, p1}, Lf3/t1;->H(Lf3/h1;)Lf3/r;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 13
    invoke-direct {p0, v1, p1, p2}, Lf3/t1;->s0(Lf3/t1$c;Lf3/r;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 14
    sget-object p1, Lf3/u1;->b:Lkotlinx/coroutines/internal/t;

    return-object p1

    .line 15
    :cond_9
    invoke-direct {p0, v1, p2}, Lf3/t1;->G(Lf3/t1$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v1

    throw p1
.end method

.method private final s0(Lf3/t1$c;Lf3/r;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    :cond_0
    iget-object v0, p2, Lf3/r;->e:Lf3/s;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    new-instance v3, Lf3/t1$b;

    invoke-direct {v3, p0, p1, p2, p3}, Lf3/t1$b;-><init>(Lf3/t1;Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 3
    invoke-static/range {v0 .. v5}, Lf3/m1$a;->d(Lf3/m1;ZZLx2/l;ILjava/lang/Object;)Lf3/w0;

    move-result-object v0

    .line 4
    sget-object v1, Lf3/z1;->a:Lf3/z1;

    if-eq v0, v1, :cond_1

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_1
    invoke-direct {p0, p2}, Lf3/t1;->Z(Lkotlinx/coroutines/internal/k;)Lf3/r;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method private final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    :cond_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/h1;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lf3/t1$c;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lf3/t1$c;

    invoke-virtual {v1}, Lf3/t1$c;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    new-instance v1, Lf3/y;

    invoke-direct {p0, p1}, Lf3/t1;->F(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lf3/y;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    .line 4
    invoke-direct {p0, v0, v1}, Lf3/t1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 5
    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-object v0

    .line 6
    :cond_2
    :goto_0
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    return-object p1
.end method

.method private final z(Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf3/t1;->U()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 3
    invoke-virtual {p0}, Lf3/t1;->N()Lf3/q;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 4
    sget-object v3, Lf3/z1;->a:Lf3/z1;

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-interface {v2, p1}, Lf3/q;->e(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method


# virtual methods
.method protected A()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public B(Ljava/util/concurrent/CancellationException;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    new-instance v0, Lf3/n1;

    invoke-static {p0}, Lf3/t1;->c(Lf3/t1;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    move-object p1, v0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lf3/t1;->x(Ljava/lang/Throwable;)V

    return-void
.end method

.method public C(Ljava/lang/Throwable;)Z
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lf3/t1;->w(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lf3/t1;->K()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final N()Lf3/q;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf3/t1;->_parentHandle:Ljava/lang/Object;

    check-cast v0, Lf3/q;

    return-object v0
.end method

.method public final O()Ljava/lang/Object;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lf3/t1;->_state:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Lkotlinx/coroutines/internal/q;

    if-nez v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    check-cast v0, Lkotlinx/coroutines/internal/q;

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected P(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public Q(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    throw p1
.end method

.method protected final R(Lf3/m1;)V
    .locals 1
    .param p1    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 1
    sget-object p1, Lf3/z1;->a:Lf3/z1;

    invoke-virtual {p0, p1}, Lf3/t1;->i0(Lf3/q;)V

    return-void

    .line 2
    :cond_0
    invoke-interface {p1}, Lf3/m1;->start()Z

    .line 3
    invoke-interface {p1, p0}, Lf3/m1;->a(Lf3/s;)Lf3/q;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Lf3/t1;->i0(Lf3/q;)V

    .line 5
    invoke-virtual {p0}, Lf3/t1;->T()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-interface {p1}, Lf3/w0;->b()V

    .line 7
    sget-object p1, Lf3/z1;->a:Lf3/z1;

    invoke-virtual {p0, p1}, Lf3/t1;->i0(Lf3/q;)V

    :cond_1
    return-void
.end method

.method public final S(Lx2/l;)Lf3/w0;
    .locals 2
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)",
            "Lf3/w0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lf3/t1;->r(ZZLx2/l;)Lf3/w0;

    move-result-object p1

    return-object p1
.end method

.method public final T()Z
    .locals 1

    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lf3/h1;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final W(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-direct {p0, v0, p1}, Lf3/t1;->q0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 4
    invoke-static {}, Lf3/u1;->b()Lkotlinx/coroutines/internal/t;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Job "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-direct {p0, p1}, Lf3/t1;->I(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    .line 8
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lf3/l0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lf3/s;)Lf3/q;
    .locals 6
    .param p1    # Lf3/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v3, Lf3/r;

    invoke-direct {v3, p1}, Lf3/r;-><init>(Lf3/s;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lf3/m1$a;->d(Lf3/m1;ZZLx2/l;ILjava/lang/Object;)Lf3/w0;

    move-result-object p1

    check-cast p1, Lf3/q;

    return-object p1
.end method

.method public final b(Lf3/b2;)V
    .locals 0
    .param p1    # Lf3/b2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lf3/t1;->w(Ljava/lang/Object;)Z

    return-void
.end method

.method protected c0(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method protected d0(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method protected e0()V
    .locals 0

    return-void
.end method

.method public fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lx2/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lx2/p<",
            "-TR;-",
            "Lq2/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lf3/m1$a;->b(Lf3/m1;Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lq2/g$c;)Lq2/g$b;
    .locals 0
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lq2/g$b;",
            ">(",
            "Lq2/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lf3/m1$a;->c(Lf3/m1;Lq2/g$c;)Lq2/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq2/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq2/g$c<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lf3/m1;->P:Lf3/m1$b;

    return-object v0
.end method

.method public final h0(Lf3/s1;)V
    .locals 3
    .param p1    # Lf3/s1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    :cond_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/s1;

    if-eqz v1, :cond_2

    if-eq v0, p1, :cond_1

    return-void

    .line 3
    :cond_1
    sget-object v1, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Lf3/u1;->c()Lf3/y0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 4
    :cond_2
    instance-of v1, v0, Lf3/h1;

    if-eqz v1, :cond_3

    .line 5
    check-cast v0, Lf3/h1;

    invoke-interface {v0}, Lf3/h1;->a()Lf3/y1;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/k;->o()Z

    :cond_3
    return-void
.end method

.method public final i0(Lf3/q;)V
    .locals 0
    .param p1    # Lf3/q;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lf3/t1;->_parentHandle:Ljava/lang/Object;

    return-void
.end method

.method public isActive()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/h1;

    if-eqz v1, :cond_0

    check-cast v0, Lf3/h1;

    invoke-interface {v0}, Lf3/h1;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected l(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method protected final l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 2
    new-instance v0, Lf3/n1;

    if-nez p2, :cond_1

    invoke-static {p0}, Lf3/t1;->c(Lf3/t1;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-direct {v0, p2, p1, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    :cond_2
    return-object v0
.end method

.method public minusKey(Lq2/g$c;)Lq2/g;
    .locals 0
    .param p1    # Lq2/g$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/g$c<",
            "*>;)",
            "Lq2/g;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1}, Lf3/m1$a;->e(Lf3/m1;Lq2/g$c;)Lq2/g;

    move-result-object p1

    return-object p1
.end method

.method public final n0()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lf3/t1;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, Lf3/t1;->k0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lq2/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    :cond_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/h1;

    if-nez v1, :cond_2

    .line 3
    instance-of p1, v0, Lf3/y;

    if-nez p1, :cond_1

    .line 4
    invoke-static {v0}, Lf3/u1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 5
    :cond_1
    check-cast v0, Lf3/y;

    iget-object p1, v0, Lf3/y;->a:Ljava/lang/Throwable;

    .line 6
    throw p1

    .line 7
    :cond_2
    invoke-direct {p0, v0}, Lf3/t1;->j0(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 8
    invoke-direct {p0, p1}, Lf3/t1;->q(Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lq2/g;)Lq2/g;
    .locals 0
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0, p1}, Lf3/m1$a;->f(Lf3/m1;Lq2/g;)Lq2/g;

    move-result-object p1

    return-object p1
.end method

.method public final r(ZZLx2/l;)Lf3/w0;
    .locals 6
    .param p3    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)",
            "Lf3/w0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-direct {p0, p3, p1}, Lf3/t1;->X(Lx2/l;Z)Lf3/s1;

    move-result-object v0

    .line 2
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v1

    .line 3
    instance-of v2, v1, Lf3/y0;

    if-eqz v2, :cond_2

    .line 4
    move-object v2, v1

    check-cast v2, Lf3/y0;

    invoke-virtual {v2}, Lf3/y0;->isActive()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    sget-object v2, Lf3/t1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 6
    :cond_1
    invoke-direct {p0, v2}, Lf3/t1;->f0(Lf3/y0;)V

    goto :goto_0

    .line 7
    :cond_2
    instance-of v2, v1, Lf3/h1;

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    .line 8
    move-object v2, v1

    check-cast v2, Lf3/h1;

    invoke-interface {v2}, Lf3/h1;->a()Lf3/y1;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    .line 9
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Lf3/s1;

    invoke-direct {p0, v1}, Lf3/t1;->g0(Lf3/s1;)V

    goto :goto_0

    .line 10
    :cond_3
    sget-object v4, Lf3/z1;->a:Lf3/z1;

    if-eqz p1, :cond_8

    .line 11
    instance-of v5, v1, Lf3/t1$c;

    if-eqz v5, :cond_8

    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    move-object v3, v1

    check-cast v3, Lf3/t1$c;

    invoke-virtual {v3}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 14
    instance-of v5, p3, Lf3/r;

    if-eqz v5, :cond_7

    .line 15
    move-object v5, v1

    check-cast v5, Lf3/t1$c;

    invoke-virtual {v5}, Lf3/t1$c;->g()Z

    move-result v5

    if-nez v5, :cond_7

    .line 16
    :cond_4
    invoke-direct {p0, v1, v2, v0}, Lf3/t1;->j(Ljava/lang/Object;Lf3/y1;Lf3/s1;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    monitor-exit v1

    goto :goto_0

    :cond_5
    if-nez v3, :cond_6

    .line 17
    monitor-exit v1

    return-object v0

    :cond_6
    move-object v4, v0

    .line 18
    :cond_7
    :try_start_1
    sget-object v5, Lo2/r;->a:Lo2/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_1
    if-eqz v3, :cond_a

    if-eqz p2, :cond_9

    .line 19
    invoke-interface {p3, v3}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object v4

    .line 20
    :cond_a
    invoke-direct {p0, v1, v2, v0}, Lf3/t1;->j(Ljava/lang/Object;Lf3/y1;Lf3/s1;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_b
    if-eqz p2, :cond_e

    .line 21
    instance-of p1, v1, Lf3/y;

    if-eqz p1, :cond_c

    check-cast v1, Lf3/y;

    goto :goto_2

    :cond_c
    move-object v1, v3

    :goto_2
    if-nez v1, :cond_d

    goto :goto_3

    :cond_d
    iget-object v3, v1, Lf3/y;->a:Ljava/lang/Throwable;

    .line 22
    :goto_3
    invoke-interface {p3, v3}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_e
    sget-object p1, Lf3/z1;->a:Lf3/z1;

    return-object p1
.end method

.method public s()Ljava/util/concurrent/CancellationException;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/t1$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lf3/t1$c;

    invoke-virtual {v1}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    .line 3
    :cond_0
    instance-of v1, v0, Lf3/y;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lf3/y;

    iget-object v1, v1, Lf3/y;->a:Ljava/lang/Throwable;

    goto :goto_0

    .line 4
    :cond_1
    instance-of v1, v0, Lf3/h1;

    if-nez v1, :cond_4

    move-object v1, v2

    .line 5
    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Lf3/n1;

    invoke-direct {p0, v0}, Lf3/t1;->k0(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    :cond_3
    return-object v2

    :cond_4
    const-string v1, "Cannot be cancelling child in this state: "

    .line 6
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final start()Z
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-direct {p0, v0}, Lf3/t1;->j0(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lf3/t1;->n0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lf3/l0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/util/concurrent/CancellationException;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/t1$c;

    const-string v2, "Job is still new or active: "

    if-eqz v1, :cond_1

    check-cast v0, Lf3/t1$c;

    invoke-virtual {v0}, Lf3/t1$c;->e()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lf3/l0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " is cancelling"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lf3/t1;->l0(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v2, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 4
    :cond_1
    instance-of v1, v0, Lf3/h1;

    if-nez v1, :cond_3

    .line 5
    instance-of v1, v0, Lf3/y;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lf3/y;

    iget-object v0, v0, Lf3/y;->a:Ljava/lang/Throwable;

    const/4 v1, 0x1

    invoke-static {p0, v0, v2, v1, v2}, Lf3/t1;->m0(Lf3/t1;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Lf3/n1;

    invoke-static {p0}, Lf3/l0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Lf3/n1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lf3/m1;)V

    :goto_0
    return-object v0

    .line 7
    :cond_3
    invoke-static {v2, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final v(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lf3/t1;->w(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final w(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lf3/t1;->L()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lf3/t1;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    sget-object v1, Lf3/u1;->b:Lkotlinx/coroutines/internal/t;

    if-ne v0, v1, :cond_0

    return v2

    .line 5
    :cond_0
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lf3/t1;->V(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 7
    :cond_1
    invoke-static {}, Lf3/u1;->a()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    if-ne v0, p1, :cond_2

    goto :goto_0

    .line 8
    :cond_2
    sget-object p1, Lf3/u1;->b:Lkotlinx/coroutines/internal/t;

    if-ne v0, p1, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {}, Lf3/u1;->f()Lkotlinx/coroutines/internal/t;

    move-result-object p1

    if-ne v0, p1, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    .line 10
    :cond_4
    invoke-virtual {p0, v0}, Lf3/t1;->l(Ljava/lang/Object;)V

    :goto_0
    return v2
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lf3/t1;->w(Ljava/lang/Object;)Z

    return-void
.end method
