.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->updateTouchable(Z)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateTouchable$1"
    f = "SimpleViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1\n*L\n32#1:243,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isTouchable:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/simple/SimpleViewModel;",
            "Z",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->$isTouchable:Z

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->$isTouchable:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->$isTouchable:Z

    .line 17
    .line 18
    :cond_0
    move-object v11, p1

    .line 19
    check-cast v11, Lkotlinx/coroutines/flow/n0;

    .line 20
    .line 21
    invoke-virtual {v11}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v12

    .line 25
    move-object v0, v12

    .line 26
    check-cast v0, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 27
    .line 28
    const/16 v9, 0xfe

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    invoke-static/range {v0 .. v10}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v11, v12, v0}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;

    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->$isTouchable:Z

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
