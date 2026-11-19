.class final Lcom/zykj/download/work/DownloadFileCommonWork$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lv1/b;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
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
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:Ljava/lang/Object;

.field h:Ljava/lang/Object;

.field i:Ljava/lang/Object;

.field j:Ljava/lang/Object;

.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:Ljava/lang/Object;

.field n:J

.field synthetic o:Ljava/lang/Object;

.field final synthetic p:Lcom/zykj/download/work/DownloadFileCommonWork;

.field q:I


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileCommonWork;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileCommonWork$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$b;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

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

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$b;->o:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$b;->q:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork$b;->p:Lcom/zykj/download/work/DownloadFileCommonWork;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lv1/b;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
