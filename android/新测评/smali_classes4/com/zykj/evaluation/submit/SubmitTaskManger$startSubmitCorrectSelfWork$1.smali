.class final Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitTaskManger;->g(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.submit.SubmitTaskManger"
    f = "SubmitTaskManger.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xe6
    }
    m = "startSubmitCorrectSelfWork"
    n = {
        "uniqueWorkName",
        "tags",
        "userId",
        "taskId",
        "taskState"
    }
    s = {
        "L$0",
        "L$1",
        "J$0",
        "J$1",
        "I$0"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-virtual/range {v0 .. v8}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->g(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
