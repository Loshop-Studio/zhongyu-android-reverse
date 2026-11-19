.class final Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;
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
        "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;"
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
    c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore$requestNextRound$response$1"
    f = "ReviewPracticeSessionStore.kt"
    i = {}
    l = {
        0x46
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $continueNextRound:Z

.field final synthetic $numericSessionId:J

.field label:I


# direct methods
.method public constructor <init>(JZLh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$numericSessionId:J

    .line 2
    .line 3
    iput-boolean p3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$continueNextRound:Z

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
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
    new-instance v0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$numericSessionId:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$continueNextRound:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;-><init>(JZLh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lh6/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->create(Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;

    sget-object v0, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, v0}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lh6/c;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->invoke(Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->label:I

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
    iget-wide v3, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$numericSessionId:J

    .line 34
    .line 35
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->$continueNextRound:Z

    .line 36
    .line 37
    iput v2, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$response$1;->label:I

    .line 38
    .line 39
    invoke-interface {p1, v3, v4, v1, p0}, Lcom/zykj/mistake/network/c;->C(JZLh6/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    return-object p1
.end method
