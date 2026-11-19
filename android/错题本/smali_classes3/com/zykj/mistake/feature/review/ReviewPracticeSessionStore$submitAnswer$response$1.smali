.class final Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;
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
        "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;"
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
    c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore$submitAnswer$response$1"
    f = "ReviewPracticeSessionStore.kt"
    i = {}
    l = {
        0x6c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $itemId:I

.field final synthetic $numericSessionId:J

.field final synthetic $result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

.field label:I


# direct methods
.method public constructor <init>(JILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$numericSessionId:J

    .line 2
    .line 3
    iput p3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$itemId:I

    .line 4
    .line 5
    iput-object p4, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lh6/c;)Lh6/c;
    .locals 6
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
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$numericSessionId:J

    .line 4
    .line 5
    iget v3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$itemId:I

    .line 6
    .line 7
    iget-object v4, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;-><init>(JILcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;Lh6/c;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Lh6/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->create(Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;

    sget-object v0, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lh6/c;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->invoke(Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->label:I

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
    sget-object p1, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 26
    .line 27
    sget-object p1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/mistake/network/a;->c()Lcom/zykj/mistake/network/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;

    .line 34
    .line 35
    iget-wide v3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$numericSessionId:J

    .line 36
    .line 37
    iget v5, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$itemId:I

    .line 38
    .line 39
    iget-object v6, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->$result:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 40
    .line 41
    sget-object v7, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;->CORRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 42
    .line 43
    if-ne v6, v7, :cond_2

    .line 44
    .line 45
    move v6, v2

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 v6, 0x0

    .line 48
    :goto_0
    invoke-direct {v1, v3, v4, v5, v6}, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;-><init>(JIZ)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$submitAnswer$response$1;->label:I

    .line 52
    .line 53
    invoke-interface {p1, v1, p0}, Lcom/zykj/mistake/network/c;->r(Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;Lh6/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_3

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    return-object p1
.end method
