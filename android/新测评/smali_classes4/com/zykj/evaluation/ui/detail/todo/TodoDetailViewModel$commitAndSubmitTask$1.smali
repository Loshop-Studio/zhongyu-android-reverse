.class final Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->u(Lf6/j;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.evaluation.ui.detail.todo.TodoDetailViewModel$commitAndSubmitTask$1"
    f = "TodoDetailViewModel.kt"
    i = {}
    l = {
        0x171,
        0x172
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

.field public final synthetic c:Lf6/j;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->c:Lf6/j;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->d:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->c:Lf6/j;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->d:Lkotlin/jvm/functions/Function0;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->a:I

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
    move-object v11, p0

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->c:Lf6/j;

    .line 38
    .line 39
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->a:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->B0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lf6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_3

    .line 46
    .line 47
    move-object v11, p0

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->G0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->H0(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v1, "getId(...)"

    .line 72
    .line 73
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->b:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->N()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    sget-object p1, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->a:I

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v10, 0x0

    .line 96
    const/16 v12, 0x18

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    move-object v11, p0

    .line 100
    invoke-static/range {v3 .. v13}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->l(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_4

    .line 105
    .line 106
    :goto_1
    return-object v0

    .line 107
    :cond_4
    :goto_2
    iget-object p1, v11, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel$commitAndSubmitTask$1;->d:Lkotlin/jvm/functions/Function0;

    .line 108
    .line 109
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p1
.end method
