.class final Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->updatePenType(Lcom/zykj/view/board/simple/SimplePenType;)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1"
    f = "SimpleViewModel.kt"
    i = {}
    l = {
        0x53
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n*L\n82#1:243,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $penType:Lcom/zykj/view/board/simple/SimplePenType;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/SimplePenType;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleViewModel;",
            "Lcom/zykj/view/board/simple/SimplePenType;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/simple/SimplePenType;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/simple/SimplePenType;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/SimplePenType;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v1

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 28
    .line 29
    invoke-static {v2}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v8, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/simple/SimplePenType;

    .line 34
    .line 35
    :goto_0
    move-object v15, v2

    .line 36
    check-cast v15, Lkotlinx/coroutines/flow/n0;

    .line 37
    .line 38
    invoke-virtual {v15}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    move-object v4, v5

    .line 44
    check-cast v4, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 45
    .line 46
    const/16 v13, 0xf7

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    move-object v6, v5

    .line 50
    const/4 v5, 0x0

    .line 51
    move-object v7, v6

    .line 52
    const/4 v6, 0x0

    .line 53
    move-object v9, v7

    .line 54
    const/4 v7, 0x0

    .line 55
    move-object v10, v9

    .line 56
    const/4 v9, 0x0

    .line 57
    move-object v11, v10

    .line 58
    const/4 v10, 0x0

    .line 59
    move-object v12, v11

    .line 60
    const/4 v11, 0x0

    .line 61
    move-object/from16 v16, v12

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    move-object/from16 v3, v16

    .line 65
    .line 66
    invoke-static/range {v4 .. v14}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v15, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    iget-object v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 77
    .line 78
    invoke-static {v2}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v3, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;

    .line 83
    .line 84
    iget-object v4, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/simple/SimplePenType;

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/SimplePenType;->getMode()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    iget-object v5, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/simple/SimplePenType;

    .line 91
    .line 92
    invoke-virtual {v5}, Lcom/zykj/view/board/simple/SimplePenType;->isPenDashed()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-direct {v3, v4, v5}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;-><init>(IZ)V

    .line 97
    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    iput v4, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->label:I

    .line 101
    .line 102
    invoke-interface {v2, v3, v0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-ne v2, v1, :cond_2

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_2
    :goto_1
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_3
    const/4 v3, 0x1

    .line 113
    goto :goto_0
.end method
