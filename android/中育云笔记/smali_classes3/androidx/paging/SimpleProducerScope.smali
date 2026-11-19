.class public interface abstract Landroidx/paging/SimpleProducerScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd/i0;
.implements Lkotlinx/coroutines/channels/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/SimpleProducerScope$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsd/i0;",
        "Lkotlinx/coroutines/channels/f;"
    }
.end annotation


# virtual methods
.method public abstract awaitClose(Lhd/a;Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract synthetic close(Ljava/lang/Throwable;)Z
.end method

.method public abstract getChannel()Lkotlinx/coroutines/channels/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/f;"
        }
    .end annotation
.end method

.method public abstract synthetic getCoroutineContext()Lkotlin/coroutines/d;
.end method

.method public abstract synthetic getOnSend()Lae/h;
.end method

.method public abstract synthetic invokeOnClose(Lhd/l;)V
.end method

.method public abstract synthetic isClosedForSend()Z
.end method

.method public abstract synthetic offer(Ljava/lang/Object;)Z
    .annotation runtime Lqc/a;
    .end annotation
.end method

.method public abstract synthetic send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
.end method

.method public abstract synthetic trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;
.end method
