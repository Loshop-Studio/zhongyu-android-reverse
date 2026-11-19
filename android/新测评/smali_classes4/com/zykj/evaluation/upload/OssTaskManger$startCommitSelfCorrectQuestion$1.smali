.class final Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/OssTaskManger;->s(JJIJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.upload.OssTaskManger"
    f = "OssTaskManger.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x20f
    }
    m = "startCommitSelfCorrectQuestion"
    n = {
        "answerUploadDataList",
        "commitSelfCorrectReqList",
        "userId",
        "taskId",
        "taskState",
        "questionId"
    }
    s = {
        "L$0",
        "L$1",
        "J$0",
        "J$1",
        "I$0",
        "J$2"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->h:Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

    iget-object v0, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->h:Lcom/zykj/evaluation/upload/OssTaskManger;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object v10, p0

    invoke-virtual/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->s(JJIJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
