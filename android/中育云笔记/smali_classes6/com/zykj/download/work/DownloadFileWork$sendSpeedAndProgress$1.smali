.class final Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->sendSpeedAndProgress(Lsd/i0;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.zykj.download.work.DownloadFileWork"
    f = "DownloadFileWork.kt"
    l = {
        0xbe,
        0xc0
    }
    m = "sendSpeedAndProgress"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/download/work/DownloadFileWork;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->h:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/download/work/DownloadFileWork;->sendSpeedAndProgress(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
