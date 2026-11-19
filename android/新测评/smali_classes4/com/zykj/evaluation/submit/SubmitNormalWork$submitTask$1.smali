.class final Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitNormalWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitNormalWork"
    f = "SubmitNormalWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x4d
    }
    m = "submitTask"
    n = {
        "taskId",
        "taskState",
        "userId",
        "isRevising"
    }
    s = {
        "J$0",
        "I$0",
        "J$1",
        "I$1"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/evaluation/submit/SubmitNormalWork;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitNormalWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->f:Lcom/zykj/evaluation/submit/SubmitNormalWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->f:Lcom/zykj/evaluation/submit/SubmitNormalWork;

    invoke-virtual {p1, p0}, Lcom/zykj/evaluation/submit/SubmitNormalWork;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
