.class final Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/OssTaskManger;->e(Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x1,
        0x1,
        0x1,
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
        0x37,
        0x48
    }
    m = "getOssData"
    n = {
        "fileType",
        "fileExt",
        "fileResource",
        "date",
        "uuid",
        "timeMillis",
        "fileType",
        "fileExt",
        "fileResource",
        "date",
        "uuid",
        "modulePath",
        "resPath",
        "reqStr",
        "sign",
        "tokenReq",
        "timeMillis",
        "userId",
        "$i$a$-runCatching-OssTaskManger$getOssData$2"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "J$0",
        "J$1",
        "I$0"
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

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:J

.field public l:J

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public p:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->o:Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->n:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    iget-object v0, p0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->o:Lcom/zykj/evaluation/upload/OssTaskManger;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->b(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
