.class final Landroidx/room/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/room/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/room/a;


# direct methods
.method constructor <init>(Landroidx/room/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;[Ljava/lang/Object;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/room/f$a;->o(Ljava/lang/String;[Ljava/lang/Object;Ls0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Landroidx/room/f$a;->n(Ljava/lang/String;Ls0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ls0/b;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Landroidx/room/f$a;->q(Ls0/b;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Landroidx/room/f$a;->r(Ls0/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n(Ljava/lang/String;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0}, Ls0/b;->h(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic o(Ljava/lang/String;[Ljava/lang/Object;Ls0/b;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p0, p1}, Ls0/b;->z(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic q(Ls0/b;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p0}, Ls0/b;->v()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic r(Ls0/b;)Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->e()Ls0/b;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-interface {v0}, Ls0/b;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v1}, Landroidx/room/a;->b()V

    .line 4
    throw v0
.end method

.method public D(Ls0/e;)Landroid/database/Cursor;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->e()Ls0/b;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ls0/b;->D(Ls0/e;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance v0, Landroidx/room/f$c;

    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-direct {v0, p1, v1}, Landroidx/room/f$c;-><init>(Landroid/database/Cursor;Landroidx/room/a;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 4
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->b()V

    .line 5
    throw p1
.end method

.method public E(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->e()Ls0/b;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1, p2}, Ls0/b;->E(Ls0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance p2, Landroidx/room/f$c;

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-direct {p2, p1, v0}, Landroidx/room/f$c;-><init>(Landroid/database/Cursor;Landroidx/room/a;)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 4
    iget-object p2, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {p2}, Landroidx/room/a;->b()V

    .line 5
    throw p1
.end method

.method public H(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->e()Ls0/b;

    move-result-object v0

    .line 2
    invoke-interface {v0, p1}, Ls0/b;->H(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    new-instance v0, Landroidx/room/f$c;

    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-direct {v0, p1, v1}, Landroidx/room/f$c;-><init>(Landroid/database/Cursor;Landroidx/room/a;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 4
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->b()V

    .line 5
    throw p1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->a()V

    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->d()Ls0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->d()Ls0/b;

    move-result-object v0

    invoke-interface {v0}, Ls0/b;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v1}, Landroidx/room/a;->b()V

    .line 4
    throw v0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "End transaction called but delegateDb is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->e()Ls0/b;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-interface {v0}, Ls0/b;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v1}, Landroidx/room/a;->b()V

    .line 4
    throw v0
.end method

.method public g()Ljava/util/List;
    .locals 2
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

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    sget-object v1, Lp0/a;->a:Lp0/a;

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    sget-object v1, Lp0/b;->a:Lp0/b;

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    new-instance v1, Landroidx/room/b;

    invoke-direct {v1, p1}, Landroidx/room/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    return-void
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->d()Ls0/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-interface {v0}, Ls0/b;->isOpen()Z

    move-result v0

    return v0
.end method

.method public j(Ljava/lang/String;)Ls0/f;
    .locals 2

    new-instance v0, Landroidx/room/f$b;

    iget-object v1, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-direct {v0, p1, v1}, Landroidx/room/f$b;-><init>(Ljava/lang/String;Landroidx/room/a;)V

    return-object v0
.end method

.method public p()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->d()Ls0/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    sget-object v1, Lp0/c;->a:Lp0/c;

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method s()V
    .locals 2

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    sget-object v1, Landroidx/room/e;->a:Landroidx/room/e;

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    return-void
.end method

.method public v()Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeNewApiCall"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    sget-object v1, Landroidx/room/d;->a:Landroidx/room/d;

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    invoke-virtual {v0}, Landroidx/room/a;->d()Ls0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ls0/b;->x()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setTransactionSuccessful called but delegateDb is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public z(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/f$a;->a:Landroidx/room/a;

    new-instance v1, Landroidx/room/c;

    invoke-direct {v1, p1, p2}, Landroidx/room/c;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroidx/room/a;->c(Lj/a;)Ljava/lang/Object;

    return-void
.end method
