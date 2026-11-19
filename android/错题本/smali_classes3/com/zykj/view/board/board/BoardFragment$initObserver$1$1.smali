.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


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
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1"
    f = "BoardFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/v;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$1;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {p1, v1, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$2;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 29
    .line 30
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$2;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 34
    .line 35
    .line 36
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 39
    .line 40
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 44
    .line 45
    .line 46
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$4;

    .line 47
    .line 48
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 49
    .line 50
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$4;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 54
    .line 55
    .line 56
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 59
    .line 60
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$5;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 64
    .line 65
    .line 66
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$6;

    .line 67
    .line 68
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 69
    .line 70
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$6;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 74
    .line 75
    .line 76
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;

    .line 77
    .line 78
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 79
    .line 80
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 84
    .line 85
    .line 86
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$8;

    .line 87
    .line 88
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 89
    .line 90
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$8;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 94
    .line 95
    .line 96
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9;

    .line 97
    .line 98
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 99
    .line 100
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 104
    .line 105
    .line 106
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$10;

    .line 107
    .line 108
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 109
    .line 110
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$10;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 114
    .line 115
    .line 116
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$11;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 119
    .line 120
    invoke-direct {p1, v3, v2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$11;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v2, v2, p1, v1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 124
    .line 125
    .line 126
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 132
    .line 133
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1
.end method
