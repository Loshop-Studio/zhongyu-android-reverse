.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lsd/i0;

    .line 5
    .line 6
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->c:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$1;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$2;

    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 34
    .line 35
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 36
    .line 37
    .line 38
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 39
    .line 40
    .line 41
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 44
    .line 45
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 49
    .line 50
    .line 51
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$4;

    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 54
    .line 55
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$4;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 56
    .line 57
    .line 58
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 59
    .line 60
    .line 61
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;

    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 64
    .line 65
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 66
    .line 67
    .line 68
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 69
    .line 70
    .line 71
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$6;

    .line 72
    .line 73
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 74
    .line 75
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$6;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 79
    .line 80
    .line 81
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;

    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 84
    .line 85
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 86
    .line 87
    .line 88
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 89
    .line 90
    .line 91
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$8;

    .line 92
    .line 93
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 94
    .line 95
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$8;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 96
    .line 97
    .line 98
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 99
    .line 100
    .line 101
    new-instance v4, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9;

    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 104
    .line 105
    invoke-direct {v4, p1, v0}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 106
    .line 107
    .line 108
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 109
    .line 110
    .line 111
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 117
    .line 118
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1
.end method
