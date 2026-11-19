.class public final Lkotlinx/coroutines/flow/internal/f;
.super Lkotlinx/coroutines/flow/internal/e;
.source "SourceFile"


# virtual methods
.method public final f(Lh6/h;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/d;
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/internal/f;

    .line 2
    .line 3
    iget-object v1, p0, Lkotlinx/coroutines/flow/internal/e;->d:Lkotlinx/coroutines/flow/f;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, Lkotlinx/coroutines/flow/internal/e;-><init>(Lkotlinx/coroutines/flow/f;Lh6/h;ILkotlinx/coroutines/channels/BufferOverflow;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g()Lkotlinx/coroutines/flow/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/e;->d:Lkotlinx/coroutines/flow/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/flow/internal/e;->d:Lkotlinx/coroutines/flow/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/f;->collect(Lkotlinx/coroutines/flow/g;Lh6/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    return-object p1
.end method
