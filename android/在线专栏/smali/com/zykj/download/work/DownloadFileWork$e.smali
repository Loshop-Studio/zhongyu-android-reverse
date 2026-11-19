.class final Lcom/zykj/download/work/DownloadFileWork$e;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.DownloadFileWork"
    f = "DownloadFileWork.kt"
    l = {
        0xbe,
        0xc0
    }
    m = "sendSpeedAndProgress"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:Lcom/zykj/download/work/DownloadFileWork;

.field f:I


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileWork;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileWork$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$e;->e:Lcom/zykj/download/work/DownloadFileWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lq2/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$e;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$e;->f:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$e;->e:Lcom/zykj/download/work/DownloadFileWork;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/download/work/DownloadFileWork;->sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
