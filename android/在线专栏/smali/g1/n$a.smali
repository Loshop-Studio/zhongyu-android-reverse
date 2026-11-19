.class Lg1/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/n;->a(Landroid/content/Context;Ljava/util/UUID;Lx0/i;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/work/impl/utils/futures/d;

.field final synthetic b:Ljava/util/UUID;

.field final synthetic c:Lx0/i;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lg1/n;


# direct methods
.method constructor <init>(Lg1/n;Landroidx/work/impl/utils/futures/d;Ljava/util/UUID;Lx0/i;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lg1/n$a;->e:Lg1/n;

    iput-object p2, p0, Lg1/n$a;->a:Landroidx/work/impl/utils/futures/d;

    iput-object p3, p0, Lg1/n$a;->b:Ljava/util/UUID;

    iput-object p4, p0, Lg1/n$a;->c:Lx0/i;

    iput-object p5, p0, Lg1/n$a;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lg1/n$a;->a:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lg1/n$a;->b:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lg1/n$a;->e:Lg1/n;

    iget-object v1, v1, Lg1/n;->c:Lf1/s;

    invoke-interface {v1, v0}, Lf1/s;->i(Ljava/lang/String;)Lx0/v$a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lx0/v$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lg1/n$a;->e:Lg1/n;

    iget-object v1, v1, Lg1/n;->b:Le1/a;

    iget-object v2, p0, Lg1/n$a;->c:Lx0/i;

    invoke-interface {v1, v0, v2}, Le1/a;->c(Ljava/lang/String;Lx0/i;)V

    .line 6
    iget-object v1, p0, Lg1/n$a;->d:Landroid/content/Context;

    iget-object v2, p0, Lg1/n$a;->c:Lx0/i;

    invoke-static {v1, v0, v2}, Landroidx/work/impl/foreground/a;->b(Landroid/content/Context;Ljava/lang/String;Lx0/i;)Landroid/content/Intent;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lg1/n$a;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 8
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 9
    :cond_1
    :goto_0
    iget-object v0, p0, Lg1/n$a;->a:Landroidx/work/impl/utils/futures/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/d;->o(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 10
    iget-object v1, p0, Lg1/n$a;->a:Landroidx/work/impl/utils/futures/d;

    invoke-virtual {v1, v0}, Landroidx/work/impl/utils/futures/d;->p(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method
