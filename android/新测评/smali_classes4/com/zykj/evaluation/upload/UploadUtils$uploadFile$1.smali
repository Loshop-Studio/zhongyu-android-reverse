.class final Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.upload.UploadUtils"
    f = "UploadUtils.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x1f,
        0x22,
        0x25
    }
    m = "uploadFile"
    n = {
        "localPath",
        "uploadPath",
        "credential",
        "localPath",
        "uploadPath",
        "credential",
        "localPath",
        "uploadPath",
        "credential"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/evaluation/upload/UploadUtils;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/UploadUtils;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->e:Lcom/zykj/evaluation/upload/UploadUtils;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->f:I

    iget-object p1, p0, Lcom/zykj/evaluation/upload/UploadUtils$uploadFile$1;->e:Lcom/zykj/evaluation/upload/UploadUtils;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
