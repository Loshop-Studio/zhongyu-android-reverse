.class final Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->T()V
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
    c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$setSessionState$1"
    f = "AnswerViewModel.kt"
    i = {}
    l = {
        0x105
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,529:1\n230#2,5:530\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1\n*L\n268#1:530,5\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;

    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->p(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lk6/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->I()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 42
    .line 43
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->K()Lkotlinx/coroutines/flow/StateFlow;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lp6/k;

    .line 52
    .line 53
    invoke-virtual {v4}, Lp6/k;->r()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    move v4, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v4, 0x2

    .line 62
    :goto_0
    invoke-direct {v1, v3, v4}, Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;-><init>(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    iput v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->a:I

    .line 66
    .line 67
    invoke-interface {p1, v1, p0}, Lk6/g;->h(Lcom/zykj/student/dialogue/bean/req/SetSessionStateReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 75
    .line 76
    invoke-static {p1}, Li6/c;->b(Lcom/zykj/student/dialogue/network/BaseResponse;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 80
    .line 81
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->s(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1;->b:Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;->u(Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :cond_4
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    move-object v3, v0

    .line 103
    check-cast v3, Lp6/k;

    .line 104
    .line 105
    invoke-virtual {v3}, Lp6/k;->r()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    xor-int/lit8 v10, v1, 0x1

    .line 110
    .line 111
    const/16 v11, 0x1f

    .line 112
    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v4, 0x0

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const-wide/16 v8, 0x0

    .line 119
    .line 120
    invoke-static/range {v3 .. v12}, Lp6/k;->b(Lp6/k;Lkotlin/Result;IZLcom/zykj/student/dialogue/ui/detail/viewmodel/Tab;JZILjava/lang/Object;)Lp6/k;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {p1, v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p1
.end method
