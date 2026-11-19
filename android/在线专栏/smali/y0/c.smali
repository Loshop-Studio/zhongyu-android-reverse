.class public Ly0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/q;


# instance fields
.field private final c:Landroidx/lifecycle/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/s<",
            "Lx0/q$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroidx/work/impl/utils/futures/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/work/impl/utils/futures/d<",
            "Lx0/q$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/s;

    invoke-direct {v0}, Landroidx/lifecycle/s;-><init>()V

    iput-object v0, p0, Ly0/c;->c:Landroidx/lifecycle/s;

    .line 3
    invoke-static {}, Landroidx/work/impl/utils/futures/d;->s()Landroidx/work/impl/utils/futures/d;

    move-result-object v0

    iput-object v0, p0, Ly0/c;->d:Landroidx/work/impl/utils/futures/d;

    .line 4
    sget-object v0, Lx0/q;->b:Lx0/q$b$b;

    invoke-virtual {p0, v0}, Ly0/c;->b(Lx0/q$b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Lx0/q$b$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/c;->d:Landroidx/work/impl/utils/futures/d;

    return-object v0
.end method

.method public b(Lx0/q$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/c;->c:Landroidx/lifecycle/s;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/s;->postValue(Ljava/lang/Object;)V

    .line 2
    instance-of v0, p1, Lx0/q$b$c;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Ly0/c;->d:Landroidx/work/impl/utils/futures/d;

    check-cast p1, Lx0/q$b$c;

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/d;->o(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lx0/q$b$a;

    if-eqz v0, :cond_1

    .line 5
    check-cast p1, Lx0/q$b$a;

    .line 6
    iget-object v0, p0, Ly0/c;->d:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {p1}, Lx0/q$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/d;->p(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
