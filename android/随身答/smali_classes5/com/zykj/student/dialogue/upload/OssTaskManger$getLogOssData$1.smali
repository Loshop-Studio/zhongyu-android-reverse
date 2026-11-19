.class final Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/upload/OssTaskManger;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.student.dialogue.upload.OssTaskManger"
    f = "OssTaskManger.kt"
    i = {
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
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x49,
        0x65
    }
    m = "getLogOssData"
    n = {
        "date",
        "fileName",
        "date",
        "fileName",
        "modulePath",
        "resPath",
        "fo",
        "fe",
        "nonce",
        "reqStr",
        "sign",
        "tokenReq",
        "objectKey",
        "userId",
        "fr",
        "ft",
        "ts",
        "$i$a$-runCatching-OssTaskManger$getLogOssData$token$1"
    }
    s = {
        "L$0",
        "L$1",
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
        "L$10",
        "J$0",
        "I$0",
        "I$1",
        "J$1",
        "I$2"
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

.field public k:Ljava/lang/Object;

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lcom/zykj/student/dialogue/upload/OssTaskManger;

.field public s:I


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->r:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->q:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->s:I

    iget-object p1, p0, Lcom/zykj/student/dialogue/upload/OssTaskManger$getLogOssData$1;->r:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
