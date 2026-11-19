.class final Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

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
    c = "com.zykj.evaluation.upload.MultiAnswerUploadWork"
    f = "MultiAnswerUploadWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xb2
    }
    m = "failedResult"
    n = {
        "key",
        "$this$forEach$iv",
        "element$iv",
        "it",
        "pair",
        "uuid",
        "filePath",
        "$i$f$forEach",
        "$i$a$-forEach-MultiAnswerUploadWork$failedResult$2"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "I$0",
        "I$3"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;

.field public n:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->m:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->l:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

    iget-object p1, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->m:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->b(Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
