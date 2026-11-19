.class final Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.zykj.download.work.DownloadFileWork"
    f = "DownloadFileWork.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x2
    }
    l = {
        0x49,
        0x4d,
        0x4f,
        0x5d,
        0x5f
    }
    m = "downloadFileWithProgress"
    n = {
        "this",
        "file",
        "localPathForSuccess",
        "localPathForSuccess"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/download/work/DownloadFileWork;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->d:Lcom/zykj/download/work/DownloadFileWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->d:Lcom/zykj/download/work/DownloadFileWork;

    invoke-static {p1, p0}, Lcom/zykj/download/work/DownloadFileWork;->access$downloadFileWithProgress(Lcom/zykj/download/work/DownloadFileWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
