.class Landroidx/room/j0;
.super Landroidx/lifecycle/LiveData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/LiveData<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Landroidx/room/h0;

.field final b:Z

.field final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Landroidx/room/m;

.field final e:Landroidx/room/o$c;

.field final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final i:Ljava/lang/Runnable;

.field final j:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Landroidx/room/h0;Landroidx/room/m;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/h0;",
            "Landroidx/room/m;",
            "Z",
            "Ljava/util/concurrent/Callable<",
            "TT;>;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/LiveData;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Landroidx/room/j0;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Landroidx/room/j0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Landroidx/room/j0;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    new-instance v0, Landroidx/room/j0$a;

    invoke-direct {v0, p0}, Landroidx/room/j0$a;-><init>(Landroidx/room/j0;)V

    iput-object v0, p0, Landroidx/room/j0;->i:Ljava/lang/Runnable;

    .line 6
    new-instance v0, Landroidx/room/j0$b;

    invoke-direct {v0, p0}, Landroidx/room/j0$b;-><init>(Landroidx/room/j0;)V

    iput-object v0, p0, Landroidx/room/j0;->j:Ljava/lang/Runnable;

    .line 7
    iput-object p1, p0, Landroidx/room/j0;->a:Landroidx/room/h0;

    .line 8
    iput-boolean p3, p0, Landroidx/room/j0;->b:Z

    .line 9
    iput-object p4, p0, Landroidx/room/j0;->c:Ljava/util/concurrent/Callable;

    .line 10
    iput-object p2, p0, Landroidx/room/j0;->d:Landroidx/room/m;

    .line 11
    new-instance p1, Landroidx/room/j0$c;

    invoke-direct {p1, p0, p5}, Landroidx/room/j0$c;-><init>(Landroidx/room/j0;[Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/room/j0;->e:Landroidx/room/o$c;

    return-void
.end method

.method static synthetic a(Landroidx/room/j0;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->postValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/room/j0;->b:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/room/j0;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/room/j0;->a:Landroidx/room/h0;

    invoke-virtual {v0}, Landroidx/room/h0;->m()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method protected onActive()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/LiveData;->onActive()V

    .line 2
    iget-object v0, p0, Landroidx/room/j0;->d:Landroidx/room/m;

    invoke-virtual {v0, p0}, Landroidx/room/m;->b(Landroidx/lifecycle/LiveData;)V

    .line 3
    invoke-virtual {p0}, Landroidx/room/j0;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object v1, p0, Landroidx/room/j0;->i:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected onInactive()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/LiveData;->onInactive()V

    .line 2
    iget-object v0, p0, Landroidx/room/j0;->d:Landroidx/room/m;

    invoke-virtual {v0, p0}, Landroidx/room/m;->c(Landroidx/lifecycle/LiveData;)V

    return-void
.end method
