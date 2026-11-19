.class final Lcom/zykj/download/work/UploadFileWork$c$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/UploadFileWork$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lo2/r;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$1"
    f = "UploadFileWork.kt"
    l = {
        0x47,
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lkotlin/jvm/internal/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/zykj/download/work/UploadFileWork;

.field final synthetic f:Lf3/m1;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/x;Lcom/zykj/download/work/UploadFileWork;Lf3/m1;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/download/work/UploadFileWork;",
            "Lf3/m1;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/download/work/UploadFileWork$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->d:Lkotlin/jvm/internal/x;

    iput-object p2, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->e:Lcom/zykj/download/work/UploadFileWork;

    iput-object p3, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->f:Lf3/m1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

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

    new-instance p1, Lcom/zykj/download/work/UploadFileWork$c$a;

    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->d:Lkotlin/jvm/internal/x;

    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->e:Lcom/zykj/download/work/UploadFileWork;

    iget-object v2, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->f:Lf3/m1;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/download/work/UploadFileWork$c$a;-><init>(Lkotlin/jvm/internal/x;Lcom/zykj/download/work/UploadFileWork;Lf3/m1;Lq2/d;)V

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$c$a;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

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
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork$c$a;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/UploadFileWork$c$a;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/UploadFileWork$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->b:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/x;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->d:Lkotlin/jvm/internal/x;

    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->e:Lcom/zykj/download/work/UploadFileWork;

    iput-object v1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->b:Ljava/lang/Object;

    iput v4, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->c:I

    invoke-virtual {p1, p0}, Lcom/zykj/download/work/UploadFileWork;->uploadFile(Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 5
    :cond_3
    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    const-wide/16 v5, 0x1f4

    .line 6
    iput-object v3, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->b:Ljava/lang/Object;

    iput v2, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->c:I

    invoke-static {v5, v6, p0}, Lf3/r0;->a(JLq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    .line 7
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/zykj/download/work/UploadFileWork$c$a;->f:Lf3/m1;

    invoke-static {p1, v3, v4, v3}, Lf3/m1$a;->a(Lf3/m1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
