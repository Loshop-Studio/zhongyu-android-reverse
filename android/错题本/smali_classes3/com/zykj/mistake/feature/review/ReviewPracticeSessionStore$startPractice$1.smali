.class final Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;
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
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xba,
        0xcb
    }
    m = "startPractice"
    n = {
        "mode",
        "start",
        "sessionId",
        "scene",
        "mode"
    }
    s = {
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "I$0"
    }
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->this$0:Lcom/zykj/mistake/feature/review/q;

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
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/mistake/feature/review/ReviewPracticeSessionStore$startPractice$1;->this$0:Lcom/zykj/mistake/feature/review/q;

    .line 11
    .line 12
    sget-object v0, Lcom/zykj/mistake/feature/review/q;->a:Lcom/zykj/mistake/feature/review/q;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0, p0}, Lcom/zykj/mistake/feature/review/q;->d(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
