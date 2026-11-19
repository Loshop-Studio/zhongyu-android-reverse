.class final Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.download.work.DownloadFileWork"
    f = "DownloadFileWork.kt"
    l = {
        0x49,
        0x4d,
        0x4f,
        0x5d,
        0x5f
    }
    m = "downloadFileWithProgress"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/download/work/DownloadFileWork;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->d:Lcom/zykj/download/work/DownloadFileWork;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
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

    invoke-static {p1, p0}, Lcom/zykj/download/work/DownloadFileWork;->access$downloadFileWithProgress(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
