.class public Landroidx/work/multiprocess/d;
.super Landroidx/work/multiprocess/a$a;
.source "SourceFile"


# static fields
.field static b:[B


# instance fields
.field private final a:Ly0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Landroidx/work/multiprocess/d;->b:[B

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/work/multiprocess/a$a;-><init>()V

    .line 2
    invoke-static {p1}, Ly0/i;->n(Landroid/content/Context;)Ly0/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Landroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0, p1}, Ly0/i;->i(Ljava/lang/String;)Lx0/q;

    move-result-object p1

    .line 2
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/work/multiprocess/d$e;

    .line 4
    invoke-interface {p1}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$e;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 5
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public f(Ljava/lang/String;Landroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/i;->b(Ljava/util/UUID;)Lx0/q;

    move-result-object p1

    .line 2
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/work/multiprocess/d$c;

    .line 4
    invoke-interface {p1}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$c;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 5
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public h([BLandroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkRequests;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    invoke-static {p1, v0}, Lj1/a;->b([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/parcelable/ParcelableWorkRequests;

    .line 3
    invoke-virtual {p1}, Landroidx/work/multiprocess/parcelable/ParcelableWorkRequests;->a()Ljava/util/List;

    move-result-object p1

    .line 4
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0, p1}, Ly0/i;->c(Ljava/util/List;)Lx0/q;

    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 6
    new-instance v1, Landroidx/work/multiprocess/d$a;

    .line 7
    invoke-interface {p1}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$a;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 8
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 9
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public j(Landroidx/work/multiprocess/b;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->a()Lx0/q;

    move-result-object v0

    .line 2
    iget-object v1, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v1}, Ly0/i;->u()Lh1/a;

    move-result-object v1

    invoke-interface {v1}, Lh1/a;->c()Lg1/i;

    move-result-object v1

    .line 3
    new-instance v2, Landroidx/work/multiprocess/d$f;

    .line 4
    invoke-interface {v0}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-direct {v2, p0, v1, p1, v0}, Landroidx/work/multiprocess/d$f;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 5
    invoke-virtual {v2}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {p1, v0}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public q(Ljava/lang/String;Landroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0, p1}, Ly0/i;->h(Ljava/lang/String;)Lx0/q;

    move-result-object p1

    .line 2
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 3
    new-instance v1, Landroidx/work/multiprocess/d$d;

    .line 4
    invoke-interface {p1}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$d;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 5
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public v([BLandroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkQuery;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    invoke-static {p1, v0}, Lj1/a;->b([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/parcelable/ParcelableWorkQuery;

    .line 3
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 4
    iget-object v1, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    .line 5
    invoke-virtual {p1}, Landroidx/work/multiprocess/parcelable/ParcelableWorkQuery;->a()Lx0/x;

    move-result-object p1

    invoke-virtual {v1, p1}, Ly0/i;->t(Lx0/x;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    .line 6
    new-instance v1, Landroidx/work/multiprocess/d$g;

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$g;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 7
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 8
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public x([BLandroidx/work/multiprocess/b;)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkContinuationImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 2
    invoke-static {p1, v0}, Lj1/a;->b([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/parcelable/ParcelableWorkContinuationImpl;

    .line 3
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    .line 4
    invoke-virtual {p1, v0}, Landroidx/work/multiprocess/parcelable/ParcelableWorkContinuationImpl;->b(Ly0/i;)Ly0/g;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ly0/g;->a()Lx0/q;

    move-result-object p1

    .line 6
    iget-object v0, p0, Landroidx/work/multiprocess/d;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->u()Lh1/a;

    move-result-object v0

    invoke-interface {v0}, Lh1/a;->c()Lg1/i;

    move-result-object v0

    .line 7
    new-instance v1, Landroidx/work/multiprocess/d$b;

    .line 8
    invoke-interface {p1}, Lx0/q;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-direct {v1, p0, v0, p2, p1}, Landroidx/work/multiprocess/d$b;-><init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 9
    invoke-virtual {v1}, Landroidx/work/multiprocess/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 10
    invoke-static {p2, p1}, Landroidx/work/multiprocess/c$a;->a(Landroidx/work/multiprocess/b;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
