.class final Lcom/zykj/download/work/DownloadFileWorkProxy$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWorkProxy;->checkRecord(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.DownloadFileWorkProxy"
    f = "DownloadFileWorkProxy.kt"
    l = {
        0x5c,
        0x61
    }
    m = "checkRecord"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/zykj/download/work/DownloadFileWorkProxy;

.field d:I


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileWorkProxy;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileWorkProxy$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->c:Lcom/zykj/download/work/DownloadFileWorkProxy;

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

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->d:I

    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWorkProxy$c;->c:Lcom/zykj/download/work/DownloadFileWorkProxy;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkRecord(Ljava/lang/String;Ljava/io/File;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
