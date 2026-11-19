.class final Lcom/zykj/download/work/DownloadFileWork$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.DownloadFileWork"
    f = "DownloadFileWork.kt"
    l = {
        0xc7
    }
    m = "notifyProgress"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:J

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lcom/zykj/download/work/DownloadFileWork;

.field e:I


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileWork;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileWork$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$d;->d:Lcom/zykj/download/work/DownloadFileWork;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lq2/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$d;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$d;->e:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$d;->d:Lcom/zykj/download/work/DownloadFileWork;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
