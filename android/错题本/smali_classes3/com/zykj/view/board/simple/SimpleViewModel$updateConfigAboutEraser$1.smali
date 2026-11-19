.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->updateConfigAboutEraser()V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutEraser$1"
    f = "SimpleViewModel.kt"
    i = {
        0x0
    }
    l = {
        0xbd
    }
    m = "invokeSuspend"
    n = {
        "state"
    }
    s = {
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
            "Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 36
    .line 37
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->this$0:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 44
    .line 45
    invoke-static {v1}, Lcom/zykj/view/board/simple/SimpleViewModel;->access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v3, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/SimpleUIState;->getEraserType()Lcom/zykj/view/board/board/EraserType;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/view/board/board/EraserType;->getSize()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-direct {v3, p1}, Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;-><init>(F)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->L$0:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;->label:I

    .line 66
    .line 67
    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/flow/x;->emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_2

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_2
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 75
    .line 76
    return-object p1
.end method
