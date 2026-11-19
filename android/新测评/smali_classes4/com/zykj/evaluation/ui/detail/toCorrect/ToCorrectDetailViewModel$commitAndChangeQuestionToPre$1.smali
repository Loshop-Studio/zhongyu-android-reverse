.class final Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->t(Lf6/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1"
    f = "ToCorrectDetailViewModel.kt"
    i = {}
    l = {
        0x333,
        0x335
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

.field public final synthetic c:Lf6/j;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->c:Lf6/j;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->c:Lf6/j;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->c:Lf6/j;

    .line 37
    .line 38
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->a:I

    .line 39
    .line 40
    invoke-static {p1, v1, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->B0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->b:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 48
    .line 49
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1;->a:I

    .line 50
    .line 51
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->A0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    :goto_1
    return-object v0

    .line 58
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p1
.end method
