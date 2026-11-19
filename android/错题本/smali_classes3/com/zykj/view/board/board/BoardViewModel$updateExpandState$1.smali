.class final Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->updateExpandState(Z)V
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
    c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1"
    f = "BoardViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n*L\n1418#1:1495,5\n1424#1:1500,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isOpen:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardViewModel;",
            "Z",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->$isOpen:Z

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
    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->$isOpen:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZLh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$get_expandState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->$isOpen:Z

    .line 17
    .line 18
    :cond_0
    move-object v1, p1

    .line 19
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 20
    .line 21
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Lcom/zykj/view/board/board/ExpandState;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object v4, Lcom/zykj/view/board/board/ExpandStatus$Expanded;->INSTANCE:Lcom/zykj/view/board/board/ExpandStatus$Expanded;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/ExpandStatus$Collapse;->INSTANCE:Lcom/zykj/view/board/board/ExpandStatus$Collapse;

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v3, v4}, Lcom/zykj/view/board/board/ExpandState;->copy(Lcom/zykj/view/board/board/ExpandStatus;)Lcom/zykj/view/board/board/ExpandState;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    iget-boolean p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->$isOpen:Z

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$get_extraUIState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_2
    move-object v0, p1

    .line 56
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v2, v1

    .line 63
    check-cast v2, Lcom/zykj/view/board/board/ExtraUIState;

    .line 64
    .line 65
    sget-object v3, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 66
    .line 67
    const/16 v12, 0x1fe

    .line 68
    .line 69
    const/4 v13, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/ExtraUIState;->copy$default(Lcom/zykj/view/board/board/ExtraUIState;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/board/ConfirmButtonType;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/ExtraUIState;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v1, v2}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    :cond_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method
