.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->updateConfigAboutPen()V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1"
    f = "SimpleViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2
    }
    l = {
        0x82,
        0x88,
        0x8d
    }
    m = "invokeSuspend"
    n = {
        "state",
        "state",
        "state"
    }
    s = {
        "L$0",
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

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
    .locals 1
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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    if-eq v1, v4, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 59
    .line 60
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 67
    .line 68
    invoke-static {v1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v5, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenType()Lcom/zykj/view/board/simple/SimplePenType;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Lcom/zykj/view/board/simple/SimplePenType;->getMode()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenType()Lcom/zykj/view/board/simple/SimplePenType;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Lcom/zykj/view/board/simple/SimplePenType;->isPenDashed()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-direct {v5, v6, v7}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;-><init>(IZ)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    iput v4, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->label:I

    .line 96
    .line 97
    invoke-interface {v1, v5, p0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v0, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move-object v1, p1

    .line 105
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v4, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenSize()Lcom/zykj/view/board/simple/SimplePenSize;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Lcom/zykj/view/board/simple/SimplePenSize;->getSize()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-direct {v4, v5}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;-><init>(F)V

    .line 122
    .line 123
    .line 124
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 125
    .line 126
    iput v3, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->label:I

    .line 127
    .line 128
    invoke-interface {p1, v4, p0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v3, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;

    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/zykj/view/board/simple/SimpleUIState;->getPenColor()Lcom/zykj/view/board/board/PenColor;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-direct {v3, v1}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;-><init>(I)V

    .line 152
    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->L$0:Ljava/lang/Object;

    .line 156
    .line 157
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->label:I

    .line 158
    .line 159
    invoke-interface {p1, v3, p0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-ne p1, v0, :cond_6

    .line 164
    .line 165
    :goto_2
    return-object v0

    .line 166
    :cond_6
    :goto_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 167
    .line 168
    return-object p1
.end method
