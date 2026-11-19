.class final Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/submit/SubmitTaskManger;->i(JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x0,
        0x0
    }
    l = {
        0x75
    }
    m = "startSubmitNoStemWork"
    n = {
        "reqList",
        "uniqueWorkName",
        "tags",
        "gson",
        "userId",
        "taskId"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "J$0",
        "J$1"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->h:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->h:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-virtual/range {v0 .. v8}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->i(JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
