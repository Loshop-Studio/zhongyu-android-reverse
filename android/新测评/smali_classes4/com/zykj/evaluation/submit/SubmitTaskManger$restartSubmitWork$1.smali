.class final Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitTaskManger;->f(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4
    }
    l = {
        0x2c,
        0x31,
        0x34,
        0x37,
        0x57
    }
    m = "restartSubmitWork"
    n = {
        "userId",
        "taskId",
        "taskState",
        "submitTask",
        "userId",
        "taskId",
        "taskState",
        "submitTask",
        "userId",
        "taskId",
        "taskState",
        "submitTask",
        "userId",
        "taskId",
        "taskState",
        "submitTask",
        "request",
        "it",
        "userId",
        "taskId",
        "taskState",
        "$i$a$-let-SubmitTaskManger$restartSubmitWork$2"
    }
    s = {
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->i:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->h:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->i:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->f(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
