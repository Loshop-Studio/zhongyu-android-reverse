.class final Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Landroidx/work/WorkInfo;",
        ">;",
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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "Landroidx/work/WorkInfo;"
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
    c = "com.zykj.student.dialogue.ui.collect.SearchedQuestionFragment$onCreate$1$1"
    f = "SearchedQuestionFragment.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x9b
    }
    m = "invokeSuspend"
    n = {
        "it",
        "workInfo",
        "$i$a$-let-SearchedQuestionFragment$onCreate$1$1$1"
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->e:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->e:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;-><init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/work/WorkInfo;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroidx/work/WorkInfo;

    .line 41
    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->e:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    sget-object v6, Landroidx/work/WorkInfo$State;->SUCCEEDED:Landroidx/work/WorkInfo$State;

    .line 51
    .line 52
    if-ne v5, v6, :cond_3

    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->r()Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v2}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "SUCCESS_KEY"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    const-string v0, ""

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->q(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {v2}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    sget-object v5, Landroidx/work/WorkInfo$State;->FAILED:Landroidx/work/WorkInfo$State;

    .line 81
    .line 82
    if-ne v4, v5, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    new-instance v5, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1$1$1;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    invoke-direct {v5, v6}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->d:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iput p1, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->b:I

    .line 107
    .line 108
    iput v3, p0, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment$onCreate$1$1;->c:I

    .line 109
    .line 110
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v1, :cond_4

    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_4
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p1
.end method
