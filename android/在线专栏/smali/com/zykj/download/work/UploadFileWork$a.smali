.class final Lcom/zykj/download/work/UploadFileWork$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork;->sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.UploadFileWork"
    f = "UploadFileWork.kt"
    l = {
        0x71,
        0x7a
    }
    m = "sendSpeedAndProgress"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:J

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:Lcom/zykj/download/work/UploadFileWork;

.field h:I


# direct methods
.method constructor <init>(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/UploadFileWork;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/UploadFileWork$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$a;->g:Lcom/zykj/download/work/UploadFileWork;

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

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$a;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/UploadFileWork$a;->h:I

    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$a;->g:Lcom/zykj/download/work/UploadFileWork;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/download/work/UploadFileWork;->sendSpeedAndProgress(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
