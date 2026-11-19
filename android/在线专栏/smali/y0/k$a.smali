.class Ly0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/k;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/work/impl/utils/futures/d;

.field final synthetic b:Ly0/k;


# direct methods
.method constructor <init>(Ly0/k;Landroidx/work/impl/utils/futures/d;)V
    .locals 0

    iput-object p1, p0, Ly0/k$a;->b:Ly0/k;

    iput-object p2, p0, Ly0/k$a;->a:Landroidx/work/impl/utils/futures/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v0

    sget-object v1, Ly0/k;->t:Ljava/lang/String;

    const-string v2, "Starting work for %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Ly0/k$a;->b:Ly0/k;

    iget-object v4, v4, Ly0/k;->e:Lf1/r;

    iget-object v4, v4, Lf1/r;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3}, Lx0/n;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Ly0/k$a;->b:Ly0/k;

    iget-object v1, v0, Ly0/k;->f:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->startWork()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iput-object v1, v0, Ly0/k;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    .line 3
    iget-object v0, p0, Ly0/k$a;->a:Landroidx/work/impl/utils/futures/d;

    iget-object v1, p0, Ly0/k$a;->b:Ly0/k;

    iget-object v1, v1, Ly0/k;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/d;->q(Lcom/google/common/util/concurrent/ListenableFuture;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    iget-object v1, p0, Ly0/k$a;->a:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/d;->p(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
