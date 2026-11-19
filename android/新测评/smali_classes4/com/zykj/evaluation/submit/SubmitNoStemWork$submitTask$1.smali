.class final Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitNoStemWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitNoStemWork"
    f = "SubmitNoStemWork.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x65
    }
    m = "submitTask"
    n = {
        "gson",
        "list",
        "taskId"
    }
    s = {
        "L$0",
        "L$1",
        "J$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:J

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitNoStemWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->e:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->e:Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    invoke-virtual {p1, p0}, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
