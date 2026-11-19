.class final Landroidx/room/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/f;


# instance fields
.field private final a:Ls0/f;

.field private final b:Landroidx/room/h0$f;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>(Ls0/f;Landroidx/room/h0$f;Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/room/f0;->d:Ljava/util/List;

    .line 3
    iput-object p1, p0, Landroidx/room/f0;->a:Ls0/f;

    .line 4
    iput-object p2, p0, Landroidx/room/f0;->b:Landroidx/room/h0$f;

    .line 5
    iput-object p3, p0, Landroidx/room/f0;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Landroidx/room/f0;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Landroidx/room/f0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/f0;->d()V

    return-void
.end method

.method public static synthetic b(Landroidx/room/f0;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/f0;->m()V

    return-void
.end method

.method private synthetic d()V
    .locals 3

    iget-object v0, p0, Landroidx/room/f0;->b:Landroidx/room/h0$f;

    iget-object v1, p0, Landroidx/room/f0;->c:Ljava/lang/String;

    iget-object v2, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private synthetic m()V
    .locals 3

    iget-object v0, p0, Landroidx/room/f0;->b:Landroidx/room/h0$f;

    iget-object v1, p0, Landroidx/room/f0;->c:Ljava/lang/String;

    iget-object v2, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Landroidx/room/h0$f;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private n(ILjava/lang/Object;)V
    .locals 3

    add-int/lit8 p1, p1, -0x1

    .line 1
    iget-object v0, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-gt v0, p1, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/room/f0;->d:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public C(I[B)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/room/f0;->n(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0, p1, p2}, Ls0/d;->C(I[B)V

    return-void
.end method

.method public G()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/d0;

    invoke-direct {v1, p0}, Landroidx/room/d0;-><init>(Landroidx/room/f0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0}, Ls0/f;->G()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/room/f0;->n(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0, p1, p2}, Ls0/d;->c(ILjava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public i()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/f0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/e0;

    invoke-direct {v1, p0}, Landroidx/room/e0;-><init>(Landroidx/room/f0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0}, Ls0/f;->i()I

    move-result v0

    return v0
.end method

.method public k(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/f0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroidx/room/f0;->n(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0, p1}, Ls0/d;->k(I)V

    return-void
.end method

.method public l(ID)V
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroidx/room/f0;->n(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0, p1, p2, p3}, Ls0/d;->l(ID)V

    return-void
.end method

.method public w(IJ)V
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Landroidx/room/f0;->n(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Landroidx/room/f0;->a:Ls0/f;

    invoke-interface {v0, p1, p2, p3}, Ls0/d;->w(IJ)V

    return-void
.end method
