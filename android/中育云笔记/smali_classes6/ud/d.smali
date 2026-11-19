.class public abstract Lud/d;
.super Lkotlinx/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/channels/a;


# instance fields
.field public final f:Lkotlinx/coroutines/channels/a;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Lkotlinx/coroutines/channels/a;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lkotlinx/coroutines/a;-><init>(Lkotlin/coroutines/d;ZZ)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public G(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, Lkotlinx/coroutines/JobSupport;->y0(Lkotlinx/coroutines/JobSupport;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/concurrent/CancellationException;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lud/l;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/JobSupport;->E(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final J0()Lkotlinx/coroutines/channels/a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final K0()Lkotlinx/coroutines/channels/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lud/l;->b(Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkotlinx/coroutines/JobSupport;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-nez p1, :cond_1

    .line 9
    .line 10
    new-instance p1, Lkotlinx/coroutines/JobCancellationException;

    .line 11
    .line 12
    invoke-static {p0}, Lkotlinx/coroutines/JobSupport;->l(Lkotlinx/coroutines/JobSupport;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1, p0}, Lkotlinx/coroutines/JobCancellationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/g;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0, p1}, Lud/d;->G(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public close(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->close(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lud/l;->d(Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getOnSend()Lae/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/channels/f;->getOnSend()Lae/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()Lae/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lud/l;->h()Lae/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Lae/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lud/l;->i()Lae/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public invokeOnClose(Lhd/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->invokeOnClose(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public isClosedForSend()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/channels/f;->isClosedForSend()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Lud/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lud/l;->iterator()Lud/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lud/l;->j()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->offer(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/d;->f:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
