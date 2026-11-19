.class Lg1/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/o;->a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/a;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/UUID;

.field final synthetic b:Landroidx/work/a;

.field final synthetic c:Landroidx/work/impl/utils/futures/d;

.field final synthetic d:Lg1/o;


# direct methods
.method constructor <init>(Lg1/o;Ljava/util/UUID;Landroidx/work/a;Landroidx/work/impl/utils/futures/d;)V
    .locals 0

    iput-object p1, p0, Lg1/o$a;->d:Lg1/o;

    iput-object p2, p0, Lg1/o$a;->a:Ljava/util/UUID;

    iput-object p3, p0, Lg1/o$a;->b:Landroidx/work/a;

    iput-object p4, p0, Lg1/o$a;->c:Landroidx/work/impl/utils/futures/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lg1/o$a;->a:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v1

    sget-object v2, Lg1/o;->c:Ljava/lang/String;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lg1/o$a;->a:Ljava/util/UUID;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lg1/o$a;->b:Landroidx/work/a;

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const-string v4, "Updating progress for %s (%s)"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v3, v4}, Lx0/n;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 3
    iget-object v1, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v1, v1, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/room/h0;->e()V

    .line 4
    :try_start_0
    iget-object v1, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v1, v1, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object v1

    .line 5
    invoke-interface {v1, v0}, Lf1/s;->k(Ljava/lang/String;)Lf1/r;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, v1, Lf1/r;->b:Lx0/v$a;

    .line 7
    sget-object v3, Lx0/v$a;->b:Lx0/v$a;

    if-ne v1, v3, :cond_0

    .line 8
    new-instance v1, Lf1/o;

    iget-object v2, p0, Lg1/o$a;->b:Landroidx/work/a;

    invoke-direct {v1, v0, v2}, Lf1/o;-><init>(Ljava/lang/String;Landroidx/work/a;)V

    .line 9
    iget-object v0, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v0, v0, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->L()Lf1/p;

    move-result-object v0

    invoke-interface {v0, v1}, Lf1/p;->b(Lf1/o;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v1

    const-string v3, "Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state."

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v5

    .line 11
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Throwable;

    .line 12
    invoke-virtual {v1, v2, v0, v3}, Lx0/n;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 13
    :goto_0
    iget-object v0, p0, Lg1/o$a;->c:Landroidx/work/impl/utils/futures/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/d;->o(Ljava/lang/Object;)Z

    .line 14
    iget-object v0, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v0, v0, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/room/h0;->A()V

    goto :goto_1

    :cond_1
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 15
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v1

    sget-object v2, Lg1/o;->c:Ljava/lang/String;

    const-string v3, "Error updating Worker progress"

    new-array v4, v6, [Ljava/lang/Throwable;

    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v3, v4}, Lx0/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 17
    iget-object v1, p0, Lg1/o$a;->c:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/d;->p(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    :goto_1
    iget-object v0, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v0, v0, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/room/h0;->i()V

    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lg1/o$a;->d:Lg1/o;

    iget-object v1, v1, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/room/h0;->i()V

    .line 19
    throw v0
.end method
