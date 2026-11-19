.class final Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
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
    c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel$initData$1"
    f = "TodoDetailViewModel.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x44,
        0x47
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-TodoDetailViewModel$initData$1$1"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTodoDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodoDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 39
    .line 40
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->c:I

    .line 41
    .line 42
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->C0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->E0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 58
    .line 59
    invoke-static {v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->D0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->b:I

    .line 81
    .line 82
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$initData$1;->c:I

    .line 83
    .line 84
    invoke-static {v1, p1, p0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->F0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_4

    .line 89
    .line 90
    :goto_1
    return-object v0

    .line 91
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p1
.end method
