.class final Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;->o(Ljava/lang/String;)V
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
    c = "com.zykj.student.dialogue.ui.ask.AskQuestionViewModel$changeKeyWord$1"
    f = "AskQuestionViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAskQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,61:1\n230#2,5:62\n*S KotlinDebug\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1\n*L\n38#1:62,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->b:Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;->n(Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1;->c:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    move-object v0, v7

    .line 24
    check-cast v0, Lm6/e0;

    .line 25
    .line 26
    const/16 v5, 0xb

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v0 .. v6}, Lm6/e0;->b(Lm6/e0;Ljava/util/List;ZLjava/lang/String;Lcom/zykj/student/dialogue/bean/resp/CourseItem;ILjava/lang/Object;)Lm6/e0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p1, v7, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method
