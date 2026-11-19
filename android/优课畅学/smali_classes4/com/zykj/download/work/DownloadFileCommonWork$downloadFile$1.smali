.class final Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lcom/zykj/download/data/DownloadEntity;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.download.work.DownloadFileCommonWork"
    f = "DownloadFileCommonWork.kt"
    l = {
        0x42,
        0x54,
        0x6f,
        0x81
    }
    m = "downloadFile$suspendImpl"
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
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

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

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lcom/zykj/download/data/DownloadEntity;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
