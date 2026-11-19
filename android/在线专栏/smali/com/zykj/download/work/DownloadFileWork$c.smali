.class final Lcom/zykj/download/work/DownloadFileWork$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lq2/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-",
        "Lcom/zykj/http/exception/RemoteCodeException;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1"
    f = "DownloadFileWork.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:I

.field final synthetic c:Lcom/zykj/download/work/DownloadFileWork;

.field final synthetic d:Lv1/b;


# direct methods
.method constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/DownloadFileWork;",
            "Lv1/b;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/DownloadFileWork$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$c;->c:Lcom/zykj/download/work/DownloadFileWork;

    iput-object p2, p0, Lcom/zykj/download/work/DownloadFileWork$c;->d:Lv1/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lcom/zykj/download/work/DownloadFileWork$c;

    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$c;->c:Lcom/zykj/download/work/DownloadFileWork;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c;->d:Lv1/b;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/download/work/DownloadFileWork$c;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/http/exception/RemoteCodeException;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/DownloadFileWork$c;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/DownloadFileWork$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/zykj/download/work/DownloadFileWork$c;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    new-instance p1, Lcom/zykj/download/work/DownloadFileWork$c$a;

    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$c;->c:Lcom/zykj/download/work/DownloadFileWork;

    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$c;->d:Lv1/b;

    const/4 v4, 0x0

    invoke-direct {p1, v1, v3, v4}, Lcom/zykj/download/work/DownloadFileWork$c$a;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lv1/b;Lq2/d;)V

    iput v2, p0, Lcom/zykj/download/work/DownloadFileWork$c;->b:I

    invoke-static {p1, p0}, Lf3/g2;->c(Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method
