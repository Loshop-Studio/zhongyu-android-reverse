.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->e0(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$updateTaskInfo$1"
    f = "NoStemViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x105
    }
    m = "invokeSuspend"
    n = {
        "userId",
        "taskId",
        "state"
    }
    s = {
        "L$0",
        "J$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:J

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic f:Lcom/zykj/evaluation/bean/GuideTaskInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    move-object v9, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->R(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->J(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getId()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getState()I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    iget-object v3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    iput-wide v6, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->b:J

    .line 83
    .line 84
    iput v8, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->c:I

    .line 85
    .line 86
    iput v2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->d:I

    .line 87
    .line 88
    move-object v9, p0

    .line 89
    invoke-static/range {v3 .. v9}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->K(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_2

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_2
    :goto_0
    iget-object p1, v9, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->V()Li6/o0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v1, v9, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getGroups()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, v9, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->f:Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getEnableScore()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget-object v3, v9, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$updateTaskInfo$1;->e:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 115
    .line 116
    invoke-static {v3}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Landroidx/collection/ArrayMap;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v1, v2, v3}, Li6/a;->b(Ljava/util/List;ZLjava/util/Map;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Li6/o0;->a(Ljava/util/List;)Li6/o0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {p1, v0}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->M(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/o0;)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p1
.end method
