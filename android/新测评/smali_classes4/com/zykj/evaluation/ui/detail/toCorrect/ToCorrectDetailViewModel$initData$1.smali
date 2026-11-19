.class final Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->U(Lcom/zykj/evaluation/bean/bundle/DetailBundle;Z)V
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
    c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$initData$1"
    f = "ToCorrectDetailViewModel.kt"
    i = {
        0x2,
        0x2
    }
    l = {
        0x51,
        0x54,
        0x57
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-ToCorrectDetailViewModel$initData$1$1"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nToCorrectDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1099:1\n1#2:1100\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    new-instance p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    invoke-direct {p1, v0, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;-><init>(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 46
    .line 47
    iput v4, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->c:I

    .line 48
    .line 49
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->C0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 57
    .line 58
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->c:I

    .line 59
    .line 60
    invoke-static {p1, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->I0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->E0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_6

    .line 74
    .line 75
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 76
    .line 77
    invoke-static {v1}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->D0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/zykj/evaluation/ui/detail/GuideQuestion;

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    .line 89
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->d:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    .line 90
    .line 91
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iput-object v3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->a:Ljava/lang/Object;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    iput v3, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->b:I

    .line 99
    .line 100
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1;->c:I

    .line 101
    .line 102
    invoke-static {v1, p1, p0}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;->F0(Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lcom/zykj/evaluation/ui/detail/GuideQuestion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_6

    .line 107
    .line 108
    :goto_2
    return-object v0

    .line 109
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p1
.end method
