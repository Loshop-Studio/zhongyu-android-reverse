.class final Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitCorrectSelfWork"
    f = "SubmitCorrectSelfWork.kt"
    i = {
        0x0
    }
    l = {
        0x46
    }
    m = "submitTask"
    n = {
        "taskId"
    }
    s = {
        "J$0"
    }
.end annotation


# instance fields
.field public a:J

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->c:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->c:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;

    invoke-virtual {p1, p0}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
