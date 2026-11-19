.class final Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/FlowKt__DelayKt;->f(Lvd/c;J)Lvd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/q;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2"
    f = "Delay.kt"
    l = {
        0x19c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:J

.field public final synthetic i:Lvd/c;


# direct methods
.method public constructor <init>(JLvd/c;Lvc/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->h:J

    .line 2
    .line 3
    iput-object p3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->i:Lvd/c;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Lsd/i0;Lvd/d;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;

    .line 2
    .line 3
    iget-wide v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->h:J

    .line 4
    .line 5
    iget-object v3, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->i:Lvd/c;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;-><init>(JLvd/c;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, v0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsd/i0;

    check-cast p2, Lvd/d;

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->g(Lsd/i0;Lvd/d;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->e:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lud/l;

    .line 16
    .line 17
    iget-object v4, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 20
    .line 21
    iget-object v5, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Lud/l;

    .line 24
    .line 25
    iget-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lvd/d;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->f:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, p1

    .line 47
    check-cast v4, Lsd/i0;

    .line 48
    .line 49
    iget-object p1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lvd/d;

    .line 52
    .line 53
    new-instance v7, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$values$1;

    .line 54
    .line 55
    iget-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->i:Lvd/c;

    .line 56
    .line 57
    invoke-direct {v7, v1, v3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$values$1;-><init>(Lvd/c;Lvc/c;)V

    .line 58
    .line 59
    .line 60
    const/4 v8, 0x1

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, -0x1

    .line 64
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/channels/ProduceKt;->d(Lsd/i0;Lkotlin/coroutines/d;ILhd/p;ILjava/lang/Object;)Lud/l;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 69
    .line 70
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-wide v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->h:J

    .line 74
    .line 75
    invoke-static {v4, v6, v7}, Lvd/e;->A(Lsd/i0;J)Lud/l;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move-object v6, v5

    .line 80
    move-object v5, v1

    .line 81
    move-object v1, v4

    .line 82
    move-object v4, v6

    .line 83
    move-object v6, p1

    .line 84
    :cond_2
    :goto_0
    iget-object p1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 85
    .line 86
    sget-object v7, Lwd/l;->c:Lxd/c0;

    .line 87
    .line 88
    if-eq p1, v7, :cond_3

    .line 89
    .line 90
    new-instance p1, Lkotlinx/coroutines/selects/SelectImplementation;

    .line 91
    .line 92
    invoke-interface {p0}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-direct {p1, v7}, Lkotlinx/coroutines/selects/SelectImplementation;-><init>(Lkotlin/coroutines/d;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v5}, Lud/l;->i()Lae/f;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    new-instance v8, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1;

    .line 104
    .line 105
    invoke-direct {v8, v4, v1, v3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lud/l;Lvc/c;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p1, v7, v8}, Lae/c;->c(Lae/f;Lhd/p;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1}, Lud/l;->h()Lae/f;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    new-instance v8, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2;

    .line 116
    .line 117
    invoke-direct {v8, v4, v6, v3}, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lvd/d;Lvc/c;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1, v7, v8}, Lae/c;->c(Lae/f;Lhd/p;)V

    .line 121
    .line 122
    .line 123
    iput-object v6, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->f:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v5, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->g:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v4, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->c:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v1, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->d:Ljava/lang/Object;

    .line 130
    .line 131
    iput v2, p0, Lkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2;->e:I

    .line 132
    .line 133
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/selects/SelectImplementation;->o(Lvc/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_2

    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 141
    .line 142
    return-object p1
.end method
