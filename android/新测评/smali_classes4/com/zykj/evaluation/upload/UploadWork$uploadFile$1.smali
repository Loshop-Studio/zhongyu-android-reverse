.class final Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/upload/UploadWork;->k(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.upload.UploadWork"
    f = "UploadWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xcc
    }
    m = "uploadFile"
    n = {
        "file",
        "fileRelativePath",
        "credential",
        "type"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lcom/zykj/evaluation/upload/UploadWork;

.field public g:I


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->f:Lcom/zykj/evaluation/upload/UploadWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

    iget-object v0, p0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->f:Lcom/zykj/evaluation/upload/UploadWork;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/upload/UploadWork;->d(Lcom/zykj/evaluation/upload/UploadWork;ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
