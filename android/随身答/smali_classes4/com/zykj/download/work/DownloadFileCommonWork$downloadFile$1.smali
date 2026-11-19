.class final Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.download.work.DownloadFileCommonWork"
    f = "DownloadFileCommonWork.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x42,
        0x54,
        0x6f,
        0x81
    }
    m = "downloadFile$suspendImpl"
    n = {
        "this",
        "entity",
        "startPoint",
        "responseBody",
        "totalLength",
        "bytes",
        "inputStream",
        "fileInputStream",
        "readIndex",
        "currentLength",
        "isComplete",
        "totalLength"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$4",
        "J$0",
        "L$3",
        "L$4",
        "L$7",
        "L$8",
        "L$9",
        "L$10",
        "J$0"
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

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lcom/zykj/download/work/DownloadFileCommonWork;

.field public q:I


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
