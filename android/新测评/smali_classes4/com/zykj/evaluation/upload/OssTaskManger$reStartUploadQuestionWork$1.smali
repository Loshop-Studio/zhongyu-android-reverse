.class final Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/OssTaskManger;->o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x17a,
        0x182
    }
    m = "reStartUploadQuestionWork"
    n = {
        "userId",
        "taskId",
        "taskState",
        "$this$forEach$iv",
        "element$iv",
        "it",
        "userId",
        "taskId",
        "taskState",
        "$i$f$forEach",
        "$i$a$-forEach-OssTaskManger$reStartUploadQuestionWork$2"
    }
    s = {
        "J$0",
        "J$1",
        "I$0",
        "L$0",
        "L$2",
        "L$3",
        "J$0",
        "J$1",
        "I$0",
        "I$1",
        "I$2"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public l:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->k:Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->j:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    iget-object v0, p0, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->k:Lcom/zykj/evaluation/upload/OssTaskManger;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lcom/zykj/evaluation/upload/OssTaskManger;->o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
