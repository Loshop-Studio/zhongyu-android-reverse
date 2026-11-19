.class final Lf3/e;
.super Lf3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lf3/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final c:Ljava/lang/Thread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lf3/z0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq2/g;Ljava/lang/Thread;Lf3/z0;)V
    .locals 1
    .param p1    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lf3/z0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, v0, v0}, Lf3/a;-><init>(Lq2/g;ZZ)V

    .line 2
    iput-object p2, p0, Lf3/e;->c:Ljava/lang/Thread;

    .line 3
    iput-object p3, p0, Lf3/e;->d:Lf3/z0;

    return-void
.end method


# virtual methods
.method protected U()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected l(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lf3/e;->c:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lf3/e;->c:Ljava/lang/Thread;

    invoke-static {}, Lf3/c;->a()Lf3/b;

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method

.method public final x0()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lf3/c;->a()Lf3/b;

    .line 2
    :try_start_0
    iget-object v0, p0, Lf3/e;->d:Lf3/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2, v1, v3}, Lf3/z0;->R(Lf3/z0;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_6

    .line 4
    iget-object v0, p0, Lf3/e;->d:Lf3/z0;

    if-nez v0, :cond_1

    const-wide v4, 0x7fffffffffffffffL

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lf3/z0;->U()J

    move-result-wide v4

    .line 5
    :goto_1
    invoke-virtual {p0}, Lf3/t1;->T()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_5

    .line 6
    :try_start_2
    iget-object v0, p0, Lf3/e;->d:Lf3/z0;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v0, v2, v1, v3}, Lf3/z0;->M(Lf3/z0;ZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 7
    :goto_2
    invoke-static {}, Lf3/c;->a()Lf3/b;

    .line 8
    invoke-virtual {p0}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf3/u1;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 9
    instance-of v1, v0, Lf3/y;

    if-eqz v1, :cond_3

    move-object v3, v0

    check-cast v3, Lf3/y;

    :cond_3
    if-nez v3, :cond_4

    return-object v0

    :cond_4
    iget-object v0, v3, Lf3/y;->a:Ljava/lang/Throwable;

    throw v0

    .line 10
    :cond_5
    :try_start_3
    invoke-static {}, Lf3/c;->a()Lf3/b;

    invoke-static {p0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    .line 11
    :cond_6
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {p0, v0}, Lf3/t1;->v(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 12
    :goto_3
    :try_start_4
    iget-object v4, p0, Lf3/e;->d:Lf3/z0;

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v4, v2, v1, v3}, Lf3/z0;->M(Lf3/z0;ZILjava/lang/Object;)V

    :goto_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    .line 13
    invoke-static {}, Lf3/c;->a()Lf3/b;

    throw v0
.end method
