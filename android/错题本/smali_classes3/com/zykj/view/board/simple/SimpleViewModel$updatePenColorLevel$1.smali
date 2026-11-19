.class final Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->updatePenColorLevel(I)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updatePenColorLevel$1"
    f = "SimpleViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x73
    }
    m = "invokeSuspend"
    n = {
        "color"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1\n*L\n114#1:243,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $level:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/zykj/view/board/simple/SimpleViewModel;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->$level:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->$level:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->label:I

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
    iget-object v1, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/zykj/view/board/board/PenColor;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/view/board/board/DataStateKt;->getPenColorList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget v4, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->$level:I

    .line 36
    .line 37
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v10, v2

    .line 42
    check-cast v10, Lcom/zykj/view/board/board/PenColor;

    .line 43
    .line 44
    iget-object v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 45
    .line 46
    invoke-static {v2}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_0
    move-object v15, v2

    .line 51
    check-cast v15, Lkotlinx/coroutines/flow/n0;

    .line 52
    .line 53
    invoke-virtual {v15}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    move-object v5, v4

    .line 58
    move-object v4, v5

    .line 59
    check-cast v4, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 60
    .line 61
    const/16 v13, 0xdf

    .line 62
    .line 63
    const/4 v14, 0x0

    .line 64
    move-object v6, v5

    .line 65
    const/4 v5, 0x0

    .line 66
    move-object v7, v6

    .line 67
    const/4 v6, 0x0

    .line 68
    move-object v8, v7

    .line 69
    const/4 v7, 0x0

    .line 70
    move-object v9, v8

    .line 71
    const/4 v8, 0x0

    .line 72
    move-object v11, v9

    .line 73
    const/4 v9, 0x0

    .line 74
    move-object v12, v11

    .line 75
    const/4 v11, 0x0

    .line 76
    move-object/from16 v16, v12

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    move-object/from16 v3, v16

    .line 80
    .line 81
    invoke-static/range {v4 .. v14}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v15, v3, v4}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    iget-object v2, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 92
    .line 93
    invoke-static {v2}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;

    .line 98
    .line 99
    invoke-virtual {v10}, Lcom/zykj/view/board/board/PenColor;->getColor()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-direct {v3, v4}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;-><init>(I)V

    .line 104
    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    iput-object v4, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    const/4 v4, 0x1

    .line 110
    iput v4, v0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->label:I

    .line 111
    .line 112
    invoke-interface {v2, v3, v0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-ne v2, v1, :cond_2

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_2
    :goto_1
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 120
    .line 121
    return-object v1

    .line 122
    :cond_3
    const/4 v3, 0x1

    .line 123
    goto :goto_0
.end method
