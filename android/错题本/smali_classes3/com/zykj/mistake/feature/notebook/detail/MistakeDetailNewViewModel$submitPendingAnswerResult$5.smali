.class final Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/zykj/mistake/network/ApiResp;"
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
    c = "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel$submitPendingAnswerResult$5"
    f = "MistakeDetailNewViewModel.kt"
    i = {}
    l = {
        0x861
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

.field final synthetic $state:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field label:I

.field final synthetic this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;",
            "Lcom/zykj/mistake/feature/notebook/detail/m3;",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lh6/c;)Lh6/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;-><init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lh6/c;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Lh6/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/network/ApiResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->create(Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;

    sget-object v0, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lh6/c;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->invoke(Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->label:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->this$0:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->c(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;)Lcom/zykj/mistake/network/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$state:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 34
    .line 35
    iget v3, v3, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 36
    .line 37
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 38
    .line 39
    sget-object v5, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;->CORRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 40
    .line 41
    if-ne v4, v5, :cond_2

    .line 42
    .line 43
    move v4, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/4 v4, 0x0

    .line 46
    :goto_0
    invoke-direct {v1, v3, v4}, Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;-><init>(IZ)V

    .line 47
    .line 48
    .line 49
    iput v2, p0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$submitPendingAnswerResult$5;->label:I

    .line 50
    .line 51
    invoke-interface {p1, v1, p0}, Lcom/zykj/mistake/network/c;->D(Lcom/zykj/mistake/entity/req/SetMistakeQstItemPracticeResultReq;Lh6/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    return-object p1
.end method
