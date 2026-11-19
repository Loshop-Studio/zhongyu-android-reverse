.class final Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->U()V
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
    c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$getNoQstExamTask$1"
    f = "NoStemViewModel.kt"
    i = {}
    l = {
        0x63,
        0x6a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

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
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 43
    .line 44
    invoke-static {v1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->H(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lp5/j;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v4, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->q()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    iput-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->a:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->b:I

    .line 57
    .line 58
    invoke-interface {p1, v4, v5, p0}, Lp5/j;->n(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 66
    .line 67
    invoke-static {p1}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object v4, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 72
    .line 73
    check-cast p1, Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 74
    .line 75
    invoke-static {v4, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->Q(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->L(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/GuideTaskInfo;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->isRepresentative()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-ne p1, v3, :cond_5

    .line 94
    .line 95
    iget-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 96
    .line 97
    invoke-static {p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->H(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lp5/j;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v3, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 102
    .line 103
    invoke-static {v3}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;)Lcom/zykj/evaluation/bean/GuideTaskInfo;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/zykj/evaluation/bean/GuideTaskInfo;->getExamId()J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    iput-object p1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->a:Ljava/lang/Object;

    .line 115
    .line 116
    iput v2, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->b:I

    .line 117
    .line 118
    invoke-interface {v1, v3, v4, p0}, Lp5/j;->c(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne v1, v0, :cond_4

    .line 123
    .line 124
    :goto_1
    return-object v0

    .line 125
    :cond_4
    move-object v0, p1

    .line 126
    move-object p1, v1

    .line 127
    :goto_2
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 128
    .line 129
    invoke-static {p1}, Lo5/g;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object v1, p0, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel$getNoQstExamTask$1;->c:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 134
    .line 135
    check-cast p1, Lcom/zykj/evaluation/bean/ExamProgress;

    .line 136
    .line 137
    invoke-static {v1, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->P(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->N(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Lcom/zykj/evaluation/bean/ExamProgress;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p1
.end method
