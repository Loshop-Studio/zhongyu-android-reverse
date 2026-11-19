.class public abstract synthetic Lkotlinx/coroutines/flow/FlowKt__ShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ll8/g;)Ll8/l;
    .locals 2

    .line 1
    new-instance v0, Ll8/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ll8/i;-><init>(Ll8/l;Lkotlinx/coroutines/n;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final b(Ll8/h;)Ll8/q;
    .locals 2

    .line 1
    new-instance v0, Ll8/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ll8/j;-><init>(Ll8/q;Lkotlinx/coroutines/n;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final c(Ll8/c;I)Ll8/o;
    .locals 7

    .line 1
    sget-object v0, Lkotlinx/coroutines/channels/a;->d0:Lkotlinx/coroutines/channels/a$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/channels/a$b;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1, v0}, Ld8/h;->e(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sub-int/2addr v0, p1

    .line 12
    instance-of v1, p0, Lkotlinx/coroutines/flow/internal/ChannelFlow;

    .line 13
    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, Lkotlinx/coroutines/flow/internal/ChannelFlow;

    .line 18
    .line 19
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/internal/ChannelFlow;->k()Ll8/c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_4

    .line 24
    .line 25
    new-instance p0, Ll8/o;

    .line 26
    .line 27
    iget v3, v1, Lkotlinx/coroutines/flow/internal/ChannelFlow;->b:I

    .line 28
    .line 29
    const/4 v4, -0x3

    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    const/4 v4, -0x2

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v0, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v4, v1, Lkotlinx/coroutines/flow/internal/ChannelFlow;->c:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 40
    .line 41
    sget-object v5, Lkotlinx/coroutines/channels/BufferOverflow;->a:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    :cond_1
    move v0, v6

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-nez p1, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    :cond_3
    :goto_0
    iget-object p1, v1, Lkotlinx/coroutines/flow/internal/ChannelFlow;->c:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 54
    .line 55
    iget-object v1, v1, Lkotlinx/coroutines/flow/internal/ChannelFlow;->a:Lkotlin/coroutines/d;

    .line 56
    .line 57
    invoke-direct {p0, v2, v0, p1, v1}, Ll8/o;-><init>(Ll8/c;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/d;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_4
    new-instance p1, Ll8/o;

    .line 62
    .line 63
    sget-object v1, Lkotlinx/coroutines/channels/BufferOverflow;->a:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 64
    .line 65
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->a:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 66
    .line 67
    invoke-direct {p1, p0, v0, v1, v2}, Ll8/o;-><init>(Ll8/c;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/d;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public static final d(Li8/b0;Lkotlin/coroutines/d;Ll8/c;Ll8/g;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Lkotlinx/coroutines/n;
    .locals 7

    .line 1
    sget-object v0, Lkotlinx/coroutines/flow/a;->a:Lkotlinx/coroutines/flow/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/a$a;->c()Lkotlinx/coroutines/flow/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->a:Lkotlinx/coroutines/CoroutineStart;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->d:Lkotlinx/coroutines/CoroutineStart;

    .line 17
    .line 18
    :goto_0
    new-instance v1, Lkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharing$1;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v3, p2

    .line 22
    move-object v4, p3

    .line 23
    move-object v2, p4

    .line 24
    move-object v5, p5

    .line 25
    invoke-direct/range {v1 .. v6}, Lkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharing$1;-><init>(Lkotlinx/coroutines/flow/a;Ll8/c;Ll8/g;Ljava/lang/Object;Lm7/c;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1, v0, v1}, Li8/f;->c(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;)Lkotlinx/coroutines/n;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final e(Li8/b0;Lkotlin/coroutines/d;Ll8/c;Li8/r;)V
    .locals 6

    .line 1
    new-instance v3, Lkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p2, p3, v0}, Lkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1;-><init>(Ll8/c;Li8/r;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final f(Ll8/l;Lx7/p;)Ll8/l;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/SubscribedSharedFlow;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/flow/SubscribedSharedFlow;-><init>(Ll8/l;Lx7/p;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final g(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;I)Ll8/l;
    .locals 8

    .line 1
    invoke-static {p0, p3}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->c(Ll8/c;I)Ll8/o;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget v0, p0, Ll8/o;->b:I

    .line 6
    .line 7
    iget-object v1, p0, Ll8/o;->c:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 8
    .line 9
    invoke-static {p3, v0, v1}, Ll8/m;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Ll8/g;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v3, p0, Ll8/o;->d:Lkotlin/coroutines/d;

    .line 14
    .line 15
    iget-object v4, p0, Ll8/o;->a:Ll8/c;

    .line 16
    .line 17
    sget-object v7, Ll8/m;->a:Ln8/d0;

    .line 18
    .line 19
    move-object v2, p1

    .line 20
    move-object v6, p2

    .line 21
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->d(Li8/b0;Lkotlin/coroutines/d;Ll8/c;Ll8/g;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Lkotlinx/coroutines/n;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Ll8/i;

    .line 26
    .line 27
    invoke-direct {p1, v5, p0}, Ll8/i;-><init>(Ll8/l;Lkotlinx/coroutines/n;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public static final h(Ll8/c;Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->c(Ll8/c;I)Ll8/o;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v0, v1}, Li8/t;->b(Lkotlinx/coroutines/n;ILjava/lang/Object;)Li8/r;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ll8/o;->d:Lkotlin/coroutines/d;

    .line 12
    .line 13
    iget-object p0, p0, Ll8/o;->a:Ll8/c;

    .line 14
    .line 15
    invoke-static {p1, v1, p0, v0}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->e(Li8/b0;Lkotlin/coroutines/d;Ll8/c;Li8/r;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p2}, Li8/e0;->u(Lm7/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final i(Ll8/c;Li8/b0;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Ll8/q;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->c(Ll8/c;I)Ll8/o;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p3}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object v1, p0, Ll8/o;->d:Lkotlin/coroutines/d;

    .line 11
    .line 12
    iget-object v2, p0, Ll8/o;->a:Ll8/c;

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    move-object v4, p2

    .line 16
    move-object v5, p3

    .line 17
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/flow/FlowKt__ShareKt;->d(Li8/b0;Lkotlin/coroutines/d;Ll8/c;Ll8/g;Lkotlinx/coroutines/flow/a;Ljava/lang/Object;)Lkotlinx/coroutines/n;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Ll8/j;

    .line 22
    .line 23
    invoke-direct {p1, v3, p0}, Ll8/j;-><init>(Ll8/q;Lkotlinx/coroutines/n;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method
