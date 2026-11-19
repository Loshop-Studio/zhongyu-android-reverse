.class final Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/OssTaskManger;->r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x1a0,
        0x1c2
    }
    m = "startCommitQuestion"
    n = {
        "draftUploadData",
        "answerUploadDataList",
        "commitReqList",
        "userId",
        "taskId",
        "taskState",
        "questionId",
        "isTodo",
        "isGroup",
        "draftUploadData",
        "answerUploadDataList",
        "commitReqList",
        "oldUploadQuestion",
        "userId",
        "taskId",
        "taskState",
        "questionId",
        "isTodo",
        "isGroup"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "J$0",
        "J$1",
        "I$0",
        "J$2",
        "Z$0",
        "Z$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "J$0",
        "J$1",
        "I$0",
        "J$2",
        "Z$0",
        "Z$1"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Z

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public m:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->l:Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->k:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    iget-object v0, p0, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->l:Lcom/zykj/evaluation/upload/OssTaskManger;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v13, p0

    invoke-virtual/range {v0 .. v13}, Lcom/zykj/evaluation/upload/OssTaskManger;->r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
