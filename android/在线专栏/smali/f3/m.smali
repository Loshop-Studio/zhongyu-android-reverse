.class public Lf3/m;
.super Lf3/t0;
.source "SourceFile"

# interfaces
.implements Lf3/l;
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/t0<",
        "TT;>;",
        "Lf3/l<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/e;"
    }
.end annotation


# static fields
.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field private static final synthetic h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile synthetic _state:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lq2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq2/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final e:Lq2/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private f:Lf3/w0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lf3/m;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lf3/m;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Lf3/m;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_state"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lq2/d;I)V
    .locals 0
    .param p1    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq2/d<",
            "-TT;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lf3/t0;-><init>(I)V

    .line 2
    iput-object p1, p0, Lf3/m;->d:Lq2/d;

    .line 3
    invoke-interface {p1}, Lq2/d;->getContext()Lq2/g;

    move-result-object p1

    iput-object p1, p0, Lf3/m;->e:Lq2/g;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lf3/m;->_decision:I

    .line 5
    sget-object p1, Lf3/d;->a:Lf3/d;

    iput-object p1, p0, Lf3/m;->_state:Ljava/lang/Object;

    return-void
.end method

.method private final A(Lx2/l;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "It\'s prohibited to register multiple handlers, tried to register "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", already has "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    instance-of v1, v0, Lkotlinx/coroutines/internal/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/e;->o(Lf3/l;)Ljava/lang/Throwable;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_2

    return-void

    .line 2
    :cond_2
    invoke-virtual {p0}, Lf3/m;->o()V

    .line 3
    invoke-virtual {p0, v2}, Lf3/m;->g(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private final E(Ljava/lang/Object;ILx2/l;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, Lf3/m;->_state:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Lf3/a2;

    if-eqz v1, :cond_1

    .line 3
    move-object v3, v0

    check-cast v3, Lf3/a2;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lf3/m;->G(Lf3/a2;Ljava/lang/Object;ILx2/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 4
    sget-object v2, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v0, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0}, Lf3/m;->p()V

    .line 6
    invoke-direct {p0, p2}, Lf3/m;->q(I)V

    return-void

    .line 7
    :cond_1
    instance-of p2, v0, Lf3/o;

    if-eqz p2, :cond_3

    .line 8
    check-cast v0, Lf3/o;

    invoke-virtual {v0}, Lf3/o;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    if-nez p3, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    iget-object p1, v0, Lf3/y;->a:Ljava/lang/Throwable;

    invoke-virtual {p0, p3, p1}, Lf3/m;->m(Lx2/l;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    .line 10
    :cond_3
    invoke-direct {p0, p1}, Lf3/m;->j(Ljava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lo2/d;

    invoke-direct {p1}, Lo2/d;-><init>()V

    throw p1
.end method

.method static synthetic F(Lf3/m;Ljava/lang/Object;ILx2/l;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf3/m;->E(Ljava/lang/Object;ILx2/l;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resumeImpl"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final G(Lf3/a2;Ljava/lang/Object;ILx2/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/a2;",
            "Ljava/lang/Object;",
            "I",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lf3/y;

    if-eqz v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    invoke-static {p3}, Lf3/u0;->b(I)Z

    move-result p3

    if-nez p3, :cond_1

    if-nez p5, :cond_1

    goto :goto_2

    :cond_1
    if-nez p4, :cond_3

    .line 3
    instance-of p3, p1, Lf3/j;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz p5, :cond_5

    .line 4
    :cond_3
    :goto_0
    new-instance p3, Lf3/x;

    instance-of v0, p1, Lf3/j;

    if-eqz v0, :cond_4

    check-cast p1, Lf3/j;

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    move-object v2, p1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p3

    move-object v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v7}, Lf3/x;-><init>(Ljava/lang/Object;Lf3/j;Lx2/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    move-object p2, p3

    :cond_5
    :goto_2
    return-object p2
.end method

.method private final H()Z
    .locals 4

    .line 1
    :cond_0
    iget v0, p0, Lf3/m;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    sget-object v0, Lf3/m;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final I()Z
    .locals 3

    .line 1
    :cond_0
    iget v0, p0, Lf3/m;->_decision:I

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    return v1

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already suspended"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_2
    sget-object v0, Lf3/m;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 1

    const-string v0, "Already resumed, but proposed with update "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l(Lx2/l;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lf3/m;->getContext()Lq2/g;

    move-result-object p2

    .line 3
    new-instance v0, Lf3/b0;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-static {v1, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-static {p2, v0}, Lf3/g0;->a(Lq2/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private final n(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lf3/m;->y()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    check-cast v0, Lkotlinx/coroutines/internal/e;

    .line 3
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/e;->m(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method private final p()V
    .locals 1

    invoke-direct {p0}, Lf3/m;->y()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf3/m;->o()V

    :cond_0
    return-void
.end method

.method private final q(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf3/m;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0, p1}, Lf3/u0;->a(Lf3/t0;I)V

    return-void
.end method

.method private final u()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf3/m;->t()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lf3/a2;

    if-eqz v1, :cond_0

    const-string v0, "Active"

    goto :goto_0

    .line 3
    :cond_0
    instance-of v0, v0, Lf3/o;

    if-eqz v0, :cond_1

    const-string v0, "Cancelled"

    goto :goto_0

    :cond_1
    const-string v0, "Completed"

    :goto_0
    return-object v0
.end method

.method private final w()Lf3/w0;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lf3/m;->getContext()Lq2/g;

    move-result-object v0

    sget-object v1, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {v0, v1}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf3/m1;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2
    new-instance v4, Lf3/p;

    invoke-direct {v4, p0}, Lf3/p;-><init>(Lf3/m;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    .line 3
    invoke-static/range {v1 .. v6}, Lf3/m1$a;->d(Lf3/m1;ZZLx2/l;ILjava/lang/Object;)Lf3/w0;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lf3/m;->f:Lf3/w0;

    return-object v0
.end method

.method private final y()Z
    .locals 1

    iget v0, p0, Lf3/t0;->c:I

    invoke-static {v0}, Lf3/u0;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    check-cast v0, Lkotlinx/coroutines/internal/e;

    invoke-virtual {v0}, Lkotlinx/coroutines/internal/e;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final z(Lx2/l;)Lf3/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lo2/r;",
            ">;)",
            "Lf3/j;"
        }
    .end annotation

    instance-of v0, p1, Lf3/j;

    if-eqz v0, :cond_0

    check-cast p1, Lf3/j;

    goto :goto_0

    :cond_0
    new-instance v0, Lf3/j1;

    invoke-direct {v0, p1}, Lf3/j1;-><init>(Lx2/l;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method


# virtual methods
.method protected B()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "CancellableContinuation"

    return-object v0
.end method

.method public final C(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lf3/m;->n(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lf3/m;->g(Ljava/lang/Throwable;)Z

    .line 3
    invoke-direct {p0}, Lf3/m;->p()V

    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    :cond_0
    iget-object p1, p0, Lf3/m;->_state:Ljava/lang/Object;

    .line 2
    instance-of v0, p1, Lf3/a2;

    if-nez v0, :cond_4

    .line 3
    instance-of v0, p1, Lf3/y;

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    instance-of v0, p1, Lf3/x;

    if-eqz v0, :cond_3

    .line 5
    move-object v0, p1

    check-cast v0, Lf3/x;

    invoke-virtual {v0}, Lf3/x;->c()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, v0

    move-object v6, p2

    .line 6
    invoke-static/range {v1 .. v8}, Lf3/x;->b(Lf3/x;Ljava/lang/Object;Lf3/j;Lx2/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lf3/x;

    move-result-object v1

    .line 7
    sget-object v2, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, p1, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {v0, p0, p2}, Lf3/x;->d(Lf3/m;Ljava/lang/Throwable;)V

    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must be called at most once"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_3
    sget-object v8, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    new-instance v9, Lf3/x;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v0, v9

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lf3/x;-><init>(Ljava/lang/Object;Lf3/j;Lx2/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    invoke-static {v8, p0, p1, v9}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 11
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not completed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Lq2/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq2/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-super {p0, p1}, Lf3/t0;->c(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf3/m;->b()Lq2/d;

    :goto_0
    return-object p1
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p1, Lf3/x;

    if-eqz v0, :cond_0

    check-cast p1, Lf3/x;

    iget-object p1, p1, Lf3/x;->a:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public f(Lf3/e0;Ljava/lang/Object;)V
    .locals 6
    .param p1    # Lf3/e0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/e0;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    instance-of v1, v0, Lkotlinx/coroutines/internal/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    iget-object v2, v0, Lkotlinx/coroutines/internal/e;->d:Lf3/e0;

    :goto_1
    if-ne v2, p1, :cond_2

    const/4 p1, 0x4

    const/4 v2, 0x4

    goto :goto_2

    :cond_2
    iget p1, p0, Lf3/t0;->c:I

    move v2, p1

    :goto_2
    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lf3/m;->F(Lf3/m;Ljava/lang/Object;ILx2/l;ILjava/lang/Object;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    :goto_0
    iget-object v0, p0, Lf3/m;->_state:Ljava/lang/Object;

    .line 2
    instance-of v1, v0, Lf3/a2;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    new-instance v1, Lf3/o;

    instance-of v2, v0, Lf3/j;

    invoke-direct {v1, p0, p1, v2}, Lf3/o;-><init>(Lq2/d;Ljava/lang/Throwable;Z)V

    .line 4
    sget-object v3, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v1}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    .line 5
    check-cast v0, Lf3/j;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v0, p1}, Lf3/m;->k(Lf3/j;Ljava/lang/Throwable;)V

    .line 6
    :goto_2
    invoke-direct {p0}, Lf3/m;->p()V

    .line 7
    iget p1, p0, Lf3/t0;->c:I

    invoke-direct {p0, p1}, Lf3/m;->q(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf3/m;->d:Lq2/d;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lq2/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lf3/m;->e:Lq2/g;

    return-object v0
.end method

.method public h(Lx2/l;)V
    .locals 11
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
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lf3/m;->z(Lx2/l;)Lf3/j;

    move-result-object v8

    .line 2
    :cond_0
    :goto_0
    iget-object v9, p0, Lf3/m;->_state:Ljava/lang/Object;

    .line 3
    instance-of v0, v9, Lf3/d;

    if-eqz v0, :cond_1

    .line 4
    sget-object v0, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v8}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_1
    instance-of v0, v9, Lf3/j;

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, v9}, Lf3/m;->A(Lx2/l;Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_2
    instance-of v0, v9, Lf3/y;

    if-eqz v0, :cond_7

    .line 7
    move-object v1, v9

    check-cast v1, Lf3/y;

    invoke-virtual {v1}, Lf3/y;->b()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-direct {p0, p1, v9}, Lf3/m;->A(Lx2/l;Ljava/lang/Object;)V

    .line 8
    :cond_3
    instance-of v2, v9, Lf3/o;

    if-eqz v2, :cond_6

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_5

    goto :goto_2

    .line 9
    :cond_5
    iget-object v2, v1, Lf3/y;->a:Ljava/lang/Throwable;

    :goto_2
    invoke-direct {p0, p1, v2}, Lf3/m;->l(Lx2/l;Ljava/lang/Throwable;)V

    :cond_6
    return-void

    .line 10
    :cond_7
    instance-of v0, v9, Lf3/x;

    if-eqz v0, :cond_a

    .line 11
    move-object v0, v9

    check-cast v0, Lf3/x;

    iget-object v1, v0, Lf3/x;->b:Lf3/j;

    if-eqz v1, :cond_8

    invoke-direct {p0, p1, v9}, Lf3/m;->A(Lx2/l;Ljava/lang/Object;)V

    .line 12
    :cond_8
    invoke-virtual {v0}, Lf3/x;->c()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 13
    iget-object v0, v0, Lf3/x;->e:Ljava/lang/Throwable;

    invoke-direct {p0, p1, v0}, Lf3/m;->l(Lx2/l;Ljava/lang/Throwable;)V

    return-void

    :cond_9
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1d

    const/4 v7, 0x0

    move-object v2, v8

    .line 14
    invoke-static/range {v0 .. v7}, Lf3/x;->b(Lf3/x;Ljava/lang/Object;Lf3/j;Lx2/l;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)Lf3/x;

    move-result-object v0

    .line 15
    sget-object v1, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v9, v0}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 16
    :cond_a
    new-instance v10, Lf3/x;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    move-object v0, v10

    move-object v1, v9

    move-object v2, v8

    invoke-direct/range {v0 .. v7}, Lf3/x;-><init>(Ljava/lang/Object;Lf3/j;Lx2/l;Ljava/lang/Object;Ljava/lang/Throwable;ILkotlin/jvm/internal/g;)V

    .line 17
    sget-object v0, Lf3/m;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, v9, v10}, Landroidx/work/impl/utils/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lf3/m;->t()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lf3/j;Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Lf3/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Lf3/k;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lf3/m;->getContext()Lq2/g;

    move-result-object p2

    .line 3
    new-instance v0, Lf3/b0;

    const-string v1, "Exception in invokeOnCancellation handler for "

    invoke-static {v1, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-static {p2, v0}, Lf3/g0;->a(Lq2/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final m(Lx2/l;Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
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
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-virtual {p0}, Lf3/m;->getContext()Lq2/g;

    move-result-object p2

    .line 3
    new-instance v0, Lf3/b0;

    const-string v1, "Exception in resume onCancellation handler for "

    invoke-static {v1, p0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf3/b0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    invoke-static {p2, v0}, Lf3/g0;->a(Lq2/g;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf3/m;->f:Lf3/w0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Lf3/w0;->b()V

    .line 3
    sget-object v0, Lf3/z1;->a:Lf3/z1;

    iput-object v0, p0, Lf3/m;->f:Lf3/w0;

    return-void
.end method

.method public r(Lf3/m1;)Ljava/lang/Throwable;
    .locals 0
    .param p1    # Lf3/m1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-interface {p1}, Lf3/m1;->u()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-static {p1, p0}, Lf3/c0;->b(Ljava/lang/Object;Lf3/l;)Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lf3/t0;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lf3/m;->F(Lf3/m;Ljava/lang/Object;ILx2/l;ILjava/lang/Object;)V

    return-void
.end method

.method public final s()Ljava/lang/Object;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lf3/m;->y()Z

    move-result v0

    .line 2
    invoke-direct {p0}, Lf3/m;->I()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    iget-object v1, p0, Lf3/m;->f:Lf3/w0;

    if-nez v1, :cond_0

    .line 4
    invoke-direct {p0}, Lf3/m;->w()Lf3/w0;

    :cond_0
    if-eqz v0, :cond_1

    .line 5
    invoke-direct {p0}, Lf3/m;->D()V

    .line 6
    :cond_1
    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    .line 7
    invoke-direct {p0}, Lf3/m;->D()V

    .line 8
    :cond_3
    invoke-virtual {p0}, Lf3/m;->t()Ljava/lang/Object;

    move-result-object v0

    .line 9
    instance-of v1, v0, Lf3/y;

    if-nez v1, :cond_6

    .line 10
    iget v1, p0, Lf3/t0;->c:I

    invoke-static {v1}, Lf3/u0;->b(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 11
    invoke-virtual {p0}, Lf3/m;->getContext()Lq2/g;

    move-result-object v1

    sget-object v2, Lf3/m1;->P:Lf3/m1$b;

    invoke-interface {v1, v2}, Lq2/g;->get(Lq2/g$c;)Lq2/g$b;

    move-result-object v1

    check-cast v1, Lf3/m1;

    if-eqz v1, :cond_5

    .line 12
    invoke-interface {v1}, Lf3/m1;->isActive()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    .line 13
    :cond_4
    invoke-interface {v1}, Lf3/m1;->u()Ljava/util/concurrent/CancellationException;

    move-result-object v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lf3/m;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 15
    throw v1

    .line 16
    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, Lf3/m;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 17
    :cond_6
    check-cast v0, Lf3/y;

    iget-object v0, v0, Lf3/y;->a:Ljava/lang/Throwable;

    .line 18
    throw v0
.end method

.method public final t()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lf3/m;->_state:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lf3/m;->B()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf3/m;->d:Lq2/d;

    invoke-static {v1}, Lf3/l0;->c(Lq2/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "){"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lf3/m;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lf3/l0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lf3/m;->w()Lf3/w0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lf3/m;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v0}, Lf3/w0;->b()V

    .line 4
    sget-object v0, Lf3/z1;->a:Lf3/z1;

    iput-object v0, p0, Lf3/m;->f:Lf3/w0;

    :cond_1
    return-void
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Lf3/m;->t()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lf3/a2;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
