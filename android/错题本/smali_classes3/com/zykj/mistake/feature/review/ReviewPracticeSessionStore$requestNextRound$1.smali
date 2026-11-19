.class final Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.mistake.feature.review.ReviewPracticeSessionStore"
    f = "ReviewPracticeSessionStore.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x44
    }
    m = "requestNextRound"
    n = {
        "sessionId",
        "session",
        "continueNextRound",
        "numericSessionId"
    }
    s = {
        "L$0",
        "L$1",
        "Z$0",
        "J$0"
    }
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/zykj/mistake/feature/review/q;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/feature/review/q;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/mistake/feature/review/q;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->this$0:Lcom/zykj/mistake/feature/review/q;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lh6/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->label:I

    iget-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$requestNextRound$1;->this$0:Lcom/zykj/mistake/feature/review/q;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lcom/zykj/mistake/feature/review/q;->c(Ljava/lang/String;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
