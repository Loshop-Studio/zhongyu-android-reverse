.class final Lcom/zykj/download/work/UploadFileWork$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lq2/d;)Ljava/lang/Object;
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
        "Lf3/m1;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2"
    f = "UploadFileWork.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lcom/zykj/download/work/UploadFileWork;

.field final synthetic e:Lkotlin/jvm/internal/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/x;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/work/UploadFileWork;",
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/UploadFileWork$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$c;->d:Lcom/zykj/download/work/UploadFileWork;

    iput-object p2, p0, Lcom/zykj/download/work/UploadFileWork$c;->e:Lkotlin/jvm/internal/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 3
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

    new-instance v0, Lcom/zykj/download/work/UploadFileWork$c;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$c;->d:Lcom/zykj/download/work/UploadFileWork;

    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$c;->e:Lkotlin/jvm/internal/x;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/download/work/UploadFileWork$c;-><init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/x;Lq2/d;)V

    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$c;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

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
            "Lf3/m1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$c;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/UploadFileWork$c;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/UploadFileWork$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    .line 1
    iget v0, p0, Lcom/zykj/download/work/UploadFileWork$c;->b:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$c;->c:Ljava/lang/Object;

    check-cast p1, Lf3/h0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 2
    new-instance v3, Lcom/zykj/download/work/UploadFileWork$c$b;

    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork$c;->d:Lcom/zykj/download/work/UploadFileWork;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v6}, Lcom/zykj/download/work/UploadFileWork$c$b;-><init>(Lcom/zykj/download/work/UploadFileWork;Lq2/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    move-result-object v0

    .line 3
    new-instance v3, Lcom/zykj/download/work/UploadFileWork$c$a;

    iget-object v4, p0, Lcom/zykj/download/work/UploadFileWork$c;->e:Lkotlin/jvm/internal/x;

    iget-object v5, p0, Lcom/zykj/download/work/UploadFileWork$c;->d:Lcom/zykj/download/work/UploadFileWork;

    invoke-direct {v3, v4, v5, v0, v6}, Lcom/zykj/download/work/UploadFileWork$c$a;-><init>(Lkotlin/jvm/internal/x;Lcom/zykj/download/work/UploadFileWork;Lf3/m1;Lq2/d;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
