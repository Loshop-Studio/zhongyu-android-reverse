.class final Lcom/zykj/download/work/DownloadFileWork$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
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
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

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
            "Lcom/zykj/download/work/DownloadFileWork$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$b;->d:Lcom/zykj/download/work/DownloadFileWork;

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

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$b;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$b;->e:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$b;->d:Lcom/zykj/download/work/DownloadFileWork;

    invoke-static {p1, p0}, Lcom/zykj/download/work/DownloadFileWork;->access$downloadFileWithProgress(Lcom/zykj/download/work/DownloadFileWork;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
