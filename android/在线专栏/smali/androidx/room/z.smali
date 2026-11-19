.class final Landroidx/room/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/b;


# instance fields
.field private final a:Ls0/b;

.field private final b:Landroidx/room/h0$f;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ls0/b;Landroidx/room/h0$f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/z;->a:Ls0/b;

    .line 3
    iput-object p2, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 4
    iput-object p3, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private synthetic B(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0, p1, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic I(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    invoke-interface {v0, p1, p2}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic J(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v0, p1, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic K(Ls0/e;Landroidx/room/c0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    invoke-interface {p1}, Ls0/e;->a()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p2}, Landroidx/room/c0;->a()Ljava/util/List;

    move-result-object p2

    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic L(Ls0/e;Landroidx/room/c0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    invoke-interface {p1}, Ls0/e;->a()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p2}, Landroidx/room/c0;->a()Ljava/util/List;

    move-result-object p2

    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic M()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, "TRANSACTION SUCCESSFUL"

    .line 3
    invoke-interface {v0, v2, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Landroidx/room/z;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z;->y()V

    return-void
.end method

.method public static synthetic b(Landroidx/room/z;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z;->u()V

    return-void
.end method

.method public static synthetic d(Landroidx/room/z;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z;->M()V

    return-void
.end method

.method public static synthetic m(Landroidx/room/z;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/room/z;->I(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic n(Landroidx/room/z;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/z;->B(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/room/z;->K(Ls0/e;Landroidx/room/c0;)V

    return-void
.end method

.method public static synthetic q(Landroidx/room/z;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/room/z;->J(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/room/z;->L(Ls0/e;Landroidx/room/c0;)V

    return-void
.end method

.method public static synthetic s(Landroidx/room/z;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z;->t()V

    return-void
.end method

.method private synthetic t()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, "BEGIN EXCLUSIVE TRANSACTION"

    .line 3
    invoke-interface {v0, v2, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic u()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, "BEGIN DEFERRED TRANSACTION"

    .line 3
    invoke-interface {v0, v2, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic y()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const-string v2, "END TRANSACTION"

    .line 3
    invoke-interface {v0, v2, v1}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/r;

    invoke-direct {v1, p0}, Landroidx/room/r;-><init>(Landroidx/room/z;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->A()V

    return-void
.end method

.method public D(Ls0/e;)Landroid/database/Cursor;
    .locals 3

    .line 1
    new-instance v0, Landroidx/room/c0;

    invoke-direct {v0}, Landroidx/room/c0;-><init>()V

    .line 2
    invoke-interface {p1, v0}, Ls0/e;->b(Ls0/d;)V

    .line 3
    iget-object v1, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/room/x;

    invoke-direct {v2, p0, p1, v0}, Landroidx/room/x;-><init>(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0, p1}, Ls0/b;->D(Ls0/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public E(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 2

    .line 1
    new-instance p2, Landroidx/room/c0;

    invoke-direct {p2}, Landroidx/room/c0;-><init>()V

    .line 2
    invoke-interface {p1, p2}, Ls0/e;->b(Ls0/d;)V

    .line 3
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/y;

    invoke-direct {v1, p0, p1, p2}, Landroidx/room/y;-><init>(Landroidx/room/z;Ls0/e;Landroidx/room/c0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    iget-object p2, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {p2, p1}, Ls0/b;->D(Ls0/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public H(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/v;

    invoke-direct {v1, p0, p1}, Landroidx/room/v;-><init>(Landroidx/room/z;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0, p1}, Ls0/b;->H(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/q;

    invoke-direct {v1, p0}, Landroidx/room/q;-><init>(Landroidx/room/z;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->e()V

    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/t;

    invoke-direct {v1, p0}, Landroidx/room/t;-><init>(Landroidx/room/z;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->f()V

    return-void
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/u;

    invoke-direct {v1, p0, p1}, Landroidx/room/u;-><init>(Landroidx/room/z;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0, p1}, Ls0/b;->h(Ljava/lang/String;)V

    return-void
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->isOpen()Z

    move-result v0

    return v0
.end method

.method public j(Ljava/lang/String;)Ls0/f;
    .locals 4

    new-instance v0, Landroidx/room/f0;

    iget-object v1, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v1, p1}, Ls0/b;->j(Ljava/lang/String;)Ls0/f;

    move-result-object v1

    iget-object v2, p0, Landroidx/room/z;->b:Landroidx/room/h0$f;

    iget-object v3, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p1, v3}, Landroidx/room/f0;-><init>(Ls0/f;Landroidx/room/h0$f;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->p()Z

    move-result v0

    return v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->v()Z

    move-result v0

    return v0
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/s;

    invoke-direct {v1, p0}, Landroidx/room/s;-><init>(Landroidx/room/z;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ls0/b;->x()V

    return-void
.end method

.method public z(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object p2, p0, Landroidx/room/z;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/w;

    invoke-direct {v1, p0, p1, v0}, Landroidx/room/w;-><init>(Landroidx/room/z;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    iget-object p2, p0, Landroidx/room/z;->a:Ls0/b;

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Ls0/b;->z(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
