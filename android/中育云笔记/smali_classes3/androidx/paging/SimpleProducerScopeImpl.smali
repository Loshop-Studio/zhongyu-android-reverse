.class public final Landroidx/paging/SimpleProducerScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/SimpleProducerScope;
.implements Lsd/i0;
.implements Lkotlinx/coroutines/channels/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/paging/SimpleProducerScope<",
        "TT;>;",
        "Lsd/i0;",
        "Lkotlinx/coroutines/channels/f;"
    }
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Lsd/i0;

.field private final channel:Lkotlinx/coroutines/channels/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/f;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/i0;Lkotlinx/coroutines/channels/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lkotlinx/coroutines/channels/f;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "channel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/paging/SimpleProducerScopeImpl;->$$delegate_0:Lsd/i0;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public awaitClose(Lhd/a;Lvc/c;)Ljava/lang/Object;
    .locals 5
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

    .line 1
    instance-of v0, p2, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;-><init>(Landroidx/paging/SimpleProducerScopeImpl;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lkotlinx/coroutines/g;

    .line 41
    .line 42
    iget-object p1, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lhd/a;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p2

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    invoke-virtual {p0}, Landroidx/paging/SimpleProducerScopeImpl;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    sget-object v2, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    .line 68
    .line 69
    invoke-interface {p2, v2}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    check-cast p2, Lkotlinx/coroutines/g;

    .line 76
    .line 77
    iput-object p1, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, v0, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$1;->label:I

    .line 82
    .line 83
    new-instance v2, Lkotlinx/coroutines/c;

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-direct {v2, v4, v3}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->F()V

    .line 93
    .line 94
    .line 95
    new-instance v3, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;

    .line 96
    .line 97
    invoke-direct {v3, v2}, Landroidx/paging/SimpleProducerScopeImpl$awaitClose$2$1;-><init>(Lsd/j;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p2, v3}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne p2, v2, :cond_3

    .line 112
    .line 113
    invoke-static {v0}, Lxc/f;->c(Lvc/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_3
    if-ne p2, v1, :cond_4

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_4
    :goto_1
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_5
    :try_start_2
    const-string p2, "Internal error, context should have a job."

    .line 126
    .line 127
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 128
    .line 129
    invoke-direct {v0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    :goto_2
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    throw p2
.end method

.method public close(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->close(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getChannel()Lkotlinx/coroutines/channels/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/channels/f;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoroutineContext()Lkotlin/coroutines/d;
    .locals 1

    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->$$delegate_0:Lsd/i0;

    invoke-interface {v0}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    move-result-object v0

    return-object v0
.end method

.method public getOnSend()Lae/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lae/h;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

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

.method public invokeOnClose(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->invokeOnClose(Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public isClosedForSend()Z
    .locals 1

    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    invoke-interface {v0}, Lkotlinx/coroutines/channels/f;->isClosedForSend()Z

    move-result v0

    return v0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public send(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/paging/SimpleProducerScopeImpl;->channel:Lkotlinx/coroutines/channels/f;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/channels/f;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
